package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: PairwiseEquivalence.java */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
final class I<E, T extends E> extends AbstractC37270n<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;

    @Override // com.google.common.base.AbstractC37270n
    public final boolean a(Object obj, Object obj2) {
        Iterator it = ((Iterable) obj).iterator();
        Iterator it2 = ((Iterable) obj2).iterator();
        if (!it.hasNext() || !it2.hasNext()) {
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        it.next();
        it2.next();
        throw null;
    }

    @Override // com.google.common.base.AbstractC37270n
    public final int b(Object obj) {
        Iterator it = ((Iterable) obj).iterator();
        if (!it.hasNext()) {
            return 78721;
        }
        it.next();
        throw null;
    }

    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof I)) {
            return false;
        }
        ((I) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "null.pairwise()";
    }
}
