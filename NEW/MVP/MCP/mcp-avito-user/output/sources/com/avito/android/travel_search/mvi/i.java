package com.avito.android.travel_search.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vF0.InterfaceC49206a;

/* compiled from: TravelSearchFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LvF0/a;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "LvF0/g;", "LvF0/f;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class i extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC49206a, TravelSearchInternalAction, vF0.g, vF0.f>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f303182l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f303183m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f303184n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f303185o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f303186p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, l lVar) {
        super(1);
        this.f303182l = gVar;
        this.f303183m = eVar;
        this.f303184n = screenPerformanceTracker;
        this.f303185o = oVar;
        this.f303186p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC49206a, TravelSearchInternalAction, vF0.g, vF0.f> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC49206a, TravelSearchInternalAction, vF0.g, vF0.f> qVar2 = qVar;
        qVar2.f92008d = this.f303182l;
        qVar2.f92009e = this.f303183m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f303184n, this.f303185o);
        qVar2.f92010f = this.f303186p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
