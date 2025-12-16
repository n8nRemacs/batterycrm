package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Dm {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Zl<Em, Cm> f377984a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Zl<EnumC38666a1, Cm> f377985b;

    public Dm() {
        this(new Am(), new Fm(), new C39252xm());
    }

    @j.N
    public Cm a(Em em2) {
        return this.f377984a.a(em2);
    }

    public Dm(@j.N Cm cm2, @j.N Cm cm3, @j.N Cm cm4) {
        Zl<Em, Cm> zl2 = new Zl<>(cm2);
        this.f377984a = zl2;
        zl2.a(Em.NONE, cm2);
        zl2.a(Em.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, cm3);
        zl2.a(Em.AES_VALUE_ENCRYPTION, cm4);
        Zl<EnumC38666a1, Cm> zl3 = new Zl<>(cm2);
        this.f377985b = zl3;
        zl3.a(EnumC38666a1.EVENT_TYPE_IDENTITY, cm4);
    }

    @j.N
    public Cm a(@j.N C38715c0 c38715c0) {
        return this.f377985b.a(EnumC38666a1.a(c38715c0.o()));
    }
}
