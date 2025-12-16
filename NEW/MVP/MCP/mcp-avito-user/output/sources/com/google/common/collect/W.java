package com.google.common.collect;

import com.google.common.collect.Y;
import java.lang.Comparable;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* compiled from: ContiguousSet.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class W<C extends Comparable> extends N1<C> {

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC37323e0<C> f359586g;

    public W(AbstractC37323e0<C> abstractC37323e0) {
        super(C37392p3.f359948d);
        this.f359586g = abstractC37323e0;
    }

    public static <C extends Comparable> W<C> f0(B3<C> b32, AbstractC37323e0<C> abstractC37323e0) {
        b32.getClass();
        abstractC37323e0.getClass();
        try {
            B3<C> b3E = !b32.c() ? b32.e(new B3<>(Y.a(abstractC37323e0.c()), Y.b.f359605c)) : b32;
            if (!b32.d()) {
                b3E = b3E.e(new B3<>(Y.d.f359606c, new Y.c(abstractC37323e0.b())));
            }
            if (!b3E.g()) {
                Comparable comparableI = b32.f359265b.i(abstractC37323e0);
                Objects.requireNonNull(comparableI);
                Comparable comparableF = b32.f359266c.f(abstractC37323e0);
                Objects.requireNonNull(comparableF);
                if (comparableI.compareTo(comparableF) <= 0) {
                    return new F3(b3E, abstractC37323e0);
                }
            }
            return new C37335g0(abstractC37323e0);
        } catch (NoSuchElementException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    @Override // com.google.common.collect.N1
    @XY0.c
    public N1<C> R() {
        return new C37305b0(this);
    }

    @Override // com.google.common.collect.N1
    /* renamed from: V */
    public final N1 headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return Y(comparable, false);
    }

    @Override // com.google.common.collect.N1
    @XY0.c
    /* renamed from: X */
    public final N1 headSet(Object obj, boolean z12) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return Y(comparable, z12);
    }

    @Override // com.google.common.collect.N1
    /* renamed from: Z */
    public final N1 subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        com.google.common.base.M.g(this.f359521e.compare(comparable, comparable2) <= 0);
        return b0(comparable, true, comparable2, false);
    }

    @Override // com.google.common.collect.N1
    @XY0.c
    /* renamed from: a0 */
    public final N1 subSet(Object obj, boolean z12, Object obj2, boolean z13) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        com.google.common.base.M.g(this.f359521e.compare(comparable, comparable2) <= 0);
        return b0(comparable, z12, comparable2, z13);
    }

    @Override // com.google.common.collect.N1
    /* renamed from: c0 */
    public final N1 tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return e0(comparable, true);
    }

    @Override // com.google.common.collect.N1
    @XY0.c
    /* renamed from: d0 */
    public final N1 tailSet(Object obj, boolean z12) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return e0(comparable, z12);
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @XY0.c
    public final NavigableSet headSet(Object obj, boolean z12) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return Y(comparable, z12);
    }

    @Override // com.google.common.collect.N1
    /* renamed from: i0 */
    public abstract W<C> Y(C c12, boolean z12);

    public abstract B3<C> k0();

    @Override // com.google.common.collect.N1
    /* renamed from: m0 */
    public abstract W<C> b0(C c12, boolean z12, C c13, boolean z13);

    @Override // com.google.common.collect.N1
    /* renamed from: o0 */
    public abstract W<C> e0(C c12, boolean z12);

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @XY0.c
    public final NavigableSet subSet(Object obj, boolean z12, Object obj2, boolean z13) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        com.google.common.base.M.g(this.f359521e.compare(comparable, comparable2) <= 0);
        return b0(comparable, z12, comparable2, z13);
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet
    @XY0.c
    public final NavigableSet tailSet(Object obj, boolean z12) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return e0(comparable, z12);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return k0().toString();
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return Y(comparable, false);
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return e0(comparable, true);
    }

    @Override // com.google.common.collect.N1, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        com.google.common.base.M.g(this.f359521e.compare(comparable, comparable2) <= 0);
        return b0(comparable, true, comparable2, false);
    }
}
