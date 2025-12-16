package com.yandex.mobile.ads.embedded.guava.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@aZ0.f
/* loaded from: classes8.dex */
public abstract class q<K, V> implements Map<K, V>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    private transient r<Map.Entry<K, V>> f382797a;

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    private transient r<K> f382798b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    private transient n<V> f382799c;

    @aZ0.f
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f382800a;

        /* renamed from: b, reason: collision with root package name */
        int f382801b;

        public a() {
            this(4);
        }

        @InterfaceC19845a
        public final a<K, V> a(K k12, V v12) {
            int i12 = (this.f382801b + 1) * 2;
            Object[] objArr = this.f382800a;
            if (i12 > objArr.length) {
                int length = objArr.length;
                if (i12 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int iHighestOneBit = length + (length >> 1) + 1;
                if (iHighestOneBit < i12) {
                    iHighestOneBit = Integer.highestOneBit(i12 - 1) << 1;
                }
                if (iHighestOneBit < 0) {
                    iHighestOneBit = Integer.MAX_VALUE;
                }
                this.f382800a = Arrays.copyOf(objArr, iHighestOneBit);
            }
            if (k12 == null) {
                throw new NullPointerException(androidx.camera.view.k.a(v12, "null key in entry: null="));
            }
            if (v12 == null) {
                throw new NullPointerException("null value in entry: " + k12 + "=null");
            }
            Object[] objArr2 = this.f382800a;
            int i13 = this.f382801b;
            int i14 = i13 * 2;
            objArr2[i14] = k12;
            objArr2[i14 + 1] = v12;
            this.f382801b = i13 + 1;
            return this;
        }

        public a(int i12) {
            this.f382800a = new Object[i12 * 2];
            this.f382801b = 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC19845a
        public final void a(Set set) {
            if (set instanceof Collection) {
                int size = (set.size() + this.f382801b) * 2;
                Object[] objArr = this.f382800a;
                if (size > objArr.length) {
                    int length = objArr.length;
                    if (size >= 0) {
                        int iHighestOneBit = length + (length >> 1) + 1;
                        if (iHighestOneBit < size) {
                            iHighestOneBit = Integer.highestOneBit(size - 1) << 1;
                        }
                        if (iHighestOneBit < 0) {
                            iHighestOneBit = Integer.MAX_VALUE;
                        }
                        this.f382800a = Arrays.copyOf(objArr, iHighestOneBit);
                    } else {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                }
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                a(entry.getKey(), entry.getValue());
            }
        }

        public final q<K, V> a() {
            return g0.a(this.f382801b, this.f382800a);
        }
    }

    public static class b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f382802a;

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f382803b;

        public b(q<K, V> qVar) {
            Object[] objArr = new Object[qVar.size()];
            Object[] objArr2 = new Object[qVar.size()];
            p0<Map.Entry<K, V>> it = qVar.entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i12] = next.getKey();
                objArr2[i12] = next.getValue();
                i12++;
            }
            this.f382802a = objArr;
            this.f382803b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.f382802a;
            if (!(objArr instanceof r)) {
                Object[] objArr2 = this.f382803b;
                a aVar = new a(objArr.length);
                for (int i12 = 0; i12 < objArr.length; i12++) {
                    aVar.a(objArr[i12], objArr2[i12]);
                }
                return aVar.a();
            }
            r rVar = (r) objArr;
            n nVar = (n) this.f382803b;
            a aVar2 = new a(rVar.size());
            Iterator it = rVar.iterator();
            p0 it2 = nVar.iterator();
            while (it.hasNext()) {
                aVar2.a(it.next(), it2.next());
            }
            return aVar2.a();
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>(4);
    }

    public static <K, V> q<K, V> h() {
        return (q<K, V>) g0.f382752g;
    }

    public abstract r<Map.Entry<K, V>> b();

    public abstract r<K> c();

    @Override // java.util.Map
    @aZ0.e
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@I41.a Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@I41.a Object obj) {
        return values().contains(obj);
    }

    public abstract n<V> d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final r<Map.Entry<K, V>> entrySet() {
        r<Map.Entry<K, V>> rVar = this.f382797a;
        if (rVar != null) {
            return rVar;
        }
        r<Map.Entry<K, V>> rVarB = b();
        this.f382797a = rVarB;
        return rVarB;
    }

    @Override // java.util.Map
    public final boolean equals(@I41.a Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((r) entrySet()).equals(((Map) obj).entrySet());
    }

    public abstract void f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final r<K> keySet() {
        r<K> rVar = this.f382798b;
        if (rVar != null) {
            return rVar;
        }
        r<K> rVarC = c();
        this.f382798b = rVarC;
        return rVarC;
    }

    @Override // java.util.Map
    @I41.a
    public abstract V get(@I41.a Object obj);

    @Override // java.util.Map
    @I41.a
    public final V getOrDefault(@I41.a Object obj, @I41.a V v12) {
        V v13 = get(obj);
        return v13 != null ? v13 : v12;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return m0.a(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final n<V> values() {
        n<V> nVar = this.f382799c;
        if (nVar != null) {
            return nVar;
        }
        n<V> nVarD = d();
        this.f382799c = nVarD;
        return nVarD;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @I41.a
    @aZ0.e
    @Deprecated
    @InterfaceC19845a
    public final V put(K k12, V v12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @aZ0.e
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @I41.a
    @InterfaceC19845a
    @Deprecated
    public final V remove(@I41.a Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        h.a(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z12 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z12) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z12 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public Object writeReplace() {
        return new b(this);
    }

    public static q a(HashMap map) {
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        a aVar = new a(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        aVar.a(setEntrySet);
        return aVar.a();
    }
}
