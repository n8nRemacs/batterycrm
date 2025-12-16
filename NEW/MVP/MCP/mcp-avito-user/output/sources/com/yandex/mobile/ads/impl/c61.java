package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.view.View;
import android.widget.PopupMenu;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes8.dex */
public final class c61 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private bu0 f384185a = new bu0();

    @j.N
    public final PopupMenu a(@j.N View view, @j.N w20 w20Var, @j.N List<r51> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view, 5);
        this.f384185a.getClass();
        bu0.a(popupMenu);
        Menu menu = popupMenu.getMenu();
        Context context = view.getContext();
        for (int i12 = 0; i12 < list.size(); i12++) {
            t51 t51VarC = list.get(i12).c();
            menu.add(0, i12, i12, t51VarC.b()).setIcon(new BitmapDrawable(context.getResources(), w20Var.a(t51VarC.a())));
        }
        return popupMenu;
    }
}
