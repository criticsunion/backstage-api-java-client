package com.taboola.backstage.internal;

import com.taboola.backstage.exceptions.BackstageAPIException;
import com.taboola.backstage.model.Results;
import com.taboola.backstage.model.Account;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

/**
 * Created by vladi
 * Date: 10/16/2017
 * Time: 11:24 PM
 * By Taboola
 */
public interface BackstageAccountEndpoint {

    @GET(BackstagePaths.BACKSTAGE_API_PATH_PREFIX + "/users/current/allowed-accounts")
    @Headers("Content-Type: application/json")
    Results<Account> getUserAllowedAccounts(@Header("Authorization") String accessToken) throws BackstageAPIException;

    @GET(BackstagePaths.BACKSTAGE_API_PATH_PREFIX + "/taboola-network/publishers")
    @Headers("Content-Type: application/json")
    Results<Account> getAvailablePublishersUnderTaboolaNetwork(@Header("Authorization") String accessToken) throws BackstageAPIException;
}
