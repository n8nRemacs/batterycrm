package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.M2;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: FilteredKeyMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.s0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37406s0<K, V> extends AbstractC37346i<K, V> implements InterfaceC37416u0<K, V> {

    /* compiled from: FilteredKeyMultimap.java */
    /* renamed from: com.google.common.collect.s0$a */
    public static class a<K, V> extends J0<V> {
        public a() {
            throw null;
        }

        @Override // com.google.common.collect.J0, com.google.common.collect.B0, com.google.common.collect.S0
        public final Object X() {
            return Collections.emptyList();
        }

        @Override // com.google.common.collect.J0, com.google.common.collect.B0
        /* renamed from: Y */
        public final Collection X() {
            return Collections.emptyList();
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean add(@InterfaceC37434x3 V v12) {
            add(0, v12);
            throw null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            throw null;
        }

        @Override // com.google.common.collect.J0
        /* renamed from: b0 */
        public final List<V> X() {
            return Collections.emptyList();
        }

        @Override // com.google.common.collect.J0, java.util.List
        public final void add(int i12, @InterfaceC37434x3 V v12) {
            com.google.common.base.M.k(i12, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: null");
        }

        @Override // com.google.common.collect.J0, java.util.List
        @InterfaceC19845a
        public final boolean addAll(int i12, Collection<? extends V> collection) {
            collection.getClass();
            com.google.common.base.M.k(i12, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: null");
        }
    }

    /* compiled from: FilteredKeyMultimap.java */
    /* renamed from: com.google.common.collect.s0$b */
    public static class b<K, V> extends U0<V> {
        public b() {
            throw null;
        }

        @Override // com.google.common.collect.U0, com.google.common.collect.B0, com.google.common.collect.S0
        public final Object X() {
            return Collections.emptySet();
        }

        @Override // com.google.common.collect.U0, com.google.common.collect.B0
        /* renamed from: Y */
        public final Collection X() {
            return Collections.emptySet();
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean add(@InterfaceC37434x3 V v12) {
            throw new IllegalArgumentException("Key does not satisfy predicate: null");
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            collection.getClass();
            throw new IllegalArgumentException("Key does not satisfy predicate: null");
        }

        @Override // com.google.common.collect.U0
        /* renamed from: b0 */
        public final Set<V> X() {
            return Collections.emptySet();
        }
    }

    /* compiled from: FilteredKeyMultimap.java */
    /* renamed from: com.google.common.collect.s0$c */
    public class c extends B0<Map.Entry<K, V>> {
        public c() {
        }

        @Override // com.google.common.collect.B0, com.google.common.collect.S0
        public final /* bridge */ /* synthetic */ Object X() {
            X();
            throw null;
        }

        @Override // com.google.common.collect.B0
        /* renamed from: Y */
        public final Collection<Map.Entry<K, V>> X() {
            C37406s0.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean remove(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            C37406s0.this.getClass();
            ((Map.Entry) obj).getKey();
            throw null;
        }
    }

    @Override // com.google.common.collect.InterfaceC37416u0
    public final com.google.common.base.N<? super Map.Entry<K, V>> T() {
        return com.google.common.base.O.d(null, M2.EnumC37297e.f359488b);
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3
    public Collection<V> a(@I41.a Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Map<K, Collection<V>> c() {
        throw null;
    }

    @Override // com.google.common.collect.R2
    public final void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.R2
    public final boolean containsKey(@I41.a Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37346i
    public Collection<Map.Entry<K, V>> d() {
        return new c();
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Set<K> e() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final InterfaceC37338g3<K> f() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Collection<V> g() {
        return new C37421v0(this);
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public Collection<V> get(@InterfaceC37434x3 K k12) {
        throw null;
    }

    public R2<K, V> h() {
        return null;
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Iterator<Map.Entry<K, V>> i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.R2
    public final int size() {
        Iterator<Collection<V>> it = V().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }
}
