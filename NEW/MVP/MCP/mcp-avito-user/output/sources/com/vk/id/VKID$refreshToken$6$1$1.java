package com.vk.id;

import Y41.l;
import com.vk.id.refresh.VKIDRefreshTokenCallback;
import com.vk.id.refresh.VKIDRefreshTokenParams;
import com.vk.id.refresh.VKIDTokenRefresher;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VKID.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.VKID$refreshToken$6$1$1", f = "VKID.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class VKID$refreshToken$6$1$1 extends SuspendLambda implements l<Continuation<? super G0>, Object> {
    final /* synthetic */ VKIDRefreshTokenCallback $callback;
    final /* synthetic */ VKIDRefreshTokenParams $params;
    int label;
    final /* synthetic */ VKID this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKID$refreshToken$6$1$1(VKID vkid, VKIDRefreshTokenCallback vKIDRefreshTokenCallback, VKIDRefreshTokenParams vKIDRefreshTokenParams, Continuation<? super VKID$refreshToken$6$1$1> continuation) {
        super(1, continuation);
        this.this$0 = vkid;
        this.$callback = vKIDRefreshTokenCallback;
        this.$params = vKIDRefreshTokenParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new VKID$refreshToken$6$1$1(this.this$0, this.$callback, this.$params, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            VKIDTokenRefresher vKIDTokenRefresher = (VKIDTokenRefresher) this.this$0.tokenRefresher.getValue();
            VKIDRefreshTokenCallback vKIDRefreshTokenCallback = this.$callback;
            VKIDRefreshTokenParams vKIDRefreshTokenParams = this.$params;
            this.label = 1;
            if (vKIDTokenRefresher.refresh(vKIDRefreshTokenCallback, vKIDRefreshTokenParams, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return ((VKID$refreshToken$6$1$1) create(continuation)).invokeSuspend(G0.f406611a);
    }
}
