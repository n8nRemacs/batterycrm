package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.iu0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
abstract class o0<F, T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f382789a;

    public o0(Iterator<? extends F> it) {
        this.f382789a = (Iterator) iu0.a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f382789a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f382789a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f382789a.remove();
    }
}
