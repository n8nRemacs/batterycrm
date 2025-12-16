package androidx.media3.extractor.ogg;

import androidx.media3.common.C23108t;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.s;
import androidx.media3.common.util.z;
import androidx.media3.extractor.L;
import androidx.media3.extractor.M;
import androidx.media3.extractor.ogg.h;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import v61.InterfaceC49174e;

/* compiled from: VorbisReader.java */
/* loaded from: classes.dex */
final class i extends h {

    /* renamed from: n, reason: collision with root package name */
    @P
    public a f51135n;

    /* renamed from: o, reason: collision with root package name */
    public int f51136o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f51137p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public M.c f51138q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public M.a f51139r;

    /* compiled from: VorbisReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final M.c f51140a;

        /* renamed from: b, reason: collision with root package name */
        public final M.a f51141b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f51142c;

        /* renamed from: d, reason: collision with root package name */
        public final M.b[] f51143d;

        /* renamed from: e, reason: collision with root package name */
        public final int f51144e;

        public a(M.c cVar, M.a aVar, byte[] bArr, M.b[] bVarArr, int i12) {
            this.f51140a = cVar;
            this.f51141b = aVar;
            this.f51142c = bArr;
            this.f51143d = bVarArr;
            this.f51144e = i12;
        }
    }

    @Override // androidx.media3.extractor.ogg.h
    public final void a(long j12) {
        this.f51126g = j12;
        this.f51137p = j12 != 0;
        M.c cVar = this.f51138q;
        this.f51136o = cVar != null ? cVar.f50401e : 0;
    }

    @Override // androidx.media3.extractor.ogg.h
    public final long b(z zVar) {
        byte b12 = zVar.f47962a[0];
        if ((b12 & 1) == 1) {
            return -1L;
        }
        a aVar = this.f51135n;
        C23110a.h(aVar);
        boolean z12 = aVar.f51143d[(b12 >> 1) & (255 >>> (8 - aVar.f51144e))].f50396a;
        M.c cVar = aVar.f51140a;
        int i12 = !z12 ? cVar.f50401e : cVar.f50402f;
        long j12 = this.f51137p ? (this.f51136o + i12) / 4 : 0;
        byte[] bArr = zVar.f47962a;
        int length = bArr.length;
        int i13 = zVar.f47964c + 4;
        if (length < i13) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
            zVar.D(bArrCopyOf.length, bArrCopyOf);
        } else {
            zVar.E(i13);
        }
        byte[] bArr2 = zVar.f47962a;
        int i14 = zVar.f47964c;
        bArr2[i14 - 4] = (byte) (j12 & 255);
        bArr2[i14 - 3] = (byte) ((j12 >>> 8) & 255);
        bArr2[i14 - 2] = (byte) ((j12 >>> 16) & 255);
        bArr2[i14 - 1] = (byte) ((j12 >>> 24) & 255);
        this.f51137p = true;
        this.f51136o = i12;
        return j12;
    }

    @Override // androidx.media3.extractor.ogg.h
    @InterfaceC49174e
    public final boolean c(z zVar, long j12, h.b bVar) throws ParserException {
        a aVar;
        if (this.f51135n != null) {
            bVar.f51133a.getClass();
            return false;
        }
        M.c cVar = this.f51138q;
        int i12 = 4;
        if (cVar == null) {
            M.d(1, zVar, false);
            zVar.m();
            int iU2 = zVar.u();
            int iM2 = zVar.m();
            int i13 = zVar.i();
            int i14 = i13 <= 0 ? -1 : i13;
            int i15 = zVar.i();
            int i16 = i15 <= 0 ? -1 : i15;
            zVar.i();
            int iU3 = zVar.u();
            int iPow = (int) Math.pow(2.0d, iU3 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iU3 & 240) >> 4);
            zVar.u();
            this.f51138q = new M.c(iU2, iM2, i14, i16, iPow, iPow2, Arrays.copyOf(zVar.f47962a, zVar.f47964c));
        } else {
            M.a aVar2 = this.f51139r;
            if (aVar2 == null) {
                this.f51139r = M.c(zVar, true, true);
            } else {
                int i17 = zVar.f47964c;
                byte[] bArr = new byte[i17];
                System.arraycopy(zVar.f47962a, 0, bArr, 0, i17);
                int i18 = 5;
                M.d(5, zVar, false);
                int iU4 = zVar.u() + 1;
                L l12 = new L(zVar.f47962a);
                l12.c(zVar.f47963b * 8);
                int i19 = 0;
                while (true) {
                    int i22 = 16;
                    if (i19 >= iU4) {
                        int i23 = 6;
                        int iB2 = l12.b(6) + 1;
                        for (int i24 = 0; i24 < iB2; i24++) {
                            if (l12.b(16) != 0) {
                                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iB3 = l12.b(6) + 1;
                        int i25 = 0;
                        while (true) {
                            int i26 = 3;
                            if (i25 < iB3) {
                                int iB4 = l12.b(i22);
                                if (iB4 == 0) {
                                    int i27 = 8;
                                    l12.c(8);
                                    l12.c(16);
                                    l12.c(16);
                                    l12.c(6);
                                    l12.c(8);
                                    int iB5 = l12.b(4) + 1;
                                    int i28 = 0;
                                    while (i28 < iB5) {
                                        l12.c(i27);
                                        i28++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (iB4 != 1) {
                                        throw ParserException.a("floor type greater than 1 not decodable: " + iB4, null);
                                    }
                                    int iB6 = l12.b(i18);
                                    int[] iArr = new int[iB6];
                                    int i29 = -1;
                                    for (int i32 = 0; i32 < iB6; i32++) {
                                        int iB7 = l12.b(i12);
                                        iArr[i32] = iB7;
                                        if (iB7 > i29) {
                                            i29 = iB7;
                                        }
                                    }
                                    int i33 = i29 + 1;
                                    int[] iArr2 = new int[i33];
                                    int i34 = 0;
                                    while (i34 < i33) {
                                        iArr2[i34] = l12.b(i26) + 1;
                                        int iB8 = l12.b(2);
                                        int i35 = 8;
                                        if (iB8 > 0) {
                                            l12.c(8);
                                        }
                                        int i36 = i33;
                                        int i37 = 0;
                                        while (i37 < (1 << iB8)) {
                                            l12.c(i35);
                                            i37++;
                                            i35 = 8;
                                        }
                                        i34++;
                                        i33 = i36;
                                        i26 = 3;
                                    }
                                    l12.c(2);
                                    int iB9 = l12.b(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i42 = 0; i42 < iB6; i42++) {
                                        i38 += iArr2[iArr[i42]];
                                        while (i39 < i38) {
                                            l12.c(iB9);
                                            i39++;
                                        }
                                    }
                                }
                                i25++;
                                i23 = 6;
                                i12 = 4;
                                i22 = 16;
                                i18 = 5;
                            } else {
                                int iB10 = l12.b(i23) + 1;
                                int i43 = 0;
                                while (i43 < iB10) {
                                    if (l12.b(16) > 2) {
                                        throw ParserException.a("residueType greater than 2 is not decodable", null);
                                    }
                                    l12.c(24);
                                    l12.c(24);
                                    l12.c(24);
                                    int iB11 = l12.b(i23) + 1;
                                    int i44 = 8;
                                    l12.c(8);
                                    int[] iArr3 = new int[iB11];
                                    for (int i45 = 0; i45 < iB11; i45++) {
                                        iArr3[i45] = ((l12.a() ? l12.b(5) : 0) * 8) + l12.b(3);
                                    }
                                    int i46 = 0;
                                    while (i46 < iB11) {
                                        int i47 = 0;
                                        while (i47 < i44) {
                                            if ((iArr3[i46] & (1 << i47)) != 0) {
                                                l12.c(i44);
                                            }
                                            i47++;
                                            i44 = 8;
                                        }
                                        i46++;
                                        i44 = 8;
                                    }
                                    i43++;
                                    i23 = 6;
                                }
                                int iB12 = l12.b(i23) + 1;
                                for (int i48 = 0; i48 < iB12; i48++) {
                                    if (l12.b(16) != 0) {
                                        s.c();
                                    } else {
                                        int iB13 = l12.a() ? l12.b(4) + 1 : 1;
                                        boolean zA2 = l12.a();
                                        int i49 = cVar.f50397a;
                                        if (zA2) {
                                            int iB14 = l12.b(8) + 1;
                                            for (int i52 = 0; i52 < iB14; i52++) {
                                                int i53 = i49 - 1;
                                                l12.c(M.a(i53));
                                                l12.c(M.a(i53));
                                            }
                                        }
                                        if (l12.b(2) != 0) {
                                            throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iB13 > 1) {
                                            for (int i54 = 0; i54 < i49; i54++) {
                                                l12.c(4);
                                            }
                                        }
                                        for (int i55 = 0; i55 < iB13; i55++) {
                                            l12.c(8);
                                            l12.c(8);
                                            l12.c(8);
                                        }
                                    }
                                }
                                int iB15 = l12.b(6);
                                int i56 = iB15 + 1;
                                M.b[] bVarArr = new M.b[i56];
                                for (int i57 = 0; i57 < i56; i57++) {
                                    boolean zA3 = l12.a();
                                    l12.b(16);
                                    l12.b(16);
                                    l12.b(8);
                                    bVarArr[i57] = new M.b(zA3);
                                }
                                if (!l12.a()) {
                                    throw ParserException.a("framing bit after modes not set as expected", null);
                                }
                                aVar = new a(cVar, aVar2, bArr, bVarArr, M.a(iB15));
                            }
                        }
                    } else {
                        if (l12.b(24) != 5653314) {
                            throw ParserException.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((l12.f50393c * 8) + l12.f50394d), null);
                        }
                        int iB16 = l12.b(16);
                        int iB17 = l12.b(24);
                        if (l12.a()) {
                            l12.c(5);
                            for (int iB18 = 0; iB18 < iB17; iB18 += l12.b(M.a(iB17 - iB18))) {
                            }
                        } else {
                            boolean zA4 = l12.a();
                            for (int i58 = 0; i58 < iB17; i58++) {
                                if (!zA4) {
                                    l12.c(5);
                                } else if (l12.a()) {
                                    l12.c(5);
                                }
                            }
                        }
                        int iB19 = l12.b(4);
                        if (iB19 > 2) {
                            throw ParserException.a("lookup type greater than 2 not decodable: " + iB19, null);
                        }
                        if (iB19 == 1 || iB19 == 2) {
                            l12.c(32);
                            l12.c(32);
                            int iB20 = l12.b(4) + 1;
                            l12.c(1);
                            l12.c((int) ((iB19 == 1 ? iB16 != 0 ? (long) Math.floor(Math.pow(iB17, 1.0d / iB16)) : 0L : iB16 * iB17) * iB20));
                        }
                        i19++;
                    }
                }
            }
        }
        aVar = null;
        this.f51135n = aVar;
        if (aVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        M.c cVar2 = aVar.f51140a;
        arrayList.add(cVar2.f50403g);
        arrayList.add(aVar.f51142c);
        Metadata metadataB = M.b(AbstractC37401r1.w(aVar.f51141b.f50395a));
        C23108t.b bVar2 = new C23108t.b();
        bVar2.f47787k = "audio/vorbis";
        bVar2.f47782f = cVar2.f50400d;
        bVar2.f47783g = cVar2.f50399c;
        bVar2.f47800x = cVar2.f50397a;
        bVar2.f47801y = cVar2.f50398b;
        bVar2.f47789m = arrayList;
        bVar2.f47785i = metadataB;
        bVar.f51133a = bVar2.a();
        return true;
    }

    @Override // androidx.media3.extractor.ogg.h
    public final void d(boolean z12) {
        super.d(z12);
        if (z12) {
            this.f51135n = null;
            this.f51138q = null;
            this.f51139r = null;
        }
        this.f51136o = 0;
        this.f51137p = false;
    }
}
