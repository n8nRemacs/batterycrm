package com.avito.android.tariff_cpt.configure.landing.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oC0.C44625c;
import oC0.InterfaceC44623a;
import oC0.InterfaceC44624b;

/* compiled from: TariffCptConfigureLandingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LoC0/a;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "LoC0/c;", "LoC0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.l<q<InterfaceC44623a, TariffCptConfigureLandingInternalAction, C44625c, InterfaceC44624b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f297783l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f297784m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f297785n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f297786o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f297787p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f297783l = eVar;
        this.f297784m = cVar;
        this.f297785n = screenPerformanceTracker;
        this.f297786o = lVar;
        this.f297787p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC44623a, TariffCptConfigureLandingInternalAction, C44625c, InterfaceC44624b> qVar) {
        q<InterfaceC44623a, TariffCptConfigureLandingInternalAction, C44625c, InterfaceC44624b> qVar2 = qVar;
        qVar2.f92008d = this.f297783l;
        qVar2.f92009e = this.f297784m;
        qVar2.f92011g = new o(this.f297785n, this.f297786o);
        qVar2.f92010f = this.f297787p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
