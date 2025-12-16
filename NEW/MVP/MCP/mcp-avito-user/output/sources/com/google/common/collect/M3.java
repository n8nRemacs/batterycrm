package com.google.common.collect;

import com.google.common.collect.InterfaceC37338g3;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: RegularImmutableSortedMultiset.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class M3<E> extends L1<E> {

    /* renamed from: l, reason: collision with root package name */
    public static final long[] f359511l = {0};

    /* renamed from: m, reason: collision with root package name */
    public static final L1<Comparable> f359512m = new M3(C37392p3.f359948d);

    /* renamed from: h, reason: collision with root package name */
    @XY0.e
    public final transient N3<E> f359513h;

    /* renamed from: i, reason: collision with root package name */
    public final transient long[] f359514i;

    /* renamed from: j, reason: collision with root package name */
    public final transient int f359515j;

    /* renamed from: k, reason: collision with root package name */
    public final transient int f359516k;

    public M3(Comparator<? super E> comparator) {
        this.f359513h = N1.U(comparator);
        this.f359514i = f359511l;
        this.f359515j = 0;
        this.f359516k = 0;
    }

    @Override // com.google.common.collect.L1, com.google.common.collect.InterfaceC37345h4
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final L1<E> l1(E e12, BoundType boundType) {
        return I(0, this.f359513h.i0(e12, boundType == BoundType.f359277c));
    }

    @Override // com.google.common.collect.L1, com.google.common.collect.InterfaceC37345h4
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final L1<E> V5(E e12, BoundType boundType) {
        return I(this.f359513h.k0(e12, boundType == BoundType.f359277c), this.f359516k);
    }

    public final L1<E> I(int i12, int i13) {
        int i14 = this.f359516k;
        com.google.common.base.M.l(i12, i13, i14);
        N3<E> n32 = this.f359513h;
        if (i12 == i13) {
            Comparator<? super E> comparator = n32.f359521e;
            return C37392p3.f359948d.equals(comparator) ? (L1<E>) f359512m : new M3(comparator);
        }
        if (i12 == 0 && i13 == i14) {
            return this;
        }
        return new M3(n32.f0(i12, i13), this.f359514i, this.f359515j + i12, i13 - i12);
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    public final int S5(@I41.a Object obj) {
        int iIndexOf = this.f359513h.indexOf(obj);
        if (iIndexOf < 0) {
            return 0;
        }
        int i12 = this.f359515j + iIndexOf;
        long[] jArr = this.f359514i;
        return (int) (jArr[i12 + 1] - jArr[i12]);
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return v(0);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        if (this.f359515j <= 0) {
            return this.f359516k < this.f359514i.length - 1;
        }
        return true;
    }

    @Override // com.google.common.collect.L1, com.google.common.collect.A1, com.google.common.collect.InterfaceC37338g3
    public final NavigableSet k() {
        return this.f359513h;
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return v(this.f359516k - 1);
    }

    @Override // com.google.common.collect.L1, com.google.common.collect.A1
    /* renamed from: s */
    public final H1 k() {
        return this.f359513h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i12 = this.f359516k;
        int i13 = this.f359515j;
        long[] jArr = this.f359514i;
        return com.google.common.primitives.l.f(jArr[i12 + i13] - jArr[i13]);
    }

    @Override // com.google.common.collect.A1
    public final InterfaceC37338g3.a<E> v(int i12) {
        E e12 = this.f359513h.b().get(i12);
        int i13 = this.f359515j + i12;
        long[] jArr = this.f359514i;
        return C37374m3.b((int) (jArr[i13 + 1] - jArr[i13]), e12);
    }

    @Override // com.google.common.collect.L1
    /* renamed from: y */
    public final N1<E> k() {
        return this.f359513h;
    }

    @Override // com.google.common.collect.L1, com.google.common.collect.A1, com.google.common.collect.InterfaceC37338g3
    public final Set k() {
        return this.f359513h;
    }

    @Override // com.google.common.collect.L1, com.google.common.collect.A1, com.google.common.collect.InterfaceC37338g3
    public final SortedSet k() {
        return this.f359513h;
    }

    public M3(N3<E> n32, long[] jArr, int i12, int i13) {
        this.f359513h = n32;
        this.f359514i = jArr;
        this.f359515j = i12;
        this.f359516k = i13;
    }
}
