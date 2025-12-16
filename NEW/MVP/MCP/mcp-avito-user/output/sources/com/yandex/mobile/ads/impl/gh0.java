package com.yandex.mobile.ads.impl;

import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class gh0 {
    @Y61.k
    public static he1 a() {
        int i12;
        int i13;
        int i14 = 0;
        String[] strArr = (String[]) C43066x.f0("6.0.1", new String[]{"."}, 0, 6).toArray(new String[0]);
        if (strArr.length > 0) {
            String str = strArr[0];
            int i15 = g7.f385602b;
            try {
                i12 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        } else {
            i12 = 0;
        }
        if (strArr.length > 1) {
            String str2 = strArr[1];
            int i16 = g7.f385602b;
            try {
                i13 = Integer.parseInt(str2);
            } catch (NumberFormatException unused2) {
            }
        } else {
            i13 = 0;
        }
        if (strArr.length > 2) {
            String str3 = strArr[2];
            int i17 = g7.f385602b;
            try {
                i14 = Integer.parseInt(str3);
            } catch (NumberFormatException unused3) {
            }
        }
        return new he1(i12, i13, i14);
    }
}
