package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class e31 {
    public static boolean a(@j.N Context context) {
        v11 v11VarA = q21.b().a(context);
        return v11VarA != null && v11VarA.J();
    }

    public static boolean b(@j.N Context context) {
        return !c(context);
    }

    public static boolean c(@j.N Context context) {
        v11 v11VarA = q21.b().a(context);
        return v11VarA == null || !v11VarA.b0() || a(context);
    }
}
