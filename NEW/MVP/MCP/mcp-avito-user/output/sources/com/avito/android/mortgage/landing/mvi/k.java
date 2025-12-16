package com.avito.android.mortgage.landing.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction;
import com.avito.android.mortgage.landing.mvi.entity.LandingState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import w00.InterfaceC49409a;
import w00.InterfaceC49417c;

/* compiled from: LandingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lw00/a;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingState;", "Lw00/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC49409a, LandingInternalAction, LandingState, InterfaceC49417c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f200276l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f200277m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f200278n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f200279o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f200280p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, n nVar) {
        super(1);
        this.f200276l = iVar;
        this.f200277m = gVar;
        this.f200278n = screenPerformanceTracker;
        this.f200279o = pVar;
        this.f200280p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC49409a, LandingInternalAction, LandingState, InterfaceC49417c> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC49409a, LandingInternalAction, LandingState, InterfaceC49417c> qVar2 = qVar;
        qVar2.f92008d = this.f200276l;
        qVar2.f92009e = this.f200277m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f200278n, this.f200279o);
        qVar2.f92010f = this.f200280p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
