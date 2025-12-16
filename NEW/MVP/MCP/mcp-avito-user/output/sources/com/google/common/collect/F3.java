package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;

/* compiled from: RegularContiguousSet.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class F3<C extends Comparable> extends W<C> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f359309i = 0;
    private static final long serialVersionUID = 0;

    /* renamed from: h, reason: collision with root package name */
    public final B3<C> f359310h;

    /* compiled from: RegularContiguousSet.java */
    public class a extends AbstractC37370m<C> {

        /* renamed from: c, reason: collision with root package name */
        public final C f359311c;

        public a(Comparable comparable) {
            super(comparable);
            this.f359311c = (C) F3.this.last();
        }

        @Override // com.google.common.collect.AbstractC37370m
        @I41.a
        public final Object a(Object obj) {
            Comparable comparable = (Comparable) obj;
            int i12 = F3.f359309i;
            C c12 = this.f359311c;
            if (c12 != null) {
                B3<Comparable> b32 = B3.f359264d;
                if (comparable.compareTo(c12) == 0) {
                    return null;
                }
            }
            return F3.this.f359586g.d(comparable);
        }
    }

    /* compiled from: RegularContiguousSet.java */
    public class b extends AbstractC37370m<C> {

        /* renamed from: c, reason: collision with root package name */
        public final C f359313c;

        public b(Comparable comparable) {
            super(comparable);
            this.f359313c = (C) F3.this.first();
        }

        @Override // com.google.common.collect.AbstractC37370m
        @I41.a
        public final Object a(Object obj) {
            Comparable comparable = (Comparable) obj;
            int i12 = F3.f359309i;
            C c12 = this.f359313c;
            if (c12 != null) {
                B3<Comparable> b32 = B3.f359264d;
                if (comparable.compareTo(c12) == 0) {
                    return null;
                }
            }
            return F3.this.f359586g.f(comparable);
        }
    }

    /* compiled from: RegularContiguousSet.java */
    public class c extends AbstractC37360k1<C> {
        public c() {
        }

        @Override // com.google.common.collect.AbstractC37360k1
        public final AbstractC37378n1 P() {
            return F3.this;
        }

        @Override // java.util.List
        public final Object get(int i12) {
            com.google.common.base.M.i(i12, size());
            F3 f32 = F3.this;
            return f32.f359586g.e(f32.first(), i12);
        }
    }

    /* compiled from: RegularContiguousSet.java */
    @XY0.d
    @XY0.c
    public static final class d<C extends Comparable> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final B3<C> f359316b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC37323e0<C> f359317c;

        public d() {
            throw null;
        }

        public d(B3 b32, AbstractC37323e0 abstractC37323e0, a aVar) {
            this.f359316b = b32;
            this.f359317c = abstractC37323e0;
        }

        private Object readResolve() {
            return new F3(this.f359316b, this.f359317c);
        }
    }

    public F3(B3<C> b32, AbstractC37323e0<C> abstractC37323e0) {
        super(abstractC37323e0);
        this.f359310h = b32;
    }

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @XY0.c
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final N4<C> descendingIterator() {
        return new b(last());
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f359310h.a((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return G.a(this, collection);
    }

    @Override // com.google.common.collect.H1, java.util.Collection, java.util.Set
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F3) {
            F3 f32 = (F3) obj;
            if (this.f359586g.equals(f32.f359586g)) {
                return first().equals(f32.first()) && last().equals(f32.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.H1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return W3.e(this);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return false;
    }

    @Override // com.google.common.collect.W, com.google.common.collect.N1
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final W<C> Y(C c12, boolean z12) {
        return q0(B3.k(c12, BoundType.a(z12)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.W
    public final B3<C> k0() {
        B3<C> b32 = this.f359310h;
        Y<C> y12 = b32.f359265b;
        AbstractC37323e0<C> abstractC37323e0 = this.f359586g;
        return new B3<>(y12.m(abstractC37323e0), b32.f359266c.n(abstractC37323e0));
    }

    @Override // com.google.common.collect.N1, com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final N4<C> iterator() {
        return new a(first());
    }

    @Override // com.google.common.collect.W, com.google.common.collect.N1
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final W<C> b0(C c12, boolean z12, C c13, boolean z13) {
        return (c12.compareTo(c13) != 0 || z12 || z13) ? q0(B3.i(c12, BoundType.a(z12), c13, BoundType.a(z13))) : new C37335g0(this.f359586g);
    }

    @Override // com.google.common.collect.W, com.google.common.collect.N1
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final W<C> e0(C c12, boolean z12) {
        return q0(B3.b(c12, BoundType.a(z12)));
    }

    @Override // com.google.common.collect.N1, java.util.SortedSet
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public final C first() {
        C c12 = (C) this.f359310h.f359265b.i(this.f359586g);
        Objects.requireNonNull(c12);
        return c12;
    }

    public final W<C> q0(B3<C> b32) {
        B3<C> b33 = this.f359310h;
        boolean zF2 = b33.f(b32);
        AbstractC37323e0<C> abstractC37323e0 = this.f359586g;
        return zF2 ? W.f0(b33.e(b32), abstractC37323e0) : new C37335g0(abstractC37323e0);
    }

    @Override // com.google.common.collect.N1, java.util.SortedSet
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final C last() {
        C c12 = (C) this.f359310h.f359266c.f(this.f359586g);
        Objects.requireNonNull(c12);
        return c12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        long jA2 = this.f359586g.a(first(), last());
        if (jA2 >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jA2) + 1;
    }

    @Override // com.google.common.collect.N1, com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
    @XY0.c
    @XY0.d
    public Object writeReplace() {
        return new d(this.f359310h, this.f359586g, null);
    }

    @Override // com.google.common.collect.H1
    public final AbstractC37401r1<C> y() {
        return this.f359586g.f359673b ? new c() : super.y();
    }
}
