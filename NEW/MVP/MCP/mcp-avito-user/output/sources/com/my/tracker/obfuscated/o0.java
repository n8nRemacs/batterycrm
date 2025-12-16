package com.my.tracker.obfuscated;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Integer f365710a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f365711b = new AtomicBoolean();

    public static boolean a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            e2.b("LoggingHandler: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            e2.b("LoggingHandler: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            e2.b("LoggingHandler: case 2 failure");
            return false;
        }
    }

    public static boolean b(Context context) {
        if (String.valueOf(f365710a).equals(h1.a(context.getPackageName() + "_mytracker_debug"))) {
            e2.a("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        e2.a("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    public static void c(Context context) {
        if (!f365711b.compareAndSet(false, true)) {
            e2.a("LoggingHandler: instance has already been initialized");
        } else if (e2.a()) {
            e2.a("LoggingHandler: tracing has already been enabled");
        } else {
            C37835i.a(new J(context, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Context context) {
        String str;
        if (a(context)) {
            e2.a(true);
            str = "LoggingHandler: debug mode is enabled by device name";
        } else {
            if (!f365710a.equals((Integer) h1.a(context, "com.my.tracker.debugMode", Integer.class))) {
                if (b(context)) {
                    e2.a(true);
                    e2.a("LoggingHandler: debug mode is enabled by system properties");
                    return;
                }
                return;
            }
            e2.a(true);
            str = "LoggingHandler: debug mode is enabled by manifest metadata";
        }
        e2.a(str);
    }
}
