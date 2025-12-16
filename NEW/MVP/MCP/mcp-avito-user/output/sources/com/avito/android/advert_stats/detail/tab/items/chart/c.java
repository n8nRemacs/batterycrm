package com.avito.android.advert_stats.detail.tab.items.chart;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PeriodItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/c;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/b;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends com.avito.konveyor.adapter.b implements b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f86296b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f86297c;

    public c(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        super(view);
        this.f86296b = aVar2;
        RecyclerView recyclerView = (RecyclerView) view;
        this.f86297c = recyclerView;
        recyclerView.l(new d(view.getResources()), -1);
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar2, aVar));
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.b
    public final void B(@Y61.k List<StatsBarItem> list) {
        this.f86296b.c(new UV0.c(list));
        RecyclerView.Adapter adapter = this.f86297c.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
