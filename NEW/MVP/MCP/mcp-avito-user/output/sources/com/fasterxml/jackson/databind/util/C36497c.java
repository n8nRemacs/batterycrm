package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.java */
/* renamed from: com.fasterxml.jackson.databind.util.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36497c<T> implements Iterator<T>, Iterable<T> {

    /* renamed from: b, reason: collision with root package name */
    public final T[] f342592b;

    /* renamed from: c, reason: collision with root package name */
    public int f342593c = 0;

    public C36497c(T[] tArr) {
        this.f342592b = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f342593c < this.f342592b.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i12 = this.f342593c;
        T[] tArr = this.f342592b;
        if (i12 >= tArr.length) {
            throw new NoSuchElementException();
        }
        this.f342593c = i12 + 1;
        return tArr[i12];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return this;
    }
}
