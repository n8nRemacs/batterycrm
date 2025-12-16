package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes8.dex */
public final class hd1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final rk1 f386115a = yo0.a();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final vd1 f386116b;

    public hd1(@j.N Context context) {
        this.f386116b = new vd1(context);
    }

    @j.P
    public final ed1 a(@j.N zo0 zo0Var) {
        String strA = this.f386115a.a(zo0Var);
        if (!TextUtils.isEmpty(strA)) {
            try {
                zc1 zc1VarA = this.f386116b.a(strA);
                if (zc1VarA != null) {
                    Map<String, String> map = zo0Var.f392317c;
                    if (!(map != null ? fz.a(map, 32) : false)) {
                        strA = null;
                    }
                    return new ed1(zc1VarA, strA);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
