package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final /* synthetic */ class bi0 {
    public static /* synthetic */ String a(int i12) {
        if (i12 == 1) {
            return "advideocomplete";
        }
        if (i12 == 2) {
            return "impressionTrackingStart";
        }
        if (i12 == 3) {
            return "impressionTrackingSuccess";
        }
        if (i12 == 4) {
            return "close";
        }
        if (i12 == 5) {
            return "open";
        }
        if (i12 == 6) {
            return "rewardedAdComplete";
        }
        if (i12 == 7) {
            return "usecustomclose";
        }
        if (i12 == 8) {
            return "";
        }
        throw null;
    }

    public static int a(String str) {
        for (int i12 : n6.b(8)) {
            if (a(i12).equals(str)) {
                return i12;
            }
        }
        return 8;
    }
}
