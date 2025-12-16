package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Iterators.java */
/* renamed from: com.google.common.collect.i2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37349i2 implements Iterator<Object> {

    /* renamed from: b, reason: collision with root package name */
    public int f359799b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    @InterfaceC37434x3
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f359799b++;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw null;
    }
}
