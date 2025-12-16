package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.concurrent.ConcurrentMap;

/* compiled from: ForwardingConcurrentMap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class C0<K, V> extends M0<K, V> implements ConcurrentMap<K, V> {
    @Override // com.google.common.collect.M0
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public abstract ConcurrentMap<K, V> X();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @I41.a
    @InterfaceC19845a
    public final V putIfAbsent(K k12, V v12) {
        return X().putIfAbsent(k12, v12);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC19845a
    public final boolean remove(@I41.a Object obj, @I41.a Object obj2) {
        return X().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @I41.a
    @InterfaceC19845a
    public final V replace(K k12, V v12) {
        return X().replace(k12, v12);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC19845a
    public final boolean replace(K k12, V v12, V v13) {
        return X().replace(k12, v12, v13);
    }
}
