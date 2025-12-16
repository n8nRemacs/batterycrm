package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: RegularImmutableSortedSet.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class N3<E> extends N1<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final N3<Comparable> f359527h;

    /* renamed from: g, reason: collision with root package name */
    @XY0.e
    public final transient AbstractC37401r1<E> f359528g;

    static {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        f359527h = new N3<>(I3.f359390f, C37392p3.f359948d);
    }

    public N3(AbstractC37401r1<E> abstractC37401r1, Comparator<? super E> comparator) {
        super(comparator);
        this.f359528g = abstractC37401r1;
    }

    @Override // com.google.common.collect.N1
    public final N1<E> R() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f359521e);
        return isEmpty() ? N1.U(comparatorReverseOrder) : new N3(this.f359528g.N(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @XY0.c
    /* renamed from: S */
    public final N4<E> descendingIterator() {
        return this.f359528g.N().listIterator(0);
    }

    @Override // com.google.common.collect.N1
    public final N1<E> Y(E e12, boolean z12) {
        return f0(0, i0(e12, z12));
    }

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
    public final AbstractC37401r1<E> b() {
        return this.f359528g;
    }

    @Override // com.google.common.collect.N1
    public final N1<E> b0(E e12, boolean z12, E e13, boolean z13) {
        return e0(e12, z12).Y(e13, z13);
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @I41.a
    public final E ceiling(E e12) {
        int iK02 = k0(e12, true);
        AbstractC37401r1<E> abstractC37401r1 = this.f359528g;
        if (iK02 == abstractC37401r1.size()) {
            return null;
        }
        return abstractC37401r1.get(iK02);
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.f359528g, obj, this.f359521e) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof InterfaceC37338g3) {
            collection = ((InterfaceC37338g3) collection).k();
        }
        Comparator<? super E> comparator = this.f359521e;
        if (!C37327e4.a(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        N4<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        A00.b bVar = (Object) it2.next();
        E next = it.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next, bVar);
                if (iCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next = it.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    bVar = (Object) it2.next();
                } else if (iCompare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final int d(int i12, Object[] objArr) {
        return this.f359528g.d(i12, objArr);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    @I41.a
    public final Object[] e() {
        return this.f359528g.e();
    }

    @Override // com.google.common.collect.N1
    public final N1<E> e0(E e12, boolean z12) {
        return f0(k0(e12, z12), this.f359528g.size());
    }

    @Override // com.google.common.collect.H1, java.util.Collection, java.util.Set
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f359528g.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator<? super E> comparator = this.f359521e;
        if (!C37327e4.a(comparator, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            N4<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || comparator.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    public final N3<E> f0(int i12, int i13) {
        AbstractC37401r1<E> abstractC37401r1 = this.f359528g;
        if (i12 == 0 && i13 == abstractC37401r1.size()) {
            return this;
        }
        Comparator<? super E> comparator = this.f359521e;
        return i12 < i13 ? new N3<>(abstractC37401r1.subList(i12, i13), comparator) : N1.U(comparator);
    }

    @Override // com.google.common.collect.N1, java.util.SortedSet
    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f359528g.get(0);
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @I41.a
    public final E floor(E e12) {
        int iI02 = i0(e12, true) - 1;
        if (iI02 == -1) {
            return null;
        }
        return this.f359528g.get(iI02);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final int g() {
        return this.f359528g.g();
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final int h() {
        return this.f359528g.h();
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @I41.a
    public final E higher(E e12) {
        int iK02 = k0(e12, false);
        AbstractC37401r1<E> abstractC37401r1 = this.f359528g;
        if (iK02 == abstractC37401r1.size()) {
            return null;
        }
        return abstractC37401r1.get(iK02);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return this.f359528g.i();
    }

    public final int i0(E e12, boolean z12) {
        e12.getClass();
        int iBinarySearch = Collections.binarySearch(this.f359528g, e12, this.f359521e);
        return iBinarySearch >= 0 ? z12 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int indexOf(@I41.a Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.f359528g, obj, this.f359521e);
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public final int k0(E e12, boolean z12) {
        e12.getClass();
        int iBinarySearch = Collections.binarySearch(this.f359528g, e12, this.f359521e);
        return iBinarySearch >= 0 ? z12 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // com.google.common.collect.N1, com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final N4<E> iterator() {
        return this.f359528g.listIterator(0);
    }

    @Override // com.google.common.collect.N1, java.util.SortedSet
    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f359528g.get(r0.size() - 1);
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @I41.a
    public final E lower(E e12) {
        int iI02 = i0(e12, false) - 1;
        if (iI02 == -1) {
            return null;
        }
        return this.f359528g.get(iI02);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f359528g.size();
    }
}
