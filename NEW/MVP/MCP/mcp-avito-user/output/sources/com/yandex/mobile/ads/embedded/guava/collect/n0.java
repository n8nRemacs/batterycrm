package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.iu0;

/* loaded from: classes8.dex */
final class n0<E> extends r<E> {

    /* renamed from: c, reason: collision with root package name */
    final transient E f382786c;

    public n0(E e12) {
        this.f382786c = (E) iu0.a(e12);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int a(int i12, Object[] objArr) {
        objArr[i12] = this.f382786c;
        return i12 + 1;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n
    public final p<E> b() {
        return p.a(this.f382786c);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@I41.a Object obj) {
        return this.f382786c.equals(obj);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final boolean f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public final p0<E> iterator() {
        return new t(this.f382786c);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f382786c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f382786c.toString() + ']';
    }
}
