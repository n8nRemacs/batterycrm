package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Qf implements Kn<Void> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Sf f379258a;

    public Qf(@j.N Sf sf2) {
        this.f379258a = sf2;
    }

    @Override // com.yandex.metrica.impl.ob.Kn
    public In a(@j.P Void r12) {
        this.f379258a.getClass();
        return R2.h() ? In.a(this) : In.a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }

    public In a() {
        this.f379258a.getClass();
        if (R2.h()) {
            return In.a(this);
        }
        return In.a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }
}
