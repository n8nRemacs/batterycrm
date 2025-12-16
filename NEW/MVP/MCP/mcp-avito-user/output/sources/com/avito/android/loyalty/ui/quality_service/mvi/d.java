package com.avito.android.loyalty.ui.quality_service.mvi;

import com.avito.android.loyalty.ui.quality_service.mvi.entity.QualityServiceInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pX.AbstractC47027c;
import pX.InterfaceC47025a;

/* compiled from: QualityServiceActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.loyalty.ui.quality_service.mvi.QualityServiceActor$process$2", f = "QualityServiceActor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super QualityServiceInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f183988q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f183989r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47025a f183990s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f183991t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC47027c f183992u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC47025a interfaceC47025a, e eVar, AbstractC47027c abstractC47027c, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f183990s = interfaceC47025a;
        this.f183991t = eVar;
        this.f183992u = abstractC47027c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f183990s, this.f183991t, this.f183992u, continuation);
        dVar.f183989r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super QualityServiceInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        p pVar;
        p pVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f183988q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f183989r;
            InterfaceC47025a.c cVar = (InterfaceC47025a.c) this.f183990s;
            com.avito.conveyor_item.a aVar = cVar.f428575a;
            boolean z12 = aVar instanceof com.avito.android.loyalty.ui.quality_service.items.effect.a;
            AbstractC47027c abstractC47027c = this.f183992u;
            e eVar = this.f183991t;
            if (z12) {
                MW.a aVar2 = eVar.f183995c;
                com.avito.android.loyalty.ui.quality_service.items.effect.a aVar3 = (com.avito.android.loyalty.ui.quality_service.items.effect.a) aVar;
                AbstractC47027c.C12278c c12278c = abstractC47027c instanceof AbstractC47027c.C12278c ? (AbstractC47027c.C12278c) abstractC47027c : null;
                IW.b bVar = (c12278c == null || (pVar2 = c12278c.f428585b) == null) ? null : pVar2.f184026d;
                String strA = aVar2.f8185b.a();
                aVar2.f8184a.c(new NW.a(strA == null ? "" : strA, bVar != null ? bVar.f8188b : null, bVar != null ? bVar.f8187a : null, aVar2.f8186c, !aVar3.f183814g, aVar3.f183809b, bVar != null ? bVar.f8189c : null, bVar != null ? bVar.f8190d : null));
                com.avito.conveyor_item.a aVar4 = cVar.f428575a;
                if (((com.avito.android.loyalty.ui.quality_service.items.effect.a) aVar4).f183815h != null) {
                    QualityServiceInternalAction.NavigateToEffectDetails navigateToEffectDetails = new QualityServiceInternalAction.NavigateToEffectDetails((com.avito.android.loyalty.ui.quality_service.items.effect.a) aVar4);
                    this.f183988q = 1;
                    if (interfaceC43172j.emit(navigateToEffectDetails, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if ((aVar instanceof com.avito.android.loyalty.ui.quality_service.items.faq.a) && ((com.avito.android.loyalty.ui.quality_service.items.faq.a) aVar).f183850e) {
                MW.a aVar5 = eVar.f183995c;
                com.avito.android.loyalty.ui.quality_service.items.faq.a aVar6 = (com.avito.android.loyalty.ui.quality_service.items.faq.a) aVar;
                AbstractC47027c.C12278c c12278c2 = abstractC47027c instanceof AbstractC47027c.C12278c ? (AbstractC47027c.C12278c) abstractC47027c : null;
                IW.b bVar2 = (c12278c2 == null || (pVar = c12278c2.f428585b) == null) ? null : pVar.f184026d;
                String strA2 = aVar5.f8185b.a();
                aVar5.f8184a.c(new NW.b(strA2 == null ? "" : strA2, bVar2 != null ? bVar2.f8188b : null, aVar6.f183847b, bVar2 != null ? bVar2.f8187a : null, aVar5.f8186c, bVar2 != null ? bVar2.f8189c : null, bVar2 != null ? bVar2.f8190d : null));
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
