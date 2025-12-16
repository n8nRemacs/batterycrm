package com.avito.android.str_seller_orders.orders_filters.items.toggle;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrOrdersFiltersToggleView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/items/toggle/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/orders_filters/items/toggle/j;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItemCompoundButton f289183b;

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.toggle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCompoundButton");
        }
        this.f289183b = (ListItemCompoundButton) viewFindViewById;
    }

    @Override // com.avito.android.str_seller_orders.orders_filters.items.toggle.j
    public final void MP(@Y61.k kV.b bVar) {
        this.f289183b.setState(bVar);
    }

    @Override // com.avito.android.str_seller_orders.orders_filters.items.toggle.j
    public final void S(@Y61.k Y41.a<G0> aVar) {
        D6.a(aVar, this.f289183b);
    }
}
