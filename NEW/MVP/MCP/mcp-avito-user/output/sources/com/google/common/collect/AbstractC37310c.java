package com.google.common.collect;

import java.util.NoSuchElementException;

/* compiled from: AbstractIndexedListIterator.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37310c<E> extends O4<E> {

    /* renamed from: b, reason: collision with root package name */
    public final int f359655b;

    /* renamed from: c, reason: collision with root package name */
    public int f359656c;

    public AbstractC37310c(int i12, int i13) {
        com.google.common.base.M.k(i13, i12);
        this.f359655b = i12;
        this.f359656c = i13;
    }

    @InterfaceC37434x3
    public abstract E a(int i12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f359656c < this.f359655b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f359656c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @InterfaceC37434x3
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f359656c;
        this.f359656c = i12 + 1;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f359656c;
    }

    @Override // java.util.ListIterator
    @InterfaceC37434x3
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f359656c - 1;
        this.f359656c = i12;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f359656c - 1;
    }
}
