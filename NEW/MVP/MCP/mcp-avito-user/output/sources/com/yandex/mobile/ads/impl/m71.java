package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class m71 {
    @j.N
    public static String a(@j.N String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase(Locale.US);
    }
}
