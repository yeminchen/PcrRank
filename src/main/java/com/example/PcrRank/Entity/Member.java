package com.example.PcrRank.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "guild_member")
public class Member {

    @Id
    private String id;

    private String name;

    private String account;

    private String password;

    private Integer active;

}
