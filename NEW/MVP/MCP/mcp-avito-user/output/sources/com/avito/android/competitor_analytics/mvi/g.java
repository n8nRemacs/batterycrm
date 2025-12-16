package com.avito.android.competitor_analytics.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction;
import er.InterfaceC40148a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitorAnalyticsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lcom/avito/android/competitor_analytics/mvi/entity/b;", "Ler/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.l<q<com.avito.android.competitor_analytics.mvi.entity.a, CompetitorAnalyticsInternalAction, com.avito.android.competitor_analytics.mvi.entity.b, InterfaceC40148a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f124550l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f124551m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f124552n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f124553o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f124554p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f124550l = eVar;
        this.f124551m = cVar;
        this.f124552n = screenPerformanceTracker;
        this.f124553o = lVar;
        this.f124554p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<com.avito.android.competitor_analytics.mvi.entity.a, CompetitorAnalyticsInternalAction, com.avito.android.competitor_analytics.mvi.entity.b, InterfaceC40148a> qVar) {
        q<com.avito.android.competitor_analytics.mvi.entity.a, CompetitorAnalyticsInternalAction, com.avito.android.competitor_analytics.mvi.entity.b, InterfaceC40148a> qVar2 = qVar;
        qVar2.f92008d = this.f124550l;
        qVar2.f92009e = this.f124551m;
        qVar2.f92011g = new o(this.f124552n, this.f124553o);
        qVar2.f92010f = this.f124554p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
