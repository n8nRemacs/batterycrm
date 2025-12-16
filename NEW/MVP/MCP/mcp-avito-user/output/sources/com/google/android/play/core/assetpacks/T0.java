package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class T0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358235d = new com.google.android.play.core.assetpacks.internal.F("ExtractorTaskFinder");

    /* renamed from: a, reason: collision with root package name */
    public final Q0 f358236a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f358237b;

    /* renamed from: c, reason: collision with root package name */
    public final C37117e0 f358238c;

    public T0(Q0 q02, Q q12, C37117e0 c37117e0) {
        this.f358236a = q02;
        this.f358237b = q12;
        this.f358238c = c37117e0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x036b, code lost:
    
        r6.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", java.lang.Integer.valueOf(r7.f358199f), java.lang.Integer.valueOf(r3), r4, r10);
        r43 = r11.a(r3, 0, r4, r10);
        r0 = r1.f358184a;
        r3 = r2.f358177a;
        r10 = r29;
        r11 = new com.google.android.play.core.assetpacks.C37176s1(r0, r3, (int) com.google.android.play.core.assetpacks.Q.b(r10.c(r3), true), com.google.android.play.core.assetpacks.Q.b(new java.io.File(r10.c(r4), java.lang.String.valueOf((int) com.google.android.play.core.assetpacks.Q.b(r10.c(r4), true))), true), r1.f358185b, r2.f358178b, r7.f358199f, r7.f358194a, r7.f358196c, r43);
     */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.play.core.assetpacks.S0 a() {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.T0.a():com.google.android.play.core.assetpacks.S0");
    }

    public final boolean b(N0 n02, O0 o02) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        M0 m02 = n02.f358186c;
        String str = o02.f358194a;
        com.google.android.play.core.assetpacks.internal.F f12 = B1.f358090h;
        Q q12 = this.f358237b;
        q12.getClass();
        File file = new File(new File(new File(new File(q12.d(n02.f358185b, m02.f358178b, m02.f358177a), "_slices"), "_metadata"), str), "checkpoint.dat");
        if (!file.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f12.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } finally {
            }
        } catch (IOException e12) {
            f12.b("Could not read checkpoint while checking if extraction finished. %s", e12);
            return false;
        }
    }
}
