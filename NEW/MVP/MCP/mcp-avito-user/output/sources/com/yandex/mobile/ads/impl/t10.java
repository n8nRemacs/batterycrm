package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class t10 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f390057a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f390058b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f390059c = 0;

    public static long a(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f390058b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static long a(@j.P String str, @j.P String str2) {
        long j12;
        if (TextUtils.isEmpty(str)) {
            j12 = -1;
        } else {
            try {
                j12 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                ka0.b("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j12;
        }
        Matcher matcher = f390057a.matcher(str2);
        if (!matcher.matches()) {
            return j12;
        }
        try {
            String strGroup = matcher.group(2);
            strGroup.getClass();
            long j13 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j14 = (j13 - Long.parseLong(strGroup2)) + 1;
            if (j12 < 0) {
                return j14;
            }
            if (j12 == j14) {
                return j12;
            }
            ka0.d("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j12, j14);
        } catch (NumberFormatException unused2) {
            ka0.b("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j12;
        }
    }
}
