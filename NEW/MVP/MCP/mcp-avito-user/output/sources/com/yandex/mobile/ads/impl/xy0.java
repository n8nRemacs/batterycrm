package com.yandex.mobile.ads.impl;

import java.net.Proxy;

/* loaded from: classes8.dex */
public final class xy0 {
    @Y61.k
    public static String a(@Y61.k ry0 ry0Var, @Y61.k Proxy.Type type) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ry0Var.f());
        sb2.append(' ');
        if (ry0Var.e() || type != Proxy.Type.HTTP) {
            sb2.append(a(ry0Var.h()));
        } else {
            sb2.append(ry0Var.h());
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    @Y61.k
    public static String a(@Y61.k s10 s10Var) {
        String strC = s10Var.c();
        String strE = s10Var.e();
        return strE != null ? androidx.compose.foundation.H.i('?', strC, strE) : strC;
    }
}
