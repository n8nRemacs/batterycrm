package com.google.common.collect;

import com.google.common.collect.AbstractC37328f;
import com.google.common.collect.AbstractC37346i;
import com.google.common.collect.C37325e2;
import com.google.common.collect.G;
import com.google.common.collect.InterfaceC37338g3;
import com.google.common.collect.M2;
import com.google.common.collect.W3;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: Multimaps.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.e3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37326e3 {

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$a */
    public static final class a<K, V> extends M2.E<K, Collection<V>> {

        /* renamed from: e, reason: collision with root package name */
        @Weak
        public final R2<K, V> f359720e;

        /* compiled from: Multimaps.java */
        /* renamed from: com.google.common.collect.e3$a$a, reason: collision with other inner class name */
        public class C10667a extends M2.f<K, Collection<V>> {
            public C10667a() {
            }

            @Override // com.google.common.collect.M2.f
            public final Map<K, Collection<V>> e() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                Set<K> setKeySet = a.this.f359720e.keySet();
                return new F2(setKeySet.iterator(), new C37320d3(this));
            }

            @Override // com.google.common.collect.M2.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@I41.a Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                a.this.f359720e.keySet().remove(entry.getKey());
                return true;
            }
        }

        public a(R2<K, V> r22) {
            this.f359720e = r22;
        }

        @Override // com.google.common.collect.M2.E
        public final Set<Map.Entry<K, Collection<V>>> a() {
            return new C10667a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.f359720e.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return this.f359720e.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object get(@I41.a Object obj) {
            R2<K, V> r22 = this.f359720e;
            if (r22.containsKey(obj)) {
                return r22.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return this.f359720e.isEmpty();
        }

        @Override // com.google.common.collect.M2.E, java.util.AbstractMap, java.util.Map
        public final Set<K> keySet() {
            return this.f359720e.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object remove(@I41.a Object obj) {
            R2<K, V> r22 = this.f359720e;
            if (r22.containsKey(obj)) {
                return r22.a(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f359720e.keySet().size();
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$b */
    public static class b<K, V> extends AbstractC37322e<K, V> {

        @XY0.c
        @XY0.d
        private static final long serialVersionUID = 0;

        /* renamed from: i, reason: collision with root package name */
        public transient com.google.common.base.e0<? extends List<V>> f359722i;

        public b() {
            throw null;
        }

        @XY0.c
        @XY0.d
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f359722i = (com.google.common.base.e0) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            p((Map) object2);
        }

        @XY0.c
        @XY0.d
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f359722i);
            objectOutputStream.writeObject(this.f359734g);
        }

        @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.AbstractC37346i
        public final Map<K, Collection<V>> c() {
            return m();
        }

        @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.AbstractC37346i
        public final Set<K> e() {
            return n();
        }

        @Override // com.google.common.collect.AbstractC37322e, com.google.common.collect.AbstractC37328f
        /* renamed from: u */
        public final List<V> k() {
            return this.f359722i.get();
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$c */
    public static class c<K, V> extends AbstractC37328f<K, V> {

        @XY0.c
        @XY0.d
        private static final long serialVersionUID = 0;

        /* renamed from: i, reason: collision with root package name */
        public transient com.google.common.base.e0<? extends Collection<V>> f359723i;

        @XY0.c
        @XY0.d
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f359723i = (com.google.common.base.e0) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            p((Map) object2);
        }

        @XY0.c
        @XY0.d
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f359723i);
            objectOutputStream.writeObject(this.f359734g);
        }

        @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.AbstractC37346i
        public final Map<K, Collection<V>> c() {
            return m();
        }

        @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.AbstractC37346i
        public final Set<K> e() {
            return n();
        }

        @Override // com.google.common.collect.AbstractC37328f
        public final Collection<V> k() {
            return this.f359723i.get();
        }

        @Override // com.google.common.collect.AbstractC37328f
        public final <E> Collection<E> q(Collection<E> collection) {
            return collection instanceof NavigableSet ? W3.j((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractC37328f
        public final Collection<V> s(@InterfaceC37434x3 K k12, Collection<V> collection) {
            return collection instanceof List ? t(k12, (List) collection, null) : collection instanceof NavigableSet ? new AbstractC37328f.m(k12, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractC37328f.o(k12, (SortedSet) collection, null) : collection instanceof Set ? new AbstractC37328f.n(k12, (Set) collection) : new AbstractC37328f.k(k12, collection, null);
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$d */
    public static class d<K, V> extends AbstractC37376n<K, V> {

        @XY0.c
        @XY0.d
        private static final long serialVersionUID = 0;

        /* renamed from: i, reason: collision with root package name */
        public transient com.google.common.base.e0<? extends Set<V>> f359724i;

        @XY0.c
        @XY0.d
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f359724i = (com.google.common.base.e0) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            p((Map) object2);
        }

        @XY0.c
        @XY0.d
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f359724i);
            objectOutputStream.writeObject(this.f359734g);
        }

        @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.AbstractC37346i
        public final Map<K, Collection<V>> c() {
            return m();
        }

        @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.AbstractC37346i
        public final Set<K> e() {
            return n();
        }

        @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f
        public final <E> Collection<E> q(Collection<E> collection) {
            return collection instanceof NavigableSet ? W3.j((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f
        public final Collection<V> s(@InterfaceC37434x3 K k12, Collection<V> collection) {
            return collection instanceof NavigableSet ? new AbstractC37328f.m(k12, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractC37328f.o(k12, (SortedSet) collection, null) : new AbstractC37328f.n(k12, (Set) collection);
        }

        @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f
        /* renamed from: u */
        public final Set<V> k() {
            return this.f359724i.get();
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$e */
    public static class e<K, V> extends r<K, V> {

        @XY0.c
        @XY0.d
        private static final long serialVersionUID = 0;

        /* renamed from: i, reason: collision with root package name */
        public transient com.google.common.base.e0<? extends SortedSet<V>> f359725i;

        /* renamed from: j, reason: collision with root package name */
        @I41.a
        public transient Comparator<? super V> f359726j;

        @XY0.c
        @XY0.d
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            com.google.common.base.e0<? extends SortedSet<V>> e0Var = (com.google.common.base.e0) object;
            this.f359725i = e0Var;
            this.f359726j = e0Var.get().comparator();
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            p((Map) object2);
        }

        @XY0.c
        @XY0.d
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f359725i);
            objectOutputStream.writeObject(this.f359734g);
        }

        @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.AbstractC37346i
        public final Map<K, Collection<V>> c() {
            return m();
        }

        @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.AbstractC37346i
        public final Set<K> e() {
            return n();
        }

        @Override // com.google.common.collect.r, com.google.common.collect.AbstractC37376n
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public final SortedSet<V> k() {
            return this.f359725i.get();
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$f */
    public static abstract class f<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public abstract R2<K, V> b();

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().R(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return b().size();
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$g */
    public static class g<K, V> extends AbstractC37352j<K> {

        /* renamed from: d, reason: collision with root package name */
        @Weak
        public final R2<K, V> f359727d;

        /* compiled from: Multimaps.java */
        /* renamed from: com.google.common.collect.e3$g$a */
        public class a extends z4<Map.Entry<K, Collection<V>>, InterfaceC37338g3.a<K>> {
            @Override // com.google.common.collect.z4
            public final Object a(Object obj) {
                return new C37332f3((Map.Entry) obj);
            }
        }

        public g(R2<K, V> r22) {
            this.f359727d = r22;
        }

        @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
        public int O3(int i12, @I41.a Object obj) {
            F.b(i12, "occurrences");
            if (i12 == 0) {
                return S5(obj);
            }
            Collection collection = (Collection) M2.j(this.f359727d.V(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i12 >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i13 = 0; i13 < i12; i13++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        @Override // com.google.common.collect.InterfaceC37338g3
        public final int S5(@I41.a Object obj) {
            Collection collection = (Collection) M2.j(this.f359727d.V(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f359727d.clear();
        }

        @Override // com.google.common.collect.AbstractC37352j, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            return this.f359727d.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC37352j
        public final int e() {
            return this.f359727d.V().size();
        }

        @Override // com.google.common.collect.AbstractC37352j
        public final Iterator<K> g() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC37352j
        public final Iterator<InterfaceC37338g3.a<K>> h() {
            return new a(this.f359727d.V().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new D2(this.f359727d.b().iterator());
        }

        @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
        public final Set<K> k() {
            return this.f359727d.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f359727d.size();
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$h */
    public static class h<K, V> extends AbstractC37346i<K, V> implements T3<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;

        /* compiled from: Multimaps.java */
        /* renamed from: com.google.common.collect.e3$h$a */
        public class a extends W3.g<V> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f359728b;

            /* compiled from: Multimaps.java */
            /* renamed from: com.google.common.collect.e3$h$a$a, reason: collision with other inner class name */
            public class C10668a implements Iterator<V> {

                /* renamed from: b, reason: collision with root package name */
                public int f359730b;

                public C10668a() {
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    if (this.f359730b != 0) {
                        return false;
                    }
                    a aVar = a.this;
                    h.this.getClass();
                    Object obj = aVar.f359728b;
                    throw null;
                }

                @Override // java.util.Iterator
                @InterfaceC37434x3
                public final V next() {
                    hasNext();
                    throw new NoSuchElementException();
                }

                @Override // java.util.Iterator
                public final void remove() {
                    F.e(this.f359730b == 1);
                    this.f359730b = -1;
                    h.this.getClass();
                    throw null;
                }
            }

            public a(Object obj) {
                this.f359728b = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<V> iterator() {
                return new C10668a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                h.this.getClass();
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
        public final boolean R(@I41.a Object obj, @I41.a Object obj2) {
            throw null;
        }

        @Override // com.google.common.collect.R2, com.google.common.collect.T3
        public final /* bridge */ /* synthetic */ Collection a(@I41.a Object obj) {
            a(obj);
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2, com.google.common.collect.T3
        public final Collection b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final Map<K, Collection<V>> c() {
            return new a(this);
        }

        @Override // com.google.common.collect.R2
        public final void clear() {
            throw null;
        }

        @Override // com.google.common.collect.R2
        public final boolean containsKey(@I41.a Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
        public final boolean containsValue(@I41.a Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final Collection<Map.Entry<K, V>> d() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final Set<K> e() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final InterfaceC37338g3<K> f() {
            return new g(this);
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final Collection<V> g() {
            throw null;
        }

        @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final Collection get(@InterfaceC37434x3 Object obj) {
            return new a(obj);
        }

        @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
        public final int hashCode() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final Iterator<Map.Entry<K, V>> i() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
        public final boolean put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
        public final boolean remove(@I41.a Object obj, @I41.a Object obj2) {
            throw null;
        }

        @Override // com.google.common.collect.R2
        public final int size() {
            throw null;
        }

        @Override // com.google.common.collect.R2, com.google.common.collect.T3
        public final Set<V> a(@I41.a Object obj) {
            new HashSet(2);
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2, com.google.common.collect.T3
        public final Set<Map.Entry<K, V>> b() {
            throw null;
        }

        @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final Set<V> get(@InterfaceC37434x3 K k12) {
            return new a(k12);
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$i */
    public static final class i<K, V1, V2> extends j<K, V1, V2> implements InterfaceC37408s2<K, V2> {
        public i() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.C37326e3.j, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final /* bridge */ /* synthetic */ Collection get(@InterfaceC37434x3 Object obj) {
            return get((i<K, V1, V2>) obj);
        }

        @Override // com.google.common.collect.C37326e3.j
        public final Collection k(@InterfaceC37434x3 Object obj, Collection collection) {
            M2.g<? super K, ? super V1, V2> gVar = this.f359733h;
            gVar.getClass();
            return C37423v2.d((List) collection, new C37453z2(gVar, obj));
        }

        @Override // com.google.common.collect.C37326e3.j, com.google.common.collect.R2, com.google.common.collect.T3
        public final List<V2> a(@I41.a Object obj) {
            List list = (List) this.f359732g.a(obj);
            M2.g<? super K, ? super V1, V2> gVar = this.f359733h;
            gVar.getClass();
            return C37423v2.d(list, new C37453z2(gVar, obj));
        }

        @Override // com.google.common.collect.C37326e3.j, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final List<V2> get(@InterfaceC37434x3 K k12) {
            List list = (List) this.f359732g.get((InterfaceC37408s2) k12);
            M2.g<? super K, ? super V1, V2> gVar = this.f359733h;
            gVar.getClass();
            return C37423v2.d(list, new C37453z2(gVar, k12));
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$j */
    public static class j<K, V1, V2> extends AbstractC37346i<K, V2> {

        /* renamed from: g, reason: collision with root package name */
        public final InterfaceC37408s2 f359732g;

        /* renamed from: h, reason: collision with root package name */
        public final M2.g<? super K, ? super V1, V2> f359733h;

        public j(InterfaceC37408s2 interfaceC37408s2, M2.g gVar) {
            interfaceC37408s2.getClass();
            this.f359732g = interfaceC37408s2;
            this.f359733h = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.R2, com.google.common.collect.T3
        public Collection<V2> a(@I41.a Object obj) {
            return k(obj, this.f359732g.a(obj));
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final Map<K, Collection<V2>> c() {
            return new M2.v(this.f359732g.V(), new C37320d3(this));
        }

        @Override // com.google.common.collect.R2
        public final void clear() {
            this.f359732g.clear();
        }

        @Override // com.google.common.collect.R2
        public final boolean containsKey(@I41.a Object obj) {
            return this.f359732g.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final Collection<Map.Entry<K, V2>> d() {
            return new AbstractC37346i.a();
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final Set<K> e() {
            return this.f359732g.keySet();
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final InterfaceC37338g3<K> f() {
            return this.f359732g.Q();
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final Collection<V2> g() {
            Collection<Map.Entry<K, V>> collectionB = this.f359732g.b();
            M2.g<? super K, ? super V1, V2> gVar = this.f359733h;
            gVar.getClass();
            return new G.f(collectionB, new A2(gVar));
        }

        @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public Collection<V2> get(@InterfaceC37434x3 K k12) {
            return k(k12, this.f359732g.get((InterfaceC37408s2) k12));
        }

        @Override // com.google.common.collect.AbstractC37346i
        public final Iterator<Map.Entry<K, V2>> i() {
            Iterator it = this.f359732g.b().iterator();
            M2.g<? super K, ? super V1, V2> gVar = this.f359733h;
            gVar.getClass();
            return new C37325e2.c(it, new C2(gVar));
        }

        @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
        public final boolean isEmpty() {
            return this.f359732g.isEmpty();
        }

        public Collection<V2> k(@InterfaceC37434x3 K k12, Collection<V1> collection) {
            M2.g<? super K, ? super V1, V2> gVar = this.f359733h;
            gVar.getClass();
            C37453z2 c37453z2 = new C37453z2(gVar, k12);
            return collection instanceof List ? C37423v2.d((List) collection, c37453z2) : new G.f(collection, c37453z2);
        }

        @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
        public final boolean put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V2 v22) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
        public final boolean remove(@I41.a Object obj, @I41.a Object obj2) {
            return get(obj).remove(obj2);
        }

        @Override // com.google.common.collect.R2
        public final int size() {
            return this.f359732g.size();
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$k */
    public static class k<K, V> extends l<K, V> implements InterfaceC37408s2<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.S0
        public final /* bridge */ /* synthetic */ Object X() {
            return null;
        }

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0
        /* renamed from: Y */
        public final /* bridge */ /* synthetic */ R2 X() {
            return null;
        }

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
        public final Collection a(@I41.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final Collection get(@InterfaceC37434x3 Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
        public final List<V> a(@I41.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final List<V> get(@InterfaceC37434x3 K k12) {
            throw null;
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$l */
    public static class l<K, V> extends O0<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.O0, com.google.common.collect.R2
        public final InterfaceC37338g3<K> Q() {
            throw null;
        }

        @Override // com.google.common.collect.O0, com.google.common.collect.R2
        public final Map<K, Collection<V>> V() {
            throw null;
        }

        @Override // com.google.common.collect.O0, com.google.common.collect.S0
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public R2<K, V> X() {
            return null;
        }

        @Override // com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
        public Collection<V> a(@I41.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
        public Collection<Map.Entry<K, V>> b() {
            throw null;
        }

        @Override // com.google.common.collect.O0, com.google.common.collect.R2
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public Collection<V> get(@InterfaceC37434x3 K k12) {
            throw null;
        }

        @Override // com.google.common.collect.O0, com.google.common.collect.R2
        public final Set<K> keySet() {
            throw null;
        }

        @Override // com.google.common.collect.O0, com.google.common.collect.R2
        public final boolean put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.O0, com.google.common.collect.R2
        public final boolean remove(@I41.a Object obj, @I41.a Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.O0, com.google.common.collect.R2
        public final Collection<V> values() {
            throw null;
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$m */
    public static class m<K, V> extends l<K, V> implements T3<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.S0
        public /* bridge */ /* synthetic */ Object X() {
            return null;
        }

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0
        /* renamed from: Y */
        public /* bridge */ /* synthetic */ R2 X() {
            return null;
        }

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
        public /* bridge */ /* synthetic */ Collection a(@I41.a Object obj) {
            a(obj);
            throw null;
        }

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
        public final Collection b() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public /* bridge */ /* synthetic */ Collection get(@InterfaceC37434x3 Object obj) {
            return get((m<K, V>) obj);
        }

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
        public Set<V> a(@I41.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
        public final Set<Map.Entry<K, V>> b() {
            throw null;
        }

        @Override // com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public Set<V> get(@InterfaceC37434x3 K k12) {
            throw null;
        }
    }

    /* compiled from: Multimaps.java */
    /* renamed from: com.google.common.collect.e3$n */
    public static class n<K, V> extends m<K, V> implements InterfaceC37363k4<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.C37326e3.m, com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.S0
        public final /* bridge */ /* synthetic */ Object X() {
            return null;
        }

        @Override // com.google.common.collect.C37326e3.m, com.google.common.collect.C37326e3.l, com.google.common.collect.O0
        /* renamed from: Y */
        public final /* bridge */ /* synthetic */ R2 X() {
            return null;
        }

        @Override // com.google.common.collect.C37326e3.m, com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
        public final Collection a(@I41.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.C37326e3.m, com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final Collection get(@InterfaceC37434x3 Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.C37326e3.m, com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
        public final Set a(@I41.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.C37326e3.m, com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final Set get(@InterfaceC37434x3 Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.C37326e3.m, com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3
        public final SortedSet<V> a(@I41.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.C37326e3.m, com.google.common.collect.C37326e3.l, com.google.common.collect.O0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
        public final SortedSet<V> get(@InterfaceC37434x3 K k12) {
            throw null;
        }
    }

    public static InterfaceC37408s2 a(InterfaceC37408s2 interfaceC37408s2, com.google.android.gms.common.internal.P0 p02) {
        return new i(interfaceC37408s2, new L2(p02));
    }
}
