package com.google.common.collect;

import java.io.Serializable;

/* compiled from: ReverseNaturalOrdering.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class P3 extends AbstractC37429w3<Comparable<?>> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final P3 f359543b = new P3();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f359543b;
    }

    @Override // com.google.common.collect.AbstractC37429w3
    public final Object c(Object obj, Object obj2) {
        throw null;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.AbstractC37429w3
    public final <S extends Comparable<?>> AbstractC37429w3<S> h() {
        return C37392p3.f359948d;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
