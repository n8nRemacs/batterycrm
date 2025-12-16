package com.vk.id.network;

import Y61.k;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;
import okhttp3.Call;
import org.json.JSONArray;

/* compiled from: InternalVKIDApiContract.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J(\u0010\r\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J0\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&J \u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J0\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H&J8\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H&¨\u0006\u001a"}, d2 = {"Lcom/vk/id/network/InternalVKIDApiContract;", "", "getToken", "Lokhttp3/Call;", "code", "", "codeVerifier", "clientId", "deviceId", "redirectUri", VoiceInfo.STATE, "getSilentAuthProviders", "clientSecret", "refreshToken", "getUser", "accessToken", "exchangeToken", "v1Token", "codeChallenge", "logout", "sendStatEventsAnonymously", "sakVersion", "events", "Lorg/json/JSONArray;", "externalDeviceId", "sendStatEvents", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InternalVKIDApiContract {
    @k
    Call exchangeToken(@k String v1Token, @k String clientId, @k String deviceId, @k String state, @k String codeChallenge);

    @k
    Call getSilentAuthProviders(@k String clientId, @k String clientSecret);

    @k
    Call getToken(@k String code, @k String codeVerifier, @k String clientId, @k String deviceId, @k String redirectUri, @k String state);

    @k
    Call getUser(@k String accessToken, @k String clientId, @k String deviceId);

    @k
    Call logout(@k String accessToken, @k String clientId, @k String deviceId);

    @k
    Call refreshToken(@k String refreshToken, @k String clientId, @k String deviceId, @k String state);

    @k
    Call sendStatEvents(@k String accessToken, @k String clientId, @k String clientSecret, @k String sakVersion, @k JSONArray events, @k String externalDeviceId);

    @k
    Call sendStatEventsAnonymously(@k String clientId, @k String clientSecret, @k String sakVersion, @k JSONArray events, @k String externalDeviceId);
}
