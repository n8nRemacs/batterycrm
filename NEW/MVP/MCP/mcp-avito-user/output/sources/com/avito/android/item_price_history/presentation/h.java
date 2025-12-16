package com.avito.android.item_price_history.presentation;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemPriceHistoryView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/h;", "", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.recycler.data_aware.c f173738a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<EO.a, G0> f173739b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f173740c;

    public h(@k j jVar, @k View view, @k com.avito.android.recycler.data_aware.c cVar, @k l lVar) {
        this.f173738a = cVar;
        this.f173739b = lVar;
        View viewFindViewById = view.findViewById(R.id.list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f173740c = recyclerView;
        recyclerView.setAdapter(jVar);
        recyclerView.o(new g(this));
        recyclerView.l(new a(), -1);
    }
}
