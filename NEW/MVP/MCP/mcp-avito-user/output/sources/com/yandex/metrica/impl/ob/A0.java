package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes7.dex */
public class A0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39160u2 f377745a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final F f377746b;

    public A0(@j.N Context context) {
        this(new C39160u2(context, "com.yandex.android.appmetrica.build_id"), new F(context, "com.yandex.android.appmetrica.is_offline"));
    }

    @j.P
    public String a() {
        return this.f377745a.a();
    }

    @j.P
    public Boolean b() {
        return this.f377746b.a();
    }

    @j.k0
    public A0(@j.N C39160u2 c39160u2, @j.N F f12) {
        this.f377745a = c39160u2;
        this.f377746b = f12;
    }
}
