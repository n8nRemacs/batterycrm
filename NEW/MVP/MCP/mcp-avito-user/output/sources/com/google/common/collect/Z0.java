package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: ForwardingSortedSetMultimap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class Z0<K, V> extends V0<K, V> implements InterfaceC37363k4<K, V> {
    @Override // com.google.common.collect.V0
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC37363k4<K, V> X();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.V0, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final /* bridge */ /* synthetic */ Collection get(@InterfaceC37434x3 Object obj) {
        return get((Z0<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.V0, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final /* bridge */ /* synthetic */ Set get(@InterfaceC37434x3 Object obj) {
        return get((Z0<K, V>) obj);
    }

    @Override // com.google.common.collect.V0, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
    public final SortedSet<V> a(@I41.a Object obj) {
        return X().a(obj);
    }

    @Override // com.google.common.collect.V0, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final SortedSet<V> get(@InterfaceC37434x3 K k12) {
        return X().get((InterfaceC37363k4<K, V>) k12);
    }
}
