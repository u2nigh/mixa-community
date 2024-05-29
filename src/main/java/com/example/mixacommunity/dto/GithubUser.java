package com.example.mixacommunity.dto;

import lombok.Data;

/**
 * Created by Hai on 2024-05-28 at 21:26:09
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}