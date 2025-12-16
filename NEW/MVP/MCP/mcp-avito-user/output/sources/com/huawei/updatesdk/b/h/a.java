package com.huawei.updatesdk.b.h;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static final Map<Integer, String> f363858d;

    /* renamed from: e, reason: collision with root package name */
    private static a f363859e;

    /* renamed from: a, reason: collision with root package name */
    private int f363860a;

    /* renamed from: b, reason: collision with root package name */
    private int f363861b = 0;

    /* renamed from: c, reason: collision with root package name */
    private String f363862c = "";

    static {
        HashMap map = new HashMap();
        f363858d = map;
        f363859e = new a();
        map.put(1, "1.0");
        map.put(2, "1.5");
        map.put(3, "1.6");
        map.put(4, "2.0");
        map.put(5, "2.0");
        map.put(6, "2.3");
        map.put(7, "3.0");
        map.put(8, "3.0.5");
        map.put(8, "3.1");
        map.put(9, "4.0");
        map.put(10, "4.1");
        map.put(11, "5.0");
        map.put(12, "5.1");
    }

    private a() {
        this.f363860a = 0;
        int iE2 = e();
        this.f363860a = iE2;
        if (iE2 == 0) {
            this.f363860a = d();
        }
        g();
        h();
        com.huawei.updatesdk.a.a.a.b("SystemSupportUtil", "emuiVersion:" + this.f363860a + ", magicApiLevel:" + this.f363861b + ", magicVersion:" + this.f363862c);
    }

    private int d() {
        String strA = a(com.huawei.updatesdk.a.a.d.i.c.a("ro.build.version.emui", ""));
        if (TextUtils.isEmpty(strA)) {
            return 0;
        }
        for (Map.Entry<Integer, String> entry : f363858d.entrySet()) {
            if (strA.equals(entry.getValue())) {
                return entry.getKey().intValue();
            }
        }
        return 0;
    }

    private int e() {
        return com.huawei.updatesdk.a.a.d.i.c.a("ro.build.hw_emui_api_level", 0);
    }

    public static a f() {
        return f363859e;
    }

    private void g() {
        try {
            Class<?> cls = Class.forName("com.hihonor.android.os.Build$VERSION");
            this.f363861b = cls.getDeclaredField("MAGIC_SDK_INT").getInt(cls);
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.a.c("SystemSupportUtil", "initMagicApiLevel, error: " + th2.toString());
        }
    }

    private void h() {
        try {
            Class<?> cls = Class.forName("com.hihonor.android.os.Build");
            String str = (String) cls.getDeclaredField("MAGIC_VERSION").get(cls);
            if (str == null) {
                str = "";
            }
            this.f363862c = str;
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.a.c("SystemSupportUtil", "initMagicVersion, error: " + th2.toString());
        }
    }

    public int a() {
        return this.f363860a;
    }

    public int b() {
        return this.f363861b;
    }

    public String c() {
        return this.f363862c;
    }

    private String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length == 2) {
                return strArrSplit[1];
            }
        }
        return "";
    }
}
