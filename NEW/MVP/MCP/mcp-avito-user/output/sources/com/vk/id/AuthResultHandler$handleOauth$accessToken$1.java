package com.vk.id;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: AuthResultHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/vk/id/AccessToken;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/vk/id/AccessToken;"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.AuthResultHandler$handleOauth$accessToken$1", f = "AuthResultHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class AuthResultHandler$handleOauth$accessToken$1 extends SuspendLambda implements p<T, Continuation<? super AccessToken>, Object> {
    int label;
    final /* synthetic */ AuthResultHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthResultHandler$handleOauth$accessToken$1(AuthResultHandler authResultHandler, Continuation<? super AuthResultHandler$handleOauth$accessToken$1> continuation) {
        super(2, continuation);
        this.this$0 = authResultHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new AuthResultHandler$handleOauth$accessToken$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return this.this$0.tokenStorage.getAccessToken$vkid_release();
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super AccessToken> continuation) {
        return ((AuthResultHandler$handleOauth$accessToken$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
