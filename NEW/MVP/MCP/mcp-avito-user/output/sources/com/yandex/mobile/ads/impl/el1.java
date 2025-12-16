package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.vw;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes8.dex */
public final class el1 implements ru {

    /* renamed from: a, reason: collision with root package name */
    private tu f384975a;

    /* renamed from: b, reason: collision with root package name */
    private x91 f384976b;

    /* renamed from: e, reason: collision with root package name */
    private b f384979e;

    /* renamed from: c, reason: collision with root package name */
    private int f384977c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f384978d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f384980f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f384981g = -1;

    public static final class a implements b {

        /* renamed from: m, reason: collision with root package name */
        private static final int[] f384982m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        private static final int[] f384983n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        private final tu f384984a;

        /* renamed from: b, reason: collision with root package name */
        private final x91 f384985b;

        /* renamed from: c, reason: collision with root package name */
        private final fl1 f384986c;

        /* renamed from: d, reason: collision with root package name */
        private final int f384987d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f384988e;

        /* renamed from: f, reason: collision with root package name */
        private final pr0 f384989f;

        /* renamed from: g, reason: collision with root package name */
        private final int f384990g;

        /* renamed from: h, reason: collision with root package name */
        private final vw f384991h;

        /* renamed from: i, reason: collision with root package name */
        private int f384992i;

        /* renamed from: j, reason: collision with root package name */
        private long f384993j;

        /* renamed from: k, reason: collision with root package name */
        private int f384994k;

        /* renamed from: l, reason: collision with root package name */
        private long f384995l;

        public a(tu tuVar, x91 x91Var, fl1 fl1Var) throws tr0 {
            this.f384984a = tuVar;
            this.f384985b = x91Var;
            this.f384986c = fl1Var;
            int iMax = Math.max(1, fl1Var.f385412c / 10);
            this.f384990g = iMax;
            pr0 pr0Var = new pr0(fl1Var.f385415f);
            pr0Var.o();
            int iO2 = pr0Var.o();
            this.f384987d = iO2;
            int i12 = fl1Var.f385411b;
            int i13 = (((fl1Var.f385413d - (i12 * 4)) * 8) / (fl1Var.f385414e * i12)) + 1;
            if (iO2 != i13) {
                throw tr0.a("Expected frames per block: " + i13 + "; got: " + iO2, (Exception) null);
            }
            int iA2 = pc1.a(iMax, iO2);
            this.f384988e = new byte[fl1Var.f385413d * iA2];
            this.f384989f = new pr0(iA2 * a(iO2, i12));
            int i14 = ((fl1Var.f385412c * fl1Var.f385413d) * 8) / iO2;
            this.f384991h = new vw.a().f("audio/raw").b(i14).k(i14).i(a(iMax, i12)).c(fl1Var.f385411b).n(fl1Var.f385412c).j(2).a();
        }

        private static int a(int i12, int i13) {
            return i12 * 2 * i13;
        }

        @Override // com.yandex.mobile.ads.impl.el1.b
        public final void a(long j12) {
            this.f384992i = 0;
            this.f384993j = j12;
            this.f384994k = 0;
            this.f384995l = 0L;
        }

        @Override // com.yandex.mobile.ads.impl.el1.b
        public final void a(int i12, long j12) {
            this.f384984a.a(new hl1(this.f384986c, this.f384987d, i12, j12));
            this.f384985b.a(this.f384991h);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003f -> B:11:0x0041). Please report as a decompilation issue!!! */
        @Override // com.yandex.mobile.ads.impl.el1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a(com.yandex.mobile.ads.impl.to r21, long r22) {
            /*
                Method dump skipped, instructions count: 453
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.el1.a.a(com.yandex.mobile.ads.impl.to, long):boolean");
        }
    }

    public interface b {
        void a(int i12, long j12);

        void a(long j12);

        boolean a(to toVar, long j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ru[] a() {
        return new ru[]{new el1()};
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        return gl1.a((to) suVar);
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final tu f384996a;

        /* renamed from: b, reason: collision with root package name */
        private final x91 f384997b;

        /* renamed from: c, reason: collision with root package name */
        private final fl1 f384998c;

        /* renamed from: d, reason: collision with root package name */
        private final vw f384999d;

        /* renamed from: e, reason: collision with root package name */
        private final int f385000e;

        /* renamed from: f, reason: collision with root package name */
        private long f385001f;

        /* renamed from: g, reason: collision with root package name */
        private int f385002g;

        /* renamed from: h, reason: collision with root package name */
        private long f385003h;

        public c(tu tuVar, x91 x91Var, fl1 fl1Var, String str, int i12) throws tr0 {
            this.f384996a = tuVar;
            this.f384997b = x91Var;
            this.f384998c = fl1Var;
            int i13 = (fl1Var.f385411b * fl1Var.f385414e) / 8;
            if (fl1Var.f385413d != i13) {
                StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i13, "Expected block size: ", "; got: ");
                sbJ.append(fl1Var.f385413d);
                throw tr0.a(sbJ.toString(), (Exception) null);
            }
            int i14 = fl1Var.f385412c * i13;
            int i15 = i14 * 8;
            int iMax = Math.max(i13, i14 / 10);
            this.f385000e = iMax;
            this.f384999d = new vw.a().f(str).b(i15).k(i15).i(iMax).c(fl1Var.f385411b).n(fl1Var.f385412c).j(i12).a();
        }

        @Override // com.yandex.mobile.ads.impl.el1.b
        public final void a(long j12) {
            this.f385001f = j12;
            this.f385002g = 0;
            this.f385003h = 0L;
        }

        @Override // com.yandex.mobile.ads.impl.el1.b
        public final void a(int i12, long j12) {
            this.f384996a.a(new hl1(this.f384998c, 1, i12, j12));
            this.f384997b.a(this.f384999d);
        }

        @Override // com.yandex.mobile.ads.impl.el1.b
        public final boolean a(to toVar, long j12) {
            int i12;
            int i13;
            long j13 = j12;
            while (j13 > 0 && (i12 = this.f385002g) < (i13 = this.f385000e)) {
                int iB2 = this.f384997b.b(toVar, (int) Math.min(i13 - i12, j13), true);
                if (iB2 == -1) {
                    j13 = 0;
                } else {
                    this.f385002g += iB2;
                    j13 -= iB2;
                }
            }
            int i14 = this.f384998c.f385413d;
            int i15 = this.f385002g / i14;
            if (i15 > 0) {
                long jA2 = this.f385001f + pc1.a(this.f385003h, 1000000L, r1.f385412c);
                int i16 = i15 * i14;
                int i17 = this.f385002g - i16;
                this.f384997b.a(jA2, 1, i16, i17, null);
                this.f385003h += i15;
                this.f385002g = i17;
            }
            return j13 <= 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f384975a = tuVar;
        this.f384976b = tuVar.a(0, 1);
        tuVar.a();
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        this.f384977c = j12 == 0 ? 0 : 4;
        b bVar = this.f384979e;
        if (bVar != null) {
            bVar.a(j13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        if (r1 != 65534) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    @Override // com.yandex.mobile.ads.impl.ru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.yandex.mobile.ads.impl.su r17, com.yandex.mobile.ads.impl.fu0 r18) throws com.yandex.mobile.ads.impl.tr0 {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.el1.a(com.yandex.mobile.ads.impl.su, com.yandex.mobile.ads.impl.fu0):int");
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }
}
