package com.avito.android.mortgage.landing;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import w00.InterfaceC49409a;

/* compiled from: LandingView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw00/a$a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lw00/a$a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.landing.LandingViewImpl$4", f = "LandingView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC49409a.C12803a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f199639q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49409a, G0> f199640r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Y41.l<? super InterfaceC49409a, G0> lVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f199640r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f199640r, continuation);
        kVar.f199639q = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC49409a.C12803a c12803a, Continuation<? super G0> continuation) {
        return ((k) create(c12803a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f199640r.invoke((InterfaceC49409a.C12803a) this.f199639q);
        return G0.f406611a;
    }
}
