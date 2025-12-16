package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.ts.D;
import j.P;
import java.util.Arrays;

/* compiled from: AdtsReader.java */
/* renamed from: com.google.android.exoplayer2.extractor.ts.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36521f implements j {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f345082v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f345083a;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f345086d;

    /* renamed from: e, reason: collision with root package name */
    public String f345087e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345088f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345089g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f345093k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f345094l;

    /* renamed from: o, reason: collision with root package name */
    public int f345097o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f345098p;

    /* renamed from: r, reason: collision with root package name */
    public int f345100r;

    /* renamed from: t, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345102t;

    /* renamed from: u, reason: collision with root package name */
    public long f345103u;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.E f345084b = new com.google.android.exoplayer2.util.E(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345085c = new com.google.android.exoplayer2.util.F(Arrays.copyOf(f345082v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f345090h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f345091i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f345092j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f345095m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f345096n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f345099q = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f345101s = -9223372036854775807L;

    public C36521f(boolean z12, @P String str) {
        this.f345083a = z12;
        this.f345086d = str;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void a() {
        this.f345101s = -9223372036854775807L;
        this.f345094l = false;
        this.f345090h = 0;
        this.f345091i = 0;
        this.f345092j = 256;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02dd  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.google.android.exoplayer2.extractor.ts.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.exoplayer2.util.F r24) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.C36521f.c(com.google.android.exoplayer2.util.F):void");
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f345101s = j12;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void e(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f345087e = eVar.f345040e;
        eVar.b();
        com.google.android.exoplayer2.extractor.A aC2 = lVar.c(eVar.f345039d, 1);
        this.f345088f = aC2;
        this.f345102t = aC2;
        if (!this.f345083a) {
            this.f345089g = new com.google.android.exoplayer2.extractor.i();
            return;
        }
        eVar.a();
        eVar.b();
        com.google.android.exoplayer2.extractor.A aC3 = lVar.c(eVar.f345039d, 5);
        this.f345089g = aC3;
        I.b bVar = new I.b();
        eVar.b();
        bVar.f343494a = eVar.f345040e;
        bVar.f343504k = "application/id3";
        aC3.a(bVar.a());
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void b() {
    }
}
