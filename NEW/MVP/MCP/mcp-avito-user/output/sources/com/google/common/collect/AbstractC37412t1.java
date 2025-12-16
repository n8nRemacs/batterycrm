package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import com.google.common.collect.AbstractC37378n1;
import com.google.j2objc.annotations.RetainedWith;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: ImmutableMap.java */
@InterfaceC37329f0
@aZ0.f
@XY0.b
/* renamed from: com.google.common.collect.t1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37412t1<K, V> implements Map<K, V>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    public transient H1<Map.Entry<K, V>> f359996b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    public transient H1<K> f359997c;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    public transient AbstractC37378n1<V> f359998d;

    /* compiled from: ImmutableMap.java */
    /* renamed from: com.google.common.collect.t1$a */
    public class a extends N4<K> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N4 f359999b;

        public a(N4 n42) {
            this.f359999b = n42;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359999b.hasNext();
        }

        @Override // java.util.Iterator
        public final K next() {
            return (K) ((Map.Entry) this.f359999b.next()).getKey();
        }
    }

    /* compiled from: ImmutableMap.java */
    @aZ0.f
    /* renamed from: com.google.common.collect.t1$b */
    public static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f360000a;

        /* renamed from: b, reason: collision with root package name */
        public int f360001b;

        /* renamed from: c, reason: collision with root package name */
        public a f360002c;

        /* compiled from: ImmutableMap.java */
        /* renamed from: com.google.common.collect.t1$b$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final Object f360003a;

            /* renamed from: b, reason: collision with root package name */
            public final Object f360004b;

            /* renamed from: c, reason: collision with root package name */
            public final Object f360005c;

            public a(Object obj, Object obj2, Object obj3) {
                this.f360003a = obj;
                this.f360004b = obj2;
                this.f360005c = obj3;
            }

            public final IllegalArgumentException a() {
                StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
                Object obj = this.f360003a;
                sb2.append(obj);
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(this.f360004b);
                sb2.append(" and ");
                sb2.append(obj);
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(this.f360005c);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public b() {
            this(4);
        }

        public final AbstractC37412t1<K, V> a(boolean z12) {
            a aVar;
            a aVar2;
            if (z12 && (aVar2 = this.f360002c) != null) {
                throw aVar2.a();
            }
            J3 j3S = J3.s(this.f360001b, this.f360000a, this);
            if (!z12 || (aVar = this.f360002c) == null) {
                return j3S;
            }
            throw aVar.a();
        }

        public AbstractC37412t1<K, V> b() {
            return a(true);
        }

        @InterfaceC19845a
        public b<K, V> c(K k12, V v12) {
            int i12 = (this.f360001b + 1) * 2;
            Object[] objArr = this.f360000a;
            if (i12 > objArr.length) {
                this.f360000a = Arrays.copyOf(objArr, AbstractC37378n1.b.a(objArr.length, i12));
            }
            F.a(k12, v12);
            Object[] objArr2 = this.f360000a;
            int i13 = this.f360001b;
            int i14 = i13 * 2;
            objArr2[i14] = k12;
            objArr2[i14 + 1] = v12;
            this.f360001b = i13 + 1;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC19845a
        public b d(Set set) {
            if (set instanceof Collection) {
                int size = (set.size() + this.f360001b) * 2;
                Object[] objArr = this.f360000a;
                if (size > objArr.length) {
                    this.f360000a = Arrays.copyOf(objArr, AbstractC37378n1.b.a(objArr.length, size));
                }
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public b(int i12) {
            this.f360000a = new Object[i12 * 2];
            this.f360001b = 0;
        }
    }

    /* compiled from: ImmutableMap.java */
    /* renamed from: com.google.common.collect.t1$c */
    public static abstract class c<K, V> extends AbstractC37412t1<K, V> {

        /* compiled from: ImmutableMap.java */
        /* renamed from: com.google.common.collect.t1$c$a */
        public class a extends AbstractC37422v1<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.AbstractC37422v1
            public final AbstractC37412t1<K, V> Q() {
                return c.this;
            }

            @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator iterator() {
                return c.this.s();
            }

            @Override // com.google.common.collect.AbstractC37378n1
            /* renamed from: l */
            public final N4<Map.Entry<K, V>> iterator() {
                return c.this.s();
            }
        }

        @Override // com.google.common.collect.AbstractC37412t1
        public final H1<Map.Entry<K, V>> d() {
            return new a();
        }

        @Override // com.google.common.collect.AbstractC37412t1
        public H1<K> e() {
            return new C37427w1(this);
        }

        @Override // com.google.common.collect.AbstractC37412t1, java.util.Map, java.util.SortedMap
        public final /* bridge */ /* synthetic */ Set entrySet() {
            return entrySet();
        }

        @Override // com.google.common.collect.AbstractC37412t1
        public final AbstractC37378n1<V> f() {
            return new C37432x1(this);
        }

        @Override // com.google.common.collect.AbstractC37412t1, java.util.Map, java.util.SortedMap
        public final /* bridge */ /* synthetic */ Set keySet() {
            return keySet();
        }

        public abstract N4<Map.Entry<K, V>> s();

        @Override // com.google.common.collect.AbstractC37412t1, java.util.Map, java.util.SortedMap
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }
    }

    /* compiled from: ImmutableMap.java */
    /* renamed from: com.google.common.collect.t1$d */
    public final class d extends c<K, H1<V>> {

        /* compiled from: ImmutableMap.java */
        /* renamed from: com.google.common.collect.t1$d$a */
        public class a extends N4<Map.Entry<K, H1<V>>> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N4 f360008b;

            public a(N4 n42) {
                this.f360008b = n42;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f360008b.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return new C37417u1((Map.Entry) this.f360008b.next());
            }
        }

        public d(a aVar) {
        }

        @Override // com.google.common.collect.AbstractC37412t1, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return AbstractC37412t1.this.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC37412t1.c, com.google.common.collect.AbstractC37412t1
        public final H1<K> e() {
            return AbstractC37412t1.this.keySet();
        }

        @Override // com.google.common.collect.AbstractC37412t1, java.util.Map
        @I41.a
        public final Object get(@I41.a Object obj) {
            Object obj2 = AbstractC37412t1.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            int i12 = H1.f359346d;
            return new C37309b4(obj2);
        }

        @Override // com.google.common.collect.AbstractC37412t1
        public final boolean h() {
            return AbstractC37412t1.this.h();
        }

        @Override // com.google.common.collect.AbstractC37412t1, java.util.Map
        public final int hashCode() {
            return AbstractC37412t1.this.hashCode();
        }

        @Override // com.google.common.collect.AbstractC37412t1
        public final boolean k() {
            return AbstractC37412t1.this.k();
        }

        @Override // com.google.common.collect.AbstractC37412t1.c
        public final N4<Map.Entry<K, H1<V>>> s() {
            return new a(AbstractC37412t1.this.entrySet().iterator());
        }

        @Override // java.util.Map
        public final int size() {
            return AbstractC37412t1.this.size();
        }
    }

    /* compiled from: ImmutableMap.java */
    @XY0.d
    /* renamed from: com.google.common.collect.t1$e */
    public static class e<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f360009b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f360010c;

        public e(AbstractC37412t1<K, V> abstractC37412t1) {
            Object[] objArr = new Object[abstractC37412t1.size()];
            Object[] objArr2 = new Object[abstractC37412t1.size()];
            N4<Map.Entry<K, V>> it = abstractC37412t1.entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i12] = next.getKey();
                objArr2[i12] = next.getValue();
                i12++;
            }
            this.f360009b = objArr;
            this.f360010c = objArr2;
        }

        public b<K, V> a(int i12) {
            return new b<>(i12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.f360009b;
            boolean z12 = objArr instanceof H1;
            Object[] objArr2 = this.f360010c;
            if (!z12) {
                b<K, V> bVarA = a(objArr.length);
                for (int i12 = 0; i12 < objArr.length; i12++) {
                    bVarA.c(objArr[i12], objArr2[i12]);
                }
                return bVarA.b();
            }
            H1 h12 = (H1) objArr;
            b<K, V> bVarA2 = a(h12.size());
            Iterator it = h12.iterator();
            N4 it2 = ((AbstractC37378n1) objArr2).iterator();
            while (it.hasNext()) {
                bVarA2.c(it.next(), it2.next());
            }
            return bVarA2.b();
        }
    }

    public static <K, V> b<K, V> a() {
        return new b<>();
    }

    public static <K, V> b<K, V> b(int i12) {
        F.b(i12, "expectedSize");
        return new b<>(i12);
    }

    public static <K, V> AbstractC37412t1<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC37412t1) && !(map instanceof SortedMap)) {
            AbstractC37412t1<K, V> abstractC37412t1 = (AbstractC37412t1) map;
            if (!abstractC37412t1.k()) {
                return abstractC37412t1;
            }
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        b bVar = new b(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        bVar.d(setEntrySet);
        return bVar.a(true);
    }

    public static <K, V> AbstractC37412t1<K, V> n() {
        return (AbstractC37412t1<K, V>) J3.f359405h;
    }

    public static AbstractC37412t1 o(com.avito.android.comfortable_deal.factory.a aVar, com.avito.android.developments_agency_search.factory.a aVar2, com.avito.android.mortgage_category.factory.a aVar3, com.avito.android.virtual_deal_room_reference_category.factory.i iVar, com.avito.android.virtual_deal_room_reference_category.factory.l lVar) {
        return J3.s(5, new Object[]{Category.f326472f, aVar, Category.f326471e, aVar2, Category.f326473g, aVar3, Category.f326470d, iVar, Category.f326469c, lVar}, null);
    }

    public static AbstractC37412t1 p(Class cls, Object obj, Class cls2, Object obj2, Class cls3, Object obj3) {
        return J3.s(3, new Object[]{cls, obj, cls2, obj2, cls3, obj3}, null);
    }

    public static <K, V> AbstractC37412t1<K, V> q(K k12, V v12, K k13, V v13) {
        F.a(k12, v12);
        F.a(k13, v13);
        return J3.s(2, new Object[]{k12, v12, k13, v13}, null);
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    @aZ0.e
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@I41.a Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@I41.a Object obj) {
        return values().contains(obj);
    }

    public abstract H1<Map.Entry<K, V>> d();

    public abstract H1<K> e();

    @Override // java.util.Map
    public boolean equals(@I41.a Object obj) {
        return M2.d(this, obj);
    }

    public abstract AbstractC37378n1<V> f();

    @Override // java.util.Map, java.util.SortedMap
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public H1<Map.Entry<K, V>> entrySet() {
        H1<Map.Entry<K, V>> h12 = this.f359996b;
        if (h12 != null) {
            return h12;
        }
        H1<Map.Entry<K, V>> h1D = d();
        this.f359996b = h1D;
        return h1D;
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

    public boolean h() {
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return W3.e(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean k();

    public N4<K> l() {
        return new a(entrySet().iterator());
    }

    @Override // java.util.Map, java.util.SortedMap
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public H1<K> keySet() {
        H1<K> h12 = this.f359997c;
        if (h12 != null) {
            return h12;
        }
        H1<K> h1E = e();
        this.f359997c = h1E;
        return h1E;
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

    @Override // java.util.Map, java.util.SortedMap
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC37378n1<V> values() {
        AbstractC37378n1<V> abstractC37378n1 = this.f359998d;
        if (abstractC37378n1 != null) {
            return abstractC37378n1;
        }
        AbstractC37378n1<V> abstractC37378n1F = f();
        this.f359998d = abstractC37378n1F;
        return abstractC37378n1F;
    }

    @Override // java.util.Map
    @I41.a
    @InterfaceC19845a
    @Deprecated
    public final V remove(@I41.a Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return M2.k(this);
    }

    @XY0.d
    public Object writeReplace() {
        return new e(this);
    }
}
