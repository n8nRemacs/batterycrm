package com.avito.android.advert.advert_details_style;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MenuItems.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l {
    public static final void a(MenuItem menuItem) {
        View actionView = menuItem.getActionView();
        if (actionView == null) {
            return;
        }
        View viewFindViewById = actionView.findViewById(R.id.cart_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById).setImageTintList(C35835l0.e(R.attr.black, actionView.getContext()));
    }
}
