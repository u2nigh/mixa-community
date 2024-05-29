package com.example.mixacommunity.dto;

/**
 * Created by Hai on 2024-05-28 at 19:40:48
 */
import lombok.Data;

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;


}
