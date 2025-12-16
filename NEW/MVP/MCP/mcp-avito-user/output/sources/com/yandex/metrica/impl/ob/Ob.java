package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Ob implements Gc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f379038a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC38827gc f379039b;

    @j.k0
    public Ob(@j.N InterfaceC38827gc interfaceC38827gc, @j.N com.yandex.metrica.coreutils.services.f fVar) {
        this.f379039b = interfaceC38827gc;
        this.f379038a = fVar;
    }

    @Override // com.yandex.metrica.impl.ob.Gc
    public void a() {
        this.f379039b.a(this.f379038a.c());
    }
}
