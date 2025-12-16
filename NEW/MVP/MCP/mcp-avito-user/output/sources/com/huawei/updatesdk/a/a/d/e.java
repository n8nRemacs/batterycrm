package com.huawei.updatesdk.a.a.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.app.r;
import com.huawei.android.content.pm.ApplicationInfoEx;
import com.huawei.ohos.localability.BundleAdapter;
import com.huawei.ohos.localability.base.BundleInfo;
import com.huawei.ohos.localability.base.DeviceInfo;
import java.lang.reflect.Field;
import java.util.Optional;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f363760a = false;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f363761b = false;

    public static PackageInfo a(PackageInfo packageInfo) {
        BundleInfo bundleInfoA;
        if (d() && (bundleInfoA = a(packageInfo.packageName)) != null) {
            packageInfo.versionName = bundleInfoA.getVersionName();
            packageInfo.versionCode = bundleInfoA.getVersionCode();
            packageInfo.applicationInfo.targetSdkVersion = b(packageInfo.packageName);
            if (bundleInfoA.isMultiFrameworkBundle()) {
                packageInfo.baseRevisionCode = packageInfo.versionCode;
            }
        }
        return packageInfo;
    }

    public static int b(String str) {
        try {
            if (d()) {
                Pair sdkVersionInfo = BundleAdapter.getSdkVersionInfo(str);
                if (sdkVersionInfo != null) {
                    return ((Integer) sdkVersionInfo.second).intValue();
                }
                com.huawei.updatesdk.a.a.a.a("HarmonyUtils", "pair is null getHarmonySdkVersionInfo fail");
            }
        } catch (Throwable unused) {
            com.huawei.updatesdk.a.a.a.a("HarmonyUtils", "getHarmonySdkVersionInfo fail");
        }
        return 0;
    }

    private static boolean c() {
        try {
            new BundleAdapter();
            return true;
        } catch (Throwable unused) {
            com.huawei.updatesdk.a.a.a.a("HarmonyUtils", "not Integrate HarmonySdk ");
            return false;
        }
    }

    private static boolean d() {
        if (!f363761b) {
            f363760a = a(com.huawei.updatesdk.a.b.a.a.c().a(), com.huawei.updatesdk.a.b.a.a.c().a().getPackageName()) && c();
            f363761b = true;
        }
        return f363760a;
    }

    private static BundleInfo a(String str) {
        try {
            if (!d()) {
                return null;
            }
            Optional bundleInfo = BundleAdapter.getBundleInfo(str, 0);
            if (bundleInfo.isPresent()) {
                return (BundleInfo) bundleInfo.get();
            }
            return null;
        } catch (Throwable th2) {
            StringBuilder sbA = r.A("get BundleInfo exception, pkg:", str, ", e:");
            sbA.append(th2.toString());
            com.huawei.updatesdk.a.a.a.a("HarmonyUtils", sbA.toString());
            return null;
        }
    }

    public static String b() {
        DeviceInfo deviceInfoA;
        return (d() && (deviceInfoA = a()) != null) ? deviceInfoA.getDeviceType() : "";
    }

    public static boolean c(String str) {
        if (d() && !TextUtils.isEmpty(str)) {
            try {
                return BundleAdapter.isHarmonyApp(str);
            } catch (Throwable unused) {
                com.huawei.updatesdk.a.a.a.a("HarmonyUtils", "get isHarmonyApp fail");
            }
        }
        return false;
    }

    private static DeviceInfo a() {
        try {
            return BundleAdapter.getDeviceInfo();
        } catch (Throwable unused) {
            com.huawei.updatesdk.a.a.a.a("HarmonyDeviceInfo", "get DeviceInfo fail");
            return null;
        }
    }

    private static boolean a(Context context, String str) {
        Class<?> cls;
        Field declaredField;
        ApplicationInfo applicationInfo;
        try {
            cls = Class.forName("android.content.pm.AbsApplicationInfo");
            declaredField = cls.getDeclaredField("PARSE_IS_ZIDANE_APK");
            PackageInfo packageInfoA = com.huawei.updatesdk.b.h.b.a(str, context);
            applicationInfo = packageInfoA != null ? packageInfoA.applicationInfo : null;
        } catch (Throwable th2) {
            StringBuilder sbA = r.A("isHarmonyByHwFlag exception for pkg: ", str, ", throwable : ");
            sbA.append(th2.toString());
            com.huawei.updatesdk.a.a.a.a("HarmonyUtils", sbA.toString());
        }
        if (applicationInfo != null) {
            int hwFlags = new ApplicationInfoEx(applicationInfo).getHwFlags();
            int i12 = declaredField.getInt(cls);
            return (hwFlags & i12) == i12;
        }
        com.huawei.updatesdk.a.a.a.c("HarmonyUtils", "applicationInfo is null for pkg: " + str);
        return false;
    }
}
