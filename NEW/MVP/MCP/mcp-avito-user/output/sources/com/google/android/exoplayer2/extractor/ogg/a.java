package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;

/* compiled from: DefaultOggSeeker.java */
/* loaded from: classes6.dex */
final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final e f344910a;

    /* renamed from: b, reason: collision with root package name */
    public final long f344911b;

    /* renamed from: c, reason: collision with root package name */
    public final long f344912c;

    /* renamed from: d, reason: collision with root package name */
    public final h f344913d;

    /* renamed from: e, reason: collision with root package name */
    public int f344914e;

    /* renamed from: f, reason: collision with root package name */
    public long f344915f;

    /* renamed from: g, reason: collision with root package name */
    public long f344916g;

    /* renamed from: h, reason: collision with root package name */
    public long f344917h;

    /* renamed from: i, reason: collision with root package name */
    public long f344918i;

    /* renamed from: j, reason: collision with root package name */
    public long f344919j;

    /* renamed from: k, reason: collision with root package name */
    public long f344920k;

    /* renamed from: l, reason: collision with root package name */
    public long f344921l;

    /* compiled from: DefaultOggSeeker.java */
    public final class b implements y {
        public b(C10583a c10583a) {
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final long d() {
            return (a.this.f344915f * 1000000) / r0.f344913d.f344955i;
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final y.a f(long j12) {
            a aVar = a.this;
            long j13 = aVar.f344912c;
            long j14 = aVar.f344911b;
            z zVar = new z(j12, U.l(((((j13 - j14) * ((aVar.f344913d.f344955i * j12) / 1000000)) / aVar.f344915f) + j14) - 30000, j14, j13 - 1));
            return new y.a(zVar, zVar);
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final boolean g() {
            return true;
        }
    }

    public a(h hVar, long j12, long j13, long j14, long j15, boolean z12) {
        C36585a.b(j12 >= 0 && j13 > j12);
        this.f344913d = hVar;
        this.f344911b = j12;
        this.f344912c = j13;
        if (j14 == j13 - j12 || z12) {
            this.f344915f = j15;
            this.f344914e = 4;
        } else {
            this.f344914e = 0;
        }
        this.f344910a = new e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // com.google.android.exoplayer2.extractor.ogg.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.exoplayer2.extractor.f r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ogg.a.a(com.google.android.exoplayer2.extractor.f):long");
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.f
    @P
    public final y b() {
        if (this.f344915f != 0) {
            return new b(null);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.f
    public final void c(long j12) {
        this.f344917h = U.l(j12, 0L, this.f344915f - 1);
        this.f344914e = 2;
        this.f344918i = this.f344911b;
        this.f344919j = this.f344912c;
        this.f344920k = 0L;
        this.f344921l = this.f344915f;
    }
}
