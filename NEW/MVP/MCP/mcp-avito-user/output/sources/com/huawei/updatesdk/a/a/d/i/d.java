package com.huawei.updatesdk.a.a.d.i;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static int f363781a = -1;

    public static int a() {
        if (f363781a == -1) {
            f363781a = ("zh".equals(c.a("ro.product.locale.language", "")) && "CN".equals(c.a("ro.product.locale.region", ""))) ? 0 : 1;
        }
        return f363781a;
    }
}
