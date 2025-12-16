package com.vk.id;

import Y41.p;
import com.vk.id.logout.VKIDLoggerOut;
import com.vk.id.logout.VKIDLogoutCallback;
import com.vk.id.logout.VKIDLogoutFail;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuthResultHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/vk/id/AccessToken;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/vk/id/AccessToken;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.AuthResultHandler$handleOauth$5$1", f = "AuthResultHandler.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class AuthResultHandler$handleOauth$5$1 extends SuspendLambda implements p<AccessToken, Continuation<? super G0>, Object> {
    final /* synthetic */ AccessToken $accessToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AuthResultHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthResultHandler$handleOauth$5$1(AccessToken accessToken, AuthResultHandler authResultHandler, Continuation<? super AuthResultHandler$handleOauth$5$1> continuation) {
        super(2, continuation);
        this.$accessToken = accessToken;
        this.this$0 = authResultHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        AuthResultHandler$handleOauth$5$1 authResultHandler$handleOauth$5$1 = new AuthResultHandler$handleOauth$5$1(this.$accessToken, this.this$0, continuation);
        authResultHandler$handleOauth$5$1.L$0 = obj;
        return authResultHandler$handleOauth$5$1;
    }

    @Override // Y41.p
    public final Object invoke(AccessToken accessToken, Continuation<? super G0> continuation) {
        return ((AuthResultHandler$handleOauth$5$1) create(accessToken, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            final AccessToken accessToken = (AccessToken) this.L$0;
            if (this.$accessToken != null) {
                VKIDLoggerOut vKIDLoggerOut = this.this$0.loggerOut;
                final AuthResultHandler authResultHandler = this.this$0;
                VKIDLogoutCallback vKIDLogoutCallback = new VKIDLogoutCallback() { // from class: com.vk.id.AuthResultHandler$handleOauth$5$1.1
                    @Override // com.vk.id.logout.VKIDLogoutCallback
                    public void onFail(VKIDLogoutFail fail) {
                        authResultHandler.emitAuthSuccess(accessToken);
                    }

                    @Override // com.vk.id.logout.VKIDLogoutCallback
                    public void onSuccess() {
                        authResultHandler.emitAuthSuccess(accessToken);
                    }
                };
                String token = this.$accessToken.getToken();
                this.label = 1;
                if (VKIDLoggerOut.logout$default(vKIDLoggerOut, vKIDLogoutCallback, token, false, null, this, 8, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.this$0.emitAuthSuccess(accessToken);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
