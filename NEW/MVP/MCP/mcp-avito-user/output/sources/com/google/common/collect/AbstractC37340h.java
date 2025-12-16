package com.google.common.collect;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* compiled from: AbstractMapEntry.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37340h<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(@I41.a Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return com.google.common.base.F.a(getKey(), entry.getKey()) && com.google.common.base.F.a(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    @InterfaceC37434x3
    public V setValue(@InterfaceC37434x3 V v12) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
    }
}
