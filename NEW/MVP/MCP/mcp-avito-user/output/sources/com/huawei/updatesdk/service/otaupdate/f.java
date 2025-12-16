package com.huawei.updatesdk.service.otaupdate;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static f f363942d = new f();

    /* renamed from: a, reason: collision with root package name */
    private String f363943a;

    /* renamed from: b, reason: collision with root package name */
    private String f363944b;

    /* renamed from: c, reason: collision with root package name */
    private String f363945c;

    private f() {
    }

    public static f e() {
        return f363942d;
    }

    public String a() {
        return !TextUtils.isEmpty(this.f363943a) ? this.f363943a : this.f363944b;
    }

    public String b() {
        return this.f363943a;
    }

    public String c() {
        return this.f363945c;
    }

    public boolean d() {
        String str = this.f363943a;
        if (str != null) {
            return str.equals(this.f363944b);
        }
        return true;
    }

    public void a(String str) {
        this.f363944b = str;
    }

    public void b(String str) {
        this.f363943a = str;
    }

    public void c(String str) {
        this.f363945c = str;
    }
}
