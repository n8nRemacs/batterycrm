package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C;
import com.google.android.exoplayer2.extractor.D;
import com.google.android.exoplayer2.extractor.ogg.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.F;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import v61.InterfaceC49174e;

/* compiled from: VorbisReader.java */
/* loaded from: classes6.dex */
final class i extends h {

    /* renamed from: n, reason: collision with root package name */
    @P
    public a f344962n;

    /* renamed from: o, reason: collision with root package name */
    public int f344963o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f344964p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public D.d f344965q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public D.b f344966r;

    /* compiled from: VorbisReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final D.d f344967a;

        /* renamed from: b, reason: collision with root package name */
        public final D.b f344968b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f344969c;

        /* renamed from: d, reason: collision with root package name */
        public final D.c[] f344970d;

        /* renamed from: e, reason: collision with root package name */
        public final int f344971e;

        public a(D.d dVar, D.b bVar, byte[] bArr, D.c[] cVarArr, int i12) {
            this.f344967a = dVar;
            this.f344968b = bVar;
            this.f344969c = bArr;
            this.f344970d = cVarArr;
            this.f344971e = i12;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.h
    public final void a(long j12) {
        this.f344953g = j12;
        this.f344964p = j12 != 0;
        D.d dVar = this.f344965q;
        this.f344963o = dVar != null ? dVar.f344393e : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.h
    public final long b(F f12) {
        byte b12 = f12.f348070a[0];
        if ((b12 & 1) == 1) {
            return -1L;
        }
        a aVar = this.f344962n;
        C36585a.e(aVar);
        boolean z12 = aVar.f344970d[(b12 >> 1) & (255 >>> (8 - aVar.f344971e))].f344388a;
        D.d dVar = aVar.f344967a;
        int i12 = !z12 ? dVar.f344393e : dVar.f344394f;
        long j12 = this.f344964p ? (this.f344963o + i12) / 4 : 0;
        byte[] bArr = f12.f348070a;
        int length = bArr.length;
        int i13 = f12.f348072c + 4;
        if (length < i13) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
            f12.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            f12.A(i13);
        }
        byte[] bArr2 = f12.f348070a;
        int i14 = f12.f348072c;
        bArr2[i14 - 4] = (byte) (j12 & 255);
        bArr2[i14 - 3] = (byte) ((j12 >>> 8) & 255);
        bArr2[i14 - 2] = (byte) ((j12 >>> 16) & 255);
        bArr2[i14 - 1] = (byte) ((j12 >>> 24) & 255);
        this.f344964p = true;
        this.f344963o = i12;
        return j12;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.h
    @InterfaceC49174e
    public final boolean c(F f12, long j12, h.b bVar) throws ParserException {
        a aVar;
        byte[] bArr;
        int i12;
        byte[] bArr2;
        if (this.f344962n != null) {
            bVar.f344960a.getClass();
            return false;
        }
        D.d dVar = this.f344965q;
        if (dVar == null) {
            D.d(1, f12, false);
            f12.j();
            int iR2 = f12.r();
            int iJ2 = f12.j();
            int iF2 = f12.f();
            int i13 = iF2 <= 0 ? -1 : iF2;
            int iF3 = f12.f();
            int i14 = iF3 <= 0 ? -1 : iF3;
            f12.f();
            int iR3 = f12.r();
            int iPow = (int) Math.pow(2.0d, iR3 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iR3 & 240) >> 4);
            f12.r();
            this.f344965q = new D.d(iR2, iJ2, i13, i14, iPow, iPow2, Arrays.copyOf(f12.f348070a, f12.f348072c));
        } else {
            D.b bVar2 = this.f344966r;
            if (bVar2 == null) {
                this.f344966r = D.c(f12, true, true);
            } else {
                int i15 = f12.f348072c;
                byte[] bArr3 = new byte[i15];
                System.arraycopy(f12.f348070a, 0, bArr3, 0, i15);
                int i16 = 5;
                D.d(5, f12, false);
                int iR4 = f12.r() + 1;
                C c12 = new C(f12.f348070a);
                c12.c(f12.f348071b * 8);
                int i17 = 0;
                while (i17 < iR4) {
                    if (c12.b(24) != 5653314) {
                        throw ParserException.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((c12.f344385c * 8) + c12.f344386d), null);
                    }
                    int iB2 = c12.b(16);
                    int iB3 = c12.b(24);
                    long[] jArr = new long[iB3];
                    long jFloor = 0;
                    if (c12.a()) {
                        bArr = bArr3;
                        int iB4 = c12.b(i16) + 1;
                        int i18 = 0;
                        while (i18 < iB3) {
                            int iB5 = c12.b(D.a(iB3 - i18));
                            int i19 = 0;
                            while (i19 < iB5 && i18 < iB3) {
                                jArr[i18] = iB4;
                                i18++;
                                i19++;
                                iB5 = iB5;
                                bVar2 = bVar2;
                            }
                            iB4++;
                            bVar2 = bVar2;
                        }
                    } else {
                        boolean zA2 = c12.a();
                        int i22 = 0;
                        while (i22 < iB3) {
                            if (zA2) {
                                if (c12.a()) {
                                    bArr2 = bArr3;
                                    jArr[i22] = c12.b(i16) + 1;
                                } else {
                                    bArr2 = bArr3;
                                    jArr[i22] = 0;
                                }
                                i12 = 5;
                            } else {
                                i12 = i16;
                                bArr2 = bArr3;
                                jArr[i22] = c12.b(i12) + 1;
                            }
                            i22++;
                            i16 = i12;
                            bArr3 = bArr2;
                        }
                        bArr = bArr3;
                    }
                    D.b bVar3 = bVar2;
                    int iB6 = c12.b(4);
                    if (iB6 > 2) {
                        throw ParserException.a("lookup type greater than 2 not decodable: " + iB6, null);
                    }
                    if (iB6 == 1 || iB6 == 2) {
                        c12.c(32);
                        c12.c(32);
                        int iB7 = c12.b(4) + 1;
                        c12.c(1);
                        if (iB6 != 1) {
                            jFloor = iB3 * iB2;
                        } else if (iB2 != 0) {
                            jFloor = (long) Math.floor(Math.pow(iB3, 1.0d / iB2));
                        }
                        c12.c((int) (iB7 * jFloor));
                    }
                    i17++;
                    bArr3 = bArr;
                    bVar2 = bVar3;
                    i16 = 5;
                }
                D.b bVar4 = bVar2;
                byte[] bArr4 = bArr3;
                int i23 = 6;
                int iB8 = c12.b(6) + 1;
                for (int i24 = 0; i24 < iB8; i24++) {
                    if (c12.b(16) != 0) {
                        throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int iB9 = c12.b(6) + 1;
                int i25 = 0;
                while (true) {
                    int i26 = 3;
                    if (i25 < iB9) {
                        int iB10 = c12.b(16);
                        if (iB10 == 0) {
                            int i27 = 8;
                            c12.c(8);
                            c12.c(16);
                            c12.c(16);
                            c12.c(6);
                            c12.c(8);
                            int iB11 = c12.b(4) + 1;
                            int i28 = 0;
                            while (i28 < iB11) {
                                c12.c(i27);
                                i28++;
                                i27 = 8;
                            }
                        } else {
                            if (iB10 != 1) {
                                throw ParserException.a("floor type greater than 1 not decodable: " + iB10, null);
                            }
                            int iB12 = c12.b(5);
                            int[] iArr = new int[iB12];
                            int i29 = -1;
                            for (int i32 = 0; i32 < iB12; i32++) {
                                int iB13 = c12.b(4);
                                iArr[i32] = iB13;
                                if (iB13 > i29) {
                                    i29 = iB13;
                                }
                            }
                            int i33 = i29 + 1;
                            int[] iArr2 = new int[i33];
                            int i34 = 0;
                            while (i34 < i33) {
                                iArr2[i34] = c12.b(i26) + 1;
                                int iB14 = c12.b(2);
                                int i35 = 8;
                                if (iB14 > 0) {
                                    c12.c(8);
                                }
                                int i36 = 0;
                                while (i36 < (1 << iB14)) {
                                    c12.c(i35);
                                    i36++;
                                    i35 = 8;
                                }
                                i34++;
                                i26 = 3;
                            }
                            c12.c(2);
                            int iB15 = c12.b(4);
                            int i37 = 0;
                            int i38 = 0;
                            for (int i39 = 0; i39 < iB12; i39++) {
                                i37 += iArr2[iArr[i39]];
                                while (i38 < i37) {
                                    c12.c(iB15);
                                    i38++;
                                }
                            }
                        }
                        i25++;
                        i23 = 6;
                    } else {
                        int iB16 = c12.b(i23) + 1;
                        int i42 = 0;
                        while (i42 < iB16) {
                            if (c12.b(16) > 2) {
                                throw ParserException.a("residueType greater than 2 is not decodable", null);
                            }
                            c12.c(24);
                            c12.c(24);
                            c12.c(24);
                            int iB17 = c12.b(i23) + 1;
                            int i43 = 8;
                            c12.c(8);
                            int[] iArr3 = new int[iB17];
                            for (int i44 = 0; i44 < iB17; i44++) {
                                iArr3[i44] = ((c12.a() ? c12.b(5) : 0) * 8) + c12.b(3);
                            }
                            int i45 = 0;
                            while (i45 < iB17) {
                                int i46 = 0;
                                while (i46 < i43) {
                                    if ((iArr3[i45] & (1 << i46)) != 0) {
                                        c12.c(i43);
                                    }
                                    i46++;
                                    i43 = 8;
                                }
                                i45++;
                                i43 = 8;
                            }
                            i42++;
                            i23 = 6;
                        }
                        int iB18 = c12.b(i23) + 1;
                        for (int i47 = 0; i47 < iB18; i47++) {
                            if (c12.b(16) == 0) {
                                int iB19 = c12.a() ? c12.b(4) + 1 : 1;
                                boolean zA3 = c12.a();
                                int i48 = dVar.f344389a;
                                if (zA3) {
                                    int iB20 = c12.b(8) + 1;
                                    for (int i49 = 0; i49 < iB20; i49++) {
                                        int i52 = i48 - 1;
                                        c12.c(D.a(i52));
                                        c12.c(D.a(i52));
                                    }
                                }
                                if (c12.b(2) != 0) {
                                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (iB19 > 1) {
                                    for (int i53 = 0; i53 < i48; i53++) {
                                        c12.c(4);
                                    }
                                }
                                for (int i54 = 0; i54 < iB19; i54++) {
                                    c12.c(8);
                                    c12.c(8);
                                    c12.c(8);
                                }
                            }
                        }
                        int iB21 = c12.b(6);
                        int i55 = iB21 + 1;
                        D.c[] cVarArr = new D.c[i55];
                        for (int i56 = 0; i56 < i55; i56++) {
                            boolean zA4 = c12.a();
                            c12.b(16);
                            c12.b(16);
                            c12.b(8);
                            cVarArr[i56] = new D.c(zA4);
                        }
                        if (!c12.a()) {
                            throw ParserException.a("framing bit after modes not set as expected", null);
                        }
                        aVar = new a(dVar, bVar4, bArr4, cVarArr, D.a(iB21));
                    }
                }
            }
        }
        aVar = null;
        this.f344962n = aVar;
        if (aVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        D.d dVar2 = aVar.f344967a;
        arrayList.add(dVar2.f344395g);
        arrayList.add(aVar.f344969c);
        Metadata metadataB = D.b(AbstractC37401r1.w(aVar.f344968b.f344387a));
        I.b bVar5 = new I.b();
        bVar5.f343504k = "audio/vorbis";
        bVar5.f343499f = dVar2.f344392d;
        bVar5.f343500g = dVar2.f344391c;
        bVar5.f343517x = dVar2.f344389a;
        bVar5.f343518y = dVar2.f344390b;
        bVar5.f343506m = arrayList;
        bVar5.f343502i = metadataB;
        bVar.f344960a = bVar5.a();
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.h
    public final void d(boolean z12) {
        super.d(z12);
        if (z12) {
            this.f344962n = null;
            this.f344965q = null;
            this.f344966r = null;
        }
        this.f344963o = 0;
        this.f344964p = false;
    }
}
