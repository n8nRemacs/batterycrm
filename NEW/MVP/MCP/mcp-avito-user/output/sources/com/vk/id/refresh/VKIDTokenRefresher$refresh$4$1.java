package com.vk.id.refresh;

import Y41.p;
import com.vk.id.AccessToken;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VKIDTokenRefresher.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/vk/id/AccessToken;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/vk/id/AccessToken;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.refresh.VKIDTokenRefresher$refresh$4$1", f = "VKIDTokenRefresher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class VKIDTokenRefresher$refresh$4$1 extends SuspendLambda implements p<AccessToken, Continuation<? super G0>, Object> {
    final /* synthetic */ VKIDRefreshTokenCallback $callback;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VKIDTokenRefresher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKIDTokenRefresher$refresh$4$1(VKIDTokenRefresher vKIDTokenRefresher, VKIDRefreshTokenCallback vKIDRefreshTokenCallback, Continuation<? super VKIDTokenRefresher$refresh$4$1> continuation) {
        super(2, continuation);
        this.this$0 = vKIDTokenRefresher;
        this.$callback = vKIDRefreshTokenCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        VKIDTokenRefresher$refresh$4$1 vKIDTokenRefresher$refresh$4$1 = new VKIDTokenRefresher$refresh$4$1(this.this$0, this.$callback, continuation);
        vKIDTokenRefresher$refresh$4$1.L$0 = obj;
        return vKIDTokenRefresher$refresh$4$1;
    }

    @Override // Y41.p
    public final Object invoke(AccessToken accessToken, Continuation<? super G0> continuation) {
        return ((VKIDTokenRefresher$refresh$4$1) create(accessToken, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        AccessToken accessToken = (AccessToken) this.L$0;
        this.this$0.prefsStore.clear();
        this.$callback.onSuccess(accessToken);
        return G0.f406611a;
    }
}
