package com.huawei.updatesdk.b.c;

import android.os.Build;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private String f363827a;

    /* renamed from: b, reason: collision with root package name */
    private String f363828b;

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public String d() {
        if (!TextUtils.isEmpty(this.f363828b)) {
            return this.f363828b;
        }
        String strC = c();
        this.f363828b = strC;
        if (TextUtils.isEmpty(strC)) {
            this.f363828b = Build.MANUFACTURER;
        }
        return this.f363828b;
    }

    public String e() {
        if (!TextUtils.isEmpty(this.f363827a)) {
            return this.f363827a;
        }
        String strA = a();
        this.f363827a = strA;
        if (TextUtils.isEmpty(strA)) {
            this.f363827a = Build.MODEL;
        }
        return this.f363827a;
    }

    public abstract List<String> f();
}
