package com.avito.android.position_in_search.stats.screen.position_in_search.mvi;

import c90.InterfaceC26960a;
import c90.InterfaceC26961b;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PositionInSearchFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lc90/a;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lc90/c;", "Lc90/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.l<q<InterfaceC26960a, PositionInSearchInternalAction, c90.c, InterfaceC26961b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f221523l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f221524m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f221525n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f221526o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f221527p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f221523l = eVar;
        this.f221524m = aVar;
        this.f221525n = screenPerformanceTracker;
        this.f221526o = lVar;
        this.f221527p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC26960a, PositionInSearchInternalAction, c90.c, InterfaceC26961b> qVar) {
        q<InterfaceC26960a, PositionInSearchInternalAction, c90.c, InterfaceC26961b> qVar2 = qVar;
        qVar2.f92008d = this.f221523l;
        qVar2.f92009e = this.f221524m;
        qVar2.f92011g = new o(this.f221525n, this.f221526o);
        qVar2.f92010f = this.f221527p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
