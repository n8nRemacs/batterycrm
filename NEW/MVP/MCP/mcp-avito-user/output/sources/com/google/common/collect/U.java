package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.InterfaceC37338g3;
import com.google.common.collect.S3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* compiled from: ConcurrentHashMultiset.java */
@InterfaceC37329f0
@XY0.d
@XY0.c
/* loaded from: classes6.dex */
public final class U<E> extends AbstractC37352j<E> implements Serializable {
    private static final long serialVersionUID = 1;

    /* compiled from: ConcurrentHashMultiset.java */
    public class a extends U0<E> {
        @Override // com.google.common.collect.U0, com.google.common.collect.B0, com.google.common.collect.S0
        public final Object X() {
            throw null;
        }

        @Override // com.google.common.collect.U0, com.google.common.collect.B0
        /* renamed from: Y */
        public final Collection X() {
            throw null;
        }

        @Override // com.google.common.collect.U0
        /* renamed from: b0 */
        public final Set<E> X() {
            throw null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (obj == null) {
                return false;
            }
            throw null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return G.a(this, collection);
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean remove(@I41.a Object obj) {
            if (obj == null) {
                return false;
            }
            throw null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            collection.getClass();
            return W3.h(collection, this);
        }
    }

    /* compiled from: ConcurrentHashMultiset.java */
    public class b extends AbstractC37316d<InterfaceC37338g3.a<E>> {
        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final Object a() {
            throw null;
        }
    }

    /* compiled from: ConcurrentHashMultiset.java */
    public class c extends I0<InterfaceC37338g3.a<E>> {

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public InterfaceC37338g3.a<E> f359575b;

        @Override // com.google.common.collect.I0, com.google.common.collect.S0
        public final Object X() {
            throw null;
        }

        @Override // com.google.common.collect.I0
        /* renamed from: Y */
        public final Iterator<InterfaceC37338g3.a<E>> X() {
            throw null;
        }

        @Override // com.google.common.collect.I0, java.util.Iterator
        public final Object next() {
            InterfaceC37338g3.a<E> aVar = (InterfaceC37338g3.a) super.next();
            this.f359575b = aVar;
            return aVar;
        }

        @Override // com.google.common.collect.I0, java.util.Iterator
        public final void remove() {
            com.google.common.base.M.n("no calls to next() since the last call to remove()", this.f359575b != null);
            this.f359575b.a();
            throw null;
        }
    }

    /* compiled from: ConcurrentHashMultiset.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final S3.b<U> f359577a = S3.a(U.class, "countMap");
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        e.f359577a.a(this, (ConcurrentMap) object);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(null);
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int O3(int i12, @I41.a Object obj) {
        if (i12 == 0) {
            M2.j(null, obj);
            throw null;
        }
        F.d(i12, "occurrences");
        M2.j(null, obj);
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final boolean P2(int i12, Object obj) {
        obj.getClass();
        F.b(i12, "oldCount");
        F.b(0, "newCount");
        M2.j(null, obj);
        throw null;
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    public final int S5(@I41.a Object obj) {
        M2.j(null, obj);
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int add(int i12, Object obj) {
        obj.getClass();
        if (i12 == 0) {
            M2.j(null, obj);
            throw null;
        }
        F.d(i12, "occurrences");
        M2.j(null, obj);
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final Set<E> b() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37352j
    @Deprecated
    public final Set<InterfaceC37338g3.a<E>> d() {
        return new d(null);
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final int e() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final Iterator<E> g() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final Iterator<InterfaceC37338g3.a<E>> h() {
        new b();
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37352j, java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return C37374m3.c(this);
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int p6(Object obj) {
        obj.getClass();
        F.b(0, "count");
        M2.j(null, obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        throw null;
    }

    /* compiled from: ConcurrentHashMultiset.java */
    public class d extends AbstractC37352j<E>.b {
        public d(a aVar) {
            super();
        }

        @Override // com.google.common.collect.AbstractC37352j.b, com.google.common.collect.C37374m3.d
        public final InterfaceC37338g3 e() {
            return U.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            AbstractC37352j abstractC37352j = AbstractC37352j.this;
            ArrayList arrayList = new ArrayList(C37423v2.a(abstractC37352j.e()));
            C37325e2.a(arrayList, abstractC37352j.h());
            return arrayList.toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            AbstractC37352j abstractC37352j = AbstractC37352j.this;
            ArrayList arrayList = new ArrayList(C37423v2.a(abstractC37352j.e()));
            C37325e2.a(arrayList, abstractC37352j.h());
            return (T[]) arrayList.toArray(tArr);
        }
    }
}
