package com.yandex.mobile.ads.impl;

import android.util.Base64;

/* loaded from: classes8.dex */
public final class le {
    @j.P
    public static String a(@j.N String str) {
        try {
            return Base64.encodeToString(str.getBytes(), 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
