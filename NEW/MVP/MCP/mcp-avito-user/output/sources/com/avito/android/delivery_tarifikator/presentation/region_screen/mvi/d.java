package com.avito.android.delivery_tarifikator.presentation.region_screen.mvi;

import Xv.InterfaceC17050a;
import com.avito.android.delivery_tarifikator.domain.p0;
import com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TarifikatorRegionActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.TarifikatorRegionActor$process$3", f = "TarifikatorRegionActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TarifikatorRegionInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a f135805q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC17050a f135806r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, InterfaceC17050a interfaceC17050a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f135805q = aVar;
        this.f135806r = interfaceC17050a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f135805q, this.f135806r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TarifikatorRegionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        p0 p0Var = this.f135805q.f135797b;
        InterfaceC17050a.g gVar = (InterfaceC17050a.g) this.f135806r;
        p0Var.g(gVar.f19139a, gVar.f19140b);
        return G0.f406611a;
    }
}
