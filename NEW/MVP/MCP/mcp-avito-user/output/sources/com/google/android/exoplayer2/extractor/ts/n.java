package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ts.D;

/* compiled from: H265Reader.java */
/* loaded from: classes6.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z f345220a;

    /* renamed from: b, reason: collision with root package name */
    public String f345221b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345222c;

    /* renamed from: d, reason: collision with root package name */
    public a f345223d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f345224e;

    /* renamed from: l, reason: collision with root package name */
    public long f345231l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f345225f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final r f345226g = new r(32);

    /* renamed from: h, reason: collision with root package name */
    public final r f345227h = new r(33);

    /* renamed from: i, reason: collision with root package name */
    public final r f345228i = new r(34);

    /* renamed from: j, reason: collision with root package name */
    public final r f345229j = new r(39);

    /* renamed from: k, reason: collision with root package name */
    public final r f345230k = new r(40);

    /* renamed from: m, reason: collision with root package name */
    public long f345232m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345233n = new com.google.android.exoplayer2.util.F();

    /* compiled from: H265Reader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.extractor.A f345234a;

        /* renamed from: b, reason: collision with root package name */
        public long f345235b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f345236c;

        /* renamed from: d, reason: collision with root package name */
        public int f345237d;

        /* renamed from: e, reason: collision with root package name */
        public long f345238e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f345239f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f345240g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f345241h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f345242i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f345243j;

        /* renamed from: k, reason: collision with root package name */
        public long f345244k;

        /* renamed from: l, reason: collision with root package name */
        public long f345245l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f345246m;

        public a(com.google.android.exoplayer2.extractor.A a12) {
            this.f345234a = a12;
        }
    }

    public n(z zVar) {
        this.f345220a = zVar;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void a() {
        this.f345231l = 0L;
        this.f345232m = -9223372036854775807L;
        com.google.android.exoplayer2.util.A.a(this.f345225f);
        this.f345226g.c();
        this.f345227h.c();
        this.f345228i.c();
        this.f345229j.c();
        this.f345230k.c();
        a aVar = this.f345223d;
        if (aVar != null) {
            aVar.f345239f = false;
            aVar.f345240g = false;
            aVar.f345241h = false;
            aVar.f345242i = false;
            aVar.f345243j = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x049d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    @Override // com.google.android.exoplayer2.extractor.ts.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.exoplayer2.util.F r43) {
        /*
            Method dump skipped, instructions count: 1205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.n.c(com.google.android.exoplayer2.util.F):void");
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f345232m = j12;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void e(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f345221b = eVar.f345040e;
        eVar.b();
        com.google.android.exoplayer2.extractor.A aC2 = lVar.c(eVar.f345039d, 2);
        this.f345222c = aC2;
        this.f345223d = new a(aC2);
        this.f345220a.a(lVar, eVar);
    }

    @v61.m
    public final void f(int i12, int i13, byte[] bArr) {
        a aVar = this.f345223d;
        if (aVar.f345239f) {
            int i14 = aVar.f345237d;
            int i15 = (i12 + 2) - i14;
            if (i15 < i13) {
                aVar.f345240g = (bArr[i15] & 128) != 0;
                aVar.f345239f = false;
            } else {
                aVar.f345237d = (i13 - i12) + i14;
            }
        }
        if (!this.f345224e) {
            this.f345226g.a(i12, i13, bArr);
            this.f345227h.a(i12, i13, bArr);
            this.f345228i.a(i12, i13, bArr);
        }
        this.f345229j.a(i12, i13, bArr);
        this.f345230k.a(i12, i13, bArr);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void b() {
    }
}
