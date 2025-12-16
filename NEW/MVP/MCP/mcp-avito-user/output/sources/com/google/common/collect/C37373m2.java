package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.W3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: LinkedHashMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.m2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37373m2<K, V> extends AbstractC37379n2<K, V> {

    @XY0.c
    @XY0.d
    private static final long serialVersionUID = 1;

    /* renamed from: i, reason: collision with root package name */
    public transient b<K, V> f359832i;

    /* compiled from: LinkedHashMultimap.java */
    /* renamed from: com.google.common.collect.m2$a */
    public class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public b<K, V> f359833b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public b<K, V> f359834c;

        public a() {
            b<K, V> bVar = C37373m2.this.f359832i.f359841i;
            Objects.requireNonNull(bVar);
            this.f359833b = bVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359833b != C37373m2.this.f359832i;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            b<K, V> bVar = this.f359833b;
            this.f359834c = bVar;
            b<K, V> bVar2 = bVar.f359841i;
            Objects.requireNonNull(bVar2);
            this.f359833b = bVar2;
            return bVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.base.M.n("no calls to next() since the last call to remove()", this.f359834c != null);
            b<K, V> bVar = this.f359834c;
            C37373m2.this.remove(bVar.f359901b, bVar.f359902c);
            this.f359834c = null;
        }
    }

    /* compiled from: LinkedHashMultimap.java */
    @XY0.e
    /* renamed from: com.google.common.collect.m2$b */
    public static final class b<K, V> extends C37384o1<K, V> implements d<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public final int f359836d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public b<K, V> f359837e;

        /* renamed from: f, reason: collision with root package name */
        @I41.a
        public d<K, V> f359838f;

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        public d<K, V> f359839g;

        /* renamed from: h, reason: collision with root package name */
        @I41.a
        public b<K, V> f359840h;

        /* renamed from: i, reason: collision with root package name */
        @I41.a
        public b<K, V> f359841i;

        public b(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12, int i12, @I41.a b<K, V> bVar) {
            super(k12, v12);
            this.f359836d = i12;
            this.f359837e = bVar;
        }

        @Override // com.google.common.collect.C37373m2.d
        public final void a(d<K, V> dVar) {
            this.f359839g = dVar;
        }

        @Override // com.google.common.collect.C37373m2.d
        public final void b(d<K, V> dVar) {
            this.f359838f = dVar;
        }

        public final boolean c(int i12, @I41.a Object obj) {
            return this.f359836d == i12 && com.google.common.base.F.a(this.f359902c, obj);
        }

        @Override // com.google.common.collect.C37373m2.d
        public final d<K, V> d() {
            d<K, V> dVar = this.f359839g;
            Objects.requireNonNull(dVar);
            return dVar;
        }
    }

    /* compiled from: LinkedHashMultimap.java */
    @XY0.e
    /* renamed from: com.google.common.collect.m2$c */
    public final class c extends W3.g<V> implements d<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC37434x3
        public final K f359842b;

        /* renamed from: d, reason: collision with root package name */
        public int f359844d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f359845e = 0;

        /* renamed from: f, reason: collision with root package name */
        public d<K, V> f359846f = this;

        /* renamed from: g, reason: collision with root package name */
        public d<K, V> f359847g = this;

        /* renamed from: c, reason: collision with root package name */
        @XY0.e
        public b<K, V>[] f359843c = new b[C37348i1.a(1.0d, 2)];

        /* compiled from: LinkedHashMultimap.java */
        /* renamed from: com.google.common.collect.m2$c$a */
        public class a implements Iterator<V> {

            /* renamed from: b, reason: collision with root package name */
            public d<K, V> f359849b;

            /* renamed from: c, reason: collision with root package name */
            @I41.a
            public b<K, V> f359850c;

            /* renamed from: d, reason: collision with root package name */
            public int f359851d;

            public a() {
                this.f359849b = c.this.f359846f;
                this.f359851d = c.this.f359845e;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                c cVar = c.this;
                if (cVar.f359845e == this.f359851d) {
                    return this.f359849b != cVar;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            @InterfaceC37434x3
            public final V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                b<K, V> bVar = (b) this.f359849b;
                V v12 = bVar.f359902c;
                this.f359850c = bVar;
                this.f359849b = bVar.d();
                return v12;
            }

            @Override // java.util.Iterator
            public final void remove() {
                c cVar = c.this;
                if (cVar.f359845e != this.f359851d) {
                    throw new ConcurrentModificationException();
                }
                com.google.common.base.M.n("no calls to next() since the last call to remove()", this.f359850c != null);
                cVar.remove(this.f359850c.f359902c);
                this.f359851d = cVar.f359845e;
                this.f359850c = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(@InterfaceC37434x3 Object obj) {
            this.f359842b = obj;
        }

        @Override // com.google.common.collect.C37373m2.d
        public final void a(d<K, V> dVar) {
            this.f359846f = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(@InterfaceC37434x3 V v12) {
            int iC2 = C37348i1.c(v12);
            b<K, V>[] bVarArr = this.f359843c;
            int length = (bVarArr.length - 1) & iC2;
            b<K, V> bVar = bVarArr[length];
            for (b<K, V> bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f359837e) {
                if (bVar2.c(iC2, v12)) {
                    return false;
                }
            }
            b<K, V> bVar3 = new b<>(this.f359842b, v12, iC2, bVar);
            d<K, V> dVar = this.f359847g;
            dVar.a(bVar3);
            bVar3.b(dVar);
            bVar3.a(this);
            b(bVar3);
            C37373m2 c37373m2 = C37373m2.this;
            b<K, V> bVar4 = c37373m2.f359832i.f359840h;
            Objects.requireNonNull(bVar4);
            bVar4.f359841i = bVar3;
            bVar3.f359840h = bVar4;
            b<K, V> bVar5 = c37373m2.f359832i;
            bVar3.f359841i = bVar5;
            bVar5.f359840h = bVar3;
            b<K, V>[] bVarArr2 = this.f359843c;
            bVarArr2[length] = bVar3;
            int i12 = this.f359844d + 1;
            this.f359844d = i12;
            this.f359845e++;
            int length2 = bVarArr2.length;
            if (i12 > 1.0d * length2 && length2 < 1073741824) {
                int length3 = bVarArr2.length * 2;
                b<K, V>[] bVarArr3 = new b[length3];
                this.f359843c = bVarArr3;
                int i13 = length3 - 1;
                for (d<K, V> dVarD = this.f359846f; dVarD != this; dVarD = dVarD.d()) {
                    b<K, V> bVar6 = dVarD;
                    int i14 = bVar6.f359836d & i13;
                    bVar6.f359837e = bVarArr3[i14];
                    bVarArr3[i14] = bVar6;
                }
            }
            return true;
        }

        @Override // com.google.common.collect.C37373m2.d
        public final void b(d<K, V> dVar) {
            this.f359847g = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Arrays.fill(this.f359843c, (Object) null);
            this.f359844d = 0;
            for (d<K, V> dVarD = this.f359846f; dVarD != this; dVarD = dVarD.d()) {
                b bVar = (b) dVarD;
                b<K, V> bVar2 = bVar.f359840h;
                Objects.requireNonNull(bVar2);
                b<K, V> bVar3 = bVar.f359841i;
                Objects.requireNonNull(bVar3);
                bVar2.f359841i = bVar3;
                bVar3.f359840h = bVar2;
            }
            a(this);
            b(this);
            this.f359845e++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            int iC2 = C37348i1.c(obj);
            b<K, V>[] bVarArr = this.f359843c;
            for (b<K, V> bVar = bVarArr[(bVarArr.length - 1) & iC2]; bVar != null; bVar = bVar.f359837e) {
                if (bVar.c(iC2, obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.C37373m2.d
        public final d<K, V> d() {
            return this.f359846f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<V> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC19845a
        public final boolean remove(@I41.a Object obj) {
            int iC2 = C37348i1.c(obj);
            b<K, V>[] bVarArr = this.f359843c;
            int length = (bVarArr.length - 1) & iC2;
            b<K, V> bVar = null;
            for (b<K, V> bVar2 = bVarArr[length]; bVar2 != null; bVar2 = bVar2.f359837e) {
                if (bVar2.c(iC2, obj)) {
                    if (bVar == null) {
                        this.f359843c[length] = bVar2.f359837e;
                    } else {
                        bVar.f359837e = bVar2.f359837e;
                    }
                    d<K, V> dVar = bVar2.f359838f;
                    Objects.requireNonNull(dVar);
                    d<K, V> dVarD = bVar2.d();
                    dVar.a(dVarD);
                    dVarD.b(dVar);
                    b<K, V> bVar3 = bVar2.f359840h;
                    Objects.requireNonNull(bVar3);
                    b<K, V> bVar4 = bVar2.f359841i;
                    Objects.requireNonNull(bVar4);
                    bVar3.f359841i = bVar4;
                    bVar4.f359840h = bVar3;
                    this.f359844d--;
                    this.f359845e++;
                    return true;
                }
                bVar = bVar2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f359844d;
        }
    }

    /* compiled from: LinkedHashMultimap.java */
    /* renamed from: com.google.common.collect.m2$d */
    public interface d<K, V> {
        void a(d<K, V> dVar);

        void b(d<K, V> dVar);

        d<K, V> d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        b<K, V> bVar = new b<>(null, null, 0, null);
        this.f359832i = bVar;
        bVar.f359841i = bVar;
        bVar.f359840h = bVar;
        int i12 = objectInputStream.readInt();
        N n12 = new N(12);
        for (int i13 = 0; i13 < i12; i13++) {
            Object object = objectInputStream.readObject();
            n12.put(object, new c(object));
        }
        int i14 = objectInputStream.readInt();
        for (int i15 = 0; i15 < i14; i15++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) n12.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        p(n12);
    }

    @XY0.c
    @XY0.d
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(super.keySet().size());
        Iterator<K> it = super.keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(this.f359735h);
        for (Map.Entry<K, V> entry : super.b()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37346i, com.google.common.collect.R2, com.google.common.collect.T3
    public final Collection b() {
        return super.b();
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2
    public final void clear() {
        super.clear();
        b<K, V> bVar = this.f359832i;
        bVar.f359841i = bVar;
        bVar.f359840h = bVar;
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2
    public final boolean containsKey(@I41.a Object obj) {
        return this.f359734g.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.AbstractC37346i
    public final Iterator<Map.Entry<K, V>> i() {
        return new a();
    }

    @Override // com.google.common.collect.AbstractC37328f
    public final Collection<V> l(@InterfaceC37434x3 K k12) {
        return new c(k12);
    }

    @Override // com.google.common.collect.AbstractC37328f
    public final Iterator<V> r() {
        return new E2(new a());
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2
    public final int size() {
        return this.f359735h;
    }

    @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f
    /* renamed from: u */
    public final Set<V> k() {
        return new O(2);
    }
}
