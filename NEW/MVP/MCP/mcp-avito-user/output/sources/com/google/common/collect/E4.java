package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.C37374m3;
import com.google.common.collect.InterfaceC37338g3;
import com.google.common.collect.S3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: TreeMultiset.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public final class E4<E> extends AbstractC37394q<E> implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f359290g = 0;

    @XY0.c
    @XY0.d
    private static final long serialVersionUID = 1;

    /* renamed from: f, reason: collision with root package name */
    public final transient C37306b1<E> f359291f;

    /* compiled from: TreeMultiset.java */
    public class a implements Iterator<InterfaceC37338g3.a<E>> {

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public e<E> f359292b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public InterfaceC37338g3.a<E> f359293c;

        public a() {
            E4.this.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            e<E> eVar = this.f359292b;
            if (eVar == null) {
                return false;
            }
            if (!E4.this.f359291f.c(eVar.f359300a)) {
                return true;
            }
            this.f359292b = null;
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            e<E> eVar = this.f359292b;
            Objects.requireNonNull(eVar);
            int i12 = E4.f359290g;
            E4 e42 = E4.this;
            e42.getClass();
            D4 d42 = new D4(e42, eVar);
            this.f359293c = d42;
            Objects.requireNonNull(this.f359292b.f359303d);
            e<E> eVar2 = this.f359292b.f359303d;
            Objects.requireNonNull(eVar2);
            this.f359292b = eVar2;
            return d42;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.base.M.n("no calls to next() since the last call to remove()", this.f359293c != null);
            E4.this.p6(((D4) this.f359293c).f359283b.f359300a);
            this.f359293c = null;
        }
    }

    /* compiled from: TreeMultiset.java */
    public class b implements Iterator<InterfaceC37338g3.a<E>> {

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public e<E> f359295b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public InterfaceC37338g3.a<E> f359296c;

        public b() {
            E4.this.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            e<E> eVar = this.f359295b;
            if (eVar == null) {
                return false;
            }
            if (!E4.this.f359291f.d(eVar.f359300a)) {
                return true;
            }
            this.f359295b = null;
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.f359295b);
            e<E> eVar = this.f359295b;
            int i12 = E4.f359290g;
            E4 e42 = E4.this;
            e42.getClass();
            D4 d42 = new D4(e42, eVar);
            this.f359296c = d42;
            Objects.requireNonNull(this.f359295b.f359302c);
            e<E> eVar2 = this.f359295b.f359302c;
            Objects.requireNonNull(eVar2);
            this.f359295b = eVar2;
            return d42;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.base.M.n("no calls to next() since the last call to remove()", this.f359296c != null);
            E4.this.p6(((D4) this.f359296c).f359283b.f359300a);
            this.f359296c = null;
        }
    }

    /* compiled from: TreeMultiset.java */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f359298a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f359298a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f359298a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TreeMultiset.java */
    public static abstract class d {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ d[] f359299b = {new a("SIZE", 0, null), new b("DISTINCT", 1, null)};

        /* JADX INFO: Fake field, exist only in values array */
        d EF7;

        /* compiled from: TreeMultiset.java */
        public enum a extends d {
        }

        /* compiled from: TreeMultiset.java */
        public enum b extends d {
        }

        public d() {
            throw null;
        }

        public d(String str, int i12, D4 d42) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f359299b.clone();
        }
    }

    /* compiled from: TreeMultiset.java */
    public static final class e<E> {

        /* renamed from: a, reason: collision with root package name */
        @I41.a
        public final E f359300a = null;

        /* renamed from: b, reason: collision with root package name */
        public final int f359301b = 1;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public e<E> f359302c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public e<E> f359303d;

        public final String toString() {
            return new C37374m3.f(this.f359300a, this.f359301b).toString();
        }
    }

    /* compiled from: TreeMultiset.java */
    public static final class f<T> {
        public f() {
        }

        public /* synthetic */ f(D4 d42) {
            this();
        }
    }

    public E4(C37306b1 c37306b1) {
        super(c37306b1.f359647b);
        this.f359291f = c37306b1;
    }

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Comparator comparator = (Comparator) object;
        S3.a(AbstractC37394q.class, "comparator").a(this, comparator);
        S3.b bVarA = S3.a(E4.class, "range");
        BoundType boundType = BoundType.f359276b;
        bVarA.a(this, new C37306b1(comparator, false, null, boundType, false, null, boundType));
        S3.a(E4.class, "rootReference").a(this, new f(null));
        e<E> eVar = new e<>();
        S3.a(E4.class, "header").a(this, eVar);
        eVar.f359303d = eVar;
        eVar.f359302c = eVar;
        S3.d(this, objectInputStream, objectInputStream.readInt());
    }

    @XY0.c
    @XY0.d
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(super.k().comparator());
        S3.g(this, objectOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC37394q, com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4 C2(@InterfaceC37434x3 Object obj, BoundType boundType, @InterfaceC37434x3 Object obj2, BoundType boundType2) {
        return ((E4) V5(obj, boundType)).l1(obj2, boundType2);
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int O3(int i12, @I41.a Object obj) {
        F.b(i12, "occurrences");
        if (i12 != 0) {
            throw null;
        }
        try {
            throw null;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final boolean P2(int i12, @InterfaceC37434x3 Object obj) {
        F.b(0, "newCount");
        F.b(i12, "oldCount");
        com.google.common.base.M.g(this.f359291f.a(obj));
        throw null;
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    public final int S5(@I41.a Object obj) {
        try {
            throw null;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> V5(@InterfaceC37434x3 E e12, BoundType boundType) {
        return new E4(this.f359291f.b(new C37306b1<>(this.f359952d, true, e12, boundType, false, null, BoundType.f359276b)));
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int add(int i12, @InterfaceC37434x3 Object obj) {
        F.b(i12, "occurrences");
        if (i12 == 0) {
            try {
                throw null;
            } catch (NullPointerException unused) {
                return 0;
            }
        }
        com.google.common.base.M.g(this.f359291f.a(obj));
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C37306b1<E> c37306b1 = this.f359291f;
        if (!c37306b1.f359648c && !c37306b1.f359651f) {
            throw null;
        }
        new a();
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37394q, com.google.common.collect.InterfaceC37345h4, com.google.common.collect.InterfaceC37321d4
    public final Comparator comparator() {
        return this.f359952d;
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final int e() {
        d[] dVarArr = d.f359299b;
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final Iterator<E> g() {
        new a();
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final Iterator<InterfaceC37338g3.a<E>> h() {
        new a();
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37394q
    public final Iterator<InterfaceC37338g3.a<E>> i() {
        new b();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return C37374m3.c(this);
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4<E> l1(@InterfaceC37434x3 E e12, BoundType boundType) {
        return new E4(this.f359291f.b(new C37306b1<>(this.f359952d, false, null, BoundType.f359276b, true, e12, boundType)));
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int p6(@InterfaceC37434x3 Object obj) {
        F.b(0, "count");
        if (this.f359291f.a(obj)) {
            throw null;
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        d[] dVarArr = d.f359299b;
        throw null;
    }
}
