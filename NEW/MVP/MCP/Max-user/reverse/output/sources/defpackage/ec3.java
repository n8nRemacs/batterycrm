package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* loaded from: classes.dex */
public final class ec3 extends wh6 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public ec3(s9g s9gVar, long j, long j2, boolean z) throws ClippingMediaSource$IllegalClippingException {
        super(s9gVar);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new ClippingMediaSource$IllegalClippingException(2, j, j2);
        }
        boolean z2 = false;
        if (s9gVar.h() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        q9g q9gVarM = s9gVar.m(0, new q9g(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !q9gVarM.k && jMax != 0 && !q9gVarM.h) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? q9gVarM.m : Math.max(0L, j2);
        long j3 = q9gVarM.m;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f = jMax;
        this.g = jMax2;
        this.h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (q9gVarM.i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.i = z2;
    }

    @Override // defpackage.wh6, defpackage.s9g
    public final m9g f(int i, m9g m9gVar, boolean z) {
        this.e.f(0, m9gVar, z);
        long j = m9gVar.e - this.f;
        long j2 = this.h;
        m9gVar.i(m9gVar.a, m9gVar.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, v8.f, false);
        return m9gVar;
    }

    @Override // defpackage.wh6, defpackage.s9g
    public final q9g m(int i, q9g q9gVar, long j) {
        this.e.m(0, q9gVar, 0L);
        long j2 = q9gVar.p;
        long j3 = this.f;
        q9gVar.p = j2 + j3;
        q9gVar.m = this.h;
        q9gVar.i = this.i;
        long j4 = q9gVar.l;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            q9gVar.l = jMax;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            q9gVar.l = jMax - j3;
        }
        long jM0 = zxg.m0(j3);
        long j6 = q9gVar.e;
        if (j6 != -9223372036854775807L) {
            q9gVar.e = j6 + jM0;
        }
        long j7 = q9gVar.f;
        if (j7 != -9223372036854775807L) {
            q9gVar.f = j7 + jM0;
        }
        return q9gVar;
    }
}
