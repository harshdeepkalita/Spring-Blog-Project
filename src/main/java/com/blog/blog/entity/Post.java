package com.blog.blog.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String url;

    @Lob
    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String content;
    private String shortDescription;
    //when we create a Post object, Hibernate will automatically fill the createdOn field with the current timestamp.
    @CreationTimestamp
    private LocalDateTime createdOn;
    //when we update a Post object, Hibernate will automatically fill the updatedOn field with the updated timestamp.
    @UpdateTimestamp
    private LocalDateTime updatedOn;
    // when we delete the post, the comments should be deleted too = CascadeType.REMOVE
    @ManyToOne
    @JoinColumn(name = "createdBy",nullable = false)
    private User createdBy;
    @OneToMany(mappedBy = "post",cascade = CascadeType.REMOVE)
    private Set<Comment> comments = new HashSet<>( );

}
