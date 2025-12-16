package com.huawei.updatesdk.a.a.d.i;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f363782a = "";

    public static boolean a() {
        if ("KidWatch".equals(f363782a)) {
            return true;
        }
        String strA = c.a("ro.vendor.market.type", "");
        f363782a = strA;
        com.huawei.updatesdk.a.a.a.b("WearDeviceUtil", "Children watch property value is " + strA);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        return "KidWatch".equals(strA);
    }
}
