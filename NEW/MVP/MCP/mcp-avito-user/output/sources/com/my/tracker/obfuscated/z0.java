package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;
import com.adjust.sdk.Constants;

/* loaded from: classes7.dex */
public final class z0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile z0 f365881b;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f365882a;

    private z0(SharedPreferences sharedPreferences) {
        this.f365882a = sharedPreferences;
    }

    public static z0 a(Context context) {
        z0 z0Var = f365881b;
        if (z0Var == null) {
            synchronized (z0.class) {
                try {
                    z0Var = f365881b;
                    if (z0Var == null) {
                        z0Var = new z0(context.getSharedPreferences("mytracker_prefs", 0));
                        f365881b = z0Var;
                    }
                } finally {
                }
            }
        }
        return z0Var;
    }

    public long b() {
        return b("appGalleryTrackedTime");
    }

    public String c() {
        return c("appId");
    }

    public String d() {
        return c("appSetId");
    }

    public String e() {
        return c("appVersionName");
    }

    public String f() {
        return c("appsHash");
    }

    public String g() {
        return c("attribution");
    }

    public String h() {
        return c("firebaseAppInstanceId");
    }

    public long i() {
        return b("installTimestamp");
    }

    public String j() {
        return c("instanceId");
    }

    public long k() {
        return b("lastUpdateTimestamp");
    }

    public String l() {
        return c(Constants.REFERRER);
    }

    public long m() {
        long jB2 = b("lastStopTimeStampSec");
        a("lastStopTimeStampSec", 0L);
        return jB2;
    }

    public boolean n() {
        return a("apiReferrerSent");
    }

    public boolean o() {
        return a("huaweiApiReferrerSent");
    }

    public boolean p() {
        return a("preinstallRead");
    }

    public boolean q() {
        return a("referrerSent");
    }

    public void r() {
        a("apiReferrerSent", true);
    }

    public void s() {
        a("huaweiApiReferrerSent", true);
    }

    public void t() {
        a("preinstallRead", true);
    }

    public void u() {
        a("referrerSent", true);
    }

    public String a() {
        return c("appVersion");
    }

    public long b(String str) {
        try {
            return this.f365882a.getLong(str, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public String c(String str) {
        try {
            return this.f365882a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public void d(long j12) {
        a("lastStopTimeStampSec", j12);
    }

    public void e(String str) {
        a("appId", str);
    }

    public void f(String str) {
        a("appSetId", str);
    }

    public void g(String str) {
        a("appVersionName", str);
    }

    public void h(String str) {
        a("appsHash", str);
    }

    public void i(String str) {
        a("attribution", str);
    }

    public void j(String str) {
        a("firebaseAppInstanceId", str);
    }

    public void k(String str) {
        a("instanceId", str);
    }

    public void l(String str) {
        a(Constants.REFERRER, str);
    }

    public void a(int i12) {
        a("appSetIdScope", i12);
    }

    public void b(long j12) {
        a("installTimestamp", j12);
    }

    public void c(long j12) {
        a("lastUpdateTimestamp", j12);
    }

    public void d(String str) {
        a("appVersion", str);
    }

    public void a(long j12) {
        a("appGalleryTrackedTime", j12);
    }

    public void a(String str, long j12) {
        try {
            this.f365882a.edit().putLong(str, j12).commit();
        } catch (Throwable th2) {
            e2.a("PrefsCache error: ", th2);
        }
    }

    public void a(String str, String str2) {
        try {
            this.f365882a.edit().putString(str, str2).commit();
        } catch (Throwable th2) {
            e2.a("PrefsCache error: ", th2);
        }
    }

    public void a(String str, boolean z12) {
        try {
            this.f365882a.edit().putBoolean(str, z12).commit();
        } catch (Throwable th2) {
            e2.a("PrefsCache error: ", th2);
        }
    }

    public boolean a(String str) {
        try {
            return this.f365882a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
