package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.common.collect.AbstractC37378n1;
import com.google.common.collect.H1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: ImmutableSortedSet.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class N1<E> extends O1<E> implements NavigableSet<E>, InterfaceC37321d4<E> {

    /* renamed from: e, reason: collision with root package name */
    public final transient Comparator<? super E> f359521e;

    /* renamed from: f, reason: collision with root package name */
    @I41.a
    @XY0.c
    @InterfaceC25601b
    public transient N1<E> f359522f;

    /* compiled from: ImmutableSortedSet.java */
    public static final class a<E> extends H1.a<E> {

        /* renamed from: f, reason: collision with root package name */
        public final Comparator<? super E> f359523f;

        public a(Comparator<? super E> comparator) {
            comparator.getClass();
            this.f359523f = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.H1.a, com.google.common.collect.AbstractC37378n1.a
        @InterfaceC19845a
        /* renamed from: b */
        public final AbstractC37378n1.a c(Object obj) {
            super.b(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.H1.a, com.google.common.collect.AbstractC37378n1.a
        @InterfaceC19845a
        public final AbstractC37378n1.b c(Object obj) {
            super.b(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.H1.a
        @InterfaceC19845a
        /* renamed from: g */
        public final H1.a b(Object obj) {
            super.b(obj);
            return this;
        }

        @Override // com.google.common.collect.H1.a
        @InterfaceC19845a
        public final H1.a h(Object[] objArr) {
            throw null;
        }

        @Override // com.google.common.collect.H1.a
        @InterfaceC19845a
        public final H1.a i(Iterable iterable) {
            throw null;
        }

        @Override // com.google.common.collect.H1.a
        public final H1 j() {
            N1 n1Q = N1.Q(this.f359523f, this.f359867b, this.f359866a);
            this.f359867b = ((N3) n1Q).f359528g.size();
            this.f359868c = true;
            return n1Q;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC19845a
        public final void k(Object... objArr) {
            super.h(objArr);
        }
    }

    /* compiled from: ImmutableSortedSet.java */
    @XY0.d
    public static class b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Comparator<? super E> f359524b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f359525c;

        public b(Object[] objArr, Comparator comparator) {
            this.f359524b = comparator;
            this.f359525c = objArr;
        }

        public Object readResolve() {
            a aVar = new a(this.f359524b);
            aVar.k(this.f359525c);
            N1 n1Q = N1.Q(aVar.f359523f, aVar.f359867b, aVar.f359866a);
            aVar.f359867b = ((N3) n1Q).f359528g.size();
            aVar.f359868c = true;
            return n1Q;
        }
    }

    public N1(Comparator<? super E> comparator) {
        this.f359521e = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> N1<E> Q(Comparator<? super E> comparator, int i12, E... eArr) {
        if (i12 == 0) {
            return U(comparator);
        }
        C37414t3.a(i12, eArr);
        Arrays.sort(eArr, 0, i12, comparator);
        int i13 = 1;
        for (int i14 = 1; i14 < i12; i14++) {
            A00.b bVar = (Object) eArr[i14];
            if (comparator.compare(bVar, (Object) eArr[i13 - 1]) != 0) {
                eArr[i13] = bVar;
                i13++;
            }
        }
        Arrays.fill(eArr, i13, i12, (Object) null);
        if (i13 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i13);
        }
        return new N3(AbstractC37401r1.r(i13, eArr), comparator);
    }

    public static <E> N3<E> U(Comparator<? super E> comparator) {
        return C37392p3.f359948d.equals(comparator) ? (N3<E>) N3.f359527h : new N3<>(I3.f359390f, comparator);
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @XY0.c
    public abstract N1<E> R();

    @Override // java.util.NavigableSet
    @XY0.c
    /* renamed from: S */
    public abstract N4<E> descendingIterator();

    @Override // java.util.NavigableSet
    @XY0.c
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public N1<E> descendingSet() {
        N1<E> n12 = this.f359522f;
        if (n12 != null) {
            return n12;
        }
        N1<E> n1R = R();
        this.f359522f = n1R;
        n1R.f359522f = this;
        return n1R;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public N1<E> headSet(E e12) {
        return headSet(e12, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public N1<E> headSet(E e12, boolean z12) {
        e12.getClass();
        return Y(e12, z12);
    }

    public abstract N1<E> Y(E e12, boolean z12);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public N1<E> subSet(E e12, E e13) {
        return subSet(e12, true, e13, false);
    }

    @Override // java.util.NavigableSet
    @XY0.c
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public N1<E> subSet(E e12, boolean z12, E e13, boolean z13) {
        e12.getClass();
        e13.getClass();
        com.google.common.base.M.g(this.f359521e.compare(e12, e13) <= 0);
        return b0(e12, z12, e13, z13);
    }

    public abstract N1<E> b0(E e12, boolean z12, E e13, boolean z13);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public N1<E> tailSet(E e12) {
        return tailSet(e12, true);
    }

    @Override // java.util.NavigableSet
    @I41.a
    public E ceiling(E e12) {
        return (E) C37325e2.h(tailSet(e12, true).iterator(), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.InterfaceC37321d4
    public final Comparator<? super E> comparator() {
        return this.f359521e;
    }

    @Override // java.util.NavigableSet
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public N1<E> tailSet(E e12, boolean z12) {
        e12.getClass();
        return e0(e12, z12);
    }

    public abstract N1<E> e0(E e12, boolean z12);

    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    @I41.a
    public E floor(E e12) {
        return (E) C37325e2.h(headSet(e12, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @I41.a
    @XY0.c
    public E higher(E e12) {
        return (E) C37325e2.h(tailSet(e12, false).iterator(), null);
    }

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @I41.a
    @XY0.c
    public E lower(E e12) {
        return (E) C37325e2.h(headSet(e12, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @I41.a
    @aZ0.e
    @Deprecated
    @XY0.c
    @InterfaceC19845a
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @I41.a
    @aZ0.e
    @Deprecated
    @XY0.c
    @InterfaceC19845a
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
    @XY0.d
    public Object writeReplace() {
        return new b(toArray(AbstractC37378n1.f359865b), this.f359521e);
    }
}
