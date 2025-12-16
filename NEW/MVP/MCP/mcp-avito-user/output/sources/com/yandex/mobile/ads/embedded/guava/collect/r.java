package com.yandex.mobile.ads.embedded.guava.collect;

import bZ0.InterfaceC25601b;
import com.google.j2objc.annotations.RetainedWith;
import com.yandex.mobile.ads.impl.ba;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes8.dex */
public abstract class r<E> extends n<E> implements Set<E> {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    private transient p<E> f382804b;

    public static class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        final Object[] f382805a;

        public a(Object[] objArr) {
            this.f382805a = objArr;
        }

        public Object readResolve() {
            return r.a(this.f382805a);
        }
    }

    public static r a(String str, String str2) {
        return b(2, str, str2);
    }

    private static <E> r<E> b(int i12, Object... objArr) {
        if (i12 == 0) {
            return h0.f382767i;
        }
        if (i12 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new n0(obj);
        }
        int iA2 = a(i12);
        Object[] objArr2 = new Object[iA2];
        int i13 = iA2 - 1;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            Object obj2 = objArr[i16];
            if (obj2 == null) {
                throw new NullPointerException(ba.a("at index ", i16));
            }
            int iHashCode = obj2.hashCode();
            int iA3 = m.a(iHashCode);
            while (true) {
                int i17 = iA3 & i13;
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
                iA3++;
            }
        }
        Arrays.fill(objArr, i15, i12, (Object) null);
        if (i15 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new n0(obj4);
        }
        if (a(i15) < iA2 / 2) {
            return b(i15, objArr);
        }
        int length = objArr.length;
        if (i15 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i15);
        }
        return new h0(objArr, i14, objArr2, i13, i15);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof r) && (this instanceof h0)) {
            r rVar = (r) obj;
            rVar.getClass();
            if ((rVar instanceof h0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return m0.a(this, obj);
    }

    public p<E> h() {
        Object[] array = toArray();
        int i12 = p.f382791c;
        return p.b(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return m0.a(this);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public Object writeReplace() {
        return new a(toArray());
    }

    public static r a(String str, String str2, String str3) {
        return b(3, str, str2, str3);
    }

    public static int a(int i12) {
        int iMax = Math.max(i12, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static r a(Set set) {
        if ((set instanceof r) && !(set instanceof SortedSet)) {
            r rVar = (r) set;
            if (!rVar.f()) {
                return rVar;
            }
        }
        Object[] array = set.toArray();
        return b(array.length, array);
    }

    public static <E> r<E> a(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return h0.f382767i;
        }
        if (length != 1) {
            return b(eArr.length, (Object[]) eArr.clone());
        }
        return new n0(eArr[0]);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public p<E> b() {
        p<E> pVar = this.f382804b;
        if (pVar != null) {
            return pVar;
        }
        p<E> pVarH = h();
        this.f382804b = pVarH;
        return pVarH;
    }
}
