package com.huawei.updatesdk.b.a.a;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.huawei.updatesdk.a.a.d.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f363808b;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f363809a = new HashMap();

    private b() {
    }

    public static synchronized b a() {
        try {
            if (f363808b == null) {
                f363808b = new b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f363808b;
    }

    public String a(PackageInfo packageInfo) throws Throwable {
        if (packageInfo == null || packageInfo.packageName == null || TextUtils.isEmpty(packageInfo.applicationInfo.sourceDir)) {
            return null;
        }
        a aVar = this.f363809a.get(packageInfo.packageName);
        if (aVar != null && aVar.b() == packageInfo.lastUpdateTime && aVar.c() == packageInfo.versionCode) {
            return aVar.a();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(packageInfo.lastUpdateTime);
        sb2.append(packageInfo.versionCode);
        sb2.append(packageInfo.packageName);
        String str = "packagekey" + packageInfo.packageName;
        String str2 = "fileshakey" + packageInfo.packageName;
        boolean zEquals = TextUtils.equals(sb2.toString(), com.huawei.updatesdk.b.b.a.d().c(str));
        if (!zEquals) {
            com.huawei.updatesdk.b.b.a.d().a(str, sb2.toString());
        }
        String strC = com.huawei.updatesdk.b.b.a.d().c(str2);
        if (TextUtils.isEmpty(strC) || !zEquals) {
            strC = d.a(packageInfo.applicationInfo.sourceDir, "SHA-256");
            com.huawei.updatesdk.b.b.a.d().a(str2, strC);
        }
        a aVar2 = new a();
        aVar2.a(strC);
        aVar2.a(packageInfo.lastUpdateTime);
        aVar2.a(packageInfo.versionCode);
        this.f363809a.put(packageInfo.packageName, aVar2);
        return strC;
    }
}
