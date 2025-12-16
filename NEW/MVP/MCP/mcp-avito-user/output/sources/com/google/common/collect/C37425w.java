package com.google.common.collect;

import bZ0.InterfaceC25601b;
import com.google.common.collect.M2;
import com.google.common.collect.t4;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayTable.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37425w<R, C, V> extends AbstractC37405s<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient C37425w<R, C, V>.g f360046d;

    /* compiled from: ArrayTable.java */
    /* renamed from: com.google.common.collect.w$a */
    public class a extends AbstractC37310c<t4.a<R, C, V>> {
        @Override // com.google.common.collect.AbstractC37310c
        public final Object a(int i12) {
            throw null;
        }
    }

    /* compiled from: ArrayTable.java */
    /* renamed from: com.google.common.collect.w$b */
    public class b extends AbstractC37310c<V> {
        @Override // com.google.common.collect.AbstractC37310c
        @I41.a
        public final V a(int i12) {
            throw null;
        }
    }

    /* compiled from: ArrayTable.java */
    /* renamed from: com.google.common.collect.w$c */
    public static abstract class c<K, V> extends M2.n<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37412t1<K, Integer> f360047b;

        /* compiled from: ArrayTable.java */
        /* renamed from: com.google.common.collect.w$c$a */
        public class a extends AbstractC37310c<Map.Entry<K, V>> {
            public a(int i12) {
                super(i12, 0);
            }

            @Override // com.google.common.collect.AbstractC37310c
            public final Object a(int i12) {
                c cVar = c.this;
                com.google.common.base.M.i(i12, cVar.f360047b.size());
                return new C37435y(cVar, i12);
            }
        }

        public c() {
            throw null;
        }

        public c(AbstractC37412t1 abstractC37412t1, a aVar) {
            this.f360047b = abstractC37412t1;
        }

        @Override // com.google.common.collect.M2.n
        public final Iterator<Map.Entry<K, V>> a() {
            return new a(this.f360047b.size());
        }

        public abstract String b();

        @InterfaceC37434x3
        public abstract V c(int i12);

        @Override // com.google.common.collect.M2.n, java.util.AbstractMap, java.util.Map
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return this.f360047b.containsKey(obj);
        }

        @InterfaceC37434x3
        public abstract Object d(@InterfaceC37434x3 Object obj);

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V get(@I41.a Object obj) {
            Integer num = this.f360047b.get(obj);
            if (num == null) {
                return null;
            }
            return c(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return this.f360047b.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<K> keySet() {
            return this.f360047b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public V put(K k12, @InterfaceC37434x3 V v12) {
            AbstractC37412t1<K, Integer> abstractC37412t1 = this.f360047b;
            if (abstractC37412t1.get(k12) != null) {
                d(v12);
                throw null;
            }
            throw new IllegalArgumentException(b() + " " + k12 + " not in " + abstractC37412t1.keySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V remove(@I41.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f360047b.size();
        }
    }

    /* compiled from: ArrayTable.java */
    /* renamed from: com.google.common.collect.w$d */
    public class d extends c<R, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12) {
            super(null, null);
            C37425w.this.getClass();
        }

        @Override // com.google.common.collect.C37425w.c
        public final String b() {
            return "Row";
        }

        @Override // com.google.common.collect.C37425w.c
        @I41.a
        public final V c(int i12) {
            C37425w.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.C37425w.c
        @I41.a
        public final Object d(@I41.a Object obj) {
            C37425w.this.getClass();
            throw null;
        }
    }

    /* compiled from: ArrayTable.java */
    /* renamed from: com.google.common.collect.w$e */
    public class e extends c<C, Map<R, V>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a aVar) {
            super(null, null);
            C37425w.this.getClass();
        }

        @Override // com.google.common.collect.C37425w.c
        public final String b() {
            return "Column";
        }

        @Override // com.google.common.collect.C37425w.c
        public final Object c(int i12) {
            return new d(i12);
        }

        @Override // com.google.common.collect.C37425w.c
        public final Object d(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.C37425w.c, java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ArrayTable.java */
    /* renamed from: com.google.common.collect.w$f */
    public class f extends c<C, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i12) {
            super(null, null);
            C37425w.this.getClass();
        }

        @Override // com.google.common.collect.C37425w.c
        public final String b() {
            return "Column";
        }

        @Override // com.google.common.collect.C37425w.c
        @I41.a
        public final V c(int i12) {
            C37425w.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.C37425w.c
        @I41.a
        public final Object d(@I41.a Object obj) {
            C37425w.this.getClass();
            throw null;
        }
    }

    /* compiled from: ArrayTable.java */
    /* renamed from: com.google.common.collect.w$g */
    public class g extends c<R, Map<C, V>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a aVar) {
            super(null, null);
            C37425w.this.getClass();
        }

        @Override // com.google.common.collect.C37425w.c
        public final String b() {
            return "Row";
        }

        @Override // com.google.common.collect.C37425w.c
        public final Object c(int i12) {
            return new f(i12);
        }

        @Override // com.google.common.collect.C37425w.c
        public final Object d(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.C37425w.c, java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.AbstractC37405s
    public final Iterator<t4.a<R, C, V>> a() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37405s
    @aZ0.e
    @Deprecated
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37405s
    public final boolean c(@I41.a Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.t4, com.google.common.collect.R3
    public final Map<R, Map<C, V>> d() {
        C37425w<R, C, V>.g gVar = this.f360046d;
        if (gVar != null) {
            return gVar;
        }
        C37425w<R, C, V>.g gVar2 = new g(null);
        this.f360046d = gVar2;
        return gVar2;
    }

    @Override // com.google.common.collect.AbstractC37405s
    public final Iterator<V> h() {
        throw null;
    }

    @Override // com.google.common.collect.t4
    public final int size() {
        throw null;
    }
}
