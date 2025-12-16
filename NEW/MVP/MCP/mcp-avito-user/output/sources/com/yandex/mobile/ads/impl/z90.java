package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes8.dex */
final class z90 {
    @j.N
    public static String a(@j.N Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb2 = new StringBuilder(language);
        String script = locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            sb2.append('-');
            sb2.append(script);
        }
        if (!TextUtils.isEmpty(country)) {
            sb2.append('_');
            sb2.append(country);
        }
        return sb2.toString();
    }
}
