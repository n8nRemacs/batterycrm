package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: DescendingImmutableSortedSet.java */
@XY0.c
@InterfaceC37329f0
/* renamed from: com.google.common.collect.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37305b0<E> extends N1<E> {

    /* renamed from: g, reason: collision with root package name */
    public final N1<E> f359646g;

    public C37305b0(N1<E> n12) {
        super(AbstractC37429w3.b(n12.f359521e).h());
        this.f359646g = n12;
    }

    @Override // com.google.common.collect.N1
    @XY0.c
    public final N1<E> R() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.N1
    @XY0.c
    /* renamed from: S */
    public final N4<E> descendingIterator() {
        return this.f359646g.iterator();
    }

    @Override // com.google.common.collect.N1
    @XY0.c
    /* renamed from: T */
    public final N1<E> descendingSet() {
        return this.f359646g;
    }

    @Override // com.google.common.collect.N1
    public final N1<E> Y(E e12, boolean z12) {
        return this.f359646g.tailSet(e12, z12).descendingSet();
    }

    @Override // com.google.common.collect.N1
    public final N1<E> b0(E e12, boolean z12, E e13, boolean z13) {
        return this.f359646g.subSet(e13, z13, e12, z12).descendingSet();
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @I41.a
    public final E ceiling(E e12) {
        return this.f359646g.floor(e12);
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        return this.f359646g.contains(obj);
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @XY0.c
    public final Iterator descendingIterator() {
        return this.f359646g.iterator();
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @XY0.c
    public final NavigableSet descendingSet() {
        return this.f359646g;
    }

    @Override // com.google.common.collect.N1
    public final N1<E> e0(E e12, boolean z12) {
        return this.f359646g.headSet(e12, z12).descendingSet();
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @I41.a
    public final E floor(E e12) {
        return this.f359646g.ceiling(e12);
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @I41.a
    public final E higher(E e12) {
        return this.f359646g.lower(e12);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return this.f359646g.i();
    }

    @Override // com.google.common.collect.N1, com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f359646g.descendingIterator();
    }

    @Override // com.google.common.collect.AbstractC37378n1
    /* renamed from: l */
    public final N4<E> iterator() {
        return this.f359646g.descendingIterator();
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @I41.a
    public final E lower(E e12) {
        return this.f359646g.higher(e12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f359646g.size();
    }
}
