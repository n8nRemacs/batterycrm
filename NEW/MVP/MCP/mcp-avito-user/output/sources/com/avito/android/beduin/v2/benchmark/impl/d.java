package com.avito.android.beduin.v2.benchmark.impl;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.AbstractC40048c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BeduinV2BenchmarkPageViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LeT/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.beduin.v2.benchmark.impl.BeduinV2BenchmarkPageViewModel$state$2$1", f = "BeduinV2BenchmarkPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC40048c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c f104619q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f104619q = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f104619q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AbstractC40048c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        new com.avito.beduin.v2.theme.avito.storage.a();
        c cVar = this.f104619q;
        EV0.c cVar2 = (EV0.c) com.avito.beduin.v2.theme.avito.storage.a.f338355f.get(cVar.f104607N);
        String strD = cVar2 != null ? cVar2.d() : null;
        if (strD == null) {
            strD = "";
        }
        cVar.accept(new InterfaceC40047a.e(strD, cVar.f104605L));
        return G0.f406611a;
    }
}
