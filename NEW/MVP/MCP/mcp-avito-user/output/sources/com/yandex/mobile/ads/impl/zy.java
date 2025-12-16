package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.lj0;

/* loaded from: classes8.dex */
public final class zy implements is {

    /* renamed from: a, reason: collision with root package name */
    private final c31 f392404a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f392405b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f392406c;

    /* renamed from: g, reason: collision with root package name */
    private long f392410g;

    /* renamed from: i, reason: collision with root package name */
    private String f392412i;

    /* renamed from: j, reason: collision with root package name */
    private x91 f392413j;

    /* renamed from: k, reason: collision with root package name */
    private a f392414k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f392415l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f392417n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f392411h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    private final kj0 f392407d = new kj0(7);

    /* renamed from: e, reason: collision with root package name */
    private final kj0 f392408e = new kj0(8);

    /* renamed from: f, reason: collision with root package name */
    private final kj0 f392409f = new kj0(6);

    /* renamed from: m, reason: collision with root package name */
    private long f392416m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private final pr0 f392418o = new pr0();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final x91 f392419a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f392420b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f392421c;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray<lj0.c> f392422d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray<lj0.b> f392423e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        private final qr0 f392424f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f392425g;

        /* renamed from: h, reason: collision with root package name */
        private int f392426h;

        /* renamed from: i, reason: collision with root package name */
        private int f392427i;

        /* renamed from: j, reason: collision with root package name */
        private long f392428j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f392429k;

        /* renamed from: l, reason: collision with root package name */
        private long f392430l;

        /* renamed from: m, reason: collision with root package name */
        private C10988a f392431m;

        /* renamed from: n, reason: collision with root package name */
        private C10988a f392432n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f392433o;

        /* renamed from: p, reason: collision with root package name */
        private long f392434p;

        /* renamed from: q, reason: collision with root package name */
        private long f392435q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f392436r;

        /* renamed from: com.yandex.mobile.ads.impl.zy$a$a, reason: collision with other inner class name */
        public static final class C10988a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f392437a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f392438b;

            /* renamed from: c, reason: collision with root package name */
            @j.P
            private lj0.c f392439c;

            /* renamed from: d, reason: collision with root package name */
            private int f392440d;

            /* renamed from: e, reason: collision with root package name */
            private int f392441e;

            /* renamed from: f, reason: collision with root package name */
            private int f392442f;

            /* renamed from: g, reason: collision with root package name */
            private int f392443g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f392444h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f392445i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f392446j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f392447k;

            /* renamed from: l, reason: collision with root package name */
            private int f392448l;

            /* renamed from: m, reason: collision with root package name */
            private int f392449m;

            /* renamed from: n, reason: collision with root package name */
            private int f392450n;

            /* renamed from: o, reason: collision with root package name */
            private int f392451o;

            /* renamed from: p, reason: collision with root package name */
            private int f392452p;

            private C10988a() {
            }

            public final void a() {
                this.f392438b = false;
                this.f392437a = false;
            }

            public final boolean b() {
                int i12;
                return this.f392438b && ((i12 = this.f392441e) == 7 || i12 == 2);
            }

            public /* synthetic */ C10988a(int i12) {
                this();
            }

            public final void a(int i12) {
                this.f392441e = i12;
                this.f392438b = true;
            }

            public final void a(lj0.c cVar, int i12, int i13, int i14, int i15, boolean z12, boolean z13, boolean z14, boolean z15, int i16, int i17, int i18, int i19, int i22) {
                this.f392439c = cVar;
                this.f392440d = i12;
                this.f392441e = i13;
                this.f392442f = i14;
                this.f392443g = i15;
                this.f392444h = z12;
                this.f392445i = z13;
                this.f392446j = z14;
                this.f392447k = z15;
                this.f392448l = i16;
                this.f392449m = i17;
                this.f392450n = i18;
                this.f392451o = i19;
                this.f392452p = i22;
                this.f392437a = true;
                this.f392438b = true;
            }

            public static boolean a(C10988a c10988a, C10988a c10988a2) {
                boolean z12;
                if (c10988a.f392437a) {
                    if (!c10988a2.f392437a) {
                        return true;
                    }
                    lj0.c cVar = (lj0.c) db.b(c10988a.f392439c);
                    lj0.c cVar2 = (lj0.c) db.b(c10988a2.f392439c);
                    if (c10988a.f392442f != c10988a2.f392442f || c10988a.f392443g != c10988a2.f392443g || c10988a.f392444h != c10988a2.f392444h) {
                        return true;
                    }
                    if (c10988a.f392445i && c10988a2.f392445i && c10988a.f392446j != c10988a2.f392446j) {
                        return true;
                    }
                    int i12 = c10988a.f392440d;
                    int i13 = c10988a2.f392440d;
                    if (i12 != i13 && (i12 == 0 || i13 == 0)) {
                        return true;
                    }
                    int i14 = cVar.f387544k;
                    if (i14 == 0 && cVar2.f387544k == 0 && (c10988a.f392449m != c10988a2.f392449m || c10988a.f392450n != c10988a2.f392450n)) {
                        return true;
                    }
                    if ((i14 == 1 && cVar2.f387544k == 1 && (c10988a.f392451o != c10988a2.f392451o || c10988a.f392452p != c10988a2.f392452p)) || (z12 = c10988a.f392447k) != c10988a2.f392447k) {
                        return true;
                    }
                    if (z12 && c10988a.f392448l != c10988a2.f392448l) {
                        return true;
                    }
                }
                return false;
            }
        }

        public a(x91 x91Var, boolean z12, boolean z13) {
            this.f392419a = x91Var;
            this.f392420b = z12;
            this.f392421c = z13;
            int i12 = 0;
            this.f392431m = new C10988a(i12);
            this.f392432n = new C10988a(i12);
            byte[] bArr = new byte[128];
            this.f392425g = bArr;
            this.f392424f = new qr0(bArr, 0, 0);
            b();
        }

        public final boolean a() {
            return this.f392421c;
        }

        public final void b() {
            this.f392429k = false;
            this.f392433o = false;
            this.f392432n.a();
        }

        public final void a(lj0.c cVar) {
            this.f392422d.append(cVar.f387537d, cVar);
        }

        public final void a(lj0.b bVar) {
            this.f392423e.append(bVar.f387531a, bVar);
        }

        public final void a(int i12, long j12, long j13) {
            this.f392427i = i12;
            this.f392430l = j13;
            this.f392428j = j12;
            if (!this.f392420b || i12 != 1) {
                if (!this.f392421c) {
                    return;
                }
                if (i12 != 5 && i12 != 1 && i12 != 2) {
                    return;
                }
            }
            C10988a c10988a = this.f392431m;
            this.f392431m = this.f392432n;
            this.f392432n = c10988a;
            c10988a.a();
            this.f392426h = 0;
            this.f392429k = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 412
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zy.a.a(byte[], int, int):void");
        }

        public final boolean a(long j12, int i12, boolean z12, boolean z13) {
            boolean z14 = false;
            if (this.f392427i == 9 || (this.f392421c && C10988a.a(this.f392432n, this.f392431m))) {
                if (z12 && this.f392433o) {
                    long j13 = this.f392428j;
                    int i13 = i12 + ((int) (j12 - j13));
                    long j14 = this.f392435q;
                    if (j14 != -9223372036854775807L) {
                        this.f392419a.a(j14, this.f392436r ? 1 : 0, (int) (j13 - this.f392434p), i13, null);
                    }
                }
                this.f392434p = this.f392428j;
                this.f392435q = this.f392430l;
                this.f392436r = false;
                this.f392433o = true;
            }
            boolean zB2 = this.f392420b ? this.f392432n.b() : z13;
            boolean z15 = this.f392436r;
            int i14 = this.f392427i;
            if (i14 == 5 || (zB2 && i14 == 1)) {
                z14 = true;
            }
            boolean z16 = z15 | z14;
            this.f392436r = z16;
            return z16;
        }
    }

    public zy(c31 c31Var, boolean z12, boolean z13) {
        this.f392404a = c31Var;
        this.f392405b = z12;
        this.f392406c = z13;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a() {
        this.f392410g = 0L;
        this.f392417n = false;
        this.f392416m = -9223372036854775807L;
        lj0.a(this.f392411h);
        this.f392407d.b();
        this.f392408e.b();
        this.f392409f.b();
        a aVar = this.f392414k;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(tu tuVar, fb1.d dVar) {
        dVar.a();
        this.f392412i = dVar.b();
        x91 x91VarA = tuVar.a(dVar.c(), 2);
        this.f392413j = x91VarA;
        this.f392414k = new a(x91VarA, this.f392405b, this.f392406c);
        this.f392404a.a(tuVar, dVar);
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f392416m = j12;
        }
        this.f392417n = ((i12 & 2) != 0) | this.f392417n;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    @Override // com.yandex.mobile.ads.impl.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.yandex.mobile.ads.impl.pr0 r19) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zy.a(com.yandex.mobile.ads.impl.pr0):void");
    }
}
