package com.yandex.mobile.ads.impl;

import android.os.Build;
import androidx.compose.runtime.C22026a;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class mc1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final s21 f387952a;

    public mc1(@Y61.k s21 s21Var) {
        this.f387952a = s21Var;
    }

    @Y61.k
    public static String a() {
        String strA;
        StringBuilder sb2 = new StringBuilder("(");
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        if (C43066x.h0(str, str2, false)) {
            strA = m71.a(str);
        } else {
            strA = m71.a(str2) + ' ' + str;
        }
        sb2.append(strA);
        sb2.append("; Android ");
        return C22026a.c(sb2, Build.VERSION.RELEASE, ')');
    }

    @Y61.k
    public final String b() {
        StringBuilder sbA = Cif.a("com.yandex.mobile.metrica.ads.sdk/");
        sbA.append(this.f387952a.a());
        sbA.append('.');
        sbA.append("66124");
        return sbA.toString();
    }

    public /* synthetic */ mc1() {
        this(new s21());
    }
}
