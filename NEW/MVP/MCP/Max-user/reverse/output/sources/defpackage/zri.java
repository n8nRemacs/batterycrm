package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class zri {
    public static final xs a(Object... objArr) {
        xs xsVar = new xs(objArr.length);
        for (Object obj : objArr) {
            xsVar.add(obj);
        }
        return xsVar;
    }

    public static long b(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(ho7.k(az1.l(j, "overflow: checkedAdd(", ", "), j2, ")"));
    }

    public static boolean c(String str, byte[] bArr) {
        if (bArr.length == str.length()) {
            Iterable to7Var = new to7(0, bArr.length - 1, 1);
            if (!(to7Var instanceof Collection) || !((Collection) to7Var).isEmpty()) {
                Iterator it = to7Var.iterator();
                while (((so7) it).c) {
                    int iNextInt = ((so7) it).nextInt();
                    if (((byte) str.charAt(iNextInt)) != bArr[iNextInt]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long d(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L53
        L10:
            long r8 = r8 ^ r10
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r8 = r8 | 1
            int[] r9 = defpackage.xj8.a
            int r7 = r12.ordinal()
            r9 = r9[r7]
            switch(r9) {
                case 1: goto L51;
                case 2: goto L53;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L53
            r9 = 1
            long r9 = r9 & r0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L53
            goto L4e
        L46:
            if (r9 <= 0) goto L53
            goto L4e
        L49:
            if (r8 <= 0) goto L53
            goto L4e
        L4c:
            if (r8 >= 0) goto L53
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            if (r6 != 0) goto L54
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "mode was UNNECESSARY, but rounding was necessary"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zri.d(long, long, java.math.RoundingMode):long");
    }

    public static long e(long j, long j2) {
        sti.a(j, "a");
        sti.a(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static void f(InputStream inputStream) throws IOException {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static imb g(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int i = inputStream.read() & 255;
        int i2 = inputStream.read() & 255;
        int i3 = inputStream.read() & 255;
        if (i != 157 || i2 != 1 || i3 != 42) {
            return null;
        }
        return new imb(Integer.valueOf((inputStream.read() & 255) | ((inputStream.read() & 255) << 8)), Integer.valueOf(((inputStream.read() & 255) << 8) | (inputStream.read() & 255)));
    }

    public static imb h(InputStream inputStream) throws IOException {
        f(inputStream);
        if ((inputStream.read() & 255) != 47) {
            return null;
        }
        int i = inputStream.read() & 255;
        int i2 = inputStream.read();
        return new imb(Integer.valueOf((i | ((i2 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((i2 & 192) >> 6)) + 1));
    }

    public static final int i(xs xsVar, Object obj, int i) {
        int i2 = xsVar.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iB = zk6.b(i2, i, xsVar.a);
            if (iB < 0 || fni.a(obj, xsVar.b[iB])) {
                return iB;
            }
            int i3 = iB + 1;
            while (i3 < i2 && xsVar.a[i3] == i) {
                if (fni.a(obj, xsVar.b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iB - 1; i4 >= 0 && xsVar.a[i4] == i; i4--) {
                if (fni.a(obj, xsVar.b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static long j(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + BuildConfig.MAX_TIME_TO_UPLOAD;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }
}
