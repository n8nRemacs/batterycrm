package com.yandex.mobile.ads.embedded.guava.collect;

import aZ0.InterfaceC19845a;
import java.util.Comparator;

/* loaded from: classes8.dex */
public abstract class d0<T> implements Comparator<T> {
    public static <C extends Comparable> d0<C> a() {
        return c0.f382712a;
    }

    public <S extends T> d0<S> b() {
        return new j0(this);
    }

    @Override // java.util.Comparator
    @InterfaceC19845a
    public abstract int compare(T t12, T t13);

    public static <T> d0<T> a(Comparator<T> comparator) {
        return comparator instanceof d0 ? (d0) comparator : new j(comparator);
    }
}
