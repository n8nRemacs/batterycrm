package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class lc7 extends saj {
    public static final os5 b = new os5(21);
    public final ic7 a;

    public lc7(ic7 ic7Var) {
        this.a = ic7Var;
    }

    public static ym f(umb umbVar, int i, int i2) {
        int iX;
        String strConcat;
        int iX2 = umbVar.x();
        Charset charsetU = u(iX2);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        umbVar.h(0, bArr, i3);
        if (i2 == 2) {
            strConcat = "image/" + dsi.g(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iX = 2;
        } else {
            iX = x(0, bArr);
            String strG = dsi.g(new String(bArr, 0, iX, StandardCharsets.ISO_8859_1));
            strConcat = strG.indexOf(47) == -1 ? "image/".concat(strG) : strG;
        }
        int i4 = bArr[iX + 1] & 255;
        int i5 = iX + 2;
        int iW = w(i5, bArr, iX2);
        String str = new String(bArr, i5, iW - i5, charsetU);
        int iT = t(iX2) + iW;
        return new ym(strConcat, str, i4, i3 <= iT ? zxg.b : Arrays.copyOfRange(bArr, iT, i3));
    }

    public static ra2 g(umb umbVar, int i, int i2, boolean z, int i3, ic7 ic7Var) throws Throwable {
        int i4 = umbVar.b;
        int iX = x(i4, umbVar.a);
        String str = new String(umbVar.a, i4, iX - i4, StandardCharsets.ISO_8859_1);
        umbVar.J(iX + 1);
        int iJ = umbVar.j();
        int iJ2 = umbVar.j();
        long jZ = umbVar.z();
        if (jZ == 4294967295L) {
            jZ = -1;
        }
        long jZ2 = umbVar.z();
        long j = jZ2 == 4294967295L ? -1L : jZ2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (umbVar.b < i5) {
            nc7 nc7VarJ = j(i2, umbVar, z, i3, ic7Var);
            if (nc7VarJ != null) {
                arrayList.add(nc7VarJ);
            }
        }
        return new ra2(str, iJ, iJ2, jZ, j, (nc7[]) arrayList.toArray(new nc7[0]));
    }

    public static ta2 h(umb umbVar, int i, int i2, boolean z, int i3, ic7 ic7Var) throws Throwable {
        int i4 = umbVar.b;
        int iX = x(i4, umbVar.a);
        String str = new String(umbVar.a, i4, iX - i4, StandardCharsets.ISO_8859_1);
        umbVar.J(iX + 1);
        int iX2 = umbVar.x();
        boolean z2 = (iX2 & 2) != 0;
        boolean z3 = (iX2 & 1) != 0;
        int iX3 = umbVar.x();
        String[] strArr = new String[iX3];
        for (int i5 = 0; i5 < iX3; i5++) {
            int i6 = umbVar.b;
            int iX4 = x(i6, umbVar.a);
            strArr[i5] = new String(umbVar.a, i6, iX4 - i6, StandardCharsets.ISO_8859_1);
            umbVar.J(iX4 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (umbVar.b < i7) {
            nc7 nc7VarJ = j(i2, umbVar, z, i3, ic7Var);
            if (nc7VarJ != null) {
                arrayList.add(nc7VarJ);
            }
        }
        return new ta2(str, z2, z3, strArr, (nc7[]) arrayList.toArray(new nc7[0]));
    }

    public static fg3 i(int i, umb umbVar) {
        if (i < 4) {
            return null;
        }
        int iX = umbVar.x();
        Charset charsetU = u(iX);
        byte[] bArr = new byte[3];
        umbVar.h(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        umbVar.h(0, bArr2, i2);
        int iW = w(0, bArr2, iX);
        String str2 = new String(bArr2, 0, iW, charsetU);
        int iT = t(iX) + iW;
        return new fg3(str, str2, n(bArr2, iT, w(iT, bArr2, iX), charsetU));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [nc7] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [umb] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.nc7 j(int r19, defpackage.umb r20, boolean r21, int r22, defpackage.ic7 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc7.j(int, umb, boolean, int, ic7):nc7");
    }

    public static mr6 k(int i, umb umbVar) {
        int iX = umbVar.x();
        Charset charsetU = u(iX);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        umbVar.h(0, bArr, i2);
        int iX2 = x(0, bArr);
        String strN = xz9.n(new String(bArr, 0, iX2, StandardCharsets.ISO_8859_1));
        int i3 = iX2 + 1;
        int iW = w(i3, bArr, iX);
        String strN2 = n(bArr, i3, iW, charsetU);
        int iT = t(iX) + iW;
        int iW2 = w(iT, bArr, iX);
        String strN3 = n(bArr, iT, iW2, charsetU);
        int iT2 = t(iX) + iW2;
        return new mr6(strN, i2 <= iT2 ? zxg.b : Arrays.copyOfRange(bArr, iT2, i2), strN2, strN3);
    }

    public static r1a l(int i, umb umbVar) {
        int iD = umbVar.D();
        int iA = umbVar.A();
        int iA2 = umbVar.A();
        int iX = umbVar.x();
        int iX2 = umbVar.x();
        u62 u62Var = new u62(3);
        u62Var.p(umbVar);
        int i2 = ((i - 10) * 8) / (iX + iX2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = u62Var.i(iX);
            int i5 = u62Var.i(iX2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new r1a(iD, iA, iA2, iArr, iArr2);
    }

    public static r9c m(int i, umb umbVar) {
        byte[] bArr = new byte[i];
        umbVar.h(0, bArr, i);
        int iX = x(0, bArr);
        String str = new String(bArr, 0, iX, StandardCharsets.ISO_8859_1);
        int i2 = iX + 1;
        return new r9c(str, i <= i2 ? zxg.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String n(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static h4g o(int i, umb umbVar, String str) {
        if (i < 1) {
            return null;
        }
        int iX = umbVar.x();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        umbVar.h(0, bArr, i2);
        return new h4g(str, null, p(iX, bArr, 0));
    }

    public static zjd p(int i, byte[] bArr, int i2) {
        if (i2 >= bArr.length) {
            return wg7.m("");
        }
        tg7 tg7VarI = wg7.i();
        int iW = w(i2, bArr, i);
        while (i2 < iW) {
            tg7VarI.a(new String(bArr, i2, iW - i2, u(i)));
            i2 = t(i) + iW;
            iW = w(i2, bArr, i);
        }
        zjd zjdVarI = tg7VarI.i();
        return zjdVarI.isEmpty() ? wg7.m("") : zjdVarI;
    }

    public static h4g q(int i, umb umbVar) {
        if (i < 1) {
            return null;
        }
        int iX = umbVar.x();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        umbVar.h(0, bArr, i2);
        int iW = w(0, bArr, iX);
        return new h4g("TXXX", new String(bArr, 0, iW, u(iX)), p(iX, bArr, t(iX) + iW));
    }

    public static qwg r(int i, umb umbVar, String str) {
        byte[] bArr = new byte[i];
        umbVar.h(0, bArr, i);
        return new qwg(str, null, new String(bArr, 0, x(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static qwg s(int i, umb umbVar) {
        if (i < 1) {
            return null;
        }
        int iX = umbVar.x();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        umbVar.h(0, bArr, i2);
        int iW = w(0, bArr, iX);
        String str = new String(bArr, 0, iW, u(iX));
        int iT = t(iX) + iW;
        return new qwg("WXXX", str, n(bArr, iT, x(iT, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int t(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String v(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int w(int i, byte[] bArr, int i2) {
        int iX = x(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iX;
        }
        while (iX < bArr.length - 1) {
            if ((iX - i) % 2 == 0 && bArr[iX + 1] == 0) {
                return iX;
            }
            iX = x(iX + 1, bArr);
        }
        return bArr.length;
    }

    public static int x(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int y(int i, umb umbVar) {
        byte[] bArr = umbVar.a;
        int i2 = umbVar.b;
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
    public static boolean z(defpackage.umb r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.j()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.z()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.D()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.A()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.A()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.J(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.J(r2)
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
            r1.J(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.J(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.K(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.J(r2)
            return r4
        Lb0:
            r1.J(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc7.z(umb, int, int, boolean):boolean");
    }

    @Override // defpackage.saj
    public final ty9 c(yy9 yy9Var, ByteBuffer byteBuffer) {
        return e(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ty9 e(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc7.e(int, byte[]):ty9");
    }
}
