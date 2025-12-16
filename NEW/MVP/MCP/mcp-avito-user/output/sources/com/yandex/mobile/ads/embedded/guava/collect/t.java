package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
final class t extends p0<Object> {

    /* renamed from: a, reason: collision with root package name */
    boolean f382808a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f382809b;

    public t(Object obj) {
        this.f382809b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f382808a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f382808a) {
            throw new NoSuchElementException();
        }
        this.f382808a = true;
        return this.f382809b;
    }
}
