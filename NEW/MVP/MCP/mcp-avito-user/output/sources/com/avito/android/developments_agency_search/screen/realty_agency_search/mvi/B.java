package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.InterfaceC14443a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RealtyAgencySearchFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LLw/a;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "LLw/c;", "LLw/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class B extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC14443a, RealtyAgencySearchInternalAction, Lw.c, Lw.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29887w f138694l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C29866a f138695m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f138696n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b0 f138697o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L f138698p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C29887w c29887w, C29866a c29866a, ScreenPerformanceTracker screenPerformanceTracker, b0 b0Var, L l12) {
        super(1);
        this.f138694l = c29887w;
        this.f138695m = c29866a;
        this.f138696n = screenPerformanceTracker;
        this.f138697o = b0Var;
        this.f138698p = l12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC14443a, RealtyAgencySearchInternalAction, Lw.c, Lw.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC14443a, RealtyAgencySearchInternalAction, Lw.c, Lw.b> qVar2 = qVar;
        qVar2.f92008d = this.f138694l;
        qVar2.f92009e = this.f138695m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f138696n, this.f138697o);
        qVar2.f92010f = this.f138698p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
