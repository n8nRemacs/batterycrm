package com.huawei.updatesdk.a.a.d.i;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.appcompat.app.r;
import com.huawei.android.app.PackageManagerEx;
import com.huawei.system.BuildEx;
import com.huawei.updatesdk.a.a.d.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static int f363773d = -1;

    /* renamed from: a, reason: collision with root package name */
    private int f363779a;

    /* renamed from: b, reason: collision with root package name */
    private int f363780b;

    /* renamed from: e, reason: collision with root package name */
    private static c f363774e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static String f363775f = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f363772c = a("ro.product.brand", "");

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f363776g = a("hw_sc.product.useBrandCust", false);

    /* renamed from: h, reason: collision with root package name */
    public static final int f363777h = a("hw_sc.build.os.apiversion", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f363778i = g();

    private c() {
        this.f363779a = 0;
        this.f363780b = 0;
        if (a("ro.maple.enable", 0) == 1) {
            this.f363779a = 1;
        }
        this.f363780b = a("ro.build.version.ark", 0);
    }

    public static String c() {
        try {
            Object obj = Class.forName("com.huawei.system.BuildEx").getField("DISPLAY").get(null);
            return obj == null ? Build.DISPLAY : obj.toString();
        } catch (Throwable unused) {
            return Build.DISPLAY;
        }
    }

    public static int d() {
        int i12 = f363773d;
        if (i12 >= 0) {
            return i12;
        }
        Context contextA = com.huawei.updatesdk.a.b.a.a.c().a();
        f363773d = k(contextA) ? 1 : l(contextA) ? 2 : h(contextA) ? 3 : l() ? 4 : i(contextA) ? 7 : 0;
        return f363773d;
    }

    public static c e() {
        return f363774e;
    }

    public static int f(Context context) {
        try {
            return Integer.parseInt(context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionCode + "");
        } catch (Exception unused) {
            return 1;
        }
    }

    private static String g() {
        try {
            return BuildEx.getOsBrand();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean h(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int i() {
        return a("ro.product.cpu.abi", "").contains("arm64") ? 2 : 1;
    }

    public static String j() {
        String language;
        String script;
        String country;
        Locale locale = Locale.getDefault();
        if (locale != null) {
            language = locale.getLanguage();
            script = locale.getScript();
            country = locale.getCountry();
        } else {
            language = "en";
            script = "";
            country = "US";
        }
        if (TextUtils.isEmpty(script)) {
            return r.r(language, "_", country);
        }
        return language + "_" + script + "_" + country;
    }

    public static boolean k() {
        return com.huawei.updatesdk.b.h.a.f().a() > 0 || com.huawei.updatesdk.b.h.a.f().b() > 0;
    }

    private static boolean l() {
        return a("com.huawei.software.features.kidpad");
    }

    public int a() {
        return this.f363779a;
    }

    public int b() {
        return this.f363780b;
    }

    public static int a(String str, int i12) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, str, Integer.valueOf(i12))).intValue();
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("DeviceUtil", "Exception while getting system property: ", th2);
            return i12;
        }
    }

    private static DisplayMetrics b(Context context) {
        Display defaultDisplay;
        Object systemService = context.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static List<String> c(Context context) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        for (int i12 = 0; i12 < locales.size(); i12++) {
            String language = locales.get(i12).getLanguage();
            if (!TextUtils.isEmpty(language) && !arrayList.contains(language)) {
                arrayList.add(language);
            }
        }
        return arrayList;
    }

    public static String d(Context context) {
        DisplayMetrics displayMetricsB = b(context);
        return displayMetricsB != null ? r.r(String.valueOf(displayMetricsB.widthPixels), "_", String.valueOf(displayMetricsB.heightPixels)) : "";
    }

    public static String e(Context context) {
        DisplayMetrics displayMetricsB = b(context);
        return displayMetricsB != null ? String.valueOf(displayMetricsB.densityDpi) : "";
    }

    public static String f() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        String script = locale.getScript();
        if (TextUtils.isEmpty(script) && TextUtils.isEmpty(variant)) {
            return r.r(language, "_", country);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(language);
        sb2.append("_");
        sb2.append(script);
        sb2.append("_");
        sb2.append(country);
        return AK.c.s(sb2, "_", variant);
    }

    public static String g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName + "";
        } catch (Exception unused) {
            return null;
        }
    }

    public static String[] h() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return strArr == null ? new String[0] : strArr;
    }

    private static boolean i(Context context) {
        return context.getPackageManager().hasSystemFeature("com.huawei.software.features.car");
    }

    private static boolean k(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        com.huawei.updatesdk.a.a.a.b("DeviceUtil", "UI mode: " + uiModeManager.getCurrentModeType());
        return uiModeManager.getCurrentModeType() == 4;
    }

    private static boolean l(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static String a(Context context) {
        if (f363775f == null) {
            ArrayList arrayList = new ArrayList();
            a(context, arrayList);
            a(arrayList);
            f363775f = f.a(arrayList, ",");
        }
        return f363775f;
    }

    public static String b(Context context, String str) {
        String strA = a(context, str);
        int i12 = 0;
        int i13 = 0;
        while (i12 < strA.length() && i13 < 3) {
            if (strA.charAt(i12) == '.') {
                i13++;
            }
            i12++;
        }
        return 3 == i13 ? strA.substring(0, i12 - 1) : strA;
    }

    public static String a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 16).versionName + "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("DeviceUtil", "Exception while getting system property: ", th2);
            return str2;
        }
    }

    public static List<String> a(List<String> list, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!a(str, strArr)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private static void a(Context context, List<String> list) {
        a(context.getPackageManager().getSystemAvailableFeatures(), list);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:9:0x001d, B:11:0x0023, B:14:0x0029, B:20:0x0042, B:24:0x004b, B:26:0x005f, B:17:0x0036), top: B:30:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.Window r4) {
        /*
            r3 = this;
            com.huawei.updatesdk.b.h.a r0 = com.huawei.updatesdk.b.h.a.f()
            int r0 = r0.a()
            r1 = 21
            if (r0 >= r1) goto L16
            com.huawei.updatesdk.b.h.a r0 = com.huawei.updatesdk.b.h.a.f()
            int r0 = r0.b()
            if (r0 <= 0) goto L18
        L16:
            if (r4 != 0) goto L19
        L18:
            return
        L19:
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L27
            r1 = 28
            if (r0 < r1) goto L29
            com.avito.android.util.C35767c4.t(r4)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r4 = move-exception
            goto L76
        L29:
            com.huawei.updatesdk.b.h.a r0 = com.huawei.updatesdk.b.h.a.f()     // Catch: java.lang.Throwable -> L27
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L27
            if (r0 <= 0) goto L36
            java.lang.String r0 = "com.huawei.android.view.WindowManagerEx$LayoutParamsEx"
            goto L42
        L36:
            com.huawei.updatesdk.b.h.a r0 = com.huawei.updatesdk.b.h.a.f()     // Catch: java.lang.Throwable -> L27
            int r0 = r0.b()     // Catch: java.lang.Throwable -> L27
            if (r0 <= 0) goto L47
            java.lang.String r0 = "com.hihonor.android.view.WindowManagerEx$LayoutParamsEx"
        L42:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L27
            goto L48
        L47:
            r0 = 0
        L48:
            if (r0 != 0) goto L4b
            return
        L4b:
            java.lang.Class<android.view.WindowManager$LayoutParams> r1 = android.view.WindowManager.LayoutParams.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Constructor r1 = r0.getConstructor(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r1.newInstance(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "setDisplaySideMode"
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L27
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L27
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L27
            r0.invoke(r4, r1)     // Catch: java.lang.Throwable -> L27
            goto L8d
        L76:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setWindowDisplaySideMode exception: "
            r0.<init>(r1)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "DeviceUtil"
            com.huawei.updatesdk.a.a.c.a.a.a.b(r0, r4)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.a.a.d.i.c.a(android.view.Window):void");
    }

    private static void a(List<String> list) {
        try {
            a(PackageManagerEx.getHwSystemAvailableFeatures(), list);
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.c("DeviceUtil", "initHwDeviceFeatures: " + th2.toString());
        }
    }

    public static boolean j(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo("com.google.android.gsf.login", 16);
            packageManager.getPackageInfo("com.google.android.gsf", 16);
            return (packageManager.getPackageInfo("com.google.android.gms", 16).applicationInfo.flags & 1) != 0;
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("DeviceUtil", e12.getMessage());
            return false;
        }
    }

    private static void a(FeatureInfo[] featureInfoArr, List<String> list) {
        if (featureInfoArr != null) {
            for (FeatureInfo featureInfo : featureInfoArr) {
                String str = featureInfo.name;
                if (str != null) {
                    list.add(com.huawei.updatesdk.a.a.d.c.a(str));
                }
            }
        }
    }

    private static boolean a(String str) {
        try {
            return PackageManagerEx.hasHwSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean a(String str, boolean z12) {
        try {
            return ((Boolean) Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, str, Boolean.valueOf(z12))).booleanValue();
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("DeviceUtil", "Exception while getting system property: ", th2);
            return z12;
        }
    }

    public static boolean a(String str, String[] strArr) {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (String str2 : strArr) {
            if (str2.startsWith("config.")) {
                i12 = 1;
            } else if (!str2.contains(".config.")) {
                i13++;
            }
            if (str2.endsWith("config." + str)) {
                i14++;
            }
        }
        return i12 + i13 == i14;
    }
}
