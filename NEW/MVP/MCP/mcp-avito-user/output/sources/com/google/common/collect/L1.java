package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.common.collect.A1;
import com.google.common.collect.AbstractC37378n1;
import com.google.common.collect.InterfaceC37338g3;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: ImmutableSortedMultiset.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class L1<E> extends M1<E> implements InterfaceC37345h4<E> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f359456g = 0;

    /* renamed from: f, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient L1<E> f359457f;

    /* compiled from: ImmutableSortedMultiset.java */
    public static class a<E> extends A1.b<E> {

        /* renamed from: c, reason: collision with root package name */
        public final Comparator<? super E> f359458c;

        /* renamed from: d, reason: collision with root package name */
        @XY0.e
        public E[] f359459d;

        /* renamed from: e, reason: collision with root package name */
        public int[] f359460e;

        /* renamed from: f, reason: collision with root package name */
        public int f359461f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f359462g;

        public a(Comparator<? super E> comparator) {
            this.f359256b = false;
            this.f359255a = null;
            comparator.getClass();
            this.f359458c = comparator;
            this.f359459d = (E[]) new Object[4];
            this.f359460e = new int[4];
        }

        @Override // com.google.common.collect.A1.b
        @InterfaceC19845a
        public final AbstractC37378n1.b b(Object obj) {
            f(1, obj);
            return this;
        }

        @Override // com.google.common.collect.A1.b
        @InterfaceC19845a
        /* renamed from: c */
        public final A1.b b(Object obj) {
            f(1, obj);
            return this;
        }

        @Override // com.google.common.collect.A1.b
        @InterfaceC19845a
        public final /* bridge */ /* synthetic */ A1.b d(int i12, Object obj) {
            f(i12, obj);
            return this;
        }

        @Override // com.google.common.collect.A1.b
        public final /* bridge */ /* synthetic */ A1 e() {
            throw null;
        }

        @InterfaceC19845a
        public final void f(int i12, Object obj) {
            obj.getClass();
            F.b(i12, "occurrences");
            if (i12 == 0) {
                return;
            }
            int i13 = this.f359461f;
            E[] eArr = this.f359459d;
            if (i13 == eArr.length) {
                g(true);
            } else if (this.f359462g) {
                this.f359459d = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f359462g = false;
            Object[] objArr = (E[]) this.f359459d;
            int i14 = this.f359461f;
            objArr[i14] = obj;
            this.f359460e[i14] = i12;
            this.f359461f = i14 + 1;
        }

        public final void g(boolean z12) {
            int i12 = this.f359461f;
            if (i12 == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f359459d, i12);
            Comparator<? super E> comparator = this.f359458c;
            Arrays.sort(objArr, comparator);
            int i13 = 1;
            for (int i14 = 1; i14 < objArr.length; i14++) {
                if (comparator.compare((Object) objArr[i13 - 1], (Object) objArr[i14]) < 0) {
                    objArr[i13] = objArr[i14];
                    i13++;
                }
            }
            Arrays.fill(objArr, i13, this.f359461f, (Object) null);
            if (z12) {
                int i15 = i13 * 4;
                int i16 = this.f359461f;
                if (i15 > i16 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, com.google.common.primitives.l.f(i16 + (i16 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i17 = 0; i17 < this.f359461f; i17++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i13, this.f359459d[i17], comparator);
                int i18 = this.f359460e[i17];
                if (i18 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i18;
                } else {
                    iArr[iBinarySearch] = ~i18;
                }
            }
            this.f359459d = (E[]) objArr;
            this.f359460e = iArr;
            this.f359461f = i13;
        }
    }

    /* compiled from: ImmutableSortedMultiset.java */
    @XY0.d
    public static final class b<E> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final Comparator<? super E> f359463b;

        /* renamed from: c, reason: collision with root package name */
        public final E[] f359464c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f359465d;

        public b(L1 l12) {
            this.f359463b = l12.comparator();
            int size = l12.entrySet().size();
            this.f359464c = (E[]) new Object[size];
            this.f359465d = new int[size];
            int i12 = 0;
            for (InterfaceC37338g3.a<E> aVar : l12.entrySet()) {
                this.f359464c[i12] = aVar.a();
                this.f359465d[i12] = aVar.getCount();
                i12++;
            }
        }

        public Object readResolve() {
            int i12;
            E[] eArr = this.f359464c;
            int length = eArr.length;
            a aVar = new a(this.f359463b);
            for (int i13 = 0; i13 < length; i13++) {
                aVar.f(this.f359465d[i13], eArr[i13]);
            }
            aVar.g(false);
            int i14 = 0;
            int i15 = 0;
            while (true) {
                i12 = aVar.f359461f;
                if (i14 >= i12) {
                    break;
                }
                int[] iArr = aVar.f359460e;
                int i16 = iArr[i14];
                if (i16 > 0) {
                    E[] eArr2 = aVar.f359459d;
                    eArr2[i15] = eArr2[i14];
                    iArr[i15] = i16;
                    i15++;
                }
                i14++;
            }
            Arrays.fill(aVar.f359459d, i15, i12, (Object) null);
            Arrays.fill(aVar.f359460e, i15, aVar.f359461f, 0);
            aVar.f359461f = i15;
            Comparator<? super E> comparator = aVar.f359458c;
            if (i15 == 0) {
                int i17 = L1.f359456g;
                return C37392p3.f359948d.equals(comparator) ? M3.f359512m : new M3(comparator);
            }
            N3 n32 = (N3) N1.Q(comparator, i15, aVar.f359459d);
            long[] jArr = new long[aVar.f359461f + 1];
            int i18 = 0;
            while (i18 < aVar.f359461f) {
                int i19 = i18 + 1;
                jArr[i19] = jArr[i18] + aVar.f359460e[i18];
                i18 = i19;
            }
            aVar.f359462g = true;
            return new M3(n32, jArr, 0, aVar.f359461f);
        }
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    /* renamed from: C */
    public abstract L1<E> l1(E e12, BoundType boundType);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.InterfaceC37345h4
    public final InterfaceC37345h4 C2(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        com.google.common.base.M.h(k().f359521e.compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return V5(obj, boundType).l1(obj2, boundType2);
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    /* renamed from: E */
    public abstract L1<E> V5(E e12, BoundType boundType);

    @Override // com.google.common.collect.InterfaceC37345h4, com.google.common.collect.InterfaceC37321d4
    public final Comparator<? super E> comparator() {
        return k().f359521e;
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    @aZ0.e
    @Deprecated
    @InterfaceC19845a
    public final InterfaceC37338g3.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    @aZ0.e
    @Deprecated
    @InterfaceC19845a
    public final InterfaceC37338g3.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public L1<E> d1() {
        C37299a0 c37299a0 = this.f359457f;
        if (c37299a0 == null) {
            if (isEmpty()) {
                AbstractC37429w3 abstractC37429w3H = AbstractC37429w3.b(k().f359521e).h();
                c37299a0 = C37392p3.f359948d.equals(abstractC37429w3H) ? (L1<E>) M3.f359512m : new M3(abstractC37429w3H);
            } else {
                c37299a0 = new C37299a0(this);
            }
            this.f359457f = c37299a0;
        }
        return c37299a0;
    }

    @Override // com.google.common.collect.A1, com.google.common.collect.AbstractC37378n1
    @XY0.d
    public Object writeReplace() {
        return new b(this);
    }

    @Override // com.google.common.collect.A1
    /* renamed from: y */
    public abstract N1<E> k();
}
