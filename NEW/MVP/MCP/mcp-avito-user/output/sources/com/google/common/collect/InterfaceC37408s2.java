package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Collection;
import java.util.List;

/* compiled from: ListMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.s2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC37408s2<K, V> extends R2<K, V> {
    @Override // com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    List<V> a(@I41.a Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    /* bridge */ /* synthetic */ default Collection get(@InterfaceC37434x3 Object obj) {
        return get((InterfaceC37408s2<K, V>) obj);
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    List<V> get(@InterfaceC37434x3 K k12);
}
