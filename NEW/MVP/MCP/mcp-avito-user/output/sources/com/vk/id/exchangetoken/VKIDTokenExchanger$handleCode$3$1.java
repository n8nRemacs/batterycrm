package com.vk.id.exchangetoken;

import Y41.p;
import com.vk.id.AccessToken;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: VKIDTokenExchanger.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class VKIDTokenExchanger$handleCode$3$1 extends C42801a implements p<AccessToken, Continuation<? super G0>, Object>, SuspendFunction {
    public VKIDTokenExchanger$handleCode$3$1(Object obj) {
        super(2, obj, VKIDExchangeTokenCallback.class, "onAuth", "onAuth(Lcom/vk/id/AccessToken;)V", 4);
    }

    @Override // Y41.p
    public final Object invoke(AccessToken accessToken, Continuation<? super G0> continuation) {
        return VKIDTokenExchanger.handleCode$lambda$4$onAuth((VKIDExchangeTokenCallback) this.receiver, accessToken, continuation);
    }
}
