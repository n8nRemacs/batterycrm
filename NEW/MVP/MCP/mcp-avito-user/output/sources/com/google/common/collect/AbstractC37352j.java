package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.common.collect.C37374m3;
import com.google.common.collect.InterfaceC37338g3;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: AbstractMultiset.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37352j<E> extends AbstractCollection<E> implements InterfaceC37338g3<E> {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<E> f359800b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<InterfaceC37338g3.a<E>> f359801c;

    /* compiled from: AbstractMultiset.java */
    /* renamed from: com.google.common.collect.j$a */
    public class a extends C37374m3.c<E> {
        public a() {
        }

        @Override // com.google.common.collect.C37374m3.c
        public final InterfaceC37338g3<E> e() {
            return AbstractC37352j.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<E> iterator() {
            return AbstractC37352j.this.g();
        }
    }

    /* compiled from: AbstractMultiset.java */
    /* renamed from: com.google.common.collect.j$b */
    public class b extends C37374m3.d<E> {
        public b() {
        }

        @Override // com.google.common.collect.C37374m3.d
        public InterfaceC37338g3<E> e() {
            return AbstractC37352j.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<InterfaceC37338g3.a<E>> iterator() {
            return AbstractC37352j.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AbstractC37352j.this.e();
        }
    }

    @InterfaceC19845a
    public int O3(int i12, @I41.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @InterfaceC19845a
    public boolean P2(int i12, @InterfaceC37434x3 Object obj) {
        F.b(i12, "oldCount");
        F.b(0, "newCount");
        if (S5(obj) != i12) {
            return false;
        }
        p6(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    public final boolean add(@InterfaceC37434x3 E e12) {
        add(1, e12);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (!(collection instanceof InterfaceC37338g3)) {
            if (collection.isEmpty()) {
                return false;
            }
            return C37325e2.a(this, collection.iterator());
        }
        InterfaceC37338g3 interfaceC37338g3 = (InterfaceC37338g3) collection;
        if (interfaceC37338g3 instanceof AbstractC37334g) {
            AbstractC37334g abstractC37334g = (AbstractC37334g) interfaceC37338g3;
            if (abstractC37334g.isEmpty()) {
                return false;
            }
            for (int iC2 = abstractC37334g.f359779d.c(); iC2 >= 0; iC2 = abstractC37334g.f359779d.k(iC2)) {
                add(abstractC37334g.f359779d.f(iC2), abstractC37334g.f359779d.e(iC2));
            }
        } else {
            if (interfaceC37338g3.isEmpty()) {
                return false;
            }
            for (InterfaceC37338g3.a<E> aVar : interfaceC37338g3.entrySet()) {
                add(aVar.getCount(), aVar.a());
            }
        }
        return true;
    }

    public Set<E> b() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@I41.a Object obj) {
        return S5(obj) > 0;
    }

    public Set<InterfaceC37338g3.a<E>> d() {
        return new b();
    }

    public abstract int e();

    @Override // com.google.common.collect.InterfaceC37338g3
    public Set<InterfaceC37338g3.a<E>> entrySet() {
        Set<InterfaceC37338g3.a<E>> set = this.f359801c;
        if (set != null) {
            return set;
        }
        Set<InterfaceC37338g3.a<E>> setD = d();
        this.f359801c = setD;
        return setD;
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC37338g3
    public final boolean equals(@I41.a Object obj) {
        return C37374m3.a(this, obj);
    }

    public abstract Iterator<E> g();

    public abstract Iterator<InterfaceC37338g3.a<E>> h();

    @Override // java.util.Collection, com.google.common.collect.InterfaceC37338g3
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public Set<E> k() {
        Set<E> set = this.f359800b;
        if (set != null) {
            return set;
        }
        Set<E> setB = b();
        this.f359800b = setB;
        return setB;
    }

    @InterfaceC19845a
    public int p6(@InterfaceC37434x3 Object obj) {
        F.b(0, "count");
        int iS5 = S5(obj);
        int i12 = 0 - iS5;
        if (i12 > 0) {
            add(i12, obj);
        } else if (i12 < 0) {
            O3(-i12, obj);
        }
        return iS5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    public final boolean remove(@I41.a Object obj) {
        return O3(1, obj) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof InterfaceC37338g3) {
            collection = ((InterfaceC37338g3) collection).k();
        }
        return k().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        if (collection instanceof InterfaceC37338g3) {
            collection = ((InterfaceC37338g3) collection).k();
        }
        return k().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    @InterfaceC19845a
    public int add(int i12, @InterfaceC37434x3 Object obj) {
        throw new UnsupportedOperationException();
    }
}
