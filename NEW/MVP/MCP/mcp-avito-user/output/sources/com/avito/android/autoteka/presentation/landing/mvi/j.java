package com.avito.android.autoteka.presentation.landing.mvi;

import Lf.InterfaceC14387a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.presentation.landing.mvi.entity.AutotekaLandingInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaLandingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LLf/a;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction;", "LLf/c;", "LLf/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC14387a, AutotekaLandingInternalAction, Lf.c, Lf.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f97370l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f97371m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f97372n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f97373o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f97374p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f97370l = hVar;
        this.f97371m = aVar;
        this.f97372n = screenPerformanceTracker;
        this.f97373o = oVar;
        this.f97374p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC14387a, AutotekaLandingInternalAction, Lf.c, Lf.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC14387a, AutotekaLandingInternalAction, Lf.c, Lf.b> qVar2 = qVar;
        qVar2.f92008d = this.f97370l;
        qVar2.f92009e = this.f97371m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f97372n, this.f97373o);
        qVar2.f92010f = this.f97374p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
