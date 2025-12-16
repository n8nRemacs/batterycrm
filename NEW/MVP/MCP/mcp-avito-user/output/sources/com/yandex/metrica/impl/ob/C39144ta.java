package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.ta, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39144ta<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f381863a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f381864b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC39120sa<T> f381865c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC39011nm<C39096ra, C39073qa> f381866d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final InterfaceC39216wa f381867e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C39192va f381868f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final M0 f381869g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f381870h;

    public C39144ta(@j.N Context context, @j.N Q0 q02, @j.N String str, @j.N InterfaceC39120sa<T> interfaceC39120sa, @j.N InterfaceC39011nm<C39096ra, C39073qa> interfaceC39011nm, @j.N InterfaceC39216wa interfaceC39216wa) {
        this(context, str, interfaceC39120sa, interfaceC39011nm, interfaceC39216wa, new C39192va(context, str, interfaceC39216wa, q02), C39031oh.a(), new com.yandex.metrica.coreutils.services.e());
    }

    public synchronized void a(@j.P T t12, @j.N C39096ra c39096ra) {
        if (this.f381868f.a(this.f381866d.a(c39096ra))) {
            this.f381869g.a(this.f381864b, this.f381865c.a(t12));
            this.f381867e.a(new Z8(C38899ja.a(this.f381863a).g()), this.f381870h.c());
        }
    }

    public C39144ta(@j.N Context context, @j.N String str, @j.N InterfaceC39120sa<T> interfaceC39120sa, @j.N InterfaceC39011nm<C39096ra, C39073qa> interfaceC39011nm, @j.N InterfaceC39216wa interfaceC39216wa, @j.N C39192va c39192va, @j.N M0 m02, @j.N com.yandex.metrica.coreutils.services.f fVar) {
        this.f381863a = context;
        this.f381864b = str;
        this.f381865c = interfaceC39120sa;
        this.f381866d = interfaceC39011nm;
        this.f381867e = interfaceC39216wa;
        this.f381868f = c39192va;
        this.f381869g = m02;
        this.f381870h = fVar;
    }
}
