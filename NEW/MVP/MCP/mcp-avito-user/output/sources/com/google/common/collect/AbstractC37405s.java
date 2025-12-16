package com.google.common.collect;

import bZ0.InterfaceC25601b;
import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.t4;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: AbstractTable.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37405s<R, C, V> implements t4<R, C, V> {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<t4.a<R, C, V>> f359989b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Collection<V> f359990c;

    /* compiled from: AbstractTable.java */
    /* renamed from: com.google.common.collect.s$a */
    public class a extends z4<t4.a<R, C, V>, V> {
        @Override // com.google.common.collect.z4
        @InterfaceC37434x3
        public final Object a(Object obj) {
            return ((t4.a) obj).getValue();
        }
    }

    /* compiled from: AbstractTable.java */
    /* renamed from: com.google.common.collect.s$b */
    public class b extends AbstractSet<t4.a<R, C, V>> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractC37405s.this.b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof t4.a)) {
                return false;
            }
            t4.a aVar = (t4.a) obj;
            Map map = (Map) M2.j(AbstractC37405s.this.d(), aVar.b());
            if (map != null) {
                return G.c(new C37384o1(aVar.a(), aVar.getValue()), map.entrySet());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<t4.a<R, C, V>> iterator() {
            return AbstractC37405s.this.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            boolean zRemove;
            if (!(obj instanceof t4.a)) {
                return false;
            }
            t4.a aVar = (t4.a) obj;
            Map map = (Map) M2.j(AbstractC37405s.this.d(), aVar.b());
            if (map == null) {
                return false;
            }
            Set setEntrySet = map.entrySet();
            C37384o1 c37384o1 = new C37384o1(aVar.a(), aVar.getValue());
            Set set = setEntrySet;
            set.getClass();
            try {
                zRemove = set.remove(c37384o1);
            } catch (ClassCastException | NullPointerException unused) {
                zRemove = false;
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AbstractC37405s.this.size();
        }
    }

    /* compiled from: AbstractTable.java */
    /* renamed from: com.google.common.collect.s$c */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AbstractC37405s.this.b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            return AbstractC37405s.this.c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return AbstractC37405s.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return AbstractC37405s.this.size();
        }
    }

    @Override // com.google.common.collect.t4
    public Set<t4.a<R, C, V>> U() {
        Set<t4.a<R, C, V>> set = this.f359989b;
        if (set != null) {
            return set;
        }
        Set<t4.a<R, C, V>> setE = e();
        this.f359989b = setE;
        return setE;
    }

    public abstract Iterator<t4.a<R, C, V>> a();

    public void b() {
        C37325e2.b(U().iterator());
    }

    public boolean c(@I41.a Object obj) {
        Iterator<Map<C, V>> it = d().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Set<t4.a<R, C, V>> e() {
        return new b();
    }

    @Override // com.google.common.collect.t4
    public boolean equals(@I41.a Object obj) {
        InterfaceC37276u<? extends Map<?, ?>, ? extends Map<?, ?>> interfaceC37276u = v4.f360041a;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t4) {
            return U().equals(((t4) obj).U());
        }
        return false;
    }

    public Collection<V> f() {
        return new c();
    }

    public Collection<V> g() {
        Collection<V> collection = this.f359990c;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionF = f();
        this.f359990c = collectionF;
        return collectionF;
    }

    public Iterator<V> h() {
        return new a(U().iterator());
    }

    @Override // com.google.common.collect.t4
    public int hashCode() {
        return U().hashCode();
    }

    public String toString() {
        return d().toString();
    }
}
