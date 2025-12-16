package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.widget.PopupMenu;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes8.dex */
public final class bu0 {
    public static void a(@j.N PopupMenu popupMenu) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        if (Build.VERSION.SDK_INT >= 29) {
            popupMenu.setForceShowIcon(true);
            return;
        }
        try {
            Field declaredField = popupMenu.getClass().getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            obj = declaredField.get(popupMenu);
            try {
                declaredField.setAccessible(false);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            obj = null;
        }
        if (obj != null) {
            try {
                obj.getClass().getMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
            } catch (Exception unused3) {
            }
        }
    }
}
