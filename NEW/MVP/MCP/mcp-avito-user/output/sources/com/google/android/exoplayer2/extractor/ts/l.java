package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ts.D;
import j.P;
import java.util.Arrays;

/* compiled from: H263Reader.java */
/* loaded from: classes6.dex */
public final class l implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f345145l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    @P
    public final F f345146a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final com.google.android.exoplayer2.util.F f345147b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f345148c;

    /* renamed from: d, reason: collision with root package name */
    public final a f345149d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final r f345150e;

    /* renamed from: f, reason: collision with root package name */
    public b f345151f;

    /* renamed from: g, reason: collision with root package name */
    public long f345152g;

    /* renamed from: h, reason: collision with root package name */
    public String f345153h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345154i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f345155j;

    /* renamed from: k, reason: collision with root package name */
    public long f345156k;

    /* compiled from: H263Reader.java */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f345157f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f345158a;

        /* renamed from: b, reason: collision with root package name */
        public int f345159b;

        /* renamed from: c, reason: collision with root package name */
        public int f345160c;

        /* renamed from: d, reason: collision with root package name */
        public int f345161d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f345162e;

        public final void a(int i12, int i13, byte[] bArr) {
            if (this.f345158a) {
                int i14 = i13 - i12;
                byte[] bArr2 = this.f345162e;
                int length = bArr2.length;
                int i15 = this.f345160c + i14;
                if (length < i15) {
                    this.f345162e = Arrays.copyOf(bArr2, i15 * 2);
                }
                System.arraycopy(bArr, i12, this.f345162e, this.f345160c, i14);
                this.f345160c += i14;
            }
        }
    }

    /* compiled from: H263Reader.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.extractor.A f345163a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f345164b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f345165c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f345166d;

        /* renamed from: e, reason: collision with root package name */
        public int f345167e;

        /* renamed from: f, reason: collision with root package name */
        public int f345168f;

        /* renamed from: g, reason: collision with root package name */
        public long f345169g;

        /* renamed from: h, reason: collision with root package name */
        public long f345170h;

        public b(com.google.android.exoplayer2.extractor.A a12) {
            this.f345163a = a12;
        }

        public final void a(int i12, int i13, byte[] bArr) {
            if (this.f345165c) {
                int i14 = this.f345168f;
                int i15 = (i12 + 1) - i14;
                if (i15 >= i13) {
                    this.f345168f = (i13 - i12) + i14;
                } else {
                    this.f345166d = ((bArr[i15] & 192) >> 6) == 0;
                    this.f345165c = false;
                }
            }
        }
    }

    public l() {
        this(null);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void a() {
        com.google.android.exoplayer2.util.A.a(this.f345148c);
        a aVar = this.f345149d;
        aVar.f345158a = false;
        aVar.f345160c = 0;
        aVar.f345159b = 0;
        b bVar = this.f345151f;
        if (bVar != null) {
            bVar.f345164b = false;
            bVar.f345165c = false;
            bVar.f345166d = false;
            bVar.f345167e = -1;
        }
        r rVar = this.f345150e;
        if (rVar != null) {
            rVar.c();
        }
        this.f345152g = 0L;
        this.f345156k = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a A[LOOP:1: B:53:0x0128->B:54:0x012a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021f  */
    @Override // com.google.android.exoplayer2.extractor.ts.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.exoplayer2.util.F r26) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.l.c(com.google.android.exoplayer2.util.F):void");
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f345156k = j12;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void e(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f345153h = eVar.f345040e;
        eVar.b();
        com.google.android.exoplayer2.extractor.A aC2 = lVar.c(eVar.f345039d, 2);
        this.f345154i = aC2;
        this.f345151f = new b(aC2);
        F f12 = this.f345146a;
        if (f12 != null) {
            f12.b(lVar, eVar);
        }
    }

    public l(@P F f12) {
        this.f345146a = f12;
        this.f345148c = new boolean[4];
        a aVar = new a();
        aVar.f345162e = new byte[128];
        this.f345149d = aVar;
        this.f345156k = -9223372036854775807L;
        if (f12 != null) {
            this.f345150e = new r(178);
            this.f345147b = new com.google.android.exoplayer2.util.F();
        } else {
            this.f345150e = null;
            this.f345147b = null;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void b() {
    }
}
