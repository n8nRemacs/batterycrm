package com.avito.android.advert_stats.item;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ib.C41374a;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WeekItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/item/S;", "Lcom/avito/android/advert_stats/item/Q;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class S extends com.avito.konveyor.adapter.b implements Q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f86713b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f86714c;

    public S(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        super(view);
        this.f86713b = aVar2;
        RecyclerView recyclerView = (RecyclerView) view;
        this.f86714c = recyclerView;
        recyclerView.l(new C41374a(view.getResources()), -1);
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar2, aVar));
    }

    @Override // com.avito.android.advert_stats.item.Q
    public final void B(@Y61.k List<C28322a> list) {
        this.f86713b.c(new UV0.c(list));
        RecyclerView.Adapter adapter = this.f86714c.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
