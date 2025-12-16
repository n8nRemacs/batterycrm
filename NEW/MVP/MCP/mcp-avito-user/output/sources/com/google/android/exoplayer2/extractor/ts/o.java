package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.util.C36585a;

/* compiled from: Id3Reader.java */
/* loaded from: classes6.dex */
public final class o implements j {

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345248b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f345249c;

    /* renamed from: e, reason: collision with root package name */
    public int f345251e;

    /* renamed from: f, reason: collision with root package name */
    public int f345252f;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345247a = new com.google.android.exoplayer2.util.F(10);

    /* renamed from: d, reason: collision with root package name */
    public long f345250d = -9223372036854775807L;

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void a() {
        this.f345249c = false;
        this.f345250d = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void b() {
        int i12;
        C36585a.e(this.f345248b);
        if (this.f345249c && (i12 = this.f345251e) != 0 && this.f345252f == i12) {
            long j12 = this.f345250d;
            if (j12 != -9223372036854775807L) {
                this.f345248b.f(j12, 1, i12, 0, null);
            }
            this.f345249c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void c(com.google.android.exoplayer2.util.F f12) {
        C36585a.e(this.f345248b);
        if (this.f345249c) {
            int iA2 = f12.a();
            int i12 = this.f345252f;
            if (i12 < 10) {
                int iMin = Math.min(iA2, 10 - i12);
                byte[] bArr = f12.f348070a;
                int i13 = f12.f348071b;
                com.google.android.exoplayer2.util.F f13 = this.f345247a;
                System.arraycopy(bArr, i13, f13.f348070a, this.f345252f, iMin);
                if (this.f345252f + iMin == 10) {
                    f13.B(0);
                    if (73 != f13.r() || 68 != f13.r() || 51 != f13.r()) {
                        this.f345249c = false;
                        return;
                    } else {
                        f13.C(3);
                        this.f345251e = f13.q() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA2, this.f345251e - this.f345252f);
            this.f345248b.c(iMin2, f12);
            this.f345252f += iMin2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void d(int i12, long j12) {
        if ((i12 & 4) == 0) {
            return;
        }
        this.f345249c = true;
        if (j12 != -9223372036854775807L) {
            this.f345250d = j12;
        }
        this.f345251e = 0;
        this.f345252f = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void e(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        eVar.a();
        eVar.b();
        com.google.android.exoplayer2.extractor.A aC2 = lVar.c(eVar.f345039d, 5);
        this.f345248b = aC2;
        I.b bVar = new I.b();
        eVar.b();
        bVar.f343494a = eVar.f345040e;
        bVar.f343504k = "application/id3";
        aC2.a(bVar.a());
    }
}
