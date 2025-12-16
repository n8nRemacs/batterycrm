package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: LexicographicalOrdering.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.l2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37367l2<T> extends AbstractC37429w3<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Iterator<T> it = ((Iterable) obj).iterator();
        Iterator<T> it2 = ((Iterable) obj2).iterator();
        if (!it.hasNext()) {
            return it2.hasNext() ? -1 : 0;
        }
        if (!it2.hasNext()) {
            return 1;
        }
        it.next();
        it2.next();
        throw null;
    }

    @Override // java.util.Comparator
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C37367l2)) {
            return false;
        }
        ((C37367l2) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "null.lexicographical()";
    }
}
