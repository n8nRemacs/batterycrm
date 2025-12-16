package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.common.collect.C37326e3;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37346i<K, V> implements R2<K, V> {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Collection<Map.Entry<K, V>> f359791b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<K> f359792c;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient InterfaceC37338g3<K> f359793d;

    /* renamed from: e, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Collection<V> f359794e;

    /* renamed from: f, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Map<K, Collection<V>> f359795f;

    /* compiled from: AbstractMultimap.java */
    /* renamed from: com.google.common.collect.i$a */
    public class a extends C37326e3.f<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.C37326e3.f
        public final R2<K, V> b() {
            return AbstractC37346i.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC37346i.this.i();
        }
    }

    /* compiled from: AbstractMultimap.java */
    /* renamed from: com.google.common.collect.i$b */
    public class b extends AbstractC37346i<K, V>.a implements Set<Map.Entry<K, V>> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@I41.a Object obj) {
            return W3.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return W3.e(this);
        }
    }

    /* compiled from: AbstractMultimap.java */
    /* renamed from: com.google.common.collect.i$c */
    public class c extends AbstractCollection<V> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC37328f f359797b;

        public c(AbstractC37328f abstractC37328f) {
            this.f359797b = abstractC37328f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f359797b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            return this.f359797b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return this.f359797b.r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f359797b.size();
        }
    }

    @Override // com.google.common.collect.R2
    public InterfaceC37338g3<K> Q() {
        InterfaceC37338g3<K> interfaceC37338g3 = this.f359793d;
        if (interfaceC37338g3 != null) {
            return interfaceC37338g3;
        }
        InterfaceC37338g3<K> interfaceC37338g3F = f();
        this.f359793d = interfaceC37338g3F;
        return interfaceC37338g3F;
    }

    @Override // com.google.common.collect.R2
    public boolean R(@I41.a Object obj, @I41.a Object obj2) {
        Collection<V> collection = V().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.common.collect.R2
    public Map<K, Collection<V>> V() {
        Map<K, Collection<V>> map = this.f359795f;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapC = c();
        this.f359795f = mapC;
        return mapC;
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3
    public Collection<Map.Entry<K, V>> b() {
        Collection<Map.Entry<K, V>> collection = this.f359791b;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionD = d();
        this.f359791b = collectionD;
        return collectionD;
    }

    public abstract Map<K, Collection<V>> c();

    @Override // com.google.common.collect.R2
    public boolean containsValue(@I41.a Object obj) {
        Iterator<Collection<V>> it = V().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Collection<Map.Entry<K, V>> d();

    public abstract Set<K> e();

    @Override // com.google.common.collect.R2
    public boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof R2) {
            return V().equals(((R2) obj).V());
        }
        return false;
    }

    public abstract InterfaceC37338g3<K> f();

    public abstract Collection<V> g();

    @Override // com.google.common.collect.R2
    public int hashCode() {
        return V().hashCode();
    }

    public abstract Iterator<Map.Entry<K, V>> i();

    @Override // com.google.common.collect.R2
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.R2
    public Set<K> keySet() {
        Set<K> set = this.f359792c;
        if (set != null) {
            return set;
        }
        Set<K> setE = e();
        this.f359792c = setE;
        return setE;
    }

    @Override // com.google.common.collect.R2
    @InterfaceC19845a
    public boolean put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
        return get(k12).add(v12);
    }

    @Override // com.google.common.collect.R2
    @InterfaceC19845a
    public boolean remove(@I41.a Object obj, @I41.a Object obj2) {
        Collection<V> collection = V().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return V().toString();
    }

    @Override // com.google.common.collect.R2
    public Collection<V> values() {
        Collection<V> collection = this.f359794e;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionG = g();
        this.f359794e = collectionG;
        return collectionG;
    }
}
