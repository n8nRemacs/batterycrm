package com.avito.android.advert_stats.detail.tab.items.chart;

import com.avito.android.advert_stats.item.BarState;
import eb.InterfaceC40078a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: StatsPlotPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/x;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/u;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class x implements u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r f86350b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC40078a, G0> f86351c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public z f86352d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public List<StatsPeriodItem> f86353e = C42784z0.f406748b;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86354f = true;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public x(@Y61.k r rVar, @Y61.k Y41.l<? super InterfaceC40078a, G0> lVar) {
        this.f86350b = rVar;
        this.f86351c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object q12;
        z zVar = (z) eVar;
        StatsPlotItem statsPlotItem = (StatsPlotItem) aVar;
        this.f86352d = zVar;
        List<StatsPeriodItem> list = statsPlotItem.f86294c;
        this.f86353e = list;
        zVar.N(this.f86350b.getF86343d());
        zVar.ld(new v(list, this));
        Iterator<T> it = list.iterator();
        int i13 = 0;
        while (true) {
            q12 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            Iterator<T> it2 = ((StatsPeriodItem) next).f86291c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((StatsBarItem) next2).f86284e == BarState.f86679c) {
                    q12 = next2;
                    break;
                }
            }
            StatsBarItem statsBarItem = (StatsBarItem) q12;
            if (statsBarItem != null) {
                q12 = new Q(Integer.valueOf(i13), statsBarItem);
                break;
            }
            i13 = i14;
        }
        zVar.id(list, q12 != null);
        zVar.P4(statsPlotItem.f86295d);
        zVar.Gb(new w(this));
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.u
    public final void P4(int i12) {
        z zVar = this.f86352d;
        if (zVar != null) {
            zVar.P4(i12);
        }
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.InterfaceC28315a
    public final void k(@Y61.k StatsBarItem statsBarItem) {
        this.f86351c.invoke(new InterfaceC40078a.C11090a(statsBarItem));
    }
}
