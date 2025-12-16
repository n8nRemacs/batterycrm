package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;

/* loaded from: classes.dex */
public abstract class sy {
    public static final byte[] a;

    static {
        int i = xxg.a;
        a = "OpusHead".getBytes(mb2.c);
    }

    public static Pair a(int i, qyg qygVar) {
        qygVar.E(i + 12);
        qygVar.F(1);
        b(qygVar);
        qygVar.F(2);
        int iS = qygVar.s();
        if ((iS & 128) != 0) {
            qygVar.F(2);
        }
        if ((iS & 64) != 0) {
            qygVar.F(qygVar.x());
        }
        if ((iS & 32) != 0) {
            qygVar.F(2);
        }
        qygVar.F(1);
        b(qygVar);
        String strD = wz9.d(qygVar.s());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return Pair.create(strD, null);
        }
        qygVar.F(12);
        qygVar.F(1);
        int iB = b(qygVar);
        byte[] bArr = new byte[iB];
        qygVar.e(0, bArr, iB);
        return Pair.create(strD, bArr);
    }

    public static int b(qyg qygVar) {
        int iS = qygVar.s();
        int i = iS & 127;
        while ((iS & 128) == 128) {
            iS = qygVar.s();
            i = (i << 7) | (iS & 127);
        }
        return i;
    }

    public static Pair c(qyg qygVar, int i, int i2) throws ParserException {
        Integer num;
        hfg hfgVar;
        Pair pairCreate;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = qygVar.b;
        while (i5 - i < i2) {
            qygVar.E(i5);
            int iF = qygVar.f();
            cbj.a("childAtomSize must be positive", iF > 0);
            if (qygVar.f() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strQ = null;
                while (i6 - i5 < iF) {
                    qygVar.E(i6);
                    int iF2 = qygVar.f();
                    int iF3 = qygVar.f();
                    if (iF3 == 1718775137) {
                        numValueOf = Integer.valueOf(qygVar.f());
                    } else if (iF3 == 1935894637) {
                        qygVar.F(4);
                        strQ = qygVar.q(4, mb2.c);
                    } else if (iF3 == 1935894633) {
                        i8 = i6;
                        i7 = iF2;
                    }
                    i6 += iF2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strQ) || "cbc1".equals(strQ) || "cens".equals(strQ) || "cbcs".equals(strQ)) {
                    cbj.a("frma atom is mandatory", numValueOf != null);
                    cbj.a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = numValueOf;
                            hfgVar = null;
                            break;
                        }
                        qygVar.E(i9);
                        int iF4 = qygVar.f();
                        if (qygVar.f() == 1952804451) {
                            int iV = oy.v(qygVar.f());
                            qygVar.F(1);
                            if (iV == 0) {
                                qygVar.F(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iS = qygVar.s();
                                i3 = iS & 15;
                                i4 = (iS & 240) >> 4;
                            }
                            if (qygVar.s() == 1) {
                                num2 = numValueOf;
                                z = true;
                            } else {
                                num2 = numValueOf;
                                z = false;
                            }
                            int iS2 = qygVar.s();
                            byte[] bArr2 = new byte[16];
                            qygVar.e(0, bArr2, 16);
                            if (z && iS2 == 0) {
                                int iS3 = qygVar.s();
                                byte[] bArr3 = new byte[iS3];
                                qygVar.e(0, bArr3, iS3);
                                bArr = bArr3;
                            }
                            num = num2;
                            hfgVar = new hfg(z, strQ, iS2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iF4;
                        }
                    }
                    cbj.a("tenc atom is mandatory", hfgVar != null);
                    int i10 = xxg.a;
                    pairCreate = Pair.create(num, hfgVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iF;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028f A[ADDED_TO_REGION, LOOP:12: B:99:0x028f->B:103:0x029a, LOOP_START, PHI: r17
  0x028f: PHI (r17v4 int) = (r17v3 int), (r17v5 int) binds: [B:98:0x028d, B:103:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.tfg d(defpackage.dfg r42, defpackage.my r43, defpackage.xq6 r44) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy.d(dfg, my, xq6):tfg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e0, code lost:
    
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0879 A[PHI: r1
  0x0879: PHI (r1v22 java.lang.String) = (r1v18 java.lang.String), (r1v24 java.lang.String) binds: [B:417:0x0845, B:419:0x0853] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0d06  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0d7a  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0d82  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0d86  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList e(defpackage.my r71, defpackage.xq6 r72, long r73, defpackage.x45 r75, boolean r76, boolean r77, defpackage.om6 r78) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 3556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy.e(my, xq6, long, x45, boolean, boolean, om6):java.util.ArrayList");
    }
}
