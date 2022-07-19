package com.sha.springbootmicroservicegateway.service;

import com.sha.springbootmicroservicegateway.model.User;

public interface IAuthenticationService {
    String signInAndReturnJWT(User signInRequest);
}
