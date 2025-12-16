package com.google.common.primitives;

import com.google.common.base.M;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

/* compiled from: ImmutableLongArray.java */
@XY0.b
@f
@aZ0.j
/* loaded from: classes6.dex */
public final class k implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final k f360391e = new k(0, 0, new long[0]);

    /* renamed from: b, reason: collision with root package name */
    public final long[] f360392b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f360393c;

    /* renamed from: d, reason: collision with root package name */
    public final int f360394d;

    /* compiled from: ImmutableLongArray.java */
    public static class b extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final k f360395b;

        public b(k kVar, a aVar) {
            this.f360395b = kVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@I41.a Object obj) {
            boolean z12 = obj instanceof b;
            k kVar = this.f360395b;
            if (z12) {
                return kVar.equals(((b) obj).f360395b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (kVar.a() != list.size()) {
                return false;
            }
            int i12 = kVar.f360393c;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i13 = i12 + 1;
                    if (kVar.f360392b[i12] == ((Long) obj2).longValue()) {
                        i12 = i13;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            k kVar = this.f360395b;
            M.i(i12, kVar.a());
            return Long.valueOf(kVar.f360392b[kVar.f360393c + i12]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.f360395b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            long jLongValue = ((Long) obj).longValue();
            k kVar = this.f360395b;
            int i12 = kVar.f360393c;
            for (int i13 = i12; i13 < kVar.f360394d; i13++) {
                if (kVar.f360392b[i13] == jLongValue) {
                    return i13 - i12;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            int i12;
            if (!(obj instanceof Long)) {
                return -1;
            }
            long jLongValue = ((Long) obj).longValue();
            k kVar = this.f360395b;
            int i13 = kVar.f360394d;
            do {
                i13--;
                i12 = kVar.f360393c;
                if (i13 < i12) {
                    return -1;
                }
            } while (kVar.f360392b[i13] != jLongValue);
            return i13 - i12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f360395b.a();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Long> subList(int i12, int i13) {
            k kVar;
            k kVar2 = this.f360395b;
            M.l(i12, i13, kVar2.a());
            if (i12 == i13) {
                kVar = k.f360391e;
            } else {
                int i14 = kVar2.f360393c;
                kVar = new k(i12 + i14, i14 + i13, kVar2.f360392b);
            }
            return new b(kVar, null);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.f360395b.toString();
        }
    }

    /* compiled from: ImmutableLongArray.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public long[] f360396a;

        /* renamed from: b, reason: collision with root package name */
        public int f360397b;
    }

    public final int a() {
        return this.f360394d - this.f360393c;
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (a() != kVar.a()) {
            return false;
        }
        for (int i12 = 0; i12 < a(); i12++) {
            M.i(i12, a());
            long j12 = this.f360392b[this.f360393c + i12];
            M.i(i12, kVar.a());
            if (j12 != kVar.f360392b[kVar.f360393c + i12]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iB2 = 1;
        for (int i12 = this.f360393c; i12 < this.f360394d; i12++) {
            iB2 = (iB2 * 31) + n.b(this.f360392b[i12]);
        }
        return iB2;
    }

    public Object readResolve() {
        return this.f360394d == this.f360393c ? f360391e : this;
    }

    public final String toString() {
        int i12 = this.f360393c;
        int i13 = this.f360394d;
        if (i13 == i12) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(a() * 5);
        sb2.append('[');
        long[] jArr = this.f360392b;
        sb2.append(jArr[i12]);
        while (true) {
            i12++;
            if (i12 >= i13) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(jArr[i12]);
        }
    }

    public Object writeReplace() {
        int i12 = this.f360394d;
        long[] jArr = this.f360392b;
        int i13 = this.f360393c;
        if (i13 <= 0 && i12 >= jArr.length) {
            return this;
        }
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i13, i12);
        return new k(0, jArrCopyOfRange.length, jArrCopyOfRange);
    }

    public k(int i12, int i13, long[] jArr) {
        this.f360392b = jArr;
        this.f360393c = i12;
        this.f360394d = i13;
    }
}
