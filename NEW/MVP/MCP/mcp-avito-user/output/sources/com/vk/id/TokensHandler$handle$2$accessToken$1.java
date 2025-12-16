package com.vk.id;

import Y41.p;
import com.vk.id.internal.auth.VKIDTokenPayload;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;

/* compiled from: TokensHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/vk/id/AccessToken;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/vk/id/AccessToken;"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.TokensHandler$handle$2$accessToken$1", f = "TokensHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class TokensHandler$handle$2$accessToken$1 extends SuspendLambda implements p<T, Continuation<? super AccessToken>, Object> {
    final /* synthetic */ VKIDUser $it;
    final /* synthetic */ VKIDTokenPayload $payload;
    final /* synthetic */ Set<String> $scopes;
    int label;
    final /* synthetic */ TokensHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokensHandler$handle$2$accessToken$1(VKIDTokenPayload vKIDTokenPayload, TokensHandler tokensHandler, VKIDUser vKIDUser, Set<String> set, Continuation<? super TokensHandler$handle$2$accessToken$1> continuation) {
        super(2, continuation);
        this.$payload = vKIDTokenPayload;
        this.this$0 = tokensHandler;
        this.$it = vKIDUser;
        this.$scopes = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new TokensHandler$handle$2$accessToken$1(this.$payload, this.this$0, this.$it, this.$scopes, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long millis;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        String accessToken = this.$payload.getAccessToken();
        String idToken = this.$payload.getIdToken();
        String str = null;
        if (C43066x.K(idToken)) {
            idToken = null;
        }
        if (idToken != null) {
            str = idToken;
        } else {
            AccessToken accessToken$vkid_release = this.this$0.tokenStorage.getAccessToken$vkid_release();
            if (accessToken$vkid_release != null) {
                idToken = accessToken$vkid_release.getIdToken();
                str = idToken;
            }
        }
        long userId = this.$payload.getUserId();
        long expiresIn = this.$payload.getExpiresIn();
        if (expiresIn > 0) {
            millis = TimeUnit.SECONDS.toMillis(expiresIn) + System.currentTimeMillis();
        } else {
            millis = -1;
        }
        return new AccessToken(accessToken, str, userId, millis, this.$it, this.$scopes);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super AccessToken> continuation) {
        return ((TokensHandler$handle$2$accessToken$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
