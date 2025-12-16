package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class ef1 {
    @Y61.k
    public static String a(long j12, @Y61.k eg1 eg1Var, @Y61.k ne1 ne1Var) {
        int adPosition = eg1Var.getAdPosition();
        String strG = ne1Var.g();
        if (strG == null) {
            strG = String.valueOf(f20.a());
        }
        StringBuilder sb2 = new StringBuilder("ad_break_#");
        sb2.append(j12);
        sb2.append("|position_");
        sb2.append(adPosition);
        return AK.c.s(sb2, "|video_ad_#", strG);
    }
}
