package com.google.common.collect;

import com.google.common.collect.C37357j4;
import com.google.common.collect.InterfaceC37338g3;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: ForwardingSortedMultiset.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class X0<E> extends P0<E> implements InterfaceC37345h4<E> {

    /* compiled from: ForwardingSortedMultiset.java */
    public abstract class a extends AbstractC37317d0<E> {
        @Override // com.google.common.collect.AbstractC37317d0
        public final InterfaceC37345h4<E> d0() {
            return null;
        }
    }

    /* compiled from: ForwardingSortedMultiset.java */
    public class b extends C37357j4.b<E> {
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> C2(@InterfaceC37434x3 E e12, BoundType boundType, @InterfaceC37434x3 E e13, BoundType boundType2) {
        return X().C2(e12, boundType, e13, boundType2);
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> V5(@InterfaceC37434x3 E e12, BoundType boundType) {
        return X().V5(e12, boundType);
    }

    @Override // com.google.common.collect.P0
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC37345h4<E> X();

    @Override // com.google.common.collect.InterfaceC37345h4, com.google.common.collect.InterfaceC37321d4
    public final Comparator<? super E> comparator() {
        return X().comparator();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> d1() {
        return X().d1();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> firstEntry() {
        return X().firstEntry();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> l1(@InterfaceC37434x3 E e12, BoundType boundType) {
        return X().l1(e12, boundType);
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> lastEntry() {
        return X().lastEntry();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> pollFirstEntry() {
        return X().pollFirstEntry();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public final InterfaceC37338g3.a<E> pollLastEntry() {
        return X().pollLastEntry();
    }

    @Override // com.google.common.collect.P0, com.google.common.collect.InterfaceC37338g3
    public final NavigableSet<E> k() {
        return X().k();
    }
}
