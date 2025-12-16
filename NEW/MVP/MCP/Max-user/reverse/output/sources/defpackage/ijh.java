package defpackage;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ijh extends ulf {
    public ggg o;
    public int p;
    public boolean q;
    public kjh r;
    public kme s;

    @Override // defpackage.ulf
    public final void a(long j) {
        this.d = j;
        this.q = j != 0;
        kjh kjhVar = this.r;
        this.p = kjhVar != null ? kjhVar.e : 0;
    }

    @Override // defpackage.ulf
    public final long c(qyg qygVar) {
        byte b = qygVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        ggg gggVar = this.o;
        fsi.e(gggVar);
        int i = gggVar.b;
        kjh kjhVar = (kjh) gggVar.d;
        int i2 = !((xn3[]) gggVar.c)[(b >> 1) & (255 >>> (8 - i))].b ? kjhVar.e : kjhVar.f;
        long j = this.q ? (this.p + i2) / 4 : 0;
        byte[] bArr = qygVar.a;
        int length = bArr.length;
        int i3 = qygVar.c + 4;
        if (length < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
            qygVar.C(bArrCopyOf.length, bArrCopyOf);
        } else {
            qygVar.D(i3);
        }
        byte[] bArr2 = qygVar.a;
        int i4 = qygVar.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.q = true;
        this.p = i2;
        return j;
    }

    @Override // defpackage.ulf
    public final boolean e(qyg qygVar, long j, enb enbVar) throws ParserException {
        ggg gggVar;
        int i;
        int i2;
        int i3;
        if (this.o != null) {
            ((gf6) enbVar.b).getClass();
            return false;
        }
        kjh kjhVar = this.r;
        int i4 = 1;
        if (kjhVar == null) {
            eri.g(1, qygVar, false);
            qygVar.k();
            int iS = qygVar.s();
            int iK = qygVar.k();
            int iH = qygVar.h();
            int i5 = iH <= 0 ? -1 : iH;
            int iH2 = qygVar.h();
            int i6 = iH2 <= 0 ? -1 : iH2;
            qygVar.h();
            int iS2 = qygVar.s();
            int iPow = (int) Math.pow(2.0d, iS2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iS2 & 240) >> 4);
            qygVar.s();
            this.r = new kjh(iS, iK, i5, i6, iPow, iPow2, Arrays.copyOf(qygVar.a, qygVar.c));
        } else {
            kme kmeVar = this.s;
            if (kmeVar == null) {
                this.s = eri.e(qygVar, true, true);
            } else {
                int i7 = qygVar.c;
                byte[] bArr = new byte[i7];
                System.arraycopy(qygVar.a, 0, bArr, 0, i7);
                int i8 = kjhVar.a;
                int i9 = 5;
                eri.g(5, qygVar, false);
                int iS3 = qygVar.s() + 1;
                u62 u62Var = new u62(6, qygVar.a);
                int i10 = 8;
                u62Var.t(qygVar.b * 8);
                int i11 = 0;
                while (true) {
                    int i12 = i10;
                    int i13 = 16;
                    if (i11 < iS3) {
                        int i14 = i4;
                        if (u62Var.i(24) != 5653314) {
                            int i15 = (u62Var.c * 8) + u62Var.e;
                            StringBuilder sb = new StringBuilder(66);
                            sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb.append(i15);
                            throw ParserException.a(null, sb.toString());
                        }
                        int i16 = u62Var.i(16);
                        int i17 = u62Var.i(24);
                        long[] jArr = new long[i17];
                        long jFloor = 0;
                        if (u62Var.h()) {
                            i = iS3;
                            int i18 = u62Var.i(i9) + 1;
                            int i19 = 0;
                            while (i19 < i17) {
                                int i20 = 0;
                                for (int i21 = i17 - i19; i21 > 0; i21 >>>= 1) {
                                    i20++;
                                }
                                int i22 = u62Var.i(i20);
                                int i23 = 0;
                                while (i23 < i22 && i19 < i17) {
                                    int i24 = i19;
                                    jArr[i24] = i18;
                                    i19 = i24 + 1;
                                    i23++;
                                    kjhVar = kjhVar;
                                }
                                i18++;
                                i19 = i19;
                                kjhVar = kjhVar;
                            }
                        } else {
                            boolean zH = u62Var.h();
                            int i25 = 0;
                            while (i25 < i17) {
                                if (zH) {
                                    if (u62Var.h()) {
                                        i3 = iS3;
                                        jArr[i25] = u62Var.i(i9) + 1;
                                    } else {
                                        i3 = iS3;
                                        jArr[i25] = 0;
                                    }
                                    i2 = 5;
                                } else {
                                    i2 = i9;
                                    i3 = iS3;
                                    jArr[i25] = u62Var.i(i2) + 1;
                                }
                                i25++;
                                i9 = i2;
                                iS3 = i3;
                            }
                            i = iS3;
                        }
                        kjh kjhVar2 = kjhVar;
                        int i26 = u62Var.i(4);
                        if (i26 > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("lookup type greater than 2 not decodable: ");
                            sb2.append(i26);
                            throw ParserException.a(null, sb2.toString());
                        }
                        if (i26 == i14 || i26 == 2) {
                            u62Var.t(32);
                            u62Var.t(32);
                            int i27 = u62Var.i(4) + i14;
                            u62Var.t(i14);
                            if (i26 != i14) {
                                jFloor = i17 * i16;
                            } else if (i16 != 0) {
                                jFloor = (long) Math.floor(Math.pow(i17, 1.0d / i16));
                            }
                            u62Var.t((int) (i27 * jFloor));
                        }
                        i11++;
                        i10 = i12;
                        iS3 = i;
                        kjhVar = kjhVar2;
                        i4 = 1;
                        i9 = 5;
                    } else {
                        kjh kjhVar3 = kjhVar;
                        int i28 = 6;
                        int i29 = u62Var.i(6) + 1;
                        for (int i30 = 0; i30 < i29; i30++) {
                            if (u62Var.i(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i31 = 1;
                        int i32 = u62Var.i(6) + 1;
                        int i33 = 0;
                        while (true) {
                            int i34 = 3;
                            if (i33 < i32) {
                                int i35 = u62Var.i(i13);
                                if (i35 == 0) {
                                    int i36 = i12;
                                    u62Var.t(i36);
                                    u62Var.t(16);
                                    u62Var.t(16);
                                    u62Var.t(6);
                                    u62Var.t(i36);
                                    int i37 = u62Var.i(4) + 1;
                                    int i38 = 0;
                                    while (i38 < i37) {
                                        u62Var.t(i36);
                                        i38++;
                                        i36 = 8;
                                    }
                                } else {
                                    if (i35 != i31) {
                                        StringBuilder sb3 = new StringBuilder(52);
                                        sb3.append("floor type greater than 1 not decodable: ");
                                        sb3.append(i35);
                                        throw ParserException.a(null, sb3.toString());
                                    }
                                    int i39 = u62Var.i(5);
                                    int[] iArr = new int[i39];
                                    int i40 = -1;
                                    for (int i41 = 0; i41 < i39; i41++) {
                                        int i42 = u62Var.i(4);
                                        iArr[i41] = i42;
                                        if (i42 > i40) {
                                            i40 = i42;
                                        }
                                    }
                                    int i43 = i40 + 1;
                                    int[] iArr2 = new int[i43];
                                    int i44 = 0;
                                    while (i44 < i43) {
                                        iArr2[i44] = u62Var.i(i34) + 1;
                                        int i45 = u62Var.i(2);
                                        int i46 = i12;
                                        if (i45 > 0) {
                                            u62Var.t(i46);
                                        }
                                        int i47 = 0;
                                        for (int i48 = 1; i47 < (i48 << i45); i48 = 1) {
                                            u62Var.t(i46);
                                            i47++;
                                            i46 = 8;
                                        }
                                        i44++;
                                        i12 = 8;
                                        i34 = 3;
                                    }
                                    u62Var.t(2);
                                    int i49 = u62Var.i(4);
                                    int i50 = 0;
                                    int i51 = 0;
                                    for (int i52 = 0; i52 < i39; i52++) {
                                        i50 += iArr2[iArr[i52]];
                                        while (i51 < i50) {
                                            u62Var.t(i49);
                                            i51++;
                                        }
                                    }
                                }
                                i33++;
                                i12 = 8;
                                i28 = 6;
                                i13 = 16;
                                i31 = 1;
                            } else {
                                int i53 = u62Var.i(i28) + 1;
                                int i54 = 0;
                                while (i54 < i53) {
                                    if (u62Var.i(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    u62Var.t(24);
                                    u62Var.t(24);
                                    u62Var.t(24);
                                    int i55 = u62Var.i(i28) + 1;
                                    int i56 = 8;
                                    u62Var.t(8);
                                    int[] iArr3 = new int[i55];
                                    for (int i57 = 0; i57 < i55; i57++) {
                                        iArr3[i57] = ((u62Var.h() ? u62Var.i(5) : 0) * 8) + u62Var.i(3);
                                    }
                                    int i58 = 0;
                                    while (i58 < i55) {
                                        int i59 = 0;
                                        while (i59 < i56) {
                                            if ((iArr3[i58] & (1 << i59)) != 0) {
                                                u62Var.t(i56);
                                            }
                                            i59++;
                                            i56 = 8;
                                        }
                                        i58++;
                                        i56 = 8;
                                    }
                                    i54++;
                                    i28 = 6;
                                }
                                int i60 = u62Var.i(i28) + 1;
                                for (int i61 = 0; i61 < i60; i61++) {
                                    int i62 = u62Var.i(16);
                                    if (i62 != 0) {
                                        StringBuilder sb4 = new StringBuilder(52);
                                        sb4.append("mapping type other than 0 not supported: ");
                                        sb4.append(i62);
                                        Log.e("VorbisUtil", sb4.toString());
                                    } else {
                                        int i63 = u62Var.h() ? u62Var.i(4) + 1 : 1;
                                        if (u62Var.h()) {
                                            int i64 = u62Var.i(8) + 1;
                                            for (int i65 = 0; i65 < i64; i65++) {
                                                int i66 = i8 - 1;
                                                int i67 = 0;
                                                for (int i68 = i66; i68 > 0; i68 >>>= 1) {
                                                    i67++;
                                                }
                                                u62Var.t(i67);
                                                int i69 = 0;
                                                while (i66 > 0) {
                                                    i69++;
                                                    i66 >>>= 1;
                                                }
                                                u62Var.t(i69);
                                            }
                                        }
                                        if (u62Var.i(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i63 > 1) {
                                            for (int i70 = 0; i70 < i8; i70++) {
                                                u62Var.t(4);
                                            }
                                        }
                                        for (int i71 = 0; i71 < i63; i71++) {
                                            u62Var.t(8);
                                            u62Var.t(8);
                                            u62Var.t(8);
                                        }
                                    }
                                }
                                int i72 = u62Var.i(6);
                                int i73 = i72 + 1;
                                xn3[] xn3VarArr = new xn3[i73];
                                for (int i74 = 0; i74 < i73; i74++) {
                                    boolean zH2 = u62Var.h();
                                    u62Var.i(16);
                                    u62Var.i(16);
                                    u62Var.i(8);
                                    xn3VarArr[i74] = new xn3(zH2, 11);
                                }
                                if (!u62Var.h()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i75 = 0;
                                while (i72 > 0) {
                                    i75++;
                                    i72 >>>= 1;
                                }
                                gggVar = new ggg(kjhVar3, kmeVar, bArr, xn3VarArr, i75, 16);
                            }
                        }
                    }
                }
            }
        }
        gggVar = null;
        this.o = gggVar;
        if (gggVar == null) {
            return true;
        }
        kjh kjhVar4 = (kjh) gggVar.d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(kjhVar4.g);
        arrayList.add((byte[]) gggVar.X);
        sy9 sy9VarD = eri.d(wg7.k((String[]) ((kme) gggVar.o).b));
        ef6 ef6Var = new ef6();
        ef6Var.k = "audio/vorbis";
        ef6Var.f = kjhVar4.d;
        ef6Var.g = kjhVar4.c;
        ef6Var.x = kjhVar4.a;
        ef6Var.y = kjhVar4.b;
        ef6Var.m = arrayList;
        ef6Var.i = sy9VarD;
        enbVar.b = new gf6(ef6Var);
        return true;
    }

    @Override // defpackage.ulf
    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = null;
            this.r = null;
            this.s = null;
        }
        this.p = 0;
        this.q = false;
    }
}
