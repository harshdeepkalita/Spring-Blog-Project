package com.blog.blog.controller;

import com.blog.blog.dto.RegistrationDto;
import com.blog.blog.entity.User;
import com.blog.blog.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {
    private UserService userService;
    public AuthController(UserService userService) {
        this.userService = userService;
    }
    // handle user registration request
    @GetMapping("/register")
    public String showRegistrationForm(Model model)
    {
        RegistrationDto user = new RegistrationDto();
        model.addAttribute("user",user);
        return "register";
    }
    // handle user registration form submit request
    @PostMapping("/register/save")
    public String register(@Valid @ModelAttribute("user") RegistrationDto user,
                           BindingResult result,Model model)
    {
        User existingUser = userService.findByEmail(user.getEmail());
        if (existingUser!=null)
        {
            result.rejectValue("email",null,"user already exists");
        }
        if(result.hasErrors())
        {
            model.addAttribute("user",user);
            return "register";
        }
        userService.saveUser(user);
        return "redirect:/register?success";
    }

    @GetMapping("/login")
    public String loginPage()
    {
        return "login";
    }
}
