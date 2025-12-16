package com.avito.android.tariff.cpx.configure.landing.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.tariff.cpx.configure.landing.mvi.entity.CpxConfigureLandingInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qB0.C47274e;
import qB0.InterfaceC47272c;
import qB0.InterfaceC47273d;

/* compiled from: CpxConfigureLandingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LqB0/c;", "Lcom/avito/android/tariff/cpx/configure/landing/mvi/entity/CpxConfigureLandingInternalAction;", "LqB0/e;", "LqB0/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.l<q<InterfaceC47272c, CpxConfigureLandingInternalAction, C47274e, InterfaceC47273d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f296033l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f296034m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f296035n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f296036o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f296037p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f296033l = eVar;
        this.f296034m = cVar;
        this.f296035n = screenPerformanceTracker;
        this.f296036o = lVar;
        this.f296037p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC47272c, CpxConfigureLandingInternalAction, C47274e, InterfaceC47273d> qVar) {
        q<InterfaceC47272c, CpxConfigureLandingInternalAction, C47274e, InterfaceC47273d> qVar2 = qVar;
        qVar2.f92008d = this.f296033l;
        qVar2.f92009e = this.f296034m;
        qVar2.f92011g = new o(this.f296035n, this.f296036o);
        qVar2.f92010f = this.f296037p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
