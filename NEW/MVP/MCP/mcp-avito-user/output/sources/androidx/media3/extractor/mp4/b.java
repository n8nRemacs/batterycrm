package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.media3.common.C23108t;
import androidx.media3.common.D;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.M;
import androidx.media3.common.util.z;
import androidx.media3.container.CreationTime;
import androidx.media3.extractor.mp4.a;
import androidx.media3.extractor.s;
import com.google.common.base.C37262f;
import j.P;

/* compiled from: AtomParsers.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f50915a;

    /* compiled from: AtomParsers.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f50916a;

        /* renamed from: b, reason: collision with root package name */
        public int f50917b;

        /* renamed from: c, reason: collision with root package name */
        public int f50918c;

        /* renamed from: d, reason: collision with root package name */
        public long f50919d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f50920e;

        /* renamed from: f, reason: collision with root package name */
        public final z f50921f;

        /* renamed from: g, reason: collision with root package name */
        public final z f50922g;

        /* renamed from: h, reason: collision with root package name */
        public int f50923h;

        /* renamed from: i, reason: collision with root package name */
        public int f50924i;

        public a(z zVar, z zVar2, boolean z12) throws ParserException {
            this.f50922g = zVar;
            this.f50921f = zVar2;
            this.f50920e = z12;
            zVar2.F(12);
            this.f50916a = zVar2.x();
            zVar.F(12);
            this.f50924i = zVar.x();
            s.a("first_chunk must be 1", zVar.g() == 1);
            this.f50917b = -1;
        }

        public final boolean a() {
            int i12 = this.f50917b + 1;
            this.f50917b = i12;
            if (i12 == this.f50916a) {
                return false;
            }
            boolean z12 = this.f50920e;
            z zVar = this.f50921f;
            this.f50919d = z12 ? zVar.y() : zVar.v();
            if (this.f50917b == this.f50923h) {
                z zVar2 = this.f50922g;
                this.f50918c = zVar2.x();
                zVar2.G(4);
                int i13 = this.f50924i - 1;
                this.f50924i = i13;
                this.f50923h = i13 > 0 ? zVar2.x() - 1 : -1;
            }
            return true;
        }
    }

    /* compiled from: AtomParsers.java */
    /* renamed from: androidx.media3.extractor.mp4.b$b, reason: collision with other inner class name */
    public static final class C1857b {

        /* renamed from: a, reason: collision with root package name */
        public final String f50925a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f50926b;

        /* renamed from: c, reason: collision with root package name */
        public final long f50927c;

        /* renamed from: d, reason: collision with root package name */
        public final long f50928d;

        public C1857b(String str, byte[] bArr, long j12, long j13) {
            this.f50925a = str;
            this.f50926b = bArr;
            this.f50927c = j12;
            this.f50928d = j13;
        }
    }

    /* compiled from: AtomParsers.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Metadata f50929a;

        /* renamed from: b, reason: collision with root package name */
        public final long f50930b;

        public c(Metadata metadata, long j12) {
            this.f50929a = metadata;
            this.f50930b = j12;
        }
    }

    /* compiled from: AtomParsers.java */
    public interface d {
        int a();

        int b();

        int c();
    }

    /* compiled from: AtomParsers.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final l[] f50931a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public C23108t f50932b;

        /* renamed from: c, reason: collision with root package name */
        public int f50933c;

        /* renamed from: d, reason: collision with root package name */
        public int f50934d = 0;

        public e(int i12) {
            this.f50931a = new l[i12];
        }
    }

    /* compiled from: AtomParsers.java */
    public static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f50935a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50936b;

        /* renamed from: c, reason: collision with root package name */
        public final z f50937c;

        public f(a.b bVar, C23108t c23108t) {
            z zVar = bVar.f50914b;
            this.f50937c = zVar;
            zVar.F(12);
            int iX2 = zVar.x();
            if ("audio/raw".equals(c23108t.f47757m)) {
                int iV2 = M.v(c23108t.f47738B, c23108t.f47770z);
                if (iX2 == 0 || iX2 % iV2 != 0) {
                    androidx.media3.common.util.s.g();
                    iX2 = iV2;
                }
            }
            this.f50935a = iX2 == 0 ? -1 : iX2;
            this.f50936b = zVar.x();
        }

        @Override // androidx.media3.extractor.mp4.b.d
        public final int a() {
            int i12 = this.f50935a;
            return i12 == -1 ? this.f50937c.x() : i12;
        }

        @Override // androidx.media3.extractor.mp4.b.d
        public final int b() {
            return this.f50935a;
        }

        @Override // androidx.media3.extractor.mp4.b.d
        public final int c() {
            return this.f50936b;
        }
    }

    /* compiled from: AtomParsers.java */
    public static final class g implements d {

        /* renamed from: a, reason: collision with root package name */
        public final z f50938a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50939b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50940c;

        /* renamed from: d, reason: collision with root package name */
        public int f50941d;

        /* renamed from: e, reason: collision with root package name */
        public int f50942e;

        public g(a.b bVar) {
            z zVar = bVar.f50914b;
            this.f50938a = zVar;
            zVar.F(12);
            this.f50940c = zVar.x() & 255;
            this.f50939b = zVar.x();
        }

        @Override // androidx.media3.extractor.mp4.b.d
        public final int a() {
            z zVar = this.f50938a;
            int i12 = this.f50940c;
            if (i12 == 8) {
                return zVar.u();
            }
            if (i12 == 16) {
                return zVar.z();
            }
            int i13 = this.f50941d;
            this.f50941d = i13 + 1;
            if (i13 % 2 != 0) {
                return this.f50942e & 15;
            }
            int iU2 = zVar.u();
            this.f50942e = iU2;
            return (iU2 & 240) >> 4;
        }

        @Override // androidx.media3.extractor.mp4.b.d
        public final int b() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.b.d
        public final int c() {
            return this.f50939b;
        }
    }

    /* compiled from: AtomParsers.java */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f50943a;

        public h(int i12, long j12, int i13) {
            this.f50943a = i12;
        }
    }

    /* compiled from: AtomParsers.java */
    public static final class i {
    }

    static {
        int i12 = M.f47887a;
        f50915a = "OpusHead".getBytes(C37262f.f359034c);
    }

    public static C1857b a(int i12, z zVar) {
        zVar.F(i12 + 12);
        zVar.G(1);
        b(zVar);
        zVar.G(2);
        int iU2 = zVar.u();
        if ((iU2 & 128) != 0) {
            zVar.G(2);
        }
        if ((iU2 & 64) != 0) {
            zVar.G(zVar.u());
        }
        if ((iU2 & 32) != 0) {
            zVar.G(2);
        }
        zVar.G(1);
        b(zVar);
        String strC = D.c(zVar.u());
        if ("audio/mpeg".equals(strC) || "audio/vnd.dts".equals(strC) || "audio/vnd.dts.hd".equals(strC)) {
            return new C1857b(strC, null, -1L, -1L);
        }
        zVar.G(4);
        long jV2 = zVar.v();
        long jV3 = zVar.v();
        zVar.G(1);
        int iB2 = b(zVar);
        byte[] bArr = new byte[iB2];
        zVar.e(0, iB2, bArr);
        return new C1857b(strC, bArr, jV3 > 0 ? jV3 : -1L, jV2 > 0 ? jV2 : -1L);
    }

    public static int b(z zVar) {
        int iU2 = zVar.u();
        int i12 = iU2 & 127;
        while ((iU2 & 128) == 128) {
            iU2 = zVar.u();
            i12 = (i12 << 7) | (iU2 & 127);
        }
        return i12;
    }

    public static c c(z zVar) {
        long jV2;
        zVar.F(8);
        if (androidx.media3.extractor.mp4.a.b(zVar.g()) == 0) {
            jV2 = zVar.v();
            zVar.G(4);
        } else {
            long jO2 = zVar.o();
            zVar.G(8);
            jV2 = jO2;
        }
        return new c(new Metadata(new CreationTime((jV2 - 2082844800) * 1000)), zVar.v());
    }

    @P
    public static Pair<Integer, l> d(z zVar, int i12, int i13) throws ParserException {
        Integer num;
        l lVar;
        Pair<Integer, l> pairCreate;
        int i14;
        int i15;
        byte[] bArr;
        int i16 = zVar.f47963b;
        while (i16 - i12 < i13) {
            zVar.F(i16);
            int iG2 = zVar.g();
            s.a("childAtomSize must be positive", iG2 > 0);
            if (zVar.g() == 1936289382) {
                int i17 = i16 + 8;
                int i18 = 0;
                int i19 = -1;
                String strS = null;
                Integer numValueOf = null;
                while (i17 - i16 < iG2) {
                    zVar.F(i17);
                    int iG3 = zVar.g();
                    int iG4 = zVar.g();
                    if (iG4 == 1718775137) {
                        numValueOf = Integer.valueOf(zVar.g());
                    } else if (iG4 == 1935894637) {
                        zVar.G(4);
                        strS = zVar.s(4, C37262f.f359034c);
                    } else if (iG4 == 1935894633) {
                        i19 = i17;
                        i18 = iG3;
                    }
                    i17 += iG3;
                }
                if ("cenc".equals(strS) || "cbc1".equals(strS) || "cens".equals(strS) || "cbcs".equals(strS)) {
                    s.a("frma atom is mandatory", numValueOf != null);
                    s.a("schi atom is mandatory", i19 != -1);
                    int i22 = i19 + 8;
                    while (true) {
                        if (i22 - i19 >= i18) {
                            num = numValueOf;
                            lVar = null;
                            break;
                        }
                        zVar.F(i22);
                        int iG5 = zVar.g();
                        if (zVar.g() == 1952804451) {
                            int iB2 = androidx.media3.extractor.mp4.a.b(zVar.g());
                            zVar.G(1);
                            if (iB2 == 0) {
                                zVar.G(1);
                                i14 = 0;
                                i15 = 0;
                            } else {
                                int iU2 = zVar.u();
                                int i23 = (iU2 & 240) >> 4;
                                i14 = iU2 & 15;
                                i15 = i23;
                            }
                            boolean z12 = zVar.u() == 1;
                            int iU3 = zVar.u();
                            byte[] bArr2 = new byte[16];
                            zVar.e(0, 16, bArr2);
                            if (z12 && iU3 == 0) {
                                int iU4 = zVar.u();
                                byte[] bArr3 = new byte[iU4];
                                zVar.e(0, iU4, bArr3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            lVar = new l(z12, strS, iU3, bArr2, i15, i14, bArr);
                        } else {
                            i22 += iG5;
                        }
                    }
                    s.a("tenc atom is mandatory", lVar != null);
                    int i24 = M.f47887a;
                    pairCreate = Pair.create(num, lVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i16 += iG2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0467  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.mp4.n e(androidx.media3.extractor.mp4.k r39, androidx.media3.extractor.mp4.a.C1856a r40, androidx.media3.extractor.z r41) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.b.e(androidx.media3.extractor.mp4.k, androidx.media3.extractor.mp4.a$a, androidx.media3.extractor.z):androidx.media3.extractor.mp4.n");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dc, code lost:
    
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0e0a  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0e0c  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0e79 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(androidx.media3.extractor.mp4.a.C1856a r68, androidx.media3.extractor.z r69, long r70, @j.P androidx.media3.common.DrmInitData r72, boolean r73, boolean r74, com.google.common.base.InterfaceC37276u r75) {
        /*
            Method dump skipped, instructions count: 3714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.b.f(androidx.media3.extractor.mp4.a$a, androidx.media3.extractor.z, long, androidx.media3.common.DrmInitData, boolean, boolean, com.google.common.base.u):java.util.ArrayList");
    }
}
