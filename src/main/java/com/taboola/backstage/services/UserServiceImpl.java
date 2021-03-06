package com.taboola.backstage.services;

import com.taboola.backstage.exceptions.BackstageAPIConnectivityException;
import com.taboola.backstage.exceptions.BackstageAPIRequestException;
import com.taboola.backstage.exceptions.BackstageAPIUnauthorizedException;
import com.taboola.backstage.model.Results;
import com.taboola.backstage.model.Account;
import com.taboola.backstage.model.auth.BackstageAuthentication;
import com.taboola.backstage.internal.BackstageAccountEndpoint;

/**
 * Created by vladi
 * Date: 10/16/2017
 * Time: 11:19 PM
 * By Taboola
 */
public class UserServiceImpl implements UserService {

    private final BackstageAccountEndpoint accountEndpoint;

    public UserServiceImpl(BackstageAccountEndpoint accountEndpoint) {
        this.accountEndpoint = accountEndpoint;
    }

    @Override
    public Results<Account> readAllowedAccounts(BackstageAuthentication auth) throws BackstageAPIUnauthorizedException, BackstageAPIConnectivityException, BackstageAPIRequestException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return accountEndpoint.getUserAllowedAccounts(accessToken);
    }
}
