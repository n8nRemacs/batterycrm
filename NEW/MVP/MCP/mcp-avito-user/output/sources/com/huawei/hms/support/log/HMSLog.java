package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.hms.base.log.a;
import com.huawei.hms.base.log.d;
import okhttp3.internal.http2.Http2;

/* loaded from: classes7.dex */
public class HMSLog {

    /* renamed from: a, reason: collision with root package name */
    public static final a f363654a = new a();

    public static String a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), Http2.INITIAL_MAX_FRAME_SIZE);
                return "HMS-" + packageInfo.versionName + "(" + packageInfo.versionCode + ")";
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    public static void d(String str, String str2) {
        f363654a.a(3, str, str2);
    }

    public static void e(String str, String str2) {
        f363654a.a(6, str, str2);
    }

    public static void i(String str, String str2) {
        f363654a.a(4, str, str2);
    }

    public static void init(Context context, int i12, String str) {
        a aVar = f363654a;
        aVar.a(context, i12, str);
        aVar.a(str, "============================================================================\n====== " + a(context) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return f363654a.a(6);
    }

    public static boolean isInfoEnable() {
        return f363654a.a(4);
    }

    public static boolean isWarnEnable() {
        return f363654a.a(5);
    }

    public static void setExtLogger(I01.a aVar, boolean z12) {
        if (aVar == null) {
            throw new IllegalArgumentException("extLogger is not able to be null");
        }
        d dVar = new d(aVar);
        if (z12) {
            f363654a.a(dVar);
        } else {
            f363654a.a().a(dVar);
        }
    }

    public static void w(String str, String str2) {
        f363654a.a(5, str, str2);
    }

    public static void e(String str, String str2, Throwable th2) {
        f363654a.b(6, str, str2, th2);
    }

    public static void e(String str, long j12, String str2) {
        f363654a.a(6, str, "[" + j12 + "] " + str2);
    }

    public static void e(String str, long j12, String str2, Throwable th2) {
        f363654a.b(6, str, "[" + j12 + "] " + str2, th2);
    }
}
