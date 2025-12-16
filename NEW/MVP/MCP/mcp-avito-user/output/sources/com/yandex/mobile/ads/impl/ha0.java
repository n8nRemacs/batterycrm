package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
final class ha0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f385941a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f385942b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final nx0 f385943c = new nx0();

    public ha0(@j.N Context context, @j.N String str) {
        this.f385941a = context.getApplicationContext();
        this.f385942b = str;
    }

    @j.P
    public final ny a() {
        Class<?> cls;
        nx0 nx0Var = this.f385943c;
        String str = this.f385942b;
        nx0Var.getClass();
        try {
            cls = Class.forName(str);
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        nx0 nx0Var2 = this.f385943c;
        Object[] objArr = {this.f385941a};
        nx0Var2.getClass();
        Object objA = nx0.a((Class) cls, "getFusedLocationProviderClient", objArr);
        if (objA != null) {
            return new ny(objA);
        }
        return null;
    }
}
