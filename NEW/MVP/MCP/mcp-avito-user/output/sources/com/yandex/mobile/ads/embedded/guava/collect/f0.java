package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.iu0;
import java.util.Objects;

/* loaded from: classes8.dex */
final class f0<E> extends p<E> {

    /* renamed from: f, reason: collision with root package name */
    static final p<Object> f382745f = new f0(0, new Object[0]);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f382746d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f382747e;

    public f0(int i12, Object[] objArr) {
        this.f382746d = objArr;
        this.f382747e = i12;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.p, com.yandex.mobile.ads.embedded.guava.collect.n
    public final int a(int i12, Object[] objArr) {
        System.arraycopy(this.f382746d, 0, objArr, i12, this.f382747e);
        return i12 + this.f382747e;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final Object[] c() {
        return this.f382746d;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int d() {
        return this.f382747e;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int e() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final E get(int i12) {
        iu0.a(i12, this.f382747e);
        E e12 = (E) this.f382746d[i12];
        Objects.requireNonNull(e12);
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f382747e;
    }
}
