package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.common.collect.AbstractC37378n1;
import com.google.common.collect.InterfaceC37338g3;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: ImmutableMultiset.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class A1<E> extends B1<E> implements InterfaceC37338g3<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f359249e = 0;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient AbstractC37401r1<E> f359250c;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient H1<InterfaceC37338g3.a<E>> f359251d;

    /* compiled from: ImmutableMultiset.java */
    public class a extends N4<E> {

        /* renamed from: b, reason: collision with root package name */
        public int f359252b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public E f359253c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ N4 f359254d;

        public a(N4 n42) {
            this.f359254d = n42;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359252b > 0 || this.f359254d.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (this.f359252b <= 0) {
                InterfaceC37338g3.a aVar = (InterfaceC37338g3.a) this.f359254d.next();
                this.f359253c = (E) aVar.a();
                this.f359252b = aVar.getCount();
            }
            this.f359252b--;
            E e12 = this.f359253c;
            Objects.requireNonNull(e12);
            return e12;
        }
    }

    /* compiled from: ImmutableMultiset.java */
    public static class b<E> extends AbstractC37378n1.b<E> {

        /* renamed from: a, reason: collision with root package name */
        @I41.a
        public C37419u3<E> f359255a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f359256b;

        public b() {
            this(4);
        }

        @Override // 
        @InterfaceC19845a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b<E> b(E e12) {
            return d(1, e12);
        }

        @InterfaceC19845a
        public b d(int i12, Object obj) {
            Objects.requireNonNull(this.f359255a);
            if (i12 == 0) {
                return this;
            }
            if (this.f359256b) {
                C37419u3<E> c37419u3 = this.f359255a;
                C37419u3<E> c37419u32 = new C37419u3<>();
                c37419u32.h(c37419u3.f360015c);
                for (int iC2 = c37419u3.c(); iC2 != -1; iC2 = c37419u3.k(iC2)) {
                    c37419u32.m(c37419u3.f(iC2), c37419u3.e(iC2));
                }
                this.f359255a = c37419u32;
            }
            this.f359256b = false;
            obj.getClass();
            C37419u3<E> c37419u33 = this.f359255a;
            c37419u33.m(i12 + c37419u33.d(obj), obj);
            return this;
        }

        public A1<E> e() {
            Objects.requireNonNull(this.f359255a);
            if (this.f359255a.f360015c == 0) {
                int i12 = A1.f359249e;
                return K3.f359440i;
            }
            this.f359256b = true;
            return new K3(this.f359255a);
        }

        public b(int i12) {
            this.f359256b = false;
            this.f359255a = new C37419u3<>(i12, 0);
        }
    }

    /* compiled from: ImmutableMultiset.java */
    public final class c extends Q1<InterfaceC37338g3.a<E>> {

        @XY0.d
        private static final long serialVersionUID = 0;

        public c(a aVar) {
        }

        @XY0.c
        @XY0.d
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof InterfaceC37338g3.a)) {
                return false;
            }
            InterfaceC37338g3.a aVar = (InterfaceC37338g3.a) obj;
            return aVar.getCount() > 0 && A1.this.S5(aVar.a()) == aVar.getCount();
        }

        @Override // com.google.common.collect.Q1
        public final Object get(int i12) {
            return A1.this.v(i12);
        }

        @Override // com.google.common.collect.H1, java.util.Collection, java.util.Set
        public final int hashCode() {
            return A1.this.hashCode();
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return A1.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return A1.this.k().size();
        }

        @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
        @XY0.c
        @XY0.d
        public Object writeReplace() {
            return new d(A1.this);
        }
    }

    /* compiled from: ImmutableMultiset.java */
    @XY0.d
    @XY0.c
    public static class d<E> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final A1<E> f359258b;

        public d(A1<E> a12) {
            this.f359258b = a12;
        }

        public Object readResolve() {
            return this.f359258b.entrySet();
        }
    }

    public static A1 r(Collection collection) {
        if (collection instanceof A1) {
            A1 a12 = (A1) collection;
            if (!a12.i()) {
                return a12;
            }
        }
        Collection collection2 = collection;
        b bVar = new b(collection2 instanceof InterfaceC37338g3 ? ((InterfaceC37338g3) collection2).k().size() : 11);
        Objects.requireNonNull(bVar.f359255a);
        if (collection instanceof InterfaceC37338g3) {
            InterfaceC37338g3 interfaceC37338g3 = (InterfaceC37338g3) collection;
            C37419u3<E> c37419u3 = interfaceC37338g3 instanceof K3 ? ((K3) interfaceC37338g3).f359441f : interfaceC37338g3 instanceof AbstractC37334g ? ((AbstractC37334g) interfaceC37338g3).f359779d : null;
            if (c37419u3 != null) {
                C37419u3<E> c37419u32 = bVar.f359255a;
                c37419u32.b(Math.max(c37419u32.f360015c, c37419u3.f360015c));
                for (int iC2 = c37419u3.c(); iC2 >= 0; iC2 = c37419u3.k(iC2)) {
                    bVar.d(c37419u3.f(iC2), c37419u3.e(iC2));
                }
            } else {
                Set<InterfaceC37338g3.a<E>> setEntrySet = interfaceC37338g3.entrySet();
                C37419u3<E> c37419u33 = bVar.f359255a;
                c37419u33.b(Math.max(c37419u33.f360015c, setEntrySet.size()));
                for (InterfaceC37338g3.a<E> aVar : interfaceC37338g3.entrySet()) {
                    bVar.d(aVar.getCount(), aVar.a());
                }
            }
        } else {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                bVar.b(it.next());
            }
        }
        return bVar.e();
    }

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final int O3(int i12, @I41.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final boolean P2(int i12, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final int add(int i12, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final AbstractC37401r1<E> b() {
        AbstractC37401r1<E> abstractC37401r1 = this.f359250c;
        if (abstractC37401r1 != null) {
            return abstractC37401r1;
        }
        AbstractC37401r1<E> abstractC37401r1B = super.b();
        this.f359250c = abstractC37401r1B;
        return abstractC37401r1B;
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@I41.a Object obj) {
        return S5(obj) > 0;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    @XY0.c
    public final int d(int i12, Object[] objArr) {
        N4<InterfaceC37338g3.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC37338g3.a<E> next = it.next();
            Arrays.fill(objArr, i12, next.getCount() + i12, next.a());
            i12 += next.getCount();
        }
        return i12;
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC37338g3
    public final boolean equals(@I41.a Object obj) {
        return C37374m3.a(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC37338g3
    public final int hashCode() {
        return W3.e(entrySet());
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final N4<E> iterator() {
        return new a(entrySet().iterator());
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final int p6(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    /* renamed from: s */
    public abstract H1<E> k();

    @Override // com.google.common.collect.InterfaceC37338g3
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final H1<InterfaceC37338g3.a<E>> entrySet() {
        H1<InterfaceC37338g3.a<E>> cVar = this.f359251d;
        if (cVar == null) {
            cVar = isEmpty() ? L3.f359468k : new c(null);
            this.f359251d = cVar;
        }
        return cVar;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    public abstract InterfaceC37338g3.a<E> v(int i12);

    @Override // com.google.common.collect.AbstractC37378n1
    @XY0.c
    @XY0.d
    public abstract Object writeReplace();
}
