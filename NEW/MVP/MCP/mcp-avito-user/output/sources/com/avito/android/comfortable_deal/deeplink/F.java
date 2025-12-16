package com.avito.android.comfortable_deal.deeplink;

import android.os.Bundle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: PpRecallDeeplinkDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deeplink.PpRecallDeeplinkDeeplinkHandler$doHandle$1", f = "PpRecallDeeplinkDeeplinkHandler.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class F extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f121855q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I f121856r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PpRecallDeeplink f121857s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f121858t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(I i12, PpRecallDeeplink ppRecallDeeplink, Bundle bundle, Continuation<? super F> continuation) {
        super(2, continuation);
        this.f121856r = i12;
        this.f121857s = ppRecallDeeplink;
        this.f121858t = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new F(this.f121856r, this.f121857s, this.f121858t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((F) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f121855q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f121855q = 1;
            if (I.k(this.f121856r, this.f121857s, this.f121858t, this) == coroutine_suspended) {
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
}
