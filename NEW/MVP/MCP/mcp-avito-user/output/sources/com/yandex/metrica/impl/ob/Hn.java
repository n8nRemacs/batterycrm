package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ValidationException;

/* loaded from: classes7.dex */
public class Hn<T> implements Kn<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Kn<T> f378274a;

    public Hn(@j.N Kn<T> kn2) {
        this.f378274a = kn2;
    }

    @Override // com.yandex.metrica.impl.ob.Kn
    public In a(@j.P T t12) {
        In inA = this.f378274a.a(t12);
        if (inA.b()) {
            return inA;
        }
        throw new ValidationException(inA.a());
    }
}
