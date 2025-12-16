package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.iu0;
import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
abstract class a<E> extends q0<E> {

    /* renamed from: a, reason: collision with root package name */
    private final int f382705a;

    /* renamed from: b, reason: collision with root package name */
    private int f382706b;

    public a(int i12, int i13) {
        iu0.b(i13, i12);
        this.f382705a = i12;
        this.f382706b = i13;
    }

    public abstract E a(int i12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f382706b < this.f382705a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f382706b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f382706b;
        this.f382706b = i12 + 1;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f382706b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f382706b - 1;
        this.f382706b = i12;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f382706b - 1;
    }
}
