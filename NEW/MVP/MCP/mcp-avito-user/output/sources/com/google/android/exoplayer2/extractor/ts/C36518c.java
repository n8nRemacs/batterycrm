package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.extractor.y;
import java.io.EOFException;
import java.io.InterruptedIOException;
import okhttp3.internal.http2.Http2;

/* compiled from: Ac4Extractor.java */
/* renamed from: com.google.android.exoplayer2.extractor.ts.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36518c implements com.google.android.exoplayer2.extractor.j {

    /* renamed from: a, reason: collision with root package name */
    public final C36519d f345058a = new C36519d();

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345059b = new com.google.android.exoplayer2.util.F(Http2.INITIAL_MAX_FRAME_SIZE);

    /* renamed from: c, reason: collision with root package name */
    public boolean f345060c;

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        this.f345060c = false;
        this.f345058a.a();
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(com.google.android.exoplayer2.extractor.l lVar) {
        this.f345058a.e(lVar, new D.e(0, 1));
        lVar.b();
        lVar.i(new y.b(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(com.google.android.exoplayer2.extractor.k kVar) throws EOFException, InterruptedIOException {
        com.google.android.exoplayer2.extractor.f fVar;
        int i12;
        com.google.android.exoplayer2.util.F f12 = new com.google.android.exoplayer2.util.F(10);
        int i13 = 0;
        while (true) {
            fVar = (com.google.android.exoplayer2.extractor.f) kVar;
            fVar.a(f12.f348070a, 0, 10, false);
            f12.B(0);
            if (f12.t() != 4801587) {
                break;
            }
            f12.C(3);
            int iQ2 = f12.q();
            i13 += iQ2 + 10;
            fVar.l(iQ2, false);
        }
        fVar.f344497f = 0;
        fVar.l(i13, false);
        int i14 = 0;
        int i15 = i13;
        while (true) {
            int i16 = 7;
            fVar.a(f12.f348070a, 0, 7, false);
            f12.B(0);
            int iW2 = f12.w();
            if (iW2 == 44096 || iW2 == 44097) {
                i14++;
                if (i14 >= 4) {
                    return true;
                }
                byte[] bArr = f12.f348070a;
                if (bArr.length < 7) {
                    i12 = -1;
                } else {
                    int i17 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i17 == 65535) {
                        i17 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i16 = 4;
                    }
                    if (iW2 == 44097) {
                        i16 += 2;
                    }
                    i12 = i17 + i16;
                }
                if (i12 == -1) {
                    return false;
                }
                fVar.l(i12 - 7, false);
            } else {
                fVar.f344497f = 0;
                i15++;
                if (i15 - i13 >= 8192) {
                    return false;
                }
                fVar.l(i15, false);
                i14 = 0;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final int i(com.google.android.exoplayer2.extractor.k kVar, com.google.android.exoplayer2.extractor.w wVar) throws EOFException, InterruptedIOException {
        com.google.android.exoplayer2.util.F f12 = this.f345059b;
        int i12 = ((com.google.android.exoplayer2.extractor.f) kVar).read(f12.f348070a, 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (i12 == -1) {
            return -1;
        }
        f12.B(0);
        f12.A(i12);
        boolean z12 = this.f345060c;
        C36519d c36519d = this.f345058a;
        if (!z12) {
            c36519d.d(4, 0L);
            this.f345060c = true;
        }
        c36519d.c(f12);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
