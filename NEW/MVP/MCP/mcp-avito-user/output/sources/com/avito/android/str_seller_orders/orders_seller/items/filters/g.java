package com.avito.android.str_seller_orders.orders_seller.items.filters;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.publish.screen.objects.view.actions.h;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FiltersView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/filters/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/orders_seller/items/filters/f;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f289455b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f289456c;

    public g(@k View view, @k @com.avito.android.str_seller_orders.orders_seller.di.d com.avito.konveyor.adapter.d dVar) {
        super(view);
        this.f289455b = dVar;
        RecyclerView recyclerView = (RecyclerView) view;
        this.f289456c = recyclerView;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(dVar);
        recyclerView.setItemAnimator(null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f289456c.setAdapter(null);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.filters.f
    public final void setFilters(@k List<? extends com.avito.conveyor_item.a> list) {
        RecyclerView recyclerView = this.f289456c;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        com.avito.konveyor.adapter.d dVar = this.f289455b;
        if (adapter == null) {
            recyclerView.setAdapter(dVar);
        }
        dVar.l(list, new h(this, 22));
    }
}
