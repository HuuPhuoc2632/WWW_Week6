package com.example.www_week6.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "post")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authorId")
    private User authorId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentId")
    private Post parent;

    @Column(length = 75)
    private String title;
    @Column(length = 100)
    private String metaTitle;
    @Lob
    private String summary;
    private boolean published;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant publishedAt;

    @Lob
    private String content;

    @OneToMany(mappedBy = "parent")
    private Set<Post> posts = new LinkedHashSet<>();
    @OneToMany(mappedBy = "post")
    private Set<PostComment> postComments = new LinkedHashSet<>();

}
