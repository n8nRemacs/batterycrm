package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: ImmutableMapKeySet.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.w1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37427w1<K, V> extends Q1<K> {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC37412t1<K, V> f360053e;

    /* compiled from: ImmutableMapKeySet.java */
    @XY0.d
    @XY0.c
    /* renamed from: com.google.common.collect.w1$a */
    public static class a<K> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37412t1<K, ?> f360054b;

        public a(AbstractC37412t1<K, ?> abstractC37412t1) {
            this.f360054b = abstractC37412t1;
        }

        public Object readResolve() {
            return this.f360054b.keySet();
        }
    }

    public C37427w1(AbstractC37412t1<K, V> abstractC37412t1) {
        this.f360053e = abstractC37412t1;
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        return this.f360053e.containsKey(obj);
    }

    @Override // com.google.common.collect.Q1
    public final K get(int i12) {
        return this.f360053e.entrySet().b().get(i12).getKey();
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return true;
    }

    @Override // com.google.common.collect.Q1, com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f360053e.l();
    }

    @Override // com.google.common.collect.Q1, com.google.common.collect.AbstractC37378n1
    /* renamed from: l */
    public final N4<K> iterator() {
        return this.f360053e.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f360053e.size();
    }

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
    @XY0.c
    public Object writeReplace() {
        return new a(this.f360053e);
    }
}
