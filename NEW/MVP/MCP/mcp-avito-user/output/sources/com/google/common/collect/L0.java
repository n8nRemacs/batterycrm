package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Collection;
import java.util.List;

/* compiled from: ForwardingListMultimap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class L0<K, V> extends O0<K, V> implements InterfaceC37408s2<K, V> {
    @Override // com.google.common.collect.O0
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC37408s2<K, V> X();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final /* bridge */ /* synthetic */ Collection get(@InterfaceC37434x3 Object obj) {
        return get((L0<K, V>) obj);
    }

    @Override // com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    public final List<V> a(@I41.a Object obj) {
        return X().a(obj);
    }

    @Override // com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final List<V> get(@InterfaceC37434x3 K k12) {
        return X().get((InterfaceC37408s2<K, V>) k12);
    }
}
