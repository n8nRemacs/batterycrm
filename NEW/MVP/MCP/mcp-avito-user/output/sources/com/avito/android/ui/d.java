package com.avito.android.ui;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.advert.notes.x;
import kotlin.Metadata;

/* compiled from: MenuClickExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {
    public static final void a(@Y61.k MenuItem menuItem, @Y61.l MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        menuItem.setOnMenuItemClickListener(new x(onMenuItemClickListener, 3));
    }

    public static final void b(@Y61.k Toolbar toolbar, @Y61.l Toolbar.h hVar) {
        toolbar.setOnMenuItemClickListener(new com.avito.android.str_seller_orders.orders_seller.d(hVar, 4));
    }
}
