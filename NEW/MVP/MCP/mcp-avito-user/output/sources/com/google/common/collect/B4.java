package com.google.common.collect;

import com.google.common.collect.C37381n4;
import com.google.common.collect.M2;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: TreeBasedTable.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public class B4<R, C, V> extends C37375m4<R, C, V> {
    private static final long serialVersionUID = 0;

    /* compiled from: TreeBasedTable.java */
    public class a extends AbstractC37316d<C> {

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public C f359271d;

        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final C a() {
            throw null;
        }
    }

    /* compiled from: TreeBasedTable.java */
    public static class b<C, V> implements com.google.common.base.e0<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.e0
        public final Object get() {
            return new TreeMap((Comparator) null);
        }
    }

    /* compiled from: TreeBasedTable.java */
    public class c extends C37381n4<R, C, V>.g implements SortedMap<C, V> {

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public final C f359272e;

        /* renamed from: f, reason: collision with root package name */
        @I41.a
        public final C f359273f;

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        public transient SortedMap<C, V> f359274g;

        public c() {
            throw null;
        }

        public c(R r12, @I41.a C c12, @I41.a C c13) {
            super(r12);
            this.f359272e = c12;
            this.f359273f = c13;
            if (c12 == null || c13 == null) {
                return;
            }
            comparator();
            throw null;
        }

        @Override // com.google.common.collect.C37381n4.g
        @I41.a
        public final Map b() {
            f();
            SortedMap<C, V> sortedMapTailMap = this.f359274g;
            if (sortedMapTailMap == null) {
                return null;
            }
            C c12 = this.f359272e;
            if (c12 != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(c12);
            }
            C c13 = this.f359273f;
            return c13 != null ? sortedMapTailMap.headMap(c13) : sortedMapTailMap;
        }

        @Override // com.google.common.collect.C37381n4.g
        public final void c() {
            f();
            SortedMap<C, V> sortedMap = this.f359274g;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            B4.this.f359870d.remove(this.f359892b);
            this.f359274g = null;
            this.f359893c = null;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super C> comparator() {
            B4.this.getClass();
            return null;
        }

        @Override // com.google.common.collect.C37381n4.g, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return e(obj) && super.containsKey(obj);
        }

        public final boolean e(@I41.a Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.f359272e != null) {
                comparator();
                throw null;
            }
            if (this.f359273f == null) {
                return true;
            }
            comparator();
            throw null;
        }

        public final void f() {
            SortedMap<C, V> sortedMap = this.f359274g;
            R r12 = this.f359892b;
            B4 b42 = B4.this;
            if (sortedMap == null || (sortedMap.isEmpty() && b42.f359870d.containsKey(r12))) {
                this.f359274g = (SortedMap) b42.f359870d.get(r12);
            }
        }

        @Override // java.util.SortedMap
        public final C firstKey() {
            d();
            Map<C, V> map = this.f359893c;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedMap
        public final SortedMap<C, V> headMap(C c12) {
            c12.getClass();
            com.google.common.base.M.g(e(c12));
            return new c(this.f359892b, this.f359272e, c12);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Set keySet() {
            return new M2.t(this);
        }

        @Override // java.util.SortedMap
        public final C lastKey() {
            d();
            Map<C, V> map = this.f359893c;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.C37381n4.g, java.util.AbstractMap, java.util.Map
        @I41.a
        public final V put(C c12, V v12) {
            c12.getClass();
            com.google.common.base.M.g(e(c12));
            return (V) super.put(c12, v12);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // java.util.SortedMap
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.SortedMap<C, V> subMap(C r4, C r5) {
            /*
                r3 = this;
                r4.getClass()
                boolean r0 = r3.e(r4)
                if (r0 == 0) goto L14
                r5.getClass()
                boolean r0 = r3.e(r5)
                if (r0 == 0) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                com.google.common.base.M.g(r0)
                com.google.common.collect.B4$c r0 = new com.google.common.collect.B4$c
                com.google.common.collect.B4 r1 = com.google.common.collect.B4.this
                R r2 = r3.f359892b
                r0.<init>(r2, r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.B4.c.subMap(java.lang.Object, java.lang.Object):java.util.SortedMap");
        }

        @Override // java.util.SortedMap
        public final SortedMap<C, V> tailMap(C c12) {
            c12.getClass();
            com.google.common.base.M.g(e(c12));
            return new c(this.f359892b, c12, this.f359273f);
        }
    }

    @Override // com.google.common.collect.C37375m4, com.google.common.collect.C37381n4, com.google.common.collect.t4, com.google.common.collect.R3
    public final Map d() {
        return super.d();
    }

    @Override // com.google.common.collect.C37381n4
    public final Map k(Object obj) {
        return new C37381n4.c(obj);
    }

    @Override // com.google.common.collect.C37381n4
    public final Iterator<C> p() {
        W1.h(this.f359870d.values(), new com.google.android.gms.common.internal.P0(22));
        com.google.common.base.M.j(null, "comparator");
        throw null;
    }

    @Override // com.google.common.collect.C37381n4
    public final Map u(Object obj) {
        return new c(obj, null, null);
    }
}
