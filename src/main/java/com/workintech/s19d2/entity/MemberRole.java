package com.workintech.s19d2.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "member_role", schema = "bank")
public class MemberRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;
}
