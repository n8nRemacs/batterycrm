package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.common.collect.AbstractC37378n1;
import com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: ImmutableSet.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class H1<E> extends AbstractC37378n1<E> implements Set<E> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f359346d = 0;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    public transient AbstractC37401r1<E> f359347c;

    /* compiled from: ImmutableSet.java */
    public static class a<E> extends AbstractC37378n1.a<E> {

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        @XY0.e
        public Object[] f359348d;

        /* renamed from: e, reason: collision with root package name */
        public int f359349e;

        public a() {
            super(4);
        }

        @Override // com.google.common.collect.AbstractC37378n1.a
        @InterfaceC19845a
        /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a<E> c(E e12) {
            e12.getClass();
            if (this.f359348d != null) {
                int iS2 = H1.s(this.f359867b);
                Object[] objArr = this.f359348d;
                if (iS2 <= objArr.length) {
                    Objects.requireNonNull(objArr);
                    int length = this.f359348d.length - 1;
                    int iHashCode = e12.hashCode();
                    int iB2 = C37348i1.b(iHashCode);
                    while (true) {
                        int i12 = iB2 & length;
                        Object[] objArr2 = this.f359348d;
                        Object obj = objArr2[i12];
                        if (obj == null) {
                            objArr2[i12] = e12;
                            this.f359349e += iHashCode;
                            super.c(e12);
                            break;
                        }
                        if (obj.equals(e12)) {
                            break;
                        }
                        iB2 = i12 + 1;
                    }
                    return this;
                }
            }
            this.f359348d = null;
            super.c(e12);
            return this;
        }

        @InterfaceC19845a
        public a<E> h(E... eArr) {
            if (this.f359348d != null) {
                for (E e12 : eArr) {
                    b(e12);
                }
            } else {
                int length = eArr.length;
                C37414t3.a(length, eArr);
                f(this.f359867b + length);
                System.arraycopy(eArr, 0, this.f359866a, this.f359867b, length);
                this.f359867b += length;
            }
            return this;
        }

        @InterfaceC19845a
        public a<E> i(Iterable<? extends E> iterable) {
            iterable.getClass();
            if (this.f359348d != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            } else {
                d(iterable);
            }
            return this;
        }

        public H1<E> j() {
            H1<E> h1T;
            int i12 = this.f359867b;
            if (i12 == 0) {
                int i13 = H1.f359346d;
                return L3.f359468k;
            }
            if (i12 == 1) {
                Object obj = this.f359866a[0];
                Objects.requireNonNull(obj);
                int i14 = H1.f359346d;
                return new C37309b4(obj);
            }
            if (this.f359348d == null || H1.s(i12) != this.f359348d.length) {
                h1T = H1.t(this.f359867b, this.f359866a);
                this.f359867b = h1T.size();
            } else {
                int i15 = this.f359867b;
                Object[] objArrCopyOf = this.f359866a;
                int length = objArrCopyOf.length;
                if (i15 < (length >> 1) + (length >> 2)) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i15);
                }
                h1T = new L3<>(objArrCopyOf, this.f359349e, this.f359348d, r6.length - 1, this.f359867b);
            }
            this.f359868c = true;
            this.f359348d = null;
            return h1T;
        }
    }

    /* compiled from: ImmutableSet.java */
    @XY0.d
    public static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f359350b;

        public b(Object[] objArr) {
            this.f359350b = objArr;
        }

        public Object readResolve() {
            return H1.w(this.f359350b);
        }
    }

    public static <E> H1<E> E() {
        return L3.f359468k;
    }

    public static <E> H1<E> I(E e12, E e13) {
        return t(2, e12, e13);
    }

    public static <E> H1<E> K(E e12, E e13, E e14) {
        return t(3, e12, e13, e14);
    }

    public static <E> H1<E> N(E e12, E e13, E e14, E e15, E e16) {
        return t(5, e12, e13, e14, e15, e16);
    }

    @SafeVarargs
    public static <E> H1<E> O(E e12, E e13, E e14, E e15, E e16, E e17, E... eArr) {
        com.google.common.base.M.d("the total number of elements must fit in an int", eArr.length <= 2147483641);
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e12;
        objArr[1] = e13;
        objArr[2] = e14;
        objArr[3] = e15;
        objArr[4] = e16;
        objArr[5] = e17;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return t(length, objArr);
    }

    public static H1 P() {
        return new C37309b4(null);
    }

    public static <E> a<E> r(int i12) {
        F.b(i12, "expectedSize");
        a<E> aVar = new a<>(i12);
        aVar.f359348d = new Object[s(i12)];
        return aVar;
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @XY0.e
    public static int s(int i12) {
        int iMax = Math.max(i12, 2);
        if (iMax >= 751619276) {
            com.google.common.base.M.d("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> H1<E> t(int i12, Object... objArr) {
        if (i12 == 0) {
            return L3.f359468k;
        }
        if (i12 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C37309b4(obj);
        }
        int iS2 = s(i12);
        Object[] objArr2 = new Object[iS2];
        int i13 = iS2 - 1;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            Object obj2 = objArr[i16];
            if (obj2 == null) {
                throw new NullPointerException(AK.c.g(i16, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iB2 = C37348i1.b(iHashCode);
            while (true) {
                int i17 = iB2 & i13;
                Object obj3 = objArr2[i17];
                if (obj3 == null) {
                    objArr[i15] = obj2;
                    objArr2[i17] = obj2;
                    i14 += iHashCode;
                    i15++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iB2++;
            }
        }
        Arrays.fill(objArr, i15, i12, (Object) null);
        if (i15 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C37309b4(obj4);
        }
        if (s(i15) < iS2 / 2) {
            return t(i15, objArr);
        }
        int length = objArr.length;
        if (i15 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i15);
        }
        return new L3(objArr, i14, objArr2, i13, i15);
    }

    public static <E> H1<E> v(Collection<? extends E> collection) {
        if ((collection instanceof H1) && !(collection instanceof SortedSet)) {
            H1<E> h12 = (H1) collection;
            if (!h12.i()) {
                return h12;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    public static <E> H1<E> w(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? t(eArr.length, (Object[]) eArr.clone()) : new C37309b4(eArr[0]) : L3.f359468k;
    }

    public boolean C() {
        return this instanceof C37335g0;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public AbstractC37401r1<E> b() {
        AbstractC37401r1<E> abstractC37401r1 = this.f359347c;
        if (abstractC37401r1 != null) {
            return abstractC37401r1;
        }
        AbstractC37401r1<E> abstractC37401r1Y = y();
        this.f359347c = abstractC37401r1Y;
        return abstractC37401r1Y;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof H1) && C() && ((H1) obj).C() && hashCode() != obj.hashCode()) {
            return false;
        }
        return W3.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return W3.e(this);
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.common.collect.AbstractC37378n1
    @XY0.d
    public Object writeReplace() {
        return new b(toArray(AbstractC37378n1.f359865b));
    }

    public AbstractC37401r1<E> y() {
        Object[] array = toArray();
        O4<Object> o42 = AbstractC37401r1.f359977c;
        return AbstractC37401r1.r(array.length, array);
    }
}
