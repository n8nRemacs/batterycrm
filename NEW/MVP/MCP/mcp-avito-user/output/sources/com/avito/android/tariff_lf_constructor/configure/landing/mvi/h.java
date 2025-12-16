package com.avito.android.tariff_lf_constructor.configure.landing.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.tariff_lf_constructor.configure.landing.mvi.entity.ConstructorLandingInternalAction;
import jD0.C42238c;
import jD0.InterfaceC42236a;
import jD0.InterfaceC42237b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorLandingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LjD0/a;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction;", "LjD0/c;", "LjD0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<q<InterfaceC42236a, ConstructorLandingInternalAction, C42238c, InterfaceC42237b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f299725l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f299726m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f299727n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f299728o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f299729p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f299725l = fVar;
        this.f299726m = dVar;
        this.f299727n = screenPerformanceTracker;
        this.f299728o = mVar;
        this.f299729p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC42236a, ConstructorLandingInternalAction, C42238c, InterfaceC42237b> qVar) {
        q<InterfaceC42236a, ConstructorLandingInternalAction, C42238c, InterfaceC42237b> qVar2 = qVar;
        qVar2.f92008d = this.f299725l;
        qVar2.f92009e = this.f299726m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f299727n, this.f299728o);
        qVar2.f92010f = this.f299729p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
