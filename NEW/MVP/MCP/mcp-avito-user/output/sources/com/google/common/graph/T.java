package com.google.common.graph;

import java.util.AbstractSet;

/* compiled from: IncidentEdgeSet.java */
@D
/* loaded from: classes6.dex */
abstract class T<N> extends AbstractSet<E<N>> {
    public T() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@I41.a Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@I41.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        throw null;
    }
}
