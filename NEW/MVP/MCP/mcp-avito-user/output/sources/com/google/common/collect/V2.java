package com.google.common.collect;

import com.google.common.collect.W2;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: MultimapBuilder.java */
/* loaded from: classes6.dex */
class V2 extends W2.g<Enum<Object>> {
    @Override // com.google.common.collect.W2.g
    public final <K extends Enum<Object>, V> Map<K, Collection<V>> b() {
        return new EnumMap((Class) null);
    }
}
