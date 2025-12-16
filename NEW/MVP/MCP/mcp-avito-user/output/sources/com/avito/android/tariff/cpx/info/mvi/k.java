package com.avito.android.tariff.cpx.info.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import wB0.C49483c;
import wB0.InterfaceC49481a;
import wB0.InterfaceC49482b;

/* compiled from: TariffCpxInfoFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LwB0/a;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "LwB0/c;", "LwB0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC49481a, TariffCpxInfoInternalAction, C49483c, InterfaceC49482b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f296728l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f296729m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f296730n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f296731o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f296732p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, q qVar, n nVar) {
        super(1);
        this.f296728l = iVar;
        this.f296729m = gVar;
        this.f296730n = screenPerformanceTracker;
        this.f296731o = qVar;
        this.f296732p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC49481a, TariffCpxInfoInternalAction, C49483c, InterfaceC49482b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC49481a, TariffCpxInfoInternalAction, C49483c, InterfaceC49482b> qVar2 = qVar;
        qVar2.f92008d = this.f296728l;
        qVar2.f92009e = this.f296729m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f296730n, this.f296731o);
        qVar2.f92010f = this.f296732p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
