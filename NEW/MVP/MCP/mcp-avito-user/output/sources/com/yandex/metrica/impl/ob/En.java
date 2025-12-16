package com.yandex.metrica.impl.ob;

import java.util.Collection;

/* loaded from: classes7.dex */
public class En<T> implements Kn<Collection<T>> {
    public En(@j.N String str) {
    }

    @Override // com.yandex.metrica.impl.ob.Kn
    public In a(@j.P Object obj) {
        return A2.b((Collection) obj) ? In.a(this, "Stacktrace is null or empty.") : In.a(this);
    }
}
