package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;

/* compiled from: DrawableUtils.java */
/* loaded from: classes10.dex */
public class g {
    public static void a(@I41.h Drawable drawable, @I41.h Drawable drawable2) {
        if (drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static int b(int i12, int i13) {
        if (i13 == 255) {
            return i12;
        }
        if (i13 == 0) {
            return i12 & 16777215;
        }
        return (i12 & 16777215) | ((((i12 >>> 24) * (i13 + (i13 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(@I41.h Drawable drawable, @I41.h Drawable.Callback callback, @I41.h u uVar) {
        if (drawable != 0) {
            drawable.setCallback(callback);
            if (drawable instanceof t) {
                ((t) drawable).e(uVar);
            }
        }
    }

    public static void d(@I41.h Drawable drawable, @I41.h f fVar) {
        if (drawable == null || fVar == null) {
            return;
        }
        int i12 = fVar.f340051a;
        if (i12 != -1) {
            drawable.setAlpha(i12);
        }
        if (fVar.f340052b) {
            drawable.setColorFilter(fVar.f340053c);
        }
        int i13 = fVar.f340054d;
        if (i13 != -1) {
            drawable.setDither(i13 != 0);
        }
        int i14 = fVar.f340055e;
        if (i14 != -1) {
            drawable.setFilterBitmap(i14 != 0);
        }
    }
}
