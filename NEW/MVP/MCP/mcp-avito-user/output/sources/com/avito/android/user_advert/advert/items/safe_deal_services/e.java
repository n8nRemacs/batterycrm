package com.avito.android.user_advert.advert.items.safe_deal_services;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.user_advert.advert.items.safe_deal_services.a;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: SwitcherListItems.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-advert_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {
    public static final void a(@k ListItemSwitcher listItemSwitcher, @l a aVar) {
        if (!(aVar instanceof a.C9501a)) {
            if (aVar instanceof a.b) {
                listItemSwitcher.setImageResource(((a.b) aVar).f310027a);
                return;
            } else {
                listItemSwitcher.setImageResource(0);
                return;
            }
        }
        a.C9501a c9501a = (a.C9501a) aVar;
        Drawable drawableH = C35835l0.h(c9501a.f310025a, listItemSwitcher.getContext());
        if (drawableH != null) {
            drawableH.setTint(C35835l0.d(c9501a.f310026b, listItemSwitcher.getContext()));
        }
        listItemSwitcher.setImageDrawable(drawableH);
    }
}
