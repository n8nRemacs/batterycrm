package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes8.dex */
enum v5 {
    f390795a,
    f390796b,
    f390797c;


    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f390798d;

    static {
        v5 v5Var = f390795a;
        v5 v5Var2 = f390796b;
        v5 v5Var3 = f390797c;
        HashMap map = new HashMap();
        f390798d = map;
        map.put(a("values_dimen_%s", v5Var.name()), 48);
        map.put(a("values_dimen_%s_sw600dp", v5Var.name()), 56);
        map.put(a("values_dimen_%s", v5Var2.name()), 15);
        map.put(a("values_dimen_%s_sw600dp", v5Var2.name()), 17);
        map.put(a("values_dimen_%s", v5Var3.name()), 19);
        map.put(a("values_dimen_%s_sw600dp", v5Var3.name()), 23);
    }

    v5() {
    }

    public static String a(String str, String str2) {
        return String.format(Locale.US, str, str2);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }

    public final int a(Context context) {
        try {
            StringBuilder sb2 = new StringBuilder(name());
            if (Math.min(rj1.c(context), rj1.b(context)) >= 600) {
                sb2.append("_sw600dp");
            }
            Integer num = (Integer) f390798d.get(a("values_dimen_%s", sb2.toString()));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            Integer num2 = (Integer) f390798d.get(a("values_dimen_%s", name()));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }
}
