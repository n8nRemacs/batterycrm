package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Gn<T> implements Kn<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f378196a;

    public Gn(@j.N String str) {
        this.f378196a = str;
    }

    @Override // com.yandex.metrica.impl.ob.Kn
    public In a(@j.P T t12) {
        if (t12 != null) {
            return In.a(this);
        }
        return In.a(this, this.f378196a + " is null.");
    }
}
