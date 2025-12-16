package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class fl0 {

    /* renamed from: a, reason: collision with root package name */
    private final rk1 f385408a = yo0.a();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final mm0 f385409b;

    public fl0(@j.N Context context) {
        this.f385409b = new mm0(context);
    }

    @j.P
    public final Object a(@j.N zo0 zo0Var) {
        String strA = this.f385408a.a(zo0Var);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return a(strA);
    }

    @j.P
    public final bl0 a(@j.N String str) {
        bl0 bl0VarA = null;
        try {
            bl0VarA = this.f385409b.a(str);
            bl0VarA.a();
            return bl0VarA;
        } catch (yk0 | JSONException unused) {
            return bl0VarA;
        }
    }
}
