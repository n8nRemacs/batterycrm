package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.audio.C36504b;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.extractor.y;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: Ac3Extractor.java */
/* renamed from: com.google.android.exoplayer2.extractor.ts.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36516a implements com.google.android.exoplayer2.extractor.j {

    /* renamed from: a, reason: collision with root package name */
    public final C36517b f345043a = new C36517b();

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345044b = new com.google.android.exoplayer2.util.F(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f345045c;

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        this.f345045c = false;
        this.f345043a.a();
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(com.google.android.exoplayer2.extractor.l lVar) {
        this.f345043a.e(lVar, new D.e(0, 1));
        lVar.b();
        lVar.i(new y.b(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(com.google.android.exoplayer2.extractor.k kVar) throws EOFException, InterruptedIOException {
        com.google.android.exoplayer2.extractor.f fVar;
        int iA2;
        com.google.android.exoplayer2.util.F f12 = new com.google.android.exoplayer2.util.F(10);
        int i12 = 0;
        while (true) {
            fVar = (com.google.android.exoplayer2.extractor.f) kVar;
            fVar.a(f12.f348070a, 0, 10, false);
            f12.B(0);
            if (f12.t() != 4801587) {
                break;
            }
            f12.C(3);
            int iQ2 = f12.q();
            i12 += iQ2 + 10;
            fVar.l(iQ2, false);
        }
        fVar.f344497f = 0;
        fVar.l(i12, false);
        int i13 = 0;
        int i14 = i12;
        while (true) {
            fVar.a(f12.f348070a, 0, 6, false);
            f12.B(0);
            if (f12.w() != 2935) {
                fVar.f344497f = 0;
                i14++;
                if (i14 - i12 >= 8192) {
                    return false;
                }
                fVar.l(i14, false);
                i13 = 0;
            } else {
                i13++;
                if (i13 >= 4) {
                    return true;
                }
                byte[] bArr = f12.f348070a;
                if (bArr.length < 6) {
                    iA2 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA2 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b12 = bArr[4];
                    iA2 = C36504b.a((b12 & 192) >> 6, b12 & 63);
                }
                if (iA2 == -1) {
                    return false;
                }
                fVar.l(iA2 - 6, false);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final int i(com.google.android.exoplayer2.extractor.k kVar, com.google.android.exoplayer2.extractor.w wVar) throws EOFException, InterruptedIOException {
        com.google.android.exoplayer2.util.F f12 = this.f345044b;
        int i12 = ((com.google.android.exoplayer2.extractor.f) kVar).read(f12.f348070a, 0, 2786);
        if (i12 == -1) {
            return -1;
        }
        f12.B(0);
        f12.A(i12);
        boolean z12 = this.f345045c;
        C36517b c36517b = this.f345043a;
        if (!z12) {
            c36517b.d(4, 0L);
            this.f345045c = true;
        }
        c36517b.c(f12);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
