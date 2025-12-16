package com.avito.android.vas_performance.screens.visual.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VisualVasFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LPL0/a;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "LPL0/c;", "LPL0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<q<PL0.a, VisualVasInternalAction, PL0.c, PL0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.b<VisualVasInternalAction> f321146l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f321147m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f321148n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f321149o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f321150p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.avito.android.arch.mvi.b<VisualVasInternalAction> bVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f321146l = bVar;
        this.f321147m = cVar;
        this.f321148n = screenPerformanceTracker;
        this.f321149o = lVar;
        this.f321150p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<PL0.a, VisualVasInternalAction, PL0.c, PL0.b> qVar) {
        q<PL0.a, VisualVasInternalAction, PL0.c, PL0.b> qVar2 = qVar;
        qVar2.f92008d = this.f321146l;
        qVar2.f92009e = this.f321147m;
        qVar2.f92011g = new o(this.f321148n, this.f321149o);
        qVar2.f92010f = this.f321150p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
