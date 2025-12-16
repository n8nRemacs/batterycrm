package com.google.common.collect;

import com.google.common.collect.InterfaceC37338g3;

/* compiled from: DescendingImmutableSortedMultiset.java */
@XY0.c
@InterfaceC37329f0
/* renamed from: com.google.common.collect.a0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37299a0<E> extends L1<E> {

    /* renamed from: h, reason: collision with root package name */
    public final transient L1<E> f359633h;

    public C37299a0(L1<E> l12) {
        this.f359633h = l12;
    }

    @Override // com.google.common.collect.L1, com.google.common.collect.InterfaceC37345h4
    /* renamed from: C */
    public final L1<E> l1(E e12, BoundType boundType) {
        return this.f359633h.V5(e12, boundType).d1();
    }

    @Override // com.google.common.collect.L1, com.google.common.collect.InterfaceC37345h4
    /* renamed from: E */
    public final L1<E> V5(E e12, BoundType boundType) {
        return this.f359633h.l1(e12, boundType).d1();
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    public final int S5(@I41.a Object obj) {
        return this.f359633h.S5(obj);
    }

    @Override // com.google.common.collect.L1, com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4 d1() {
        return this.f359633h;
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> firstEntry() {
        return this.f359633h.lastEntry();
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return this.f359633h.i();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> lastEntry() {
        return this.f359633h.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f359633h.size();
    }

    @Override // com.google.common.collect.A1
    public final InterfaceC37338g3.a<E> v(int i12) {
        return this.f359633h.entrySet().b().N().get(i12);
    }

    @Override // com.google.common.collect.L1
    /* renamed from: w */
    public final L1<E> d1() {
        return this.f359633h;
    }

    @Override // com.google.common.collect.L1, com.google.common.collect.A1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final N1<E> k() {
        return this.f359633h.k().descendingSet();
    }
}
