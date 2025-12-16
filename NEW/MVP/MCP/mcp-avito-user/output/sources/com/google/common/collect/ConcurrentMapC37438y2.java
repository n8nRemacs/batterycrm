package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25600a;
import bZ0.InterfaceC25601b;
import com.google.common.base.AbstractC37270n;
import com.google.common.collect.C37433x2;
import com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j;
import com.google.common.collect.ConcurrentMapC37438y2.o;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import shark.AndroidResourceIdNames;

/* compiled from: MapMakerInternalMap.java */
@XY0.c
@XY0.d
/* renamed from: com.google.common.collect.y2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class ConcurrentMapC37438y2<K, V, E extends InterfaceC37448j<K, V, E>, S extends o<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final C37439a f360085k = new C37439a();
    private static final long serialVersionUID = 5;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f360086b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f360087c;

    /* renamed from: d, reason: collision with root package name */
    public final transient o<K, V, E, S>[] f360088d;

    /* renamed from: e, reason: collision with root package name */
    public final int f360089e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC37270n<Object> f360090f;

    /* renamed from: g, reason: collision with root package name */
    public final transient k<K, V, E, S> f360091g;

    /* renamed from: h, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<K> f360092h;

    /* renamed from: i, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Collection<V> f360093i;

    /* renamed from: j, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<Map.Entry<K, V>> f360094j;

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$A */
    public static class A<K> extends AbstractC37442d<K, C37433x2.a, A<K>> implements x<K, C37433x2.a, A<K>> {

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$A$a */
        public static final class a<K> implements k<K, C37433x2.a, A<K>, B<K>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?> f360095a = new a<>();

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q a() {
                return q.f360137c;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            @I41.a
            public final InterfaceC37448j b(o oVar, InterfaceC37448j interfaceC37448j, @I41.a InterfaceC37448j interfaceC37448j2) {
                B b12 = (B) oVar;
                A a12 = (A) interfaceC37448j;
                A a13 = (A) interfaceC37448j2;
                K k12 = a12.get();
                if (k12 == null) {
                    return null;
                }
                int i12 = a12.f360118b;
                return a13 == null ? new A(b12.f360097i, k12, i12, null) : new b(b12.f360097i, k12, i12, a13, null);
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q c() {
                return q.f360136b;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final o d(ConcurrentMapC37438y2 concurrentMapC37438y2, int i12) {
                return new B(concurrentMapC37438y2, i12);
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final /* bridge */ /* synthetic */ void e(o oVar, InterfaceC37448j interfaceC37448j, C37433x2.a aVar) {
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final InterfaceC37448j f(o oVar, Object obj, int i12, @I41.a InterfaceC37448j interfaceC37448j) {
                B b12 = (B) oVar;
                A a12 = (A) interfaceC37448j;
                return a12 == null ? new A(b12.f360097i, obj, i12, null) : new b(b12.f360097i, obj, i12, a12, null);
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$A$b */
        public static final class b<K> extends A<K> {

            /* renamed from: c, reason: collision with root package name */
            public final A<K> f360096c;

            public b() {
                throw null;
            }

            public b(ReferenceQueue referenceQueue, Object obj, int i12, A a12, C37439a c37439a) {
                super(referenceQueue, obj, i12, null);
                this.f360096c = a12;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.AbstractC37442d, com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
            public final InterfaceC37448j b() {
                return this.f360096c;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.A, com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
            public final /* bridge */ /* synthetic */ Object getValue() {
                return C37433x2.a.f360069b;
            }
        }

        public A() {
            throw null;
        }

        public A(ReferenceQueue referenceQueue, Object obj, int i12, C37439a c37439a) {
            super(referenceQueue, obj, i12);
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        public /* bridge */ /* synthetic */ Object getValue() {
            return C37433x2.a.f360069b;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$C */
    public static class C<K, V> extends AbstractC37442d<K, V, C<K, V>> implements x<K, V, C<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public volatile V f360098c;

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$C$a */
        public static final class a<K, V> implements k<K, V, C<K, V>, D<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f360099a = new a<>();

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q a() {
                return q.f360137c;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            @I41.a
            public final InterfaceC37448j b(o oVar, InterfaceC37448j interfaceC37448j, @I41.a InterfaceC37448j interfaceC37448j2) {
                D d12 = (D) oVar;
                C c12 = (C) interfaceC37448j;
                C c13 = (C) interfaceC37448j2;
                K k12 = c12.get();
                C c14 = null;
                if (k12 != null) {
                    int i12 = c12.f360118b;
                    c14 = c13 == null ? new C(d12.f360101i, k12, i12, null) : new b(d12.f360101i, k12, i12, c13, null);
                    c14.f360098c = c12.f360098c;
                }
                return c14;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q c() {
                return q.f360136b;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final o d(ConcurrentMapC37438y2 concurrentMapC37438y2, int i12) {
                return new D(concurrentMapC37438y2, i12);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final void e(o oVar, InterfaceC37448j interfaceC37448j, Object obj) {
                ((C) interfaceC37448j).f360098c = obj;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final InterfaceC37448j f(o oVar, Object obj, int i12, @I41.a InterfaceC37448j interfaceC37448j) {
                D d12 = (D) oVar;
                C c12 = (C) interfaceC37448j;
                return c12 == null ? new C(d12.f360101i, obj, i12, null) : new b(d12.f360101i, obj, i12, c12, null);
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$C$b */
        public static final class b<K, V> extends C<K, V> {

            /* renamed from: d, reason: collision with root package name */
            public final C<K, V> f360100d;

            public b() {
                throw null;
            }

            public b(ReferenceQueue referenceQueue, Object obj, int i12, C c12, C37439a c37439a) {
                super(referenceQueue, obj, i12, null);
                this.f360100d = c12;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.AbstractC37442d, com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
            public final InterfaceC37448j b() {
                return this.f360100d;
            }
        }

        public C() {
            throw null;
        }

        public C(ReferenceQueue referenceQueue, Object obj, int i12, C37439a c37439a) {
            super(referenceQueue, obj, i12);
            this.f360098c = null;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        @I41.a
        public final V getValue() {
            return this.f360098c;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$E */
    public static class E<K, V> extends AbstractC37442d<K, V, E<K, V>> implements G<K, V, E<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        public volatile H<K, V, E<K, V>> f360102c;

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$E$a */
        public static final class a<K, V> implements k<K, V, E<K, V>, F<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f360103a = new a<>();

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q a() {
                return q.f360137c;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            @I41.a
            public final InterfaceC37448j b(o oVar, InterfaceC37448j interfaceC37448j, @I41.a InterfaceC37448j interfaceC37448j2) {
                F f12 = (F) oVar;
                E e12 = (E) interfaceC37448j;
                E e13 = (E) interfaceC37448j2;
                K k12 = e12.get();
                E e14 = null;
                if (k12 != null) {
                    int i12 = o.f360129h;
                    if (e12.f360102c.get() != null) {
                        int i13 = e12.f360118b;
                        e14 = e13 == null ? new E(f12.f360105i, k12, i13) : new b(f12.f360105i, k12, i13, e13);
                        e14.f360102c = e12.f360102c.b(f12.f360106j, e14);
                    }
                }
                return e14;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q c() {
                return q.f360137c;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final o d(ConcurrentMapC37438y2 concurrentMapC37438y2, int i12) {
                return new F(concurrentMapC37438y2, i12);
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final void e(o oVar, InterfaceC37448j interfaceC37448j, Object obj) {
                E e12 = (E) interfaceC37448j;
                H<K, V, E<K, V>> h12 = e12.f360102c;
                e12.f360102c = new I(((F) oVar).f360106j, obj, e12);
                h12.clear();
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final InterfaceC37448j f(o oVar, Object obj, int i12, @I41.a InterfaceC37448j interfaceC37448j) {
                F f12 = (F) oVar;
                E e12 = (E) interfaceC37448j;
                return e12 == null ? new E(f12.f360105i, obj, i12) : new b(f12.f360105i, obj, i12, e12);
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$E$b */
        public static final class b<K, V> extends E<K, V> {

            /* renamed from: d, reason: collision with root package name */
            public final E<K, V> f360104d;

            public b(ReferenceQueue<K> referenceQueue, K k12, int i12, E<K, V> e12) {
                super(referenceQueue, k12, i12);
                this.f360104d = e12;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.AbstractC37442d, com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
            public final InterfaceC37448j b() {
                return this.f360104d;
            }
        }

        public E(ReferenceQueue<K> referenceQueue, K k12, int i12) {
            super(referenceQueue, k12, i12);
            this.f360102c = ConcurrentMapC37438y2.f360085k;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.G
        public final H<K, V, E<K, V>> a() {
            return this.f360102c;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        public final V getValue() {
            return this.f360102c.get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$G */
    public interface G<K, V, E extends InterfaceC37448j<K, V, E>> extends InterfaceC37448j<K, V, E> {
        H<K, V, E> a();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$H */
    public interface H<K, V, E extends InterfaceC37448j<K, V, E>> {
        E a();

        H b(ReferenceQueue referenceQueue, G g12);

        void clear();

        @I41.a
        V get();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$I */
    public static final class I<K, V, E extends InterfaceC37448j<K, V, E>> extends WeakReference<V> implements H<K, V, E> {

        /* renamed from: b, reason: collision with root package name */
        @Weak
        public final E f360107b;

        public I(ReferenceQueue<V> referenceQueue, V v12, E e12) {
            super(v12, referenceQueue);
            this.f360107b = e12;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.H
        public final E a() {
            return this.f360107b;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.H
        public final H b(ReferenceQueue referenceQueue, G g12) {
            return new I(referenceQueue, get(), g12);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$J */
    public final class J extends AbstractC37340h<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final K f360108b;

        /* renamed from: c, reason: collision with root package name */
        public V f360109c;

        public J(K k12, V v12) {
            this.f360108b = k12;
            this.f360109c = v12;
        }

        @Override // com.google.common.collect.AbstractC37340h, java.util.Map.Entry
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f360108b.equals(entry.getKey()) && this.f360109c.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f360108b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f360109c;
        }

        @Override // com.google.common.collect.AbstractC37340h, java.util.Map.Entry
        public final int hashCode() {
            return this.f360108b.hashCode() ^ this.f360109c.hashCode();
        }

        @Override // com.google.common.collect.AbstractC37340h, java.util.Map.Entry
        public final V setValue(V v12) {
            V v13 = (V) ConcurrentMapC37438y2.this.put(this.f360108b, v12);
            this.f360109c = v12;
            return v13;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$b, reason: case insensitive filesystem */
    public static abstract class AbstractC37440b<K, V> extends C0<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: b, reason: collision with root package name */
        public final q f360111b;

        /* renamed from: c, reason: collision with root package name */
        public final q f360112c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC37270n<Object> f360113d;

        /* renamed from: e, reason: collision with root package name */
        public final int f360114e;

        /* renamed from: f, reason: collision with root package name */
        public transient AbstractMap f360115f;

        /* JADX WARN: Multi-variable type inference failed */
        public AbstractC37440b(q qVar, q qVar2, AbstractC37270n abstractC37270n, int i12, ConcurrentMap concurrentMap) {
            this.f360111b = qVar;
            this.f360112c = qVar2;
            this.f360113d = abstractC37270n;
            this.f360114e = i12;
            this.f360115f = (AbstractMap) concurrentMap;
        }

        @Override // com.google.common.collect.C0, com.google.common.collect.M0, com.google.common.collect.S0
        public final Object X() {
            return this.f360115f;
        }

        @Override // com.google.common.collect.C0, com.google.common.collect.M0
        /* renamed from: Y */
        public final Map X() {
            return this.f360115f;
        }

        @Override // com.google.common.collect.C0
        /* renamed from: a0 */
        public final ConcurrentMap<K, V> X() {
            return (ConcurrentMap<K, V>) this.f360115f;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$c, reason: case insensitive filesystem */
    public static abstract class AbstractC37441c<K, V, E extends InterfaceC37448j<K, V, E>> implements InterfaceC37448j<K, V, E> {

        /* renamed from: b, reason: collision with root package name */
        public final K f360116b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360117c;

        public AbstractC37441c(K k12, int i12) {
            this.f360116b = k12;
            this.f360117c = i12;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        @I41.a
        public E b() {
            return null;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        public final int getHash() {
            return this.f360117c;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        public final K getKey() {
            return this.f360116b;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$d, reason: case insensitive filesystem */
    public static abstract class AbstractC37442d<K, V, E extends InterfaceC37448j<K, V, E>> extends WeakReference<K> implements InterfaceC37448j<K, V, E> {

        /* renamed from: b, reason: collision with root package name */
        public final int f360118b;

        public AbstractC37442d(ReferenceQueue<K> referenceQueue, K k12, int i12) {
            super(k12, referenceQueue);
            this.f360118b = i12;
        }

        @I41.a
        public E b() {
            return null;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        public final int getHash() {
            return this.f360118b;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        public final K getKey() {
            return get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$e, reason: case insensitive filesystem */
    public static final class RunnableC37443e implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$f, reason: case insensitive filesystem */
    public static final class C37444f implements InterfaceC37448j<Object, Object, C37444f> {
        public C37444f() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        public final InterfaceC37448j b() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        public final int getHash() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        public final Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        public final Object getValue() {
            throw new AssertionError();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$g, reason: case insensitive filesystem */
    public final class C37445g extends ConcurrentMapC37438y2<K, V, E, S>.AbstractC37447i<Map.Entry<K, V>> {
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$h, reason: case insensitive filesystem */
    public final class C37446h extends n<Map.Entry<K, V>> {
        public C37446h() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            ConcurrentMapC37438y2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            ConcurrentMapC37438y2 concurrentMapC37438y2;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (concurrentMapC37438y2 = ConcurrentMapC37438y2.this).get(key)) != null && concurrentMapC37438y2.f360091g.c().a().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return ConcurrentMapC37438y2.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C37445g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && ConcurrentMapC37438y2.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ConcurrentMapC37438y2.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$i, reason: case insensitive filesystem */
    public abstract class AbstractC37447i<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public int f360120b;

        /* renamed from: c, reason: collision with root package name */
        public int f360121c = -1;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public o<K, V, E, S> f360122d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public AtomicReferenceArray<E> f360123e;

        /* renamed from: f, reason: collision with root package name */
        @I41.a
        public E f360124f;

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        public ConcurrentMapC37438y2<K, V, E, S>.J f360125g;

        /* renamed from: h, reason: collision with root package name */
        @I41.a
        public ConcurrentMapC37438y2<K, V, E, S>.J f360126h;

        public AbstractC37447i() {
            this.f360120b = ConcurrentMapC37438y2.this.f360088d.length - 1;
            a();
        }

        public final void a() {
            this.f360125g = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i12 = this.f360120b;
                if (i12 < 0) {
                    return;
                }
                o<K, V, E, S>[] oVarArr = ConcurrentMapC37438y2.this.f360088d;
                this.f360120b = i12 - 1;
                o<K, V, E, S> oVar = oVarArr[i12];
                this.f360122d = oVar;
                if (oVar.f360131c != 0) {
                    this.f360123e = this.f360122d.f360134f;
                    this.f360121c = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public final boolean b(E e12) {
            ConcurrentMapC37438y2 concurrentMapC37438y2 = ConcurrentMapC37438y2.this;
            try {
                Object key = e12.getKey();
                Object value = e12.getKey() == null ? null : e12.getValue();
                if (value == null) {
                    this.f360122d.g();
                    return false;
                }
                this.f360125g = new J(key, value);
                this.f360122d.g();
                return true;
            } catch (Throwable th2) {
                this.f360122d.g();
                throw th2;
            }
        }

        public final ConcurrentMapC37438y2<K, V, E, S>.J c() {
            ConcurrentMapC37438y2<K, V, E, S>.J j12 = this.f360125g;
            if (j12 == null) {
                throw new NoSuchElementException();
            }
            this.f360126h = j12;
            a();
            return this.f360126h;
        }

        public final boolean d() {
            E e12 = this.f360124f;
            if (e12 == null) {
                return false;
            }
            while (true) {
                this.f360124f = (E) e12.b();
                E e13 = this.f360124f;
                if (e13 == null) {
                    return false;
                }
                if (b(e13)) {
                    return true;
                }
                e12 = this.f360124f;
            }
        }

        public final boolean e() {
            while (true) {
                int i12 = this.f360121c;
                if (i12 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f360123e;
                this.f360121c = i12 - 1;
                E e12 = atomicReferenceArray.get(i12);
                this.f360124f = e12;
                if (e12 != null && (b(e12) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f360125g != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.collect.F.e(this.f360126h != null);
            ConcurrentMapC37438y2.this.remove(this.f360126h.f360108b);
            this.f360126h = null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$j, reason: case insensitive filesystem */
    public interface InterfaceC37448j<K, V, E extends InterfaceC37448j<K, V, E>> {
        E b();

        int getHash();

        K getKey();

        V getValue();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$k */
    public interface k<K, V, E extends InterfaceC37448j<K, V, E>, S extends o<K, V, E, S>> {
        q a();

        E b(S s5, E e12, @I41.a E e13);

        q c();

        S d(ConcurrentMapC37438y2<K, V, E, S> concurrentMapC37438y2, int i12);

        void e(S s5, E e12, V v12);

        E f(S s5, K k12, int i12, @I41.a E e12);
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$l */
    public final class l extends ConcurrentMapC37438y2<K, V, E, S>.AbstractC37447i<K> {
        @Override // com.google.common.collect.ConcurrentMapC37438y2.AbstractC37447i, java.util.Iterator
        public final K next() {
            return c().f360108b;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$m */
    public final class m extends n<K> {
        public m() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            ConcurrentMapC37438y2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return ConcurrentMapC37438y2.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return ConcurrentMapC37438y2.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return ConcurrentMapC37438y2.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ConcurrentMapC37438y2.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$n */
    public static abstract class n<E> extends AbstractSet<E> {
        public n() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return ConcurrentMapC37438y2.a(this).toArray();
        }

        public /* synthetic */ n(C37439a c37439a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) ConcurrentMapC37438y2.a(this).toArray(tArr);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$p */
    public static final class p<K, V> extends AbstractC37440b<K, V> {
        private static final long serialVersionUID = 3;

        public p() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @XY0.d
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            int i12 = objectInputStream.readInt();
            C37433x2 c37433x2 = new C37433x2();
            int i13 = c37433x2.f360064b;
            com.google.common.base.M.m(i13, "initial capacity was already set to %s", i13 == -1);
            com.google.common.base.M.g(i12 >= 0);
            c37433x2.f360064b = i12;
            c37433x2.d(this.f360111b);
            q qVar = c37433x2.f360067e;
            com.google.common.base.M.p("Value strength was already set to %s", qVar == null, qVar);
            q qVar2 = this.f360112c;
            qVar2.getClass();
            c37433x2.f360067e = qVar2;
            if (qVar2 != q.f360136b) {
                c37433x2.f360063a = true;
            }
            AbstractC37270n<Object> abstractC37270n = c37433x2.f360068f;
            com.google.common.base.M.p("key equivalence was already set to %s", abstractC37270n == null, abstractC37270n);
            AbstractC37270n<Object> abstractC37270n2 = this.f360113d;
            abstractC37270n2.getClass();
            c37433x2.f360068f = abstractC37270n2;
            c37433x2.f360063a = true;
            int i14 = c37433x2.f360065c;
            com.google.common.base.M.m(i14, "concurrency level was already set to %s", i14 == -1);
            int i15 = this.f360114e;
            com.google.common.base.M.g(i15 > 0);
            c37433x2.f360065c = i15;
            this.f360115f = (AbstractMap) c37433x2.c();
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                } else {
                    this.f360115f.put(object, objectInputStream.readObject());
                }
            }
        }

        private Object readResolve() {
            return this.f360115f;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.f360115f.size());
            for (Map.Entry<K, V> entry : this.f360115f.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$q */
    public static abstract class q {

        /* renamed from: b, reason: collision with root package name */
        public static final a f360136b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f360137c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ q[] f360138d;

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$q$a */
        public enum a extends q {
            @Override // com.google.common.collect.ConcurrentMapC37438y2.q
            public final AbstractC37270n<Object> a() {
                return AbstractC37270n.c();
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$q$b */
        public enum b extends q {
            @Override // com.google.common.collect.ConcurrentMapC37438y2.q
            public final AbstractC37270n<Object> a() {
                return AbstractC37270n.e();
            }
        }

        static {
            a aVar = new a("STRONG", 0, null);
            f360136b = aVar;
            b bVar = new b("WEAK", 1, null);
            f360137c = bVar;
            f360138d = new q[]{aVar, bVar};
        }

        public q() {
            throw null;
        }

        public q(String str, int i12, C37439a c37439a) {
        }

        public static q valueOf(String str) {
            return (q) Enum.valueOf(q.class, str);
        }

        public static q[] values() {
            return (q[]) f360138d.clone();
        }

        public abstract AbstractC37270n<Object> a();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$r */
    public static class r<K> extends AbstractC37441c<K, C37433x2.a, r<K>> implements x<K, C37433x2.a, r<K>> {

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$r$a */
        public static final class a<K> implements k<K, C37433x2.a, r<K>, s<K>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?> f360139a = new a<>();

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q a() {
                return q.f360136b;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final InterfaceC37448j b(o oVar, InterfaceC37448j interfaceC37448j, @I41.a InterfaceC37448j interfaceC37448j2) {
                r rVar = (r) interfaceC37448j;
                r rVar2 = (r) interfaceC37448j2;
                K k12 = rVar.f360116b;
                int i12 = rVar.f360117c;
                return rVar2 == null ? new r(k12, i12, null) : new b(k12, i12, rVar2);
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q c() {
                return q.f360136b;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final o d(ConcurrentMapC37438y2 concurrentMapC37438y2, int i12) {
                return new s(concurrentMapC37438y2, i12);
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final /* bridge */ /* synthetic */ void e(o oVar, InterfaceC37448j interfaceC37448j, C37433x2.a aVar) {
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final InterfaceC37448j f(o oVar, Object obj, int i12, @I41.a InterfaceC37448j interfaceC37448j) {
                r rVar = (r) interfaceC37448j;
                return rVar == null ? new r(obj, i12, null) : new b(obj, i12, rVar);
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$r$b */
        public static final class b<K> extends r<K> {

            /* renamed from: d, reason: collision with root package name */
            public final r<K> f360140d;

            public b(K k12, int i12, r<K> rVar) {
                super(k12, i12, null);
                this.f360140d = rVar;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.AbstractC37441c, com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
            public final InterfaceC37448j b() {
                return this.f360140d;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.r, com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
            public final /* bridge */ /* synthetic */ Object getValue() {
                return C37433x2.a.f360069b;
            }
        }

        public r() {
            throw null;
        }

        public r(Object obj, int i12, C37439a c37439a) {
            super(obj, i12);
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        public /* bridge */ /* synthetic */ Object getValue() {
            return C37433x2.a.f360069b;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$t */
    public static class t<K, V> extends AbstractC37441c<K, V, t<K, V>> implements x<K, V, t<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public volatile V f360141d;

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$t$a */
        public static final class a<K, V> implements k<K, V, t<K, V>, u<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f360142a = new a<>();

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q a() {
                return q.f360136b;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final InterfaceC37448j b(o oVar, InterfaceC37448j interfaceC37448j, @I41.a InterfaceC37448j interfaceC37448j2) {
                t tVar = (t) interfaceC37448j;
                t tVar2 = (t) interfaceC37448j2;
                K k12 = tVar.f360116b;
                int i12 = tVar.f360117c;
                t tVar3 = tVar2 == null ? new t(k12, i12, null) : new b(k12, i12, tVar2);
                tVar3.f360141d = tVar.f360141d;
                return tVar3;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q c() {
                return q.f360136b;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final o d(ConcurrentMapC37438y2 concurrentMapC37438y2, int i12) {
                return new u(concurrentMapC37438y2, i12);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final void e(o oVar, InterfaceC37448j interfaceC37448j, Object obj) {
                ((t) interfaceC37448j).f360141d = obj;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final InterfaceC37448j f(o oVar, Object obj, int i12, @I41.a InterfaceC37448j interfaceC37448j) {
                t tVar = (t) interfaceC37448j;
                return tVar == null ? new t(obj, i12, null) : new b(obj, i12, tVar);
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$t$b */
        public static final class b<K, V> extends t<K, V> {

            /* renamed from: e, reason: collision with root package name */
            public final t<K, V> f360143e;

            public b(K k12, int i12, t<K, V> tVar) {
                super(k12, i12, null);
                this.f360143e = tVar;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.AbstractC37441c, com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
            public final InterfaceC37448j b() {
                return this.f360143e;
            }
        }

        public t() {
            throw null;
        }

        public t(Object obj, int i12, C37439a c37439a) {
            super(obj, i12);
            this.f360141d = null;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        @I41.a
        public final V getValue() {
            return this.f360141d;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$v */
    public static class v<K, V> extends AbstractC37441c<K, V, v<K, V>> implements G<K, V, v<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        public volatile H<K, V, v<K, V>> f360144d;

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$v$a */
        public static final class a<K, V> implements k<K, V, v<K, V>, w<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f360145a = new a<>();

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q a() {
                return q.f360136b;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            @I41.a
            public final InterfaceC37448j b(o oVar, InterfaceC37448j interfaceC37448j, @I41.a InterfaceC37448j interfaceC37448j2) {
                w wVar = (w) oVar;
                v vVar = (v) interfaceC37448j;
                v vVar2 = (v) interfaceC37448j2;
                int i12 = o.f360129h;
                v vVar3 = null;
                if (vVar.getValue() != null) {
                    K k12 = vVar.f360116b;
                    int i13 = vVar.f360117c;
                    vVar3 = vVar2 == null ? new v(k12, i13, null) : new b(k12, i13, vVar2);
                    vVar3.f360144d = vVar.f360144d.b(wVar.f360147i, vVar3);
                }
                return vVar3;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final q c() {
                return q.f360137c;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final o d(ConcurrentMapC37438y2 concurrentMapC37438y2, int i12) {
                return new w(concurrentMapC37438y2, i12);
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final void e(o oVar, InterfaceC37448j interfaceC37448j, Object obj) {
                v vVar = (v) interfaceC37448j;
                H<K, V, v<K, V>> h12 = vVar.f360144d;
                vVar.f360144d = new I(((w) oVar).f360147i, obj, vVar);
                h12.clear();
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.k
            public final InterfaceC37448j f(o oVar, Object obj, int i12, @I41.a InterfaceC37448j interfaceC37448j) {
                v vVar = (v) interfaceC37448j;
                return vVar == null ? new v(obj, i12, null) : new b(obj, i12, vVar);
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.y2$v$b */
        public static final class b<K, V> extends v<K, V> {

            /* renamed from: e, reason: collision with root package name */
            public final v<K, V> f360146e;

            public b(K k12, int i12, v<K, V> vVar) {
                super(k12, i12, null);
                this.f360146e = vVar;
            }

            @Override // com.google.common.collect.ConcurrentMapC37438y2.AbstractC37441c, com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
            public final InterfaceC37448j b() {
                return this.f360146e;
            }
        }

        public v() {
            throw null;
        }

        public v(Object obj, int i12, C37439a c37439a) {
            super(obj, i12);
            this.f360144d = ConcurrentMapC37438y2.f360085k;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.G
        public final H<K, V, v<K, V>> a() {
            return this.f360144d;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j
        @I41.a
        public final V getValue() {
            return this.f360144d.get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$x */
    public interface x<K, V, E extends InterfaceC37448j<K, V, E>> extends InterfaceC37448j<K, V, E> {
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$y */
    public final class y extends ConcurrentMapC37438y2<K, V, E, S>.AbstractC37447i<V> {
        @Override // com.google.common.collect.ConcurrentMapC37438y2.AbstractC37447i, java.util.Iterator
        public final V next() {
            return c().f360109c;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$z */
    public final class z extends AbstractCollection<V> {
        public z() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ConcurrentMapC37438y2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ConcurrentMapC37438y2.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return ConcurrentMapC37438y2.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ConcurrentMapC37438y2.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return ConcurrentMapC37438y2.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) ConcurrentMapC37438y2.a(this).toArray(tArr);
        }
    }

    public ConcurrentMapC37438y2(C37433x2 c37433x2, k<K, V, E, S> kVar) {
        int i12 = c37433x2.f360065c;
        this.f360089e = Math.min(i12 == -1 ? 4 : i12, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        this.f360090f = (AbstractC37270n) com.google.common.base.D.a(c37433x2.f360068f, c37433x2.a().a());
        this.f360091g = kVar;
        int i13 = c37433x2.f360064b;
        int iMin = Math.min(i13 == -1 ? 16 : i13, 1073741824);
        int i14 = 1;
        int i15 = 0;
        int i16 = 1;
        int i17 = 0;
        while (i16 < this.f360089e) {
            i17++;
            i16 <<= 1;
        }
        this.f360087c = 32 - i17;
        this.f360086b = i16 - 1;
        this.f360088d = new o[i16];
        int i18 = iMin / i16;
        while (i14 < (i16 * i18 < iMin ? i18 + 1 : i18)) {
            i14 <<= 1;
        }
        while (true) {
            o<K, V, E, S>[] oVarArr = this.f360088d;
            if (i15 >= oVarArr.length) {
                return;
            }
            oVarArr[i15] = this.f360091g.d(this, i14);
            i15++;
        }
    }

    public static ArrayList a(AbstractCollection abstractCollection) {
        ArrayList arrayList = new ArrayList(abstractCollection.size());
        C37325e2.a(arrayList, abstractCollection.iterator());
        return arrayList;
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public final int b(Object obj) {
        int iB2 = this.f360090f.b(obj);
        int i12 = iB2 + ((iB2 << 15) ^ (-12931));
        int i13 = i12 ^ (i12 >>> 10);
        int i14 = i13 + (i13 << 3);
        int i15 = i14 ^ (i14 >>> 6);
        int i16 = (i15 << 2) + (i15 << 14) + i15;
        return (i16 >>> 16) ^ i16;
    }

    public final o<K, V, E, S> c(int i12) {
        return this.f360088d[(i12 >>> this.f360087c) & this.f360086b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (o<K, V, E, S> oVar : this.f360088d) {
            if (oVar.f360131c != 0) {
                oVar.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = oVar.f360134f;
                    for (int i12 = 0; i12 < atomicReferenceArray.length(); i12++) {
                        atomicReferenceArray.set(i12, null);
                    }
                    oVar.e();
                    oVar.f360135g.set(0);
                    oVar.f360132d++;
                    oVar.f360131c = 0;
                    oVar.unlock();
                } catch (Throwable th2) {
                    oVar.unlock();
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@I41.a Object obj) {
        InterfaceC37448j interfaceC37448jD;
        boolean z12 = false;
        if (obj == null) {
            return false;
        }
        int iB2 = b(obj);
        o<K, V, E, S> oVarC = c(iB2);
        oVarC.getClass();
        try {
            if (oVarC.f360131c != 0 && (interfaceC37448jD = oVarC.d(iB2, obj)) != null) {
                if (interfaceC37448jD.getValue() != null) {
                    z12 = true;
                }
            }
            return z12;
        } finally {
            oVarC.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@I41.a Object obj) {
        Object value;
        boolean z12 = false;
        if (obj == null) {
            return false;
        }
        o<K, V, E, S>[] oVarArr = this.f360088d;
        long j12 = -1;
        int i12 = 0;
        while (i12 < 3) {
            int length = oVarArr.length;
            long j13 = 0;
            for (?? r102 = z12; r102 < length; r102++) {
                o<K, V, E, S> oVar = oVarArr[r102];
                int i13 = oVar.f360131c;
                AtomicReferenceArray<E> atomicReferenceArray = oVar.f360134f;
                for (?? r13 = z12; r13 < atomicReferenceArray.length(); r13++) {
                    for (E eB2 = atomicReferenceArray.get(r13); eB2 != null; eB2 = eB2.b()) {
                        if (eB2.getKey() == null || (value = eB2.getValue()) == null) {
                            oVar.n();
                            value = null;
                        }
                        if (value != null && this.f360091g.c().a().d(obj, value)) {
                            return true;
                        }
                    }
                }
                j13 += oVar.f360132d;
                z12 = false;
            }
            if (j13 == j12) {
                return false;
            }
            i12++;
            j12 = j13;
            z12 = false;
        }
        return z12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f360094j;
        if (set != null) {
            return set;
        }
        C37446h c37446h = new C37446h();
        this.f360094j = c37446h;
        return c37446h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    public final V get(@I41.a Object obj) {
        V v12 = null;
        if (obj == null) {
            return null;
        }
        int iB2 = b(obj);
        o<K, V, E, S> oVarC = c(iB2);
        oVarC.getClass();
        try {
            InterfaceC37448j interfaceC37448jD = oVarC.d(iB2, obj);
            if (interfaceC37448jD != null && (v12 = (V) interfaceC37448jD.getValue()) == null) {
                oVarC.n();
            }
            return v12;
        } finally {
            oVarC.g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        o<K, V, E, S>[] oVarArr = this.f360088d;
        long j12 = 0;
        for (int i12 = 0; i12 < oVarArr.length; i12++) {
            if (oVarArr[i12].f360131c != 0) {
                return false;
            }
            j12 += oVarArr[i12].f360132d;
        }
        if (j12 == 0) {
            return true;
        }
        for (int i13 = 0; i13 < oVarArr.length; i13++) {
            if (oVarArr[i13].f360131c != 0) {
                return false;
            }
            j12 -= oVarArr[i13].f360132d;
        }
        return j12 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f360092h;
        if (set != null) {
            return set;
        }
        m mVar = new m();
        this.f360092h = mVar;
        return mVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    @InterfaceC19845a
    public final V put(K k12, V v12) {
        k12.getClass();
        v12.getClass();
        int iB2 = b(k12);
        return (V) c(iB2).h(iB2, k12, v12, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @I41.a
    @InterfaceC19845a
    public final V putIfAbsent(K k12, V v12) {
        k12.getClass();
        v12.getClass();
        int iB2 = b(k12);
        return (V) c(iB2).h(iB2, k12, v12, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r10 = (V) r6.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r6.getValue() != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r2.f360132d++;
        r0 = r2.i(r5, r6);
        r1 = r2.f360131c - 1;
        r3.set(r4, r0);
        r2.f360131c = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        return r10;
     */
    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    @aZ0.InterfaceC19845a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(@I41.a java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r9.b(r10)
            com.google.common.collect.y2$o r2 = r9.c(r1)
            r2.lock()
            r2.k()     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.y2$j<K, V, E>> r3 = r2.f360134f     // Catch: java.lang.Throwable -> L5f
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L5f
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L5f
            com.google.common.collect.y2$j r5 = (com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j) r5     // Catch: java.lang.Throwable -> L5f
            r6 = r5
        L22:
            if (r6 == 0) goto L61
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L5f
            int r8 = r6.getHash()     // Catch: java.lang.Throwable -> L5f
            if (r8 != r1) goto L65
            if (r7 == 0) goto L65
            com.google.common.collect.y2<K, V, E extends com.google.common.collect.y2$j<K, V, E>, S extends com.google.common.collect.y2$o<K, V, E, S>> r8 = r2.f360130b     // Catch: java.lang.Throwable -> L5f
            com.google.common.base.n<java.lang.Object> r8 = r8.f360090f     // Catch: java.lang.Throwable -> L5f
            boolean r7 = r8.d(r10, r7)     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L65
            java.lang.Object r10 = r6.getValue()     // Catch: java.lang.Throwable -> L5f
            if (r10 == 0) goto L41
            goto L47
        L41:
            java.lang.Object r1 = r6.getValue()     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto L61
        L47:
            int r0 = r2.f360132d     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + 1
            r2.f360132d = r0     // Catch: java.lang.Throwable -> L5f
            com.google.common.collect.y2$j r0 = r2.i(r5, r6)     // Catch: java.lang.Throwable -> L5f
            int r1 = r2.f360131c     // Catch: java.lang.Throwable -> L5f
            int r1 = r1 + (-1)
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L5f
            r2.f360131c = r1     // Catch: java.lang.Throwable -> L5f
            r2.unlock()
            r0 = r10
            goto L6a
        L5f:
            r10 = move-exception
            goto L6b
        L61:
            r2.unlock()
            goto L6a
        L65:
            com.google.common.collect.y2$j r6 = r6.b()     // Catch: java.lang.Throwable -> L5f
            goto L22
        L6a:
            return r0
        L6b:
            r2.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentMapC37438y2.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @I41.a
    @aZ0.InterfaceC19845a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V replace(K r10, V r11) {
        /*
            r9 = this;
            r10.getClass()
            r11.getClass()
            int r0 = r9.b(r10)
            com.google.common.collect.y2$o r1 = r9.c(r0)
            r1.lock()
            r1.k()     // Catch: java.lang.Throwable -> L5d
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.y2$j<K, V, E>> r2 = r1.f360134f     // Catch: java.lang.Throwable -> L5d
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L5d
            int r3 = r3 + (-1)
            r3 = r3 & r0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L5d
            com.google.common.collect.y2$j r4 = (com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j) r4     // Catch: java.lang.Throwable -> L5d
            r5 = r4
        L24:
            r6 = 0
            if (r5 == 0) goto L5f
            java.lang.Object r7 = r5.getKey()     // Catch: java.lang.Throwable -> L5d
            int r8 = r5.getHash()     // Catch: java.lang.Throwable -> L5d
            if (r8 != r0) goto L71
            if (r7 == 0) goto L71
            com.google.common.collect.y2<K, V, E extends com.google.common.collect.y2$j<K, V, E>, S extends com.google.common.collect.y2$o<K, V, E, S>> r8 = r1.f360130b     // Catch: java.lang.Throwable -> L5d
            com.google.common.base.n<java.lang.Object> r8 = r8.f360090f     // Catch: java.lang.Throwable -> L5d
            boolean r7 = r8.d(r10, r7)     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L71
            java.lang.Object r10 = r5.getValue()     // Catch: java.lang.Throwable -> L5d
            if (r10 != 0) goto L63
            java.lang.Object r10 = r5.getValue()     // Catch: java.lang.Throwable -> L5d
            if (r10 != 0) goto L5f
            int r10 = r1.f360132d     // Catch: java.lang.Throwable -> L5d
            int r10 = r10 + 1
            r1.f360132d = r10     // Catch: java.lang.Throwable -> L5d
            com.google.common.collect.y2$j r10 = r1.i(r4, r5)     // Catch: java.lang.Throwable -> L5d
            int r11 = r1.f360131c     // Catch: java.lang.Throwable -> L5d
            int r11 = r11 + (-1)
            r2.set(r3, r10)     // Catch: java.lang.Throwable -> L5d
            r1.f360131c = r11     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r10 = move-exception
            goto L77
        L5f:
            r1.unlock()
            goto L76
        L63:
            int r0 = r1.f360132d     // Catch: java.lang.Throwable -> L5d
            int r0 = r0 + 1
            r1.f360132d = r0     // Catch: java.lang.Throwable -> L5d
            r1.m(r5, r11)     // Catch: java.lang.Throwable -> L5d
            r1.unlock()
            r6 = r10
            goto L76
        L71:
            com.google.common.collect.y2$j r5 = r5.b()     // Catch: java.lang.Throwable -> L5d
            goto L24
        L76:
            return r6
        L77:
            r1.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentMapC37438y2.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j12 = 0;
        for (int i12 = 0; i12 < this.f360088d.length; i12++) {
            j12 += r0[i12].f360131c;
        }
        return com.google.common.primitives.l.f(j12);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f360093i;
        if (collection != null) {
            return collection;
        }
        z zVar = new z();
        this.f360093i = zVar;
        return zVar;
    }

    public Object writeReplace() {
        k<K, V, E, S> kVar = this.f360091g;
        q qVarA = kVar.a();
        q qVarC = kVar.c();
        kVar.c().a();
        return new p(qVarA, qVarC, this.f360090f, this.f360089e, this);
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$B */
    public static final class B<K> extends o<K, C37433x2.a, A<K>, B<K>> {

        /* renamed from: i, reason: collision with root package name */
        public final ReferenceQueue<K> f360097i;

        public B(ConcurrentMapC37438y2<K, C37433x2.a, A<K>, B<K>> concurrentMapC37438y2, int i12) {
            super(concurrentMapC37438y2, i12);
            this.f360097i = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final void e() {
            while (this.f360097i.poll() != null) {
            }
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final void f() {
            a(this.f360097i);
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final o l() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$D */
    public static final class D<K, V> extends o<K, V, C<K, V>, D<K, V>> {

        /* renamed from: i, reason: collision with root package name */
        public final ReferenceQueue<K> f360101i;

        public D(ConcurrentMapC37438y2<K, V, C<K, V>, D<K, V>> concurrentMapC37438y2, int i12) {
            super(concurrentMapC37438y2, i12);
            this.f360101i = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final void e() {
            while (this.f360101i.poll() != null) {
            }
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final void f() {
            a(this.f360101i);
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final o l() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$F */
    public static final class F<K, V> extends o<K, V, E<K, V>, F<K, V>> {

        /* renamed from: i, reason: collision with root package name */
        public final ReferenceQueue<K> f360105i;

        /* renamed from: j, reason: collision with root package name */
        public final ReferenceQueue<V> f360106j;

        public F(ConcurrentMapC37438y2<K, V, E<K, V>, F<K, V>> concurrentMapC37438y2, int i12) {
            super(concurrentMapC37438y2, i12);
            this.f360105i = new ReferenceQueue<>();
            this.f360106j = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final void e() {
            while (this.f360105i.poll() != null) {
            }
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final void f() {
            a(this.f360105i);
            b(this.f360106j);
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final o l() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$a, reason: case insensitive filesystem */
    public class C37439a implements H<Object, Object, C37444f> {
        @Override // com.google.common.collect.ConcurrentMapC37438y2.H
        @I41.a
        public final /* bridge */ /* synthetic */ InterfaceC37448j a() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ConcurrentMapC37438y2.H
        public final H b(ReferenceQueue referenceQueue, G g12) {
            return this;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.H
        @I41.a
        public final Object get() {
            return null;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.H
        public final void clear() {
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$o */
    public static abstract class o<K, V, E extends InterfaceC37448j<K, V, E>, S extends o<K, V, E, S>> extends ReentrantLock {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f360129h = 0;

        /* renamed from: b, reason: collision with root package name */
        @Weak
        public final ConcurrentMapC37438y2<K, V, E, S> f360130b;

        /* renamed from: c, reason: collision with root package name */
        public volatile int f360131c;

        /* renamed from: d, reason: collision with root package name */
        public int f360132d;

        /* renamed from: e, reason: collision with root package name */
        public int f360133e;

        /* renamed from: f, reason: collision with root package name */
        @I41.a
        public volatile AtomicReferenceArray<E> f360134f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f360135g = new AtomicInteger();

        public o(ConcurrentMapC37438y2<K, V, E, S> concurrentMapC37438y2, int i12) {
            this.f360130b = concurrentMapC37438y2;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i12);
            this.f360133e = (atomicReferenceArray.length() * 3) / 4;
            this.f360134f = atomicReferenceArray;
        }

        @InterfaceC25600a
        public final void a(ReferenceQueue<K> referenceQueue) {
            int i12 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                InterfaceC37448j interfaceC37448j = (InterfaceC37448j) referencePoll;
                ConcurrentMapC37438y2<K, V, E, S> concurrentMapC37438y2 = this.f360130b;
                concurrentMapC37438y2.getClass();
                int hash = interfaceC37448j.getHash();
                o<K, V, E, S> oVarC = concurrentMapC37438y2.c(hash);
                oVarC.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = oVarC.f360134f;
                    int length = hash & (atomicReferenceArray.length() - 1);
                    InterfaceC37448j interfaceC37448j2 = (InterfaceC37448j) atomicReferenceArray.get(length);
                    InterfaceC37448j interfaceC37448jB = interfaceC37448j2;
                    while (true) {
                        if (interfaceC37448jB == null) {
                            break;
                        }
                        if (interfaceC37448jB == interfaceC37448j) {
                            oVarC.f360132d++;
                            InterfaceC37448j interfaceC37448jI = oVarC.i(interfaceC37448j2, interfaceC37448jB);
                            int i13 = oVarC.f360131c - 1;
                            atomicReferenceArray.set(length, interfaceC37448jI);
                            oVarC.f360131c = i13;
                            break;
                        }
                        interfaceC37448jB = interfaceC37448jB.b();
                    }
                    i12++;
                } finally {
                    oVarC.unlock();
                }
            } while (i12 != 16);
        }

        @InterfaceC25600a
        public final void b(ReferenceQueue<V> referenceQueue) {
            int i12 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                H<K, V, E> h12 = (H) referencePoll;
                ConcurrentMapC37438y2<K, V, E, S> concurrentMapC37438y2 = this.f360130b;
                concurrentMapC37438y2.getClass();
                InterfaceC37448j interfaceC37448jA = h12.a();
                int hash = interfaceC37448jA.getHash();
                o<K, V, E, S> oVarC = concurrentMapC37438y2.c(hash);
                Object key = interfaceC37448jA.getKey();
                oVarC.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = oVarC.f360134f;
                    int length = (atomicReferenceArray.length() - 1) & hash;
                    InterfaceC37448j interfaceC37448j = (InterfaceC37448j) atomicReferenceArray.get(length);
                    InterfaceC37448j interfaceC37448jB = interfaceC37448j;
                    while (true) {
                        if (interfaceC37448jB == null) {
                            break;
                        }
                        Object key2 = interfaceC37448jB.getKey();
                        if (interfaceC37448jB.getHash() != hash || key2 == null || !oVarC.f360130b.f360090f.d(key, key2)) {
                            interfaceC37448jB = interfaceC37448jB.b();
                        } else if (((G) interfaceC37448jB).a() == h12) {
                            oVarC.f360132d++;
                            InterfaceC37448j interfaceC37448jI = oVarC.i(interfaceC37448j, interfaceC37448jB);
                            int i13 = oVarC.f360131c - 1;
                            atomicReferenceArray.set(length, interfaceC37448jI);
                            oVarC.f360131c = i13;
                        }
                    }
                    i12++;
                } finally {
                    oVarC.unlock();
                }
            } while (i12 != 16);
        }

        @InterfaceC25600a
        public final void c() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f360134f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i12 = this.f360131c;
            q41.h hVar = (AtomicReferenceArray<E>) new AtomicReferenceArray(length << 1);
            this.f360133e = (hVar.length() * 3) / 4;
            int length2 = hVar.length() - 1;
            for (int i13 = 0; i13 < length; i13++) {
                E eB2 = atomicReferenceArray.get(i13);
                if (eB2 != null) {
                    InterfaceC37448j interfaceC37448jB = eB2.b();
                    int hash = eB2.getHash() & length2;
                    if (interfaceC37448jB == null) {
                        hVar.set(hash, eB2);
                    } else {
                        InterfaceC37448j interfaceC37448j = eB2;
                        while (interfaceC37448jB != null) {
                            int hash2 = interfaceC37448jB.getHash() & length2;
                            if (hash2 != hash) {
                                interfaceC37448j = interfaceC37448jB;
                                hash = hash2;
                            }
                            interfaceC37448jB = interfaceC37448jB.b();
                        }
                        hVar.set(hash, interfaceC37448j);
                        while (eB2 != interfaceC37448j) {
                            int hash3 = eB2.getHash() & length2;
                            InterfaceC37448j interfaceC37448jB2 = this.f360130b.f360091g.b(l(), eB2, (InterfaceC37448j) hVar.get(hash3));
                            if (interfaceC37448jB2 != null) {
                                hVar.set(hash3, interfaceC37448jB2);
                            } else {
                                i12--;
                            }
                            eB2 = eB2.b();
                        }
                    }
                }
            }
            this.f360134f = hVar;
            this.f360131c = i12;
        }

        @I41.a
        public final InterfaceC37448j d(int i12, Object obj) {
            if (this.f360131c == 0) {
                return null;
            }
            for (E eB2 = this.f360134f.get((r0.length() - 1) & i12); eB2 != null; eB2 = eB2.b()) {
                if (eB2.getHash() == i12) {
                    Object key = eB2.getKey();
                    if (key == null) {
                        n();
                    } else if (this.f360130b.f360090f.d(obj, key)) {
                        return eB2;
                    }
                }
            }
            return null;
        }

        public final void g() {
            if ((this.f360135g.incrementAndGet() & 63) == 0) {
                k();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @I41.a
        public final Object h(int i12, Object obj, Object obj2, boolean z12) {
            lock();
            try {
                k();
                int i13 = this.f360131c + 1;
                if (i13 > this.f360133e) {
                    c();
                    i13 = this.f360131c + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f360134f;
                int length = (atomicReferenceArray.length() - 1) & i12;
                InterfaceC37448j interfaceC37448j = (InterfaceC37448j) atomicReferenceArray.get(length);
                for (InterfaceC37448j interfaceC37448jB = interfaceC37448j; interfaceC37448jB != null; interfaceC37448jB = interfaceC37448jB.b()) {
                    Object key = interfaceC37448jB.getKey();
                    if (interfaceC37448jB.getHash() == i12 && key != null && this.f360130b.f360090f.d(obj, key)) {
                        Object value = interfaceC37448jB.getValue();
                        if (value == null) {
                            this.f360132d++;
                            m(interfaceC37448jB, obj2);
                            this.f360131c = this.f360131c;
                            unlock();
                            return null;
                        }
                        if (z12) {
                            unlock();
                            return value;
                        }
                        this.f360132d++;
                        m(interfaceC37448jB, obj2);
                        unlock();
                        return value;
                    }
                }
                this.f360132d++;
                InterfaceC37448j interfaceC37448jF = this.f360130b.f360091g.f(l(), obj, i12, interfaceC37448j);
                m(interfaceC37448jF, obj2);
                atomicReferenceArray.set(length, interfaceC37448jF);
                this.f360131c = i13;
                unlock();
                return null;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        @I41.a
        @InterfaceC25600a
        public final E i(E e12, E e13) {
            int i12 = this.f360131c;
            E e14 = (E) e13.b();
            while (e12 != e13) {
                InterfaceC37448j interfaceC37448jB = this.f360130b.f360091g.b(l(), e12, e14);
                if (interfaceC37448jB != null) {
                    e14 = (E) interfaceC37448jB;
                } else {
                    i12--;
                }
                e12 = (E) e12.b();
            }
            this.f360131c = i12;
            return e14;
        }

        public final void k() {
            if (tryLock()) {
                try {
                    f();
                    this.f360135g.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S l();

        public final void m(E e12, V v12) {
            this.f360130b.f360091g.e(l(), e12, v12);
        }

        public final void n() {
            if (tryLock()) {
                try {
                    f();
                } finally {
                    unlock();
                }
            }
        }

        public void e() {
        }

        @InterfaceC25600a
        public void f() {
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$s */
    public static final class s<K> extends o<K, C37433x2.a, r<K>, s<K>> {
        public s() {
            throw null;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final o l() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$u */
    public static final class u<K, V> extends o<K, V, t<K, V>, u<K, V>> {
        public u() {
            throw null;
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final o l() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.y2$w */
    public static final class w<K, V> extends o<K, V, v<K, V>, w<K, V>> {

        /* renamed from: i, reason: collision with root package name */
        public final ReferenceQueue<V> f360147i;

        public w(ConcurrentMapC37438y2<K, V, v<K, V>, w<K, V>> concurrentMapC37438y2, int i12) {
            super(concurrentMapC37438y2, i12);
            this.f360147i = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final void e() {
            while (this.f360147i.poll() != null) {
            }
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final void f() {
            b(this.f360147i);
        }

        @Override // com.google.common.collect.ConcurrentMapC37438y2.o
        public final o l() {
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r2.f360130b.f360091g.c().a().d(r12, r7.getValue()) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r7.getValue() != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r2.f360132d++;
        r11 = r2.i(r6, r7);
        r12 = r2.f360131c - 1;
        r3.set(r4, r11);
        r2.f360131c = r12;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @aZ0.InterfaceC19845a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(@I41.a java.lang.Object r11, @I41.a java.lang.Object r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L7c
            if (r12 != 0) goto L7
            goto L7c
        L7:
            int r1 = r10.b(r11)
            com.google.common.collect.y2$o r2 = r10.c(r1)
            r2.lock()
            r2.k()     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.y2$j<K, V, E>> r3 = r2.f360134f     // Catch: java.lang.Throwable -> L70
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L70
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> L70
            com.google.common.collect.y2$j r6 = (com.google.common.collect.ConcurrentMapC37438y2.InterfaceC37448j) r6     // Catch: java.lang.Throwable -> L70
            r7 = r6
        L25:
            if (r7 == 0) goto L6c
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L70
            int r9 = r7.getHash()     // Catch: java.lang.Throwable -> L70
            if (r9 != r1) goto L72
            if (r8 == 0) goto L72
            com.google.common.collect.y2<K, V, E extends com.google.common.collect.y2$j<K, V, E>, S extends com.google.common.collect.y2$o<K, V, E, S>> r9 = r2.f360130b     // Catch: java.lang.Throwable -> L70
            com.google.common.base.n<java.lang.Object> r9 = r9.f360090f     // Catch: java.lang.Throwable -> L70
            boolean r8 = r9.d(r11, r8)     // Catch: java.lang.Throwable -> L70
            if (r8 == 0) goto L72
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L70
            com.google.common.collect.y2<K, V, E extends com.google.common.collect.y2$j<K, V, E>, S extends com.google.common.collect.y2$o<K, V, E, S>> r1 = r2.f360130b     // Catch: java.lang.Throwable -> L70
            com.google.common.collect.y2$k<K, V, E extends com.google.common.collect.y2$j<K, V, E>, S extends com.google.common.collect.y2$o<K, V, E, S>> r1 = r1.f360091g     // Catch: java.lang.Throwable -> L70
            com.google.common.collect.y2$q r1 = r1.c()     // Catch: java.lang.Throwable -> L70
            com.google.common.base.n r1 = r1.a()     // Catch: java.lang.Throwable -> L70
            boolean r11 = r1.d(r12, r11)     // Catch: java.lang.Throwable -> L70
            if (r11 == 0) goto L55
            r0 = r5
            goto L5b
        L55:
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L70
            if (r11 != 0) goto L6c
        L5b:
            int r11 = r2.f360132d     // Catch: java.lang.Throwable -> L70
            int r11 = r11 + r5
            r2.f360132d = r11     // Catch: java.lang.Throwable -> L70
            com.google.common.collect.y2$j r11 = r2.i(r6, r7)     // Catch: java.lang.Throwable -> L70
            int r12 = r2.f360131c     // Catch: java.lang.Throwable -> L70
            int r12 = r12 - r5
            r3.set(r4, r11)     // Catch: java.lang.Throwable -> L70
            r2.f360131c = r12     // Catch: java.lang.Throwable -> L70
        L6c:
            r2.unlock()
            goto L77
        L70:
            r11 = move-exception
            goto L78
        L72:
            com.google.common.collect.y2$j r7 = r7.b()     // Catch: java.lang.Throwable -> L70
            goto L25
        L77:
            return r0
        L78:
            r2.unlock()
            throw r11
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentMapC37438y2.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC19845a
    public final boolean replace(K k12, @I41.a V v12, V v13) {
        k12.getClass();
        v13.getClass();
        if (v12 == null) {
            return false;
        }
        int iB2 = b(k12);
        o<K, V, E, S> oVarC = c(iB2);
        oVarC.lock();
        try {
            oVarC.k();
            AtomicReferenceArray<E> atomicReferenceArray = oVarC.f360134f;
            int length = (atomicReferenceArray.length() - 1) & iB2;
            InterfaceC37448j interfaceC37448j = (InterfaceC37448j) atomicReferenceArray.get(length);
            InterfaceC37448j interfaceC37448jB = interfaceC37448j;
            while (true) {
                if (interfaceC37448jB == null) {
                    break;
                }
                Object key = interfaceC37448jB.getKey();
                if (interfaceC37448jB.getHash() == iB2 && key != null && oVarC.f360130b.f360090f.d(k12, key)) {
                    Object value = interfaceC37448jB.getValue();
                    if (value == null) {
                        if (interfaceC37448jB.getValue() == null) {
                            oVarC.f360132d++;
                            InterfaceC37448j interfaceC37448jI = oVarC.i(interfaceC37448j, interfaceC37448jB);
                            int i12 = oVarC.f360131c - 1;
                            atomicReferenceArray.set(length, interfaceC37448jI);
                            oVarC.f360131c = i12;
                        }
                    } else if (oVarC.f360130b.f360091g.c().a().d(v12, value)) {
                        oVarC.f360132d++;
                        oVarC.m(interfaceC37448jB, v13);
                        return true;
                    }
                } else {
                    interfaceC37448jB = interfaceC37448jB.b();
                }
            }
            return false;
        } finally {
            oVarC.unlock();
        }
    }
}
