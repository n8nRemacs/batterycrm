package com.yandex.metrica.impl.ob;

import java.io.File;

/* loaded from: classes7.dex */
public final class X1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private static final B0 f379838a = new B0();

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f379839b = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    public static int a() {
        return (b() || c()) ? 1 : 0;
    }

    public static boolean b() {
        try {
            return (A2.a(21) ? new File("/system/app/Superuser/Superuser.apk") : new File("/system/app/Superuser.apk")).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c() {
        for (String str : f379839b) {
            try {
            } catch (Throwable unused) {
            }
            if (A2.a(31) ? false : new File(str + "su").exists()) {
                return true;
            }
        }
        return false;
    }
}
