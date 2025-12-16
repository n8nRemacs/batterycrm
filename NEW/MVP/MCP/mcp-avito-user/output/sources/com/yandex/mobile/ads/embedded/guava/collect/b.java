package com.yandex.mobile.ads.embedded.guava.collect;

import aZ0.InterfaceC19845a;
import com.yandex.mobile.ads.impl.n6;
import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public abstract class b<T> extends p0<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f382709a = 2;

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    private T f382710b;

    @I41.a
    public abstract T a();

    @I41.a
    @InterfaceC19845a
    public final void b() {
        this.f382709a = 3;
    }

    @Override // java.util.Iterator
    @InterfaceC19845a
    public final boolean hasNext() {
        int i12 = this.f382709a;
        if (i12 == 4) {
            throw new IllegalStateException();
        }
        int iA2 = n6.a(i12);
        if (iA2 == 0) {
            return true;
        }
        if (iA2 == 2) {
            return false;
        }
        this.f382709a = 4;
        this.f382710b = a();
        if (this.f382709a == 3) {
            return false;
        }
        this.f382709a = 1;
        return true;
    }

    @Override // java.util.Iterator
    @InterfaceC19845a
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f382709a = 2;
        T t12 = this.f382710b;
        this.f382710b = null;
        return t12;
    }
}
