package com.avito.android.beduin.ui.util;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.lib.util.q;
import com.avito.android.messenger.channels.mvi.view.MenuItemOnMenuItemClickListenerC31882k;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V0;
import j.InterfaceC42158n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import pi.e;

/* compiled from: Toolbars.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {
    @l
    public static final Drawable a(@k Context context, @InterfaceC42158n int i12, @k String str) {
        Drawable drawableH;
        Integer numA = q.a(str);
        if (numA == null || (drawableH = C35835l0.h(numA.intValue(), context)) == null) {
            return null;
        }
        V0.a(drawableH, androidx.core.content.d.getColor(context, i12));
        return drawableH;
    }

    public static final void b(@k Toolbar toolbar, @k pi.e eVar, @InterfaceC42158n int i12, @k Y41.l<? super List<? extends BeduinAction>, G0> lVar) {
        e.a leftButton = eVar.getLeftButton();
        if (leftButton != null) {
            toolbar.setNavigationIcon(a(toolbar.getContext(), i12, leftButton.getIcon().getName()));
            toolbar.setNavigationOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(leftButton, lVar));
        }
        toolbar.getMenu().clear();
        List<e.a> listC = eVar.c();
        if (listC != null) {
            for (e.a aVar : listC) {
                MenuItem menuItemAdd = toolbar.getMenu().add(aVar.getDescription());
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setIcon(a(toolbar.getContext(), i12, aVar.getIcon().getName()));
                com.avito.android.ui.d.a(menuItemAdd, new MenuItemOnMenuItemClickListenerC31882k(aVar, lVar));
            }
        }
    }
}
