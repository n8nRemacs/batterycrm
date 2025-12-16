package com.avito.android.loyalty.ui.criteria.mvi;

import Y41.p;
import com.avito.android.loyalty.ui.criteria.CriteriaTabsInfo;
import com.avito.android.loyalty.ui.criteria.items.card.a;
import com.avito.android.loyalty.ui.criteria.mvi.entity.CriteriaInternalAction;
import iX.AbstractC41357c;
import iX.InterfaceC41355a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CriteriaActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.loyalty.ui.criteria.mvi.CriteriaActor$process$1", f = "CriteriaActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super CriteriaInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41355a f183532q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f183533r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC41357c f183534s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC41355a interfaceC41355a, d dVar, AbstractC41357c abstractC41357c, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f183532q = interfaceC41355a;
        this.f183533r = dVar;
        this.f183534s = abstractC41357c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f183532q, this.f183533r, this.f183534s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CriteriaInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        CriteriaTabsInfo criteriaTabsInfo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC41355a interfaceC41355a = this.f183532q;
        if (((InterfaceC41355a.C11379a) interfaceC41355a).f398532b) {
            d dVar = this.f183533r;
            JW.a aVar = dVar.f183536b;
            com.avito.android.loyalty.ui.criteria.items.card.a aVar2 = ((InterfaceC41355a.C11379a) interfaceC41355a).f398531a;
            a.b bVar = ((InterfaceC41355a.C11379a) interfaceC41355a).f398531a.f183476i;
            dVar.getClass();
            IW.b bVar2 = null;
            String str = bVar instanceof a.b.C5386b ? "features.all" : bVar instanceof a.b.C5385a ? "features.advices" : null;
            dVar.getClass();
            AbstractC41357c abstractC41357c = this.f183534s;
            AbstractC41357c.e eVar = abstractC41357c instanceof AbstractC41357c.e ? (AbstractC41357c.e) abstractC41357c : null;
            if (eVar != null && (criteriaTabsInfo = eVar.f398546d) != null) {
                bVar2 = criteriaTabsInfo.f183429f;
            }
            aVar.b(aVar2, str, bVar2);
        }
        return G0.f406611a;
    }
}
