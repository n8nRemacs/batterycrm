package com.avito.android.cpx_promo.delayedstart.mvi;

import bs.InterfaceC25698a;
import bs.InterfaceC25699b;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.cpx_promo.delayedstart.mvi.entity.CpxPromoDelayedStartInternalAction;
import com.avito.android.cpx_promo.delayedstart.mvi.entity.CpxPromoDelayedStartState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxPromoDelayedStartFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lbs/a;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartState;", "Lbs/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.l<q<InterfaceC25698a, CpxPromoDelayedStartInternalAction, CpxPromoDelayedStartState, InterfaceC25699b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f126869l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f126870m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f126871n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f126872o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f126873p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f126869l = dVar;
        this.f126870m = bVar;
        this.f126871n = screenPerformanceTracker;
        this.f126872o = kVar;
        this.f126873p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC25698a, CpxPromoDelayedStartInternalAction, CpxPromoDelayedStartState, InterfaceC25699b> qVar) {
        q<InterfaceC25698a, CpxPromoDelayedStartInternalAction, CpxPromoDelayedStartState, InterfaceC25699b> qVar2 = qVar;
        qVar2.f92008d = this.f126869l;
        qVar2.f92009e = this.f126870m;
        qVar2.f92011g = new o(this.f126871n, this.f126872o);
        qVar2.f92010f = this.f126873p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
