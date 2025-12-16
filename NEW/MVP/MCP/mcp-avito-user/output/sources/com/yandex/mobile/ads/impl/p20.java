package com.yandex.mobile.ads.impl;

import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class p20 {
    @j.N
    public static String a(@j.N String str, @j.N ImageView.ScaleType scaleType) {
        StringBuilder sbA = Cif.a("#S");
        sbA.append(scaleType.ordinal());
        sbA.append(str);
        return sbA.toString();
    }

    @j.N
    public static String a(@j.N String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        StringBuilder sbA = Cif.a("#S");
        sbA.append(scaleType.ordinal());
        sbA.append(str);
        return sbA.toString();
    }
}
