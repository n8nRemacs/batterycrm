package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Sets.java */
/* loaded from: classes6.dex */
class Z3 extends AbstractSet<Set<Object>> {

    /* compiled from: Sets.java */
    public class a extends AbstractC37316d<Set<Object>> {
        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final Set<Object> a() {
            throw null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@I41.a Object obj) {
        if ((obj instanceof Set) && ((Set) obj).size() == 0) {
            throw null;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Set<Object>> iterator() {
        new a();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        throw null;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        throw null;
    }
}
