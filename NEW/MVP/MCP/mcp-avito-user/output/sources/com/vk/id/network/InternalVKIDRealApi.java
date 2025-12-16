package com.vk.id.network;

import Y61.k;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.network.util.CreateRequestKt;
import java.util.Collections;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import org.json.JSONArray;

/* compiled from: InternalVKIDRealApi.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J(\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016J0\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0016J \u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016J0\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0016J8\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/vk/id/network/InternalVKIDRealApi;", "Lcom/vk/id/network/InternalVKIDApiContract;", "client", "Lokhttp3/OkHttpClient;", "<init>", "(Lokhttp3/OkHttpClient;)V", "getToken", "Lokhttp3/Call;", "code", "", "codeVerifier", "clientId", "deviceId", "redirectUri", VoiceInfo.STATE, "getSilentAuthProviders", "clientSecret", "refreshToken", "getUser", "accessToken", "exchangeToken", "v1Token", "codeChallenge", "logout", "sendStatEventsAnonymously", "sakVersion", "events", "Lorg/json/JSONArray;", "externalDeviceId", "sendStatEvents", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDRealApi implements InternalVKIDApiContract {

    @k
    private final OkHttpClient client;

    public InternalVKIDRealApi(@k OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public Call exchangeToken(@k String v1Token, @k String clientId, @k String deviceId, @k String state, @k String codeChallenge) {
        return CreateRequestKt.createRequest$default(this.client, "https://id.vk.ru", "oauth2/auth", new FormBody.Builder(null, 1, null).add("response_type", "code").add("grant_type", "access_token").add("access_token", v1Token).add("client_id", clientId).add("device_id", deviceId).add(VoiceInfo.STATE, state).add("code_challenge", codeChallenge).add("code_challenge_method", "s256").build(), null, 8, null);
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public Call getSilentAuthProviders(@k String clientId, @k String clientSecret) {
        return CreateRequestKt.createRequest$default(this.client, "https://api.vk.ru", "method/auth.getSilentAuthProviders", new FormBody.Builder(null, 1, null).add("v", "5.220").add("client_id", clientId).add("client_secret", clientSecret).build(), null, 8, null);
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public Call getToken(@k String code, @k String codeVerifier, @k String clientId, @k String deviceId, @k String redirectUri, @k String state) {
        return CreateRequestKt.createRequest$default(this.client, "https://id.vk.ru", "oauth2/auth", new FormBody.Builder(null, 1, null).add("grant_type", "authorization_code").add("code", code).add("code_verifier", codeVerifier).add("client_id", clientId).add("device_id", deviceId).add("redirect_uri", redirectUri).add(VoiceInfo.STATE, state).build(), null, 8, null);
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public Call getUser(@k String accessToken, @k String clientId, @k String deviceId) {
        return CreateRequestKt.createRequest(this.client, "https://id.vk.ru", "oauth2/user_info", new FormBody.Builder(null, 1, null).add("access_token", accessToken).add("device_id", deviceId).build(), Collections.singletonMap("client_id", clientId));
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public Call logout(@k String accessToken, @k String clientId, @k String deviceId) {
        return CreateRequestKt.createRequest$default(this.client, "https://id.vk.ru", "oauth2/logout", new FormBody.Builder(null, 1, null).add("access_token", accessToken).add("client_id", clientId).add("device_id", deviceId).build(), null, 8, null);
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public Call refreshToken(@k String refreshToken, @k String clientId, @k String deviceId, @k String state) {
        return CreateRequestKt.createRequest$default(this.client, "https://id.vk.ru", "oauth2/auth", new FormBody.Builder(null, 1, null).add("grant_type", "refresh_token").add("refresh_token", refreshToken).add("client_id", clientId).add("device_id", deviceId).add(VoiceInfo.STATE, state).build(), null, 8, null);
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public Call sendStatEvents(@k String accessToken, @k String clientId, @k String clientSecret, @k String sakVersion, @k JSONArray events, @k String externalDeviceId) {
        return CreateRequestKt.createRequest(this.client, "https://api.vk.ru", "method/statEvents.addVKID", new FormBody.Builder(null, 1, null).add("access_token", accessToken).add("v", "5.220").add("client_id", clientId).add("client_secret", clientSecret).add("sak_version", sakVersion).add("events", events.toString()).build(), Collections.singletonMap("external_device_id", externalDeviceId));
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public Call sendStatEventsAnonymously(@k String clientId, @k String clientSecret, @k String sakVersion, @k JSONArray events, @k String externalDeviceId) {
        return CreateRequestKt.createRequest(this.client, "https://api.vk.ru", "method/statEvents.addVKIDAnonymously", new FormBody.Builder(null, 1, null).add("v", "5.220").add("client_id", clientId).add("client_secret", clientSecret).add("sak_version", sakVersion).add("events", events.toString()).build(), Collections.singletonMap("external_device_id", externalDeviceId));
    }
}
