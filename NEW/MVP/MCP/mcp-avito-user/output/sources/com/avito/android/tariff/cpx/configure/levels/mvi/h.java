package com.avito.android.tariff.cpx.configure.levels.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.tariff.cpx.configure.levels.mvi.entity.TariffCpxConfigureLevelsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCpxConfigureLevelsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LsB0/c;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "LsB0/e;", "LsB0/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<q<sB0.c, TariffCpxConfigureLevelsInternalAction, sB0.e, sB0.d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f296220l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f296221m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f296222n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f296223o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f296224p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f296220l = fVar;
        this.f296221m = dVar;
        this.f296222n = screenPerformanceTracker;
        this.f296223o = mVar;
        this.f296224p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<sB0.c, TariffCpxConfigureLevelsInternalAction, sB0.e, sB0.d> qVar) {
        q<sB0.c, TariffCpxConfigureLevelsInternalAction, sB0.e, sB0.d> qVar2 = qVar;
        qVar2.f92008d = this.f296220l;
        qVar2.f92009e = this.f296221m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f296222n, this.f296223o);
        qVar2.f92010f = this.f296224p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
