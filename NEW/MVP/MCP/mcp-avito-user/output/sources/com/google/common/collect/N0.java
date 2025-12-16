package com.google.common.collect;

import java.util.Map;

/* compiled from: ForwardingMapEntry.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class N0<K, V> extends S0 implements Map.Entry<K, V> {
    @Override // com.google.common.collect.S0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public abstract Map.Entry<K, V> X();

    @Override // java.util.Map.Entry
    public boolean equals(@I41.a Object obj) {
        return X().equals(obj);
    }

    @Override // java.util.Map.Entry
    @InterfaceC37434x3
    public final K getKey() {
        return X().getKey();
    }

    @Override // java.util.Map.Entry
    @InterfaceC37434x3
    public V getValue() {
        return X().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return X().hashCode();
    }

    @Override // java.util.Map.Entry
    @InterfaceC37434x3
    public V setValue(@InterfaceC37434x3 V v12) {
        return X().setValue(v12);
    }
}
