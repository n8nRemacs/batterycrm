package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.AbstractC36511a;
import com.google.android.exoplayer2.extractor.f;
import com.google.android.exoplayer2.extractor.o;
import com.google.android.exoplayer2.extractor.r;
import com.google.android.exoplayer2.util.F;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: FlacBinarySearchSeeker.java */
/* loaded from: classes6.dex */
final class a extends AbstractC36511a {

    /* compiled from: FlacBinarySearchSeeker.java */
    public static final class b implements AbstractC36511a.f {

        /* renamed from: a, reason: collision with root package name */
        public final r f344499a;

        /* renamed from: b, reason: collision with root package name */
        public final int f344500b;

        /* renamed from: c, reason: collision with root package name */
        public final o.a f344501c = new o.a();

        public b(r rVar, int i12, C10577a c10577a) {
            this.f344499a = rVar;
            this.f344500b = i12;
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC36511a.f
        public final AbstractC36511a.e b(f fVar, long j12) throws EOFException, InterruptedIOException {
            long j13 = fVar.f344495d;
            long jC2 = c(fVar);
            long jG2 = fVar.g();
            fVar.l(Math.max(6, this.f344499a.f344977c), false);
            long jC3 = c(fVar);
            return (jC2 > j12 || jC3 <= j12) ? jC3 <= j12 ? new AbstractC36511a.e(-2, jC3, fVar.g()) : new AbstractC36511a.e(-1, jC2, j13) : new AbstractC36511a.e(0, -9223372036854775807L, jG2);
        }

        public final long c(f fVar) throws EOFException, InterruptedIOException {
            long j12;
            o.a aVar;
            r rVar;
            boolean zA2;
            int iJ2;
            while (true) {
                long jG2 = fVar.g();
                j12 = fVar.f344494c;
                long j13 = j12 - 6;
                aVar = this.f344501c;
                rVar = this.f344499a;
                if (jG2 >= j13) {
                    break;
                }
                long jG3 = fVar.g();
                byte[] bArr = new byte[2];
                fVar.a(bArr, 0, 2, false);
                int i12 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                int i13 = this.f344500b;
                if (i12 != i13) {
                    fVar.f344497f = 0;
                    fVar.l((int) (jG3 - fVar.f344495d), false);
                    zA2 = false;
                } else {
                    F f12 = new F(16);
                    System.arraycopy(bArr, 0, f12.f348070a, 0, 2);
                    byte[] bArr2 = f12.f348070a;
                    int i14 = 0;
                    for (int i15 = 2; i14 < 14 && (iJ2 = fVar.j(i15 + i14, 14 - i14, bArr2)) != -1; i15 = 2) {
                        i14 += iJ2;
                    }
                    f12.A(i14);
                    fVar.f344497f = 0;
                    fVar.l((int) (jG3 - fVar.f344495d), false);
                    zA2 = o.a(f12, rVar, i13, aVar);
                }
                if (zA2) {
                    break;
                }
                fVar.l(1, false);
            }
            if (fVar.g() < j12 - 6) {
                return aVar.f344909a;
            }
            fVar.l((int) (j12 - fVar.g()), false);
            return rVar.f344984j;
        }
    }
}
