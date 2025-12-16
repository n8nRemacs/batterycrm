package com.huawei.updatesdk.a.b.b;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private Intent f363787a;

    private b(Intent intent) {
        this.f363787a = intent;
    }

    public int a(String str, int i12) {
        if (d()) {
            try {
                return this.f363787a.getIntExtra(str, i12);
            } catch (Exception unused) {
                com.huawei.updatesdk.a.a.a.a("SecureIntent", "getIntExtra exception!");
            }
        }
        return i12;
    }

    public long b(String str, int i12) {
        if (d()) {
            try {
                return this.f363787a.getLongExtra(str, i12);
            } catch (Exception unused) {
                com.huawei.updatesdk.a.a.a.a("SecureIntent", "getIntExtra exception!");
            }
        }
        return i12;
    }

    public Intent c() {
        return this.f363787a;
    }

    public boolean d() {
        return this.f363787a != null;
    }

    public static b a(Intent intent) {
        return new b(intent);
    }

    public Bundle b() {
        if (d()) {
            return this.f363787a.getExtras();
        }
        return null;
    }

    public String a() {
        String action;
        return (!d() || (action = this.f363787a.getAction()) == null) ? "" : action;
    }

    public String a(String str) {
        if (!d()) {
            return "";
        }
        try {
            return this.f363787a.getStringExtra(str);
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.a.a("SecureIntent", "getStringExtra exception!");
            return "";
        }
    }

    public boolean a(String str, boolean z12) {
        if (d()) {
            try {
                return this.f363787a.getBooleanExtra(str, z12);
            } catch (Exception unused) {
                com.huawei.updatesdk.a.a.a.a("SecureIntent", "getBooleanExtra exception!");
            }
        }
        return z12;
    }
}
