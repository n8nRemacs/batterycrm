package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ts.D;
import j.P;
import java.util.Arrays;

/* compiled from: H262Reader.java */
/* loaded from: classes6.dex */
public final class k implements j {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f345123q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f345124a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345125b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final F f345126c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final com.google.android.exoplayer2.util.F f345127d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final r f345128e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f345129f;

    /* renamed from: g, reason: collision with root package name */
    public final a f345130g;

    /* renamed from: h, reason: collision with root package name */
    public long f345131h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f345132i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f345133j;

    /* renamed from: k, reason: collision with root package name */
    public long f345134k;

    /* renamed from: l, reason: collision with root package name */
    public long f345135l;

    /* renamed from: m, reason: collision with root package name */
    public long f345136m;

    /* renamed from: n, reason: collision with root package name */
    public long f345137n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f345138o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f345139p;

    /* compiled from: H262Reader.java */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f345140e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f345141a;

        /* renamed from: b, reason: collision with root package name */
        public int f345142b;

        /* renamed from: c, reason: collision with root package name */
        public int f345143c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f345144d;

        public final void a(int i12, int i13, byte[] bArr) {
            if (this.f345141a) {
                int i14 = i13 - i12;
                byte[] bArr2 = this.f345144d;
                int length = bArr2.length;
                int i15 = this.f345142b + i14;
                if (length < i15) {
                    this.f345144d = Arrays.copyOf(bArr2, i15 * 2);
                }
                System.arraycopy(bArr, i12, this.f345144d, this.f345142b, i14);
                this.f345142b += i14;
            }
        }
    }

    public k() {
        this(null);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void a() {
        com.google.android.exoplayer2.util.A.a(this.f345129f);
        a aVar = this.f345130g;
        aVar.f345141a = false;
        aVar.f345142b = 0;
        aVar.f345143c = 0;
        r rVar = this.f345128e;
        if (rVar != null) {
            rVar.c();
        }
        this.f345131h = 0L;
        this.f345132i = false;
        this.f345135l = -9223372036854775807L;
        this.f345137n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x018d  */
    @Override // com.google.android.exoplayer2.extractor.ts.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.exoplayer2.util.F r27) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.k.c(com.google.android.exoplayer2.util.F):void");
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void d(int i12, long j12) {
        this.f345135l = j12;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void e(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f345124a = eVar.f345040e;
        eVar.b();
        this.f345125b = lVar.c(eVar.f345039d, 2);
        F f12 = this.f345126c;
        if (f12 != null) {
            f12.b(lVar, eVar);
        }
    }

    public k(@P F f12) {
        this.f345126c = f12;
        this.f345129f = new boolean[4];
        a aVar = new a();
        aVar.f345144d = new byte[128];
        this.f345130g = aVar;
        if (f12 != null) {
            this.f345128e = new r(178);
            this.f345127d = new com.google.android.exoplayer2.util.F();
        } else {
            this.f345128e = null;
            this.f345127d = null;
        }
        this.f345135l = -9223372036854775807L;
        this.f345137n = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void b() {
    }
}
