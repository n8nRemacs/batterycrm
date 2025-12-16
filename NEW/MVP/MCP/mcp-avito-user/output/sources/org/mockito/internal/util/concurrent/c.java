package org.mockito.internal.util.concurrent;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WeakConcurrentMap.java */
/* loaded from: classes7.dex */
public class c<K, V> extends ReferenceQueue<K> implements Runnable, Iterable<Map.Entry<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLong f421744c = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f421745b = new ConcurrentHashMap();

    /* compiled from: WeakConcurrentMap.java */
    public class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<e<K>, V>> f421746b;

        /* renamed from: c, reason: collision with root package name */
        public Map.Entry<e<K>, V> f421747c;

        /* renamed from: d, reason: collision with root package name */
        public K f421748d;

        public b() {
            throw null;
        }

        public b(Iterator it, a aVar) {
            this.f421746b = it;
            a();
        }

        public final void a() {
            K k12;
            do {
                Iterator<Map.Entry<e<K>, V>> it = this.f421746b;
                if (!it.hasNext()) {
                    this.f421747c = null;
                    this.f421748d = null;
                    return;
                } else {
                    Map.Entry<e<K>, V> next = it.next();
                    this.f421747c = next;
                    k12 = next.getKey().get();
                    this.f421748d = k12;
                }
            } while (k12 == null);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f421748d != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            K k12 = this.f421748d;
            if (k12 == null) {
                throw new NoSuchElementException();
            }
            try {
                return new d(c.this, k12, this.f421747c, null);
            } finally {
                a();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: WeakConcurrentMap.java */
    /* renamed from: org.mockito.internal.util.concurrent.c$c, reason: collision with other inner class name */
    public static class C12233c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f421750a;

        /* renamed from: b, reason: collision with root package name */
        public final int f421751b;

        public C12233c(T t12) {
            this.f421750a = t12;
            this.f421751b = System.identityHashCode(t12);
        }

        public final boolean equals(Object obj) {
            boolean z12 = obj instanceof C12233c;
            T t12 = this.f421750a;
            return z12 ? ((C12233c) obj).f421750a == t12 : ((e) obj).get() == t12;
        }

        public final int hashCode() {
            return this.f421751b;
        }
    }

    /* compiled from: WeakConcurrentMap.java */
    public class d implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final K f421752b;

        /* renamed from: c, reason: collision with root package name */
        public final Map.Entry<e<K>, V> f421753c;

        public d() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(c cVar, Object obj, Map.Entry entry, a aVar) {
            this.f421752b = obj;
            this.f421753c = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f421752b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f421753c.getValue();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v12) {
            v12.getClass();
            return this.f421753c.setValue(v12);
        }
    }

    /* compiled from: WeakConcurrentMap.java */
    public static class e<T> extends WeakReference<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f421754a;

        public e(Object obj, c cVar) {
            super(obj, cVar);
            this.f421754a = System.identityHashCode(obj);
        }

        public final boolean equals(Object obj) {
            return obj instanceof C12233c ? ((C12233c) obj).f421750a == get() : ((e) obj).get() == get();
        }

        public final int hashCode() {
            return this.f421754a;
        }
    }

    /* compiled from: WeakConcurrentMap.java */
    public static class f<K, V> extends c<K, V> {
        public f() {
            super(false);
        }

        @Override // org.mockito.internal.util.concurrent.c
        public final V d(K k12) {
            b();
            return (V) super.d(k12);
        }

        @Override // org.mockito.internal.util.concurrent.c
        public final Object e(Serializable serializable, Object obj) {
            b();
            return super.e(serializable, obj);
        }

        @Override // org.mockito.internal.util.concurrent.c
        public final Object g(Class cls) {
            b();
            return super.g(cls);
        }

        @Override // org.mockito.internal.util.concurrent.c, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            b();
            return super.iterator();
        }
    }

    public c(boolean z12) {
        if (z12) {
            Thread thread = new Thread(this);
            thread.setName("weak-ref-cleaner-" + f421744c.getAndIncrement());
            thread.setPriority(1);
            thread.setDaemon(true);
            thread.start();
        }
    }

    public final void b() {
        while (true) {
            Reference<? extends K> referencePoll = poll();
            if (referencePoll == null) {
                return;
            } else {
                this.f421745b.remove(referencePoll);
            }
        }
    }

    public V d(K k12) {
        k12.getClass();
        V v12 = (V) this.f421745b.get(new C12233c(k12));
        if (v12 != null) {
            return v12;
        }
        a(k12);
        return null;
    }

    public Object e(Serializable serializable, Object obj) {
        if (obj != null) {
            return this.f421745b.put(new e(obj, this), serializable);
        }
        throw null;
    }

    public Object g(Class cls) {
        cls.getClass();
        return this.f421745b.remove(new C12233c(cls));
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new b(this.f421745b.entrySet().iterator(), null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap concurrentHashMap = this.f421745b;
        while (true) {
            try {
                concurrentHashMap.remove(remove());
            } catch (InterruptedException unused) {
                concurrentHashMap.clear();
                return;
            }
        }
    }

    public void a(Object obj) {
    }
}
