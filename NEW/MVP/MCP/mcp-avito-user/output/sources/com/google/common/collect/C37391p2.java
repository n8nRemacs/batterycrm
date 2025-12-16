package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.C37326e3;
import com.google.common.collect.W3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: LinkedListMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.p2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37391p2<K, V> extends AbstractC37346i<K, V> implements InterfaceC37408s2<K, V>, Serializable {

    @XY0.c
    @XY0.d
    private static final long serialVersionUID = 0;

    /* renamed from: g, reason: collision with root package name */
    @I41.a
    public transient e<K, V> f359914g;

    /* renamed from: h, reason: collision with root package name */
    @I41.a
    public transient e<K, V> f359915h;

    /* renamed from: i, reason: collision with root package name */
    public transient Map<K, d<K, V>> f359916i = new K(12);

    /* renamed from: j, reason: collision with root package name */
    public transient int f359917j;

    /* renamed from: k, reason: collision with root package name */
    public transient int f359918k;

    /* compiled from: LinkedListMultimap.java */
    /* renamed from: com.google.common.collect.p2$a */
    public class a extends AbstractSequentialList<V> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f359919b;

        public a(Object obj) {
            this.f359919b = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<V> listIterator(int i12) {
            return new g(this.f359919b, i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            d<K, V> dVar = C37391p2.this.f359916i.get(this.f359919b);
            if (dVar == null) {
                return 0;
            }
            return dVar.f359929c;
        }
    }

    /* compiled from: LinkedListMultimap.java */
    /* renamed from: com.google.common.collect.p2$b */
    public class b extends W3.g<K> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            return C37391p2.this.f359916i.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new c(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            return !C37391p2.this.a(obj).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C37391p2.this.f359916i.size();
        }
    }

    /* compiled from: LinkedListMultimap.java */
    /* renamed from: com.google.common.collect.p2$c */
    public class c implements Iterator<K> {

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f359922b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public e<K, V> f359923c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public e<K, V> f359924d;

        /* renamed from: e, reason: collision with root package name */
        public int f359925e;

        public c(a aVar) {
            this.f359922b = new HashSet(M2.c(C37391p2.this.keySet().size()));
            this.f359923c = C37391p2.this.f359914g;
            this.f359925e = C37391p2.this.f359918k;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (C37391p2.this.f359918k == this.f359925e) {
                return this.f359923c != null;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        @InterfaceC37434x3
        public final K next() {
            e<K, V> eVar;
            if (C37391p2.this.f359918k != this.f359925e) {
                throw new ConcurrentModificationException();
            }
            e<K, V> eVar2 = this.f359923c;
            if (eVar2 == null) {
                throw new NoSuchElementException();
            }
            this.f359924d = eVar2;
            HashSet hashSet = this.f359922b;
            hashSet.add(eVar2.f359930b);
            do {
                eVar = this.f359923c.f359932d;
                this.f359923c = eVar;
                if (eVar == null) {
                    break;
                }
            } while (!hashSet.add(eVar.f359930b));
            return this.f359924d.f359930b;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C37391p2 c37391p2 = C37391p2.this;
            if (c37391p2.f359918k != this.f359925e) {
                throw new ConcurrentModificationException();
            }
            com.google.common.base.M.n("no calls to next() since the last call to remove()", this.f359924d != null);
            K k12 = this.f359924d.f359930b;
            c37391p2.getClass();
            C37325e2.b(new g(k12));
            this.f359924d = null;
            this.f359925e = c37391p2.f359918k;
        }
    }

    /* compiled from: LinkedListMultimap.java */
    /* renamed from: com.google.common.collect.p2$d */
    public static class d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public e<K, V> f359927a;

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f359928b;

        /* renamed from: c, reason: collision with root package name */
        public int f359929c;

        public d(e<K, V> eVar) {
            this.f359927a = eVar;
            this.f359928b = eVar;
            eVar.f359935g = null;
            eVar.f359934f = null;
            this.f359929c = 1;
        }
    }

    /* compiled from: LinkedListMultimap.java */
    /* renamed from: com.google.common.collect.p2$e */
    public static final class e<K, V> extends AbstractC37340h<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC37434x3
        public final K f359930b;

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC37434x3
        public V f359931c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public e<K, V> f359932d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public e<K, V> f359933e;

        /* renamed from: f, reason: collision with root package name */
        @I41.a
        public e<K, V> f359934f;

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        public e<K, V> f359935g;

        public e(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
            this.f359930b = k12;
            this.f359931c = v12;
        }

        @Override // java.util.Map.Entry
        @InterfaceC37434x3
        public final K getKey() {
            return this.f359930b;
        }

        @Override // java.util.Map.Entry
        @InterfaceC37434x3
        public final V getValue() {
            return this.f359931c;
        }

        @Override // com.google.common.collect.AbstractC37340h, java.util.Map.Entry
        @InterfaceC37434x3
        public final V setValue(@InterfaceC37434x3 V v12) {
            V v13 = this.f359931c;
            this.f359931c = v12;
            return v13;
        }
    }

    /* compiled from: LinkedListMultimap.java */
    /* renamed from: com.google.common.collect.p2$f */
    public class f implements ListIterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public int f359936b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public e<K, V> f359937c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public e<K, V> f359938d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public e<K, V> f359939e;

        /* renamed from: f, reason: collision with root package name */
        public int f359940f;

        public f(int i12) {
            this.f359940f = C37391p2.this.f359918k;
            int i13 = C37391p2.this.f359917j;
            com.google.common.base.M.k(i12, i13);
            if (i12 < i13 / 2) {
                this.f359937c = C37391p2.this.f359914g;
                while (true) {
                    int i14 = i12 - 1;
                    if (i12 <= 0) {
                        break;
                    }
                    a();
                    e<K, V> eVar = this.f359937c;
                    if (eVar == null) {
                        throw new NoSuchElementException();
                    }
                    this.f359938d = eVar;
                    this.f359939e = eVar;
                    this.f359937c = eVar.f359932d;
                    this.f359936b++;
                    i12 = i14;
                }
            } else {
                this.f359939e = C37391p2.this.f359915h;
                this.f359936b = i13;
                while (true) {
                    int i15 = i12 + 1;
                    if (i12 >= i13) {
                        break;
                    }
                    a();
                    e<K, V> eVar2 = this.f359939e;
                    if (eVar2 == null) {
                        throw new NoSuchElementException();
                    }
                    this.f359938d = eVar2;
                    this.f359937c = eVar2;
                    this.f359939e = eVar2.f359933e;
                    this.f359936b--;
                    i12 = i15;
                }
            }
            this.f359938d = null;
        }

        public final void a() {
            if (C37391p2.this.f359918k != this.f359940f) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            a();
            return this.f359937c != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            a();
            return this.f359939e != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @InterfaceC19845a
        public final Object next() {
            a();
            e<K, V> eVar = this.f359937c;
            if (eVar == null) {
                throw new NoSuchElementException();
            }
            this.f359938d = eVar;
            this.f359939e = eVar;
            this.f359937c = eVar.f359932d;
            this.f359936b++;
            return eVar;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f359936b;
        }

        @Override // java.util.ListIterator
        @InterfaceC19845a
        public final Object previous() {
            a();
            e<K, V> eVar = this.f359939e;
            if (eVar == null) {
                throw new NoSuchElementException();
            }
            this.f359938d = eVar;
            this.f359937c = eVar;
            this.f359939e = eVar.f359933e;
            this.f359936b--;
            return eVar;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f359936b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            com.google.common.base.M.n("no calls to next() since the last call to remove()", this.f359938d != null);
            e<K, V> eVar = this.f359938d;
            if (eVar != this.f359937c) {
                this.f359939e = eVar.f359933e;
                this.f359936b--;
            } else {
                this.f359937c = eVar.f359932d;
            }
            C37391p2 c37391p2 = C37391p2.this;
            C37391p2.k(c37391p2, eVar);
            this.f359938d = null;
            this.f359940f = c37391p2.f359918k;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public static void k(C37391p2 c37391p2, e eVar) {
        c37391p2.getClass();
        e<K, V> eVar2 = eVar.f359933e;
        if (eVar2 != null) {
            eVar2.f359932d = eVar.f359932d;
        } else {
            c37391p2.f359914g = eVar.f359932d;
        }
        e<K, V> eVar3 = eVar.f359932d;
        if (eVar3 != null) {
            eVar3.f359933e = eVar2;
        } else {
            c37391p2.f359915h = eVar2;
        }
        e<K, V> eVar4 = eVar.f359935g;
        K k12 = eVar.f359930b;
        if (eVar4 == null && eVar.f359934f == null) {
            d<K, V> dVarRemove = c37391p2.f359916i.remove(k12);
            Objects.requireNonNull(dVarRemove);
            dVarRemove.f359929c = 0;
            c37391p2.f359918k++;
        } else {
            d<K, V> dVar = c37391p2.f359916i.get(k12);
            Objects.requireNonNull(dVar);
            dVar.f359929c--;
            e<K, V> eVar5 = eVar.f359935g;
            if (eVar5 == null) {
                e<K, V> eVar6 = eVar.f359934f;
                Objects.requireNonNull(eVar6);
                dVar.f359927a = eVar6;
            } else {
                eVar5.f359934f = eVar.f359934f;
            }
            e<K, V> eVar7 = eVar.f359934f;
            if (eVar7 == null) {
                e<K, V> eVar8 = eVar.f359935g;
                Objects.requireNonNull(eVar8);
                dVar.f359928b = eVar8;
            } else {
                eVar7.f359935g = eVar.f359935g;
            }
        }
        c37391p2.f359917j--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f359916i = new N();
        int i12 = objectInputStream.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @XY0.c
    @XY0.d
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f359917j);
        for (Map.Entry entry : (List) super.b()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2, com.google.common.collect.T3
    public final Collection b() {
        return (List) super.b();
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Map<K, Collection<V>> c() {
        return new C37326e3.a(this);
    }

    @Override // com.google.common.collect.R2
    public final void clear() {
        this.f359914g = null;
        this.f359915h = null;
        this.f359916i.clear();
        this.f359917j = 0;
        this.f359918k++;
    }

    @Override // com.google.common.collect.R2
    public final boolean containsKey(@I41.a Object obj) {
        return this.f359916i.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    public final boolean containsValue(@I41.a Object obj) {
        return ((List) super.values()).contains(obj);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Collection d() {
        return new C37397q2(this);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Set<K> e() {
        return new b();
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final InterfaceC37338g3<K> f() {
        return new C37326e3.g(this);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Collection g() {
        return new C37402r2(this);
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final Collection get(@InterfaceC37434x3 Object obj) {
        return new a(obj);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Iterator<Map.Entry<K, V>> i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    public final boolean isEmpty() {
        return this.f359914g == null;
    }

    @InterfaceC19845a
    public final e<K, V> l(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12, @I41.a e<K, V> eVar) {
        e<K, V> eVar2 = new e<>(k12, v12);
        if (this.f359914g == null) {
            this.f359915h = eVar2;
            this.f359914g = eVar2;
            this.f359916i.put(k12, new d<>(eVar2));
            this.f359918k++;
        } else if (eVar == null) {
            e<K, V> eVar3 = this.f359915h;
            Objects.requireNonNull(eVar3);
            eVar3.f359932d = eVar2;
            eVar2.f359933e = this.f359915h;
            this.f359915h = eVar2;
            d<K, V> dVar = this.f359916i.get(k12);
            if (dVar == null) {
                this.f359916i.put(k12, new d<>(eVar2));
                this.f359918k++;
            } else {
                dVar.f359929c++;
                e<K, V> eVar4 = dVar.f359928b;
                eVar4.f359934f = eVar2;
                eVar2.f359935g = eVar4;
                dVar.f359928b = eVar2;
            }
        } else {
            d<K, V> dVar2 = this.f359916i.get(k12);
            Objects.requireNonNull(dVar2);
            dVar2.f359929c++;
            eVar2.f359933e = eVar.f359933e;
            eVar2.f359935g = eVar.f359935g;
            eVar2.f359932d = eVar;
            eVar2.f359934f = eVar;
            e<K, V> eVar5 = eVar.f359935g;
            if (eVar5 == null) {
                dVar2.f359927a = eVar2;
            } else {
                eVar5.f359934f = eVar2;
            }
            e<K, V> eVar6 = eVar.f359933e;
            if (eVar6 == null) {
                this.f359914g = eVar2;
            } else {
                eVar6.f359932d = eVar2;
            }
            eVar.f359933e = eVar2;
            eVar.f359935g = eVar2;
        }
        this.f359917j++;
        return eVar2;
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    @InterfaceC19845a
    public final boolean put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
        l(k12, v12, null);
        return true;
    }

    @Override // com.google.common.collect.R2
    public final int size() {
        return this.f359917j;
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    public final Collection values() {
        return (List) super.values();
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    public final List<V> a(@I41.a Object obj) {
        List<V> listUnmodifiableList = Collections.unmodifiableList(C37423v2.b(new g(obj)));
        C37325e2.b(new g(obj));
        return listUnmodifiableList;
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final List<V> get(@InterfaceC37434x3 K k12) {
        return new a(k12);
    }

    /* compiled from: LinkedListMultimap.java */
    /* renamed from: com.google.common.collect.p2$g */
    public class g implements ListIterator<V> {

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC37434x3
        public final K f359942b;

        /* renamed from: c, reason: collision with root package name */
        public int f359943c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public e<K, V> f359944d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public e<K, V> f359945e;

        /* renamed from: f, reason: collision with root package name */
        @I41.a
        public e<K, V> f359946f;

        public g(@InterfaceC37434x3 K k12) {
            this.f359942b = k12;
            d<K, V> dVar = C37391p2.this.f359916i.get(k12);
            this.f359944d = dVar == null ? null : dVar.f359927a;
        }

        @Override // java.util.ListIterator
        public final void add(@InterfaceC37434x3 V v12) {
            this.f359946f = C37391p2.this.l(this.f359942b, v12, this.f359944d);
            this.f359943c++;
            this.f359945e = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f359944d != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f359946f != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @InterfaceC19845a
        @InterfaceC37434x3
        public final V next() {
            e<K, V> eVar = this.f359944d;
            if (eVar == null) {
                throw new NoSuchElementException();
            }
            this.f359945e = eVar;
            this.f359946f = eVar;
            this.f359944d = eVar.f359934f;
            this.f359943c++;
            return eVar.f359931c;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f359943c;
        }

        @Override // java.util.ListIterator
        @InterfaceC19845a
        @InterfaceC37434x3
        public final V previous() {
            e<K, V> eVar = this.f359946f;
            if (eVar == null) {
                throw new NoSuchElementException();
            }
            this.f359945e = eVar;
            this.f359944d = eVar;
            this.f359946f = eVar.f359935g;
            this.f359943c--;
            return eVar.f359931c;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f359943c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            com.google.common.base.M.n("no calls to next() since the last call to remove()", this.f359945e != null);
            e<K, V> eVar = this.f359945e;
            if (eVar != this.f359944d) {
                this.f359946f = eVar.f359935g;
                this.f359943c--;
            } else {
                this.f359944d = eVar.f359934f;
            }
            C37391p2.k(C37391p2.this, eVar);
            this.f359945e = null;
        }

        @Override // java.util.ListIterator
        public final void set(@InterfaceC37434x3 V v12) {
            com.google.common.base.M.q(this.f359945e != null);
            this.f359945e.f359931c = v12;
        }

        public g(@InterfaceC37434x3 K k12, int i12) {
            d<K, V> dVar = C37391p2.this.f359916i.get(k12);
            int i13 = dVar == null ? 0 : dVar.f359929c;
            com.google.common.base.M.k(i12, i13);
            if (i12 >= i13 / 2) {
                this.f359946f = dVar == null ? null : dVar.f359928b;
                this.f359943c = i13;
                while (true) {
                    int i14 = i12 + 1;
                    if (i12 >= i13) {
                        break;
                    }
                    previous();
                    i12 = i14;
                }
            } else {
                this.f359944d = dVar == null ? null : dVar.f359927a;
                while (true) {
                    int i15 = i12 - 1;
                    if (i12 <= 0) {
                        break;
                    }
                    next();
                    i12 = i15;
                }
            }
            this.f359942b = k12;
            this.f359945e = null;
        }
    }
}
