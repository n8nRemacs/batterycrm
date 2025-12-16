package com.google.common.collect;

import com.google.common.collect.W3;
import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: ForwardingNavigableSet.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class R0<E> extends Y0<E> implements NavigableSet<E> {

    /* compiled from: ForwardingNavigableSet.java */
    public class a extends W3.c<E> {
    }

    @Override // java.util.NavigableSet
    @I41.a
    public E ceiling(@InterfaceC37434x3 E e12) {
        return X().ceiling(e12);
    }

    @Override // com.google.common.collect.Y0
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public abstract NavigableSet<E> X();

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return X().descendingIterator();
    }

    public NavigableSet<E> descendingSet() {
        return X().descendingSet();
    }

    @Override // java.util.NavigableSet
    @I41.a
    public E floor(@InterfaceC37434x3 E e12) {
        return X().floor(e12);
    }

    public NavigableSet<E> headSet(@InterfaceC37434x3 E e12, boolean z12) {
        return X().headSet(e12, z12);
    }

    @Override // java.util.NavigableSet
    @I41.a
    public E higher(@InterfaceC37434x3 E e12) {
        return X().higher(e12);
    }

    @Override // java.util.NavigableSet
    @I41.a
    public E lower(@InterfaceC37434x3 E e12) {
        return X().lower(e12);
    }

    @Override // java.util.NavigableSet
    @I41.a
    public E pollFirst() {
        return X().pollFirst();
    }

    @Override // java.util.NavigableSet
    @I41.a
    public E pollLast() {
        return X().pollLast();
    }

    public NavigableSet<E> subSet(@InterfaceC37434x3 E e12, boolean z12, @InterfaceC37434x3 E e13, boolean z13) {
        return X().subSet(e12, z12, e13, z13);
    }

    public NavigableSet<E> tailSet(@InterfaceC37434x3 E e12, boolean z12) {
        return X().tailSet(e12, z12);
    }
}
