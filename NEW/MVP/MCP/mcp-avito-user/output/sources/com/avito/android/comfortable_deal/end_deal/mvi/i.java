package com.avito.android.comfortable_deal.end_deal.mvi;

import Hp.InterfaceC14016a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EndDealFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LHp/a;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "LHp/c;", "LHp/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.l<q<InterfaceC14016a, EndDealInternalAction, Hp.c, Hp.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f122341l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f122342m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f122343n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f122344o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f122345p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f122341l = gVar;
        this.f122342m = eVar;
        this.f122343n = screenPerformanceTracker;
        this.f122344o = nVar;
        this.f122345p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14016a, EndDealInternalAction, Hp.c, Hp.b> qVar) {
        q<InterfaceC14016a, EndDealInternalAction, Hp.c, Hp.b> qVar2 = qVar;
        qVar2.f92008d = this.f122341l;
        qVar2.f92009e = this.f122342m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f122343n, this.f122344o);
        qVar2.f92010f = this.f122345p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
