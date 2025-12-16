package com.vk.id.refresh;

import Y41.p;
import com.vk.id.RefreshToken;
import com.vk.id.internal.auth.VKIDTokenPayload;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: VKIDTokenRefresher.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Z;", "Lcom/vk/id/internal/auth/VKIDTokenPayload;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Z;"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.refresh.VKIDTokenRefresher$refresh$result$1", f = "VKIDTokenRefresher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class VKIDTokenRefresher$refresh$result$1 extends SuspendLambda implements p<T, Continuation<? super Z<? extends VKIDTokenPayload>>, Object> {
    final /* synthetic */ String $clientId;
    final /* synthetic */ String $deviceId;
    final /* synthetic */ RefreshToken $refreshToken;
    final /* synthetic */ String $refreshTokenState;
    int label;
    final /* synthetic */ VKIDTokenRefresher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKIDTokenRefresher$refresh$result$1(VKIDTokenRefresher vKIDTokenRefresher, RefreshToken refreshToken, String str, String str2, String str3, Continuation<? super VKIDTokenRefresher$refresh$result$1> continuation) {
        super(2, continuation);
        this.this$0 = vKIDTokenRefresher;
        this.$refreshToken = refreshToken;
        this.$clientId = str;
        this.$deviceId = str2;
        this.$refreshTokenState = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new VKIDTokenRefresher$refresh$result$1(this.this$0, this.$refreshToken, this.$clientId, this.$deviceId, this.$refreshTokenState, continuation);
    }

    @Override // Y41.p
    public /* bridge */ /* synthetic */ Object invoke(T t12, Continuation<? super Z<? extends VKIDTokenPayload>> continuation) {
        return invoke2(t12, (Continuation<? super Z<VKIDTokenPayload>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return Z.a(this.this$0.api.refreshToken(this.$refreshToken.getToken(), this.$clientId, this.$deviceId, this.$refreshTokenState).mo119executed1pmJ48());
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(T t12, Continuation<? super Z<VKIDTokenPayload>> continuation) {
        return ((VKIDTokenRefresher$refresh$result$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
