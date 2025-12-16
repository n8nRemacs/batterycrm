package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.StatFs;
import java.io.File;

/* loaded from: classes8.dex */
final class xt {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final fq f391814a = new fq();

    @j.N
    public final w31 a(@j.N Context context) {
        long availableBlocks;
        this.f391814a.getClass();
        File fileA = fq.a(context, "mobileads-video-cache");
        v11 v11VarA = q21.b().a(context);
        long jO2 = (v11VarA == null || v11VarA.o() == 0) ? 52428800L : v11VarA.o();
        long jMin = Math.min(41943040L, jO2);
        try {
            StatFs statFs = new StatFs(fq.a(context, "").getAbsolutePath());
            availableBlocks = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (IllegalArgumentException unused) {
            availableBlocks = jMin;
        }
        return new w31(fileA, new c90(Math.max(Math.min((2 * availableBlocks) / 100, jO2), Math.min(jMin, (availableBlocks * 50) / 100))), new kt(context));
    }
}
