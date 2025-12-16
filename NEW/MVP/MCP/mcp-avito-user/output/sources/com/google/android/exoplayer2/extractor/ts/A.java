package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.AbstractC36511a;
import com.google.android.exoplayer2.util.O;
import com.google.android.exoplayer2.util.U;

/* compiled from: TsBinarySearchSeeker.java */
/* loaded from: classes6.dex */
final class A extends AbstractC36511a {

    /* compiled from: TsBinarySearchSeeker.java */
    public static final class a implements AbstractC36511a.f {

        /* renamed from: a, reason: collision with root package name */
        public final O f344993a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.util.F f344994b = new com.google.android.exoplayer2.util.F();

        /* renamed from: c, reason: collision with root package name */
        public final int f344995c;

        /* renamed from: d, reason: collision with root package name */
        public final int f344996d;

        public a(int i12, O o12, int i13) {
            this.f344995c = i12;
            this.f344993a = o12;
            this.f344996d = i13;
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC36511a.f
        public final void a() {
            byte[] bArr = U.f348110e;
            com.google.android.exoplayer2.util.F f12 = this.f344994b;
            f12.getClass();
            f12.z(bArr.length, bArr);
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC36511a.f
        public final AbstractC36511a.e b(com.google.android.exoplayer2.extractor.f fVar, long j12) {
            long j13 = fVar.f344495d;
            int iMin = (int) Math.min(this.f344996d, fVar.f344494c - j13);
            com.google.android.exoplayer2.util.F f12 = this.f344994b;
            f12.y(iMin);
            fVar.a(f12.f348070a, 0, iMin, false);
            int i12 = f12.f348072c;
            long j14 = -1;
            long j15 = -1;
            long j16 = -9223372036854775807L;
            while (f12.a() >= 188) {
                byte[] bArr = f12.f348070a;
                int i13 = f12.f348071b;
                while (i13 < i12 && bArr[i13] != 71) {
                    i13++;
                }
                int i14 = i13 + 188;
                if (i14 > i12) {
                    break;
                }
                long jA2 = E.a(f12, i13, this.f344995c);
                if (jA2 != -9223372036854775807L) {
                    long jB2 = this.f344993a.b(jA2);
                    if (jB2 > j12) {
                        return j16 == -9223372036854775807L ? new AbstractC36511a.e(-1, jB2, j13) : new AbstractC36511a.e(0, -9223372036854775807L, j13 + j15);
                    }
                    if (100000 + jB2 > j12) {
                        return new AbstractC36511a.e(0, -9223372036854775807L, j13 + i13);
                    }
                    j15 = i13;
                    j16 = jB2;
                }
                f12.B(i14);
                j14 = i14;
            }
            return j16 != -9223372036854775807L ? new AbstractC36511a.e(-2, j16, j13 + j14) : AbstractC36511a.e.f344414d;
        }
    }
}
