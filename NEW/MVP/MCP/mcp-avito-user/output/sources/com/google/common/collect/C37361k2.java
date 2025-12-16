package com.google.common.collect;

import java.util.NoSuchElementException;

/* compiled from: Iterators.java */
/* renamed from: com.google.common.collect.k2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37361k2 extends N4<Object> {

    /* renamed from: b, reason: collision with root package name */
    public boolean f359810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f359811c;

    public C37361k2(Object obj) {
        this.f359811c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f359810b;
    }

    @Override // java.util.Iterator
    @InterfaceC37434x3
    public final Object next() {
        if (this.f359810b) {
            throw new NoSuchElementException();
        }
        this.f359810b = true;
        return this.f359811c;
    }
}
