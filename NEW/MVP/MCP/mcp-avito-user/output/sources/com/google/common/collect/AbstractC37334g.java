package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.C37419u3;
import com.google.common.collect.InterfaceC37338g3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractMapBasedMultiset.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37334g<E> extends AbstractC37352j<E> implements Serializable {

    @XY0.c
    @XY0.d
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    public transient C37419u3<E> f359779d;

    /* renamed from: e, reason: collision with root package name */
    public transient long f359780e;

    /* compiled from: AbstractMapBasedMultiset.java */
    /* renamed from: com.google.common.collect.g$a */
    public class a extends AbstractC37334g<E>.c<E> {
        public a() {
            super();
        }

        @Override // com.google.common.collect.AbstractC37334g.c
        @InterfaceC37434x3
        public final E a(int i12) {
            return AbstractC37334g.this.f359779d.e(i12);
        }
    }

    /* compiled from: AbstractMapBasedMultiset.java */
    /* renamed from: com.google.common.collect.g$b */
    public class b extends AbstractC37334g<E>.c<InterfaceC37338g3.a<E>> {
        public b() {
            super();
        }

        @Override // com.google.common.collect.AbstractC37334g.c
        public final Object a(int i12) {
            C37419u3<E> c37419u3 = AbstractC37334g.this.f359779d;
            com.google.common.base.M.i(i12, c37419u3.f360015c);
            return new C37419u3.a(i12);
        }
    }

    /* compiled from: AbstractMapBasedMultiset.java */
    /* renamed from: com.google.common.collect.g$c */
    public abstract class c<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public int f359783b;

        /* renamed from: c, reason: collision with root package name */
        public int f359784c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f359785d;

        public c() {
            this.f359783b = AbstractC37334g.this.f359779d.c();
            this.f359785d = AbstractC37334g.this.f359779d.f360016d;
        }

        @InterfaceC37434x3
        public abstract T a(int i12);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (AbstractC37334g.this.f359779d.f360016d == this.f359785d) {
                return this.f359783b >= 0;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        @InterfaceC37434x3
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tA2 = a(this.f359783b);
            int i12 = this.f359783b;
            this.f359784c = i12;
            this.f359783b = AbstractC37334g.this.f359779d.k(i12);
            return tA2;
        }

        @Override // java.util.Iterator
        public final void remove() {
            AbstractC37334g abstractC37334g = AbstractC37334g.this;
            if (abstractC37334g.f359779d.f360016d != this.f359785d) {
                throw new ConcurrentModificationException();
            }
            F.e(this.f359784c != -1);
            abstractC37334g.f359780e -= abstractC37334g.f359779d.o(this.f359784c);
            this.f359783b = abstractC37334g.f359779d.l(this.f359783b, this.f359784c);
            this.f359784c = -1;
            this.f359785d = abstractC37334g.f359779d.f360016d;
        }
    }

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i12 = objectInputStream.readInt();
        this.f359779d = i(3);
        S3.d(this, objectInputStream, i12);
    }

    @XY0.c
    @XY0.d
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        S3.g(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int O3(int i12, @I41.a Object obj) {
        if (i12 == 0) {
            return this.f359779d.d(obj);
        }
        com.google.common.base.M.c(i12, "occurrences cannot be negative: %s", i12 > 0);
        int iG2 = this.f359779d.g(obj);
        if (iG2 == -1) {
            return 0;
        }
        int iF2 = this.f359779d.f(iG2);
        if (iF2 > i12) {
            C37419u3<E> c37419u3 = this.f359779d;
            com.google.common.base.M.i(iG2, c37419u3.f360015c);
            c37419u3.f360014b[iG2] = iF2 - i12;
        } else {
            this.f359779d.o(iG2);
            i12 = iF2;
        }
        this.f359780e -= i12;
        return iF2;
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    public final boolean P2(int i12, @InterfaceC37434x3 Object obj) {
        F.b(i12, "oldCount");
        F.b(0, "newCount");
        int iG2 = this.f359779d.g(obj);
        if (iG2 == -1) {
            return i12 == 0;
        }
        if (this.f359779d.f(iG2) != i12) {
            return false;
        }
        this.f359779d.o(iG2);
        this.f359780e -= i12;
        return true;
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    public final int S5(@I41.a Object obj) {
        return this.f359779d.d(obj);
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int add(int i12, @InterfaceC37434x3 Object obj) {
        if (i12 == 0) {
            return this.f359779d.d(obj);
        }
        com.google.common.base.M.c(i12, "occurrences cannot be negative: %s", i12 > 0);
        int iG2 = this.f359779d.g(obj);
        if (iG2 == -1) {
            this.f359779d.m(i12, obj);
            this.f359780e += i12;
            return 0;
        }
        int iF2 = this.f359779d.f(iG2);
        long j12 = i12;
        long j13 = iF2 + j12;
        com.google.common.base.M.e("too many occurrences: %s", j13 <= 2147483647L, j13);
        C37419u3<E> c37419u3 = this.f359779d;
        com.google.common.base.M.i(iG2, c37419u3.f360015c);
        c37419u3.f360014b[iG2] = (int) j13;
        this.f359780e += j12;
        return iF2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f359779d.a();
        this.f359780e = 0L;
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final int e() {
        return this.f359779d.f360015c;
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final Iterator<E> g() {
        return new a();
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final Iterator<InterfaceC37338g3.a<E>> h() {
        return new b();
    }

    public abstract C37419u3<E> i(int i12);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return C37374m3.c(this);
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int p6(@InterfaceC37434x3 Object obj) {
        F.b(0, "count");
        C37419u3<E> c37419u3 = this.f359779d;
        c37419u3.getClass();
        int iN2 = c37419u3.n(C37348i1.c(obj), obj);
        this.f359780e += 0 - iN2;
        return iN2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return com.google.common.primitives.l.f(this.f359780e);
    }
}
