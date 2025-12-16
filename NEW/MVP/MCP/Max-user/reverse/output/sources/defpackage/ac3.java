package defpackage;

import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class ac3 implements o29, m29 {
    public long X;
    public ClippingMediaSource$IllegalClippingException Y;
    public final o29 a;
    public m29 b;
    public yb3[] c = new yb3[0];
    public long d;
    public long o;

    public ac3(o29 o29Var, boolean z, long j, long j2) {
        this.a = o29Var;
        this.d = z ? j : -9223372036854775807L;
        this.o = j;
        this.X = j2;
    }

    @Override // defpackage.o29
    public final void C(m29 m29Var, long j) {
        this.b = m29Var;
        this.a.C(this, j);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x00e2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    @Override // defpackage.o29
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E(defpackage.an5[] r15, boolean[] r16, defpackage.ixd[] r17, boolean[] r18, long r19) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac3.E(an5[], boolean[], ixd[], boolean[], long):long");
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    @Override // defpackage.gee
    public final void b(iee ieeVar) {
        m29 m29Var = this.b;
        m29Var.getClass();
        m29Var.b(this);
    }

    @Override // defpackage.m29
    public final void c(o29 o29Var) {
        if (this.Y != null) {
            return;
        }
        m29 m29Var = this.b;
        m29Var.getClass();
        m29Var.c(this);
    }

    @Override // defpackage.iee
    public final long d() {
        long jD = this.a.d();
        if (jD != Long.MIN_VALUE) {
            long j = this.X;
            if (j == Long.MIN_VALUE || jD < j) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.o29
    public final void f() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.Y;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.a.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // defpackage.o29
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.d = r0
            yb3[] r0 = r5.c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            o29 r0 = r5.a
            long r0 = r0.h(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.o
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.X
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            defpackage.fsi.d(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac3.h(long):long");
    }

    @Override // defpackage.iee
    public final boolean j() {
        return this.a.j();
    }

    @Override // defpackage.o29
    public final long k() {
        if (a()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j;
        }
        long jK2 = this.a.k();
        if (jK2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        fsi.d(jK2 >= this.o);
        long j2 = this.X;
        fsi.d(j2 == Long.MIN_VALUE || jK2 <= j2);
        return jK2;
    }

    @Override // defpackage.o29
    public final mfg l() {
        return this.a.l();
    }

    @Override // defpackage.iee
    public final long o() {
        long jO = this.a.o();
        if (jO != Long.MIN_VALUE) {
            long j = this.X;
            if (j == Long.MIN_VALUE || jO < j) {
                return jO;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.iee
    public final void p(long j) {
        this.a.p(j);
    }

    @Override // defpackage.o29
    public final long v(long j, j9e j9eVar) {
        long j2 = this.o;
        if (j == j2) {
            return j2;
        }
        long j3 = xxg.j(j9eVar.a, 0L, j - j2);
        long j4 = j9eVar.b;
        long j5 = this.X;
        long j6 = xxg.j(j4, 0L, j5 == Long.MIN_VALUE ? BuildConfig.MAX_TIME_TO_UPLOAD : j5 - j);
        if (j3 != j9eVar.a || j6 != j9eVar.b) {
            j9eVar = new j9e(j3, j6);
        }
        return this.a.v(j, j9eVar);
    }

    @Override // defpackage.o29
    public final void y(long j) {
        this.a.y(j);
    }

    @Override // defpackage.iee
    public final boolean z(long j) {
        return this.a.z(j);
    }
}
