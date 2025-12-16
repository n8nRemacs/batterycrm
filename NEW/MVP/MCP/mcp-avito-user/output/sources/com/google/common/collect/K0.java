package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.ListIterator;

/* compiled from: ForwardingListIterator.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class K0<E> extends I0<E> implements ListIterator<E> {
    @Override // com.google.common.collect.I0
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public abstract ListIterator<E> X();

    @Override // java.util.ListIterator
    public final void add(@InterfaceC37434x3 E e12) {
        X().add(e12);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return X().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return X().nextIndex();
    }

    @Override // java.util.ListIterator
    @InterfaceC19845a
    @InterfaceC37434x3
    public final E previous() {
        return X().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return X().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(@InterfaceC37434x3 E e12) {
        X().set(e12);
    }
}
