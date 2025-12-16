package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: ForwardingList.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class J0<E> extends B0<E> implements List<E> {
    @Override // java.util.List
    public void add(int i12, @InterfaceC37434x3 E e12) {
        X().add(i12, e12);
    }

    @Override // java.util.List
    @InterfaceC19845a
    public boolean addAll(int i12, Collection<? extends E> collection) {
        return X().addAll(i12, collection);
    }

    @Override // com.google.common.collect.B0
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public abstract List<E> X();

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@I41.a Object obj) {
        return obj == this || X().equals(obj);
    }

    @Override // java.util.List
    @InterfaceC37434x3
    public final E get(int i12) {
        return X().get(i12);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return X().hashCode();
    }

    @Override // java.util.List
    public final int indexOf(@I41.a Object obj) {
        return X().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@I41.a Object obj) {
        return X().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return X().listIterator();
    }

    @Override // java.util.List
    @InterfaceC19845a
    @InterfaceC37434x3
    public final E remove(int i12) {
        return X().remove(i12);
    }

    @Override // java.util.List
    @InterfaceC19845a
    @InterfaceC37434x3
    public final E set(int i12, @InterfaceC37434x3 E e12) {
        return X().set(i12, e12);
    }

    @Override // java.util.List
    public final List<E> subList(int i12, int i13) {
        return X().subList(i12, i13);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i12) {
        return X().listIterator(i12);
    }
}
