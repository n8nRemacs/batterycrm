package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.ts.D;
import java.util.Collections;
import java.util.List;

/* compiled from: DvbSubtitleReader.java */
/* loaded from: classes6.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final List<D.a> f345117a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.extractor.A[] f345118b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f345119c;

    /* renamed from: d, reason: collision with root package name */
    public int f345120d;

    /* renamed from: e, reason: collision with root package name */
    public int f345121e;

    /* renamed from: f, reason: collision with root package name */
    public long f345122f = -9223372036854775807L;

    public i(List<D.a> list) {
        this.f345117a = list;
        this.f345118b = new com.google.android.exoplayer2.extractor.A[list.size()];
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void a() {
        this.f345119c = false;
        this.f345122f = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void b() {
        if (this.f345119c) {
            if (this.f345122f != -9223372036854775807L) {
                for (com.google.android.exoplayer2.extractor.A a12 : this.f345118b) {
                    a12.f(this.f345122f, 1, this.f345121e, 0, null);
                }
            }
            this.f345119c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void c(com.google.android.exoplayer2.util.F f12) {
        boolean z12;
        boolean z13;
        if (this.f345119c) {
            if (this.f345120d == 2) {
                if (f12.a() == 0) {
                    z13 = false;
                } else {
                    if (f12.r() != 32) {
                        this.f345119c = false;
                    }
                    this.f345120d--;
                    z13 = this.f345119c;
                }
                if (!z13) {
                    return;
                }
            }
            if (this.f345120d == 1) {
                if (f12.a() == 0) {
                    z12 = false;
                } else {
                    if (f12.r() != 0) {
                        this.f345119c = false;
                    }
                    this.f345120d--;
                    z12 = this.f345119c;
                }
                if (!z12) {
                    return;
                }
            }
            int i12 = f12.f348071b;
            int iA2 = f12.a();
            for (com.google.android.exoplayer2.extractor.A a12 : this.f345118b) {
                f12.B(i12);
                a12.c(iA2, f12);
            }
            this.f345121e += iA2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void d(int i12, long j12) {
        if ((i12 & 4) == 0) {
            return;
        }
        this.f345119c = true;
        if (j12 != -9223372036854775807L) {
            this.f345122f = j12;
        }
        this.f345121e = 0;
        this.f345120d = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void e(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        int i12 = 0;
        while (true) {
            com.google.android.exoplayer2.extractor.A[] aArr = this.f345118b;
            if (i12 >= aArr.length) {
                return;
            }
            D.a aVar = this.f345117a.get(i12);
            eVar.a();
            eVar.b();
            com.google.android.exoplayer2.extractor.A aC2 = lVar.c(eVar.f345039d, 3);
            I.b bVar = new I.b();
            eVar.b();
            bVar.f343494a = eVar.f345040e;
            bVar.f343504k = "application/dvbsubs";
            bVar.f343506m = Collections.singletonList(aVar.f345032b);
            bVar.f343496c = aVar.f345031a;
            aC2.a(bVar.a());
            aArr[i12] = aC2;
            i12++;
        }
    }
}
