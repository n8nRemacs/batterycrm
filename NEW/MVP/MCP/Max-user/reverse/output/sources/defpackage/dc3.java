package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class dc3 extends vh6 {
    public final boolean X;
    public final long c;
    public final long d;
    public final long o;

    public dc3(r9g r9gVar, long j, long j2) throws IOException {
        super(r9gVar);
        boolean z = false;
        z = false;
        z = false;
        final int i = 1;
        if (r9gVar.h() != 1) {
            final int i2 = z ? 1 : 0;
            throw new IOException(i2) { // from class: com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    String str = i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
                    super(str.length() != 0 ? "Illegal clipping: ".concat(str) : new String("Illegal clipping: "));
                }
            };
        }
        p9g p9gVarM = r9gVar.m(0, new p9g(), 0L);
        long jMax = Math.max(0L, j);
        if (!p9gVarM.v0 && jMax != 0 && !p9gVarM.Z) {
            throw new IOException(i) { // from class: com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    String str = i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
                    super(str.length() != 0 ? "Illegal clipping: ".concat(str) : new String("Illegal clipping: "));
                }
            };
        }
        long jMax2 = j2 == Long.MIN_VALUE ? p9gVarM.x0 : Math.max(0L, j2);
        long j3 = p9gVarM.x0;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                final int i3 = 2;
                throw new IOException(i3) { // from class: com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        String str = i3 != 0 ? i3 != 1 ? i3 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
                        super(str.length() != 0 ? "Illegal clipping: ".concat(str) : new String("Illegal clipping: "));
                    }
                };
            }
        }
        this.c = jMax;
        this.d = jMax2;
        this.o = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (p9gVarM.s0 && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.X = z;
    }

    @Override // defpackage.vh6, defpackage.r9g
    public final l9g f(int i, l9g l9gVar, boolean z) {
        this.b.f(0, l9gVar, z);
        long j = l9gVar.o - this.c;
        long j2 = this.o;
        l9gVar.g(l9gVar.a, l9gVar.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, u8.X, false);
        return l9gVar;
    }

    @Override // defpackage.vh6, defpackage.r9g
    public final p9g m(int i, p9g p9gVar, long j) {
        this.b.m(0, p9gVar, 0L);
        long j2 = p9gVar.A0;
        long j3 = this.c;
        p9gVar.A0 = j2 + j3;
        p9gVar.x0 = this.o;
        p9gVar.s0 = this.X;
        long j4 = p9gVar.w0;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            p9gVar.w0 = jMax;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            p9gVar.w0 = jMax - j3;
        }
        long jK = xxg.K(j3);
        long j6 = p9gVar.o;
        if (j6 != -9223372036854775807L) {
            p9gVar.o = j6 + jK;
        }
        long j7 = p9gVar.X;
        if (j7 != -9223372036854775807L) {
            p9gVar.X = j7 + jK;
        }
        return p9gVar;
    }
}
