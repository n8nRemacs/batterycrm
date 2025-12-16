package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;

/* loaded from: classes8.dex */
public final class az implements is {

    /* renamed from: a, reason: collision with root package name */
    private final c31 f383693a;

    /* renamed from: b, reason: collision with root package name */
    private String f383694b;

    /* renamed from: c, reason: collision with root package name */
    private x91 f383695c;

    /* renamed from: d, reason: collision with root package name */
    private a f383696d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f383697e;

    /* renamed from: l, reason: collision with root package name */
    private long f383704l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f383698f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final kj0 f383699g = new kj0(32);

    /* renamed from: h, reason: collision with root package name */
    private final kj0 f383700h = new kj0(33);

    /* renamed from: i, reason: collision with root package name */
    private final kj0 f383701i = new kj0(34);

    /* renamed from: j, reason: collision with root package name */
    private final kj0 f383702j = new kj0(39);

    /* renamed from: k, reason: collision with root package name */
    private final kj0 f383703k = new kj0(40);

    /* renamed from: m, reason: collision with root package name */
    private long f383705m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final pr0 f383706n = new pr0();

    public az(c31 c31Var) {
        this.f383693a = c31Var;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a() {
        this.f383704l = 0L;
        this.f383705m = -9223372036854775807L;
        lj0.a(this.f383698f);
        this.f383699g.b();
        this.f383700h.b();
        this.f383701i.b();
        this.f383702j.b();
        this.f383703k.b();
        a aVar = this.f383696d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final x91 f383707a;

        /* renamed from: b, reason: collision with root package name */
        private long f383708b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f383709c;

        /* renamed from: d, reason: collision with root package name */
        private int f383710d;

        /* renamed from: e, reason: collision with root package name */
        private long f383711e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f383712f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f383713g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f383714h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f383715i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f383716j;

        /* renamed from: k, reason: collision with root package name */
        private long f383717k;

        /* renamed from: l, reason: collision with root package name */
        private long f383718l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f383719m;

        public a(x91 x91Var) {
            this.f383707a = x91Var;
        }

        public final void a() {
            this.f383712f = false;
            this.f383713g = false;
            this.f383714h = false;
            this.f383715i = false;
            this.f383716j = false;
        }

        public final void a(int i12, int i13, long j12, long j13, boolean z12) {
            this.f383713g = false;
            this.f383714h = false;
            this.f383711e = j13;
            this.f383710d = 0;
            this.f383708b = j12;
            if (i13 >= 32 && i13 != 40) {
                if (this.f383715i && !this.f383716j) {
                    if (z12) {
                        long j14 = this.f383718l;
                        if (j14 != -9223372036854775807L) {
                            this.f383707a.a(j14, this.f383719m ? 1 : 0, (int) (j12 - this.f383717k), i12, null);
                        }
                    }
                    this.f383715i = false;
                }
                if ((32 <= i13 && i13 <= 35) || i13 == 39) {
                    this.f383714h = !this.f383716j;
                    this.f383716j = true;
                }
            }
            boolean z13 = i13 >= 16 && i13 <= 21;
            this.f383709c = z13;
            this.f383712f = z13 || i13 <= 9;
        }

        public final void a(byte[] bArr, int i12, int i13) {
            if (this.f383712f) {
                int i14 = this.f383710d;
                int i15 = (i12 + 2) - i14;
                if (i15 < i13) {
                    this.f383713g = (bArr[i15] & 128) != 0;
                    this.f383712f = false;
                } else {
                    this.f383710d = (i13 - i12) + i14;
                }
            }
        }

        public final void a(int i12, long j12, boolean z12) {
            if (this.f383716j && this.f383713g) {
                this.f383719m = this.f383709c;
                this.f383716j = false;
                return;
            }
            if (this.f383714h || this.f383713g) {
                if (z12 && this.f383715i) {
                    long j13 = this.f383708b;
                    int i13 = i12 + ((int) (j12 - j13));
                    long j14 = this.f383718l;
                    if (j14 != -9223372036854775807L) {
                        boolean z13 = this.f383719m;
                        this.f383707a.a(j14, z13 ? 1 : 0, (int) (j13 - this.f383717k), i13, null);
                    }
                }
                this.f383717k = this.f383708b;
                this.f383718l = this.f383711e;
                this.f383719m = this.f383709c;
                this.f383715i = true;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(tu tuVar, fb1.d dVar) {
        dVar.a();
        this.f383694b = dVar.b();
        x91 x91VarA = tuVar.a(dVar.c(), 2);
        this.f383695c = x91VarA;
        this.f383696d = new a(x91VarA);
        this.f383693a.a(tuVar, dVar);
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f383705m = j12;
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x03a2  */
    @Override // com.yandex.mobile.ads.impl.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.yandex.mobile.ads.impl.pr0 r37) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.az.a(com.yandex.mobile.ads.impl.pr0):void");
    }
}
