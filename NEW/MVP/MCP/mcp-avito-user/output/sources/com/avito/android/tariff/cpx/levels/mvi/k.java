package com.avito.android.tariff.cpx.levels.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxLevelsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LHB0/a;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "LHB0/c;", "LHB0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<HB0.a, CpxLevelsInternalAction, HB0.c, HB0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f297141l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f297142m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f297143n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f297144o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f297145p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, n nVar) {
        super(1);
        this.f297141l = iVar;
        this.f297142m = gVar;
        this.f297143n = screenPerformanceTracker;
        this.f297144o = pVar;
        this.f297145p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<HB0.a, CpxLevelsInternalAction, HB0.c, HB0.b> qVar) {
        com.avito.android.arch.mvi.q<HB0.a, CpxLevelsInternalAction, HB0.c, HB0.b> qVar2 = qVar;
        qVar2.f92008d = this.f297141l;
        qVar2.f92009e = this.f297142m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f297143n, this.f297144o);
        qVar2.f92010f = this.f297145p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
