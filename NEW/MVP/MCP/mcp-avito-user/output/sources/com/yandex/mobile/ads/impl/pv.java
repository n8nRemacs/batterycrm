package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.gv;
import java.util.List;

/* loaded from: classes8.dex */
final class pv {
    public static PopupMenu a(@j.N Context context, @j.N ImageView imageView, @j.N List list) {
        PopupMenu popupMenu = new PopupMenu(context, imageView, 5);
        Menu menu = popupMenu.getMenu();
        for (int i12 = 0; i12 < list.size(); i12++) {
            menu.add(0, i12, 0, ((gv.a) list.get(i12)).a());
        }
        return popupMenu;
    }
}
