package com.yandex.mobile.ads.embedded.guava.collect;

import java.io.Serializable;

/* loaded from: classes8.dex */
final class o<K, V> extends f<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final K f382787a;

    /* renamed from: b, reason: collision with root package name */
    final V f382788b;

    public o(K k12, V v12) {
        this.f382787a = k12;
        this.f382788b = v12;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.f, java.util.Map.Entry
    public final K getKey() {
        return this.f382787a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.f, java.util.Map.Entry
    public final V getValue() {
        return this.f382788b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v12) {
        throw new UnsupportedOperationException();
    }
}
