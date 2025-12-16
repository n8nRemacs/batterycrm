package com.fasterxml.jackson.core.util;

import java.util.regex.Pattern;

/* compiled from: VersionUtil.java */
/* loaded from: classes3.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f341327a = Pattern.compile("[-_./;:]");

    public static void a(String str) {
        String[] strArrSplit = f341327a.split("2.13.3");
        b(strArrSplit[0]);
        if (strArrSplit.length > 1) {
            b(strArrSplit[1]);
        }
        if (strArrSplit.length > 2) {
            b(strArrSplit[2]);
        }
        if (strArrSplit.length > 3) {
            String str2 = strArrSplit[3];
        }
    }

    public static int b(String str) {
        int length = str.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt > '9' || cCharAt < '0') {
                break;
            }
            i12 = (i12 * 10) + (cCharAt - '0');
        }
        return i12;
    }

    public static final void c() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}
