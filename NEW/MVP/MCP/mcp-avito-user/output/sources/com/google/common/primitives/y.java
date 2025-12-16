package com.google.common.primitives;

import java.math.BigInteger;
import java.util.Comparator;

/* compiled from: UnsignedLongs.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class y {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnsignedLongs.java */
    public static final class a implements Comparator<long[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f360424b = {new a("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360424b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int iMin = Math.min(jArr3.length, jArr4.length);
            for (int i12 = 0; i12 < iMin; i12++) {
                long j12 = jArr3[i12];
                long j13 = jArr4[i12];
                if (j12 != j13) {
                    return y.a(j12, j13);
                }
            }
            return jArr3.length - jArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    /* compiled from: UnsignedLongs.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final long[] f360425a = new long[37];

        /* renamed from: b, reason: collision with root package name */
        public static final int[] f360426b = new int[37];

        /* renamed from: c, reason: collision with root package name */
        public static final int[] f360427c = new int[37];

        static {
            long j12;
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i12 = 2; i12 <= 36; i12++) {
                long[] jArr = f360425a;
                long j13 = i12;
                long j14 = -1;
                if (j13 < 0) {
                    j12 = y.a(-1L, j13) < 0 ? 0L : 1L;
                } else {
                    long j15 = (Long.MAX_VALUE / j13) << 1;
                    j12 = j15 + (y.a((-1) - (j15 * j13), j13) >= 0 ? 1 : 0);
                }
                jArr[i12] = j12;
                int[] iArr = f360426b;
                if (j13 < 0) {
                    if (y.a(-1L, j13) < 0) {
                    }
                    iArr[i12] = (int) j14;
                    f360427c[i12] = bigInteger.toString(i12).length() - 1;
                } else {
                    j14 = (-1) - (((Long.MAX_VALUE / j13) << 1) * j13);
                    if (y.a(j14, j13) < 0) {
                        j13 = 0;
                    }
                }
                j14 -= j13;
                iArr[i12] = (int) j14;
                f360427c[i12] = bigInteger.toString(i12).length() - 1;
            }
        }
    }

    public static int a(long j12, long j13) {
        long j14 = j12 ^ Long.MIN_VALUE;
        long j15 = j13 ^ Long.MIN_VALUE;
        if (j14 < j15) {
            return -1;
        }
        return j14 > j15 ? 1 : 0;
    }
}
