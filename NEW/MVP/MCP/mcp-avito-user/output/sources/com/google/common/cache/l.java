package com.google.common.cache;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25600a;
import bZ0.InterfaceC25601b;
import com.google.common.base.AbstractC37270n;
import com.google.common.base.InterfaceC37276u;
import com.google.common.base.M;
import com.google.common.base.c0;
import com.google.common.base.d0;
import com.google.common.base.e0;
import com.google.common.base.i0;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.a;
import com.google.common.cache.d;
import com.google.common.cache.l;
import com.google.common.collect.AbstractC37370m;
import com.google.common.collect.C37325e2;
import com.google.common.collect.H1;
import com.google.common.util.concurrent.C37568u0;
import com.google.common.util.concurrent.D0;
import com.google.common.util.concurrent.Q0;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.e1;
import com.google.common.util.concurrent.p1;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import shark.AndroidResourceIdNames;

/* compiled from: LocalCache.java */
@XY0.b
/* loaded from: classes6.dex */
class l<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f359104x = Logger.getLogger(l.class.getName());

    /* renamed from: y, reason: collision with root package name */
    public static final C37282a f359105y = new C37282a();

    /* renamed from: z, reason: collision with root package name */
    public static final Queue<?> f359106z = new C37283b();

    /* renamed from: b, reason: collision with root package name */
    public final int f359107b;

    /* renamed from: c, reason: collision with root package name */
    public final int f359108c;

    /* renamed from: d, reason: collision with root package name */
    public final r<K, V>[] f359109d;

    /* renamed from: e, reason: collision with root package name */
    public final int f359110e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC37270n<Object> f359111f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC37270n<Object> f359112g;

    /* renamed from: h, reason: collision with root package name */
    public final t f359113h;

    /* renamed from: i, reason: collision with root package name */
    public final t f359114i;

    /* renamed from: j, reason: collision with root package name */
    public final long f359115j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.common.cache.y<K, V> f359116k;

    /* renamed from: l, reason: collision with root package name */
    public final long f359117l;

    /* renamed from: m, reason: collision with root package name */
    public final long f359118m;

    /* renamed from: n, reason: collision with root package name */
    public final long f359119n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractQueue f359120o;

    /* renamed from: p, reason: collision with root package name */
    public final com.google.common.cache.u<K, V> f359121p;

    /* renamed from: q, reason: collision with root package name */
    public final i0 f359122q;

    /* renamed from: r, reason: collision with root package name */
    public final EnumC37287f f359123r;

    /* renamed from: s, reason: collision with root package name */
    public final a.b f359124s;

    /* renamed from: t, reason: collision with root package name */
    @I41.a
    public final CacheLoader<? super K, V> f359125t;

    /* renamed from: u, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    public Set<K> f359126u;

    /* renamed from: v, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    public Collection<V> f359127v;

    /* renamed from: w, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    public Set<Map.Entry<K, V>> f359128w;

    /* compiled from: LocalCache.java */
    public interface A<K, V> {
        @I41.a
        com.google.common.cache.t<K, V> a();

        void b(@I41.a V v12);

        V c();

        A<K, V> d(ReferenceQueue<V> referenceQueue, @I41.a V v12, com.google.common.cache.t<K, V> tVar);

        @I41.a
        V get();

        int getWeight();

        boolean isActive();

        boolean isLoading();
    }

    /* compiled from: LocalCache.java */
    public final class B extends AbstractCollection<V> {
        public B() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return l.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return l.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return l.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return l.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) l.a(this).toArray(eArr);
        }
    }

    /* compiled from: LocalCache.java */
    public static final class C<K, V> extends E<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public volatile long f359130e;

        /* renamed from: f, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359131f;

        /* renamed from: g, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359132g;

        public C() {
            throw null;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> e() {
            return this.f359132g;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void h(com.google.common.cache.t<K, V> tVar) {
            this.f359131f = tVar;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void i(com.google.common.cache.t<K, V> tVar) {
            this.f359132g = tVar;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void l(long j12) {
            this.f359130e = j12;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> n() {
            return this.f359131f;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final long o() {
            return this.f359130e;
        }
    }

    /* compiled from: LocalCache.java */
    public static final class D<K, V> extends E<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public volatile long f359133e;

        /* renamed from: f, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359134f;

        /* renamed from: g, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359135g;

        /* renamed from: h, reason: collision with root package name */
        public volatile long f359136h;

        /* renamed from: i, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359137i;

        /* renamed from: j, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359138j;

        public D() {
            throw null;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> c() {
            return this.f359138j;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> e() {
            return this.f359135g;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> f() {
            return this.f359137i;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void h(com.google.common.cache.t<K, V> tVar) {
            this.f359134f = tVar;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void i(com.google.common.cache.t<K, V> tVar) {
            this.f359135g = tVar;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final long k() {
            return this.f359136h;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void l(long j12) {
            this.f359133e = j12;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void m(long j12) {
            this.f359136h = j12;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> n() {
            return this.f359134f;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final long o() {
            return this.f359133e;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void p(com.google.common.cache.t<K, V> tVar) {
            this.f359137i = tVar;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void q(com.google.common.cache.t<K, V> tVar) {
            this.f359138j = tVar;
        }
    }

    /* compiled from: LocalCache.java */
    public static class E<K, V> extends WeakReference<K> implements com.google.common.cache.t<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final int f359139b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public final com.google.common.cache.t<K, V> f359140c;

        /* renamed from: d, reason: collision with root package name */
        public volatile A<K, V> f359141d;

        public E(int i12, @I41.a com.google.common.cache.t tVar, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f359141d = l.f359105y;
            this.f359139b = i12;
            this.f359140c = tVar;
        }

        @Override // com.google.common.cache.t
        public final A<K, V> a() {
            return this.f359141d;
        }

        @Override // com.google.common.cache.t
        public final com.google.common.cache.t<K, V> b() {
            return this.f359140c;
        }

        public com.google.common.cache.t<K, V> c() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public final void d(A<K, V> a12) {
            this.f359141d = a12;
        }

        public com.google.common.cache.t<K, V> e() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.t<K, V> f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public final int getHash() {
            return this.f359139b;
        }

        @Override // com.google.common.cache.t
        public final K getKey() {
            return get();
        }

        public void h(com.google.common.cache.t<K, V> tVar) {
            throw new UnsupportedOperationException();
        }

        public void i(com.google.common.cache.t<K, V> tVar) {
            throw new UnsupportedOperationException();
        }

        public long k() {
            throw new UnsupportedOperationException();
        }

        public void l(long j12) {
            throw new UnsupportedOperationException();
        }

        public void m(long j12) {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.t<K, V> n() {
            throw new UnsupportedOperationException();
        }

        public long o() {
            throw new UnsupportedOperationException();
        }

        public void p(com.google.common.cache.t<K, V> tVar) {
            throw new UnsupportedOperationException();
        }

        public void q(com.google.common.cache.t<K, V> tVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: LocalCache.java */
    public static final class G<K, V> extends E<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public volatile long f359143e;

        /* renamed from: f, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359144f;

        /* renamed from: g, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359145g;

        public G() {
            throw null;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> c() {
            return this.f359145g;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> f() {
            return this.f359144f;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final long k() {
            return this.f359143e;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void m(long j12) {
            this.f359143e = j12;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void p(com.google.common.cache.t<K, V> tVar) {
            this.f359144f = tVar;
        }

        @Override // com.google.common.cache.l.E, com.google.common.cache.t
        public final void q(com.google.common.cache.t<K, V> tVar) {
            this.f359145g = tVar;
        }
    }

    /* compiled from: LocalCache.java */
    public static final class H<K, V> extends s<K, V> {

        /* renamed from: c, reason: collision with root package name */
        public final int f359146c;

        public H(int i12, com.google.common.cache.t tVar, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, tVar);
            this.f359146c = i12;
        }

        @Override // com.google.common.cache.l.s, com.google.common.cache.l.A
        public final A<K, V> d(ReferenceQueue<V> referenceQueue, V v12, com.google.common.cache.t<K, V> tVar) {
            return new H(this.f359146c, tVar, v12, referenceQueue);
        }

        @Override // com.google.common.cache.l.s, com.google.common.cache.l.A
        public final int getWeight() {
            return this.f359146c;
        }
    }

    /* compiled from: LocalCache.java */
    public static final class I<K, V> extends x<K, V> {

        /* renamed from: c, reason: collision with root package name */
        public final int f359147c;

        public I(V v12, int i12) {
            super(v12);
            this.f359147c = i12;
        }

        @Override // com.google.common.cache.l.x, com.google.common.cache.l.A
        public final int getWeight() {
            return this.f359147c;
        }
    }

    /* compiled from: LocalCache.java */
    public static final class J<K, V> extends F<K, V> {

        /* renamed from: c, reason: collision with root package name */
        public final int f359148c;

        public J(int i12, com.google.common.cache.t tVar, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, tVar);
            this.f359148c = i12;
        }

        @Override // com.google.common.cache.l.F, com.google.common.cache.l.A
        public final A<K, V> d(ReferenceQueue<V> referenceQueue, V v12, com.google.common.cache.t<K, V> tVar) {
            return new J(this.f359148c, tVar, v12, referenceQueue);
        }

        @Override // com.google.common.cache.l.F, com.google.common.cache.l.A
        public final int getWeight() {
            return this.f359148c;
        }
    }

    /* compiled from: LocalCache.java */
    public final class L implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final K f359153b;

        /* renamed from: c, reason: collision with root package name */
        public V f359154c;

        public L(K k12, V v12) {
            this.f359153b = k12;
            this.f359154c = v12;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f359153b.equals(entry.getKey()) && this.f359154c.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f359153b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f359154c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f359153b.hashCode() ^ this.f359154c.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v12) {
            V v13 = (V) l.this.put(this.f359153b, v12);
            this.f359154c = v12;
            return v13;
        }

        public final String toString() {
            return this.f359153b + ContainerUtils.KEY_VALUE_DELIMITER + this.f359154c;
        }
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$b, reason: case insensitive filesystem */
    public class C37283b extends AbstractQueue<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            return H1.E().iterator();
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        @I41.a
        public final Object peek() {
            return null;
        }

        @Override // java.util.Queue
        @I41.a
        public final Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$c, reason: case insensitive filesystem */
    public abstract class AbstractC37284c<T> extends AbstractSet<T> {
        public AbstractC37284c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return l.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return l.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return l.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) l.a(this).toArray(eArr);
        }
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$d, reason: case insensitive filesystem */
    public static abstract class AbstractC37285d<K, V> implements com.google.common.cache.t<K, V> {
        @Override // com.google.common.cache.t
        public A<K, V> a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public com.google.common.cache.t<K, V> b() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public com.google.common.cache.t<K, V> c() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public void d(A<K, V> a12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public com.google.common.cache.t<K, V> e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public com.google.common.cache.t<K, V> f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public void h(com.google.common.cache.t<K, V> tVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public void i(com.google.common.cache.t<K, V> tVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public long k() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public void l(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public void m(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public com.google.common.cache.t<K, V> n() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public long o() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public void p(com.google.common.cache.t<K, V> tVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.t
        public void q(com.google.common.cache.t<K, V> tVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$f, reason: case insensitive filesystem */
    public static abstract class EnumC37287f {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC37287f[] f359161b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumC37287f[] f359162c;

        /* JADX INFO: Fake field, exist only in values array */
        EnumC37287f EF9;

        /* compiled from: LocalCache.java */
        /* renamed from: com.google.common.cache.l$f$a */
        public enum a extends EnumC37287f {
            @Override // com.google.common.cache.l.EnumC37287f
            public final com.google.common.cache.t d(int i12, r rVar, @I41.a com.google.common.cache.t tVar, Object obj) {
                return new w(obj, i12, tVar);
            }
        }

        /* compiled from: LocalCache.java */
        /* renamed from: com.google.common.cache.l$f$b */
        public enum b extends EnumC37287f {
            @Override // com.google.common.cache.l.EnumC37287f
            public final <K, V> com.google.common.cache.t<K, V> b(r<K, V> rVar, com.google.common.cache.t<K, V> tVar, com.google.common.cache.t<K, V> tVar2, K k12) {
                com.google.common.cache.t<K, V> tVarB = super.b(rVar, tVar, tVar2, k12);
                EnumC37287f.a(tVar, tVarB);
                return tVarB;
            }

            @Override // com.google.common.cache.l.EnumC37287f
            public final com.google.common.cache.t d(int i12, r rVar, @I41.a com.google.common.cache.t tVar, Object obj) {
                u uVar = new u(obj, i12, tVar);
                uVar.f359213f = Long.MAX_VALUE;
                Logger logger = l.f359104x;
                q qVar = q.f359191b;
                uVar.f359214g = qVar;
                uVar.f359215h = qVar;
                return uVar;
            }
        }

        /* compiled from: LocalCache.java */
        /* renamed from: com.google.common.cache.l$f$c */
        public enum c extends EnumC37287f {
            @Override // com.google.common.cache.l.EnumC37287f
            public final <K, V> com.google.common.cache.t<K, V> b(r<K, V> rVar, com.google.common.cache.t<K, V> tVar, com.google.common.cache.t<K, V> tVar2, K k12) {
                com.google.common.cache.t<K, V> tVarB = super.b(rVar, tVar, tVar2, k12);
                EnumC37287f.c(tVar, tVarB);
                return tVarB;
            }

            @Override // com.google.common.cache.l.EnumC37287f
            public final com.google.common.cache.t d(int i12, r rVar, @I41.a com.google.common.cache.t tVar, Object obj) {
                y yVar = new y(obj, i12, tVar);
                yVar.f359227f = Long.MAX_VALUE;
                Logger logger = l.f359104x;
                q qVar = q.f359191b;
                yVar.f359228g = qVar;
                yVar.f359229h = qVar;
                return yVar;
            }
        }

        /* compiled from: LocalCache.java */
        /* renamed from: com.google.common.cache.l$f$d */
        public enum d extends EnumC37287f {
            @Override // com.google.common.cache.l.EnumC37287f
            public final <K, V> com.google.common.cache.t<K, V> b(r<K, V> rVar, com.google.common.cache.t<K, V> tVar, com.google.common.cache.t<K, V> tVar2, K k12) {
                com.google.common.cache.t<K, V> tVarB = super.b(rVar, tVar, tVar2, k12);
                EnumC37287f.a(tVar, tVarB);
                EnumC37287f.c(tVar, tVarB);
                return tVarB;
            }

            @Override // com.google.common.cache.l.EnumC37287f
            public final com.google.common.cache.t d(int i12, r rVar, @I41.a com.google.common.cache.t tVar, Object obj) {
                v vVar = new v(obj, i12, tVar);
                vVar.f359216f = Long.MAX_VALUE;
                Logger logger = l.f359104x;
                q qVar = q.f359191b;
                vVar.f359217g = qVar;
                vVar.f359218h = qVar;
                vVar.f359219i = Long.MAX_VALUE;
                vVar.f359220j = qVar;
                vVar.f359221k = qVar;
                return vVar;
            }
        }

        /* compiled from: LocalCache.java */
        /* renamed from: com.google.common.cache.l$f$e */
        public enum e extends EnumC37287f {
            @Override // com.google.common.cache.l.EnumC37287f
            public final com.google.common.cache.t d(int i12, r rVar, @I41.a com.google.common.cache.t tVar, Object obj) {
                return new E(i12, tVar, obj, rVar.f359201i);
            }
        }

        /* compiled from: LocalCache.java */
        /* renamed from: com.google.common.cache.l$f$f, reason: collision with other inner class name */
        public enum C10656f extends EnumC37287f {
            @Override // com.google.common.cache.l.EnumC37287f
            public final <K, V> com.google.common.cache.t<K, V> b(r<K, V> rVar, com.google.common.cache.t<K, V> tVar, com.google.common.cache.t<K, V> tVar2, K k12) {
                com.google.common.cache.t<K, V> tVarB = super.b(rVar, tVar, tVar2, k12);
                EnumC37287f.a(tVar, tVarB);
                return tVarB;
            }

            @Override // com.google.common.cache.l.EnumC37287f
            public final com.google.common.cache.t d(int i12, r rVar, @I41.a com.google.common.cache.t tVar, Object obj) {
                C c12 = new C(i12, tVar, obj, rVar.f359201i);
                c12.f359130e = Long.MAX_VALUE;
                Logger logger = l.f359104x;
                q qVar = q.f359191b;
                c12.f359131f = qVar;
                c12.f359132g = qVar;
                return c12;
            }
        }

        /* compiled from: LocalCache.java */
        /* renamed from: com.google.common.cache.l$f$g */
        public enum g extends EnumC37287f {
            @Override // com.google.common.cache.l.EnumC37287f
            public final <K, V> com.google.common.cache.t<K, V> b(r<K, V> rVar, com.google.common.cache.t<K, V> tVar, com.google.common.cache.t<K, V> tVar2, K k12) {
                com.google.common.cache.t<K, V> tVarB = super.b(rVar, tVar, tVar2, k12);
                EnumC37287f.c(tVar, tVarB);
                return tVarB;
            }

            @Override // com.google.common.cache.l.EnumC37287f
            public final com.google.common.cache.t d(int i12, r rVar, @I41.a com.google.common.cache.t tVar, Object obj) {
                G g12 = new G(i12, tVar, obj, rVar.f359201i);
                g12.f359143e = Long.MAX_VALUE;
                Logger logger = l.f359104x;
                q qVar = q.f359191b;
                g12.f359144f = qVar;
                g12.f359145g = qVar;
                return g12;
            }
        }

        /* compiled from: LocalCache.java */
        /* renamed from: com.google.common.cache.l$f$h */
        public enum h extends EnumC37287f {
            @Override // com.google.common.cache.l.EnumC37287f
            public final <K, V> com.google.common.cache.t<K, V> b(r<K, V> rVar, com.google.common.cache.t<K, V> tVar, com.google.common.cache.t<K, V> tVar2, K k12) {
                com.google.common.cache.t<K, V> tVarB = super.b(rVar, tVar, tVar2, k12);
                EnumC37287f.a(tVar, tVarB);
                EnumC37287f.c(tVar, tVarB);
                return tVarB;
            }

            @Override // com.google.common.cache.l.EnumC37287f
            public final com.google.common.cache.t d(int i12, r rVar, @I41.a com.google.common.cache.t tVar, Object obj) {
                D d12 = new D(i12, tVar, obj, rVar.f359201i);
                d12.f359133e = Long.MAX_VALUE;
                Logger logger = l.f359104x;
                q qVar = q.f359191b;
                d12.f359134f = qVar;
                d12.f359135g = qVar;
                d12.f359136h = Long.MAX_VALUE;
                d12.f359137i = qVar;
                d12.f359138j = qVar;
                return d12;
            }
        }

        static {
            a aVar = new a("STRONG", 0, null);
            b bVar = new b("STRONG_ACCESS", 1, null);
            c cVar = new c("STRONG_WRITE", 2, null);
            d dVar = new d("STRONG_ACCESS_WRITE", 3, null);
            e eVar = new e("WEAK", 4, null);
            C10656f c10656f = new C10656f("WEAK_ACCESS", 5, null);
            g gVar = new g("WEAK_WRITE", 6, null);
            h hVar = new h("WEAK_ACCESS_WRITE", 7, null);
            f359162c = new EnumC37287f[]{aVar, bVar, cVar, dVar, eVar, c10656f, gVar, hVar};
            f359161b = new EnumC37287f[]{aVar, bVar, cVar, dVar, eVar, c10656f, gVar, hVar};
        }

        public EnumC37287f() {
            throw null;
        }

        public EnumC37287f(String str, int i12, C37282a c37282a) {
        }

        public static void a(com.google.common.cache.t tVar, com.google.common.cache.t tVar2) {
            tVar2.l(tVar.o());
            com.google.common.cache.t<K, V> tVarE = tVar.e();
            Logger logger = l.f359104x;
            tVarE.h(tVar2);
            tVar2.i(tVarE);
            com.google.common.cache.t<K, V> tVarN = tVar.n();
            tVar2.h(tVarN);
            tVarN.i(tVar2);
            q qVar = q.f359191b;
            tVar.h(qVar);
            tVar.i(qVar);
        }

        public static void c(com.google.common.cache.t tVar, com.google.common.cache.t tVar2) {
            tVar2.m(tVar.k());
            com.google.common.cache.t<K, V> tVarC = tVar.c();
            Logger logger = l.f359104x;
            tVarC.p(tVar2);
            tVar2.q(tVarC);
            com.google.common.cache.t<K, V> tVarF = tVar.f();
            tVar2.p(tVarF);
            tVarF.q(tVar2);
            q qVar = q.f359191b;
            tVar.p(qVar);
            tVar.q(qVar);
        }

        public static EnumC37287f valueOf(String str) {
            return (EnumC37287f) Enum.valueOf(EnumC37287f.class, str);
        }

        public static EnumC37287f[] values() {
            return (EnumC37287f[]) f359162c.clone();
        }

        public <K, V> com.google.common.cache.t<K, V> b(r<K, V> rVar, com.google.common.cache.t<K, V> tVar, com.google.common.cache.t<K, V> tVar2, K k12) {
            return d(tVar.getHash(), rVar, tVar2, k12);
        }

        public abstract com.google.common.cache.t d(int i12, r rVar, @I41.a com.google.common.cache.t tVar, Object obj);
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$g, reason: case insensitive filesystem */
    public final class C37288g extends l<K, V>.AbstractC37290i<Map.Entry<K, V>> {
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$h, reason: case insensitive filesystem */
    public final class C37289h extends l<K, V>.AbstractC37284c<Map.Entry<K, V>> {
        public C37289h() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            l lVar;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (lVar = l.this).get(key)) != null && lVar.f359112g.d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C37288g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && l.this.remove(key, entry.getValue());
        }
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$i, reason: case insensitive filesystem */
    public abstract class AbstractC37290i<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public int f359164b;

        /* renamed from: c, reason: collision with root package name */
        public int f359165c = -1;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public r<K, V> f359166d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public AtomicReferenceArray<com.google.common.cache.t<K, V>> f359167e;

        /* renamed from: f, reason: collision with root package name */
        @I41.a
        public com.google.common.cache.t<K, V> f359168f;

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        public l<K, V>.L f359169g;

        /* renamed from: h, reason: collision with root package name */
        @I41.a
        public l<K, V>.L f359170h;

        public AbstractC37290i() {
            this.f359164b = l.this.f359109d.length - 1;
            a();
        }

        public final void a() {
            this.f359169g = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i12 = this.f359164b;
                if (i12 < 0) {
                    return;
                }
                r<K, V>[] rVarArr = l.this.f359109d;
                this.f359164b = i12 - 1;
                r<K, V> rVar = rVarArr[i12];
                this.f359166d = rVar;
                if (rVar.f359195c != 0) {
                    this.f359167e = this.f359166d.f359199g;
                    this.f359165c = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public final boolean b(com.google.common.cache.t<K, V> tVar) {
            V v12;
            l lVar = l.this;
            try {
                long jA2 = lVar.f359122q.a();
                K key = tVar.getKey();
                V v13 = null;
                if (tVar.getKey() != null && (v12 = tVar.a().get()) != null && !lVar.f(tVar, jA2)) {
                    v13 = v12;
                }
                if (v13 == null) {
                    this.f359166d.m();
                    return false;
                }
                this.f359169g = new L(key, v13);
                this.f359166d.m();
                return true;
            } catch (Throwable th2) {
                this.f359166d.m();
                throw th2;
            }
        }

        public final l<K, V>.L c() {
            l<K, V>.L l12 = this.f359169g;
            if (l12 == null) {
                throw new NoSuchElementException();
            }
            this.f359170h = l12;
            a();
            return this.f359170h;
        }

        public final boolean d() {
            com.google.common.cache.t<K, V> tVar = this.f359168f;
            if (tVar == null) {
                return false;
            }
            while (true) {
                this.f359168f = tVar.b();
                com.google.common.cache.t<K, V> tVar2 = this.f359168f;
                if (tVar2 == null) {
                    return false;
                }
                if (b(tVar2)) {
                    return true;
                }
                tVar = this.f359168f;
            }
        }

        public final boolean e() {
            while (true) {
                int i12 = this.f359165c;
                if (i12 < 0) {
                    return false;
                }
                AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = this.f359167e;
                this.f359165c = i12 - 1;
                com.google.common.cache.t<K, V> tVar = atomicReferenceArray.get(i12);
                this.f359168f = tVar;
                if (tVar != null && (b(tVar) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359169g != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public final void remove() {
            M.q(this.f359170h != null);
            l.this.remove(this.f359170h.f359153b);
            this.f359170h = null;
        }
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$j, reason: case insensitive filesystem */
    public final class C37291j extends l<K, V>.AbstractC37290i<K> {
        @Override // com.google.common.cache.l.AbstractC37290i, java.util.Iterator
        public final K next() {
            return c().f359153b;
        }
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$k, reason: case insensitive filesystem */
    public final class C37292k extends l<K, V>.AbstractC37284c<K> {
        public C37292k() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return l.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new C37291j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return l.this.remove(obj) != null;
        }
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$l, reason: collision with other inner class name */
    public static final class C10657l<K, V> extends p<K, V> implements k<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: o, reason: collision with root package name */
        @I41.a
        public transient k<K, V> f359173o;

        public C10657l() {
            throw null;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f359173o = (k<K, V>) Z().a(this.f359189m);
        }

        private Object readResolve() {
            return this.f359173o;
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final V apply(K k12) {
            return (V) ((n) this.f359173o).apply(k12);
        }
    }

    /* compiled from: LocalCache.java */
    public static class n<K, V> extends o<K, V> implements k<K, V> {
        private static final long serialVersionUID = 1;

        public n() {
            throw null;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final V apply(K k12) {
            try {
                return get(k12);
            } catch (ExecutionException e12) {
                throw new UncheckedExecutionException(e12.getCause());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[Catch: all -> 0x003f, ExecutionException -> 0x0041, TRY_LEAVE, TryCatch #0 {ExecutionException -> 0x0041, blocks: (B:3:0x0015, B:5:0x0019, B:7:0x001f, B:9:0x002d, B:15:0x0043, B:17:0x004d, B:18:0x0052), top: B:32:0x0015, outer: #1 }] */
        @Override // com.google.common.cache.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final V get(K r10) {
            /*
                r9 = this;
                com.google.common.cache.l<K, V> r0 = r9.f359177b
                com.google.common.cache.CacheLoader<? super K, V> r8 = r0.f359125t
                r10.getClass()
                int r4 = r0.e(r10)
                com.google.common.cache.l$r r0 = r0.g(r4)
                r0.getClass()
                r8.getClass()
                int r1 = r0.f359195c     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                if (r1 == 0) goto L52
                com.google.common.cache.t r2 = r0.i(r4, r10)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                if (r2 == 0) goto L52
                com.google.common.cache.l<K, V> r1 = r0.f359194b     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                com.google.common.base.i0 r1 = r1.f359122q     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                long r6 = r1.a()     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                java.lang.Object r5 = r0.k(r2, r6)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                if (r5 == 0) goto L43
                r0.p(r2, r6)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                com.google.common.cache.a$b r1 = r0.f359207o     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                r1.d()     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                r1 = r0
                r3 = r10
                java.lang.Object r10 = r1.w(r2, r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
            L3b:
                r0.m()
                goto L57
            L3f:
                r10 = move-exception
                goto L73
            L41:
                r10 = move-exception
                goto L58
            L43:
                com.google.common.cache.l$A r1 = r2.a()     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                boolean r3 = r1.isLoading()     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                if (r3 == 0) goto L52
                java.lang.Object r10 = r0.A(r2, r10, r1)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                goto L3b
            L52:
                java.lang.Object r10 = r0.l(r10, r4, r8)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.ExecutionException -> L41
                goto L3b
            L57:
                return r10
            L58:
                java.lang.Throwable r1 = r10.getCause()     // Catch: java.lang.Throwable -> L3f
                boolean r2 = r1 instanceof java.lang.Error     // Catch: java.lang.Throwable -> L3f
                if (r2 != 0) goto L6b
                boolean r2 = r1 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L3f
                if (r2 == 0) goto L6a
                com.google.common.util.concurrent.UncheckedExecutionException r10 = new com.google.common.util.concurrent.UncheckedExecutionException     // Catch: java.lang.Throwable -> L3f
                r10.<init>(r1)     // Catch: java.lang.Throwable -> L3f
                throw r10     // Catch: java.lang.Throwable -> L3f
            L6a:
                throw r10     // Catch: java.lang.Throwable -> L3f
            L6b:
                com.google.common.util.concurrent.c0 r10 = new com.google.common.util.concurrent.c0     // Catch: java.lang.Throwable -> L3f
                java.lang.Error r1 = (java.lang.Error) r1     // Catch: java.lang.Throwable -> L3f
                r10.<init>(r1)     // Catch: java.lang.Throwable -> L3f
                throw r10     // Catch: java.lang.Throwable -> L3f
            L73:
                r0.m()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.l.n.get(java.lang.Object):java.lang.Object");
        }

        @Override // com.google.common.cache.l.o
        public Object writeReplace() {
            return new C10657l(this.f359177b);
        }
    }

    /* compiled from: LocalCache.java */
    public static class o<K, V> implements c<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final l<K, V> f359177b;

        public o() {
            throw null;
        }

        public /* synthetic */ o(l lVar, C37282a c37282a) {
            this(lVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        public Object writeReplace() {
            return new p(this.f359177b);
        }

        public o(l<K, V> lVar) {
            this.f359177b = lVar;
        }
    }

    /* compiled from: LocalCache.java */
    public static class p<K, V> extends i<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final t f359178b;

        /* renamed from: c, reason: collision with root package name */
        public final t f359179c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC37270n<Object> f359180d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC37270n<Object> f359181e;

        /* renamed from: f, reason: collision with root package name */
        public final long f359182f;

        /* renamed from: g, reason: collision with root package name */
        public final long f359183g;

        /* renamed from: h, reason: collision with root package name */
        public final long f359184h;

        /* renamed from: i, reason: collision with root package name */
        public final com.google.common.cache.y<K, V> f359185i;

        /* renamed from: j, reason: collision with root package name */
        public final int f359186j;

        /* renamed from: k, reason: collision with root package name */
        public final com.google.common.cache.u<? super K, ? super V> f359187k;

        /* renamed from: l, reason: collision with root package name */
        @I41.a
        public final i0 f359188l;

        /* renamed from: m, reason: collision with root package name */
        public final CacheLoader<? super K, V> f359189m;

        /* renamed from: n, reason: collision with root package name */
        @I41.a
        public transient c<K, V> f359190n;

        public p() {
            throw null;
        }

        public p(l<K, V> lVar) {
            this.f359178b = lVar.f359113h;
            this.f359179c = lVar.f359114i;
            this.f359180d = lVar.f359111f;
            this.f359181e = lVar.f359112g;
            this.f359182f = lVar.f359118m;
            this.f359183g = lVar.f359117l;
            this.f359184h = lVar.f359115j;
            this.f359185i = lVar.f359116k;
            this.f359186j = lVar.f359110e;
            this.f359187k = lVar.f359121p;
            i0 i0Var = i0.f359050a;
            i0 i0Var2 = lVar.f359122q;
            this.f359188l = (i0Var2 == i0Var || i0Var2 == d.f359083p) ? null : i0Var2;
            this.f359189m = lVar.f359125t;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            d<K, V> dVarZ = Z();
            dVarZ.b();
            this.f359190n = new o(new l(dVarZ, null));
        }

        private Object readResolve() {
            return this.f359190n;
        }

        @Override // com.google.common.cache.i, com.google.common.collect.S0
        public final Object X() {
            return this.f359190n;
        }

        @Override // com.google.common.cache.i
        /* renamed from: Y */
        public final c<K, V> X() {
            return this.f359190n;
        }

        public final d<K, V> Z() {
            d<K, V> dVar = new d<>();
            t tVar = dVar.f359089f;
            M.p("Key strength was already set to %s", tVar == null, tVar);
            t tVar2 = this.f359178b;
            tVar2.getClass();
            dVar.f359089f = tVar2;
            t tVar3 = dVar.f359090g;
            M.p("Value strength was already set to %s", tVar3 == null, tVar3);
            t tVar4 = this.f359179c;
            tVar4.getClass();
            dVar.f359090g = tVar4;
            AbstractC37270n<Object> abstractC37270n = dVar.f359093j;
            M.p("key equivalence was already set to %s", abstractC37270n == null, abstractC37270n);
            AbstractC37270n<Object> abstractC37270n2 = this.f359180d;
            abstractC37270n2.getClass();
            dVar.f359093j = abstractC37270n2;
            AbstractC37270n<Object> abstractC37270n3 = dVar.f359094k;
            M.p("value equivalence was already set to %s", abstractC37270n3 == null, abstractC37270n3);
            AbstractC37270n<Object> abstractC37270n4 = this.f359181e;
            abstractC37270n4.getClass();
            dVar.f359094k = abstractC37270n4;
            int i12 = dVar.f359085b;
            M.m(i12, "concurrency level was already set to %s", i12 == -1);
            int i13 = this.f359186j;
            M.g(i13 > 0);
            dVar.f359085b = i13;
            M.q(dVar.f359095l == null);
            com.google.common.cache.u<? super K, ? super V> uVar = this.f359187k;
            uVar.getClass();
            dVar.f359095l = uVar;
            dVar.f359084a = false;
            long j12 = this.f359182f;
            if (j12 > 0) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long j13 = dVar.f359091h;
                M.o("expireAfterWrite was already set to %s ns", j13 == -1, j13);
                if (j12 < 0) {
                    throw new IllegalArgumentException(d0.b("duration cannot be negative: %s %s", Long.valueOf(j12), timeUnit));
                }
                dVar.f359091h = timeUnit.toNanos(j12);
            }
            long j14 = this.f359183g;
            if (j14 > 0) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long j15 = dVar.f359092i;
                M.o("expireAfterAccess was already set to %s ns", j15 == -1, j15);
                if (j14 < 0) {
                    throw new IllegalArgumentException(d0.b("duration cannot be negative: %s %s", Long.valueOf(j14), timeUnit2));
                }
                dVar.f359092i = timeUnit2.toNanos(j14);
            }
            d.f fVar = d.f.f359101b;
            long j16 = this.f359184h;
            com.google.common.cache.y<K, V> yVar = this.f359185i;
            if (yVar != fVar) {
                M.q(dVar.f359088e == null);
                if (dVar.f359084a) {
                    long j17 = dVar.f359086c;
                    M.o("weigher can not be combined with maximum size (%s provided)", j17 == -1, j17);
                }
                yVar.getClass();
                dVar.f359088e = yVar;
                if (j16 != -1) {
                    long j18 = dVar.f359087d;
                    M.o("maximum weight was already set to %s", j18 == -1, j18);
                    long j19 = dVar.f359086c;
                    M.o("maximum size was already set to %s", j19 == -1, j19);
                    M.d("maximum weight must not be negative", j16 >= 0);
                    dVar.f359087d = j16;
                }
            } else if (j16 != -1) {
                long j22 = dVar.f359086c;
                M.o("maximum size was already set to %s", j22 == -1, j22);
                long j23 = dVar.f359087d;
                M.o("maximum weight was already set to %s", j23 == -1, j23);
                M.n("maximum size can not be combined with weigher", dVar.f359088e == null);
                M.d("maximum size must not be negative", j16 >= 0);
                dVar.f359086c = j16;
            }
            i0 i0Var = this.f359188l;
            if (i0Var != null) {
                M.q(dVar.f359096m == null);
                dVar.f359096m = i0Var;
            }
            return dVar;
        }
    }

    /* compiled from: LocalCache.java */
    public static class r<K, V> extends ReentrantLock {

        /* renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ int f359193p = 0;

        /* renamed from: b, reason: collision with root package name */
        @Weak
        public final l<K, V> f359194b;

        /* renamed from: c, reason: collision with root package name */
        public volatile int f359195c;

        /* renamed from: d, reason: collision with root package name */
        @InterfaceC25600a
        public long f359196d;

        /* renamed from: e, reason: collision with root package name */
        public int f359197e;

        /* renamed from: f, reason: collision with root package name */
        public int f359198f;

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        public volatile AtomicReferenceArray<com.google.common.cache.t<K, V>> f359199g;

        /* renamed from: h, reason: collision with root package name */
        public final long f359200h;

        /* renamed from: i, reason: collision with root package name */
        @I41.a
        public final ReferenceQueue<K> f359201i;

        /* renamed from: j, reason: collision with root package name */
        @I41.a
        public final ReferenceQueue<V> f359202j;

        /* renamed from: k, reason: collision with root package name */
        public final AbstractQueue f359203k;

        /* renamed from: l, reason: collision with root package name */
        public final AtomicInteger f359204l = new AtomicInteger();

        /* renamed from: m, reason: collision with root package name */
        @InterfaceC25600a
        public final AbstractQueue f359205m;

        /* renamed from: n, reason: collision with root package name */
        @InterfaceC25600a
        public final AbstractQueue f359206n;

        /* renamed from: o, reason: collision with root package name */
        public final a.b f359207o;

        public r(l<K, V> lVar, int i12, long j12, a.b bVar) {
            this.f359194b = lVar;
            this.f359200h = j12;
            bVar.getClass();
            this.f359207o = bVar;
            AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = new AtomicReferenceArray<>(i12);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f359198f = length;
            if (lVar.f359116k == d.f.f359101b && length == j12) {
                this.f359198f = length + 1;
            }
            this.f359199g = atomicReferenceArray;
            t.a aVar = t.f359209b;
            this.f359201i = lVar.f359113h != aVar ? new ReferenceQueue<>() : null;
            this.f359202j = lVar.f359114i != aVar ? new ReferenceQueue<>() : null;
            this.f359203k = (AbstractQueue) ((lVar.c() || lVar.b()) ? new ConcurrentLinkedQueue() : l.f359106z);
            this.f359205m = (AbstractQueue) (lVar.d() ? new K() : l.f359106z);
            this.f359206n = (AbstractQueue) ((lVar.c() || lVar.b()) ? new C37286e() : l.f359106z);
        }

        public final V A(com.google.common.cache.t<K, V> tVar, K k12, A<K, V> a12) {
            a.b bVar = this.f359207o;
            if (!a12.isLoading()) {
                throw new AssertionError();
            }
            M.p("Recursive load of: %s", !Thread.holdsLock(tVar), k12);
            try {
                V vC2 = a12.c();
                if (vC2 != null) {
                    p(tVar, this.f359194b.f359122q.a());
                    return vC2;
                }
                throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k12 + ".");
            } finally {
                bVar.c();
            }
        }

        @I41.a
        @InterfaceC25600a
        public final com.google.common.cache.t<K, V> a(com.google.common.cache.t<K, V> tVar, com.google.common.cache.t<K, V> tVar2) {
            K key = tVar.getKey();
            if (key == null) {
                return null;
            }
            A<K, V> a12 = tVar.a();
            V v12 = a12.get();
            if (v12 == null && a12.isActive()) {
                return null;
            }
            com.google.common.cache.t<K, V> tVarB = this.f359194b.f359123r.b(this, tVar, tVar2, key);
            tVarB.d(a12.d(this.f359202j, v12, tVarB));
            return tVarB;
        }

        @InterfaceC25600a
        public final void b() {
            while (true) {
                com.google.common.cache.t tVar = (com.google.common.cache.t) this.f359203k.poll();
                if (tVar == null) {
                    return;
                }
                AbstractQueue abstractQueue = this.f359206n;
                if (abstractQueue.contains(tVar)) {
                    abstractQueue.add(tVar);
                }
            }
        }

        @InterfaceC25600a
        public final void c() {
            l<K, V> lVar = this.f359194b;
            lVar.getClass();
            int i12 = 0;
            if (lVar.f359113h != t.f359209b) {
                int i13 = 0;
                do {
                    Reference<? extends K> referencePoll = this.f359201i.poll();
                    if (referencePoll == null) {
                        break;
                    }
                    com.google.common.cache.t<K, V> tVar = (com.google.common.cache.t) referencePoll;
                    l<K, V> lVar2 = this.f359194b;
                    lVar2.getClass();
                    int hash = tVar.getHash();
                    r<K, V> rVarG = lVar2.g(hash);
                    rVarG.lock();
                    try {
                        AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = rVarG.f359199g;
                        int length = hash & (atomicReferenceArray.length() - 1);
                        com.google.common.cache.t<K, V> tVar2 = atomicReferenceArray.get(length);
                        com.google.common.cache.t<K, V> tVarB = tVar2;
                        while (true) {
                            if (tVarB == null) {
                                break;
                            }
                            if (tVarB == tVar) {
                                rVarG.f359197e++;
                                com.google.common.cache.t<K, V> tVarT = rVarG.t(tVar2, tVarB, tVarB.getKey(), tVarB.a().get(), tVarB.a(), RemovalCause.f359072d);
                                int i14 = rVarG.f359195c - 1;
                                atomicReferenceArray.set(length, tVarT);
                                rVarG.f359195c = i14;
                                break;
                            }
                            tVarB = tVarB.b();
                        }
                        i13++;
                    } finally {
                        rVarG.unlock();
                        rVarG.v();
                    }
                } while (i13 != 16);
            }
            l<K, V> lVar3 = this.f359194b;
            lVar3.getClass();
            if (lVar3.f359114i != t.f359209b) {
                do {
                    Reference<? extends V> referencePoll2 = this.f359202j.poll();
                    if (referencePoll2 == null) {
                        return;
                    }
                    A<K, V> a12 = (A) referencePoll2;
                    l<K, V> lVar4 = this.f359194b;
                    lVar4.getClass();
                    com.google.common.cache.t<K, V> tVarA = a12.a();
                    int hash2 = tVarA.getHash();
                    r<K, V> rVarG2 = lVar4.g(hash2);
                    K key = tVarA.getKey();
                    rVarG2.lock();
                    try {
                        AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray2 = rVarG2.f359199g;
                        int length2 = hash2 & (atomicReferenceArray2.length() - 1);
                        com.google.common.cache.t<K, V> tVar3 = atomicReferenceArray2.get(length2);
                        com.google.common.cache.t<K, V> tVarB2 = tVar3;
                        while (true) {
                            if (tVarB2 != null) {
                                K key2 = tVarB2.getKey();
                                if (tVarB2.getHash() != hash2 || key2 == null || !rVarG2.f359194b.f359111f.d(key, key2)) {
                                    tVarB2 = tVarB2.b();
                                } else if (tVarB2.a() == a12) {
                                    rVarG2.f359197e++;
                                    com.google.common.cache.t<K, V> tVarT2 = rVarG2.t(tVar3, tVarB2, key2, a12.get(), a12, RemovalCause.f359072d);
                                    int i15 = rVarG2.f359195c - 1;
                                    atomicReferenceArray2.set(length2, tVarT2);
                                    rVarG2.f359195c = i15;
                                } else {
                                    rVarG2.unlock();
                                    if (!rVarG2.isHeldByCurrentThread()) {
                                    }
                                }
                            } else {
                                rVarG2.unlock();
                                if (!rVarG2.isHeldByCurrentThread()) {
                                }
                            }
                        }
                        i12++;
                    } finally {
                        rVarG2.unlock();
                        if (!rVarG2.isHeldByCurrentThread()) {
                            rVarG2.v();
                        }
                    }
                } while (i12 != 16);
            }
        }

        @InterfaceC25600a
        public final void d(@I41.a Object obj, @I41.a Object obj2, int i12, RemovalCause removalCause) {
            this.f359196d -= i12;
            if (removalCause.a()) {
                this.f359207o.a();
            }
            l<K, V> lVar = this.f359194b;
            if (lVar.f359120o != l.f359106z) {
                lVar.f359120o.offer(new com.google.common.cache.w(obj, obj2));
            }
        }

        @InterfaceC25600a
        public final void e(com.google.common.cache.t<K, V> tVar) {
            if (this.f359194b.b()) {
                b();
                long weight = tVar.a().getWeight();
                long j12 = this.f359200h;
                if (weight > j12 && !r(tVar, tVar.getHash(), RemovalCause.f359074f)) {
                    throw new AssertionError();
                }
                while (this.f359196d > j12) {
                    for (com.google.common.cache.t<K, V> tVar2 : this.f359206n) {
                        if (tVar2.a().getWeight() > 0) {
                            if (!r(tVar2, tVar2.getHash(), RemovalCause.f359074f)) {
                                throw new AssertionError();
                            }
                        }
                    }
                    throw new AssertionError();
                }
            }
        }

        @InterfaceC25600a
        public final void f() {
            AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = this.f359199g;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i12 = this.f359195c;
            AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray2 = new AtomicReferenceArray<>(length << 1);
            this.f359198f = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i13 = 0; i13 < length; i13++) {
                com.google.common.cache.t<K, V> tVarB = atomicReferenceArray.get(i13);
                if (tVarB != null) {
                    com.google.common.cache.t<K, V> tVarB2 = tVarB.b();
                    int hash = tVarB.getHash() & length2;
                    if (tVarB2 == null) {
                        atomicReferenceArray2.set(hash, tVarB);
                    } else {
                        com.google.common.cache.t<K, V> tVar = tVarB;
                        while (tVarB2 != null) {
                            int hash2 = tVarB2.getHash() & length2;
                            if (hash2 != hash) {
                                tVar = tVarB2;
                                hash = hash2;
                            }
                            tVarB2 = tVarB2.b();
                        }
                        atomicReferenceArray2.set(hash, tVar);
                        while (tVarB != tVar) {
                            int hash3 = tVarB.getHash() & length2;
                            com.google.common.cache.t<K, V> tVarA = a(tVarB, atomicReferenceArray2.get(hash3));
                            if (tVarA != null) {
                                atomicReferenceArray2.set(hash3, tVarA);
                            } else {
                                q(tVarB);
                                i12--;
                            }
                            tVarB = tVarB.b();
                        }
                    }
                }
            }
            this.f359199g = atomicReferenceArray2;
            this.f359195c = i12;
        }

        @InterfaceC25600a
        public final void g(long j12) {
            com.google.common.cache.t<K, V> tVar;
            com.google.common.cache.t<K, V> tVar2;
            b();
            do {
                tVar = (com.google.common.cache.t) this.f359205m.peek();
                l<K, V> lVar = this.f359194b;
                if (tVar == null || !lVar.f(tVar, j12)) {
                    do {
                        tVar2 = (com.google.common.cache.t) this.f359206n.peek();
                        if (tVar2 == null || !lVar.f(tVar2, j12)) {
                            return;
                        }
                    } while (r(tVar2, tVar2.getHash(), RemovalCause.f359073e));
                    throw new AssertionError();
                }
            } while (r(tVar, tVar.getHash(), RemovalCause.f359073e));
            throw new AssertionError();
        }

        @InterfaceC19845a
        public final V h(K k12, int i12, m<K, V> mVar, D0<V> d02) throws Throwable {
            V v12;
            a.b bVar = this.f359207o;
            try {
                v12 = (V) p1.a(d02);
            } catch (Throwable th2) {
                th = th2;
                v12 = null;
            }
            try {
                if (v12 != null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    bVar.b(timeUnit.convert(mVar.f359176d.a(), timeUnit));
                    y(k12, i12, mVar, v12);
                    return v12;
                }
                throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k12 + ".");
            } catch (Throwable th3) {
                th = th3;
                if (v12 == null) {
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    bVar.e(timeUnit2.convert(mVar.f359176d.a(), timeUnit2));
                    lock();
                    try {
                        AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = this.f359199g;
                        int length = (atomicReferenceArray.length() - 1) & i12;
                        com.google.common.cache.t<K, V> tVar = atomicReferenceArray.get(length);
                        com.google.common.cache.t<K, V> tVarB = tVar;
                        while (true) {
                            if (tVarB == null) {
                                break;
                            }
                            K key = tVarB.getKey();
                            if (tVarB.getHash() != i12 || key == null || !this.f359194b.f359111f.d(k12, key)) {
                                tVarB = tVarB.b();
                            } else if (tVarB.a() == mVar) {
                                if (mVar.f359174b.isActive()) {
                                    tVarB.d(mVar.f359174b);
                                } else {
                                    atomicReferenceArray.set(length, s(tVar, tVarB));
                                }
                            }
                        }
                        unlock();
                        v();
                    } catch (Throwable th4) {
                        unlock();
                        v();
                        throw th4;
                    }
                }
                throw th;
            }
        }

        @I41.a
        public final com.google.common.cache.t i(int i12, Object obj) {
            for (com.google.common.cache.t<K, V> tVarB = this.f359199g.get((r0.length() - 1) & i12); tVarB != null; tVarB = tVarB.b()) {
                if (tVarB.getHash() == i12) {
                    K key = tVarB.getKey();
                    if (key == null) {
                        z();
                    } else if (this.f359194b.f359111f.d(obj, key)) {
                        return tVarB;
                    }
                }
            }
            return null;
        }

        public final V k(com.google.common.cache.t<K, V> tVar, long j12) {
            if (tVar.getKey() == null) {
                z();
                return null;
            }
            V v12 = tVar.a().get();
            if (v12 == null) {
                z();
                return null;
            }
            if (!this.f359194b.f(tVar, j12)) {
                return v12;
            }
            if (tryLock()) {
                try {
                    g(j12);
                } finally {
                    unlock();
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        
            if (r6 == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
        
            r11 = new com.google.common.cache.l.m<>();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
        
            if (r10 != null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
        
            r3 = r16.f359194b.f359123r;
            r17.getClass();
            r10 = r3.d(r18, r16, r9, r17);
            r10.d(r11);
            r7.set(r8, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
        
            r10.d(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
        
            unlock();
            v();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
        
            if (r6 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
        
            r0 = h(r17, r18, r11, r11.e(r17, r19));
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
        
            monitor-exit(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        
            r16.f359207o.c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
        
            return A(r10, r17, r13);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final V l(K r17, int r18, com.google.common.cache.CacheLoader<? super K, V> r19) {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = r18
                r16.lock()
                com.google.common.cache.l<K, V> r3 = r1.f359194b     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.i0 r3 = r3.f359122q     // Catch: java.lang.Throwable -> L5c
                long r3 = r3.a()     // Catch: java.lang.Throwable -> L5c
                r1.u(r3)     // Catch: java.lang.Throwable -> L5c
                int r5 = r1.f359195c     // Catch: java.lang.Throwable -> L5c
                r6 = 1
                int r5 = r5 - r6
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.t<K, V>> r7 = r1.f359199g     // Catch: java.lang.Throwable -> L5c
                int r8 = r7.length()     // Catch: java.lang.Throwable -> L5c
                int r8 = r8 - r6
                r8 = r8 & r2
                java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.t r9 = (com.google.common.cache.t) r9     // Catch: java.lang.Throwable -> L5c
                r10 = r9
            L27:
                r11 = 0
                if (r10 == 0) goto L91
                java.lang.Object r12 = r10.getKey()     // Catch: java.lang.Throwable -> L5c
                int r13 = r10.getHash()     // Catch: java.lang.Throwable -> L5c
                if (r13 != r2) goto L8c
                if (r12 == 0) goto L8c
                com.google.common.cache.l<K, V> r13 = r1.f359194b     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.n<java.lang.Object> r13 = r13.f359111f     // Catch: java.lang.Throwable -> L5c
                boolean r13 = r13.d(r0, r12)     // Catch: java.lang.Throwable -> L5c
                if (r13 == 0) goto L8c
                com.google.common.cache.l$A r13 = r10.a()     // Catch: java.lang.Throwable -> L5c
                boolean r14 = r13.isLoading()     // Catch: java.lang.Throwable -> L5c
                if (r14 == 0) goto L4c
                r6 = 0
                goto L92
            L4c:
                java.lang.Object r14 = r13.get()     // Catch: java.lang.Throwable -> L5c
                if (r14 != 0) goto L5f
                int r3 = r13.getWeight()     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.RemovalCause r4 = com.google.common.cache.RemovalCause.f359072d     // Catch: java.lang.Throwable -> L5c
                r1.d(r12, r14, r3, r4)     // Catch: java.lang.Throwable -> L5c
                goto L70
            L5c:
                r0 = move-exception
                goto Ld9
            L5f:
                com.google.common.cache.l<K, V> r15 = r1.f359194b     // Catch: java.lang.Throwable -> L5c
                boolean r15 = r15.f(r10, r3)     // Catch: java.lang.Throwable -> L5c
                if (r15 == 0) goto L7d
                int r3 = r13.getWeight()     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.RemovalCause r4 = com.google.common.cache.RemovalCause.f359073e     // Catch: java.lang.Throwable -> L5c
                r1.d(r12, r14, r3, r4)     // Catch: java.lang.Throwable -> L5c
            L70:
                java.util.AbstractQueue r3 = r1.f359205m     // Catch: java.lang.Throwable -> L5c
                r3.remove(r10)     // Catch: java.lang.Throwable -> L5c
                java.util.AbstractQueue r3 = r1.f359206n     // Catch: java.lang.Throwable -> L5c
                r3.remove(r10)     // Catch: java.lang.Throwable -> L5c
                r1.f359195c = r5     // Catch: java.lang.Throwable -> L5c
                goto L92
            L7d:
                r1.o(r10, r3)     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.a$b r0 = r1.f359207o     // Catch: java.lang.Throwable -> L5c
                r0.d()     // Catch: java.lang.Throwable -> L5c
                r16.unlock()
                r16.v()
                return r14
            L8c:
                com.google.common.cache.t r10 = r10.b()     // Catch: java.lang.Throwable -> L5c
                goto L27
            L91:
                r13 = r11
            L92:
                if (r6 == 0) goto Lb0
                com.google.common.cache.l$m r11 = new com.google.common.cache.l$m     // Catch: java.lang.Throwable -> L5c
                r11.<init>()     // Catch: java.lang.Throwable -> L5c
                if (r10 != 0) goto Lad
                com.google.common.cache.l<K, V> r3 = r1.f359194b     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.l$f r3 = r3.f359123r     // Catch: java.lang.Throwable -> L5c
                r17.getClass()     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.t r10 = r3.d(r2, r1, r9, r0)     // Catch: java.lang.Throwable -> L5c
                r10.d(r11)     // Catch: java.lang.Throwable -> L5c
                r7.set(r8, r10)     // Catch: java.lang.Throwable -> L5c
                goto Lb0
            Lad:
                r10.d(r11)     // Catch: java.lang.Throwable -> L5c
            Lb0:
                r16.unlock()
                r16.v()
                if (r6 == 0) goto Ld4
                monitor-enter(r10)     // Catch: java.lang.Throwable -> Lcd
                r3 = r19
                com.google.common.util.concurrent.D0 r3 = r11.e(r0, r3)     // Catch: java.lang.Throwable -> Lca
                java.lang.Object r0 = r1.h(r0, r2, r11, r3)     // Catch: java.lang.Throwable -> Lca
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lca
                com.google.common.cache.a$b r2 = r1.f359207o
                r2.c()
                return r0
            Lca:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lca
                throw r0     // Catch: java.lang.Throwable -> Lcd
            Lcd:
                r0 = move-exception
                com.google.common.cache.a$b r2 = r1.f359207o
                r2.c()
                throw r0
            Ld4:
                java.lang.Object r0 = r1.A(r10, r0, r13)
                return r0
            Ld9:
                r16.unlock()
                r16.v()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.l.r.l(java.lang.Object, int, com.google.common.cache.CacheLoader):java.lang.Object");
        }

        public final void m() {
            if ((this.f359204l.incrementAndGet() & 63) == 0) {
                u(this.f359194b.f359122q.a());
                v();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @I41.a
        @InterfaceC19845a
        public final Object n(int i12, Object obj, Object obj2, boolean z12) {
            int i13;
            lock();
            try {
                long jA2 = this.f359194b.f359122q.a();
                u(jA2);
                if (this.f359195c + 1 > this.f359198f) {
                    f();
                }
                AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = this.f359199g;
                int length = i12 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.t tVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.t tVarB = tVar; tVarB != null; tVarB = tVarB.b()) {
                    K key = tVarB.getKey();
                    if (tVarB.getHash() == i12 && key != null && this.f359194b.f359111f.d(obj, key)) {
                        A<K, V> a12 = tVarB.a();
                        V v12 = a12.get();
                        if (v12 == null) {
                            this.f359197e++;
                            if (a12.isActive()) {
                                d(obj, v12, a12.getWeight(), RemovalCause.f359072d);
                                x(tVarB, obj, obj2, jA2);
                                i13 = this.f359195c;
                            } else {
                                x(tVarB, obj, obj2, jA2);
                                i13 = this.f359195c + 1;
                            }
                            this.f359195c = i13;
                            e(tVarB);
                            unlock();
                            v();
                            return null;
                        }
                        if (z12) {
                            o(tVarB, jA2);
                            unlock();
                            v();
                            return v12;
                        }
                        this.f359197e++;
                        d(obj, v12, a12.getWeight(), RemovalCause.f359071c);
                        x(tVarB, obj, obj2, jA2);
                        e(tVarB);
                        unlock();
                        v();
                        return v12;
                    }
                }
                this.f359197e++;
                com.google.common.cache.t tVarD = this.f359194b.f359123r.d(i12, this, tVar, obj);
                x(tVarD, obj, obj2, jA2);
                atomicReferenceArray.set(length, tVarD);
                this.f359195c++;
                e(tVarD);
                unlock();
                v();
                return null;
            } catch (Throwable th2) {
                unlock();
                v();
                throw th2;
            }
        }

        @InterfaceC25600a
        public final void o(com.google.common.cache.t<K, V> tVar, long j12) {
            if (this.f359194b.c()) {
                tVar.l(j12);
            }
            this.f359206n.add(tVar);
        }

        public final void p(com.google.common.cache.t<K, V> tVar, long j12) {
            if (this.f359194b.c()) {
                tVar.l(j12);
            }
            this.f359203k.add(tVar);
        }

        @InterfaceC25600a
        public final void q(com.google.common.cache.t<K, V> tVar) {
            K key = tVar.getKey();
            tVar.getHash();
            d(key, tVar.a().get(), tVar.a().getWeight(), RemovalCause.f359072d);
            this.f359205m.remove(tVar);
            this.f359206n.remove(tVar);
        }

        @InterfaceC19845a
        @XY0.e
        @InterfaceC25600a
        public final boolean r(com.google.common.cache.t<K, V> tVar, int i12, RemovalCause removalCause) {
            AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = this.f359199g;
            int length = i12 & (atomicReferenceArray.length() - 1);
            com.google.common.cache.t<K, V> tVar2 = atomicReferenceArray.get(length);
            for (com.google.common.cache.t<K, V> tVarB = tVar2; tVarB != null; tVarB = tVarB.b()) {
                if (tVarB == tVar) {
                    this.f359197e++;
                    com.google.common.cache.t<K, V> tVarT = t(tVar2, tVarB, tVarB.getKey(), tVarB.a().get(), tVarB.a(), removalCause);
                    int i13 = this.f359195c - 1;
                    atomicReferenceArray.set(length, tVarT);
                    this.f359195c = i13;
                    return true;
                }
            }
            return false;
        }

        @I41.a
        @InterfaceC25600a
        public final com.google.common.cache.t<K, V> s(com.google.common.cache.t<K, V> tVar, com.google.common.cache.t<K, V> tVar2) {
            int i12 = this.f359195c;
            com.google.common.cache.t<K, V> tVarB = tVar2.b();
            while (tVar != tVar2) {
                com.google.common.cache.t<K, V> tVarA = a(tVar, tVarB);
                if (tVarA != null) {
                    tVarB = tVarA;
                } else {
                    q(tVar);
                    i12--;
                }
                tVar = tVar.b();
            }
            this.f359195c = i12;
            return tVarB;
        }

        @I41.a
        @InterfaceC25600a
        public final com.google.common.cache.t t(com.google.common.cache.t tVar, com.google.common.cache.t tVar2, @I41.a Object obj, Object obj2, A a12, RemovalCause removalCause) {
            d(obj, obj2, a12.getWeight(), removalCause);
            this.f359205m.remove(tVar2);
            this.f359206n.remove(tVar2);
            if (!a12.isLoading()) {
                return s(tVar, tVar2);
            }
            a12.b(null);
            return tVar;
        }

        public final void u(long j12) {
            if (tryLock()) {
                try {
                    c();
                    g(j12);
                    this.f359204l.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public final void v() {
            if (isHeldByCurrentThread()) {
                return;
            }
            while (true) {
                l<K, V> lVar = this.f359194b;
                if (((com.google.common.cache.w) lVar.f359120o.poll()) == null) {
                    return;
                }
                try {
                    lVar.f359121p.getClass();
                } catch (Throwable th2) {
                    l.f359104x.log(Level.WARNING, "Exception thrown by removal listener", th2);
                }
            }
        }

        public final V w(com.google.common.cache.t<K, V> tVar, final K k12, final int i12, V v12, long j12, CacheLoader<? super K, V> cacheLoader) {
            V v13;
            m mVar;
            final m mVar2;
            if (this.f359194b.f359119n > 0 && j12 - tVar.k() > this.f359194b.f359119n && !tVar.a().isLoading()) {
                lock();
                try {
                    long jA2 = this.f359194b.f359122q.a();
                    u(jA2);
                    AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = this.f359199g;
                    int length = (atomicReferenceArray.length() - 1) & i12;
                    com.google.common.cache.t tVar2 = atomicReferenceArray.get(length);
                    com.google.common.cache.t tVarB = tVar2;
                    while (true) {
                        v13 = null;
                        if (tVarB == null) {
                            this.f359197e++;
                            mVar = new m();
                            EnumC37287f enumC37287f = this.f359194b.f359123r;
                            k12.getClass();
                            com.google.common.cache.t tVarD = enumC37287f.d(i12, this, tVar2, k12);
                            tVarD.d(mVar);
                            atomicReferenceArray.set(length, tVarD);
                            unlock();
                            break;
                        }
                        K key = tVarB.getKey();
                        if (tVarB.getHash() == i12 && key != null && this.f359194b.f359111f.d(k12, key)) {
                            A<K, V> a12 = tVarB.a();
                            if (!a12.isLoading() && jA2 - tVarB.k() >= this.f359194b.f359119n) {
                                this.f359197e++;
                                mVar = new m(a12);
                                tVarB.d(mVar);
                                unlock();
                            }
                            unlock();
                            v();
                            mVar2 = null;
                        } else {
                            tVarB = tVarB.b();
                        }
                    }
                    v();
                    mVar2 = mVar;
                    if (mVar2 != null) {
                        final D0<V> d0E = mVar2.e(k12, cacheLoader);
                        d0E.N(new Runnable() { // from class: com.google.common.cache.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                Object obj = k12;
                                int i13 = i12;
                                l.m mVar3 = mVar2;
                                D0 d02 = d0E;
                                int i14 = l.r.f359193p;
                                l.r rVar = this.f359231b;
                                rVar.getClass();
                                try {
                                    rVar.h(obj, i13, mVar3, d02);
                                } catch (Throwable th2) {
                                    l.f359104x.log(Level.WARNING, "Exception thrown during refresh", th2);
                                    mVar3.f359175c.o(th2);
                                }
                            }
                        }, Q0.a());
                        if (d0E.isDone()) {
                            try {
                                v13 = (V) p1.a(d0E);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    if (v13 != null) {
                        return v13;
                    }
                } catch (Throwable th2) {
                    unlock();
                    v();
                    throw th2;
                }
            }
            return v12;
        }

        @InterfaceC25600a
        public final void x(com.google.common.cache.t<K, V> tVar, K k12, V v12, long j12) {
            A<K, V> a12 = tVar.a();
            l<K, V> lVar = this.f359194b;
            lVar.f359116k.getClass();
            tVar.d(lVar.f359114i.b(1, this, tVar, v12));
            b();
            this.f359196d++;
            if (lVar.c()) {
                tVar.l(j12);
            }
            if (lVar.d() || lVar.f359119n > 0) {
                tVar.m(j12);
            }
            this.f359206n.add(tVar);
            this.f359205m.add(tVar);
            a12.b(v12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC19845a
        public final void y(Object obj, int i12, m mVar, Object obj2) {
            lock();
            try {
                long jA2 = this.f359194b.f359122q.a();
                u(jA2);
                int i13 = this.f359195c + 1;
                if (i13 > this.f359198f) {
                    f();
                    i13 = this.f359195c + 1;
                }
                AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = this.f359199g;
                int length = i12 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.t tVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.t tVarB = tVar; tVarB != null; tVarB = tVarB.b()) {
                    K key = tVarB.getKey();
                    if (tVarB.getHash() == i12 && key != null && this.f359194b.f359111f.d(obj, key)) {
                        A<K, V> a12 = tVarB.a();
                        V v12 = a12.get();
                        if (mVar != a12 && (v12 != null || a12 == l.f359105y)) {
                            d(obj, obj2, 0, RemovalCause.f359071c);
                            unlock();
                            v();
                            return;
                        }
                        this.f359197e++;
                        if (mVar.f359174b.isActive()) {
                            d(obj, v12, mVar.f359174b.getWeight(), v12 == null ? RemovalCause.f359072d : RemovalCause.f359071c);
                            i13--;
                        }
                        x(tVarB, obj, obj2, jA2);
                        this.f359195c = i13;
                        e(tVarB);
                        unlock();
                        v();
                        return;
                    }
                }
                this.f359197e++;
                EnumC37287f enumC37287f = this.f359194b.f359123r;
                obj.getClass();
                com.google.common.cache.t tVarD = enumC37287f.d(i12, this, tVar, obj);
                x(tVarD, obj, obj2, jA2);
                atomicReferenceArray.set(length, tVarD);
                this.f359195c = i13;
                e(tVarD);
                unlock();
                v();
            } catch (Throwable th2) {
                unlock();
                v();
                throw th2;
            }
        }

        public final void z() {
            if (tryLock()) {
                try {
                    c();
                } finally {
                    unlock();
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocalCache.java */
    public static abstract class t {

        /* renamed from: b, reason: collision with root package name */
        public static final a f359209b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f359210c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f359211d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ t[] f359212e;

        /* compiled from: LocalCache.java */
        public enum a extends t {
            @Override // com.google.common.cache.l.t
            public final AbstractC37270n<Object> a() {
                return AbstractC37270n.c();
            }

            @Override // com.google.common.cache.l.t
            public final A b(int i12, r rVar, com.google.common.cache.t tVar, Object obj) {
                return i12 == 1 ? new x(obj) : new I(obj, i12);
            }
        }

        /* compiled from: LocalCache.java */
        public enum b extends t {
            @Override // com.google.common.cache.l.t
            public final AbstractC37270n<Object> a() {
                return AbstractC37270n.e();
            }

            @Override // com.google.common.cache.l.t
            public final A b(int i12, r rVar, com.google.common.cache.t tVar, Object obj) {
                return i12 == 1 ? new s(rVar.f359202j, obj, tVar) : new H(i12, tVar, obj, rVar.f359202j);
            }
        }

        /* compiled from: LocalCache.java */
        public enum c extends t {
            @Override // com.google.common.cache.l.t
            public final AbstractC37270n<Object> a() {
                return AbstractC37270n.e();
            }

            @Override // com.google.common.cache.l.t
            public final A b(int i12, r rVar, com.google.common.cache.t tVar, Object obj) {
                return i12 == 1 ? new F(rVar.f359202j, obj, tVar) : new J(i12, tVar, obj, rVar.f359202j);
            }
        }

        static {
            a aVar = new a("STRONG", 0, null);
            f359209b = aVar;
            b bVar = new b("SOFT", 1, null);
            f359210c = bVar;
            c cVar = new c("WEAK", 2, null);
            f359211d = cVar;
            f359212e = new t[]{aVar, bVar, cVar};
        }

        public t() {
            throw null;
        }

        public t(String str, int i12, C37282a c37282a) {
        }

        public static t valueOf(String str) {
            return (t) Enum.valueOf(t.class, str);
        }

        public static t[] values() {
            return (t[]) f359212e.clone();
        }

        public abstract AbstractC37270n<Object> a();

        public abstract A b(int i12, r rVar, com.google.common.cache.t tVar, Object obj);
    }

    /* compiled from: LocalCache.java */
    public static final class u<K, V> extends w<K, V> {

        /* renamed from: f, reason: collision with root package name */
        public volatile long f359213f;

        /* renamed from: g, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359214g;

        /* renamed from: h, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359215h;

        public u() {
            throw null;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> e() {
            return this.f359215h;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void h(com.google.common.cache.t<K, V> tVar) {
            this.f359214g = tVar;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void i(com.google.common.cache.t<K, V> tVar) {
            this.f359215h = tVar;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void l(long j12) {
            this.f359213f = j12;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> n() {
            return this.f359214g;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final long o() {
            return this.f359213f;
        }
    }

    /* compiled from: LocalCache.java */
    public static final class v<K, V> extends w<K, V> {

        /* renamed from: f, reason: collision with root package name */
        public volatile long f359216f;

        /* renamed from: g, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359217g;

        /* renamed from: h, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359218h;

        /* renamed from: i, reason: collision with root package name */
        public volatile long f359219i;

        /* renamed from: j, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359220j;

        /* renamed from: k, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359221k;

        public v() {
            throw null;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> c() {
            return this.f359221k;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> e() {
            return this.f359218h;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> f() {
            return this.f359220j;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void h(com.google.common.cache.t<K, V> tVar) {
            this.f359217g = tVar;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void i(com.google.common.cache.t<K, V> tVar) {
            this.f359218h = tVar;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final long k() {
            return this.f359219i;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void l(long j12) {
            this.f359216f = j12;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void m(long j12) {
            this.f359219i = j12;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> n() {
            return this.f359217g;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final long o() {
            return this.f359216f;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void p(com.google.common.cache.t<K, V> tVar) {
            this.f359220j = tVar;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void q(com.google.common.cache.t<K, V> tVar) {
            this.f359221k = tVar;
        }
    }

    /* compiled from: LocalCache.java */
    public static class w<K, V> extends AbstractC37285d<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final K f359222b;

        /* renamed from: c, reason: collision with root package name */
        public final int f359223c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public final com.google.common.cache.t<K, V> f359224d;

        /* renamed from: e, reason: collision with root package name */
        public volatile A<K, V> f359225e = l.f359105y;

        public w(K k12, int i12, @I41.a com.google.common.cache.t<K, V> tVar) {
            this.f359222b = k12;
            this.f359223c = i12;
            this.f359224d = tVar;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final A<K, V> a() {
            return this.f359225e;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> b() {
            return this.f359224d;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void d(A<K, V> a12) {
            this.f359225e = a12;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final int getHash() {
            return this.f359223c;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final K getKey() {
            return this.f359222b;
        }
    }

    /* compiled from: LocalCache.java */
    public static final class y<K, V> extends w<K, V> {

        /* renamed from: f, reason: collision with root package name */
        public volatile long f359227f;

        /* renamed from: g, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359228g;

        /* renamed from: h, reason: collision with root package name */
        @Weak
        public com.google.common.cache.t<K, V> f359229h;

        public y() {
            throw null;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> c() {
            return this.f359229h;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final com.google.common.cache.t<K, V> f() {
            return this.f359228g;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final long k() {
            return this.f359227f;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void m(long j12) {
            this.f359227f = j12;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void p(com.google.common.cache.t<K, V> tVar) {
            this.f359228g = tVar;
        }

        @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
        public final void q(com.google.common.cache.t<K, V> tVar) {
            this.f359229h = tVar;
        }
    }

    /* compiled from: LocalCache.java */
    public final class z extends l<K, V>.AbstractC37290i<V> {
        @Override // com.google.common.cache.l.AbstractC37290i, java.util.Iterator
        public final V next() {
            return c().f359154c;
        }
    }

    public l(d<? super K, ? super V> dVar, @I41.a CacheLoader<? super K, V> cacheLoader) {
        int i12 = dVar.f359085b;
        this.f359110e = Math.min(i12 == -1 ? 4 : i12, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        t tVar = dVar.f359089f;
        t.a aVar = t.f359209b;
        t tVar2 = (t) com.google.common.base.D.a(tVar, aVar);
        this.f359113h = tVar2;
        this.f359114i = (t) com.google.common.base.D.a(dVar.f359090g, aVar);
        this.f359111f = (AbstractC37270n) com.google.common.base.D.a(dVar.f359093j, ((t) com.google.common.base.D.a(dVar.f359089f, aVar)).a());
        this.f359112g = (AbstractC37270n) com.google.common.base.D.a(dVar.f359094k, ((t) com.google.common.base.D.a(dVar.f359090g, aVar)).a());
        long j12 = (dVar.f359091h == 0 || dVar.f359092i == 0) ? 0L : dVar.f359088e == null ? dVar.f359086c : dVar.f359087d;
        this.f359115j = j12;
        com.google.common.cache.y<? super Object, ? super Object> yVar = dVar.f359088e;
        d.f fVar = d.f.f359101b;
        com.google.common.cache.y<K, V> yVar2 = (com.google.common.cache.y) com.google.common.base.D.a(yVar, fVar);
        this.f359116k = yVar2;
        long j13 = dVar.f359092i;
        this.f359117l = j13 == -1 ? 0L : j13;
        long j14 = dVar.f359091h;
        this.f359118m = j14 == -1 ? 0L : j14;
        this.f359119n = 0L;
        com.google.common.cache.u<? super Object, ? super Object> uVar = dVar.f359095l;
        d.e eVar = d.e.f359099b;
        com.google.common.cache.u<K, V> uVar2 = (com.google.common.cache.u) com.google.common.base.D.a(uVar, eVar);
        this.f359121p = uVar2;
        this.f359120o = (AbstractQueue) (uVar2 == eVar ? f359106z : new ConcurrentLinkedQueue());
        int i13 = 0;
        boolean z12 = (d() || (0L > 0L ? 1 : (0L == 0L ? 0 : -1)) > 0) || c();
        i0 i0Var = dVar.f359096m;
        if (i0Var == null) {
            i0Var = z12 ? i0.f359050a : d.f359083p;
        }
        this.f359122q = i0Var;
        char c12 = (c() || b() || c()) ? (char) 1 : (char) 0;
        boolean z13 = d() || d() || 0 > 0;
        EnumC37287f[] enumC37287fArr = EnumC37287f.f359161b;
        this.f359123r = EnumC37287f.f359161b[(tVar2 != t.f359211d ? (char) 0 : (char) 4) | c12 | (z13 ? 2 : 0)];
        e0<? extends a.b> e0Var = dVar.f359097n;
        this.f359124s = e0Var.get();
        this.f359125t = cacheLoader;
        int iMin = Math.min(16, 1073741824);
        if (b() && yVar2 == fVar) {
            iMin = (int) Math.min(iMin, j12);
        }
        int i14 = 1;
        int i15 = 0;
        while (i14 < this.f359110e && (!b() || i14 * 20 <= this.f359115j)) {
            i15++;
            i14 <<= 1;
        }
        this.f359108c = 32 - i15;
        this.f359107b = i14 - 1;
        this.f359109d = new r[i14];
        int i16 = iMin / i14;
        int i17 = 1;
        while (i17 < (i16 * i14 < iMin ? i16 + 1 : i16)) {
            i17 <<= 1;
        }
        if (b()) {
            long j15 = this.f359115j;
            long j16 = i14;
            long j17 = (j15 / j16) + 1;
            long j18 = j15 % j16;
            while (true) {
                r<K, V>[] rVarArr = this.f359109d;
                if (i13 >= rVarArr.length) {
                    return;
                }
                if (i13 == j18) {
                    j17--;
                }
                long j19 = j17;
                rVarArr[i13] = new r<>(this, i17, j19, e0Var.get());
                i13++;
                j17 = j19;
            }
        } else {
            while (true) {
                r<K, V>[] rVarArr2 = this.f359109d;
                if (i13 >= rVarArr2.length) {
                    return;
                }
                rVarArr2[i13] = new r<>(this, i17, -1L, e0Var.get());
                i13++;
            }
        }
    }

    public static ArrayList a(AbstractCollection abstractCollection) {
        ArrayList arrayList = new ArrayList(abstractCollection.size());
        C37325e2.a(arrayList, abstractCollection.iterator());
        return arrayList;
    }

    public final boolean b() {
        return this.f359115j >= 0;
    }

    public final boolean c() {
        return this.f359117l > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (r<K, V> rVar : this.f359109d) {
            if (rVar.f359195c != 0) {
                rVar.lock();
                try {
                    rVar.u(rVar.f359194b.f359122q.a());
                    AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = rVar.f359199g;
                    for (int i12 = 0; i12 < atomicReferenceArray.length(); i12++) {
                        for (com.google.common.cache.t<K, V> tVarB = atomicReferenceArray.get(i12); tVarB != null; tVarB = tVarB.b()) {
                            if (tVarB.a().isActive()) {
                                K key = tVarB.getKey();
                                V v12 = tVarB.a().get();
                                RemovalCause removalCause = (key == null || v12 == null) ? RemovalCause.f359072d : RemovalCause.f359070b;
                                tVarB.getHash();
                                rVar.d(key, v12, tVarB.a().getWeight(), removalCause);
                            }
                        }
                    }
                    for (int i13 = 0; i13 < atomicReferenceArray.length(); i13++) {
                        atomicReferenceArray.set(i13, null);
                    }
                    l<K, V> lVar = rVar.f359194b;
                    lVar.getClass();
                    if (lVar.f359113h != t.f359209b) {
                        while (rVar.f359201i.poll() != null) {
                        }
                    }
                    if (lVar.f359114i != t.f359209b) {
                        while (rVar.f359202j.poll() != null) {
                        }
                    }
                    rVar.f359205m.clear();
                    rVar.f359206n.clear();
                    rVar.f359204l.set(0);
                    rVar.f359197e++;
                    rVar.f359195c = 0;
                    rVar.unlock();
                    rVar.v();
                } catch (Throwable th2) {
                    rVar.unlock();
                    rVar.v();
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@I41.a Object obj) {
        boolean z12 = false;
        if (obj == null) {
            return false;
        }
        int iE2 = e(obj);
        r<K, V> rVarG = g(iE2);
        rVarG.getClass();
        try {
            if (rVarG.f359195c != 0) {
                long jA2 = rVarG.f359194b.f359122q.a();
                com.google.common.cache.t<K, V> tVarI = rVarG.i(iE2, obj);
                if (tVarI != null) {
                    if (rVarG.f359194b.f(tVarI, jA2)) {
                        if (rVarG.tryLock()) {
                            try {
                                rVarG.g(jA2);
                                rVarG.unlock();
                            } catch (Throwable th2) {
                                rVarG.unlock();
                                throw th2;
                            }
                        }
                        tVarI = null;
                    }
                    if (tVarI != null && tVarI.a().get() != null) {
                        z12 = true;
                    }
                } else {
                    tVarI = null;
                    if (tVarI != null) {
                        z12 = true;
                    }
                }
            }
            return z12;
        } finally {
            rVarG.m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@I41.a Object obj) {
        boolean z12 = false;
        if (obj == null) {
            return false;
        }
        long jA2 = this.f359122q.a();
        r<K, V>[] rVarArr = this.f359109d;
        long j12 = -1;
        int i12 = 0;
        while (i12 < 3) {
            int length = rVarArr.length;
            long j13 = 0;
            for (?? r12 = z12; r12 < length; r12++) {
                r<K, V> rVar = rVarArr[r12];
                int i13 = rVar.f359195c;
                AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = rVar.f359199g;
                for (?? r15 = z12; r15 < atomicReferenceArray.length(); r15++) {
                    com.google.common.cache.t<K, V> tVarB = atomicReferenceArray.get(r15);
                    while (tVarB != null) {
                        r<K, V>[] rVarArr2 = rVarArr;
                        V vK2 = rVar.k(tVarB, jA2);
                        long j14 = jA2;
                        if (vK2 != null && this.f359112g.d(obj, vK2)) {
                            return true;
                        }
                        tVarB = tVarB.b();
                        rVarArr = rVarArr2;
                        jA2 = j14;
                    }
                }
                j13 += rVar.f359197e;
                jA2 = jA2;
                z12 = false;
            }
            long j15 = jA2;
            r<K, V>[] rVarArr3 = rVarArr;
            if (j13 == j12) {
                return false;
            }
            i12++;
            j12 = j13;
            rVarArr = rVarArr3;
            jA2 = j15;
            z12 = false;
        }
        return z12;
    }

    public final boolean d() {
        return this.f359118m > 0;
    }

    public final int e(@I41.a Object obj) {
        int iB2;
        AbstractC37270n<Object> abstractC37270n = this.f359111f;
        if (obj == null) {
            abstractC37270n.getClass();
            iB2 = 0;
        } else {
            iB2 = abstractC37270n.b(obj);
        }
        int i12 = iB2 + ((iB2 << 15) ^ (-12931));
        int i13 = i12 ^ (i12 >>> 10);
        int i14 = i13 + (i13 << 3);
        int i15 = i14 ^ (i14 >>> 6);
        int i16 = (i15 << 2) + (i15 << 14) + i15;
        return (i16 >>> 16) ^ i16;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @XY0.c
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f359128w;
        if (set != null) {
            return set;
        }
        C37289h c37289h = new C37289h();
        this.f359128w = c37289h;
        return c37289h;
    }

    public final boolean f(com.google.common.cache.t<K, V> tVar, long j12) {
        tVar.getClass();
        if (!c() || j12 - tVar.o() < this.f359117l) {
            return d() && j12 - tVar.k() >= this.f359118m;
        }
        return true;
    }

    public final r<K, V> g(int i12) {
        return this.f359109d[(i12 >>> this.f359108c) & this.f359107b];
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #1 {all -> 0x005f, blocks: (B:6:0x000f, B:8:0x0013, B:23:0x0044, B:25:0x004e, B:28:0x0061, B:11:0x0023, B:13:0x002b, B:16:0x0034, B:18:0x0039, B:19:0x003c, B:15:0x0031), top: B:35:0x000f, inners: #0 }] */
    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    @aZ0.InterfaceC19845a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(@I41.a java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r4 = r10.e(r11)
            com.google.common.cache.l$r r9 = r10.g(r4)
            r9.getClass()
            int r1 = r9.f359195c     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L40
            com.google.common.cache.l<K, V> r1 = r9.f359194b     // Catch: java.lang.Throwable -> L5f
            com.google.common.base.i0 r1 = r1.f359122q     // Catch: java.lang.Throwable -> L5f
            long r6 = r1.a()     // Catch: java.lang.Throwable -> L5f
            com.google.common.cache.t r11 = r9.i(r4, r11)     // Catch: java.lang.Throwable -> L5f
            if (r11 != 0) goto L23
        L21:
            r2 = r0
            goto L3e
        L23:
            com.google.common.cache.l<K, V> r1 = r9.f359194b     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r1.f(r11, r6)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L3d
            boolean r11 = r9.tryLock()     // Catch: java.lang.Throwable -> L5f
            if (r11 == 0) goto L21
            r9.g(r6)     // Catch: java.lang.Throwable -> L38
            r9.unlock()     // Catch: java.lang.Throwable -> L5f
            goto L21
        L38:
            r11 = move-exception
            r9.unlock()     // Catch: java.lang.Throwable -> L5f
            throw r11     // Catch: java.lang.Throwable -> L5f
        L3d:
            r2 = r11
        L3e:
            if (r2 != 0) goto L44
        L40:
            r9.m()
            goto L65
        L44:
            com.google.common.cache.l$A r11 = r2.a()     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r5 = r11.get()     // Catch: java.lang.Throwable -> L5f
            if (r5 == 0) goto L61
            r9.p(r2, r6)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L5f
            com.google.common.cache.l<K, V> r11 = r9.f359194b     // Catch: java.lang.Throwable -> L5f
            com.google.common.cache.CacheLoader<? super K, V> r8 = r11.f359125t     // Catch: java.lang.Throwable -> L5f
            r1 = r9
            java.lang.Object r0 = r1.w(r2, r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L5f
            goto L40
        L5f:
            r11 = move-exception
            goto L66
        L61:
            r9.z()     // Catch: java.lang.Throwable -> L5f
            goto L40
        L65:
            return r0
        L66:
            r9.m()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.l.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @I41.a
    public final V getOrDefault(@I41.a Object obj, @I41.a V v12) {
        V v13 = get(obj);
        return v13 != null ? v13 : v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        r<K, V>[] rVarArr = this.f359109d;
        long j12 = 0;
        for (r<K, V> rVar : rVarArr) {
            if (rVar.f359195c != 0) {
                return false;
            }
            j12 += r8.f359197e;
        }
        if (j12 == 0) {
            return true;
        }
        for (r<K, V> rVar2 : rVarArr) {
            if (rVar2.f359195c != 0) {
                return false;
            }
            j12 -= r9.f359197e;
        }
        return j12 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f359126u;
        if (set != null) {
            return set;
        }
        C37292k c37292k = new C37292k();
        this.f359126u = c37292k;
        return c37292k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    @InterfaceC19845a
    public final V put(K k12, V v12) {
        k12.getClass();
        v12.getClass();
        int iE2 = e(k12);
        return (V) g(iE2).n(iE2, k12, v12, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @I41.a
    public final V putIfAbsent(K k12, V v12) {
        k12.getClass();
        v12.getClass();
        int iE2 = e(k12);
        return (V) g(iE2).n(iE2, k12, v12, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r7 = r4.a();
        r13 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r13 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r0 = com.google.common.cache.RemovalCause.f359070b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r7.isActive() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r0 = com.google.common.cache.RemovalCause.f359072d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r9.f359197e++;
        r0 = r9.t(r3, r4, r5, r13, r7, r8);
        r1 = r9.f359195c - 1;
        r10.set(r11, r0);
        r9.f359195c = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r9.unlock();
        r9.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        return r13;
     */
    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    @aZ0.InterfaceC19845a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(@I41.a java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            int r1 = r12.e(r13)
            com.google.common.cache.l$r r9 = r12.g(r1)
            r9.lock()
            com.google.common.cache.l<K, V> r2 = r9.f359194b     // Catch: java.lang.Throwable -> L52
            com.google.common.base.i0 r2 = r2.f359122q     // Catch: java.lang.Throwable -> L52
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L52
            r9.u(r2)     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.t<K, V>> r10 = r9.f359199g     // Catch: java.lang.Throwable -> L52
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L52
            int r2 = r2 + (-1)
            r11 = r1 & r2
            java.lang.Object r2 = r10.get(r11)     // Catch: java.lang.Throwable -> L52
            r3 = r2
            com.google.common.cache.t r3 = (com.google.common.cache.t) r3     // Catch: java.lang.Throwable -> L52
            r4 = r3
        L2c:
            if (r4 == 0) goto L7a
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L52
            int r2 = r4.getHash()     // Catch: java.lang.Throwable -> L52
            if (r2 != r1) goto L81
            if (r5 == 0) goto L81
            com.google.common.cache.l<K, V> r2 = r9.f359194b     // Catch: java.lang.Throwable -> L52
            com.google.common.base.n<java.lang.Object> r2 = r2.f359111f     // Catch: java.lang.Throwable -> L52
            boolean r2 = r2.d(r13, r5)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L81
            com.google.common.cache.l$A r7 = r4.a()     // Catch: java.lang.Throwable -> L52
            java.lang.Object r13 = r7.get()     // Catch: java.lang.Throwable -> L52
            if (r13 == 0) goto L54
            com.google.common.cache.RemovalCause r0 = com.google.common.cache.RemovalCause.f359070b     // Catch: java.lang.Throwable -> L52
        L50:
            r8 = r0
            goto L5d
        L52:
            r13 = move-exception
            goto L87
        L54:
            boolean r1 = r7.isActive()     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L7a
            com.google.common.cache.RemovalCause r0 = com.google.common.cache.RemovalCause.f359072d     // Catch: java.lang.Throwable -> L52
            goto L50
        L5d:
            int r0 = r9.f359197e     // Catch: java.lang.Throwable -> L52
            int r0 = r0 + 1
            r9.f359197e = r0     // Catch: java.lang.Throwable -> L52
            r2 = r9
            r6 = r13
            com.google.common.cache.t r0 = r2.t(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L52
            int r1 = r9.f359195c     // Catch: java.lang.Throwable -> L52
            int r1 = r1 + (-1)
            r10.set(r11, r0)     // Catch: java.lang.Throwable -> L52
            r9.f359195c = r1     // Catch: java.lang.Throwable -> L52
            r9.unlock()
            r9.v()
            r0 = r13
            goto L86
        L7a:
            r9.unlock()
            r9.v()
            goto L86
        L81:
            com.google.common.cache.t r4 = r4.b()     // Catch: java.lang.Throwable -> L52
            goto L2c
        L86:
            return r0
        L87:
            r9.unlock()
            r9.v()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.l.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @I41.a
    @aZ0.InterfaceC19845a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V replace(K r14, V r15) {
        /*
            r13 = this;
            r14.getClass()
            r15.getClass()
            int r0 = r13.e(r14)
            com.google.common.cache.l$r r8 = r13.g(r0)
            r8.lock()
            com.google.common.cache.l<K, V> r1 = r8.f359194b     // Catch: java.lang.Throwable -> L72
            com.google.common.base.i0 r1 = r1.f359122q     // Catch: java.lang.Throwable -> L72
            long r5 = r1.a()     // Catch: java.lang.Throwable -> L72
            r8.u(r5)     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.t<K, V>> r9 = r8.f359199g     // Catch: java.lang.Throwable -> L72
            int r1 = r9.length()     // Catch: java.lang.Throwable -> L72
            int r1 = r1 + (-1)
            r10 = r0 & r1
            java.lang.Object r1 = r9.get(r10)     // Catch: java.lang.Throwable -> L72
            r2 = r1
            com.google.common.cache.t r2 = (com.google.common.cache.t) r2     // Catch: java.lang.Throwable -> L72
            r7 = r2
        L2e:
            r11 = 0
            if (r7 == 0) goto L74
            java.lang.Object r4 = r7.getKey()     // Catch: java.lang.Throwable -> L72
            int r1 = r7.getHash()     // Catch: java.lang.Throwable -> L72
            if (r1 != r0) goto L9c
            if (r4 == 0) goto L9c
            com.google.common.cache.l<K, V> r1 = r8.f359194b     // Catch: java.lang.Throwable -> L72
            com.google.common.base.n<java.lang.Object> r1 = r1.f359111f     // Catch: java.lang.Throwable -> L72
            boolean r1 = r1.d(r14, r4)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L9c
            com.google.common.cache.l$A r0 = r7.a()     // Catch: java.lang.Throwable -> L72
            java.lang.Object r12 = r0.get()     // Catch: java.lang.Throwable -> L72
            if (r12 != 0) goto L7b
            boolean r14 = r0.isActive()     // Catch: java.lang.Throwable -> L72
            if (r14 == 0) goto L74
            int r14 = r8.f359197e     // Catch: java.lang.Throwable -> L72
            int r14 = r14 + 1
            r8.f359197e = r14     // Catch: java.lang.Throwable -> L72
            com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.f359072d     // Catch: java.lang.Throwable -> L72
            r1 = r8
            r3 = r7
            r5 = r12
            r6 = r0
            r7 = r14
            com.google.common.cache.t r14 = r1.t(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L72
            int r15 = r8.f359195c     // Catch: java.lang.Throwable -> L72
            int r15 = r15 + (-1)
            r9.set(r10, r14)     // Catch: java.lang.Throwable -> L72
            r8.f359195c = r15     // Catch: java.lang.Throwable -> L72
            goto L74
        L72:
            r14 = move-exception
            goto La2
        L74:
            r8.unlock()
            r8.v()
            goto La1
        L7b:
            int r1 = r8.f359197e     // Catch: java.lang.Throwable -> L72
            int r1 = r1 + 1
            r8.f359197e = r1     // Catch: java.lang.Throwable -> L72
            int r0 = r0.getWeight()     // Catch: java.lang.Throwable -> L72
            com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.f359071c     // Catch: java.lang.Throwable -> L72
            r8.d(r14, r12, r0, r1)     // Catch: java.lang.Throwable -> L72
            r1 = r8
            r2 = r7
            r3 = r14
            r4 = r15
            r1.x(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L72
            r8.e(r7)     // Catch: java.lang.Throwable -> L72
            r8.unlock()
            r8.v()
            r11 = r12
            goto La1
        L9c:
            com.google.common.cache.t r7 = r7.b()     // Catch: java.lang.Throwable -> L72
            goto L2e
        La1:
            return r11
        La2:
            r8.unlock()
            r8.v()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.l.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (int i12 = 0; i12 < this.f359109d.length; i12++) {
            jMax += Math.max(0, r0[i12].f359195c);
        }
        return com.google.common.primitives.l.f(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f359127v;
        if (collection != null) {
            return collection;
        }
        B b12 = new B();
        this.f359127v = b12;
        return b12;
    }

    /* compiled from: LocalCache.java */
    public static class m<K, V> implements A<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public volatile A<K, V> f359174b;

        /* renamed from: c, reason: collision with root package name */
        public final e1<V> f359175c;

        /* renamed from: d, reason: collision with root package name */
        public final c0 f359176d;

        public m() {
            this(l.f359105y);
        }

        @Override // com.google.common.cache.l.A
        public final com.google.common.cache.t<K, V> a() {
            return null;
        }

        @Override // com.google.common.cache.l.A
        public final void b(@I41.a V v12) {
            if (v12 != null) {
                this.f359175c.n(v12);
            } else {
                this.f359174b = l.f359105y;
            }
        }

        @Override // com.google.common.cache.l.A
        public final V c() {
            return (V) p1.a(this.f359175c);
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [com.google.common.cache.m] */
        public final D0<V> e(K k12, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.f359176d.b();
                V v12 = this.f359174b.get();
                if (v12 == null) {
                    V vA2 = cacheLoader.a(k12);
                    return this.f359175c.n(vA2) ? this.f359175c : C37568u0.d(vA2);
                }
                D0<V> d0B = cacheLoader.b(k12, v12);
                return d0B == null ? C37568u0.d(null) : C37568u0.f(d0B, new InterfaceC37276u() { // from class: com.google.common.cache.m
                    @Override // com.google.common.base.InterfaceC37276u
                    public final Object apply(Object obj) {
                        this.f359230b.f359175c.n(obj);
                        return obj;
                    }
                });
            } catch (Throwable th2) {
                D0<V> d0C = this.f359175c.o(th2) ? this.f359175c : C37568u0.c(th2);
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return d0C;
            }
        }

        @Override // com.google.common.cache.l.A
        public final V get() {
            return this.f359174b.get();
        }

        @Override // com.google.common.cache.l.A
        public final int getWeight() {
            return this.f359174b.getWeight();
        }

        @Override // com.google.common.cache.l.A
        public final boolean isActive() {
            return this.f359174b.isActive();
        }

        @Override // com.google.common.cache.l.A
        public final boolean isLoading() {
            return true;
        }

        public m(A<K, V> a12) {
            this.f359175c = new e1<>();
            this.f359176d = new c0();
            this.f359174b = a12;
        }

        @Override // com.google.common.cache.l.A
        public final A<K, V> d(ReferenceQueue<V> referenceQueue, @I41.a V v12, com.google.common.cache.t<K, V> tVar) {
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocalCache.java */
    public static final class q implements com.google.common.cache.t<Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f359191b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ q[] f359192c;

        static {
            q qVar = new q("INSTANCE", 0);
            f359191b = qVar;
            f359192c = new q[]{qVar};
        }

        public q() {
            throw null;
        }

        public static q valueOf(String str) {
            return (q) Enum.valueOf(q.class, str);
        }

        public static q[] values() {
            return (q[]) f359192c.clone();
        }

        @Override // com.google.common.cache.t
        @I41.a
        public final A<Object, Object> a() {
            return null;
        }

        @Override // com.google.common.cache.t
        @I41.a
        public final com.google.common.cache.t<Object, Object> b() {
            return null;
        }

        @Override // com.google.common.cache.t
        public final int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.t
        @I41.a
        public final Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.t
        public final long k() {
            return 0L;
        }

        @Override // com.google.common.cache.t
        public final long o() {
            return 0L;
        }

        @Override // com.google.common.cache.t
        public final com.google.common.cache.t<Object, Object> c() {
            return this;
        }

        @Override // com.google.common.cache.t
        public final com.google.common.cache.t<Object, Object> e() {
            return this;
        }

        @Override // com.google.common.cache.t
        public final com.google.common.cache.t<Object, Object> f() {
            return this;
        }

        @Override // com.google.common.cache.t
        public final com.google.common.cache.t<Object, Object> n() {
            return this;
        }

        @Override // com.google.common.cache.t
        public final void d(A<Object, Object> a12) {
        }

        @Override // com.google.common.cache.t
        public final void h(com.google.common.cache.t<Object, Object> tVar) {
        }

        @Override // com.google.common.cache.t
        public final void i(com.google.common.cache.t<Object, Object> tVar) {
        }

        @Override // com.google.common.cache.t
        public final void l(long j12) {
        }

        @Override // com.google.common.cache.t
        public final void m(long j12) {
        }

        @Override // com.google.common.cache.t
        public final void p(com.google.common.cache.t<Object, Object> tVar) {
        }

        @Override // com.google.common.cache.t
        public final void q(com.google.common.cache.t<Object, Object> tVar) {
        }
    }

    /* compiled from: LocalCache.java */
    public static final class K<K, V> extends AbstractQueue<com.google.common.cache.t<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public final a f359149b;

        /* compiled from: LocalCache.java */
        public class b extends AbstractC37370m<com.google.common.cache.t<K, V>> {
            public b(com.google.common.cache.t tVar) {
                super(tVar);
            }

            @Override // com.google.common.collect.AbstractC37370m
            @I41.a
            public final Object a(Object obj) {
                com.google.common.cache.t<K, V> tVarF = ((com.google.common.cache.t) obj).f();
                if (tVarF == K.this.f359149b) {
                    return null;
                }
                return tVarF;
            }
        }

        public K() {
            a aVar = new a();
            aVar.f359150b = aVar;
            aVar.f359151c = aVar;
            this.f359149b = aVar;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            a aVar = this.f359149b;
            com.google.common.cache.t<K, V> tVar = aVar.f359150b;
            while (tVar != aVar) {
                com.google.common.cache.t<K, V> tVarF = tVar.f();
                Logger logger = l.f359104x;
                q qVar = q.f359191b;
                tVar.p(qVar);
                tVar.q(qVar);
                tVar = tVarF;
            }
            aVar.f359150b = aVar;
            aVar.f359151c = aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((com.google.common.cache.t) obj).f() != q.f359191b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            a aVar = this.f359149b;
            return aVar.f359150b == aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<com.google.common.cache.t<K, V>> iterator() {
            a aVar = this.f359149b;
            com.google.common.cache.t<K, V> tVar = aVar.f359150b;
            if (tVar == aVar) {
                tVar = null;
            }
            return new b(tVar);
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            com.google.common.cache.t<K, V> tVar = (com.google.common.cache.t) obj;
            com.google.common.cache.t<K, V> tVarC = tVar.c();
            com.google.common.cache.t<K, V> tVarF = tVar.f();
            Logger logger = l.f359104x;
            tVarC.p(tVarF);
            tVarF.q(tVarC);
            a aVar = this.f359149b;
            com.google.common.cache.t<K, V> tVar2 = aVar.f359151c;
            tVar2.p(tVar);
            tVar.q(tVar2);
            tVar.p(aVar);
            aVar.f359151c = tVar;
            return true;
        }

        @Override // java.util.Queue
        @I41.a
        public final Object peek() {
            a aVar = this.f359149b;
            com.google.common.cache.t<K, V> tVar = aVar.f359150b;
            if (tVar == aVar) {
                return null;
            }
            return tVar;
        }

        @Override // java.util.Queue
        @I41.a
        public final Object poll() {
            a aVar = this.f359149b;
            com.google.common.cache.t<K, V> tVar = aVar.f359150b;
            if (tVar == aVar) {
                return null;
            }
            remove(tVar);
            return tVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @InterfaceC19845a
        public final boolean remove(Object obj) {
            com.google.common.cache.t tVar = (com.google.common.cache.t) obj;
            com.google.common.cache.t<K, V> tVarC = tVar.c();
            com.google.common.cache.t<K, V> tVarF = tVar.f();
            Logger logger = l.f359104x;
            tVarC.p(tVarF);
            tVarF.q(tVarC);
            q qVar = q.f359191b;
            tVar.p(qVar);
            tVar.q(qVar);
            return tVarF != qVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            a aVar = this.f359149b;
            int i12 = 0;
            for (com.google.common.cache.t<K, V> tVarF = aVar.f359150b; tVarF != aVar; tVarF = tVarF.f()) {
                i12++;
            }
            return i12;
        }

        /* compiled from: LocalCache.java */
        public class a extends AbstractC37285d<K, V> {

            /* renamed from: b, reason: collision with root package name */
            @Weak
            public com.google.common.cache.t<K, V> f359150b;

            /* renamed from: c, reason: collision with root package name */
            @Weak
            public com.google.common.cache.t<K, V> f359151c;

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final com.google.common.cache.t<K, V> c() {
                return this.f359151c;
            }

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final com.google.common.cache.t<K, V> f() {
                return this.f359150b;
            }

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final long k() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final void p(com.google.common.cache.t<K, V> tVar) {
                this.f359150b = tVar;
            }

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final void q(com.google.common.cache.t<K, V> tVar) {
                this.f359151c = tVar;
            }

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final void m(long j12) {
            }
        }
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$e, reason: case insensitive filesystem */
    public static final class C37286e<K, V> extends AbstractQueue<com.google.common.cache.t<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public final a f359157b;

        /* compiled from: LocalCache.java */
        /* renamed from: com.google.common.cache.l$e$b */
        public class b extends AbstractC37370m<com.google.common.cache.t<K, V>> {
            public b(com.google.common.cache.t tVar) {
                super(tVar);
            }

            @Override // com.google.common.collect.AbstractC37370m
            @I41.a
            public final Object a(Object obj) {
                com.google.common.cache.t<K, V> tVarN = ((com.google.common.cache.t) obj).n();
                if (tVarN == C37286e.this.f359157b) {
                    return null;
                }
                return tVarN;
            }
        }

        public C37286e() {
            a aVar = new a();
            aVar.f359158b = aVar;
            aVar.f359159c = aVar;
            this.f359157b = aVar;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            a aVar = this.f359157b;
            com.google.common.cache.t<K, V> tVar = aVar.f359158b;
            while (tVar != aVar) {
                com.google.common.cache.t<K, V> tVarN = tVar.n();
                Logger logger = l.f359104x;
                q qVar = q.f359191b;
                tVar.h(qVar);
                tVar.i(qVar);
                tVar = tVarN;
            }
            aVar.f359158b = aVar;
            aVar.f359159c = aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((com.google.common.cache.t) obj).n() != q.f359191b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            a aVar = this.f359157b;
            return aVar.f359158b == aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<com.google.common.cache.t<K, V>> iterator() {
            a aVar = this.f359157b;
            com.google.common.cache.t<K, V> tVar = aVar.f359158b;
            if (tVar == aVar) {
                tVar = null;
            }
            return new b(tVar);
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            com.google.common.cache.t<K, V> tVar = (com.google.common.cache.t) obj;
            com.google.common.cache.t<K, V> tVarE = tVar.e();
            com.google.common.cache.t<K, V> tVarN = tVar.n();
            Logger logger = l.f359104x;
            tVarE.h(tVarN);
            tVarN.i(tVarE);
            a aVar = this.f359157b;
            com.google.common.cache.t<K, V> tVar2 = aVar.f359159c;
            tVar2.h(tVar);
            tVar.i(tVar2);
            tVar.h(aVar);
            aVar.f359159c = tVar;
            return true;
        }

        @Override // java.util.Queue
        @I41.a
        public final Object peek() {
            a aVar = this.f359157b;
            com.google.common.cache.t<K, V> tVar = aVar.f359158b;
            if (tVar == aVar) {
                return null;
            }
            return tVar;
        }

        @Override // java.util.Queue
        @I41.a
        public final Object poll() {
            a aVar = this.f359157b;
            com.google.common.cache.t<K, V> tVar = aVar.f359158b;
            if (tVar == aVar) {
                return null;
            }
            remove(tVar);
            return tVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @InterfaceC19845a
        public final boolean remove(Object obj) {
            com.google.common.cache.t tVar = (com.google.common.cache.t) obj;
            com.google.common.cache.t<K, V> tVarE = tVar.e();
            com.google.common.cache.t<K, V> tVarN = tVar.n();
            Logger logger = l.f359104x;
            tVarE.h(tVarN);
            tVarN.i(tVarE);
            q qVar = q.f359191b;
            tVar.h(qVar);
            tVar.i(qVar);
            return tVarN != qVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            a aVar = this.f359157b;
            int i12 = 0;
            for (com.google.common.cache.t<K, V> tVarN = aVar.f359158b; tVarN != aVar; tVarN = tVarN.n()) {
                i12++;
            }
            return i12;
        }

        /* compiled from: LocalCache.java */
        /* renamed from: com.google.common.cache.l$e$a */
        public class a extends AbstractC37285d<K, V> {

            /* renamed from: b, reason: collision with root package name */
            @Weak
            public com.google.common.cache.t<K, V> f359158b;

            /* renamed from: c, reason: collision with root package name */
            @Weak
            public com.google.common.cache.t<K, V> f359159c;

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final com.google.common.cache.t<K, V> e() {
                return this.f359159c;
            }

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final void h(com.google.common.cache.t<K, V> tVar) {
                this.f359158b = tVar;
            }

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final void i(com.google.common.cache.t<K, V> tVar) {
                this.f359159c = tVar;
            }

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final com.google.common.cache.t<K, V> n() {
                return this.f359158b;
            }

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final long o() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.l.AbstractC37285d, com.google.common.cache.t
            public final void l(long j12) {
            }
        }
    }

    /* compiled from: LocalCache.java */
    public static class F<K, V> extends WeakReference<V> implements A<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final com.google.common.cache.t<K, V> f359142b;

        public F(ReferenceQueue<V> referenceQueue, V v12, com.google.common.cache.t<K, V> tVar) {
            super(v12, referenceQueue);
            this.f359142b = tVar;
        }

        @Override // com.google.common.cache.l.A
        public final com.google.common.cache.t<K, V> a() {
            return this.f359142b;
        }

        @Override // com.google.common.cache.l.A
        public final V c() {
            return get();
        }

        @Override // com.google.common.cache.l.A
        public A<K, V> d(ReferenceQueue<V> referenceQueue, V v12, com.google.common.cache.t<K, V> tVar) {
            return new F(referenceQueue, v12, tVar);
        }

        @Override // com.google.common.cache.l.A
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.l.A
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.l.A
        public final boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.l.A
        public final void b(V v12) {
        }
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.l$a, reason: case insensitive filesystem */
    public class C37282a implements A<Object, Object> {
        @Override // com.google.common.cache.l.A
        @I41.a
        public final com.google.common.cache.t<Object, Object> a() {
            return null;
        }

        @Override // com.google.common.cache.l.A
        @I41.a
        public final Object c() {
            return null;
        }

        @Override // com.google.common.cache.l.A
        @I41.a
        public final Object get() {
            return null;
        }

        @Override // com.google.common.cache.l.A
        public final int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.l.A
        public final boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.l.A
        public final boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.l.A
        public final void b(Object obj) {
        }

        @Override // com.google.common.cache.l.A
        public final A<Object, Object> d(ReferenceQueue<Object> referenceQueue, @I41.a Object obj, com.google.common.cache.t<Object, Object> tVar) {
            return this;
        }
    }

    /* compiled from: LocalCache.java */
    public static class s<K, V> extends SoftReference<V> implements A<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final com.google.common.cache.t<K, V> f359208b;

        public s(ReferenceQueue<V> referenceQueue, V v12, com.google.common.cache.t<K, V> tVar) {
            super(v12, referenceQueue);
            this.f359208b = tVar;
        }

        @Override // com.google.common.cache.l.A
        public final com.google.common.cache.t<K, V> a() {
            return this.f359208b;
        }

        @Override // com.google.common.cache.l.A
        public final V c() {
            return get();
        }

        public A<K, V> d(ReferenceQueue<V> referenceQueue, V v12, com.google.common.cache.t<K, V> tVar) {
            return new s(referenceQueue, v12, tVar);
        }

        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.l.A
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.l.A
        public final boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.l.A
        public final void b(V v12) {
        }
    }

    /* compiled from: LocalCache.java */
    public static class x<K, V> implements A<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final V f359226b;

        public x(V v12) {
            this.f359226b = v12;
        }

        @Override // com.google.common.cache.l.A
        public final com.google.common.cache.t<K, V> a() {
            return null;
        }

        @Override // com.google.common.cache.l.A
        public final V c() {
            return this.f359226b;
        }

        @Override // com.google.common.cache.l.A
        public final V get() {
            return this.f359226b;
        }

        @Override // com.google.common.cache.l.A
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.l.A
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.l.A
        public final boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.l.A
        public final void b(V v12) {
        }

        @Override // com.google.common.cache.l.A
        public final A<K, V> d(ReferenceQueue<V> referenceQueue, V v12, com.google.common.cache.t<K, V> tVar) {
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r7 = r4.a();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r9.f359194b.f359112g.d(r15, r6) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r14 = com.google.common.cache.RemovalCause.f359070b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r6 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r7.isActive() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        r14 = com.google.common.cache.RemovalCause.f359072d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r9.f359197e++;
        r15 = r9.t(r3, r4, r5, r6, r7, r14);
        r1 = r9.f359195c - 1;
        r10.set(r12, r15);
        r9.f359195c = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r14 != com.google.common.cache.RemovalCause.f359070b) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        r0 = true;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @aZ0.InterfaceC19845a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(@I41.a java.lang.Object r14, @I41.a java.lang.Object r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L94
            if (r15 != 0) goto L7
            goto L94
        L7:
            int r1 = r13.e(r14)
            com.google.common.cache.l$r r9 = r13.g(r1)
            r9.lock()
            com.google.common.cache.l<K, V> r2 = r9.f359194b     // Catch: java.lang.Throwable -> L5c
            com.google.common.base.i0 r2 = r2.f359122q     // Catch: java.lang.Throwable -> L5c
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L5c
            r9.u(r2)     // Catch: java.lang.Throwable -> L5c
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.t<K, V>> r10 = r9.f359199g     // Catch: java.lang.Throwable -> L5c
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L5c
            r11 = 1
            int r2 = r2 - r11
            r12 = r1 & r2
            java.lang.Object r2 = r10.get(r12)     // Catch: java.lang.Throwable -> L5c
            r3 = r2
            com.google.common.cache.t r3 = (com.google.common.cache.t) r3     // Catch: java.lang.Throwable -> L5c
            r4 = r3
        L2f:
            if (r4 == 0) goto L80
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
            int r2 = r4.getHash()     // Catch: java.lang.Throwable -> L5c
            if (r2 != r1) goto L87
            if (r5 == 0) goto L87
            com.google.common.cache.l<K, V> r2 = r9.f359194b     // Catch: java.lang.Throwable -> L5c
            com.google.common.base.n<java.lang.Object> r2 = r2.f359111f     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r2.d(r14, r5)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L87
            com.google.common.cache.l$A r7 = r4.a()     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L5c
            com.google.common.cache.l<K, V> r14 = r9.f359194b     // Catch: java.lang.Throwable -> L5c
            com.google.common.base.n<java.lang.Object> r14 = r14.f359112g     // Catch: java.lang.Throwable -> L5c
            boolean r14 = r14.d(r15, r6)     // Catch: java.lang.Throwable -> L5c
            if (r14 == 0) goto L5e
            com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.f359070b     // Catch: java.lang.Throwable -> L5c
            goto L68
        L5c:
            r14 = move-exception
            goto L8d
        L5e:
            if (r6 != 0) goto L80
            boolean r14 = r7.isActive()     // Catch: java.lang.Throwable -> L5c
            if (r14 == 0) goto L80
            com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.f359072d     // Catch: java.lang.Throwable -> L5c
        L68:
            int r15 = r9.f359197e     // Catch: java.lang.Throwable -> L5c
            int r15 = r15 + r11
            r9.f359197e = r15     // Catch: java.lang.Throwable -> L5c
            r2 = r9
            r8 = r14
            com.google.common.cache.t r15 = r2.t(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5c
            int r1 = r9.f359195c     // Catch: java.lang.Throwable -> L5c
            int r1 = r1 - r11
            r10.set(r12, r15)     // Catch: java.lang.Throwable -> L5c
            r9.f359195c = r1     // Catch: java.lang.Throwable -> L5c
            com.google.common.cache.RemovalCause r15 = com.google.common.cache.RemovalCause.f359070b     // Catch: java.lang.Throwable -> L5c
            if (r14 != r15) goto L80
            r0 = r11
        L80:
            r9.unlock()
            r9.v()
            goto L8c
        L87:
            com.google.common.cache.t r4 = r4.b()     // Catch: java.lang.Throwable -> L5c
            goto L2f
        L8c:
            return r0
        L8d:
            r9.unlock()
            r9.v()
            throw r14
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.l.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC19845a
    public final boolean replace(K k12, @I41.a V v12, V v13) {
        k12.getClass();
        v13.getClass();
        if (v12 == null) {
            return false;
        }
        int iE2 = e(k12);
        r<K, V> rVarG = g(iE2);
        rVarG.lock();
        try {
            long jA2 = rVarG.f359194b.f359122q.a();
            rVarG.u(jA2);
            AtomicReferenceArray<com.google.common.cache.t<K, V>> atomicReferenceArray = rVarG.f359199g;
            int length = iE2 & (atomicReferenceArray.length() - 1);
            com.google.common.cache.t<K, V> tVar = atomicReferenceArray.get(length);
            com.google.common.cache.t<K, V> tVarB = tVar;
            while (true) {
                if (tVarB == null) {
                    break;
                }
                K key = tVarB.getKey();
                if (tVarB.getHash() == iE2 && key != null && rVarG.f359194b.f359111f.d(k12, key)) {
                    A<K, V> a12 = tVarB.a();
                    V v14 = a12.get();
                    if (v14 == null) {
                        if (a12.isActive()) {
                            rVarG.f359197e++;
                            com.google.common.cache.t<K, V> tVarT = rVarG.t(tVar, tVarB, key, v14, a12, RemovalCause.f359072d);
                            int i12 = rVarG.f359195c - 1;
                            atomicReferenceArray.set(length, tVarT);
                            rVarG.f359195c = i12;
                        }
                    } else {
                        if (rVarG.f359194b.f359112g.d(v12, v14)) {
                            rVarG.f359197e++;
                            rVarG.d(k12, v14, a12.getWeight(), RemovalCause.f359071c);
                            rVarG.x(tVarB, k12, v13, jA2);
                            rVarG.e(tVarB);
                            return true;
                        }
                        rVarG.o(tVarB, jA2);
                    }
                } else {
                    int i13 = length;
                    tVarB = tVarB.b();
                    length = i13;
                }
            }
            return false;
        } finally {
            rVarG.unlock();
            rVarG.v();
        }
    }
}
