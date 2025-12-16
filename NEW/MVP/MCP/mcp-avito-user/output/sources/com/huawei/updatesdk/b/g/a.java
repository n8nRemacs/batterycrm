package com.huawei.updatesdk.b.g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f363852a;

    public static String a() throws PackageManager.NameNotFoundException {
        String str = f363852a;
        if (str != null) {
            return str;
        }
        Context contextA = com.huawei.updatesdk.a.b.a.a.c().a();
        try {
            StringBuilder sb2 = new StringBuilder("UpdateSDK##4.0.1.300##");
            String str2 = Build.BRAND;
            if (TextUtils.isEmpty(str2)) {
                str2 = PluralsKeys.OTHER;
            }
            sb2.append(str2);
            sb2.append("##");
            sb2.append(com.huawei.updatesdk.b.c.b.a().e());
            sb2.append("##");
            sb2.append(contextA.getPackageName());
            PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
            if (packageInfo != null) {
                sb2.append("##");
                sb2.append(packageInfo.versionName);
            }
            String string = sb2.toString();
            f363852a = string;
            return string;
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("ApplicationSession", "getUserAgent() " + e12.toString());
            return null;
        }
    }
}
