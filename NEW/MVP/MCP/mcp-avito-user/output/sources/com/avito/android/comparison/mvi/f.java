package com.avito.android.comparison.mvi;

import Rq.InterfaceC15071a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ComparisonActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LRq/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comparison.mvi.ComparisonActor$process$3", f = "ComparisonActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Rq.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m f124131q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15071a f124132r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC15071a interfaceC15071a, m mVar, Continuation continuation) {
        super(2, continuation);
        this.f124131q = mVar;
        this.f124132r = interfaceC15071a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f124132r, this.f124131q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Rq.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        m mVar = this.f124131q;
        Integer numP0 = mVar.f124147g.P0();
        InterfaceC15071a interfaceC15071a = this.f124132r;
        int i12 = ((InterfaceC15071a.d) interfaceC15071a).f14663a;
        if (numP0 != null && numP0.intValue() == i12) {
            mVar.f124148h = null;
            mVar.f124147g.onNext(Boxing.boxInt(-1));
        } else {
            mVar.f124148h = ((InterfaceC15071a.d) interfaceC15071a).f14664b.f123952d;
            mVar.f124147g.onNext(Boxing.boxInt(((InterfaceC15071a.d) interfaceC15071a).f14663a));
        }
        return G0.f406611a;
    }
}
