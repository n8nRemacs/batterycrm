package com.vk.id.test;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: InternalVKIDTestBuilder.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J5\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ%\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"com/vk/id/test/InternalVKIDTestBuilder$mockApi$1", "Lcom/vk/id/test/InternalVKIDOverrideApi;", "", "refreshToken", "clientId", "deviceId", VoiceInfo.STATE, "Lkotlin/Z;", "Lcom/vk/id/test/InternalVKIDTokenPayloadResponse;", "refreshToken-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "v1Token", "codeChallenge", "Lcom/vk/id/test/InternalVKIDCodePayloadResponse;", "exchangeToken-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "exchangeToken", "code", "codeVerifier", "redirectUri", "getToken-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "getToken", "accessToken", "Lcom/vk/id/test/InternalVKIDUserInfoPayloadResponse;", "getUserInfo-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "getUserInfo", "Lcom/vk/id/test/InternalVKIDLogoutPayloadResponse;", "logout-0E7RQCE", "logout", "clientSecret", "Lcom/vk/id/test/InternalVKIDSilentAuthProvidersResponse;", "getSilentAuthProviders-gIAlu-s", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "getSilentAuthProviders", "Ljava/util/concurrent/atomic/AtomicInteger;", "userInfoResponseIndex", "Ljava/util/concurrent/atomic/AtomicInteger;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDTestBuilder$mockApi$1 implements InternalVKIDOverrideApi {
    final /* synthetic */ InternalVKIDTestBuilder this$0;
    private final AtomicInteger userInfoResponseIndex;

    @Override // com.vk.id.test.InternalVKIDOverrideApi
    /* renamed from: exchangeToken-yxL6bBk */
    public Object mo120exchangeTokenyxL6bBk(String v1Token, String clientId, String deviceId, String state, String codeChallenge) {
        return this.this$0.exchangeTokenResponse;
    }

    @Override // com.vk.id.test.InternalVKIDOverrideApi
    /* renamed from: getSilentAuthProviders-gIAlu-s */
    public Object mo121getSilentAuthProvidersgIAlus(String clientId, String clientSecret) {
        return this.this$0.getSilentAuthProvidersResponse;
    }

    @Override // com.vk.id.test.InternalVKIDOverrideApi
    /* renamed from: getToken-hUnOzRk */
    public Object mo122getTokenhUnOzRk(String code, String codeVerifier, String clientId, String deviceId, String redirectUri, String state) {
        return this.this$0.getTokenResponse;
    }

    @Override // com.vk.id.test.InternalVKIDOverrideApi
    /* renamed from: getUserInfo-0E7RQCE */
    public Object mo123getUserInfo0E7RQCE(String accessToken, String clientId, String deviceId) {
        return ((Z) this.this$0.getUserInfoResponses.get(this.userInfoResponseIndex.getAndIncrement())).f406625b;
    }

    @Override // com.vk.id.test.InternalVKIDOverrideApi
    /* renamed from: logout-0E7RQCE */
    public Object mo124logout0E7RQCE(String accessToken, String clientId, String deviceId) {
        return this.this$0.logoutResponse;
    }

    @Override // com.vk.id.test.InternalVKIDOverrideApi
    /* renamed from: refreshToken-BWLJW6A */
    public Object mo125refreshTokenBWLJW6A(String refreshToken, String clientId, String deviceId, String state) {
        return this.this$0.refreshTokenResponse;
    }
}
