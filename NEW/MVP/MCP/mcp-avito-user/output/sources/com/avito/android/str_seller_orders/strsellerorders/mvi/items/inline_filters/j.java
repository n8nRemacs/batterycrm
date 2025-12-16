package com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InlineFiltersItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/inline_filters/j;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/inline_filters/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Chips f290008b;

    public j(@k View view) {
        super(view);
        Chips chips = (Chips) view.findViewById(R.id.chips);
        chips.setKeepSelected(true);
        this.f290008b = chips;
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.i
    public final void Av(@k com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.a aVar) {
        Chips chips = this.f290008b;
        chips.j();
        chips.r(Collections.singletonList(aVar));
        chips.o(aVar, false);
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.i
    public final void jc(@k l<? super String, G0> lVar) {
        this.f290008b.setChipsSelectedListener(new a(lVar));
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.i
    public final void setFilters(@k List<com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.a> list) {
        this.f290008b.setData(list);
    }

    /* compiled from: InlineFiltersItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/str_seller_orders/strsellerorders/mvi/items/inline_filters/j$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f290009a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super String, G0> lVar) {
            this.f290009a = lVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.a aVar = hVar instanceof com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.a ? (com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.a) hVar : null;
            if (aVar == null) {
                return;
            }
            ((f) this.f290009a).invoke(aVar.f289997b);
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
