package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ts.C48709c;
import ts.InterfaceC48707a;
import ts.InterfaceC48708b;

/* compiled from: CpxPromoGeoFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lts/a;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "Lts/c;", "Lts/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC48707a, CpxPromoGeoInternalAction, C48709c, InterfaceC48708b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f127898l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f127899m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f127900n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f127901o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f127902p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f127898l = hVar;
        this.f127899m = eVar;
        this.f127900n = screenPerformanceTracker;
        this.f127901o = oVar;
        this.f127902p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC48707a, CpxPromoGeoInternalAction, C48709c, InterfaceC48708b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC48707a, CpxPromoGeoInternalAction, C48709c, InterfaceC48708b> qVar2 = qVar;
        qVar2.f92008d = this.f127898l;
        qVar2.f92009e = this.f127899m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f127900n, this.f127901o);
        qVar2.f92010f = this.f127902p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
