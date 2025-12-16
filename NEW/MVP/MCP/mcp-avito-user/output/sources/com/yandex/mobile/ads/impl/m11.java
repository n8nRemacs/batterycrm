package com.yandex.mobile.ads.impl;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.drm.e;
import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.exo.drm.g;
import com.yandex.mobile.ads.impl.x91;
import j.InterfaceC42153i;

/* loaded from: classes8.dex */
public final class m11 implements x91 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f387794A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f387795B;

    /* renamed from: a, reason: collision with root package name */
    private final l11 f387796a;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final com.yandex.mobile.ads.exo.drm.g f387799d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final f.a f387800e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private c f387801f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private vw f387802g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private com.yandex.mobile.ads.exo.drm.e f387803h;

    /* renamed from: p, reason: collision with root package name */
    private int f387811p;

    /* renamed from: q, reason: collision with root package name */
    private int f387812q;

    /* renamed from: r, reason: collision with root package name */
    private int f387813r;

    /* renamed from: s, reason: collision with root package name */
    private int f387814s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f387818w;

    /* renamed from: z, reason: collision with root package name */
    @j.P
    private vw f387821z;

    /* renamed from: b, reason: collision with root package name */
    private final a f387797b = new a();

    /* renamed from: i, reason: collision with root package name */
    private int f387804i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private int[] f387805j = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    private long[] f387806k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    private long[] f387809n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private int[] f387808m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f387807l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    private x91.a[] f387810o = new x91.a[1000];

    /* renamed from: c, reason: collision with root package name */
    private final h61<b> f387798c = new h61<>(new L0(2));

    /* renamed from: t, reason: collision with root package name */
    private long f387815t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f387816u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private long f387817v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    private boolean f387820y = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f387819x = true;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f387822a;

        /* renamed from: b, reason: collision with root package name */
        public long f387823b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public x91.a f387824c;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final vw f387825a;

        /* renamed from: b, reason: collision with root package name */
        public final g.b f387826b;

        public /* synthetic */ b(vw vwVar, g.b bVar, int i12) {
            this(vwVar, bVar);
        }

        private b(vw vwVar, g.b bVar) {
            this.f387825a = vwVar;
            this.f387826b = bVar;
        }
    }

    public interface c {
    }

    public m11(h9 h9Var, @j.P com.yandex.mobile.ads.exo.drm.g gVar, @j.P f.a aVar) {
        this.f387799d = gVar;
        this.f387800e = aVar;
        this.f387796a = new l11(h9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
        bVar.f387826b.release();
    }

    public final int c() {
        return this.f387812q + this.f387814s;
    }

    @j.P
    public final synchronized vw d() {
        return this.f387820y ? null : this.f387821z;
    }

    public final int e() {
        return this.f387812q + this.f387811p;
    }

    public final synchronized boolean f() {
        return this.f387818w;
    }

    @InterfaceC42153i
    public final void g() {
        com.yandex.mobile.ads.exo.drm.e eVar = this.f387803h;
        if (eVar == null || eVar.c() != 1) {
            return;
        }
        e.a aVarG = this.f387803h.g();
        aVarG.getClass();
        throw aVarG;
    }

    @InterfaceC42153i
    public final void h() {
        a();
        com.yandex.mobile.ads.exo.drm.e eVar = this.f387803h;
        if (eVar != null) {
            eVar.a(this.f387800e);
            this.f387803h = null;
            this.f387802g = null;
        }
    }

    @InterfaceC42153i
    public final void i() {
        b(true);
        com.yandex.mobile.ads.exo.drm.e eVar = this.f387803h;
        if (eVar != null) {
            eVar.a(this.f387800e);
            this.f387803h = null;
            this.f387802g = null;
        }
    }

    private int c(int i12) {
        int i13 = this.f387813r + i12;
        int i14 = this.f387804i;
        return i13 < i14 ? i13 : i13 - i14;
    }

    public final void a(long j12) {
        this.f387815t = j12;
    }

    @InterfaceC42153i
    public final void b(boolean z12) {
        this.f387796a.b();
        this.f387811p = 0;
        this.f387812q = 0;
        this.f387813r = 0;
        this.f387814s = 0;
        this.f387819x = true;
        this.f387815t = Long.MIN_VALUE;
        this.f387816u = Long.MIN_VALUE;
        this.f387817v = Long.MIN_VALUE;
        this.f387818w = false;
        this.f387798c.a();
        if (z12) {
            this.f387821z = null;
            this.f387820y = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f387814s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f387811p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            com.yandex.mobile.ads.impl.db.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f387814s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f387814s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.m11.d(int):void");
    }

    @InterfaceC42153i
    public final int a(ww wwVar, vn vnVar, int i12, boolean z12) {
        int i13;
        boolean z13 = (i12 & 2) != 0;
        a aVar = this.f387797b;
        synchronized (this) {
            try {
                vnVar.f390952d = false;
                i13 = -3;
                if (this.f387814s != this.f387811p) {
                    vw vwVar = this.f387798c.b(c()).f387825a;
                    if (!z13 && vwVar == this.f387802g) {
                        int iC2 = c(this.f387814s);
                        com.yandex.mobile.ads.exo.drm.e eVar = this.f387803h;
                        if (eVar != null && eVar.c() != 4 && ((this.f387808m[iC2] & 1073741824) != 0 || !this.f387803h.d())) {
                            vnVar.f390952d = true;
                        }
                        vnVar.d(this.f387808m[iC2]);
                        long j12 = this.f387809n[iC2];
                        vnVar.f390953e = j12;
                        if (j12 < this.f387815t) {
                            vnVar.b(BeduinInputModel.MIN_TEXT_VERSION);
                        }
                        aVar.f387822a = this.f387807l[iC2];
                        aVar.f387823b = this.f387806k[iC2];
                        aVar.f387824c = this.f387810o[iC2];
                        i13 = -4;
                    }
                    a(vwVar, wwVar);
                    i13 = -5;
                } else {
                    if (!z12 && !this.f387818w) {
                        vw vwVar2 = this.f387821z;
                        if (vwVar2 != null && (z13 || vwVar2 != this.f387802g)) {
                            a(vwVar2, wwVar);
                            i13 = -5;
                        }
                    }
                    vnVar.d(4);
                    i13 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i13 == -4 && !vnVar.f()) {
            boolean z14 = (i12 & 1) != 0;
            if ((i12 & 4) == 0) {
                if (z14) {
                    this.f387796a.a(vnVar, this.f387797b);
                } else {
                    this.f387796a.b(vnVar, this.f387797b);
                }
            }
            if (!z14) {
                this.f387814s++;
            }
        }
        return i13;
    }

    public final synchronized long b() {
        return this.f387817v;
    }

    public final synchronized boolean b(long j12, boolean z12) {
        synchronized (this) {
            this.f387814s = 0;
            this.f387796a.c();
        }
        int iC2 = c(this.f387814s);
        int i12 = this.f387814s;
        int i13 = this.f387811p;
        if (i12 != i13 && j12 >= this.f387809n[iC2] && (j12 <= this.f387817v || z12)) {
            int iA2 = a(iC2, i13 - i12, j12, true);
            if (iA2 == -1) {
                return false;
            }
            this.f387815t = j12;
            this.f387814s += iA2;
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public final void b(int i12, pr0 pr0Var) {
        this.f387796a.a(i12, pr0Var);
    }

    private long b(int i12) {
        long jMax = Long.MIN_VALUE;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int iC2 = c(i12 - 1);
        for (int i13 = 0; i13 < i12; i13++) {
            jMax = Math.max(jMax, this.f387809n[iC2]);
            if ((this.f387808m[iC2] & 1) != 0) {
                break;
            }
            iC2--;
            if (iC2 == -1) {
                iC2 = this.f387804i - 1;
            }
        }
        return jMax;
    }

    public final synchronized int a(long j12, boolean z12) {
        int iC2 = c(this.f387814s);
        int i12 = this.f387814s;
        int i13 = this.f387811p;
        if (i12 != i13 && j12 >= this.f387809n[iC2]) {
            if (j12 > this.f387817v && z12) {
                return i13 - i12;
            }
            int iA2 = a(iC2, i13 - i12, j12, true);
            if (iA2 == -1) {
                return 0;
            }
            return iA2;
        }
        return 0;
    }

    public final void a(long j12, boolean z12, boolean z13) {
        long jA2;
        int i12;
        l11 l11Var = this.f387796a;
        synchronized (this) {
            try {
                int i13 = this.f387811p;
                if (i13 != 0) {
                    long[] jArr = this.f387809n;
                    int i14 = this.f387813r;
                    if (j12 >= jArr[i14]) {
                        if (z13 && (i12 = this.f387814s) != i13) {
                            i13 = i12 + 1;
                        }
                        int iA2 = a(i14, i13, j12, z12);
                        if (iA2 != -1) {
                            jA2 = a(iA2);
                        }
                    }
                    jA2 = -1;
                } else {
                    jA2 = -1;
                }
            } finally {
            }
        }
        l11Var.a(jA2);
    }

    public final void a() {
        long jA2;
        l11 l11Var = this.f387796a;
        synchronized (this) {
            int i12 = this.f387811p;
            jA2 = i12 == 0 ? -1L : a(i12);
        }
        l11Var.a(jA2);
    }

    public final void a(@j.P c cVar) {
        this.f387801f = cVar;
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public final void a(vw vwVar) {
        boolean z12;
        synchronized (this) {
            z12 = false;
            try {
                this.f387820y = false;
                if (!pc1.a(vwVar, this.f387821z)) {
                    if (!this.f387798c.c() && this.f387798c.b().f387825a.equals(vwVar)) {
                        this.f387821z = this.f387798c.b().f387825a;
                    } else {
                        this.f387821z = vwVar;
                    }
                    vw vwVar2 = this.f387821z;
                    this.f387794A = qg0.a(vwVar2.f391181l, vwVar2.f391178i);
                    this.f387795B = false;
                    z12 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c cVar = this.f387801f;
        if (cVar == null || !z12) {
            return;
        }
        ((lv0) cVar).k();
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public final int a(dn dnVar, int i12, boolean z12) {
        return this.f387796a.a(dnVar, i12, z12);
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public final void a(long j12, int i12, int i13, int i14, @j.P x91.a aVar) {
        g.b bVarB;
        int i15 = i12 & 1;
        int i16 = 0;
        boolean z12 = i15 != 0;
        if (this.f387819x) {
            if (!z12) {
                return;
            } else {
                this.f387819x = false;
            }
        }
        if (this.f387794A) {
            if (j12 < this.f387815t) {
                return;
            }
            if (i15 == 0) {
                if (!this.f387795B) {
                    StringBuilder sbA = Cif.a("Overriding unexpected non-sync sample for format: ");
                    sbA.append(this.f387821z);
                    ka0.d("SampleQueue", sbA.toString());
                    this.f387795B = true;
                }
                i12 |= 1;
            }
        }
        long jA2 = (this.f387796a.a() - i13) - i14;
        synchronized (this) {
            try {
                int i17 = this.f387811p;
                if (i17 > 0) {
                    int iC2 = c(i17 - 1);
                    db.a(this.f387806k[iC2] + ((long) this.f387807l[iC2]) <= jA2);
                }
                this.f387818w = (536870912 & i12) != 0;
                this.f387817v = Math.max(this.f387817v, j12);
                int iC3 = c(this.f387811p);
                this.f387809n[iC3] = j12;
                this.f387806k[iC3] = jA2;
                this.f387807l[iC3] = i13;
                this.f387808m[iC3] = i12;
                this.f387810o[iC3] = aVar;
                this.f387805j[iC3] = 0;
                if (this.f387798c.c() || !this.f387798c.b().f387825a.equals(this.f387821z)) {
                    com.yandex.mobile.ads.exo.drm.g gVar = this.f387799d;
                    if (gVar != null) {
                        bVarB = gVar.b(this.f387800e, this.f387821z);
                    } else {
                        bVarB = g.b.f382917a;
                    }
                    h61<b> h61Var = this.f387798c;
                    int iE2 = e();
                    vw vwVar = this.f387821z;
                    vwVar.getClass();
                    h61Var.a(iE2, new b(vwVar, bVarB, i16));
                }
                int i18 = this.f387811p + 1;
                this.f387811p = i18;
                int i19 = this.f387804i;
                if (i18 == i19) {
                    int i22 = i19 + 1000;
                    int[] iArr = new int[i22];
                    long[] jArr = new long[i22];
                    long[] jArr2 = new long[i22];
                    int[] iArr2 = new int[i22];
                    int[] iArr3 = new int[i22];
                    x91.a[] aVarArr = new x91.a[i22];
                    int i23 = this.f387813r;
                    int i24 = i19 - i23;
                    System.arraycopy(this.f387806k, i23, jArr, 0, i24);
                    System.arraycopy(this.f387809n, this.f387813r, jArr2, 0, i24);
                    System.arraycopy(this.f387808m, this.f387813r, iArr2, 0, i24);
                    System.arraycopy(this.f387807l, this.f387813r, iArr3, 0, i24);
                    System.arraycopy(this.f387810o, this.f387813r, aVarArr, 0, i24);
                    System.arraycopy(this.f387805j, this.f387813r, iArr, 0, i24);
                    int i25 = this.f387813r;
                    System.arraycopy(this.f387806k, 0, jArr, i24, i25);
                    System.arraycopy(this.f387809n, 0, jArr2, i24, i25);
                    System.arraycopy(this.f387808m, 0, iArr2, i24, i25);
                    System.arraycopy(this.f387807l, 0, iArr3, i24, i25);
                    System.arraycopy(this.f387810o, 0, aVarArr, i24, i25);
                    System.arraycopy(this.f387805j, 0, iArr, i24, i25);
                    this.f387806k = jArr;
                    this.f387809n = jArr2;
                    this.f387808m = iArr2;
                    this.f387807l = iArr3;
                    this.f387810o = aVarArr;
                    this.f387805j = iArr;
                    this.f387813r = 0;
                    this.f387804i = i22;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @InterfaceC42153i
    public final synchronized boolean a(boolean z12) {
        vw vwVar;
        boolean z13 = false;
        if (this.f387814s != this.f387811p) {
            if (this.f387798c.b(c()).f387825a != this.f387802g) {
                return true;
            }
            int iC2 = c(this.f387814s);
            com.yandex.mobile.ads.exo.drm.e eVar = this.f387803h;
            if (eVar == null || eVar.c() == 4 || ((this.f387808m[iC2] & 1073741824) == 0 && this.f387803h.d())) {
                z13 = true;
            }
            return z13;
        }
        if (z12 || this.f387818w || ((vwVar = this.f387821z) != null && vwVar != this.f387802g)) {
            z13 = true;
        }
        return z13;
    }

    private void a(vw vwVar, ww wwVar) {
        vw vwVar2 = this.f387802g;
        boolean z12 = vwVar2 == null;
        DrmInitData drmInitData = z12 ? null : vwVar2.f391184o;
        this.f387802g = vwVar;
        DrmInitData drmInitData2 = vwVar.f391184o;
        com.yandex.mobile.ads.exo.drm.g gVar = this.f387799d;
        wwVar.f391506b = gVar != null ? vwVar.a().d(gVar.a(vwVar)).a() : vwVar;
        wwVar.f391505a = this.f387803h;
        if (this.f387799d == null) {
            return;
        }
        if (z12 || !pc1.a(drmInitData, drmInitData2)) {
            com.yandex.mobile.ads.exo.drm.e eVar = this.f387803h;
            com.yandex.mobile.ads.exo.drm.e eVarA = this.f387799d.a(this.f387800e, vwVar);
            this.f387803h = eVarA;
            wwVar.f391505a = eVarA;
            if (eVar != null) {
                eVar.a(this.f387800e);
            }
        }
    }

    private int a(int i12, int i13, long j12, boolean z12) {
        int i14 = -1;
        for (int i15 = 0; i15 < i13; i15++) {
            long j13 = this.f387809n[i12];
            if (j13 > j12) {
                break;
            }
            if (!z12 || (this.f387808m[i12] & 1) != 0) {
                i14 = i15;
                if (j13 == j12) {
                    break;
                }
            }
            i12++;
            if (i12 == this.f387804i) {
                i12 = 0;
            }
        }
        return i14;
    }

    @j.B
    private long a(int i12) {
        this.f387816u = Math.max(this.f387816u, b(i12));
        this.f387811p -= i12;
        int i13 = this.f387812q + i12;
        this.f387812q = i13;
        int i14 = this.f387813r + i12;
        this.f387813r = i14;
        int i15 = this.f387804i;
        if (i14 >= i15) {
            this.f387813r = i14 - i15;
        }
        int i16 = this.f387814s - i12;
        this.f387814s = i16;
        if (i16 < 0) {
            this.f387814s = 0;
        }
        this.f387798c.a(i13);
        if (this.f387811p == 0) {
            int i17 = this.f387813r;
            if (i17 == 0) {
                i17 = this.f387804i;
            }
            return this.f387806k[i17 - 1] + this.f387807l[r6];
        }
        return this.f387806k[this.f387813r];
    }
}
