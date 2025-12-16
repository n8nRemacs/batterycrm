package com.yandex.mobile.ads.embedded.guava.collect;

import java.io.Serializable;

/* loaded from: classes8.dex */
final class i0 extends d0<Comparable<?>> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final i0 f382775a = new i0();
    private static final long serialVersionUID = 0;

    private i0() {
    }

    private Object readResolve() {
        return f382775a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0
    public final <S extends Comparable<?>> d0<S> b() {
        return c0.f382712a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
