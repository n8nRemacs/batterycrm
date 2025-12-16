package com.avito.android.str_seller_orders.orders_filters.domain;

import Y61.k;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersItemStyle;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersOption;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: StrOrdersFiltersItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/domain/a;", "Lcom/avito/android/str_seller_orders/orders_filters/domain/e;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements e {
    @Inject
    public a() {
    }

    @Override // com.avito.android.str_seller_orders.orders_filters.domain.e
    @k
    public final ArrayList a(@k List list) {
        List<StrOrdersFiltersOption> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (StrOrdersFiltersOption strOrdersFiltersOption : list2) {
            arrayList.add(new com.avito.android.str_seller_orders.orders_filters.items.toggle.e(strOrdersFiltersOption.f289163b, new kV.c(strOrdersFiltersOption.f289164c, null, null, null, null, false, null, new ToggleState(null, false, false, false, strOrdersFiltersOption.f289165d ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b, 15, null), false, false, null, null, 3966, null), StrOrdersFiltersItemStyle.f289160c));
        }
        return arrayList;
    }
}
