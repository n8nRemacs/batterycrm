package com.yandex.mobile.ads.embedded.guava.collect;

import java.io.Serializable;

/* loaded from: classes8.dex */
final class c0 extends d0<Comparable<?>> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final c0 f382712a = new c0();
    private static final long serialVersionUID = 0;

    private c0() {
    }

    private Object readResolve() {
        return f382712a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0
    public final <S extends Comparable<?>> d0<S> b() {
        return i0.f382775a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
