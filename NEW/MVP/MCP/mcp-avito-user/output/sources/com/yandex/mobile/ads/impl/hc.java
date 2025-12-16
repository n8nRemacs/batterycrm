package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.mp4.MdtaMetadataEntry;
import com.yandex.mobile.ads.impl.gc;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class hc {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f386075a = pc1.b("OpusHead");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f386076b = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f386077a;

        /* renamed from: b, reason: collision with root package name */
        public int f386078b;

        /* renamed from: c, reason: collision with root package name */
        public int f386079c;

        /* renamed from: d, reason: collision with root package name */
        public long f386080d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f386081e;

        /* renamed from: f, reason: collision with root package name */
        private final pr0 f386082f;

        /* renamed from: g, reason: collision with root package name */
        private final pr0 f386083g;

        /* renamed from: h, reason: collision with root package name */
        private int f386084h;

        /* renamed from: i, reason: collision with root package name */
        private int f386085i;

        public a(pr0 pr0Var, pr0 pr0Var2, boolean z12) throws tr0 {
            this.f386083g = pr0Var;
            this.f386082f = pr0Var2;
            this.f386081e = z12;
            pr0Var2.e(12);
            this.f386077a = pr0Var2.x();
            pr0Var.e(12);
            this.f386085i = pr0Var.x();
            uu.a("first_chunk must be 1", pr0Var.h() == 1);
            this.f386078b = -1;
        }

        public final boolean a() {
            int i12 = this.f386078b + 1;
            this.f386078b = i12;
            if (i12 == this.f386077a) {
                return false;
            }
            this.f386080d = this.f386081e ? this.f386082f.y() : this.f386082f.v();
            if (this.f386078b == this.f386084h) {
                this.f386079c = this.f386083g.x();
                this.f386083g.f(4);
                int i13 = this.f386085i - 1;
                this.f386085i = i13;
                this.f386084h = i13 > 0 ? this.f386083g.x() - 1 : -1;
            }
            return true;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f386086a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f386087b;

        /* renamed from: c, reason: collision with root package name */
        private final long f386088c;

        /* renamed from: d, reason: collision with root package name */
        private final long f386089d;

        public b(String str, byte[] bArr, long j12, long j13) {
            this.f386086a = str;
            this.f386087b = bArr;
            this.f386088c = j12;
            this.f386089d = j13;
        }
    }

    public interface c {
        int a();

        int b();

        int c();
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f386090a;

        /* renamed from: b, reason: collision with root package name */
        private final int f386091b;

        /* renamed from: c, reason: collision with root package name */
        private final pr0 f386092c;

        public d(gc.b bVar, vw vwVar) {
            pr0 pr0Var = bVar.f385634b;
            this.f386092c = pr0Var;
            pr0Var.e(12);
            int iX2 = pr0Var.x();
            if ("audio/raw".equals(vwVar.f391181l)) {
                int iB2 = pc1.b(vwVar.f391164A, vwVar.f391194y);
                if (iX2 == 0 || iX2 % iB2 != 0) {
                    ka0.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iB2 + ", stsz sample size: " + iX2);
                    iX2 = iB2;
                }
            }
            this.f386090a = iX2 == 0 ? -1 : iX2;
            this.f386091b = pr0Var.x();
        }

        @Override // com.yandex.mobile.ads.impl.hc.c
        public final int a() {
            return this.f386090a;
        }

        @Override // com.yandex.mobile.ads.impl.hc.c
        public final int b() {
            return this.f386091b;
        }

        @Override // com.yandex.mobile.ads.impl.hc.c
        public final int c() {
            int i12 = this.f386090a;
            return i12 == -1 ? this.f386092c.x() : i12;
        }
    }

    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final pr0 f386093a;

        /* renamed from: b, reason: collision with root package name */
        private final int f386094b;

        /* renamed from: c, reason: collision with root package name */
        private final int f386095c;

        /* renamed from: d, reason: collision with root package name */
        private int f386096d;

        /* renamed from: e, reason: collision with root package name */
        private int f386097e;

        public e(gc.b bVar) {
            pr0 pr0Var = bVar.f385634b;
            this.f386093a = pr0Var;
            pr0Var.e(12);
            this.f386095c = pr0Var.x() & 255;
            this.f386094b = pr0Var.x();
        }

        @Override // com.yandex.mobile.ads.impl.hc.c
        public final int a() {
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.hc.c
        public final int b() {
            return this.f386094b;
        }

        @Override // com.yandex.mobile.ads.impl.hc.c
        public final int c() {
            int i12 = this.f386095c;
            if (i12 == 8) {
                return this.f386093a.t();
            }
            if (i12 == 16) {
                return this.f386093a.z();
            }
            int i13 = this.f386096d;
            this.f386096d = i13 + 1;
            if (i13 % 2 != 0) {
                return this.f386097e & 15;
            }
            int iT2 = this.f386093a.t();
            this.f386097e = iT2;
            return (iT2 & 240) >> 4;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f386098a;

        /* renamed from: b, reason: collision with root package name */
        private final long f386099b;

        /* renamed from: c, reason: collision with root package name */
        private final int f386100c;

        public f(int i12, int i13, long j12) {
            this.f386098a = i12;
            this.f386099b = j12;
            this.f386100c = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        r13 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:326:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0739 A[PHI: r38 r39
  0x0739: PHI (r38v10 java.util.List<byte[]>) = (r38v11 java.util.List<byte[]>), (r38v12 java.util.List<byte[]>) binds: [B:396:0x077b, B:372:0x06ef] A[DONT_GENERATE, DONT_INLINE]
  0x0739: PHI (r39v7 int) = (r39v8 int), (r39v9 int) binds: [B:396:0x077b, B:372:0x06ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0cd4  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0d51  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0d80  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0d85  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(com.yandex.mobile.ads.impl.gc.a r69, com.yandex.mobile.ads.impl.oy r70, long r71, @j.P com.yandex.mobile.ads.exo.drm.DrmInitData r73, boolean r74, boolean r75, com.yandex.mobile.ads.impl.ly r76) {
        /*
            Method dump skipped, instructions count: 3511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hc.a(com.yandex.mobile.ads.impl.gc$a, com.yandex.mobile.ads.impl.oy, long, com.yandex.mobile.ads.exo.drm.DrmInitData, boolean, boolean, com.yandex.mobile.ads.impl.ly):java.util.ArrayList");
    }

    @j.P
    public static Metadata a(gc.a aVar) {
        MdtaMetadataEntry mdtaMetadataEntry;
        gc.b bVarD = aVar.d(1751411826);
        gc.b bVarD2 = aVar.d(1801812339);
        gc.b bVarD3 = aVar.d(1768715124);
        if (bVarD == null || bVarD2 == null || bVarD3 == null) {
            return null;
        }
        pr0 pr0Var = bVarD.f385634b;
        pr0Var.e(16);
        if (pr0Var.h() != 1835299937) {
            return null;
        }
        pr0 pr0Var2 = bVarD2.f385634b;
        pr0Var2.e(12);
        int iH2 = pr0Var2.h();
        String[] strArr = new String[iH2];
        for (int i12 = 0; i12 < iH2; i12++) {
            int iH3 = pr0Var2.h();
            pr0Var2.f(4);
            strArr[i12] = pr0Var2.a(iH3 - 8, oi.f388554c);
        }
        pr0 pr0Var3 = bVarD3.f385634b;
        pr0Var3.e(8);
        ArrayList arrayList = new ArrayList();
        while (pr0Var3.a() > 8) {
            int iD2 = pr0Var3.d();
            int iH4 = pr0Var3.h();
            int iH5 = pr0Var3.h() - 1;
            if (iH5 >= 0 && iH5 < iH2) {
                String str = strArr[iH5];
                int i13 = iD2 + iH4;
                while (true) {
                    int iD3 = pr0Var3.d();
                    if (iD3 >= i13) {
                        mdtaMetadataEntry = null;
                        break;
                    }
                    int iH6 = pr0Var3.h();
                    if (pr0Var3.h() == 1684108385) {
                        int iH7 = pr0Var3.h();
                        int iH8 = pr0Var3.h();
                        int i14 = iH6 - 16;
                        byte[] bArr = new byte[i14];
                        pr0Var3.a(bArr, 0, i14);
                        mdtaMetadataEntry = new MdtaMetadataEntry(iH8, iH7, str, bArr);
                        break;
                    }
                    pr0Var3.e(iD3 + iH6);
                }
                if (mdtaMetadataEntry != null) {
                    arrayList.add(mdtaMetadataEntry);
                }
            } else {
                j90.a("Skipped metadata with unknown key index: ", iH5, "AtomParsers");
            }
            pr0Var3.e(iD2 + iH4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.yandex.mobile.ads.impl.y91 a(com.yandex.mobile.ads.impl.s91 r39, com.yandex.mobile.ads.impl.gc.a r40, com.yandex.mobile.ads.impl.oy r41) throws com.yandex.mobile.ads.impl.tr0 {
        /*
            Method dump skipped, instructions count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hc.a(com.yandex.mobile.ads.impl.s91, com.yandex.mobile.ads.impl.gc$a, com.yandex.mobile.ads.impl.oy):com.yandex.mobile.ads.impl.y91");
    }

    private static b a(int i12, pr0 pr0Var) {
        pr0Var.e(i12 + 12);
        pr0Var.f(1);
        int iT2 = pr0Var.t();
        while ((iT2 & 128) == 128) {
            iT2 = pr0Var.t();
        }
        pr0Var.f(2);
        int iT3 = pr0Var.t();
        if ((iT3 & 128) != 0) {
            pr0Var.f(2);
        }
        if ((iT3 & 64) != 0) {
            pr0Var.f(pr0Var.t());
        }
        if ((iT3 & 32) != 0) {
            pr0Var.f(2);
        }
        pr0Var.f(1);
        int iT4 = pr0Var.t();
        while ((iT4 & 128) == 128) {
            iT4 = pr0Var.t();
        }
        String strA = qg0.a(pr0Var.t());
        if (!"audio/mpeg".equals(strA) && !"audio/vnd.dts".equals(strA) && !"audio/vnd.dts.hd".equals(strA)) {
            pr0Var.f(4);
            long jV2 = pr0Var.v();
            long jV3 = pr0Var.v();
            pr0Var.f(1);
            int iT5 = pr0Var.t();
            int i13 = iT5 & 127;
            while ((iT5 & 128) == 128) {
                iT5 = pr0Var.t();
                i13 = (i13 << 7) | (iT5 & 127);
            }
            byte[] bArr = new byte[i13];
            pr0Var.a(bArr, 0, i13);
            if (jV3 <= 0) {
                jV3 = -1;
            }
            return new b(strA, bArr, jV3, jV2 > 0 ? jV2 : -1L);
        }
        return new b(strA, null, -1L, -1L);
    }

    @j.P
    private static Pair a(int i12, int i13, pr0 pr0Var) throws tr0 {
        Integer num;
        t91 t91Var;
        Pair pairCreate;
        int i14;
        int i15;
        byte[] bArr;
        int iD2 = pr0Var.d();
        while (iD2 - i12 < i13) {
            pr0Var.e(iD2);
            int iH2 = pr0Var.h();
            uu.a("childAtomSize must be positive", iH2 > 0);
            if (pr0Var.h() == 1936289382) {
                int i16 = iD2 + 8;
                int i17 = 0;
                int i18 = -1;
                String strA = null;
                Integer numValueOf = null;
                while (i16 - iD2 < iH2) {
                    pr0Var.e(i16);
                    int iH3 = pr0Var.h();
                    int iH4 = pr0Var.h();
                    if (iH4 == 1718775137) {
                        numValueOf = Integer.valueOf(pr0Var.h());
                    } else if (iH4 == 1935894637) {
                        pr0Var.f(4);
                        strA = pr0Var.a(4, oi.f388554c);
                    } else if (iH4 == 1935894633) {
                        i18 = i16;
                        i17 = iH3;
                    }
                    i16 += iH3;
                }
                if ("cenc".equals(strA) || "cbc1".equals(strA) || "cens".equals(strA) || "cbcs".equals(strA)) {
                    uu.a("frma atom is mandatory", numValueOf != null);
                    uu.a("schi atom is mandatory", i18 != -1);
                    int i19 = i18 + 8;
                    while (true) {
                        if (i19 - i18 >= i17) {
                            num = numValueOf;
                            t91Var = null;
                            break;
                        }
                        pr0Var.e(i19);
                        int iH5 = pr0Var.h();
                        if (pr0Var.h() == 1952804451) {
                            int iB2 = gc.b(pr0Var.h());
                            pr0Var.f(1);
                            if (iB2 == 0) {
                                pr0Var.f(1);
                                i14 = 0;
                                i15 = 0;
                            } else {
                                int iT2 = pr0Var.t();
                                int i22 = (iT2 & 240) >> 4;
                                i14 = iT2 & 15;
                                i15 = i22;
                            }
                            boolean z12 = pr0Var.t() == 1;
                            int iT3 = pr0Var.t();
                            byte[] bArr2 = new byte[16];
                            pr0Var.a(bArr2, 0, 16);
                            if (z12 && iT3 == 0) {
                                int iT4 = pr0Var.t();
                                byte[] bArr3 = new byte[iT4];
                                pr0Var.a(bArr3, 0, iT4);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            t91Var = new t91(z12, strA, iT3, bArr2, i15, i14, bArr);
                        } else {
                            i19 += iH5;
                        }
                    }
                    uu.a("tenc atom is mandatory", t91Var != null);
                    int i23 = pc1.f388768a;
                    pairCreate = Pair.create(num, t91Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iD2 += iH2;
        }
        return null;
    }
}
