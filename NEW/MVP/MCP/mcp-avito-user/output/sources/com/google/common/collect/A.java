package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* compiled from: BiMap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public interface A<K, V> extends Map<K, V> {
    A<V, K> O();

    @Override // java.util.Map
    Set<V> values();
}
