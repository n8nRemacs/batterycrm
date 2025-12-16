package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.util.A;
import j.P;

/* compiled from: H264Reader.java */
/* loaded from: classes6.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z f345171a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f345172b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f345173c;

    /* renamed from: g, reason: collision with root package name */
    public long f345177g;

    /* renamed from: i, reason: collision with root package name */
    public String f345179i;

    /* renamed from: j, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345180j;

    /* renamed from: k, reason: collision with root package name */
    public b f345181k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f345182l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f345184n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f345178h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final r f345174d = new r(7);

    /* renamed from: e, reason: collision with root package name */
    public final r f345175e = new r(8);

    /* renamed from: f, reason: collision with root package name */
    public final r f345176f = new r(6);

    /* renamed from: m, reason: collision with root package name */
    public long f345183m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345185o = new com.google.android.exoplayer2.util.F();

    /* compiled from: H264Reader.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.extractor.A f345186a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f345187b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f345188c;

        /* renamed from: f, reason: collision with root package name */
        public final com.google.android.exoplayer2.util.G f345191f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f345192g;

        /* renamed from: h, reason: collision with root package name */
        public int f345193h;

        /* renamed from: i, reason: collision with root package name */
        public int f345194i;

        /* renamed from: j, reason: collision with root package name */
        public long f345195j;

        /* renamed from: l, reason: collision with root package name */
        public long f345197l;

        /* renamed from: m, reason: collision with root package name */
        public a f345198m;

        /* renamed from: n, reason: collision with root package name */
        public a f345199n;

        /* renamed from: p, reason: collision with root package name */
        public long f345201p;

        /* renamed from: q, reason: collision with root package name */
        public long f345202q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f345203r;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<A.c> f345189d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<A.b> f345190e = new SparseArray<>();

        /* renamed from: k, reason: collision with root package name */
        public boolean f345196k = false;

        /* renamed from: o, reason: collision with root package name */
        public boolean f345200o = false;

        /* compiled from: H264Reader.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f345204a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f345205b;

            /* renamed from: c, reason: collision with root package name */
            @P
            public A.c f345206c;

            /* renamed from: d, reason: collision with root package name */
            public int f345207d;

            /* renamed from: e, reason: collision with root package name */
            public int f345208e;

            /* renamed from: f, reason: collision with root package name */
            public int f345209f;

            /* renamed from: g, reason: collision with root package name */
            public int f345210g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f345211h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f345212i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f345213j;

            /* renamed from: k, reason: collision with root package name */
            public boolean f345214k;

            /* renamed from: l, reason: collision with root package name */
            public int f345215l;

            /* renamed from: m, reason: collision with root package name */
            public int f345216m;

            /* renamed from: n, reason: collision with root package name */
            public int f345217n;

            /* renamed from: o, reason: collision with root package name */
            public int f345218o;

            /* renamed from: p, reason: collision with root package name */
            public int f345219p;

            public a() {
            }
        }

        public b(com.google.android.exoplayer2.extractor.A a12, boolean z12, boolean z13) {
            this.f345186a = a12;
            this.f345187b = z12;
            this.f345188c = z13;
            this.f345198m = new a();
            this.f345199n = new a();
            byte[] bArr = new byte[128];
            this.f345192g = bArr;
            this.f345191f = new com.google.android.exoplayer2.util.G(bArr, 0, 0);
            a aVar = this.f345199n;
            aVar.f345205b = false;
            aVar.f345204a = false;
        }
    }

    public m(z zVar, boolean z12, boolean z13) {
        this.f345171a = zVar;
        this.f345172b = z12;
        this.f345173c = z13;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void a() {
        this.f345177g = 0L;
        this.f345184n = false;
        this.f345183m = -9223372036854775807L;
        com.google.android.exoplayer2.util.A.a(this.f345178h);
        this.f345174d.c();
        this.f345175e.c();
        this.f345176f.c();
        b bVar = this.f345181k;
        if (bVar != null) {
            bVar.f345196k = false;
            bVar.f345200o = false;
            b.a aVar = bVar.f345199n;
            aVar.f345205b = false;
            aVar.f345204a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021b  */
    @Override // com.google.android.exoplayer2.extractor.ts.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.exoplayer2.util.F r29) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.m.c(com.google.android.exoplayer2.util.F):void");
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f345183m = j12;
        }
        this.f345184n = ((i12 & 2) != 0) | this.f345184n;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void e(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f345179i = eVar.f345040e;
        eVar.b();
        com.google.android.exoplayer2.extractor.A aC2 = lVar.c(eVar.f345039d, 2);
        this.f345180j = aC2;
        this.f345181k = new b(aC2, this.f345172b, this.f345173c);
        this.f345171a.a(lVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    @v61.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r18, int r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.m.f(int, int, byte[]):void");
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void b() {
    }
}
