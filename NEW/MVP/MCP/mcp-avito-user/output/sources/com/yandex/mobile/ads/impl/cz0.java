package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.StatFs;
import android.util.Log;
import java.io.File;

/* loaded from: classes8.dex */
public final class cz0 {
    public static bz0 a(@j.N Context context, int i12) {
        long availableBlocks;
        boolean z12 = pk1.f388875a;
        pk1.f388875a = Log.isLoggable("Yandex Mobile Ads", 2);
        pk1.f388875a = false;
        lf lfVar = new lf(new p10(context, new g11()).a());
        File fileA = fq.a(context, "mobileads-volley-cache");
        v11 v11VarA = q21.b().a(context);
        long jN2 = (v11VarA == null || v11VarA.o() == 0) ? 52428800L : v11VarA.n();
        long jMin = Math.min(10485760L, jN2);
        try {
            StatFs statFs = new StatFs(fq.a(context, "").getAbsolutePath());
            availableBlocks = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (IllegalArgumentException unused) {
            availableBlocks = jMin;
        }
        return new bz0(new eq(fileA, (int) Math.max(Math.min((2 * availableBlocks) / 100, jN2), Math.min(jMin, (availableBlocks * 50) / 100))), lfVar, i12);
    }
}
