package com.avito.android.advert_stats.detail.tab;

import Y61.l;
import com.avito.android.advert_stats.detail.tab.items.chart.StatsPeriodItem;
import com.avito.android.advert_stats.detail.tab.items.chart.StatsPlotItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailStatsTemplateUnitPayloadCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/h;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements com.avito.android.recycler.data_aware.a {
    @Inject
    public h() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF83668b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF83668b()) : null) || !(aVar instanceof StatsPlotItem) || !(aVar2 instanceof StatsPlotItem)) {
            return null;
        }
        List<StatsPeriodItem> list = ((StatsPlotItem) aVar2).f86294c;
        j jVar = new j(list);
        if (L.f(((StatsPlotItem) aVar).f86294c, list)) {
            return null;
        }
        return jVar;
    }
}
