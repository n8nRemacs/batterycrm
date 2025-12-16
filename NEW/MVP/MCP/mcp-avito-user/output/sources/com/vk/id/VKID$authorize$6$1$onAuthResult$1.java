package com.vk.id;

import Y41.p;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.internal.analytics.CustomAuthAnalytics;
import com.vk.id.internal.auth.AuthResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: VKID.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.VKID$authorize$6$1$onAuthResult$1", f = "VKID.kt", i = {}, l = {469}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class VKID$authorize$6$1$onAuthResult$1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
    final /* synthetic */ VKIDAuthParams $actualParams;
    final /* synthetic */ AuthResult $authResult;
    final /* synthetic */ String $performanceKey;
    final /* synthetic */ StatParams $statParams;
    int label;
    final /* synthetic */ VKID this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKID$authorize$6$1$onAuthResult$1(VKID vkid, AuthResult authResult, String str, VKIDAuthParams vKIDAuthParams, StatParams statParams, Continuation<? super VKID$authorize$6$1$onAuthResult$1> continuation) {
        super(2, continuation);
        this.this$0 = vkid;
        this.$authResult = authResult;
        this.$performanceKey = str;
        this.$actualParams = vKIDAuthParams;
        this.$statParams = statParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 invokeSuspend$lambda$0(VKIDAuthParams vKIDAuthParams, StatParams statParams) {
        if (!vKIDAuthParams.getInternalUse()) {
            CustomAuthAnalytics.INSTANCE.customAuthError$vkid_release(statParams);
        }
        return G0.f406611a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new VKID$authorize$6$1$onAuthResult$1(this.this$0, this.$authResult, this.$performanceKey, this.$actualParams, this.$statParams, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            AuthResultHandler authResultHandler = (AuthResultHandler) this.this$0.authResultHandler.getValue();
            AuthResult authResult = this.$authResult;
            b bVar = new b(0, this.$actualParams, this.$statParams);
            this.label = 1;
            if (authResultHandler.handle$vkid_release(authResult, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        this.this$0.getPerformanceTracker().endTracking(this.$performanceKey);
        if (this.this$0.requestMutex.a()) {
            this.this$0.requestMutex.d(null);
        }
        return G0.f406611a;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((VKID$authorize$6$1$onAuthResult$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
