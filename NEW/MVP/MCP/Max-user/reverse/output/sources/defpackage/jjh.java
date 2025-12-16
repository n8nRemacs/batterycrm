package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jjh extends ulf {
    public ggg o;
    public int p;
    public boolean q;
    public kjh r;
    public znd s;

    @Override // defpackage.ulf
    public final void a(long j) {
        this.d = j;
        this.q = j != 0;
        kjh kjhVar = this.r;
        this.p = kjhVar != null ? kjhVar.e : 0;
    }

    @Override // defpackage.ulf
    public final long b(umb umbVar) {
        byte b = umbVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        ggg gggVar = this.o;
        hsi.h(gggVar);
        int i = gggVar.b;
        kjh kjhVar = (kjh) gggVar.d;
        int i2 = !((xn3[]) gggVar.c)[(b >> 1) & (255 >>> (8 - i))].b ? kjhVar.e : kjhVar.f;
        long j = this.q ? (this.p + i2) / 4 : 0;
        byte[] bArr = umbVar.a;
        int length = bArr.length;
        int i3 = umbVar.c + 4;
        if (length < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
            umbVar.H(bArrCopyOf.length, bArrCopyOf);
        } else {
            umbVar.I(i3);
        }
        byte[] bArr2 = umbVar.a;
        int i4 = umbVar.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.q = true;
        this.p = i2;
        return j;
    }

    @Override // defpackage.ulf
    public final boolean d(umb umbVar, long j, vhb vhbVar) throws ParserException {
        ggg gggVar;
        kjh kjhVar;
        long jFloor;
        if (this.o != null) {
            ((hf6) vhbVar.b).getClass();
            return false;
        }
        kjh kjhVar2 = this.r;
        int i = 4;
        if (kjhVar2 == null) {
            gri.h(1, umbVar, false);
            umbVar.p();
            int iX = umbVar.x();
            int iP = umbVar.p();
            int iL = umbVar.l();
            int i2 = iL <= 0 ? -1 : iL;
            int iL2 = umbVar.l();
            int i3 = iL2 <= 0 ? -1 : iL2;
            umbVar.l();
            int iX2 = umbVar.x();
            int iPow = (int) Math.pow(2.0d, iX2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iX2 & 240) >> 4);
            umbVar.x();
            this.r = new kjh(iX, iP, i2, i3, iPow, iPow2, Arrays.copyOf(umbVar.a, umbVar.c));
        } else {
            znd zndVar = this.s;
            if (zndVar == null) {
                this.s = gri.f(umbVar, true, true);
            } else {
                int i4 = umbVar.c;
                byte[] bArr = new byte[i4];
                System.arraycopy(umbVar.a, 0, bArr, 0, i4);
                int i5 = kjhVar2.a;
                int i6 = 5;
                gri.h(5, umbVar, false);
                int iX3 = umbVar.x() + 1;
                u62 u62Var = new u62(7, umbVar.a);
                int i7 = 8;
                u62Var.t(umbVar.b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = i7;
                    int i10 = 16;
                    if (i8 >= iX3) {
                        kjh kjhVar3 = kjhVar2;
                        int i11 = 6;
                        int i12 = u62Var.i(6) + 1;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (u62Var.i(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i14 = 1;
                        int i15 = u62Var.i(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 < i15) {
                                int i18 = u62Var.i(i10);
                                if (i18 == 0) {
                                    int i19 = i9;
                                    u62Var.t(i19);
                                    u62Var.t(16);
                                    u62Var.t(16);
                                    u62Var.t(6);
                                    u62Var.t(i19);
                                    int i20 = u62Var.i(4) + 1;
                                    int i21 = 0;
                                    while (i21 < i20) {
                                        u62Var.t(i19);
                                        i21++;
                                        i19 = 8;
                                    }
                                } else {
                                    if (i18 != i14) {
                                        throw ParserException.a(null, "floor type greater than 1 not decodable: " + i18);
                                    }
                                    int i22 = u62Var.i(5);
                                    int[] iArr = new int[i22];
                                    int i23 = -1;
                                    for (int i24 = 0; i24 < i22; i24++) {
                                        int i25 = u62Var.i(4);
                                        iArr[i24] = i25;
                                        if (i25 > i23) {
                                            i23 = i25;
                                        }
                                    }
                                    int i26 = i23 + 1;
                                    int[] iArr2 = new int[i26];
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        iArr2[i27] = u62Var.i(i17) + 1;
                                        int i28 = u62Var.i(2);
                                        int i29 = i9;
                                        if (i28 > 0) {
                                            u62Var.t(i29);
                                        }
                                        int i30 = i26;
                                        int i31 = 0;
                                        for (int i32 = 1; i31 < (i32 << i28); i32 = 1) {
                                            u62Var.t(i29);
                                            i31++;
                                            i29 = 8;
                                        }
                                        i27++;
                                        i26 = i30;
                                        i9 = 8;
                                        i17 = 3;
                                    }
                                    u62Var.t(2);
                                    int i33 = u62Var.i(4);
                                    int i34 = 0;
                                    int i35 = 0;
                                    for (int i36 = 0; i36 < i22; i36++) {
                                        i34 += iArr2[iArr[i36]];
                                        while (i35 < i34) {
                                            u62Var.t(i33);
                                            i35++;
                                        }
                                    }
                                }
                                i16++;
                                i9 = 8;
                                i11 = 6;
                                i10 = 16;
                                i14 = 1;
                            } else {
                                int i37 = u62Var.i(i11) + 1;
                                int i38 = 0;
                                while (i38 < i37) {
                                    if (u62Var.i(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    u62Var.t(24);
                                    u62Var.t(24);
                                    u62Var.t(24);
                                    int i39 = u62Var.i(i11) + 1;
                                    int i40 = 8;
                                    u62Var.t(8);
                                    int[] iArr3 = new int[i39];
                                    for (int i41 = 0; i41 < i39; i41++) {
                                        iArr3[i41] = ((u62Var.h() ? u62Var.i(5) : 0) * 8) + u62Var.i(3);
                                    }
                                    int i42 = 0;
                                    while (i42 < i39) {
                                        int i43 = 0;
                                        while (i43 < i40) {
                                            if ((iArr3[i42] & (1 << i43)) != 0) {
                                                u62Var.t(i40);
                                            }
                                            i43++;
                                            i40 = 8;
                                        }
                                        i42++;
                                        i40 = 8;
                                    }
                                    i38++;
                                    i11 = 6;
                                }
                                int i44 = u62Var.i(i11) + 1;
                                for (int i45 = 0; i45 < i44; i45++) {
                                    int i46 = u62Var.i(16);
                                    if (i46 != 0) {
                                        a8i.g("VorbisUtil", "mapping type other than 0 not supported: " + i46);
                                    } else {
                                        int i47 = u62Var.h() ? u62Var.i(4) + 1 : 1;
                                        if (u62Var.h()) {
                                            int i48 = u62Var.i(8) + 1;
                                            for (int i49 = 0; i49 < i48; i49++) {
                                                int i50 = i5 - 1;
                                                int i51 = 0;
                                                for (int i52 = i50; i52 > 0; i52 >>>= 1) {
                                                    i51++;
                                                }
                                                u62Var.t(i51);
                                                int i53 = 0;
                                                while (i50 > 0) {
                                                    i53++;
                                                    i50 >>>= 1;
                                                }
                                                u62Var.t(i53);
                                            }
                                        }
                                        if (u62Var.i(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i47 > 1) {
                                            for (int i54 = 0; i54 < i5; i54++) {
                                                u62Var.t(4);
                                            }
                                        }
                                        for (int i55 = 0; i55 < i47; i55++) {
                                            u62Var.t(8);
                                            u62Var.t(8);
                                            u62Var.t(8);
                                        }
                                    }
                                }
                                int i56 = u62Var.i(6);
                                int i57 = i56 + 1;
                                xn3[] xn3VarArr = new xn3[i57];
                                for (int i58 = 0; i58 < i57; i58++) {
                                    boolean zH = u62Var.h();
                                    u62Var.i(16);
                                    u62Var.i(16);
                                    u62Var.i(8);
                                    xn3VarArr[i58] = new xn3(zH, 12);
                                }
                                if (!u62Var.h()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i59 = 0;
                                while (i56 > 0) {
                                    i59++;
                                    i56 >>>= 1;
                                }
                                gggVar = new ggg(kjhVar3, zndVar, bArr, xn3VarArr, i59, 17);
                            }
                        }
                    } else {
                        if (u62Var.i(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((u62Var.c * 8) + u62Var.e));
                        }
                        int i60 = u62Var.i(16);
                        int i61 = u62Var.i(24);
                        if (u62Var.h()) {
                            u62Var.t(i6);
                            int i62 = 0;
                            while (i62 < i61) {
                                int i63 = 0;
                                for (int i64 = i61 - i62; i64 > 0; i64 >>>= 1) {
                                    i63++;
                                }
                                i62 += u62Var.i(i63);
                            }
                        } else {
                            boolean zH2 = u62Var.h();
                            for (int i65 = 0; i65 < i61; i65++) {
                                if (!zH2) {
                                    u62Var.t(i6);
                                } else if (u62Var.h()) {
                                    u62Var.t(i6);
                                }
                            }
                        }
                        int i66 = u62Var.i(i);
                        if (i66 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + i66);
                        }
                        if (i66 == 1 || i66 == 2) {
                            u62Var.t(32);
                            u62Var.t(32);
                            int i67 = u62Var.i(i) + 1;
                            u62Var.t(1);
                            if (i66 != 1) {
                                kjhVar = kjhVar2;
                                jFloor = i60 * i61;
                            } else if (i60 != 0) {
                                kjhVar = kjhVar2;
                                jFloor = (long) Math.floor(Math.pow(i61, 1.0d / i60));
                            } else {
                                kjhVar = kjhVar2;
                                jFloor = 0;
                            }
                            u62Var.t((int) (jFloor * i67));
                        } else {
                            kjhVar = kjhVar2;
                        }
                        i8++;
                        i7 = i9;
                        kjhVar2 = kjhVar;
                        i = 4;
                        i6 = 5;
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
        ty9 ty9VarE = gri.e(wg7.k((String[]) ((znd) gggVar.o).a));
        ff6 ff6Var = new ff6();
        ff6Var.l = xz9.n("audio/ogg");
        ff6Var.m = xz9.n("audio/vorbis");
        ff6Var.h = kjhVar4.d;
        ff6Var.i = kjhVar4.c;
        ff6Var.E = kjhVar4.a;
        ff6Var.F = kjhVar4.b;
        ff6Var.p = arrayList;
        ff6Var.k = ty9VarE;
        vhbVar.b = new hf6(ff6Var);
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
