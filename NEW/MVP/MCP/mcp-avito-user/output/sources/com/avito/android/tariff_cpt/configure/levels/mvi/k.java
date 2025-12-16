package com.avito.android.tariff_cpt.configure.levels.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qC0.C47281c;
import qC0.InterfaceC47279a;
import qC0.InterfaceC47280b;

/* compiled from: TariffCptConfigureLevelsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LqC0/a;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "LqC0/c;", "LqC0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC47279a, TariffCptConfigureLevelsInternalAction, C47281c, InterfaceC47280b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f297914l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f297915m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f297916n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f297917o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f297918p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, n nVar) {
        super(1);
        this.f297914l = iVar;
        this.f297915m = gVar;
        this.f297916n = screenPerformanceTracker;
        this.f297917o = pVar;
        this.f297918p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC47279a, TariffCptConfigureLevelsInternalAction, C47281c, InterfaceC47280b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC47279a, TariffCptConfigureLevelsInternalAction, C47281c, InterfaceC47280b> qVar2 = qVar;
        qVar2.f92008d = this.f297914l;
        qVar2.f92009e = this.f297915m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f297916n, this.f297917o);
        qVar2.f92010f = this.f297918p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
