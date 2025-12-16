package com.vk.id.test;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.network.InternalVKIDApiContract;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42784z0;
import org.json.JSONArray;

/* compiled from: InternalVKIDImmediateApi.kt */
@P
@InternalVKIDApi
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001JE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J=\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#JE\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/vk/id/test/InternalVKIDImmediateApi;", "Lcom/vk/id/network/InternalVKIDApiContract;", "", "code", "codeVerifier", "clientId", "deviceId", "redirectUri", VoiceInfo.STATE, "Lcom/vk/id/test/VKIDMockCall;", "Lcom/vk/id/test/InternalVKIDTokenPayloadResponse;", "getToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/test/VKIDMockCall;", "clientSecret", "Lcom/vk/id/test/InternalVKIDSilentAuthProvidersResponse;", "getSilentAuthProviders", "(Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/test/VKIDMockCall;", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/test/VKIDMockCall;", "accessToken", "Lcom/vk/id/test/InternalVKIDUserInfoPayloadResponse;", "getUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/test/VKIDMockCall;", "v1Token", "codeChallenge", "Lcom/vk/id/test/InternalVKIDCodePayloadResponse;", "exchangeToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/test/VKIDMockCall;", "Lcom/vk/id/test/InternalVKIDLogoutPayloadResponse;", "logout", "sakVersion", "Lorg/json/JSONArray;", "events", "externalDeviceId", "sendStatEventsAnonymously", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lcom/vk/id/test/VKIDMockCall;", "sendStatEvents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lcom/vk/id/test/VKIDMockCall;", "Lcom/vk/id/test/InternalVKIDOverrideApi;", "mockApi", "Lcom/vk/id/test/InternalVKIDOverrideApi;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDImmediateApi implements InternalVKIDApiContract {

    @k
    private final InternalVKIDOverrideApi mockApi;

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public VKIDMockCall<InternalVKIDCodePayloadResponse> exchangeToken(@k String v1Token, @k String clientId, @k String deviceId, @k String state, @k String codeChallenge) {
        return new VKIDMockCall<>(this.mockApi.mo120exchangeTokenyxL6bBk(v1Token, clientId, deviceId, state, codeChallenge));
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public VKIDMockCall<InternalVKIDSilentAuthProvidersResponse> getSilentAuthProviders(@k String clientId, @k String clientSecret) {
        return new VKIDMockCall<>(this.mockApi.mo121getSilentAuthProvidersgIAlus(clientId, clientSecret));
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public VKIDMockCall<InternalVKIDTokenPayloadResponse> getToken(@k String code, @k String codeVerifier, @k String clientId, @k String deviceId, @k String redirectUri, @k String state) {
        return new VKIDMockCall<>(this.mockApi.mo122getTokenhUnOzRk(code, codeVerifier, clientId, deviceId, redirectUri, state));
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public VKIDMockCall<InternalVKIDUserInfoPayloadResponse> getUser(@k String accessToken, @k String clientId, @k String deviceId) {
        return new VKIDMockCall<>(this.mockApi.mo123getUserInfo0E7RQCE(accessToken, clientId, deviceId));
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public VKIDMockCall<InternalVKIDLogoutPayloadResponse> logout(@k String accessToken, @k String clientId, @k String deviceId) {
        return new VKIDMockCall<>(this.mockApi.mo124logout0E7RQCE(accessToken, clientId, deviceId));
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public VKIDMockCall<InternalVKIDTokenPayloadResponse> refreshToken(@k String refreshToken, @k String clientId, @k String deviceId, @k String state) {
        return new VKIDMockCall<>(this.mockApi.mo125refreshTokenBWLJW6A(refreshToken, clientId, deviceId, state));
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public VKIDMockCall<InternalVKIDSilentAuthProvidersResponse> sendStatEvents(@k String accessToken, @k String clientId, @k String clientSecret, @k String sakVersion, @k JSONArray events, @k String externalDeviceId) {
        int i12 = Z.f406624c;
        return new VKIDMockCall<>(new InternalVKIDSilentAuthProvidersResponse(C42784z0.f406748b));
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @k
    public VKIDMockCall<InternalVKIDSilentAuthProvidersResponse> sendStatEventsAnonymously(@k String clientId, @k String clientSecret, @k String sakVersion, @k JSONArray events, @k String externalDeviceId) {
        int i12 = Z.f406624c;
        return new VKIDMockCall<>(new InternalVKIDSilentAuthProvidersResponse(C42784z0.f406748b));
    }
}
