package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vs.InterfaceC49374a;
import vs.InterfaceC49375b;

/* compiled from: RegionSheetFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lvs/a;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState;", "Lvs/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.l<q<InterfaceC49374a, RegionSheetInternalAction, RegionSheetState, InterfaceC49375b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f128446l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f128447m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f128448n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f128449o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f128450p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f128446l = gVar;
        this.f128447m = aVar;
        this.f128448n = screenPerformanceTracker;
        this.f128449o = nVar;
        this.f128450p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC49374a, RegionSheetInternalAction, RegionSheetState, InterfaceC49375b> qVar) {
        q<InterfaceC49374a, RegionSheetInternalAction, RegionSheetState, InterfaceC49375b> qVar2 = qVar;
        qVar2.f92008d = this.f128446l;
        qVar2.f92009e = this.f128447m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f128448n, this.f128449o);
        qVar2.f92010f = this.f128450p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
