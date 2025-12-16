package com.google.common.collect;

import java.util.ListIterator;

/* compiled from: TransformedListIterator.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
abstract class A4<F, T> extends z4<F, T> implements ListIterator<T> {
    public A4() {
        throw null;
    }

    @Override // java.util.ListIterator
    public final void add(@InterfaceC37434x3 T t12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f360154b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f360154b).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    @InterfaceC37434x3
    public final T previous() {
        return (T) a(((ListIterator) this.f360154b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f360154b).previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@InterfaceC37434x3 T t12) {
        throw new UnsupportedOperationException();
    }
}
