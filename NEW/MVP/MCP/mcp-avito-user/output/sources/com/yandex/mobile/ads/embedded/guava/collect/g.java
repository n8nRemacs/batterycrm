package com.yandex.mobile.ads.embedded.guava.collect;

import bZ0.InterfaceC25601b;
import com.yandex.mobile.ads.impl.ej0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
abstract class g<K, V> implements ej0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    private transient Set<K> f382748a;

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    private transient Collection<V> f382749b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    private transient Map<K, Collection<V>> f382750c;

    public class a extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f382751a;

        public a(e eVar) {
            this.f382751a = eVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((e) this.f382751a).d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            Iterator<Collection<V>> it = this.f382751a.a().values().iterator();
            while (it.hasNext()) {
                if (it.next().contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            e eVar = (e) this.f382751a;
            eVar.getClass();
            return new d(eVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((e) this.f382751a).g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ej0
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f382750c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapE = ((b0) this).e();
        this.f382750c = mapE;
        return mapE;
    }

    public final Set<K> b() {
        Set<K> set = this.f382748a;
        if (set != null) {
            return set;
        }
        Set<K> setF = ((b0) this).f();
        this.f382748a = setF;
        return setF;
    }

    public boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ej0) {
            return ((c) this).a().equals(((ej0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }

    @Override // com.yandex.mobile.ads.impl.ej0
    public Collection<V> values() {
        Collection<V> collection = this.f382749b;
        if (collection != null) {
            return collection;
        }
        a aVar = new a((e) this);
        this.f382749b = aVar;
        return aVar;
    }
}
