package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final /* synthetic */ class sc0 {
    public static /* synthetic */ String a(int i12) {
        if (i12 == 1) {
            return "streaming";
        }
        if (i12 == 2) {
            return "progressive";
        }
        throw null;
    }

    public static int a(String str) {
        for (int i12 : n6.b(2)) {
            if (a(i12).equals(str)) {
                return i12;
            }
        }
        return 0;
    }
}
