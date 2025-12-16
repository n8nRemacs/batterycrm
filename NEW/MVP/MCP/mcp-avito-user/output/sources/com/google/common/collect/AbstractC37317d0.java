package com.google.common.collect;

import bZ0.InterfaceC25601b;
import com.google.common.collect.C37357j4;
import com.google.common.collect.InterfaceC37338g3;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: DescendingMultiset.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37317d0<E> extends P0<E> implements InterfaceC37345h4<E> {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient AbstractC37429w3 f359669b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient NavigableSet<E> f359670c;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<InterfaceC37338g3.a<E>> f359671d;

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> C2(@InterfaceC37434x3 E e12, BoundType boundType, @InterfaceC37434x3 E e13, BoundType boundType2) {
        return d0().C2(e13, boundType2, e12, boundType).d1();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> V5(@InterfaceC37434x3 E e12, BoundType boundType) {
        return ((E4) d0()).l1(e12, boundType).d1();
    }

    @Override // com.google.common.collect.P0, com.google.common.collect.B0, com.google.common.collect.S0
    public final Object X() {
        return d0();
    }

    @Override // com.google.common.collect.P0, com.google.common.collect.B0
    /* renamed from: Y */
    public final Collection X() {
        return d0();
    }

    @Override // com.google.common.collect.P0
    /* renamed from: b0 */
    public final InterfaceC37338g3<E> X() {
        return d0();
    }

    public abstract Iterator<InterfaceC37338g3.a<E>> c0();

    @Override // com.google.common.collect.InterfaceC37345h4, com.google.common.collect.InterfaceC37321d4
    public final Comparator<? super E> comparator() {
        AbstractC37429w3 abstractC37429w3 = this.f359669b;
        if (abstractC37429w3 != null) {
            return abstractC37429w3;
        }
        AbstractC37429w3 abstractC37429w3H = AbstractC37429w3.b(d0().comparator()).h();
        this.f359669b = abstractC37429w3H;
        return abstractC37429w3H;
    }

    public abstract InterfaceC37345h4<E> d0();

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> d1() {
        return d0();
    }

    @Override // com.google.common.collect.P0, com.google.common.collect.InterfaceC37338g3
    public final Set<InterfaceC37338g3.a<E>> entrySet() {
        Set<InterfaceC37338g3.a<E>> set = this.f359671d;
        if (set != null) {
            return set;
        }
        C37311c0 c37311c0 = new C37311c0(this);
        this.f359671d = c37311c0;
        return c37311c0;
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> firstEntry() {
        return d0().lastEntry();
    }

    @Override // com.google.common.collect.B0, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return C37374m3.c(this);
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> l1(@InterfaceC37434x3 E e12, BoundType boundType) {
        return ((E4) d0()).V5(e12, boundType).d1();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> lastEntry() {
        return d0().firstEntry();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> pollFirstEntry() {
        return d0().pollLastEntry();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> pollLastEntry() {
        return d0().pollFirstEntry();
    }

    @Override // com.google.common.collect.B0, java.util.Collection
    public final Object[] toArray() {
        return Z();
    }

    @Override // com.google.common.collect.S0
    public final String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.B0, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C37414t3.c(this, tArr);
    }

    @Override // com.google.common.collect.P0, com.google.common.collect.InterfaceC37338g3
    public final NavigableSet<E> k() {
        NavigableSet<E> navigableSet = this.f359670c;
        if (navigableSet != null) {
            return navigableSet;
        }
        C37357j4.b bVar = new C37357j4.b(this);
        this.f359670c = bVar;
        return bVar;
    }
}
