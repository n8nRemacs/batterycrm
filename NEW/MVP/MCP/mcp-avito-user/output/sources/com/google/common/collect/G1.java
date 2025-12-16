package com.google.common.collect;

import bZ0.InterfaceC25601b;
import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.AbstractC37316d;
import com.google.common.collect.B3;
import com.google.common.collect.C37333f4;
import com.google.common.collect.Y;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: ImmutableRangeSet.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
public final class G1<C extends Comparable> extends AbstractC37364l<C> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final G1<Comparable<?>> f359332c;

    /* renamed from: d, reason: collision with root package name */
    public static final G1<Comparable<?>> f359333d;

    /* renamed from: b, reason: collision with root package name */
    public final transient AbstractC37401r1<B3<C>> f359334b;

    /* compiled from: ImmutableRangeSet.java */
    public final class a extends N1<C> {

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient Integer f359335g;

        /* compiled from: ImmutableRangeSet.java */
        /* renamed from: com.google.common.collect.G1$a$a, reason: collision with other inner class name */
        public class C10660a extends AbstractC37316d<C> {

            /* renamed from: d, reason: collision with root package name */
            public final O4 f359336d;

            /* renamed from: e, reason: collision with root package name */
            public N4 f359337e;

            public C10660a() {
                a.this.getClass();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractC37316d
            @I41.a
            public final Object a() {
                while (!this.f359337e.hasNext()) {
                    O4 o42 = this.f359336d;
                    if (!o42.hasNext()) {
                        this.f359661b = AbstractC37316d.b.f359666d;
                        return null;
                    }
                    B3 b32 = (B3) o42.next();
                    a.this.getClass();
                    this.f359337e = W.f0(b32, null).iterator();
                }
                return (Comparable) this.f359337e.next();
            }
        }

        /* compiled from: ImmutableRangeSet.java */
        public class b extends AbstractC37316d<C> {

            /* renamed from: d, reason: collision with root package name */
            public final O4 f359339d;

            /* renamed from: e, reason: collision with root package name */
            public N4 f359340e;

            public b() {
                a.this.getClass();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractC37316d
            @I41.a
            public final Object a() {
                while (!this.f359340e.hasNext()) {
                    O4 o42 = this.f359339d;
                    if (!o42.hasNext()) {
                        this.f359661b = AbstractC37316d.b.f359666d;
                        return null;
                    }
                    B3 b32 = (B3) o42.next();
                    a.this.getClass();
                    this.f359340e = W.f0(b32, null).descendingIterator();
                }
                return (Comparable) this.f359340e.next();
            }
        }

        @XY0.d
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // com.google.common.collect.N1
        public final N1<C> R() {
            return new C37305b0(this);
        }

        @Override // com.google.common.collect.N1
        @XY0.c
        /* renamed from: S */
        public final N4<C> descendingIterator() {
            return new b();
        }

        @Override // com.google.common.collect.N1
        public final N1 Y(Object obj, boolean z12) {
            f0(B3.k((Comparable) obj, BoundType.a(z12)));
            throw null;
        }

        @Override // com.google.common.collect.N1
        public final N1 b0(Object obj, boolean z12, Object obj2, boolean z13) {
            Comparable comparable = (Comparable) obj;
            Comparable comparable2 = (Comparable) obj2;
            if (!z12 && !z13) {
                B3<Comparable> b32 = B3.f359264d;
                if (comparable.compareTo(comparable2) == 0) {
                    return N3.f359527h;
                }
            }
            f0(B3.i(comparable, BoundType.a(z12), comparable2, BoundType.a(z13)));
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.N1, java.util.NavigableSet
        @XY0.c
        public final Iterator descendingIterator() {
            return new b();
        }

        @Override // com.google.common.collect.N1
        public final N1 e0(Object obj, boolean z12) {
            f0(B3.b((Comparable) obj, BoundType.a(z12)));
            throw null;
        }

        public final N1<C> f0(B3<C> b32) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            throw null;
        }

        @Override // com.google.common.collect.N1, com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new C10660a();
        }

        @Override // com.google.common.collect.AbstractC37378n1
        /* renamed from: l */
        public final N4<C> iterator() {
            return new C10660a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            Integer num = this.f359335g;
            num.getClass();
            return num.intValue();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            throw null;
        }

        @Override // com.google.common.collect.N1, com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
        @XY0.d
        public Object writeReplace() {
            throw null;
        }
    }

    /* compiled from: ImmutableRangeSet.java */
    public static class b<C extends Comparable> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37401r1<B3<C>> f359342b;

        public b(AbstractC37401r1 abstractC37401r1) {
            this.f359342b = abstractC37401r1;
        }

        public Object readResolve() {
            new G1(this.f359342b);
            throw null;
        }
    }

    /* compiled from: ImmutableRangeSet.java */
    public static class c<C extends Comparable<?>> {
        public c() {
            new ArrayList();
        }
    }

    /* compiled from: ImmutableRangeSet.java */
    public final class d extends AbstractC37401r1<B3<C>> {
        @Override // java.util.List
        public final Object get(int i12) {
            com.google.common.base.M.i(i12, 0);
            AbstractC37401r1 unused = null.f359334b;
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }
    }

    /* compiled from: ImmutableRangeSet.java */
    public static final class e<C extends Comparable> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37401r1<B3<C>> f359343b;

        public e(AbstractC37401r1<B3<C>> abstractC37401r1) {
            this.f359343b = abstractC37401r1;
        }

        public Object readResolve() {
            AbstractC37401r1<B3<C>> abstractC37401r1 = this.f359343b;
            return abstractC37401r1.isEmpty() ? G1.f359332c : abstractC37401r1.equals(AbstractC37401r1.E(B3.f359264d)) ? G1.f359333d : new G1(abstractC37401r1);
        }
    }

    static {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        f359332c = new G1<>(I3.f359390f);
        f359333d = new G1<>(AbstractC37401r1.E(B3.f359264d));
    }

    public G1(AbstractC37401r1<B3<C>> abstractC37401r1) {
        this.f359334b = abstractC37401r1;
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.E3
    public final Set a() {
        AbstractC37401r1<B3<C>> abstractC37401r1 = this.f359334b;
        if (abstractC37401r1.isEmpty()) {
            int i12 = H1.f359346d;
            return L3.f359468k;
        }
        B3<Comparable> b32 = B3.f359264d;
        return new N3(abstractC37401r1, B3.c.f359269b);
    }

    @I41.a
    public final B3<C> c(C c12) {
        int iA2;
        InterfaceC37276u interfaceC37276uH = B3.h();
        Y.e eVarA = Y.a(c12);
        AbstractC37429w3 abstractC37429w3D = AbstractC37429w3.d();
        C37333f4.c.a aVar = C37333f4.c.f359774b;
        C37333f4.b.a aVar2 = C37333f4.b.f359771b;
        AbstractList abstractListD = C37423v2.d(this.f359334b, interfaceC37276uH);
        abstractC37429w3D.getClass();
        aVar.getClass();
        aVar2.getClass();
        if (!(abstractListD instanceof RandomAccess)) {
            abstractListD = new ArrayList(abstractListD);
        }
        int size = abstractListD.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 > size) {
                iA2 = aVar2.a(i12);
                break;
            }
            int i13 = (i12 + size) >>> 1;
            int iCompare = ((C37392p3) abstractC37429w3D).compare(eVarA, abstractListD.get(i13));
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    int i14 = i13 - i12;
                    aVar.a(abstractC37429w3D, eVarA, abstractListD.subList(i12, size + 1), i14);
                    iA2 = i12 + i14;
                    break;
                }
                i12 = i13 + 1;
            } else {
                size = i13 - 1;
            }
        }
        if (iA2 == -1) {
            return null;
        }
        B3<C> b32 = this.f359334b.get(iA2);
        if (b32.a(c12)) {
            return b32;
        }
        return null;
    }

    public final B3<C> d() {
        AbstractC37401r1<B3<C>> abstractC37401r1 = this.f359334b;
        if (abstractC37401r1.isEmpty()) {
            throw new NoSuchElementException();
        }
        return new B3<>(abstractC37401r1.get(0).f359265b, abstractC37401r1.get(abstractC37401r1.size() - 1).f359266c);
    }

    @XY0.d
    public Object writeReplace() {
        return new e(this.f359334b);
    }
}
