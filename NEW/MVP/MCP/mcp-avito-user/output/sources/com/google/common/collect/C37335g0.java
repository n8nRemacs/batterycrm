package com.google.common.collect;

import com.google.common.collect.C37325e2;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;

/* compiled from: EmptyContiguousSet.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37335g0<C extends Comparable> extends W<C> {

    /* compiled from: EmptyContiguousSet.java */
    @XY0.d
    @XY0.c
    /* renamed from: com.google.common.collect.g0$b */
    public static final class b<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37323e0<C> f359787b;

        public b() {
            throw null;
        }

        public b(AbstractC37323e0 abstractC37323e0, a aVar) {
            this.f359787b = abstractC37323e0;
        }

        private Object readResolve() {
            return new C37335g0(this.f359787b);
        }
    }

    public C37335g0() {
        throw null;
    }

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.W, com.google.common.collect.N1
    @XY0.c
    public final N1<C> R() {
        C37392p3.f359948d.getClass();
        return N1.U(P3.f359543b);
    }

    @Override // com.google.common.collect.N1
    @XY0.c
    /* renamed from: S */
    public final N4<C> descendingIterator() {
        return C37325e2.d.f359709e;
    }

    @Override // com.google.common.collect.W, com.google.common.collect.N1
    public final N1 Y(Object obj, boolean z12) {
        return this;
    }

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
    public final AbstractC37401r1<C> b() {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        return (AbstractC37401r1<C>) I3.f359390f;
    }

    @Override // com.google.common.collect.W, com.google.common.collect.N1
    public final N1 b0(Object obj, boolean z12, Object obj2, boolean z13) {
        return this;
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        return false;
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @XY0.c
    public final Iterator descendingIterator() {
        return C37325e2.d.f359709e;
    }

    @Override // com.google.common.collect.W, com.google.common.collect.N1
    public final N1 e0(Object obj, boolean z12) {
        return this;
    }

    @Override // com.google.common.collect.H1, java.util.Collection, java.util.Set
    public final boolean equals(@I41.a Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.collect.N1, java.util.SortedSet
    public final Object first() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.H1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.N1, com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C37325e2.d.f359709e;
    }

    @Override // com.google.common.collect.W
    public final B3<C> k0() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.AbstractC37378n1
    /* renamed from: l */
    public final N4<C> iterator() {
        return C37325e2.d.f359709e;
    }

    @Override // com.google.common.collect.N1, java.util.SortedSet
    public final Object last() {
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // com.google.common.collect.W, java.util.AbstractCollection
    public final String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // com.google.common.collect.N1, com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
    @XY0.c
    @XY0.d
    public Object writeReplace() {
        return new b(this.f359586g, null);
    }

    @Override // com.google.common.collect.W
    /* renamed from: i0 */
    public final W<C> Y(C c12, boolean z12) {
        return this;
    }

    @Override // com.google.common.collect.W
    /* renamed from: o0 */
    public final W<C> e0(C c12, boolean z12) {
        return this;
    }

    @Override // com.google.common.collect.W
    /* renamed from: m0 */
    public final W<C> b0(C c12, boolean z12, C c13, boolean z13) {
        return this;
    }
}
