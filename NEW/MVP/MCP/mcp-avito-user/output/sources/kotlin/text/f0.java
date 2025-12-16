package kotlin.text;

import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;
import kotlin.s0;
import kotlin.w0;

/* compiled from: UStrings.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes8.dex */
public final class f0 {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @kotlin.K0
    @kotlin.InterfaceC42733c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte a(@Y61.k java.lang.String r3) {
        /*
            kotlin.s0 r0 = c(r3)
            r1 = 0
            if (r0 == 0) goto L11
            r2 = 255(0xff, float:3.57E-43)
            int r0 = r0.f410476b
            int r2 = java.lang.Integer.compareUnsigned(r0, r2)
            if (r2 <= 0) goto L13
        L11:
            r0 = r1
            goto L18
        L13:
            byte r0 = (byte) r0
            kotlin.o0 r0 = kotlin.o0.a(r0)
        L18:
            if (r0 == 0) goto L1d
            byte r3 = r0.f406875b
            return r3
        L1d:
            kotlin.text.I.a(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.f0.a(java.lang.String):byte");
    }

    @K0
    @InterfaceC42733c0
    public static final int b(@Y61.k String str) {
        s0 s0VarC = c(str);
        if (s0VarC != null) {
            return s0VarC.f410476b;
        }
        I.a(str);
        throw null;
    }

    @Y61.l
    @K0
    @InterfaceC42733c0
    public static final s0 c(@Y61.k String str) {
        int i12;
        C43044a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.L.g(cCharAt, 48) >= 0) {
            i12 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i12 = 1;
        }
        int i14 = s0.f410475c;
        int iDivideUnsigned = 119304647;
        while (i12 < length) {
            int iDigit = Character.digit((int) str.charAt(i12), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i13, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                    if (Integer.compareUnsigned(i13, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int i15 = i13 * 10;
            int i16 = iDigit + i15;
            if (Integer.compareUnsigned(i16, i15) < 0) {
                return null;
            }
            i12++;
            i13 = i16;
        }
        return s0.a(i13);
    }

    @K0
    @InterfaceC42733c0
    public static final long d(@Y61.k String str) {
        w0 w0VarE = e(str);
        if (w0VarE != null) {
            return w0VarE.f410663b;
        }
        I.a(str);
        throw null;
    }

    @Y61.l
    @K0
    @InterfaceC42733c0
    public static final w0 e(@Y61.k String str) {
        C43044a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.L.g(cCharAt, 48) < 0) {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i12 = 1;
        }
        long j12 = 10;
        int i13 = w0.f410662c;
        long j13 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i12 < length) {
            int iDigit = Character.digit((int) str.charAt(i12), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j13, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j12);
                if (Long.compareUnsigned(j13, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j14 = j13 * j12;
            int i14 = s0.f410475c;
            long j15 = (iDigit & 4294967295L) + j14;
            if (Long.compareUnsigned(j15, j14) < 0) {
                return null;
            }
            i12++;
            j13 = j15;
        }
        return w0.a(j13);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @kotlin.K0
    @kotlin.InterfaceC42733c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final short f(@Y61.k java.lang.String r3) {
        /*
            kotlin.s0 r0 = c(r3)
            r1 = 0
            if (r0 == 0) goto L12
            r2 = 65535(0xffff, float:9.1834E-41)
            int r0 = r0.f410476b
            int r2 = java.lang.Integer.compareUnsigned(r0, r2)
            if (r2 <= 0) goto L14
        L12:
            r0 = r1
            goto L19
        L14:
            short r0 = (short) r0
            kotlin.C0 r0 = kotlin.C0.a(r0)
        L19:
            if (r0 == 0) goto L1e
            short r3 = r0.f406603b
            return r3
        L1e:
            kotlin.text.I.a(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.f0.f(java.lang.String):short");
    }
}
