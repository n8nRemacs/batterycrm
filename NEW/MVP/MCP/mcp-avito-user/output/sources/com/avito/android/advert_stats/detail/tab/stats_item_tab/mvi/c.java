package com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi;

import Y41.l;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabInternalAction;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabState;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import eb.InterfaceC40078a;
import eb.InterfaceC40079b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StatsItemTabFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Leb/a;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabState;", "Leb/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements l<q<InterfaceC40078a, StatsItemTabInternalAction, StatsItemTabState, InterfaceC40079b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f86545l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f86546m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f86547n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f86548o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ScreenPerformanceTracker screenPerformanceTracker, h hVar, f fVar) {
        super(1);
        this.f86545l = aVar;
        this.f86546m = screenPerformanceTracker;
        this.f86547n = hVar;
        this.f86548o = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40078a, StatsItemTabInternalAction, StatsItemTabState, InterfaceC40079b> qVar) {
        q<InterfaceC40078a, StatsItemTabInternalAction, StatsItemTabState, InterfaceC40079b> qVar2 = qVar;
        qVar2.f92009e = this.f86545l;
        qVar2.f92011g = new o(this.f86546m, this.f86547n);
        qVar2.f92010f = this.f86548o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
