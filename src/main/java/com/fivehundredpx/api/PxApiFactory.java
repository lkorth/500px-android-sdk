package com.fivehundredpx.api;

import android.text.TextUtils;

import com.fivehundredpx.api.auth.AccessToken;
import com.fivehundredpx.api.auth.OAuthConstants;
import com.fivehundredpx.api.auth.RetrofitHttpOAuthConsumer;
import com.fivehundredpx.api.auth.SigningOkClient;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

public class PxApiFactory {

    public static PxApi getApi(String consumerKey) {
        return getApi(null, consumerKey, null);
    }

    public static PxApi getApi(AccessToken accessToken, final String consumerKey,
                               String consumerSecret) {
        RestAdapter.Builder restAdapterBuilder = new RestAdapter.Builder()
                .setEndpoint(PxApi.FIVE_HUNDRED_PX_API_URL);

        if (accessToken != null && !TextUtils.isEmpty(consumerKey) &&
                !TextUtils.isEmpty(consumerSecret)) {
            RetrofitHttpOAuthConsumer oAuthConsumer = new RetrofitHttpOAuthConsumer(consumerKey,
                    consumerSecret);
            oAuthConsumer.setTokenWithSecret(accessToken.getToken(), accessToken.getTokenSecret());

            restAdapterBuilder.setClient(new SigningOkClient(oAuthConsumer));
        } else if (!TextUtils.isEmpty(consumerKey)) {
            restAdapterBuilder.setRequestInterceptor(new RequestInterceptor() {
                private String mConsumerKey = consumerKey;

                @Override
                public void intercept(RequestFacade request) {
                    request.addEncodedQueryParam(OAuthConstants.CONSUMER_KEY, mConsumerKey);
                }
            });
        } else {
            throw new IllegalArgumentException("A consumer key or AccessToken, consumer key and" +
                    "consumer secret must be provided");
        }

        return restAdapterBuilder.build().create(PxApi.class);
    }

}
