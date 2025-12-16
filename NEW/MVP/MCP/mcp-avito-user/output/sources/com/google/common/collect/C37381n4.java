package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.AbstractC37316d;
import com.google.common.collect.C37318d1;
import com.google.common.collect.C37325e2;
import com.google.common.collect.M2;
import com.google.common.collect.W3;
import com.google.common.collect.t4;
import com.google.common.collect.v4;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: StandardTable.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.n4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37381n4<R, C, V> extends AbstractC37405s<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC37312c1
    public final Map<R, Map<C, V>> f359870d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC37312c1
    public final com.google.common.base.e0<? extends Map<C, V>> f359871e;

    /* renamed from: f, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<C> f359872f;

    /* renamed from: g, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Map<R, Map<C, V>> f359873g;

    /* compiled from: StandardTable.java */
    /* renamed from: com.google.common.collect.n4$b */
    public class b implements Iterator<t4.a<R, C, V>> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<R, Map<C, V>>> f359874b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public Map.Entry<R, Map<C, V>> f359875c;

        /* renamed from: d, reason: collision with root package name */
        public Iterator<Map.Entry<C, V>> f359876d = C37325e2.f.f359715b;

        public b(C37381n4 c37381n4, a aVar) {
            this.f359874b = c37381n4.f359870d.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359874b.hasNext() || this.f359876d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f359876d.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f359874b.next();
                this.f359875c = next;
                this.f359876d = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f359875c);
            Map.Entry<C, V> next2 = this.f359876d.next();
            R key = this.f359875c.getKey();
            C key2 = next2.getKey();
            V value = next2.getValue();
            InterfaceC37276u<? extends Map<?, ?>, ? extends Map<?, ?>> interfaceC37276u = v4.f360041a;
            return new v4.c(key, key2, value);
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f359876d.remove();
            Map.Entry<R, Map<C, V>> entry = this.f359875c;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.f359874b.remove();
                this.f359875c = null;
            }
        }
    }

    /* compiled from: StandardTable.java */
    /* renamed from: com.google.common.collect.n4$c */
    public class c extends M2.E<R, V> {

        /* renamed from: e, reason: collision with root package name */
        public final C f359877e;

        /* compiled from: StandardTable.java */
        /* renamed from: com.google.common.collect.n4$c$a */
        public class a extends W3.g<Map.Entry<R, V>> {
            public a(a aVar) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                c.this.d(com.google.common.base.O.b());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@I41.a Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                c cVar = c.this;
                C37381n4 c37381n4 = C37381n4.this;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(c37381n4.r(key, cVar.f359877e));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                c cVar = c.this;
                return !C37381n4.this.n(cVar.f359877e);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<R, V>> iterator() {
                return c.this.new b(null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@I41.a Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                c cVar = c.this;
                C37381n4 c37381n4 = C37381n4.this;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    return false;
                }
                C c12 = cVar.f359877e;
                if (!value.equals(c37381n4.r(key, c12))) {
                    return false;
                }
                c37381n4.t(key, c12);
                return true;
            }

            @Override // com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection<?> collection) {
                return c.this.d(com.google.common.base.O.h(com.google.common.base.O.f(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                c cVar = c.this;
                Iterator<Map<C, V>> it = C37381n4.this.f359870d.values().iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(cVar.f359877e)) {
                        i12++;
                    }
                }
                return i12;
            }
        }

        /* compiled from: StandardTable.java */
        /* renamed from: com.google.common.collect.n4$c$b */
        public class b extends AbstractC37316d<Map.Entry<R, V>> {

            /* renamed from: d, reason: collision with root package name */
            public final Iterator<Map.Entry<R, Map<C, V>>> f359880d;

            public b(a aVar) {
                this.f359880d = C37381n4.this.f359870d.entrySet().iterator();
            }

            @Override // com.google.common.collect.AbstractC37316d
            @I41.a
            public final Object a() {
                Map.Entry<R, Map<C, V>> next;
                do {
                    Iterator<Map.Entry<R, Map<C, V>>> it = this.f359880d;
                    if (!it.hasNext()) {
                        this.f359661b = AbstractC37316d.b.f359666d;
                        return null;
                    }
                    next = it.next();
                } while (!next.getValue().containsKey(c.this.f359877e));
                return new C37387o4(this, next);
            }
        }

        /* compiled from: StandardTable.java */
        /* renamed from: com.google.common.collect.n4$c$c, reason: collision with other inner class name */
        public class C10672c extends M2.o<R, V> {
            public C10672c() {
                super(c.this);
            }

            @Override // com.google.common.collect.M2.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@I41.a Object obj) {
                c cVar = c.this;
                return C37381n4.this.m(obj, cVar.f359877e);
            }

            @Override // com.google.common.collect.M2.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@I41.a Object obj) {
                c cVar = c.this;
                return C37381n4.this.t(obj, cVar.f359877e) != null;
            }

            @Override // com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection<?> collection) {
                return c.this.d(com.google.common.base.O.d(com.google.common.base.O.h(com.google.common.base.O.f(collection)), M2.EnumC37297e.f359488b));
            }
        }

        /* compiled from: StandardTable.java */
        /* renamed from: com.google.common.collect.n4$c$d */
        public class d extends M2.D<R, V> {
            public d() {
                super(c.this);
            }

            @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
            public final boolean remove(@I41.a Object obj) {
                if (obj != null) {
                    if (c.this.d(com.google.common.base.O.d(com.google.common.base.O.e(obj), M2.EnumC37297e.f359489c))) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
            public final boolean removeAll(Collection<?> collection) {
                return c.this.d(com.google.common.base.O.d(com.google.common.base.O.f(collection), M2.EnumC37297e.f359489c));
            }

            @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
            public final boolean retainAll(Collection<?> collection) {
                return c.this.d(com.google.common.base.O.d(com.google.common.base.O.h(com.google.common.base.O.f(collection)), M2.EnumC37297e.f359489c));
            }
        }

        public c(C c12) {
            c12.getClass();
            this.f359877e = c12;
        }

        @Override // com.google.common.collect.M2.E
        public final Set<Map.Entry<R, V>> a() {
            return new a(null);
        }

        @Override // com.google.common.collect.M2.E
        public final Set<R> b() {
            return new C10672c();
        }

        @Override // com.google.common.collect.M2.E
        public final Collection<V> c() {
            return new d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return C37381n4.this.m(obj, this.f359877e);
        }

        @InterfaceC19845a
        public final boolean d(com.google.common.base.N<? super Map.Entry<R, V>> n12) {
            Iterator<Map.Entry<R, Map<C, V>>> it = C37381n4.this.f359870d.entrySet().iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                C c12 = this.f359877e;
                V v12 = value.get(c12);
                if (v12 != null && n12.apply(new C37384o1(next.getKey(), v12))) {
                    value.remove(c12);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z12 = true;
                }
            }
            return z12;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V get(@I41.a Object obj) {
            return (V) C37381n4.this.r(obj, this.f359877e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V put(R r12, V v12) {
            return (V) C37381n4.this.s(r12, this.f359877e, v12);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V remove(@I41.a Object obj) {
            return (V) C37381n4.this.t(obj, this.f359877e);
        }
    }

    /* compiled from: StandardTable.java */
    /* renamed from: com.google.common.collect.n4$d */
    public class d extends AbstractC37316d<C> {

        /* renamed from: d, reason: collision with root package name */
        public final Map<C, V> f359884d;

        /* renamed from: e, reason: collision with root package name */
        public final Iterator<Map<C, V>> f359885e;

        /* renamed from: f, reason: collision with root package name */
        public Iterator<Map.Entry<C, V>> f359886f = C37325e2.d.f359709e;

        public d(C37381n4 c37381n4, a aVar) {
            this.f359884d = (Map) ((C37318d1.a) c37381n4.f359871e).get();
            this.f359885e = c37381n4.f359870d.values().iterator();
        }

        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final C a() {
            while (true) {
                if (this.f359886f.hasNext()) {
                    Map.Entry<C, V> next = this.f359886f.next();
                    C key = next.getKey();
                    Map<C, V> map = this.f359884d;
                    if (!map.containsKey(key)) {
                        map.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    Iterator<Map<C, V>> it = this.f359885e;
                    if (!it.hasNext()) {
                        this.f359661b = AbstractC37316d.b.f359666d;
                        return null;
                    }
                    this.f359886f = it.next().entrySet().iterator();
                }
            }
        }
    }

    /* compiled from: StandardTable.java */
    /* renamed from: com.google.common.collect.n4$e */
    public class e extends C37381n4<R, C, V>.i<C> {
        public e(a aVar) {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            return C37381n4.this.n(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<C> iterator() {
            return C37381n4.this.p();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            boolean z12 = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = C37381n4.this.f359870d.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z12 = true;
                }
            }
            return z12;
        }

        @Override // com.google.common.collect.W3.g, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            collection.getClass();
            Iterator<Map<C, V>> it = C37381n4.this.f359870d.values().iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (C37325e2.k(collection, next.keySet().iterator())) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z12 = true;
                }
            }
            return z12;
        }

        @Override // com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            Iterator<Map<C, V>> it = C37381n4.this.f359870d.values().iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z12 = true;
                }
            }
            return z12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C37325e2.l(C37381n4.this.p());
        }
    }

    /* compiled from: StandardTable.java */
    /* renamed from: com.google.common.collect.n4$f */
    public class f extends M2.E<C, Map<R, V>> {

        /* compiled from: StandardTable.java */
        /* renamed from: com.google.common.collect.n4$f$a */
        public class a extends C37381n4<R, C, V>.i<Map.Entry<C, Map<R, V>>> {

            /* compiled from: StandardTable.java */
            /* renamed from: com.google.common.collect.n4$f$a$a, reason: collision with other inner class name */
            public class C10673a implements InterfaceC37276u<C, Map<R, V>> {
                public C10673a() {
                }

                @Override // com.google.common.base.InterfaceC37276u
                public final Object apply(Object obj) {
                    return C37381n4.this.k(obj);
                }
            }

            public a() {
                super(null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@I41.a Object obj) {
                Map<R, V> mapK;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                f fVar = f.this;
                if (!C37381n4.this.n(entry.getKey())) {
                    return false;
                }
                Object key = entry.getKey();
                C37381n4 c37381n4 = C37381n4.this;
                if (c37381n4.n(key)) {
                    Objects.requireNonNull(key);
                    mapK = c37381n4.k(key);
                } else {
                    mapK = null;
                }
                Objects.requireNonNull(mapK);
                return mapK.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                Set<C> setL = C37381n4.this.l();
                return new F2(setL.iterator(), new C10673a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@I41.a Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                C37381n4.i(C37381n4.this, ((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.W3.g, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection<?> collection) {
                collection.getClass();
                return W3.i(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection<?> collection) {
                collection.getClass();
                f fVar = f.this;
                Iterator it = C37423v2.b(C37381n4.this.l().iterator()).iterator();
                boolean z12 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    C37381n4 c37381n4 = C37381n4.this;
                    if (!collection.contains(new C37384o1(next, c37381n4.k(next)))) {
                        C37381n4.i(c37381n4, next);
                        z12 = true;
                    }
                }
                return z12;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return C37381n4.this.l().size();
            }
        }

        /* compiled from: StandardTable.java */
        /* renamed from: com.google.common.collect.n4$f$b */
        public class b extends M2.D<C, Map<R, V>> {
            public b() {
                super(f.this);
            }

            @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
            public final boolean remove(@I41.a Object obj) {
                f fVar = f.this;
                for (Map.Entry<C, Map<R, V>> entry : fVar.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        C37381n4.i(C37381n4.this, entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
            public final boolean removeAll(Collection<?> collection) {
                collection.getClass();
                f fVar = f.this;
                Iterator it = C37423v2.b(C37381n4.this.l().iterator()).iterator();
                boolean z12 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    C37381n4 c37381n4 = C37381n4.this;
                    if (collection.contains(c37381n4.k(next))) {
                        C37381n4.i(c37381n4, next);
                        z12 = true;
                    }
                }
                return z12;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
            public final boolean retainAll(Collection<?> collection) {
                collection.getClass();
                f fVar = f.this;
                Iterator it = C37423v2.b(C37381n4.this.l().iterator()).iterator();
                boolean z12 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    C37381n4 c37381n4 = C37381n4.this;
                    if (!collection.contains(c37381n4.k(next))) {
                        C37381n4.i(c37381n4, next);
                        z12 = true;
                    }
                }
                return z12;
            }
        }

        public f(a aVar) {
        }

        @Override // com.google.common.collect.M2.E
        public final Set<Map.Entry<C, Map<R, V>>> a() {
            return new a();
        }

        @Override // com.google.common.collect.M2.E
        public final Collection<Map<R, V>> c() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return C37381n4.this.n(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object get(@I41.a Object obj) {
            C37381n4 c37381n4 = C37381n4.this;
            if (!c37381n4.n(obj)) {
                return null;
            }
            Objects.requireNonNull(obj);
            return c37381n4.k(obj);
        }

        @Override // com.google.common.collect.M2.E, java.util.AbstractMap, java.util.Map
        public final Set<C> keySet() {
            return C37381n4.this.l();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object remove(@I41.a Object obj) {
            C37381n4 c37381n4 = C37381n4.this;
            if (c37381n4.n(obj)) {
                return C37381n4.i(c37381n4, obj);
            }
            return null;
        }
    }

    /* compiled from: StandardTable.java */
    /* renamed from: com.google.common.collect.n4$g */
    public class g extends M2.n<C, V> {

        /* renamed from: b, reason: collision with root package name */
        public final R f359892b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public Map<C, V> f359893c;

        /* compiled from: StandardTable.java */
        /* renamed from: com.google.common.collect.n4$g$a */
        public class a implements Iterator<Map.Entry<C, V>> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f359895b;

            public a(Iterator it) {
                this.f359895b = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f359895b.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry entry = (Map.Entry) this.f359895b.next();
                g.this.getClass();
                return new C37393p4(entry);
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f359895b.remove();
                g.this.c();
            }
        }

        public g(R r12) {
            r12.getClass();
            this.f359892b = r12;
        }

        @Override // com.google.common.collect.M2.n
        public final Iterator<Map.Entry<C, V>> a() {
            d();
            Map<C, V> map = this.f359893c;
            return map == null ? C37325e2.f.f359715b : new a(map.entrySet().iterator());
        }

        @I41.a
        public Map<C, V> b() {
            return C37381n4.this.f359870d.get(this.f359892b);
        }

        public void c() {
            d();
            Map<C, V> map = this.f359893c;
            if (map == null || !map.isEmpty()) {
                return;
            }
            C37381n4.this.f359870d.remove(this.f359892b);
            this.f359893c = null;
        }

        @Override // com.google.common.collect.M2.n, java.util.AbstractMap, java.util.Map
        public final void clear() {
            d();
            Map<C, V> map = this.f359893c;
            if (map != null) {
                map.clear();
            }
            c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@I41.a Object obj) {
            Map<C, V> map;
            d();
            return (obj == null || (map = this.f359893c) == null || !M2.i(map, obj)) ? false : true;
        }

        public final void d() {
            Map<C, V> map = this.f359893c;
            if (map == null || (map.isEmpty() && C37381n4.this.f359870d.containsKey(this.f359892b))) {
                this.f359893c = b();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V get(@I41.a Object obj) {
            Map<C, V> map;
            d();
            if (obj == null || (map = this.f359893c) == null) {
                return null;
            }
            return (V) M2.j(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public V put(C c12, V v12) {
            c12.getClass();
            v12.getClass();
            Map<C, V> map = this.f359893c;
            return (map == null || map.isEmpty()) ? (V) C37381n4.this.s(this.f359892b, c12, v12) : this.f359893c.put(c12, v12);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V remove(@I41.a Object obj) {
            d();
            Map<C, V> map = this.f359893c;
            V vRemove = null;
            if (map == null) {
                return null;
            }
            try {
                vRemove = map.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
            }
            c();
            return vRemove;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            d();
            Map<C, V> map = this.f359893c;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    /* compiled from: StandardTable.java */
    /* renamed from: com.google.common.collect.n4$h */
    public class h extends M2.E<R, Map<C, V>> {

        /* compiled from: StandardTable.java */
        /* renamed from: com.google.common.collect.n4$h$a */
        public class a extends C37381n4<R, C, V>.i<Map.Entry<R, Map<C, V>>> {

            /* compiled from: StandardTable.java */
            /* renamed from: com.google.common.collect.n4$h$a$a, reason: collision with other inner class name */
            public class C10674a implements InterfaceC37276u<R, Map<C, V>> {
                public C10674a() {
                }

                @Override // com.google.common.base.InterfaceC37276u
                public final Object apply(Object obj) {
                    return C37381n4.this.u(obj);
                }
            }

            public a() {
                super(null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@I41.a Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && G.c(entry, C37381n4.this.f359870d.entrySet());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                Set<R> setKeySet = C37381n4.this.f359870d.keySet();
                return new F2(setKeySet.iterator(), new C10674a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@I41.a Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && C37381n4.this.f359870d.entrySet().remove(entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return C37381n4.this.f359870d.size();
            }
        }

        public h() {
        }

        @Override // com.google.common.collect.M2.E
        public final Set<Map.Entry<R, Map<C, V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return C37381n4.this.o(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object get(@I41.a Object obj) {
            C37381n4 c37381n4 = C37381n4.this;
            if (!c37381n4.o(obj)) {
                return null;
            }
            Objects.requireNonNull(obj);
            return c37381n4.u(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object remove(@I41.a Object obj) {
            if (obj == null) {
                return null;
            }
            return C37381n4.this.f359870d.remove(obj);
        }
    }

    /* compiled from: StandardTable.java */
    /* renamed from: com.google.common.collect.n4$i */
    public abstract class i<T> extends W3.g<T> {
        public i(a aVar) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C37381n4.this.f359870d.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return C37381n4.this.f359870d.isEmpty();
        }
    }

    public C37381n4(Map<R, Map<C, V>> map, com.google.common.base.e0<? extends Map<C, V>> e0Var) {
        this.f359870d = map;
        this.f359871e = e0Var;
    }

    public static LinkedHashMap i(C37381n4 c37381n4, Object obj) {
        c37381n4.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = c37381n4.f359870d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V vRemove = next.getValue().remove(obj);
            if (vRemove != null) {
                linkedHashMap.put(next.getKey(), vRemove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.google.common.collect.AbstractC37405s
    public final Iterator<t4.a<R, C, V>> a() {
        return new b(this, null);
    }

    @Override // com.google.common.collect.AbstractC37405s
    public void b() {
        this.f359870d.clear();
    }

    @Override // com.google.common.collect.AbstractC37405s
    public boolean c(@I41.a Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // com.google.common.collect.t4, com.google.common.collect.R3
    public Map<R, Map<C, V>> d() {
        Map<R, Map<C, V>> map = this.f359873g;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapQ = q();
        this.f359873g = mapQ;
        return mapQ;
    }

    public Map<R, V> k(C c12) {
        return new c(c12);
    }

    public Set<C> l() {
        Set<C> set = this.f359872f;
        if (set != null) {
            return set;
        }
        e eVar = new e(null);
        this.f359872f = eVar;
        return eVar;
    }

    public boolean m(@I41.a Object obj, @I41.a Object obj2) {
        Map map;
        return (obj == null || obj2 == null || (map = (Map) M2.j(d(), obj)) == null || !M2.i(map, obj2)) ? false : true;
    }

    public boolean n(@I41.a Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.f359870d.values().iterator();
        while (it.hasNext()) {
            if (M2.i(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean o(@I41.a Object obj) {
        return obj != null && M2.i(this.f359870d, obj);
    }

    public Iterator<C> p() {
        return new d(this, null);
    }

    public Map<R, Map<C, V>> q() {
        return new h();
    }

    @I41.a
    public V r(@I41.a Object obj, @I41.a Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) M2.j(d(), obj)) == null) {
            return null;
        }
        return (V) M2.j(map, obj2);
    }

    @I41.a
    @InterfaceC19845a
    public V s(R r12, C c12, V v12) {
        r12.getClass();
        c12.getClass();
        v12.getClass();
        Map<R, Map<C, V>> map = this.f359870d;
        Map<C, V> map2 = map.get(r12);
        if (map2 == null) {
            map2 = this.f359871e.get();
            map.put(r12, map2);
        }
        return map2.put(c12, v12);
    }

    @Override // com.google.common.collect.t4
    public int size() {
        Iterator<Map<C, V>> it = this.f359870d.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @I41.a
    @InterfaceC19845a
    public V t(@I41.a Object obj, @I41.a Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        Map<R, Map<C, V>> map = this.f359870d;
        Map map2 = (Map) M2.j(map, obj);
        if (map2 == null) {
            return null;
        }
        V v12 = (V) map2.remove(obj2);
        if (map2.isEmpty()) {
            map.remove(obj);
        }
        return v12;
    }

    public Map<C, V> u(R r12) {
        return new g(r12);
    }
}
