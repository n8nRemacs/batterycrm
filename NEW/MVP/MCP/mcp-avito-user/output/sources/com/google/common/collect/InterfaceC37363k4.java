package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: SortedSetMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.k4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC37363k4<K, V> extends T3<K, V> {
    @Override // com.google.common.collect.T3, com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    SortedSet<V> a(@I41.a Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Collection get(@InterfaceC37434x3 Object obj) {
        return get((InterfaceC37363k4<K, V>) obj);
    }

    @Override // com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    SortedSet<V> get(@InterfaceC37434x3 K k12);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.T3, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    /* bridge */ /* synthetic */ default Set get(@InterfaceC37434x3 Object obj) {
        return get((InterfaceC37363k4<K, V>) obj);
    }
}
