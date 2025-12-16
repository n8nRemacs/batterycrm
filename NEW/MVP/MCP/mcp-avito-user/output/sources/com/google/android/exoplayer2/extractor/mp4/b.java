package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.mp4.a;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.util.z;
import com.google.common.base.C37262f;
import j.P;

/* compiled from: AtomParsers.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f344742a;

    /* compiled from: AtomParsers.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f344743a;

        /* renamed from: b, reason: collision with root package name */
        public int f344744b;

        /* renamed from: c, reason: collision with root package name */
        public int f344745c;

        /* renamed from: d, reason: collision with root package name */
        public long f344746d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f344747e;

        /* renamed from: f, reason: collision with root package name */
        public final F f344748f;

        /* renamed from: g, reason: collision with root package name */
        public final F f344749g;

        /* renamed from: h, reason: collision with root package name */
        public int f344750h;

        /* renamed from: i, reason: collision with root package name */
        public int f344751i;

        public a(F f12, F f13, boolean z12) throws ParserException {
            this.f344749g = f12;
            this.f344748f = f13;
            this.f344747e = z12;
            f13.B(12);
            this.f344743a = f13.u();
            f12.B(12);
            this.f344751i = f12.u();
            com.google.android.exoplayer2.extractor.m.a("first_chunk must be 1", f12.d() == 1);
            this.f344744b = -1;
        }

        public final boolean a() {
            int i12 = this.f344744b + 1;
            this.f344744b = i12;
            if (i12 == this.f344743a) {
                return false;
            }
            boolean z12 = this.f344747e;
            F f12 = this.f344748f;
            this.f344746d = z12 ? f12.v() : f12.s();
            if (this.f344744b == this.f344750h) {
                F f13 = this.f344749g;
                this.f344745c = f13.u();
                f13.C(4);
                int i13 = this.f344751i - 1;
                this.f344751i = i13;
                this.f344750h = i13 > 0 ? f13.u() - 1 : -1;
            }
            return true;
        }
    }

    /* compiled from: AtomParsers.java */
    /* renamed from: com.google.android.exoplayer2.extractor.mp4.b$b, reason: collision with other inner class name */
    public static final class C10582b {

        /* renamed from: a, reason: collision with root package name */
        public final String f344752a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f344753b;

        /* renamed from: c, reason: collision with root package name */
        public final int f344754c;

        /* renamed from: d, reason: collision with root package name */
        public final int f344755d;

        public C10582b(int i12, int i13, String str, byte[] bArr) {
            this.f344752a = str;
            this.f344753b = bArr;
            this.f344754c = i12;
            this.f344755d = i13;
        }
    }

    /* compiled from: AtomParsers.java */
    public interface c {
        int a();

        int b();

        int c();
    }

    /* compiled from: AtomParsers.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final l[] f344756a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public I f344757b;

        /* renamed from: c, reason: collision with root package name */
        public int f344758c;

        /* renamed from: d, reason: collision with root package name */
        public int f344759d = 0;

        public d(int i12) {
            this.f344756a = new l[i12];
        }
    }

    /* compiled from: AtomParsers.java */
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f344760a;

        /* renamed from: b, reason: collision with root package name */
        public final int f344761b;

        /* renamed from: c, reason: collision with root package name */
        public final F f344762c;

        public e(a.b bVar, I i12) {
            F f12 = bVar.f344741b;
            this.f344762c = f12;
            f12.B(12);
            int iU2 = f12.u();
            if ("audio/raw".equals(i12.f343476m)) {
                int iW2 = U.w(i12.f343459B, i12.f343489z);
                if (iU2 == 0 || iU2 % iW2 != 0) {
                    iU2 = iW2;
                }
            }
            this.f344760a = iU2 == 0 ? -1 : iU2;
            this.f344761b = f12.u();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.c
        public final int a() {
            int i12 = this.f344760a;
            return i12 == -1 ? this.f344762c.u() : i12;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.c
        public final int b() {
            return this.f344760a;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.c
        public final int c() {
            return this.f344761b;
        }
    }

    /* compiled from: AtomParsers.java */
    public static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public final F f344763a;

        /* renamed from: b, reason: collision with root package name */
        public final int f344764b;

        /* renamed from: c, reason: collision with root package name */
        public final int f344765c;

        /* renamed from: d, reason: collision with root package name */
        public int f344766d;

        /* renamed from: e, reason: collision with root package name */
        public int f344767e;

        public f(a.b bVar) {
            F f12 = bVar.f344741b;
            this.f344763a = f12;
            f12.B(12);
            this.f344765c = f12.u() & 255;
            this.f344764b = f12.u();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.c
        public final int a() {
            F f12 = this.f344763a;
            int i12 = this.f344765c;
            if (i12 == 8) {
                return f12.r();
            }
            if (i12 == 16) {
                return f12.w();
            }
            int i13 = this.f344766d;
            this.f344766d = i13 + 1;
            if (i13 % 2 != 0) {
                return this.f344767e & 15;
            }
            int iR2 = f12.r();
            this.f344767e = iR2;
            return (iR2 & 240) >> 4;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.c
        public final int b() {
            return -1;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.c
        public final int c() {
            return this.f344764b;
        }
    }

    /* compiled from: AtomParsers.java */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f344768a;

        public g(int i12, long j12, int i13) {
            this.f344768a = i12;
        }
    }

    static {
        int i12 = U.f348106a;
        f344742a = "OpusHead".getBytes(C37262f.f359034c);
    }

    public static C10582b a(int i12, F f12) {
        f12.B(i12 + 12);
        f12.C(1);
        b(f12);
        f12.C(2);
        int iR2 = f12.r();
        if ((iR2 & 128) != 0) {
            f12.C(2);
        }
        if ((iR2 & 64) != 0) {
            f12.C(f12.w());
        }
        if ((iR2 & 32) != 0) {
            f12.C(2);
        }
        f12.C(1);
        b(f12);
        String strF = z.f(f12.r());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return new C10582b(-1, -1, strF, null);
        }
        f12.C(4);
        int iU2 = f12.u();
        int iU3 = f12.u();
        f12.C(1);
        int iB2 = b(f12);
        byte[] bArr = new byte[iB2];
        f12.c(0, iB2, bArr);
        if (iU3 <= 0) {
            iU3 = -1;
        }
        return new C10582b(iU3, iU2 > 0 ? iU2 : -1, strF, bArr);
    }

    public static int b(F f12) {
        int iR2 = f12.r();
        int i12 = iR2 & 127;
        while ((iR2 & 128) == 128) {
            iR2 = f12.r();
            i12 = (i12 << 7) | (iR2 & 127);
        }
        return i12;
    }

    @P
    public static Pair<Integer, l> c(F f12, int i12, int i13) throws ParserException {
        Integer num;
        l lVar;
        Pair<Integer, l> pairCreate;
        int i14;
        int i15;
        byte[] bArr;
        int i16 = f12.f348071b;
        while (i16 - i12 < i13) {
            f12.B(i16);
            int iD2 = f12.d();
            com.google.android.exoplayer2.extractor.m.a("childAtomSize must be positive", iD2 > 0);
            if (f12.d() == 1936289382) {
                int i17 = i16 + 8;
                int i18 = 0;
                int i19 = -1;
                String strP = null;
                Integer numValueOf = null;
                while (i17 - i16 < iD2) {
                    f12.B(i17);
                    int iD3 = f12.d();
                    int iD4 = f12.d();
                    if (iD4 == 1718775137) {
                        numValueOf = Integer.valueOf(f12.d());
                    } else if (iD4 == 1935894637) {
                        f12.C(4);
                        strP = f12.p(4, C37262f.f359034c);
                    } else if (iD4 == 1935894633) {
                        i19 = i17;
                        i18 = iD3;
                    }
                    i17 += iD3;
                }
                if ("cenc".equals(strP) || "cbc1".equals(strP) || "cens".equals(strP) || "cbcs".equals(strP)) {
                    com.google.android.exoplayer2.extractor.m.a("frma atom is mandatory", numValueOf != null);
                    com.google.android.exoplayer2.extractor.m.a("schi atom is mandatory", i19 != -1);
                    int i22 = i19 + 8;
                    while (true) {
                        if (i22 - i19 >= i18) {
                            num = numValueOf;
                            lVar = null;
                            break;
                        }
                        f12.B(i22);
                        int iD5 = f12.d();
                        if (f12.d() == 1952804451) {
                            int iB2 = com.google.android.exoplayer2.extractor.mp4.a.b(f12.d());
                            f12.C(1);
                            if (iB2 == 0) {
                                f12.C(1);
                                i14 = 0;
                                i15 = 0;
                            } else {
                                int iR2 = f12.r();
                                int i23 = (iR2 & 240) >> 4;
                                i14 = iR2 & 15;
                                i15 = i23;
                            }
                            boolean z12 = f12.r() == 1;
                            int iR3 = f12.r();
                            byte[] bArr2 = new byte[16];
                            f12.c(0, 16, bArr2);
                            if (z12 && iR3 == 0) {
                                int iR4 = f12.r();
                                byte[] bArr3 = new byte[iR4];
                                f12.c(0, iR4, bArr3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            lVar = new l(z12, strP, iR3, bArr2, i15, i14, bArr);
                        } else {
                            i22 += iD5;
                        }
                    }
                    com.google.android.exoplayer2.extractor.m.a("tenc atom is mandatory", lVar != null);
                    int i24 = U.f348106a;
                    pairCreate = Pair.create(num, lVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i16 += iD2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0452  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.extractor.mp4.n d(com.google.android.exoplayer2.extractor.mp4.k r39, com.google.android.exoplayer2.extractor.mp4.a.C10581a r40, com.google.android.exoplayer2.extractor.t r41) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.b.d(com.google.android.exoplayer2.extractor.mp4.k, com.google.android.exoplayer2.extractor.mp4.a$a, com.google.android.exoplayer2.extractor.t):com.google.android.exoplayer2.extractor.mp4.n");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        r14 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0cd6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList e(com.google.android.exoplayer2.extractor.mp4.a.C10581a r72, com.google.android.exoplayer2.extractor.t r73, long r74, @j.P com.google.android.exoplayer2.drm.DrmInitData r76, boolean r77, boolean r78, com.google.common.base.InterfaceC37276u r79) {
        /*
            Method dump skipped, instructions count: 3537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.b.e(com.google.android.exoplayer2.extractor.mp4.a$a, com.google.android.exoplayer2.extractor.t, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean, com.google.common.base.u):java.util.ArrayList");
    }
}
