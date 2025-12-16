package com.google.common.primitives;

import com.google.common.base.M;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

/* compiled from: ImmutableDoubleArray.java */
@XY0.b
@f
@aZ0.j
/* loaded from: classes6.dex */
public final class i implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final i f360381e = new i(new double[0], 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final double[] f360382b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f360383c;

    /* renamed from: d, reason: collision with root package name */
    public final int f360384d;

    /* compiled from: ImmutableDoubleArray.java */
    public static class b extends AbstractList<Double> implements RandomAccess, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final i f360385b;

        public b(i iVar, a aVar) {
            this.f360385b = iVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@I41.a Object obj) {
            boolean z12 = obj instanceof b;
            i iVar = this.f360385b;
            if (z12) {
                return iVar.equals(((b) obj).f360385b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (iVar.b() != list.size()) {
                return false;
            }
            int i12 = iVar.f360383c;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i13 = i12 + 1;
                    if (i.a(iVar.f360382b[i12], ((Double) obj2).doubleValue())) {
                        i12 = i13;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            i iVar = this.f360385b;
            M.i(i12, iVar.b());
            return Double.valueOf(iVar.f360382b[iVar.f360383c + i12]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.f360385b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            double dDoubleValue = ((Double) obj).doubleValue();
            i iVar = this.f360385b;
            int i12 = iVar.f360383c;
            for (int i13 = i12; i13 < iVar.f360384d; i13++) {
                if (i.a(iVar.f360382b[i13], dDoubleValue)) {
                    return i13 - i12;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            int i12;
            if (!(obj instanceof Double)) {
                return -1;
            }
            double dDoubleValue = ((Double) obj).doubleValue();
            i iVar = this.f360385b;
            int i13 = iVar.f360384d;
            do {
                i13--;
                i12 = iVar.f360383c;
                if (i13 < i12) {
                    return -1;
                }
            } while (!i.a(iVar.f360382b[i13], dDoubleValue));
            return i13 - i12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f360385b.b();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Double> subList(int i12, int i13) {
            i iVar;
            i iVar2 = this.f360385b;
            M.l(i12, i13, iVar2.b());
            if (i12 == i13) {
                iVar = i.f360381e;
            } else {
                int i14 = iVar2.f360383c;
                iVar = new i(iVar2.f360382b, i12 + i14, i14 + i13);
            }
            return new b(iVar, null);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.f360385b.toString();
        }
    }

    /* compiled from: ImmutableDoubleArray.java */
    public static final class c {
    }

    public static boolean a(double d12, double d13) {
        return Double.doubleToLongBits(d12) == Double.doubleToLongBits(d13);
    }

    public final int b() {
        return this.f360384d - this.f360383c;
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (b() != iVar.b()) {
            return false;
        }
        for (int i12 = 0; i12 < b(); i12++) {
            M.i(i12, b());
            double d12 = this.f360382b[this.f360383c + i12];
            M.i(i12, iVar.b());
            if (!a(d12, iVar.f360382b[iVar.f360383c + i12])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i12 = this.f360383c; i12 < this.f360384d; i12++) {
            double d12 = this.f360382b[i12];
            int i13 = d.f360372a;
            iHashCode = (iHashCode * 31) + Double.valueOf(d12).hashCode();
        }
        return iHashCode;
    }

    public Object readResolve() {
        return this.f360384d == this.f360383c ? f360381e : this;
    }

    public final String toString() {
        int i12 = this.f360383c;
        int i13 = this.f360384d;
        if (i13 == i12) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(b() * 5);
        sb2.append('[');
        double[] dArr = this.f360382b;
        sb2.append(dArr[i12]);
        while (true) {
            i12++;
            if (i12 >= i13) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(dArr[i12]);
        }
    }

    public Object writeReplace() {
        int i12 = this.f360384d;
        double[] dArr = this.f360382b;
        int i13 = this.f360383c;
        if (i13 <= 0 && i12 >= dArr.length) {
            return this;
        }
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i13, i12);
        return new i(dArrCopyOfRange, 0, dArrCopyOfRange.length);
    }

    public i(double[] dArr, int i12, int i13) {
        this.f360382b = dArr;
        this.f360383c = i12;
        this.f360384d = i13;
    }
}
