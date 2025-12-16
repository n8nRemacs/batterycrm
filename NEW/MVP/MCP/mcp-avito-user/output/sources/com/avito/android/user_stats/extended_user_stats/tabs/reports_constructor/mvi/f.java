package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabInternalAction;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorTabFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LRJ0/a;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabState;", "LTJ0/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<q<RJ0.a, ConstructorTabInternalAction, ConstructorTabState, TJ0.a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f318229l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f318230m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f318231n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f318232o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f318233p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f318229l = dVar;
        this.f318230m = aVar;
        this.f318231n = screenPerformanceTracker;
        this.f318232o = kVar;
        this.f318233p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<RJ0.a, ConstructorTabInternalAction, ConstructorTabState, TJ0.a> qVar) {
        q<RJ0.a, ConstructorTabInternalAction, ConstructorTabState, TJ0.a> qVar2 = qVar;
        qVar2.f92008d = this.f318229l;
        qVar2.f92009e = this.f318230m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f318231n, this.f318232o);
        qVar2.f92010f = this.f318233p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
