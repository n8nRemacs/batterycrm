package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: SetMultimap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public interface T3<K, V> extends R2<K, V> {
    @Override // 
    @InterfaceC19845a
    Set<V> a(@I41.a Object obj);

    @Override // 
    Set<Map.Entry<K, V>> b();

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Collection get(@InterfaceC37434x3 Object obj) {
        return get((T3<K, V>) obj);
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    Set<V> get(@InterfaceC37434x3 K k12);
}
