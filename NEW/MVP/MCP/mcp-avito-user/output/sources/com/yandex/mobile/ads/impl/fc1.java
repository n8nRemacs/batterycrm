package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URI;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class fc1 {
    static {
        Pattern.compile("maps.yandex");
    }

    public static boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (int i12 : n6.b(31)) {
                if (str.startsWith(ec1.a(i12))) {
                    return false;
                }
            }
        }
        return URLUtil.isNetworkUrl(str);
    }

    public static boolean b(String str) {
        if (!TextUtils.isEmpty(str)) {
            int[] iArr = {10, 11, 13, 14, 15, 16};
            for (int i12 = 0; i12 < 6; i12++) {
                if (str.startsWith(ec1.a(iArr[i12]))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(@j.P String str) {
        try {
            new URI(str);
            return !TextUtils.isEmpty(str);
        } catch (Exception unused) {
            return false;
        }
    }
}
