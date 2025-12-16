package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.huawei.hms.common.PackageConstants;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    final Context f365580a;

    /* renamed from: b, reason: collision with root package name */
    final c0 f365581b;

    /* renamed from: c, reason: collision with root package name */
    final C37830d f365582c;

    private d1(C37848w c37848w, Context context) {
        this.f365581b = c0.a(c37848w, context);
        this.f365582c = C37830d.a(c37848w, z0.a(context), context);
        this.f365580a = context.getApplicationContext();
    }

    public static d1 a(C37848w c37848w, Context context) {
        return new d1(c37848w, context);
    }

    public void b(int i12, Intent intent) {
        String installingPackageName;
        PackageManager packageManager = this.f365580a.getPackageManager();
        try {
            String packageName = this.f365580a.getPackageName();
            installingPackageName = Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInstallingPackageName() : packageManager.getInstallerPackageName(packageName);
        } catch (Throwable th2) {
            e2.a("PurchaseHandler: can't detect installer package –" + th2.getMessage());
            installingPackageName = "";
        }
        e2.a("PurchaseHandler: installer package is " + installingPackageName);
        installingPackageName.getClass();
        if (installingPackageName.equals(PackageConstants.SERVICES_PACKAGE_APPMARKET)) {
            e2.a("PurchaseHandler: appGalleryMarket detected");
        } else if (installingPackageName.equals("com.android.vending")) {
            e2.a("PurchaseHandler: googleStore detected");
            this.f365581b.a(i12, intent);
            return;
        } else {
            e2.a("PurchaseHandler: store not detected");
            this.f365581b.a(i12, intent);
        }
        a(i12, intent);
    }

    public void a() {
        this.f365581b.a();
        C37830d c37830d = this.f365582c;
        if (c37830d == null) {
            e2.a("PurchaseHandler: can't init appGalleryPurchaseHandler, appGallery purchases dependency not implemented");
        } else {
            c37830d.a();
        }
    }

    public void a(int i12, Intent intent) {
        C37830d c37830d = this.f365582c;
        if (c37830d == null) {
            e2.a("PurchaseHandler: can't do appGalleryPurchaseHandler.onActivityResult(), appGallery purchases dependency not implemented");
        } else {
            c37830d.a(i12, intent);
        }
    }

    public void a(int i12, List<Object> list) {
        this.f365581b.a(i12, list);
    }

    public void a(Object obj, String str, String str2, String str3, Map<String, String> map) {
        C37830d c37830d = this.f365582c;
        if (c37830d == null) {
            e2.a("PurchaseHandler: can't trackAppGalleryPurchase, appGallery purchases dependency not implemented");
        } else {
            c37830d.b(obj, str, str2, str3, map);
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        this.f365581b.a(jSONObject, jSONObject2, str, map);
    }
}
