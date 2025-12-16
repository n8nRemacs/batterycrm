package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class kc7 extends raj {
    public static final os5 b = new os5(20);
    public final hc7 a;

    public kc7(hc7 hc7Var) {
        this.a = hc7Var;
    }

    public static xm e(qyg qygVar, int i, int i2) {
        int iV;
        String strG;
        int iS = qygVar.s();
        String strS = s(iS);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        qygVar.e(0, bArr, i3);
        if (i2 == 2) {
            String strValueOf = String.valueOf(dsi.g(new String(bArr, 0, 3, "ISO-8859-1")));
            strG = strValueOf.length() != 0 ? "image/".concat(strValueOf) : new String("image/");
            if ("image/jpg".equals(strG)) {
                strG = "image/jpeg";
            }
            iV = 2;
        } else {
            iV = v(0, bArr);
            strG = dsi.g(new String(bArr, 0, iV, "ISO-8859-1"));
            if (strG.indexOf(47) == -1) {
                strG = strG.length() != 0 ? "image/".concat(strG) : new String("image/");
            }
        }
        int i4 = bArr[iV + 1] & 255;
        int i5 = iV + 2;
        int iU = u(i5, bArr, iS);
        String str = new String(bArr, i5, iU - i5, strS);
        int iR = r(iS) + iU;
        return new xm(strG, str, i4, i3 <= iR ? xxg.f : Arrays.copyOfRange(bArr, iR, i3));
    }

    public static qa2 f(qyg qygVar, int i, int i2, boolean z, int i3, hc7 hc7Var) throws Throwable {
        int i4 = qygVar.b;
        int iV = v(i4, qygVar.a);
        String str = new String(qygVar.a, i4, iV - i4, "ISO-8859-1");
        qygVar.E(iV + 1);
        int iF = qygVar.f();
        int iF2 = qygVar.f();
        long jT = qygVar.t();
        if (jT == 4294967295L) {
            jT = -1;
        }
        long jT2 = qygVar.t();
        long j = jT2 == 4294967295L ? -1L : jT2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (qygVar.b < i5) {
            mc7 mc7VarI = i(i2, qygVar, z, i3, hc7Var);
            if (mc7VarI != null) {
                arrayList.add(mc7VarI);
            }
        }
        return new qa2(str, iF, iF2, jT, j, (mc7[]) arrayList.toArray(new mc7[0]));
    }

    public static sa2 g(qyg qygVar, int i, int i2, boolean z, int i3, hc7 hc7Var) throws Throwable {
        int i4 = qygVar.b;
        int iV = v(i4, qygVar.a);
        String str = new String(qygVar.a, i4, iV - i4, "ISO-8859-1");
        qygVar.E(iV + 1);
        int iS = qygVar.s();
        boolean z2 = (iS & 2) != 0;
        boolean z3 = (iS & 1) != 0;
        int iS2 = qygVar.s();
        String[] strArr = new String[iS2];
        for (int i5 = 0; i5 < iS2; i5++) {
            int i6 = qygVar.b;
            int iV2 = v(i6, qygVar.a);
            strArr[i5] = new String(qygVar.a, i6, iV2 - i6, "ISO-8859-1");
            qygVar.E(iV2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (qygVar.b < i7) {
            mc7 mc7VarI = i(i2, qygVar, z, i3, hc7Var);
            if (mc7VarI != null) {
                arrayList.add(mc7VarI);
            }
        }
        return new sa2(str, z2, z3, strArr, (mc7[]) arrayList.toArray(new mc7[0]));
    }

    public static eg3 h(int i, qyg qygVar) {
        if (i < 4) {
            return null;
        }
        int iS = qygVar.s();
        String strS = s(iS);
        byte[] bArr = new byte[3];
        qygVar.e(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        qygVar.e(0, bArr2, i2);
        int iU = u(0, bArr2, iS);
        String str2 = new String(bArr2, 0, iU, strS);
        int iR = r(iS) + iU;
        return new eg3(str, str2, m(bArr2, iR, u(iR, bArr2, iS), strS));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020e A[Catch: all -> 0x01f9, UnsupportedEncodingException -> 0x024a, TryCatch #5 {all -> 0x01f9, blocks: (B:174:0x0220, B:177:0x024a, B:162:0x01f4, B:171:0x0209, B:172:0x020e), top: B:185:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0220 A[Catch: all -> 0x01f9, UnsupportedEncodingException -> 0x024a, TRY_LEAVE, TryCatch #5 {all -> 0x01f9, blocks: (B:174:0x0220, B:177:0x024a, B:162:0x01f4, B:171:0x0209, B:172:0x020e), top: B:185:0x0109 }] */
    /* JADX WARN: Type inference failed for: r1v12, types: [qyg] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [qyg] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mc7 i(int r19, defpackage.qyg r20, boolean r21, int r22, defpackage.hc7 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc7.i(int, qyg, boolean, int, hc7):mc7");
    }

    public static lr6 j(int i, qyg qygVar) {
        int iS = qygVar.s();
        String strS = s(iS);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        qygVar.e(0, bArr, i2);
        int iV = v(0, bArr);
        String str = new String(bArr, 0, iV, "ISO-8859-1");
        int i3 = iV + 1;
        int iU = u(i3, bArr, iS);
        String strM = m(bArr, i3, iU, strS);
        int iR = r(iS) + iU;
        int iU2 = u(iR, bArr, iS);
        String strM2 = m(bArr, iR, iU2, strS);
        int iR2 = r(iS) + iU2;
        return new lr6(str, i2 <= iR2 ? xxg.f : Arrays.copyOfRange(bArr, iR2, i2), strM, strM2);
    }

    public static q1a k(int i, qyg qygVar) {
        int iX = qygVar.x();
        int iU = qygVar.u();
        int iU2 = qygVar.u();
        int iS = qygVar.s();
        int iS2 = qygVar.s();
        u62 u62Var = new u62(2);
        u62Var.o(qygVar.c, qygVar.a);
        u62Var.q(qygVar.b * 8);
        int i2 = ((i - 10) * 8) / (iS + iS2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = u62Var.i(iS);
            int i5 = u62Var.i(iS2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new q1a(iX, iU, iU2, iArr, iArr2);
    }

    public static q9c l(int i, qyg qygVar) {
        byte[] bArr = new byte[i];
        qygVar.e(0, bArr, i);
        int iV = v(0, bArr);
        String str = new String(bArr, 0, iV, "ISO-8859-1");
        int i2 = iV + 1;
        return new q9c(str, i <= i2 ? xxg.f : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String m(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    public static g4g n(int i, qyg qygVar, String str) {
        if (i < 1) {
            return null;
        }
        int iS = qygVar.s();
        String strS = s(iS);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        qygVar.e(0, bArr, i2);
        return new g4g(str, null, new String(bArr, 0, u(0, bArr, iS), strS));
    }

    public static g4g o(int i, qyg qygVar) {
        if (i < 1) {
            return null;
        }
        int iS = qygVar.s();
        String strS = s(iS);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        qygVar.e(0, bArr, i2);
        int iU = u(0, bArr, iS);
        String str = new String(bArr, 0, iU, strS);
        int iR = r(iS) + iU;
        return new g4g("TXXX", str, m(bArr, iR, u(iR, bArr, iS), strS));
    }

    public static pwg p(int i, qyg qygVar, String str) {
        byte[] bArr = new byte[i];
        qygVar.e(0, bArr, i);
        return new pwg(str, null, new String(bArr, 0, v(0, bArr), "ISO-8859-1"));
    }

    public static pwg q(int i, qyg qygVar) {
        if (i < 1) {
            return null;
        }
        int iS = qygVar.s();
        String strS = s(iS);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        qygVar.e(0, bArr, i2);
        int iU = u(0, bArr, iS);
        String str = new String(bArr, 0, iU, strS);
        int iR = r(iS) + iU;
        return new pwg("WXXX", str, m(bArr, iR, v(iR, bArr), "ISO-8859-1"));
    }

    public static int r(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : HTTP.UTF_16;
    }

    public static String t(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int u(int i, byte[] bArr, int i2) {
        int iV = v(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iV;
        }
        while (iV < bArr.length - 1) {
            if ((iV - i) % 2 == 0 && bArr[iV + 1] == 0) {
                return iV;
            }
            iV = v(iV + 1, bArr);
        }
        return bArr.length;
    }

    public static int v(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int w(int i, qyg qygVar) {
        byte[] bArr = qygVar.a;
        int i2 = qygVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean x(defpackage.qyg r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r1.c()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.f()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.t()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.x()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.u()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.u()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.E(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.E(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.E(r2)
            return r6
        L99:
            int r3 = r1.c()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.E(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.F(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.E(r2)
            return r4
        Lb0:
            r1.E(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc7.x(qyg, int, int, boolean):boolean");
    }

    @Override // defpackage.raj
    public final sy9 b(xy9 xy9Var, ByteBuffer byteBuffer) {
        return d(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sy9 d(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc7.d(int, byte[]):sy9");
    }
}
