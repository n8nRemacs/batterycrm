package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: ForwardingSortedSet.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class Y0<E> extends U0<E> implements SortedSet<E> {
    @Override // com.google.common.collect.U0
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public abstract SortedSet<E> X();

    @I41.a
    public Comparator<? super E> comparator() {
        return X().comparator();
    }

    @InterfaceC37434x3
    public E first() {
        return X().first();
    }

    public SortedSet<E> headSet(@InterfaceC37434x3 E e12) {
        return X().headSet(e12);
    }

    @InterfaceC37434x3
    public E last() {
        return X().last();
    }

    public SortedSet<E> subSet(@InterfaceC37434x3 E e12, @InterfaceC37434x3 E e13) {
        return X().subSet(e12, e13);
    }

    public SortedSet<E> tailSet(@InterfaceC37434x3 E e12) {
        return X().tailSet(e12);
    }
}
