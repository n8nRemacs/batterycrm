package com.google.common.collect;

import java.util.NoSuchElementException;

/* compiled from: AbstractSequentialIterator.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37370m<T> extends N4<T> {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    public T f359827b;

    public AbstractC37370m(@I41.a T t12) {
        this.f359827b = t12;
    }

    @I41.a
    public abstract T a(T t12);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f359827b != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t12 = this.f359827b;
        if (t12 == null) {
            throw new NoSuchElementException();
        }
        this.f359827b = a(t12);
        return t12;
    }
}
