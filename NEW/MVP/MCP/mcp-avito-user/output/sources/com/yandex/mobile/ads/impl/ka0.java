package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes8.dex */
public final class ka0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f387092a = new Object();

    @Pure
    public static void a(@j.c0 String str, String str2) {
        synchronized (f387092a) {
        }
    }

    @Pure
    public static void b(@j.c0 String str, String str2, @j.P Throwable th2) {
        d(str, a(str2, th2));
    }

    @Pure
    public static void c(@j.c0 String str, String str2) {
        synchronized (f387092a) {
        }
    }

    @Pure
    public static void d(@j.c0 String str, String str2) {
        synchronized (f387092a) {
        }
    }

    @Pure
    public static void b(@j.c0 String str, String str2) {
        synchronized (f387092a) {
        }
    }

    @Pure
    public static void a(String str, @j.P Exception exc) {
        c("BundleUtil", a(str, (Throwable) exc));
    }

    @Pure
    public static void a(@j.c0 String str, String str2, @j.P Throwable th2) {
        b(str, a(str2, th2));
    }

    @Pure
    private static String a(String str, @j.P Throwable th2) {
        String strReplace;
        synchronized (f387092a) {
            try {
                if (th2 != null) {
                    Throwable cause = th2;
                    while (true) {
                        if (cause != null) {
                            if (cause instanceof UnknownHostException) {
                                strReplace = "UnknownHostException (no network)";
                            } else {
                                cause = cause.getCause();
                            }
                        } else {
                            strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                            break;
                        }
                    }
                } else {
                    strReplace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbZ = androidx.appcompat.app.r.z(str, "\n  ");
        sbZ.append(strReplace.replace("\n", "\n  "));
        sbZ.append('\n');
        return sbZ.toString();
    }
}
