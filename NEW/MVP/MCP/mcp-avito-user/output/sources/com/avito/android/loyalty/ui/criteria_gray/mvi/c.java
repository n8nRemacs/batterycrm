package com.avito.android.loyalty.ui.criteria_gray.mvi;

import Y41.p;
import com.avito.android.loyalty.ui.criteria_gray.mvi.entity.CriteriaGrayInternalAction;
import kX.AbstractC42642c;
import kX.InterfaceC42640a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CriteriaGrayActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.loyalty.ui.criteria_gray.mvi.CriteriaGrayActor$process$1", f = "CriteriaGrayActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super CriteriaGrayInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42640a f183611q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f183612r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC42642c f183613s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC42640a interfaceC42640a, d dVar, AbstractC42642c abstractC42642c, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f183611q = interfaceC42640a;
        this.f183612r = dVar;
        this.f183613s = abstractC42642c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f183611q, this.f183612r, this.f183613s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CriteriaGrayInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        com.avito.android.loyalty.ui.criteria_gray.h hVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC42640a interfaceC42640a = this.f183611q;
        if (((InterfaceC42640a.C11618a) interfaceC42640a).f406359b) {
            d dVar = this.f183612r;
            JW.a aVar = dVar.f183615b;
            com.avito.android.loyalty.ui.criteria.items.card.a aVar2 = ((InterfaceC42640a.C11618a) interfaceC42640a).f406358a;
            dVar.getClass();
            AbstractC42642c abstractC42642c = this.f183613s;
            IW.b bVar = null;
            AbstractC42642c.b bVar2 = abstractC42642c instanceof AbstractC42642c.b ? (AbstractC42642c.b) abstractC42642c : null;
            if (bVar2 != null && (hVar = bVar2.f406370d) != null) {
                bVar = hVar.f183600b;
            }
            aVar.b(aVar2, "gray.features", bVar);
        }
        return G0.f406611a;
    }
}
