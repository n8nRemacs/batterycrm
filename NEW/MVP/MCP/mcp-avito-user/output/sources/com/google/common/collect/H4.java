package com.google.common.collect;

import bZ0.InterfaceC25601b;
import com.google.common.collect.AbstractC37316d;
import com.google.common.collect.C37325e2;
import com.google.common.collect.Y;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: TreeRangeSet.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
public class H4<C extends Comparable<?>> extends AbstractC37364l<C> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    @XY0.e
    public final NavigableMap<Y<C>, B3<C>> f359358b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<B3<C>> f359359c;

    /* compiled from: TreeRangeSet.java */
    public final class b extends B0<B3<C>> implements Set<B3<C>> {

        /* renamed from: b, reason: collision with root package name */
        public final Collection<B3<C>> f359360b;

        public b(Collection collection) {
            this.f359360b = collection;
        }

        @Override // com.google.common.collect.B0, com.google.common.collect.S0
        public final Object X() {
            return this.f359360b;
        }

        @Override // com.google.common.collect.B0
        /* renamed from: Y */
        public final Collection<B3<C>> X() {
            return this.f359360b;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@I41.a Object obj) {
            return W3.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return W3.e(this);
        }
    }

    /* compiled from: TreeRangeSet.java */
    public final class c extends H4<C> {
    }

    /* compiled from: TreeRangeSet.java */
    public static final class d<C extends Comparable<?>> extends AbstractC37358k<Y<C>, B3<C>> {

        /* renamed from: b, reason: collision with root package name */
        public final NavigableMap<Y<C>, B3<C>> f359361b = new e(null);

        /* renamed from: c, reason: collision with root package name */
        public final B3<Y<C>> f359362c;

        /* compiled from: TreeRangeSet.java */
        public class a extends AbstractC37316d<Map.Entry<Y<C>, B3<C>>> {

            /* renamed from: d, reason: collision with root package name */
            public Y<C> f359363d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC37449y3 f359364e;

            public a(Y y12, InterfaceC37449y3 interfaceC37449y3) {
                this.f359364e = interfaceC37449y3;
                this.f359363d = y12;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractC37316d
            @I41.a
            public final Object a() {
                B3 b32;
                if (!d.this.f359362c.f359266c.h(this.f359363d)) {
                    Y<C> y12 = this.f359363d;
                    Y.b bVar = Y.b.f359605c;
                    if (y12 != bVar) {
                        InterfaceC37449y3 interfaceC37449y3 = this.f359364e;
                        if (interfaceC37449y3.hasNext()) {
                            B3 b33 = (B3) interfaceC37449y3.next();
                            b32 = new B3(this.f359363d, b33.f359265b);
                            this.f359363d = b33.f359266c;
                        } else {
                            b32 = new B3(this.f359363d, bVar);
                            this.f359363d = bVar;
                        }
                        return new C37384o1(b32.f359265b, b32);
                    }
                }
                this.f359661b = AbstractC37316d.b.f359666d;
                return null;
            }
        }

        /* compiled from: TreeRangeSet.java */
        public class b extends AbstractC37316d<Map.Entry<Y<C>, B3<C>>> {

            /* renamed from: d, reason: collision with root package name */
            public Y<C> f359366d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC37449y3 f359367e;

            public b(Y y12, InterfaceC37449y3 interfaceC37449y3) {
                this.f359367e = interfaceC37449y3;
                this.f359366d = y12;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractC37316d
            @I41.a
            public final Object a() {
                Y<C> y12 = this.f359366d;
                Y.d dVar = Y.d.f359606c;
                AbstractC37316d.b bVar = AbstractC37316d.b.f359666d;
                if (y12 == dVar) {
                    this.f359661b = bVar;
                    return null;
                }
                InterfaceC37449y3 interfaceC37449y3 = this.f359367e;
                boolean zHasNext = interfaceC37449y3.hasNext();
                d dVar2 = d.this;
                if (zHasNext) {
                    B3 b32 = (B3) interfaceC37449y3.next();
                    B3 b33 = new B3(b32.f359266c, this.f359366d);
                    this.f359366d = b32.f359265b;
                    Y<C> y13 = dVar2.f359362c.f359265b;
                    Object obj = b33.f359265b;
                    if (y13.h(obj)) {
                        return new C37384o1(obj, b33);
                    }
                } else if (dVar2.f359362c.f359265b.h(dVar)) {
                    B3 b34 = new B3(dVar, this.f359366d);
                    this.f359366d = dVar;
                    return new C37384o1(dVar, b34);
                }
                this.f359661b = bVar;
                return null;
            }
        }

        public d(B3 b32) {
            this.f359362c = b32;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.M2.n
        public final Iterator<Map.Entry<Y<C>, B3<C>>> a() {
            Collection collectionValues;
            B3<Y<C>> b32 = this.f359362c;
            boolean zC2 = b32.c();
            NavigableMap<Y<C>, B3<C>> navigableMap = this.f359361b;
            if (zC2) {
                Y<C> y12 = b32.f359265b;
                collectionValues = ((e) navigableMap).tailMap((Y) y12.e(), y12.k() == BoundType.f359277c).values();
            } else {
                collectionValues = ((AbstractMap) navigableMap).values();
            }
            InterfaceC37449y3 interfaceC37449y3I = C37325e2.i(collectionValues.iterator());
            Y y13 = Y.d.f359606c;
            if (!b32.a(y13) || (interfaceC37449y3I.hasNext() && ((B3) ((C37325e2.h) interfaceC37449y3I).a()).f359265b == y13)) {
                if (!interfaceC37449y3I.hasNext()) {
                    return C37325e2.d.f359709e;
                }
                y13 = ((B3) interfaceC37449y3I.next()).f359266c;
            }
            return new a(y13, interfaceC37449y3I);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractC37358k
        public final Iterator<Map.Entry<Y<C>, B3<C>>> b() {
            B3<Y<C>> b32 = this.f359362c;
            boolean zD2 = b32.d();
            Y<C> y12 = b32.f359266c;
            InterfaceC37449y3 interfaceC37449y3I = C37325e2.i(((e) this.f359361b).headMap(zD2 ? (Y) y12.e() : Y.b.f359605c, b32.d() && y12.l() == BoundType.f359277c).descendingMap().values().iterator());
            if (!interfaceC37449y3I.hasNext()) {
                if (b32.a(Y.d.f359606c)) {
                    throw null;
                }
                return C37325e2.d.f359709e;
            }
            C37325e2.h hVar = (C37325e2.h) interfaceC37449y3I;
            Object obj = ((B3) hVar.a()).f359266c;
            Object obj2 = Y.b.f359605c;
            if (obj == obj2) {
                return new b((Y) com.google.common.base.D.a(((B3) interfaceC37449y3I.next()).f359265b, obj2), interfaceC37449y3I);
            }
            Object obj3 = ((B3) hVar.a()).f359266c;
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final B3<C> get(@I41.a Object obj) {
            if (obj instanceof Y) {
                try {
                    Y y12 = (Y) obj;
                    Map.Entry<Y<C>, B3<C>> entryFirstEntry = d(B3.b(y12, BoundType.a(true))).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(y12)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super Y<C>> comparator() {
            return C37392p3.f359948d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return get(obj) != null;
        }

        public final NavigableMap<Y<C>, B3<C>> d(B3<Y<C>> b32) {
            B3<Y<C>> b33 = this.f359362c;
            return !b33.f(b32) ? J1.f359394h : new d(b32.e(b33));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z12) {
            return d(B3.k((Y) obj, BoundType.a(z12)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return C37325e2.l(a());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z12, Object obj2, boolean z13) {
            return d(B3.i((Y) obj, BoundType.a(z12), (Y) obj2, BoundType.a(z13)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z12) {
            return d(B3.b((Y) obj, BoundType.a(z12)));
        }
    }

    /* compiled from: TreeRangeSet.java */
    public final class f extends H4<C> {
    }

    /* compiled from: TreeRangeSet.java */
    public static final class g<C extends Comparable<?>> extends AbstractC37358k<Y<C>, B3<C>> {

        /* renamed from: b, reason: collision with root package name */
        public final B3<Y<C>> f359375b;

        /* renamed from: c, reason: collision with root package name */
        public final B3<C> f359376c;

        /* renamed from: d, reason: collision with root package name */
        public final NavigableMap<Y<C>, B3<C>> f359377d;

        /* renamed from: e, reason: collision with root package name */
        public final NavigableMap<Y<C>, B3<C>> f359378e;

        /* compiled from: TreeRangeSet.java */
        public class a extends AbstractC37316d<Map.Entry<Y<C>, B3<C>>> {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f359379d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Y f359380e;

            public a(Iterator it, Y y12) {
                this.f359379d = it;
                this.f359380e = y12;
            }

            @Override // com.google.common.collect.AbstractC37316d
            @I41.a
            public final Object a() {
                Iterator it = this.f359379d;
                boolean zHasNext = it.hasNext();
                AbstractC37316d.b bVar = AbstractC37316d.b.f359666d;
                if (!zHasNext) {
                    this.f359661b = bVar;
                    return null;
                }
                B3 b32 = (B3) it.next();
                if (this.f359380e.h(b32.f359265b)) {
                    this.f359661b = bVar;
                    return null;
                }
                B3 b3E = b32.e(g.this.f359376c);
                return new C37384o1(b3E.f359265b, b3E);
            }
        }

        /* compiled from: TreeRangeSet.java */
        public class b extends AbstractC37316d<Map.Entry<Y<C>, B3<C>>> {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f359382d;

            public b(Iterator it) {
                this.f359382d = it;
            }

            @Override // com.google.common.collect.AbstractC37316d
            @I41.a
            public final Object a() {
                Iterator it = this.f359382d;
                boolean zHasNext = it.hasNext();
                AbstractC37316d.b bVar = AbstractC37316d.b.f359666d;
                if (!zHasNext) {
                    this.f359661b = bVar;
                    return null;
                }
                B3 b32 = (B3) it.next();
                g gVar = g.this;
                if (gVar.f359376c.f359265b.compareTo(b32.f359266c) >= 0) {
                    this.f359661b = bVar;
                    return null;
                }
                B3 b3E = b32.e(gVar.f359376c);
                B3<Y<C>> b33 = gVar.f359375b;
                Object obj = b3E.f359265b;
                if (b33.a(obj)) {
                    return new C37384o1(obj, b3E);
                }
                this.f359661b = bVar;
                return null;
            }
        }

        @Override // com.google.common.collect.M2.n
        public final Iterator<Map.Entry<Y<C>, B3<C>>> a() {
            Iterator<B3<C>> it;
            B3<C> b32 = this.f359376c;
            if (b32.g()) {
                return C37325e2.d.f359709e;
            }
            B3<Y<C>> b33 = this.f359375b;
            Y<C> y12 = b33.f359266c;
            Object obj = b32.f359265b;
            if (y12.h(obj)) {
                return C37325e2.d.f359709e;
            }
            Y<C> y13 = b33.f359265b;
            if (y13.h(obj)) {
                it = ((e) this.f359378e).tailMap(obj, false).values().iterator();
            } else {
                it = this.f359377d.tailMap((Y) y13.e(), y13.k() == BoundType.f359277c).values().iterator();
            }
            return new a(it, (Y) C37392p3.f359948d.c(b33.f359266c, Y.a(b32.f359266c)));
        }

        @Override // com.google.common.collect.AbstractC37358k
        public final Iterator<Map.Entry<Y<C>, B3<C>>> b() {
            B3<C> b32 = this.f359376c;
            if (b32.g()) {
                return C37325e2.d.f359709e;
            }
            Y y12 = (Y) C37392p3.f359948d.c(this.f359375b.f359266c, Y.a(b32.f359266c));
            return new b(this.f359377d.headMap((Y) y12.e(), y12.l() == BoundType.f359277c).descendingMap().values().iterator());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final B3<C> get(@I41.a Object obj) {
            B3<C> b32 = this.f359376c;
            if (obj instanceof Y) {
                try {
                    Y<C> y12 = (Y) obj;
                    if (this.f359375b.a(y12) && y12.compareTo(b32.f359265b) >= 0 && y12.compareTo(b32.f359266c) < 0) {
                        boolean zEquals = y12.equals(b32.f359265b);
                        NavigableMap<Y<C>, B3<C>> navigableMap = this.f359377d;
                        if (zEquals) {
                            Map.Entry<Y<C>, B3<C>> entryFloorEntry = navigableMap.floorEntry(y12);
                            B3<C> value = entryFloorEntry == null ? null : entryFloorEntry.getValue();
                            if (value != null && value.f359266c.compareTo(b32.f359265b) > 0) {
                                return value.e(b32);
                            }
                        } else {
                            B3<C> b33 = navigableMap.get(y12);
                            if (b33 != null) {
                                return b33.e(b32);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super Y<C>> comparator() {
            return C37392p3.f359948d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return get(obj) != null;
        }

        public final NavigableMap<Y<C>, B3<C>> d(B3<Y<C>> b32) {
            B3<Y<C>> b33 = this.f359375b;
            return !b32.f(b33) ? J1.f359394h : new g(b33.e(b32), this.f359376c, this.f359377d);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z12) {
            return d(B3.k((Y) obj, BoundType.a(z12)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return C37325e2.l(a());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z12, Object obj2, boolean z13) {
            return d(B3.i((Y) obj, BoundType.a(z12), (Y) obj2, BoundType.a(z13)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z12) {
            return d(B3.b((Y) obj, BoundType.a(z12)));
        }

        public g(B3<Y<C>> b32, B3<C> b33, NavigableMap<Y<C>, B3<C>> navigableMap) {
            b32.getClass();
            this.f359375b = b32;
            b33.getClass();
            this.f359376c = b33;
            navigableMap.getClass();
            this.f359377d = navigableMap;
            this.f359378e = new e(navigableMap);
        }
    }

    public H4() {
        throw null;
    }

    public H4(NavigableMap navigableMap, a aVar) {
        this.f359358b = navigableMap;
    }

    @Override // com.google.common.collect.E3
    public final Set<B3<C>> a() {
        Set<B3<C>> set = this.f359359c;
        if (set != null) {
            return set;
        }
        b bVar = new b(this.f359358b.values());
        this.f359359c = bVar;
        return bVar;
    }

    /* compiled from: TreeRangeSet.java */
    @XY0.e
    public static final class e<C extends Comparable<?>> extends AbstractC37358k<Y<C>, B3<C>> {

        /* renamed from: b, reason: collision with root package name */
        public final NavigableMap<Y<C>, B3<C>> f359369b;

        /* renamed from: c, reason: collision with root package name */
        public final B3<Y<C>> f359370c;

        /* compiled from: TreeRangeSet.java */
        public class a extends AbstractC37316d<Map.Entry<Y<C>, B3<C>>> {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f359371d;

            public a(Iterator it) {
                this.f359371d = it;
            }

            @Override // com.google.common.collect.AbstractC37316d
            @I41.a
            public final Object a() {
                Iterator it = this.f359371d;
                boolean zHasNext = it.hasNext();
                AbstractC37316d.b bVar = AbstractC37316d.b.f359666d;
                if (!zHasNext) {
                    this.f359661b = bVar;
                    return null;
                }
                B3 b32 = (B3) it.next();
                if (!e.this.f359370c.f359266c.h(b32.f359266c)) {
                    return new C37384o1(b32.f359266c, b32);
                }
                this.f359661b = bVar;
                return null;
            }
        }

        /* compiled from: TreeRangeSet.java */
        public class b extends AbstractC37316d<Map.Entry<Y<C>, B3<C>>> {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC37449y3 f359373d;

            public b(InterfaceC37449y3 interfaceC37449y3) {
                this.f359373d = interfaceC37449y3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractC37316d
            @I41.a
            public final Object a() {
                InterfaceC37449y3 interfaceC37449y3 = this.f359373d;
                boolean zHasNext = interfaceC37449y3.hasNext();
                AbstractC37316d.b bVar = AbstractC37316d.b.f359666d;
                if (!zHasNext) {
                    this.f359661b = bVar;
                    return null;
                }
                B3 b32 = (B3) interfaceC37449y3.next();
                if (e.this.f359370c.f359265b.h(b32.f359266c)) {
                    return new C37384o1(b32.f359266c, b32);
                }
                this.f359661b = bVar;
                return null;
            }
        }

        public e(NavigableMap<Y<C>, B3<C>> navigableMap) {
            this.f359369b = navigableMap;
            this.f359370c = (B3<Y<C>>) B3.f359264d;
        }

        @Override // com.google.common.collect.M2.n
        public final Iterator<Map.Entry<Y<C>, B3<C>>> a() {
            Iterator<B3<C>> it;
            B3<Y<C>> b32 = this.f359370c;
            boolean zC2 = b32.c();
            NavigableMap<Y<C>, B3<C>> navigableMap = this.f359369b;
            if (zC2) {
                Y<C> y12 = b32.f359265b;
                Map.Entry<Y<C>, B3<C>> entryLowerEntry = navigableMap.lowerEntry((Y) y12.e());
                it = entryLowerEntry == null ? navigableMap.values().iterator() : y12.h(entryLowerEntry.getValue().f359266c) ? navigableMap.tailMap(entryLowerEntry.getKey(), true).values().iterator() : navigableMap.tailMap((Y) y12.e(), true).values().iterator();
            } else {
                it = navigableMap.values().iterator();
            }
            return new a(it);
        }

        @Override // com.google.common.collect.AbstractC37358k
        public final Iterator<Map.Entry<Y<C>, B3<C>>> b() {
            B3<Y<C>> b32 = this.f359370c;
            boolean zD2 = b32.d();
            Y<C> y12 = b32.f359266c;
            NavigableMap<Y<C>, B3<C>> navigableMap = this.f359369b;
            InterfaceC37449y3 interfaceC37449y3I = C37325e2.i((zD2 ? navigableMap.headMap((Y) y12.e(), false).descendingMap().values() : navigableMap.descendingMap().values()).iterator());
            if (interfaceC37449y3I.hasNext() && y12.h(((B3) ((C37325e2.h) interfaceC37449y3I).a()).f359266c)) {
                interfaceC37449y3I.next();
            }
            return new b(interfaceC37449y3I);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final B3<C> get(@I41.a Object obj) {
            Map.Entry<Y<C>, B3<C>> entryLowerEntry;
            if (obj instanceof Y) {
                try {
                    Y<C> y12 = (Y) obj;
                    if (this.f359370c.a(y12) && (entryLowerEntry = this.f359369b.lowerEntry(y12)) != null && entryLowerEntry.getValue().f359266c.equals(y12)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super Y<C>> comparator() {
            return C37392p3.f359948d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return get(obj) != null;
        }

        public final NavigableMap<Y<C>, B3<C>> d(B3<Y<C>> b32) {
            B3<Y<C>> b33 = this.f359370c;
            if (!b32.f(b33)) {
                return J1.f359394h;
            }
            return new e(this.f359369b, b32.e(b33));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z12) {
            return d(B3.k((Y) obj, BoundType.a(z12)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return this.f359370c.equals(B3.f359264d) ? this.f359369b.isEmpty() : !((AbstractC37316d) a()).hasNext();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f359370c.equals(B3.f359264d) ? this.f359369b.size() : C37325e2.l(a());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z12, Object obj2, boolean z13) {
            return d(B3.i((Y) obj, BoundType.a(z12), (Y) obj2, BoundType.a(z13)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z12) {
            return d(B3.b((Y) obj, BoundType.a(z12)));
        }

        public e(NavigableMap<Y<C>, B3<C>> navigableMap, B3<Y<C>> b32) {
            this.f359369b = navigableMap;
            this.f359370c = b32;
        }
    }
}
