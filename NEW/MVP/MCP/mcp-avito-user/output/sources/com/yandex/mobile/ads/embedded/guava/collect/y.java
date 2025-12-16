package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.embedded.guava.collect.z;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes8.dex */
final class y extends z.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f382816a;

    public y(Comparator comparator) {
        this.f382816a = comparator;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.z.c
    public final <K, V> Map<K, Collection<V>> b() {
        return new TreeMap(this.f382816a);
    }
}
