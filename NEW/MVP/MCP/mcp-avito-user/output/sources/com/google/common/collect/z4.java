package com.google.common.collect;

import java.util.Iterator;

/* compiled from: TransformedIterator.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
abstract class z4<F, T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator<? extends F> f360154b;

    public z4(Iterator<? extends F> it) {
        it.getClass();
        this.f360154b = it;
    }

    @InterfaceC37434x3
    public abstract T a(@InterfaceC37434x3 F f12);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f360154b.hasNext();
    }

    @Override // java.util.Iterator
    @InterfaceC37434x3
    public final T next() {
        return a(this.f360154b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f360154b.remove();
    }
}
