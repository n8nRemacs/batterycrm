package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.C36729v;
import j.N;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class c<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final b f349281b;

    /* renamed from: c, reason: collision with root package name */
    public int f349282c;

    public c(@N b bVar) {
        C36729v.j(bVar);
        this.f349281b = bVar;
        this.f349282c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f349282c < this.f349281b.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @N
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException(AK.c.g(this.f349282c, "Cannot advance the iterator beyond "));
        }
        int i12 = this.f349282c + 1;
        this.f349282c = i12;
        return this.f349281b.get(i12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
