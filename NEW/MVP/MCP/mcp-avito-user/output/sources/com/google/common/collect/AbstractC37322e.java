package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: AbstractListMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37322e<K, V> extends AbstractC37328f<K, V> implements InterfaceC37408s2<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractC37322e() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final /* bridge */ /* synthetic */ Collection get(@InterfaceC37434x3 Object obj) {
        return get((AbstractC37322e<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractC37328f
    public final Collection o() {
        return Collections.emptyList();
    }

    @Override // com.google.common.collect.AbstractC37328f
    public final <E> Collection<E> q(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.AbstractC37328f
    public final Collection<V> s(@InterfaceC37434x3 K k12, Collection<V> collection) {
        return t(k12, (List) collection, null);
    }

    @Override // com.google.common.collect.AbstractC37328f
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public abstract List<V> k();

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    public List<V> a(@I41.a Object obj) {
        return (List) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public List<V> get(@InterfaceC37434x3 K k12) {
        return (List) super.get((AbstractC37322e<K, V>) k12);
    }
}
