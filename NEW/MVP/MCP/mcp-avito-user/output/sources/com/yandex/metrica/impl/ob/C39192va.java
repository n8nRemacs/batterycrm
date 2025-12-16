package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.va, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39192va {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f382041a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f382042b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC39216wa f382043c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Q0 f382044d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f382045e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C39232x2 f382046f;

    public C39192va(@j.N Context context, @j.N String str, @j.N InterfaceC39216wa interfaceC39216wa, @j.N Q0 q02) {
        this(context, str, interfaceC39216wa, q02, new com.yandex.metrica.coreutils.services.e(), new C39232x2());
    }

    public boolean a(@j.P C39073qa c39073qa) {
        long jC2 = this.f382045e.c();
        if (c39073qa == null) {
            return false;
        }
        boolean z12 = true;
        boolean z13 = jC2 <= c39073qa.f381452a;
        if (!z13) {
            z12 = z13;
        } else if (this.f382044d.a() + jC2 > c39073qa.f381452a) {
            z12 = false;
        }
        if (z12) {
            return this.f382046f.b(this.f382043c.a(new Z8(C38899ja.a(this.f382041a).g())), c39073qa.f381453b, AK.c.s(new StringBuilder(), this.f382042b, " diagnostics event"));
        }
        return false;
    }

    @j.k0
    public C39192va(@j.N Context context, @j.N String str, @j.N InterfaceC39216wa interfaceC39216wa, @j.N Q0 q02, @j.N com.yandex.metrica.coreutils.services.f fVar, @j.N C39232x2 c39232x2) {
        this.f382041a = context;
        this.f382042b = str;
        this.f382043c = interfaceC39216wa;
        this.f382044d = q02;
        this.f382045e = fVar;
        this.f382046f = c39232x2;
    }
}
