package com.google.common.collect;

import bZ0.InterfaceC25601b;
import com.google.common.collect.C37374m3;
import com.google.common.collect.InterfaceC37338g3;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: UnmodifiableSortedMultiset.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class P4<E> extends C37374m3.h<E> implements InterfaceC37345h4<E> {
    private static final long serialVersionUID = 0;

    /* renamed from: e, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient P4<E> f359544e;

    public P4() {
        throw null;
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> C2(@InterfaceC37434x3 E e12, BoundType boundType, @InterfaceC37434x3 E e13, BoundType boundType2) {
        InterfaceC37345h4<E> interfaceC37345h4C2 = this.f359861b.C2(e12, boundType, e13, boundType2);
        interfaceC37345h4C2.getClass();
        return new P4(interfaceC37345h4C2);
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> V5(@InterfaceC37434x3 E e12, BoundType boundType) {
        InterfaceC37345h4<E> interfaceC37345h4V5 = this.f359861b.V5(e12, boundType);
        interfaceC37345h4V5.getClass();
        return new P4(interfaceC37345h4V5);
    }

    @Override // com.google.common.collect.C37374m3.h, com.google.common.collect.P0, com.google.common.collect.B0, com.google.common.collect.S0
    public final Object X() {
        return this.f359861b;
    }

    @Override // com.google.common.collect.C37374m3.h, com.google.common.collect.P0, com.google.common.collect.B0
    /* renamed from: Y */
    public final Collection X() {
        return this.f359861b;
    }

    @Override // com.google.common.collect.C37374m3.h, com.google.common.collect.P0
    /* renamed from: b0 */
    public final InterfaceC37338g3 X() {
        return this.f359861b;
    }

    @Override // com.google.common.collect.C37374m3.h
    public final Set c0() {
        return W3.j(this.f359861b.k());
    }

    @Override // com.google.common.collect.InterfaceC37345h4, com.google.common.collect.InterfaceC37321d4
    public final Comparator<? super E> comparator() {
        return this.f359861b.comparator();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> d1() {
        P4<E> p42 = this.f359544e;
        if (p42 != null) {
            return p42;
        }
        P4<E> p43 = new P4<>(this.f359861b.d1());
        p43.f359544e = this;
        this.f359544e = p43;
        return p43;
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> firstEntry() {
        return this.f359861b.firstEntry();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> l1(@InterfaceC37434x3 E e12, BoundType boundType) {
        InterfaceC37345h4<E> interfaceC37345h4L1 = this.f359861b.l1(e12, boundType);
        interfaceC37345h4L1.getClass();
        return new P4(interfaceC37345h4L1);
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> lastEntry() {
        return this.f359861b.lastEntry();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.C37374m3.h, com.google.common.collect.P0, com.google.common.collect.InterfaceC37338g3
    public final NavigableSet<E> k() {
        return (NavigableSet) super.k();
    }
}
