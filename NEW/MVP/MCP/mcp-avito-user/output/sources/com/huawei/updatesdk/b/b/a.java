package com.huawei.updatesdk.b.b;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f363818d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static a f363819e;

    /* renamed from: a, reason: collision with root package name */
    private b f363820a;

    /* renamed from: b, reason: collision with root package name */
    private String f363821b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f363822c = false;

    private a(Context context) {
        this.f363820a = b.a("DeviceSessionUpdateSDK_V1", context);
    }

    public static a d() {
        a aVar;
        synchronized (f363818d) {
            try {
                if (f363819e == null) {
                    f363819e = new a(com.huawei.updatesdk.a.b.a.a.c().a());
                }
                aVar = f363819e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public String a() {
        return this.f363821b;
    }

    public long b() {
        return this.f363820a.a("updatesdk.lastCheckDate", 0L);
    }

    public String c(String str) {
        return TextUtils.isEmpty(str) ? "" : this.f363820a.a(str, "");
    }

    public void e(String str) {
        this.f363821b = str;
    }

    public String a(String str) {
        return this.f363820a.a("updatesdk.lastAccountZone" + str, "");
    }

    public long b(String str) {
        return this.f363820a.a("updatesdk.lastInitAccountTime" + str, 0L);
    }

    public void c() {
        if (this.f363822c) {
            return;
        }
        d("updatesdk.sign.param");
        d("updatesdk.signkey");
        d("updatesdk.signtime");
        this.f363822c = true;
    }

    public void d(String str) {
        this.f363820a.a(str);
    }

    public void a(long j12) {
        this.f363820a.b("updatesdk.lastCheckDate", j12);
    }

    public void b(String str, String str2) {
        this.f363820a.b("updatesdk.lastAccountZone" + str, str2);
    }

    public void a(String str, long j12) {
        this.f363820a.b("updatesdk.lastInitAccountTime" + str, j12);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f363820a.b(str, str2);
    }
}
