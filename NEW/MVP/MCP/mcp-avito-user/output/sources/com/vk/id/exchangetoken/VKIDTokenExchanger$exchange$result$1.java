package com.vk.id.exchangetoken;

import Y41.p;
import com.vk.id.internal.auth.VKIDCodePayload;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: VKIDTokenExchanger.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Z;", "Lcom/vk/id/internal/auth/VKIDCodePayload;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Z;"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.exchangetoken.VKIDTokenExchanger$exchange$result$1", f = "VKIDTokenExchanger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class VKIDTokenExchanger$exchange$result$1 extends SuspendLambda implements p<T, Continuation<? super Z<? extends VKIDCodePayload>>, Object> {
    final /* synthetic */ String $clientId;
    final /* synthetic */ String $codeChallenge;
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $state;
    final /* synthetic */ String $v1Token;
    int label;
    final /* synthetic */ VKIDTokenExchanger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKIDTokenExchanger$exchange$result$1(VKIDTokenExchanger vKIDTokenExchanger, String str, String str2, String str3, String str4, String str5, Continuation<? super VKIDTokenExchanger$exchange$result$1> continuation) {
        super(2, continuation);
        this.this$0 = vKIDTokenExchanger;
        this.$v1Token = str;
        this.$clientId = str2;
        this.$deviceId = str3;
        this.$state = str4;
        this.$codeChallenge = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new VKIDTokenExchanger$exchange$result$1(this.this$0, this.$v1Token, this.$clientId, this.$deviceId, this.$state, this.$codeChallenge, continuation);
    }

    @Override // Y41.p
    public /* bridge */ /* synthetic */ Object invoke(T t12, Continuation<? super Z<? extends VKIDCodePayload>> continuation) {
        return invoke2(t12, (Continuation<? super Z<VKIDCodePayload>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return Z.a(this.this$0.api.exchangeToken(this.$v1Token, this.$clientId, this.$deviceId, this.$state, this.$codeChallenge).mo119executed1pmJ48());
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(T t12, Continuation<? super Z<VKIDCodePayload>> continuation) {
        return ((VKIDTokenExchanger$exchange$result$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
