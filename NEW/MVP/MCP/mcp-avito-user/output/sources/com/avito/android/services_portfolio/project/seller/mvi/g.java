package com.avito.android.services_portfolio.project.seller.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.services_portfolio.project.seller.mvi.entity.PortfolioProjectSellerInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kv0.InterfaceC43503b;

/* compiled from: PortfolioProjectSellerFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lkv0/b;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "Lkv0/d;", "Lkv0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<q<InterfaceC43503b, PortfolioProjectSellerInternalAction, kv0.d, kv0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f280267l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f280268m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f280269n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f280270o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f280271p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f280267l = eVar;
        this.f280268m = aVar;
        this.f280269n = screenPerformanceTracker;
        this.f280270o = lVar;
        this.f280271p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC43503b, PortfolioProjectSellerInternalAction, kv0.d, kv0.c> qVar) {
        q<InterfaceC43503b, PortfolioProjectSellerInternalAction, kv0.d, kv0.c> qVar2 = qVar;
        qVar2.f92008d = this.f280267l;
        qVar2.f92009e = this.f280268m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f280269n, this.f280270o);
        qVar2.f92010f = this.f280271p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
