package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public abstract class Uc<T> implements Lb<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39232x2 f379609a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC38827gc f379610b;

    public Uc(@j.N InterfaceC38827gc interfaceC38827gc, @j.N C39232x2 c39232x2) {
        this.f379610b = interfaceC38827gc;
        this.f379609a = c39232x2;
    }

    @j.N
    public abstract String a();

    public boolean a(long j12) {
        return this.f379609a.b(this.f379610b.getLastAttemptTimeSeconds(), j12, "last " + a() + " scan attempt");
    }
}
