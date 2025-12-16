package com.vk.id.test;

import Y61.k;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;

/* compiled from: InternalVKIDOverrideApi.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J5\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u001aJ%\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/vk/id/test/InternalVKIDOverrideApi;", "", "", "refreshToken", "clientId", "deviceId", VoiceInfo.STATE, "Lkotlin/Z;", "Lcom/vk/id/test/InternalVKIDTokenPayloadResponse;", "refreshToken-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "v1Token", "codeChallenge", "Lcom/vk/id/test/InternalVKIDCodePayloadResponse;", "exchangeToken-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "exchangeToken", "code", "codeVerifier", "redirectUri", "getToken-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "getToken", "accessToken", "Lcom/vk/id/test/InternalVKIDUserInfoPayloadResponse;", "getUserInfo-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "getUserInfo", "Lcom/vk/id/test/InternalVKIDLogoutPayloadResponse;", "logout-0E7RQCE", "logout", "clientSecret", "Lcom/vk/id/test/InternalVKIDSilentAuthProvidersResponse;", "getSilentAuthProviders-gIAlu-s", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "getSilentAuthProviders", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InternalVKIDOverrideApi {
    @k
    /* renamed from: exchangeToken-yxL6bBk, reason: not valid java name */
    Object mo120exchangeTokenyxL6bBk(@k String v1Token, @k String clientId, @k String deviceId, @k String state, @k String codeChallenge);

    @k
    /* renamed from: getSilentAuthProviders-gIAlu-s, reason: not valid java name */
    Object mo121getSilentAuthProvidersgIAlus(@k String clientId, @k String clientSecret);

    @k
    /* renamed from: getToken-hUnOzRk, reason: not valid java name */
    Object mo122getTokenhUnOzRk(@k String code, @k String codeVerifier, @k String clientId, @k String deviceId, @k String redirectUri, @k String state);

    @k
    /* renamed from: getUserInfo-0E7RQCE, reason: not valid java name */
    Object mo123getUserInfo0E7RQCE(@k String accessToken, @k String clientId, @k String deviceId);

    @k
    /* renamed from: logout-0E7RQCE, reason: not valid java name */
    Object mo124logout0E7RQCE(@k String accessToken, @k String clientId, @k String deviceId);

    @k
    /* renamed from: refreshToken-BWLJW6A, reason: not valid java name */
    Object mo125refreshTokenBWLJW6A(@k String refreshToken, @k String clientId, @k String deviceId, @k String state);
}
