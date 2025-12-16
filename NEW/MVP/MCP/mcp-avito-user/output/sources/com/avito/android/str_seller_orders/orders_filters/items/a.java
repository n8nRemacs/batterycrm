package com.avito.android.str_seller_orders.orders_filters.items;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.str_seller_orders.orders_filters.items.toggle.e;
import com.avito.android.str_seller_orders.orders_filters.items.toggle.f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrOrdersFiltersCallback.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/items/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends C23424o.f<TV0.a> {
    @Inject
    public a() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF284485b() == aVar4.getF284485b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof e) || !(aVar4 instanceof e)) {
            return null;
        }
        kV.b bVar = ((e) aVar3).f289176c;
        kV.b bVar2 = ((e) aVar4).f289176c;
        if (bVar.equals(bVar2)) {
            bVar2 = null;
        }
        f fVar = new f(bVar2);
        if (bVar2 != null) {
            return fVar;
        }
        return null;
    }
}
