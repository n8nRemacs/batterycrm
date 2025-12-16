package defpackage;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class gt0 {
    public static final byte[] a;

    static {
        String str = zxg.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(umb umbVar) {
        int i = umbVar.b;
        umbVar.K(4);
        if (umbVar.j() != 1751411826) {
            i += 4;
        }
        umbVar.J(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x09af A[LOOP:18: B:495:0x09af->B:633:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0806 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:627:? A[LOOP:15: B:483:0x0976->B:627:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:629:? A[LOOP:16: B:487:0x0990->B:629:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:631:? A[LOOP:17: B:490:0x0998->B:631:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.umb r46, int r47, int r48, int r49, int r50, java.lang.String r51, boolean r52, defpackage.y45 r53, defpackage.ft0 r54, int r55) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 3160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt0.b(umb, int, int, int, int, java.lang.String, boolean, y45, ft0, int):void");
    }

    public static dt0 c(int i, umb umbVar) {
        umbVar.J(i + 12);
        umbVar.K(1);
        d(umbVar);
        umbVar.K(2);
        int iX = umbVar.x();
        if ((iX & 128) != 0) {
            umbVar.K(2);
        }
        if ((iX & 64) != 0) {
            umbVar.K(umbVar.x());
        }
        if ((iX & 32) != 0) {
            umbVar.K(2);
        }
        umbVar.K(1);
        d(umbVar);
        String strE = xz9.e(umbVar.x());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new dt0(strE, (byte[]) null, -1L, -1L);
        }
        umbVar.K(4);
        long jZ = umbVar.z();
        long jZ2 = umbVar.z();
        umbVar.K(1);
        int iD = d(umbVar);
        long j = jZ2;
        byte[] bArr = new byte[iD];
        umbVar.h(0, bArr, iD);
        if (j <= 0) {
            j = -1;
        }
        return new dt0(strE, bArr, j, jZ > 0 ? jZ : -1L);
    }

    public static int d(umb umbVar) {
        int iX = umbVar.x();
        int i = iX & 127;
        while ((iX & 128) == 128) {
            iX = umbVar.x();
            i = (i << 7) | (iX & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static ty9 f(p3a p3aVar) {
        ks8 ks8Var;
        q3a q3aVarX = p3aVar.x(1751411826);
        q3a q3aVarX2 = p3aVar.x(1801812339);
        q3a q3aVarX3 = p3aVar.x(1768715124);
        if (q3aVarX != null && q3aVarX2 != null && q3aVarX3 != null) {
            umb umbVar = q3aVarX.c;
            umbVar.J(16);
            if (umbVar.j() == 1835299937) {
                umb umbVar2 = q3aVarX2.c;
                umbVar2.J(12);
                int iJ = umbVar2.j();
                String[] strArr = new String[iJ];
                for (int i = 0; i < iJ; i++) {
                    int iJ2 = umbVar2.j();
                    umbVar2.K(4);
                    strArr[i] = umbVar2.v(iJ2 - 8, StandardCharsets.UTF_8);
                }
                umb umbVar3 = q3aVarX3.c;
                umbVar3.J(8);
                ArrayList arrayList = new ArrayList();
                while (umbVar3.a() > 8) {
                    int i2 = umbVar3.b;
                    int iJ3 = umbVar3.j();
                    int iJ4 = umbVar3.j() - 1;
                    if (iJ4 < 0 || iJ4 >= iJ) {
                        wy1.p(iJ4, "Skipped metadata with unknown key index: ", "BoxParsers");
                    } else {
                        String str = strArr[iJ4];
                        int i3 = i2 + iJ3;
                        while (true) {
                            int i4 = umbVar3.b;
                            if (i4 >= i3) {
                                ks8Var = null;
                                break;
                            }
                            int iJ5 = umbVar3.j();
                            if (umbVar3.j() == 1684108385) {
                                int iJ6 = umbVar3.j();
                                int iJ7 = umbVar3.j();
                                int i5 = iJ5 - 16;
                                byte[] bArr = new byte[i5];
                                umbVar3.h(0, bArr, i5);
                                ks8Var = new ks8(bArr, iJ7, iJ6, str);
                                break;
                            }
                            umbVar3.J(i4 + iJ5);
                        }
                        if (ks8Var != null) {
                            arrayList.add(ks8Var);
                        }
                    }
                    umbVar3.J(i2 + iJ3);
                }
                if (!arrayList.isEmpty()) {
                    return new ty9(arrayList);
                }
            }
        }
        return null;
    }

    public static y3a g(umb umbVar) {
        long jR;
        long jR2;
        umbVar.J(8);
        if (e(umbVar.j()) == 0) {
            jR = umbVar.z();
            jR2 = umbVar.z();
        } else {
            jR = umbVar.r();
            jR2 = umbVar.r();
        }
        return new y3a(jR, jR2, umbVar.z());
    }

    public static Pair h(umb umbVar, int i, int i2) throws ParserException {
        Integer num;
        ifg ifgVar;
        Pair pairCreate;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = umbVar.b;
        while (i5 - i < i2) {
            umbVar.J(i5);
            int iJ = umbVar.j();
            dbj.a("childAtomSize must be positive", iJ > 0);
            if (umbVar.j() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strV = null;
                while (i6 - i5 < iJ) {
                    umbVar.J(i6);
                    int iJ2 = umbVar.j();
                    int iJ3 = umbVar.j();
                    if (iJ3 == 1718775137) {
                        numValueOf = Integer.valueOf(umbVar.j());
                    } else if (iJ3 == 1935894637) {
                        umbVar.K(4);
                        strV = umbVar.v(4, StandardCharsets.UTF_8);
                    } else if (iJ3 == 1935894633) {
                        i8 = i6;
                        i7 = iJ2;
                    }
                    i6 += iJ2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strV) || "cbc1".equals(strV) || "cens".equals(strV) || "cbcs".equals(strV)) {
                    dbj.a("frma atom is mandatory", numValueOf != null);
                    dbj.a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = numValueOf;
                            ifgVar = null;
                            break;
                        }
                        umbVar.J(i9);
                        int iJ4 = umbVar.j();
                        if (umbVar.j() == 1952804451) {
                            int iE = e(umbVar.j());
                            umbVar.K(1);
                            if (iE == 0) {
                                umbVar.K(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iX = umbVar.x();
                                i3 = iX & 15;
                                i4 = (iX & 240) >> 4;
                            }
                            if (umbVar.x() == 1) {
                                num2 = numValueOf;
                                z = true;
                            } else {
                                num2 = numValueOf;
                                z = false;
                            }
                            int iX2 = umbVar.x();
                            byte[] bArr2 = new byte[16];
                            umbVar.h(0, bArr2, 16);
                            if (z && iX2 == 0) {
                                int iX3 = umbVar.x();
                                byte[] bArr3 = new byte[iX3];
                                umbVar.h(0, bArr3, iX3);
                                bArr = bArr3;
                            }
                            num = num2;
                            ifgVar = new ifg(z, strV, iX2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iJ4;
                        }
                    }
                    dbj.a("tenc atom is mandatory", ifgVar != null);
                    String str = zxg.a;
                    pairCreate = Pair.create(num, ifgVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iJ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0822  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ft0 i(defpackage.umb r69, defpackage.ye r70, java.lang.String r71, defpackage.y45 r72, boolean r73) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 3442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt0.i(umb, ye, java.lang.String, y45, boolean):ft0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        r23 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x061d A[ADDED_TO_REGION, LOOP:15: B:267:0x061d->B:271:0x0627, LOOP_START, PHI: r26
  0x061d: PHI (r26v3 int) = (r26v2 int), (r26v4 int) binds: [B:266:0x061b, B:271:0x0627] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x096c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x060a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList j(defpackage.p3a r54, defpackage.yq6 r55, long r56, defpackage.y45 r58, boolean r59, boolean r60, defpackage.om6 r61) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 2422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt0.j(p3a, yq6, long, y45, boolean, boolean, om6):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
    
        r9 = null;
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bb, code lost:
    
        r1.J(r15);
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c0, code lost:
    
        r16 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c5, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cc, code lost:
    
        if (r0 != 6516084) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ce, code lost:
    
        r9 = defpackage.uwi.c(r13, r1);
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d6, code lost:
    
        if (r0 == 7233901) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01db, code lost:
    
        if (r0 != 7631467) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e2, code lost:
    
        if (r0 == 6516589) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e7, code lost:
    
        if (r0 != 7828084) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ee, code lost:
    
        if (r0 != 6578553) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f0, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TDRC");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01fa, code lost:
    
        if (r0 != 4280916) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01fc, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TPE1");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0206, code lost:
    
        if (r0 != 7630703) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0208, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TSSE");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0212, code lost:
    
        if (r0 != 6384738) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0214, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TALB");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x021e, code lost:
    
        if (r0 != 7108978) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r1.J(r7);
        r7 = r7 + r13;
        r1.K(r0);
        r6 = new java.util.ArrayList();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0220, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "USLT");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x022a, code lost:
    
        if (r0 != 6776174) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x022c, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TCON");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0231, code lost:
    
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0234, code lost:
    
        if (r0 != 6779504) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0236, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TIT1");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x023e, code lost:
    
        defpackage.a8i.e("MetadataUtil", "Skipped unknown metadata entry: " + defpackage.oy.i(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0251, code lost:
    
        r1.J(r15);
        r9 = null;
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0256, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TCOM");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025e, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TIT2");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0266, code lost:
    
        if (r9 == null) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0268, code lost:
    
        r6.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x026b, code lost:
    
        r3 = r16;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0272, code lost:
    
        r1.J(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0275, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0276, code lost:
    
        r16 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x027c, code lost:
    
        if (r6.isEmpty() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x027e, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r13 >= r7) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0280, code lost:
    
        r12 = new defpackage.ty9(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r15 = r1.j() + r13;
        r13 = r1.j();
        r0 = (r13 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r0 == 169) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r0 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r16 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r13 != 1735291493) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        r0 = defpackage.oc7.a(defpackage.uwi.f(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        r9 = new defpackage.h4g("TCON", r12, defpackage.wg7.m(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        defpackage.a8i.l("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        r1.J(r15);
        r16 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (r13 != 1684632427) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        r9 = defpackage.uwi.e(r13, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        if (r13 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        r9 = defpackage.uwi.e(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        r9 = defpackage.uwi.g(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        r9 = defpackage.uwi.g(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        r9 = defpackage.uwi.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0126, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0128, code lost:
    
        r9 = defpackage.uwi.g(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0133, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0135, code lost:
    
        r9 = defpackage.uwi.g(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0140, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0142, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014d, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
    
        r9 = defpackage.uwi.h(r13, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015a, code lost:
    
        if (r13 != 757935405) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015c, code lost:
    
        r0 = r12;
        r8 = r0;
        r9 = -1;
        r10 = -1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0160, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0162, code lost:
    
        if (r13 >= r15) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0164, code lost:
    
        r14 = r1.j();
        r12 = r1.j();
        r16 = r3;
        r1.K(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0175, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0177, code lost:
    
        r0 = r1.t(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0181, code lost:
    
        if (r12 != 1851878757) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        r8 = r1.t(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018d, code lost:
    
        if (r12 != 1684108385) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018f, code lost:
    
        r9 = r13;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0191, code lost:
    
        r1.K(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0196, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019a, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019c, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019e, code lost:
    
        if (r8 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a1, code lost:
    
        if (r9 != (-1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a4, code lost:
    
        r1.J(r9);
        r1.K(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b7, code lost:
    
        r9 = new defpackage.hp7(r0, r8, r1.t(r10 - 16));
        r16 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ty9 k(defpackage.q3a r17) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt0.k(q3a):ty9");
    }
}
