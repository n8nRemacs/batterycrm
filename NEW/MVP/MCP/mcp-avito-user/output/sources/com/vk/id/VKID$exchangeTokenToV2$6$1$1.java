package com.vk.id;

import Y41.l;
import com.vk.id.exchangetoken.VKIDExchangeTokenCallback;
import com.vk.id.exchangetoken.VKIDExchangeTokenParams;
import com.vk.id.exchangetoken.VKIDTokenExchanger;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VKID.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.VKID$exchangeTokenToV2$6$1$1", f = "VKID.kt", i = {}, l = {564}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class VKID$exchangeTokenToV2$6$1$1 extends SuspendLambda implements l<Continuation<? super G0>, Object> {
    final /* synthetic */ VKIDExchangeTokenCallback $callback;
    final /* synthetic */ VKIDExchangeTokenParams $params;
    final /* synthetic */ String $v1Token;
    int label;
    final /* synthetic */ VKID this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKID$exchangeTokenToV2$6$1$1(VKID vkid, String str, VKIDExchangeTokenParams vKIDExchangeTokenParams, VKIDExchangeTokenCallback vKIDExchangeTokenCallback, Continuation<? super VKID$exchangeTokenToV2$6$1$1> continuation) {
        super(1, continuation);
        this.this$0 = vkid;
        this.$v1Token = str;
        this.$params = vKIDExchangeTokenParams;
        this.$callback = vKIDExchangeTokenCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new VKID$exchangeTokenToV2$6$1$1(this.this$0, this.$v1Token, this.$params, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            VKIDTokenExchanger vKIDTokenExchanger = (VKIDTokenExchanger) this.this$0.tokenExchanger.getValue();
            String str = this.$v1Token;
            VKIDExchangeTokenParams vKIDExchangeTokenParams = this.$params;
            VKIDExchangeTokenCallback vKIDExchangeTokenCallback = this.$callback;
            this.label = 1;
            if (vKIDTokenExchanger.exchange(str, vKIDExchangeTokenParams, vKIDExchangeTokenCallback, this) == coroutine_suspended) {
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
        return ((VKID$exchangeTokenToV2$6$1$1) create(continuation)).invokeSuspend(G0.f406611a);
    }
}
