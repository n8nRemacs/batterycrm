package com.google.common.primitives;

import com.google.common.base.AbstractC37266j;
import com.google.common.base.M;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Longs.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class n {

    /* compiled from: Longs.java */
    public static final class a {
        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i12 = 0; i12 < 10; i12++) {
                bArr[i12 + 48] = (byte) i12;
            }
            for (int i13 = 0; i13 < 26; i13++) {
                byte b12 = (byte) (i13 + 10);
                bArr[i13 + 65] = b12;
                bArr[i13 + 97] = b12;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Longs.java */
    public static final class b implements Comparator<long[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f360403b = {new b("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        b EF5;

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f360403b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int iMin = Math.min(jArr3.length, jArr4.length);
            for (int i12 = 0; i12 < iMin; i12++) {
                long j12 = jArr3[i12];
                long j13 = jArr4[i12];
                int i13 = j12 < j13 ? -1 : j12 > j13 ? 1 : 0;
                if (i13 != 0) {
                    return i13;
                }
            }
            return jArr3.length - jArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    /* compiled from: Longs.java */
    @XY0.b
    public static class c extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f360404b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360405c;

        public c(int i12, int i13) {
            this.f360404b = i12;
            this.f360405c = i13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            ((Long) obj).longValue();
            if (this.f360404b >= this.f360405c) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return super.equals(obj);
            }
            int size = size();
            if (((c) obj).size() != size) {
                return false;
            }
            if (size <= 0) {
                return true;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            M.i(i12, size());
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            if (this.f360404b >= this.f360405c) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            ((Long) obj).longValue();
            if (this.f360404b >= this.f360405c) {
                return -1;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            ((Long) obj).longValue();
            if (this.f360405c - 1 < this.f360404b) {
                return -1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i12, Object obj) {
            M.i(i12, size());
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f360405c - this.f360404b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Long> subList(int i12, int i13) {
            M.l(i12, i13, size());
            if (i12 == i13) {
                return Collections.emptyList();
            }
            int i14 = this.f360404b;
            return new c(i12 + i14, i14 + i13);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 10).append('[');
            throw null;
        }
    }

    /* compiled from: Longs.java */
    public static final class d extends AbstractC37266j<String, Long> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final d f360406b = new d();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f360406b;
        }

        @Override // com.google.common.base.AbstractC37266j
        public final Long b(String str) {
            return Long.decode(str);
        }

        public final String toString() {
            return "Longs.stringConverter()";
        }
    }

    public static long a(byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19) {
        return ((b13 & 255) << 48) | ((b12 & 255) << 56) | ((b14 & 255) << 40) | ((b15 & 255) << 32) | ((b16 & 255) << 24) | ((b17 & 255) << 16) | ((b18 & 255) << 8) | (b19 & 255);
    }

    public static int b(long j12) {
        return (int) (j12 ^ (j12 >>> 32));
    }

    public static long c(long... jArr) {
        M.g(jArr.length > 0);
        long j12 = jArr[0];
        for (int i12 = 1; i12 < jArr.length; i12++) {
            long j13 = jArr[i12];
            if (j13 > j12) {
                j12 = j13;
            }
        }
        return j12;
    }
}
