package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e71;
import com.yandex.mobile.ads.impl.vw;
import com.yandex.mobile.ads.impl.zk1;
import java.util.ArrayList;
import java.util.Arrays;
import v61.InterfaceC49174e;

/* loaded from: classes8.dex */
final class xk1 extends e71 {

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private a f391750n;

    /* renamed from: o, reason: collision with root package name */
    private int f391751o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f391752p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    private zk1.c f391753q;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    private zk1.a f391754r;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final zk1.c f391755a;

        /* renamed from: b, reason: collision with root package name */
        public final zk1.a f391756b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f391757c;

        /* renamed from: d, reason: collision with root package name */
        public final zk1.b[] f391758d;

        /* renamed from: e, reason: collision with root package name */
        public final int f391759e;

        public a(zk1.c cVar, zk1.a aVar, byte[] bArr, zk1.b[] bVarArr, int i12) {
            this.f391755a = cVar;
            this.f391756b = aVar;
            this.f391757c = bArr;
            this.f391758d = bVarArr;
            this.f391759e = i12;
        }
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final void a(boolean z12) {
        super.a(z12);
        if (z12) {
            this.f391750n = null;
            this.f391753q = null;
            this.f391754r = null;
        }
        this.f391751o = 0;
        this.f391752p = false;
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final void c(long j12) {
        super.c(j12);
        this.f391752p = j12 != 0;
        zk1.c cVar = this.f391753q;
        this.f391751o = cVar != null ? cVar.f392283e : 0;
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final long a(pr0 pr0Var) {
        int i12;
        if ((pr0Var.c()[0] & 1) == 1) {
            return -1L;
        }
        byte b12 = pr0Var.c()[0];
        a aVar = (a) db.b(this.f391750n);
        if (!aVar.f391758d[(b12 >> 1) & (255 >>> (8 - aVar.f391759e))].f392278a) {
            i12 = aVar.f391755a.f392283e;
        } else {
            i12 = aVar.f391755a.f392284f;
        }
        long j12 = this.f391752p ? (this.f391751o + i12) / 4 : 0;
        if (pr0Var.b() < pr0Var.e() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(pr0Var.c(), pr0Var.e() + 4);
            pr0Var.a(bArrCopyOf.length, bArrCopyOf);
        } else {
            pr0Var.d(pr0Var.e() + 4);
        }
        byte[] bArrC = pr0Var.c();
        bArrC[pr0Var.e() - 4] = (byte) (j12 & 255);
        bArrC[pr0Var.e() - 3] = (byte) ((j12 >>> 8) & 255);
        bArrC[pr0Var.e() - 2] = (byte) ((j12 >>> 16) & 255);
        bArrC[pr0Var.e() - 1] = (byte) ((j12 >>> 24) & 255);
        this.f391752p = true;
        this.f391751o = i12;
        return j12;
    }

    @Override // com.yandex.mobile.ads.impl.e71
    @InterfaceC49174e
    public final boolean a(pr0 pr0Var, long j12, e71.a aVar) throws tr0 {
        a aVar2;
        int i12;
        wk1 wk1Var;
        wk1 wk1Var2;
        boolean z12;
        int i13;
        wk1 wk1Var3;
        if (this.f391750n != null) {
            aVar.f384810a.getClass();
            return false;
        }
        zk1.c cVar = this.f391753q;
        boolean z13 = true;
        if (cVar == null) {
            this.f391753q = zk1.a(pr0Var);
        } else {
            zk1.a aVar3 = this.f391754r;
            if (aVar3 == null) {
                this.f391754r = zk1.a(pr0Var, true, true);
            } else {
                byte[] bArr = new byte[pr0Var.e()];
                System.arraycopy(pr0Var.c(), 0, bArr, 0, pr0Var.e());
                int i14 = cVar.f392279a;
                int i15 = 5;
                zk1.a(5, pr0Var, false);
                int iT2 = pr0Var.t() + 1;
                wk1 wk1Var4 = new wk1(pr0Var.c());
                wk1Var4.b(pr0Var.d() * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 16;
                    if (i16 < iT2) {
                        if (wk1Var4.a(24) == 5653314) {
                            int iA2 = wk1Var4.a(16);
                            int iA3 = wk1Var4.a(24);
                            long[] jArr = new long[iA3];
                            long jFloor = 0;
                            if (!wk1Var4.b()) {
                                boolean zB2 = wk1Var4.b();
                                int i18 = 0;
                                while (i18 < iA3) {
                                    if (zB2) {
                                        if (wk1Var4.b()) {
                                            wk1Var3 = wk1Var4;
                                            jArr[i18] = wk1Var4.a(i15) + 1;
                                        } else {
                                            wk1Var3 = wk1Var4;
                                            jArr[i18] = 0;
                                        }
                                        wk1Var2 = wk1Var3;
                                        z12 = true;
                                        i13 = iT2;
                                    } else {
                                        wk1Var2 = wk1Var4;
                                        z12 = true;
                                        i13 = iT2;
                                        jArr[i18] = wk1Var2.a(i15) + 1;
                                    }
                                    i18++;
                                    wk1Var4 = wk1Var2;
                                    z13 = z12;
                                    iT2 = i13;
                                    i15 = 5;
                                }
                                i12 = iT2;
                                wk1Var = wk1Var4;
                            } else {
                                i12 = iT2;
                                wk1Var = wk1Var4;
                                int iA4 = wk1Var.a(i15) + 1;
                                int i19 = 0;
                                while (i19 < iA3) {
                                    int i22 = 0;
                                    for (int i23 = iA3 - i19; i23 > 0; i23 >>>= 1) {
                                        i22++;
                                    }
                                    int iA5 = wk1Var.a(i22);
                                    int i24 = 0;
                                    while (i24 < iA5 && i19 < iA3) {
                                        jArr[i19] = iA4;
                                        i19++;
                                        i24++;
                                        aVar3 = aVar3;
                                        bArr = bArr;
                                    }
                                    iA4++;
                                    aVar3 = aVar3;
                                    bArr = bArr;
                                }
                            }
                            zk1.a aVar4 = aVar3;
                            byte[] bArr2 = bArr;
                            int iA6 = wk1Var.a(4);
                            if (iA6 > 2) {
                                throw tr0.a("lookup type greater than 2 not decodable: " + iA6, (Exception) null);
                            }
                            if (iA6 == 1 || iA6 == 2) {
                                wk1Var.b(32);
                                wk1Var.b(32);
                                int iA7 = wk1Var.a(4) + 1;
                                wk1Var.b(1);
                                if (iA6 != 1) {
                                    jFloor = iA3 * iA2;
                                } else if (iA2 != 0) {
                                    jFloor = (long) Math.floor(Math.pow(iA3, 1.0d / iA2));
                                }
                                wk1Var.b((int) (iA7 * jFloor));
                            }
                            i16++;
                            wk1Var4 = wk1Var;
                            aVar3 = aVar4;
                            iT2 = i12;
                            bArr = bArr2;
                            i15 = 5;
                            z13 = true;
                        } else {
                            StringBuilder sbA = Cif.a("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sbA.append(wk1Var4.a());
                            throw tr0.a(sbA.toString(), (Exception) null);
                        }
                    } else {
                        zk1.a aVar5 = aVar3;
                        byte[] bArr3 = bArr;
                        wk1 wk1Var5 = wk1Var4;
                        int i25 = 6;
                        int iA8 = wk1Var5.a(6) + 1;
                        for (int i26 = 0; i26 < iA8; i26++) {
                            if (wk1Var5.a(16) != 0) {
                                throw tr0.a("placeholder of time domain transforms not zeroed out", (Exception) null);
                            }
                        }
                        int i27 = 1;
                        int iA9 = wk1Var5.a(6) + 1;
                        int i28 = 0;
                        while (true) {
                            int i29 = 3;
                            if (i28 < iA9) {
                                int iA10 = wk1Var5.a(i17);
                                if (iA10 == 0) {
                                    int i32 = 8;
                                    wk1Var5.b(8);
                                    wk1Var5.b(16);
                                    wk1Var5.b(16);
                                    wk1Var5.b(6);
                                    wk1Var5.b(8);
                                    int iA11 = wk1Var5.a(4) + 1;
                                    int i33 = 0;
                                    while (i33 < iA11) {
                                        wk1Var5.b(i32);
                                        i33++;
                                        i32 = 8;
                                    }
                                } else {
                                    if (iA10 != i27) {
                                        throw tr0.a("floor type greater than 1 not decodable: " + iA10, (Exception) null);
                                    }
                                    int iA12 = wk1Var5.a(5);
                                    int[] iArr = new int[iA12];
                                    int i34 = -1;
                                    for (int i35 = 0; i35 < iA12; i35++) {
                                        int iA13 = wk1Var5.a(4);
                                        iArr[i35] = iA13;
                                        if (iA13 > i34) {
                                            i34 = iA13;
                                        }
                                    }
                                    int i36 = i34 + 1;
                                    int[] iArr2 = new int[i36];
                                    int i37 = 0;
                                    while (i37 < i36) {
                                        iArr2[i37] = wk1Var5.a(i29) + 1;
                                        int iA14 = wk1Var5.a(2);
                                        int i38 = 8;
                                        if (iA14 > 0) {
                                            wk1Var5.b(8);
                                        }
                                        int i39 = 0;
                                        for (int i42 = 1; i39 < (i42 << iA14); i42 = 1) {
                                            wk1Var5.b(i38);
                                            i39++;
                                            i38 = 8;
                                        }
                                        i37++;
                                        i29 = 3;
                                    }
                                    wk1Var5.b(2);
                                    int iA15 = wk1Var5.a(4);
                                    int i43 = 0;
                                    int i44 = 0;
                                    for (int i45 = 0; i45 < iA12; i45++) {
                                        i43 += iArr2[iArr[i45]];
                                        while (i44 < i43) {
                                            wk1Var5.b(iA15);
                                            i44++;
                                        }
                                    }
                                }
                                i28++;
                                i25 = 6;
                                i27 = 1;
                                i17 = 16;
                            } else {
                                int i46 = 1;
                                int iA16 = wk1Var5.a(i25) + 1;
                                int i47 = 0;
                                while (i47 < iA16) {
                                    if (wk1Var5.a(16) <= 2) {
                                        wk1Var5.b(24);
                                        wk1Var5.b(24);
                                        wk1Var5.b(24);
                                        int iA17 = wk1Var5.a(i25) + i46;
                                        int i48 = 8;
                                        wk1Var5.b(8);
                                        int[] iArr3 = new int[iA17];
                                        for (int i49 = 0; i49 < iA17; i49++) {
                                            iArr3[i49] = ((wk1Var5.b() ? wk1Var5.a(5) : 0) * 8) + wk1Var5.a(3);
                                        }
                                        int i52 = 0;
                                        while (i52 < iA17) {
                                            int i53 = 0;
                                            while (i53 < i48) {
                                                if ((iArr3[i52] & (1 << i53)) != 0) {
                                                    wk1Var5.b(i48);
                                                }
                                                i53++;
                                                i48 = 8;
                                            }
                                            i52++;
                                            i48 = 8;
                                        }
                                        i47++;
                                        i25 = 6;
                                        i46 = 1;
                                    } else {
                                        throw tr0.a("residueType greater than 2 is not decodable", (Exception) null);
                                    }
                                }
                                int iA18 = wk1Var5.a(i25) + 1;
                                for (int i54 = 0; i54 < iA18; i54++) {
                                    int iA19 = wk1Var5.a(16);
                                    if (iA19 != 0) {
                                        ka0.b("VorbisUtil", "mapping type other than 0 not supported: " + iA19);
                                    } else {
                                        int iA20 = wk1Var5.b() ? wk1Var5.a(4) + 1 : 1;
                                        if (wk1Var5.b()) {
                                            int iA21 = wk1Var5.a(8) + 1;
                                            for (int i55 = 0; i55 < iA21; i55++) {
                                                int i56 = i14 - 1;
                                                int i57 = 0;
                                                for (int i58 = i56; i58 > 0; i58 >>>= 1) {
                                                    i57++;
                                                }
                                                wk1Var5.b(i57);
                                                int i59 = 0;
                                                while (i56 > 0) {
                                                    i59++;
                                                    i56 >>>= 1;
                                                }
                                                wk1Var5.b(i59);
                                            }
                                        }
                                        if (wk1Var5.a(2) != 0) {
                                            throw tr0.a("to reserved bits must be zero after mapping coupling steps", (Exception) null);
                                        }
                                        if (iA20 > 1) {
                                            for (int i62 = 0; i62 < i14; i62++) {
                                                wk1Var5.b(4);
                                            }
                                        }
                                        for (int i63 = 0; i63 < iA20; i63++) {
                                            wk1Var5.b(8);
                                            wk1Var5.b(8);
                                            wk1Var5.b(8);
                                        }
                                    }
                                }
                                int iA22 = wk1Var5.a(6);
                                int i64 = iA22 + 1;
                                zk1.b[] bVarArr = new zk1.b[i64];
                                for (int i65 = 0; i65 < i64; i65++) {
                                    boolean zB3 = wk1Var5.b();
                                    wk1Var5.a(16);
                                    wk1Var5.a(16);
                                    wk1Var5.a(8);
                                    bVarArr[i65] = new zk1.b(zB3);
                                }
                                if (wk1Var5.b()) {
                                    int i66 = 0;
                                    while (iA22 > 0) {
                                        i66++;
                                        iA22 >>>= 1;
                                    }
                                    aVar2 = new a(cVar, aVar5, bArr3, bVarArr, i66);
                                } else {
                                    throw tr0.a("framing bit after modes not set as expected", (Exception) null);
                                }
                            }
                        }
                    }
                }
            }
        }
        aVar2 = null;
        this.f391750n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        zk1.c cVar2 = aVar2.f391755a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2.f392285g);
        arrayList.add(aVar2.f391757c);
        aVar.f384810a = new vw.a().f("audio/vorbis").b(cVar2.f392282d).k(cVar2.f392281c).c(cVar2.f392279a).n(cVar2.f392280b).a(arrayList).a(zk1.a(com.yandex.mobile.ads.embedded.guava.collect.p.b(aVar2.f391756b.f392277a))).a();
        return true;
    }
}
