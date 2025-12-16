package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.InterfaceC37338g3;
import com.google.common.collect.M2;
import com.google.common.collect.t4;
import com.google.j2objc.annotations.RetainedWith;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: Synchronized.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.q4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37399q4 {

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$b */
    public static class b<K, V> extends k<K, Collection<V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        public transient Set<Map.Entry<K, Collection<V>>> f359958g;

        /* renamed from: h, reason: collision with root package name */
        @I41.a
        public transient Collection<Collection<V>> f359959h;

        public b() {
            throw null;
        }

        @Override // com.google.common.collect.C37399q4.k, java.util.Map
        public final boolean containsValue(@I41.a Object obj) {
            return values().contains(obj);
        }

        @Override // com.google.common.collect.C37399q4.k, java.util.Map
        public final Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.f359975c) {
                try {
                    if (this.f359958g == null) {
                        this.f359958g = new c(((Map) this.f359974b).entrySet(), this.f359975c, null);
                    }
                    set = this.f359958g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.C37399q4.k, java.util.Map
        @I41.a
        public final Object get(@I41.a Object obj) {
            Collection collectionA;
            synchronized (this.f359975c) {
                Collection collection = (Collection) super.get(obj);
                collectionA = collection == null ? null : C37399q4.a(this.f359975c, collection);
            }
            return collectionA;
        }

        @Override // com.google.common.collect.C37399q4.k, java.util.Map
        public final Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.f359975c) {
                try {
                    if (this.f359959h == null) {
                        this.f359959h = new d(((Map) this.f359974b).values(), this.f359975c, null);
                    }
                    collection = this.f359959h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$d */
    public static class d<V> extends f<Collection<V>> {
        private static final long serialVersionUID = 0;

        /* compiled from: Synchronized.java */
        /* renamed from: com.google.common.collect.q4$d$a */
        public class a extends z4<Collection<V>, Collection<V>> {
            public a(Iterator it) {
                super(it);
            }

            @Override // com.google.common.collect.z4
            public final Object a(Object obj) {
                return C37399q4.a(d.this.f359975c, (Collection) obj);
            }
        }

        public d() {
            throw null;
        }

        @Override // com.google.common.collect.C37399q4.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Collection<V>> iterator() {
            return new a(super.iterator());
        }
    }

    /* compiled from: Synchronized.java */
    @XY0.e
    /* renamed from: com.google.common.collect.q4$e */
    public static class e<K, V> extends k<K, V> implements A<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        public transient Set<V> f359962g;

        /* renamed from: h, reason: collision with root package name */
        @I41.a
        @RetainedWith
        public transient A<V, K> f359963h;

        public e(A<K, V> a12, @I41.a Object obj, @I41.a A<V, K> a13) {
            super(a12, obj);
            this.f359963h = a13;
        }

        @Override // com.google.common.collect.A
        public final A<V, K> O() {
            A<V, K> a12;
            synchronized (this.f359975c) {
                try {
                    if (this.f359963h == null) {
                        this.f359963h = new e(((A) ((Map) this.f359974b)).O(), this.f359975c, this);
                    }
                    a12 = this.f359963h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return a12;
        }

        @Override // com.google.common.collect.C37399q4.k
        public final Map e() {
            return (A) ((Map) this.f359974b);
        }

        @Override // com.google.common.collect.C37399q4.k, java.util.Map
        public final Set<V> values() {
            Set<V> set;
            synchronized (this.f359975c) {
                try {
                    if (this.f359962g == null) {
                        this.f359962g = C37399q4.e(((A) ((Map) this.f359974b)).values(), this.f359975c);
                    }
                    set = this.f359962g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$g */
    public static final class g<E> extends q<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Deque
        public final void addFirst(E e12) {
            synchronized (this.f359975c) {
                ((Deque) super.e()).addFirst(e12);
            }
        }

        @Override // java.util.Deque
        public final void addLast(E e12) {
            synchronized (this.f359975c) {
                ((Deque) super.e()).addLast(e12);
            }
        }

        @Override // java.util.Deque
        public final Iterator<E> descendingIterator() {
            Iterator<E> itDescendingIterator;
            synchronized (this.f359975c) {
                itDescendingIterator = ((Deque) super.e()).descendingIterator();
            }
            return itDescendingIterator;
        }

        @Override // com.google.common.collect.C37399q4.q, com.google.common.collect.C37399q4.f
        public final Collection e() {
            return (Deque) super.e();
        }

        @Override // com.google.common.collect.C37399q4.q
        /* renamed from: g */
        public final Queue e() {
            return (Deque) super.e();
        }

        @Override // java.util.Deque
        public final E getFirst() {
            E e12;
            synchronized (this.f359975c) {
                e12 = (E) ((Deque) super.e()).getFirst();
            }
            return e12;
        }

        @Override // java.util.Deque
        public final E getLast() {
            E e12;
            synchronized (this.f359975c) {
                e12 = (E) ((Deque) super.e()).getLast();
            }
            return e12;
        }

        @Override // java.util.Deque
        public final boolean offerFirst(E e12) {
            boolean zOfferFirst;
            synchronized (this.f359975c) {
                zOfferFirst = ((Deque) super.e()).offerFirst(e12);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public final boolean offerLast(E e12) {
            boolean zOfferLast;
            synchronized (this.f359975c) {
                zOfferLast = ((Deque) super.e()).offerLast(e12);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        @I41.a
        public final E peekFirst() {
            E e12;
            synchronized (this.f359975c) {
                e12 = (E) ((Deque) super.e()).peekFirst();
            }
            return e12;
        }

        @Override // java.util.Deque
        @I41.a
        public final E peekLast() {
            E e12;
            synchronized (this.f359975c) {
                e12 = (E) ((Deque) super.e()).peekLast();
            }
            return e12;
        }

        @Override // java.util.Deque
        @I41.a
        public final E pollFirst() {
            E e12;
            synchronized (this.f359975c) {
                e12 = (E) ((Deque) super.e()).pollFirst();
            }
            return e12;
        }

        @Override // java.util.Deque
        @I41.a
        public final E pollLast() {
            E e12;
            synchronized (this.f359975c) {
                e12 = (E) ((Deque) super.e()).pollLast();
            }
            return e12;
        }

        @Override // java.util.Deque
        public final E pop() {
            E e12;
            synchronized (this.f359975c) {
                e12 = (E) ((Deque) super.e()).pop();
            }
            return e12;
        }

        @Override // java.util.Deque
        public final void push(E e12) {
            synchronized (this.f359975c) {
                ((Deque) super.e()).push(e12);
            }
        }

        @Override // java.util.Deque
        public final E removeFirst() {
            E e12;
            synchronized (this.f359975c) {
                e12 = (E) ((Deque) super.e()).removeFirst();
            }
            return e12;
        }

        @Override // java.util.Deque
        public final boolean removeFirstOccurrence(@I41.a Object obj) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.f359975c) {
                zRemoveFirstOccurrence = ((Deque) super.e()).removeFirstOccurrence(obj);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public final E removeLast() {
            E e12;
            synchronized (this.f359975c) {
                e12 = (E) ((Deque) super.e()).removeLast();
            }
            return e12;
        }

        @Override // java.util.Deque
        public final boolean removeLastOccurrence(@I41.a Object obj) {
            boolean zRemoveLastOccurrence;
            synchronized (this.f359975c) {
                zRemoveLastOccurrence = ((Deque) super.e()).removeLastOccurrence(obj);
            }
            return zRemoveLastOccurrence;
        }
    }

    /* compiled from: Synchronized.java */
    @XY0.c
    /* renamed from: com.google.common.collect.q4$h */
    public static class h<K, V> extends p implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        public h() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(@I41.a Object obj) {
            boolean zEquals;
            synchronized (this.f359975c) {
                zEquals = ((Map.Entry) this.f359974b).equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            K k12;
            synchronized (this.f359975c) {
                k12 = (K) ((Map.Entry) this.f359974b).getKey();
            }
            return k12;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            V v12;
            synchronized (this.f359975c) {
                v12 = (V) ((Map.Entry) this.f359974b).getValue();
            }
            return v12;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f359975c) {
                iHashCode = ((Map.Entry) this.f359974b).hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v12) {
            V v13;
            synchronized (this.f359975c) {
                v13 = (V) ((Map.Entry) this.f359974b).setValue(v12);
            }
            return v13;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$i */
    public static class i<E> extends f<E> implements List<E> {
        private static final long serialVersionUID = 0;

        public i() {
            throw null;
        }

        @Override // java.util.List
        public final void add(int i12, E e12) {
            synchronized (this.f359975c) {
                e().add(i12, e12);
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i12, Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.f359975c) {
                zAddAll = e().addAll(i12, collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection, java.util.List
        public final boolean equals(@I41.a Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f359975c) {
                zEquals = e().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.C37399q4.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final List<E> e() {
            return (List) ((Collection) this.f359974b);
        }

        @Override // java.util.List
        public final E get(int i12) {
            E e12;
            synchronized (this.f359975c) {
                e12 = e().get(i12);
            }
            return e12;
        }

        @Override // java.util.Collection, java.util.List
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f359975c) {
                iHashCode = e().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public final int indexOf(@I41.a Object obj) {
            int iIndexOf;
            synchronized (this.f359975c) {
                iIndexOf = e().indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            int iLastIndexOf;
            synchronized (this.f359975c) {
                iLastIndexOf = e().lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public final ListIterator<E> listIterator() {
            return e().listIterator();
        }

        @Override // java.util.List
        public final E remove(int i12) {
            E eRemove;
            synchronized (this.f359975c) {
                eRemove = e().remove(i12);
            }
            return eRemove;
        }

        @Override // java.util.List
        public final E set(int i12, E e12) {
            E e13;
            synchronized (this.f359975c) {
                e13 = e().set(i12, e12);
            }
            return e13;
        }

        @Override // java.util.List
        public final List<E> subList(int i12, int i13) {
            List<E> listC;
            synchronized (this.f359975c) {
                listC = C37399q4.c(this.f359975c, e().subList(i12, i13));
            }
            return listC;
        }

        @Override // java.util.List
        public final ListIterator<E> listIterator(int i12) {
            return e().listIterator(i12);
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$j */
    public static class j<K, V> extends l<K, V> implements InterfaceC37408s2<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.C37399q4.l
        public final R2 e() {
            return (InterfaceC37408s2) ((R2) this.f359974b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.C37399q4.l, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((j<K, V>) obj);
        }

        @Override // com.google.common.collect.C37399q4.l, com.google.common.collect.R2, com.google.common.collect.T3
        public final List<V> a(@I41.a Object obj) {
            List<V> listA;
            synchronized (this.f359975c) {
                listA = ((InterfaceC37408s2) ((R2) this.f359974b)).a(obj);
            }
            return listA;
        }

        @Override // com.google.common.collect.C37399q4.l, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final List<V> get(K k12) {
            List<V> listC;
            synchronized (this.f359975c) {
                listC = C37399q4.c(this.f359975c, ((InterfaceC37408s2) ((R2) this.f359974b)).get((InterfaceC37408s2) k12));
            }
            return listC;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$k */
    public static class k<K, V> extends p implements Map<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public transient Set<K> f359964d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public transient Collection<V> f359965e;

        /* renamed from: f, reason: collision with root package name */
        @I41.a
        public transient Set<Map.Entry<K, V>> f359966f;

        public k() {
            throw null;
        }

        @Override // java.util.Map
        public final void clear() {
            synchronized (this.f359975c) {
                e().clear();
            }
        }

        @Override // java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            boolean zContainsKey;
            synchronized (this.f359975c) {
                zContainsKey = e().containsKey(obj);
            }
            return zContainsKey;
        }

        public boolean containsValue(@I41.a Object obj) {
            boolean zContainsValue;
            synchronized (this.f359975c) {
                zContainsValue = e().containsValue(obj);
            }
            return zContainsValue;
        }

        public Map<K, V> e() {
            return (Map) this.f359974b;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f359975c) {
                try {
                    if (this.f359966f == null) {
                        this.f359966f = C37399q4.e(e().entrySet(), this.f359975c);
                    }
                    set = this.f359966f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public final boolean equals(@I41.a Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f359975c) {
                zEquals = e().equals(obj);
            }
            return zEquals;
        }

        @I41.a
        public V get(@I41.a Object obj) {
            V v12;
            synchronized (this.f359975c) {
                v12 = e().get(obj);
            }
            return v12;
        }

        @Override // java.util.Map
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f359975c) {
                iHashCode = e().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f359975c) {
                zIsEmpty = e().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f359975c) {
                try {
                    if (this.f359964d == null) {
                        this.f359964d = C37399q4.e(e().keySet(), this.f359975c);
                    }
                    set = this.f359964d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Map
        @I41.a
        public final V put(K k12, V v12) {
            V vPut;
            synchronized (this.f359975c) {
                vPut = e().put(k12, v12);
            }
            return vPut;
        }

        @Override // java.util.Map
        public final void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.f359975c) {
                e().putAll(map);
            }
        }

        @Override // java.util.Map
        @I41.a
        public final V remove(@I41.a Object obj) {
            V vRemove;
            synchronized (this.f359975c) {
                vRemove = e().remove(obj);
            }
            return vRemove;
        }

        @Override // java.util.Map
        public final int size() {
            int size;
            synchronized (this.f359975c) {
                size = e().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f359975c) {
                try {
                    if (this.f359965e == null) {
                        this.f359965e = new f(e().values(), this.f359975c, null);
                    }
                    collection = this.f359965e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$l */
    public static class l<K, V> extends p implements R2<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public transient InterfaceC37338g3<K> f359967d;

        @Override // com.google.common.collect.R2
        public final InterfaceC37338g3<K> Q() {
            InterfaceC37338g3<K> interfaceC37338g3;
            synchronized (this.f359975c) {
                try {
                    if (this.f359967d == null) {
                        InterfaceC37338g3<K> interfaceC37338g3Q = e().Q();
                        Object obj = this.f359975c;
                        if (!(interfaceC37338g3Q instanceof m) && !(interfaceC37338g3Q instanceof A1)) {
                            interfaceC37338g3Q = new m(interfaceC37338g3Q, obj, null);
                        }
                        this.f359967d = interfaceC37338g3Q;
                    }
                    interfaceC37338g3 = this.f359967d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return interfaceC37338g3;
        }

        @Override // com.google.common.collect.R2
        public final boolean R(@I41.a Object obj, @I41.a Object obj2) {
            boolean zR2;
            synchronized (this.f359975c) {
                zR2 = e().R(obj, obj2);
            }
            return zR2;
        }

        @Override // com.google.common.collect.R2
        public final Map<K, Collection<V>> V() {
            synchronized (this.f359975c) {
            }
            return null;
        }

        public Collection<V> a(@I41.a Object obj) {
            Collection<V> collectionA;
            synchronized (this.f359975c) {
                collectionA = e().a(obj);
            }
            return collectionA;
        }

        @Override // com.google.common.collect.R2, com.google.common.collect.T3
        public Collection<Map.Entry<K, V>> b() {
            synchronized (this.f359975c) {
            }
            return null;
        }

        @Override // com.google.common.collect.R2
        public final void clear() {
            synchronized (this.f359975c) {
                e().clear();
            }
        }

        @Override // com.google.common.collect.R2
        public final boolean containsKey(@I41.a Object obj) {
            boolean zContainsKey;
            synchronized (this.f359975c) {
                zContainsKey = e().containsKey(obj);
            }
            return zContainsKey;
        }

        public R2<K, V> e() {
            return (R2) this.f359974b;
        }

        @Override // com.google.common.collect.R2
        public final boolean equals(@I41.a Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f359975c) {
                zEquals = e().equals(obj);
            }
            return zEquals;
        }

        public Collection<V> get(@InterfaceC37434x3 K k12) {
            Collection<V> collectionA;
            synchronized (this.f359975c) {
                collectionA = C37399q4.a(this.f359975c, e().get(k12));
            }
            return collectionA;
        }

        @Override // com.google.common.collect.R2
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f359975c) {
                iHashCode = e().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.R2
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f359975c) {
                zIsEmpty = e().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.R2
        public final Set<K> keySet() {
            synchronized (this.f359975c) {
            }
            return null;
        }

        @Override // com.google.common.collect.R2
        public final boolean put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
            boolean zPut;
            synchronized (this.f359975c) {
                zPut = e().put(k12, v12);
            }
            return zPut;
        }

        @Override // com.google.common.collect.R2
        public final boolean remove(@I41.a Object obj, @I41.a Object obj2) {
            boolean zRemove;
            synchronized (this.f359975c) {
                zRemove = e().remove(obj, obj2);
            }
            return zRemove;
        }

        @Override // com.google.common.collect.R2
        public final int size() {
            int size;
            synchronized (this.f359975c) {
                size = e().size();
            }
            return size;
        }

        @Override // com.google.common.collect.R2
        public final Collection<V> values() {
            synchronized (this.f359975c) {
            }
            return null;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$m */
    public static class m<E> extends f<E> implements InterfaceC37338g3<E> {
        private static final long serialVersionUID = 0;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public transient Set<E> f359968d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public transient Set<InterfaceC37338g3.a<E>> f359969e;

        public m() {
            throw null;
        }

        @Override // com.google.common.collect.InterfaceC37338g3
        public final int O3(int i12, @I41.a Object obj) {
            int iO3;
            synchronized (this.f359975c) {
                iO3 = e().O3(i12, obj);
            }
            return iO3;
        }

        @Override // com.google.common.collect.InterfaceC37338g3
        public final boolean P2(int i12, @InterfaceC37434x3 Object obj) {
            boolean zP2;
            synchronized (this.f359975c) {
                zP2 = e().P2(i12, obj);
            }
            return zP2;
        }

        @Override // com.google.common.collect.InterfaceC37338g3
        public final int S5(@I41.a Object obj) {
            int iS5;
            synchronized (this.f359975c) {
                iS5 = e().S5(obj);
            }
            return iS5;
        }

        @Override // com.google.common.collect.InterfaceC37338g3
        public final int add(int i12, @InterfaceC37434x3 Object obj) {
            int iAdd;
            synchronized (this.f359975c) {
                iAdd = e().add(i12, obj);
            }
            return iAdd;
        }

        @Override // com.google.common.collect.InterfaceC37338g3
        public final Set<InterfaceC37338g3.a<E>> entrySet() {
            Set<InterfaceC37338g3.a<E>> set;
            synchronized (this.f359975c) {
                try {
                    if (this.f359969e == null) {
                        Set<InterfaceC37338g3.a<E>> setEntrySet = e().entrySet();
                        Object obj = this.f359975c;
                        this.f359969e = setEntrySet instanceof SortedSet ? C37399q4.f((SortedSet) setEntrySet, obj) : C37399q4.e(setEntrySet, obj);
                    }
                    set = this.f359969e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.InterfaceC37338g3
        public final boolean equals(@I41.a Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f359975c) {
                zEquals = e().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.C37399q4.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final InterfaceC37338g3<E> e() {
            return (InterfaceC37338g3) ((Collection) this.f359974b);
        }

        @Override // java.util.Collection, com.google.common.collect.InterfaceC37338g3
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f359975c) {
                iHashCode = e().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.InterfaceC37338g3
        public final Set<E> k() {
            Set<E> set;
            synchronized (this.f359975c) {
                try {
                    if (this.f359968d == null) {
                        Set<E> setK = e().k();
                        Object obj = this.f359975c;
                        this.f359968d = setK instanceof SortedSet ? C37399q4.f((SortedSet) setK, obj) : C37399q4.e(setK, obj);
                    }
                    set = this.f359968d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.InterfaceC37338g3
        public final int p6(@InterfaceC37434x3 Object obj) {
            int iP6;
            synchronized (this.f359975c) {
                iP6 = e().p6(obj);
            }
            return iP6;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$p */
    public static class p implements Serializable {

        @XY0.c
        @XY0.d
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Object f359974b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f359975c;

        public p(Object obj, @I41.a Object obj2) {
            obj.getClass();
            this.f359974b = obj;
            this.f359975c = obj2 == null ? this : obj2;
        }

        @XY0.c
        @XY0.d
        private void writeObject(ObjectOutputStream objectOutputStream) {
            synchronized (this.f359975c) {
                objectOutputStream.defaultWriteObject();
            }
        }

        public final String toString() {
            String string;
            synchronized (this.f359975c) {
                string = this.f359974b.toString();
            }
            return string;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$q */
    public static class q<E> extends f<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Queue
        public final E element() {
            E eElement;
            synchronized (this.f359975c) {
                eElement = e().element();
            }
            return eElement;
        }

        @Override // com.google.common.collect.C37399q4.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Queue<E> e() {
            return (Queue) ((Collection) this.f359974b);
        }

        @Override // java.util.Queue
        public final boolean offer(E e12) {
            boolean zOffer;
            synchronized (this.f359975c) {
                zOffer = e().offer(e12);
            }
            return zOffer;
        }

        @Override // java.util.Queue
        @I41.a
        public final E peek() {
            E ePeek;
            synchronized (this.f359975c) {
                ePeek = e().peek();
            }
            return ePeek;
        }

        @Override // java.util.Queue
        @I41.a
        public final E poll() {
            E ePoll;
            synchronized (this.f359975c) {
                ePoll = e().poll();
            }
            return ePoll;
        }

        @Override // java.util.Queue
        public final E remove() {
            E eRemove;
            synchronized (this.f359975c) {
                eRemove = e().remove();
            }
            return eRemove;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$r */
    public static class r<E> extends i<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        public r() {
            throw null;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$s */
    public static class s<E> extends f<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        public s() {
            throw null;
        }

        public boolean equals(@I41.a Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f359975c) {
                zEquals = e().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.C37399q4.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Set<E> e() {
            return (Set) ((Collection) this.f359974b);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f359975c) {
                iHashCode = e().hashCode();
            }
            return iHashCode;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$t */
    public static class t<K, V> extends l<K, V> implements T3<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.C37399q4.l
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T3<K, V> e() {
            return (T3) ((R2) this.f359974b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.C37399q4.l, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((t<K, V>) obj);
        }

        @Override // com.google.common.collect.C37399q4.l, com.google.common.collect.R2, com.google.common.collect.T3
        public Set<V> a(@I41.a Object obj) {
            Set<V> setA;
            synchronized (this.f359975c) {
                setA = e().a(obj);
            }
            return setA;
        }

        @Override // com.google.common.collect.C37399q4.l, com.google.common.collect.R2, com.google.common.collect.T3
        public final Set<Map.Entry<K, V>> b() {
            synchronized (this.f359975c) {
            }
            return null;
        }

        @Override // com.google.common.collect.C37399q4.l, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public Set<V> get(K k12) {
            Set<V> setE;
            synchronized (this.f359975c) {
                setE = C37399q4.e(e().get((T3<K, V>) k12), this.f359975c);
            }
            return setE;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$u */
    public static class u<K, V> extends k<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        public u() {
            throw null;
        }

        @Override // java.util.SortedMap
        @I41.a
        public final Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f359975c) {
                comparator = e().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            K kFirstKey;
            synchronized (this.f359975c) {
                kFirstKey = e().firstKey();
            }
            return kFirstKey;
        }

        @Override // com.google.common.collect.C37399q4.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> e() {
            return (SortedMap) ((Map) this.f359974b);
        }

        public SortedMap<K, V> headMap(K k12) {
            u uVar;
            synchronized (this.f359975c) {
                uVar = new u(e().headMap(k12), this.f359975c);
            }
            return uVar;
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            K kLastKey;
            synchronized (this.f359975c) {
                kLastKey = e().lastKey();
            }
            return kLastKey;
        }

        public SortedMap<K, V> subMap(K k12, K k13) {
            u uVar;
            synchronized (this.f359975c) {
                uVar = new u(e().subMap(k12, k13), this.f359975c);
            }
            return uVar;
        }

        public SortedMap<K, V> tailMap(K k12) {
            u uVar;
            synchronized (this.f359975c) {
                uVar = new u(e().tailMap(k12), this.f359975c);
            }
            return uVar;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$v */
    public static class v<E> extends s<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        public v() {
            throw null;
        }

        @Override // java.util.SortedSet
        @I41.a
        public final Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f359975c) {
                comparator = e().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public final E first() {
            E eFirst;
            synchronized (this.f359975c) {
                eFirst = e().first();
            }
            return eFirst;
        }

        public SortedSet<E> headSet(E e12) {
            SortedSet<E> sortedSetF;
            synchronized (this.f359975c) {
                sortedSetF = C37399q4.f(e().headSet(e12), this.f359975c);
            }
            return sortedSetF;
        }

        @Override // com.google.common.collect.C37399q4.s
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public SortedSet<E> e() {
            return (SortedSet) super.e();
        }

        @Override // java.util.SortedSet
        public final E last() {
            E eLast;
            synchronized (this.f359975c) {
                eLast = e().last();
            }
            return eLast;
        }

        public SortedSet<E> subSet(E e12, E e13) {
            SortedSet<E> sortedSetF;
            synchronized (this.f359975c) {
                sortedSetF = C37399q4.f(e().subSet(e12, e13), this.f359975c);
            }
            return sortedSetF;
        }

        public SortedSet<E> tailSet(E e12) {
            SortedSet<E> sortedSetF;
            synchronized (this.f359975c) {
                sortedSetF = C37399q4.f(e().tailSet(e12), this.f359975c);
            }
            return sortedSetF;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$w */
    public static class w<K, V> extends t<K, V> implements InterfaceC37363k4<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.C37399q4.t, com.google.common.collect.C37399q4.l
        public final R2 e() {
            return (InterfaceC37363k4) super.e();
        }

        @Override // com.google.common.collect.C37399q4.t
        /* renamed from: g */
        public final T3 e() {
            return (InterfaceC37363k4) super.e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.C37399q4.t, com.google.common.collect.C37399q4.l, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((w<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.C37399q4.t, com.google.common.collect.C37399q4.l, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final /* bridge */ /* synthetic */ Set get(Object obj) {
            return get((w<K, V>) obj);
        }

        @Override // com.google.common.collect.C37399q4.t, com.google.common.collect.C37399q4.l, com.google.common.collect.R2, com.google.common.collect.T3
        public final SortedSet<V> a(@I41.a Object obj) {
            SortedSet<V> sortedSetA;
            synchronized (this.f359975c) {
                sortedSetA = ((InterfaceC37363k4) super.e()).a(obj);
            }
            return sortedSetA;
        }

        @Override // com.google.common.collect.C37399q4.t, com.google.common.collect.C37399q4.l, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final SortedSet<V> get(K k12) {
            SortedSet<V> sortedSetF;
            synchronized (this.f359975c) {
                sortedSetF = C37399q4.f(((InterfaceC37363k4) super.e()).get((InterfaceC37363k4) k12), this.f359975c);
            }
            return sortedSetF;
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$x */
    public static final class x<R, C, V> extends p implements t4<R, C, V> {

        /* compiled from: Synchronized.java */
        /* renamed from: com.google.common.collect.q4$x$a */
        public class a implements InterfaceC37276u<Map<C, V>, Map<C, V>> {
            public a() {
            }

            @Override // com.google.common.base.InterfaceC37276u
            public final Object apply(Object obj) {
                return new k((Map) obj, x.this.f359975c);
            }
        }

        @Override // com.google.common.collect.t4
        public final Set<t4.a<R, C, V>> U() {
            Set<t4.a<R, C, V>> setE;
            synchronized (this.f359975c) {
                setE = C37399q4.e(((t4) this.f359974b).U(), this.f359975c);
            }
            return setE;
        }

        @Override // com.google.common.collect.t4, com.google.common.collect.R3
        public final Map<R, Map<C, V>> d() {
            k kVar;
            synchronized (this.f359975c) {
                kVar = new k(new M2.v(((t4) this.f359974b).d(), new L2(new a())), this.f359975c);
            }
            return kVar;
        }

        @Override // com.google.common.collect.t4
        public final boolean equals(@I41.a Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f359975c) {
                zEquals = ((t4) this.f359974b).equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.t4
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f359975c) {
                iHashCode = ((t4) this.f359974b).hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.t4
        public final int size() {
            int size;
            synchronized (this.f359975c) {
                size = ((t4) this.f359974b).size();
            }
            return size;
        }
    }

    public static Collection a(Object obj, Collection collection) {
        return collection instanceof SortedSet ? f((SortedSet) collection, obj) : collection instanceof Set ? e((Set) collection, obj) : collection instanceof List ? c(obj, (List) collection) : new f(collection, obj, null);
    }

    public static Map.Entry b(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new h(entry, obj);
    }

    public static List c(@I41.a Object obj, List list) {
        return list instanceof RandomAccess ? new r(list, obj, null) : new i(list, obj, null);
    }

    @XY0.c
    public static <E> NavigableSet<E> d(NavigableSet<E> navigableSet, @I41.a Object obj) {
        return new o(navigableSet, obj, null);
    }

    @XY0.e
    public static <E> Set<E> e(Set<E> set, @I41.a Object obj) {
        return new s(set, obj, null);
    }

    public static <E> SortedSet<E> f(SortedSet<E> sortedSet, @I41.a Object obj) {
        return new v(sortedSet, obj, null);
    }

    /* compiled from: Synchronized.java */
    @XY0.e
    /* renamed from: com.google.common.collect.q4$f */
    public static class f<E> extends p implements Collection<E> {
        private static final long serialVersionUID = 0;

        public f() {
            throw null;
        }

        public f(Collection collection, Object obj, a aVar) {
            super(collection, obj);
        }

        @Override // java.util.Collection
        public final boolean add(E e12) {
            boolean zAdd;
            synchronized (this.f359975c) {
                zAdd = e().add(e12);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.f359975c) {
                zAddAll = e().addAll(collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection
        public final void clear() {
            synchronized (this.f359975c) {
                e().clear();
            }
        }

        public boolean contains(@I41.a Object obj) {
            boolean zContains;
            synchronized (this.f359975c) {
                zContains = e().contains(obj);
            }
            return zContains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean zContainsAll;
            synchronized (this.f359975c) {
                zContainsAll = e().containsAll(collection);
            }
            return zContainsAll;
        }

        public Collection<E> e() {
            return (Collection) this.f359974b;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f359975c) {
                zIsEmpty = e().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator<E> iterator() {
            return e().iterator();
        }

        public boolean remove(@I41.a Object obj) {
            boolean zRemove;
            synchronized (this.f359975c) {
                zRemove = e().remove(obj);
            }
            return zRemove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.f359975c) {
                zRemoveAll = e().removeAll(collection);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.f359975c) {
                zRetainAll = e().retainAll(collection);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public final int size() {
            int size;
            synchronized (this.f359975c) {
                size = e().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f359975c) {
                array = e().toArray();
            }
            return array;
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f359975c) {
                tArr2 = (T[]) e().toArray(tArr);
            }
            return tArr2;
        }
    }

    /* compiled from: Synchronized.java */
    @XY0.e
    @XY0.c
    /* renamed from: com.google.common.collect.q4$o */
    public static class o<E> extends v<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public transient NavigableSet<E> f359973d;

        public o() {
            throw null;
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E ceiling(E e12) {
            E e13;
            synchronized (this.f359975c) {
                e13 = (E) ((NavigableSet) super.e()).ceiling(e12);
            }
            return e13;
        }

        @Override // java.util.NavigableSet
        public final Iterator<E> descendingIterator() {
            return ((NavigableSet) super.e()).descendingIterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> descendingSet() {
            synchronized (this.f359975c) {
                try {
                    NavigableSet<E> navigableSet = this.f359973d;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<E> navigableSetD = C37399q4.d(((NavigableSet) super.e()).descendingSet(), this.f359975c);
                    this.f359973d = navigableSetD;
                    return navigableSetD;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.collect.C37399q4.v, com.google.common.collect.C37399q4.s, com.google.common.collect.C37399q4.f
        public final Collection e() {
            return (NavigableSet) super.e();
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E floor(E e12) {
            E e13;
            synchronized (this.f359975c) {
                e13 = (E) ((NavigableSet) super.e()).floor(e12);
            }
            return e13;
        }

        @Override // com.google.common.collect.C37399q4.v, com.google.common.collect.C37399q4.s
        /* renamed from: g */
        public final Set e() {
            return (NavigableSet) super.e();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> headSet(E e12, boolean z12) {
            NavigableSet<E> navigableSetD;
            synchronized (this.f359975c) {
                navigableSetD = C37399q4.d(((NavigableSet) super.e()).headSet(e12, z12), this.f359975c);
            }
            return navigableSetD;
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E higher(E e12) {
            E e13;
            synchronized (this.f359975c) {
                e13 = (E) ((NavigableSet) super.e()).higher(e12);
            }
            return e13;
        }

        @Override // com.google.common.collect.C37399q4.v
        /* renamed from: l */
        public final SortedSet e() {
            return (NavigableSet) super.e();
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E lower(E e12) {
            E e13;
            synchronized (this.f359975c) {
                e13 = (E) ((NavigableSet) super.e()).lower(e12);
            }
            return e13;
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E pollFirst() {
            E e12;
            synchronized (this.f359975c) {
                e12 = (E) ((NavigableSet) super.e()).pollFirst();
            }
            return e12;
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E pollLast() {
            E e12;
            synchronized (this.f359975c) {
                e12 = (E) ((NavigableSet) super.e()).pollLast();
            }
            return e12;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> subSet(E e12, boolean z12, E e13, boolean z13) {
            NavigableSet<E> navigableSetD;
            synchronized (this.f359975c) {
                navigableSetD = C37399q4.d(((NavigableSet) super.e()).subSet(e12, z12, e13, z13), this.f359975c);
            }
            return navigableSetD;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> tailSet(E e12, boolean z12) {
            NavigableSet<E> navigableSetD;
            synchronized (this.f359975c) {
                navigableSetD = C37399q4.d(((NavigableSet) super.e()).tailSet(e12, z12), this.f359975c);
            }
            return navigableSetD;
        }

        @Override // com.google.common.collect.C37399q4.v, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet<E> headSet(E e12) {
            return headSet(e12, false);
        }

        @Override // com.google.common.collect.C37399q4.v, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet<E> tailSet(E e12) {
            return tailSet(e12, true);
        }

        @Override // com.google.common.collect.C37399q4.v, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet<E> subSet(E e12, E e13) {
            return subSet(e12, true, e13, false);
        }
    }

    /* compiled from: Synchronized.java */
    /* renamed from: com.google.common.collect.q4$c */
    public static class c<K, V> extends s<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        /* compiled from: Synchronized.java */
        /* renamed from: com.google.common.collect.q4$c$a */
        public class a extends z4<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {
            public a(Iterator it) {
                super(it);
            }

            @Override // com.google.common.collect.z4
            public final Object a(Object obj) {
                return new C37404r4(this, (Map.Entry) obj);
            }
        }

        public c() {
            throw null;
        }

        @Override // com.google.common.collect.C37399q4.f, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            boolean zContains;
            synchronized (this.f359975c) {
                Set<Map.Entry<K, Collection<V>>> setE = e();
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    entry.getClass();
                    zContains = setE.contains(new J2(entry));
                } else {
                    zContains = false;
                }
            }
            return zContains;
        }

        @Override // com.google.common.collect.C37399q4.f, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            boolean zA2;
            synchronized (this.f359975c) {
                zA2 = G.a(e(), collection);
            }
            return zA2;
        }

        @Override // com.google.common.collect.C37399q4.s, java.util.Collection, java.util.Set
        public final boolean equals(@I41.a Object obj) {
            boolean zB2;
            if (obj == this) {
                return true;
            }
            synchronized (this.f359975c) {
                zB2 = W3.b(e(), obj);
            }
            return zB2;
        }

        @Override // com.google.common.collect.C37399q4.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new a(super.iterator());
        }

        @Override // com.google.common.collect.C37399q4.f, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            boolean zRemove;
            synchronized (this.f359975c) {
                Set<Map.Entry<K, Collection<V>>> setE = e();
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    entry.getClass();
                    zRemove = setE.remove(new J2(entry));
                } else {
                    zRemove = false;
                }
            }
            return zRemove;
        }

        @Override // com.google.common.collect.C37399q4.f, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            boolean zK2;
            synchronized (this.f359975c) {
                zK2 = C37325e2.k(collection, e().iterator());
            }
            return zK2;
        }

        @Override // com.google.common.collect.C37399q4.f, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            boolean z12;
            synchronized (this.f359975c) {
                Iterator<Map.Entry<K, Collection<V>>> it = e().iterator();
                collection.getClass();
                z12 = false;
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                        z12 = true;
                    }
                }
            }
            return z12;
        }

        @Override // com.google.common.collect.C37399q4.f, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            Object[] objArr;
            synchronized (this.f359975c) {
                Set<Map.Entry<K, Collection<V>>> setE = e();
                objArr = new Object[setE.size()];
                C37414t3.b(setE, objArr);
            }
            return objArr;
        }

        @Override // com.google.common.collect.C37399q4.f, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f359975c) {
                tArr2 = (T[]) C37414t3.c(e(), tArr);
            }
            return tArr2;
        }
    }

    /* compiled from: Synchronized.java */
    @XY0.e
    @XY0.c
    /* renamed from: com.google.common.collect.q4$n */
    public static class n<K, V> extends u<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        public transient NavigableSet<K> f359970g;

        /* renamed from: h, reason: collision with root package name */
        @I41.a
        public transient NavigableMap<K, V> f359971h;

        /* renamed from: i, reason: collision with root package name */
        @I41.a
        public transient NavigableSet<K> f359972i;

        public n() {
            throw null;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> ceilingEntry(K k12) {
            Map.Entry<K, V> entryB;
            synchronized (this.f359975c) {
                entryB = C37399q4.b(((NavigableMap) super.e()).ceilingEntry(k12), this.f359975c);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K ceilingKey(K k12) {
            K k13;
            synchronized (this.f359975c) {
                k13 = (K) ((NavigableMap) super.e()).ceilingKey(k12);
            }
            return k13;
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            synchronized (this.f359975c) {
                try {
                    NavigableSet<K> navigableSet = this.f359970g;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetD = C37399q4.d(((NavigableMap) super.e()).descendingKeySet(), this.f359975c);
                    this.f359970g = navigableSetD;
                    return navigableSetD;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> descendingMap() {
            synchronized (this.f359975c) {
                try {
                    NavigableMap<K, V> navigableMap = this.f359971h;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    n nVar = new n(((NavigableMap) super.e()).descendingMap(), this.f359975c);
                    this.f359971h = nVar;
                    return nVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.collect.C37399q4.u, com.google.common.collect.C37399q4.k
        public final Map e() {
            return (NavigableMap) super.e();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> entryB;
            synchronized (this.f359975c) {
                entryB = C37399q4.b(((NavigableMap) super.e()).firstEntry(), this.f359975c);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> floorEntry(K k12) {
            Map.Entry<K, V> entryB;
            synchronized (this.f359975c) {
                entryB = C37399q4.b(((NavigableMap) super.e()).floorEntry(k12), this.f359975c);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K floorKey(K k12) {
            K k13;
            synchronized (this.f359975c) {
                k13 = (K) ((NavigableMap) super.e()).floorKey(k12);
            }
            return k13;
        }

        @Override // com.google.common.collect.C37399q4.u
        /* renamed from: g */
        public final SortedMap e() {
            return (NavigableMap) super.e();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> headMap(K k12, boolean z12) {
            n nVar;
            synchronized (this.f359975c) {
                nVar = new n(((NavigableMap) super.e()).headMap(k12, z12), this.f359975c);
            }
            return nVar;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> higherEntry(K k12) {
            Map.Entry<K, V> entryB;
            synchronized (this.f359975c) {
                entryB = C37399q4.b(((NavigableMap) super.e()).higherEntry(k12), this.f359975c);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K higherKey(K k12) {
            K k13;
            synchronized (this.f359975c) {
                k13 = (K) ((NavigableMap) super.e()).higherKey(k12);
            }
            return k13;
        }

        @Override // com.google.common.collect.C37399q4.k, java.util.Map
        public final Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> entryB;
            synchronized (this.f359975c) {
                entryB = C37399q4.b(((NavigableMap) super.e()).lastEntry(), this.f359975c);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> lowerEntry(K k12) {
            Map.Entry<K, V> entryB;
            synchronized (this.f359975c) {
                entryB = C37399q4.b(((NavigableMap) super.e()).lowerEntry(k12), this.f359975c);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K lowerKey(K k12) {
            K k13;
            synchronized (this.f359975c) {
                k13 = (K) ((NavigableMap) super.e()).lowerKey(k12);
            }
            return k13;
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            synchronized (this.f359975c) {
                try {
                    NavigableSet<K> navigableSet = this.f359972i;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetD = C37399q4.d(((NavigableMap) super.e()).navigableKeySet(), this.f359975c);
                    this.f359972i = navigableSetD;
                    return navigableSetD;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> entryB;
            synchronized (this.f359975c) {
                entryB = C37399q4.b(((NavigableMap) super.e()).pollFirstEntry(), this.f359975c);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> entryB;
            synchronized (this.f359975c) {
                entryB = C37399q4.b(((NavigableMap) super.e()).pollLastEntry(), this.f359975c);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> subMap(K k12, boolean z12, K k13, boolean z13) {
            n nVar;
            synchronized (this.f359975c) {
                nVar = new n(((NavigableMap) super.e()).subMap(k12, z12, k13, z13), this.f359975c);
            }
            return nVar;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> tailMap(K k12, boolean z12) {
            n nVar;
            synchronized (this.f359975c) {
                nVar = new n(((NavigableMap) super.e()).tailMap(k12, z12), this.f359975c);
            }
            return nVar;
        }

        @Override // com.google.common.collect.C37399q4.u, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap<K, V> headMap(K k12) {
            return headMap(k12, false);
        }

        @Override // com.google.common.collect.C37399q4.u, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap<K, V> subMap(K k12, K k13) {
            return subMap(k12, true, k13, false);
        }

        @Override // com.google.common.collect.C37399q4.u, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap<K, V> tailMap(K k12) {
            return tailMap(k12, true);
        }
    }
}
