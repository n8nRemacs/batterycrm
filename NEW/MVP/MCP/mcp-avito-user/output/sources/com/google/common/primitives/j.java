package com.google.common.primitives;

import com.google.common.base.M;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

/* compiled from: ImmutableIntArray.java */
@XY0.b
@f
@aZ0.j
/* loaded from: classes6.dex */
public final class j implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final j f360386e = new j(0, 0, new int[0]);

    /* renamed from: b, reason: collision with root package name */
    public final int[] f360387b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f360388c;

    /* renamed from: d, reason: collision with root package name */
    public final int f360389d;

    /* compiled from: ImmutableIntArray.java */
    public static class b extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final j f360390b;

        public b(j jVar, a aVar) {
            this.f360390b = jVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@I41.a Object obj) {
            boolean z12 = obj instanceof b;
            j jVar = this.f360390b;
            if (z12) {
                return jVar.equals(((b) obj).f360390b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (jVar.a() != list.size()) {
                return false;
            }
            int i12 = jVar.f360388c;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i13 = i12 + 1;
                    if (jVar.f360387b[i12] == ((Integer) obj2).intValue()) {
                        i12 = i13;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            j jVar = this.f360390b;
            M.i(i12, jVar.a());
            return Integer.valueOf(jVar.f360387b[jVar.f360388c + i12]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.f360390b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            int iIntValue = ((Integer) obj).intValue();
            j jVar = this.f360390b;
            int i12 = jVar.f360388c;
            for (int i13 = i12; i13 < jVar.f360389d; i13++) {
                if (jVar.f360387b[i13] == iIntValue) {
                    return i13 - i12;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            int i12;
            if (!(obj instanceof Integer)) {
                return -1;
            }
            int iIntValue = ((Integer) obj).intValue();
            j jVar = this.f360390b;
            int i13 = jVar.f360389d;
            do {
                i13--;
                i12 = jVar.f360388c;
                if (i13 < i12) {
                    return -1;
                }
            } while (jVar.f360387b[i13] != iIntValue);
            return i13 - i12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f360390b.a();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i12, int i13) {
            j jVar;
            j jVar2 = this.f360390b;
            M.l(i12, i13, jVar2.a());
            if (i12 == i13) {
                jVar = j.f360386e;
            } else {
                int i14 = jVar2.f360388c;
                jVar = new j(i12 + i14, i14 + i13, jVar2.f360387b);
            }
            return new b(jVar, null);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.f360390b.toString();
        }
    }

    /* compiled from: ImmutableIntArray.java */
    public static final class c {
    }

    public final int a() {
        return this.f360389d - this.f360388c;
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (a() != jVar.a()) {
            return false;
        }
        for (int i12 = 0; i12 < a(); i12++) {
            M.i(i12, a());
            int i13 = this.f360387b[this.f360388c + i12];
            M.i(i12, jVar.a());
            if (i13 != jVar.f360387b[jVar.f360388c + i12]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i12 = 1;
        for (int i13 = this.f360388c; i13 < this.f360389d; i13++) {
            i12 = (i12 * 31) + this.f360387b[i13];
        }
        return i12;
    }

    public Object readResolve() {
        return this.f360389d == this.f360388c ? f360386e : this;
    }

    public final String toString() {
        int i12 = this.f360388c;
        int i13 = this.f360389d;
        if (i13 == i12) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(a() * 5);
        sb2.append('[');
        int[] iArr = this.f360387b;
        sb2.append(iArr[i12]);
        while (true) {
            i12++;
            if (i12 >= i13) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i12]);
        }
    }

    public Object writeReplace() {
        int i12 = this.f360389d;
        int[] iArr = this.f360387b;
        int i13 = this.f360388c;
        if (i13 <= 0 && i12 >= iArr.length) {
            return this;
        }
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i13, i12);
        return new j(0, iArrCopyOfRange.length, iArrCopyOfRange);
    }

    public j(int i12, int i13, int[] iArr) {
        this.f360387b = iArr;
        this.f360388c = i12;
        this.f360389d = i13;
    }
}
