package com.avito.android.active_orders_common.items.order;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrderItemResorceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/order/k;", "Lcom/avito/android/active_orders_common/items/order/j;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f68385a;

    @Inject
    public k(@Y61.k Resources resources) {
        this.f68385a = resources;
    }

    @Override // com.avito.android.active_orders_common.items.order.j
    @Y61.l
    public final Drawable getPlaceholder() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f68385a.getDrawable(R.drawable.ic_order_placeholder, null);
    }
}
