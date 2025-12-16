package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.D;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import v61.InterfaceC49174e;

/* compiled from: OggExtractor.java */
/* loaded from: classes6.dex */
public class c implements com.google.android.exoplayer2.extractor.j {

    /* renamed from: a, reason: collision with root package name */
    public l f344929a;

    /* renamed from: b, reason: collision with root package name */
    public h f344930b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f344931c;

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        h hVar = this.f344930b;
        if (hVar != null) {
            d dVar = hVar.f344947a;
            e eVar = dVar.f344932a;
            eVar.f344937a = 0;
            eVar.f344938b = 0L;
            eVar.f344939c = 0;
            eVar.f344940d = 0;
            eVar.f344941e = 0;
            dVar.f344933b.y(0);
            dVar.f344934c = -1;
            dVar.f344936e = false;
            if (j12 == 0) {
                hVar.d(!hVar.f344958l);
                return;
            }
            if (hVar.f344954h != 0) {
                long j14 = (hVar.f344955i * j13) / 1000000;
                hVar.f344951e = j14;
                f fVar = hVar.f344950d;
                int i12 = U.f348106a;
                fVar.c(j14);
                hVar.f344954h = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(l lVar) {
        this.f344929a = lVar;
    }

    @InterfaceC49174e
    public final boolean c(com.google.android.exoplayer2.extractor.f fVar) {
        boolean zD2;
        e eVar = new e();
        if (eVar.a(fVar, true) && (eVar.f344937a & 2) == 2) {
            int iMin = Math.min(eVar.f344941e, 8);
            F f12 = new F(iMin);
            fVar.a(f12.f348070a, 0, iMin, false);
            f12.B(0);
            if (f12.a() >= 5 && f12.r() == 127 && f12.s() == 1179402563) {
                this.f344930b = new b();
            } else {
                f12.B(0);
                try {
                    zD2 = D.d(1, f12, true);
                } catch (ParserException unused) {
                    zD2 = false;
                }
                if (zD2) {
                    this.f344930b = new i();
                } else {
                    f12.B(0);
                    if (g.e(f12, g.f344944o)) {
                        this.f344930b = new g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(k kVar) {
        try {
            return c((com.google.android.exoplayer2.extractor.f) kVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.exoplayer2.extractor.k r21, com.google.android.exoplayer2.extractor.w r22) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ogg.c.i(com.google.android.exoplayer2.extractor.k, com.google.android.exoplayer2.extractor.w):int");
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
