package com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils;

import Y41.l;
import Y61.k;
import android.view.MenuItem;
import android.view.View;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: CartMenuIconViews.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {
    public static final void a(@k L l12, @k View view, @k InterfaceC31171n interfaceC31171n, @k l<? super Boolean, Boolean> lVar) {
        l12.getClass();
        L.f(view, interfaceC31171n);
        D6.G(view, lVar.invoke(Boolean.valueOf(l12.e(interfaceC31171n))).booleanValue());
    }

    public static void b(L l12, MenuItem menuItem, InterfaceC31171n interfaceC31171n) {
        c cVar = c.f176532l;
        L.g(menuItem, interfaceC31171n);
        Boolean boolValueOf = Boolean.valueOf(l12.e(interfaceC31171n));
        cVar.getClass();
        menuItem.setVisible(boolValueOf.booleanValue());
    }
}
