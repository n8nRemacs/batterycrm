package com.avito.android.services_portfolio.project.buyer.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.services_portfolio.project.buyer.mvi.entity.PortfolioProjectBuyerInternalAction;
import iv0.AbstractC42117c;
import iv0.InterfaceC42115a;
import iv0.InterfaceC42116b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PortfolioProjectBuyerFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Liv0/a;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "Liv0/c;", "Liv0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<q<InterfaceC42115a, PortfolioProjectBuyerInternalAction, AbstractC42117c, InterfaceC42116b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f280051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f280052m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f280053n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f280054o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f280055p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f280051l = eVar;
        this.f280052m = cVar;
        this.f280053n = screenPerformanceTracker;
        this.f280054o = lVar;
        this.f280055p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC42115a, PortfolioProjectBuyerInternalAction, AbstractC42117c, InterfaceC42116b> qVar) {
        q<InterfaceC42115a, PortfolioProjectBuyerInternalAction, AbstractC42117c, InterfaceC42116b> qVar2 = qVar;
        qVar2.f92008d = this.f280051l;
        qVar2.f92009e = this.f280052m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f280053n, this.f280054o);
        qVar2.f92010f = this.f280055p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
