package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: Iterators.java */
/* renamed from: com.google.common.collect.g2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37337g2 extends N4<Object> {

    /* renamed from: b, reason: collision with root package name */
    public int f359788b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator[] f359789c;

    public C37337g2(Iterator[] itArr) {
        this.f359789c = itArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f359788b < this.f359789c.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f359788b;
        Iterator[] itArr = this.f359789c;
        Iterator it = itArr[i12];
        Objects.requireNonNull(it);
        int i13 = this.f359788b;
        itArr[i13] = null;
        this.f359788b = i13 + 1;
        return it;
    }
}
