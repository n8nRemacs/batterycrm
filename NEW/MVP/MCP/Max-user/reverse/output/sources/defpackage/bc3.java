package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class bc3 implements p29, n29 {
    public long X;
    public ClippingMediaSource$IllegalClippingException Y;
    public final p29 a;
    public n29 b;
    public zb3[] c = new zb3[0];
    public long d;
    public long o;

    public bc3(p29 p29Var, boolean z, long j, long j2) {
        this.a = p29Var;
        this.d = z ? j : -9223372036854775807L;
        this.o = j;
        this.X = j2;
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    @Override // defpackage.p29
    public final long c(long j, k9e k9eVar) {
        long j2 = this.o;
        if (j == j2) {
            return j2;
        }
        long j3 = zxg.j(k9eVar.a, 0L, j - j2);
        long j4 = k9eVar.b;
        long j5 = this.X;
        long j6 = zxg.j(j4, 0L, j5 == Long.MIN_VALUE ? BuildConfig.MAX_TIME_TO_UPLOAD : j5 - j);
        if (j3 != k9eVar.a || j6 != k9eVar.b) {
            k9eVar = new k9e(j3, j6);
        }
        return this.a.c(j, k9eVar);
    }

    @Override // defpackage.jee
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

    @Override // defpackage.p29
    public final void f() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.Y;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.a.f();
    }

    @Override // defpackage.p29
    public final long h(long j) {
        this.d = -9223372036854775807L;
        for (zb3 zb3Var : this.c) {
            if (zb3Var != null) {
                zb3Var.b = false;
            }
        }
        long jH = this.a.h(j);
        long j2 = this.o;
        long j3 = this.X;
        long jMax = Math.max(jH, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.n29
    public final void i(p29 p29Var) {
        if (this.Y != null) {
            return;
        }
        n29 n29Var = this.b;
        n29Var.getClass();
        n29Var.i(this);
    }

    @Override // defpackage.jee
    public final boolean j() {
        return this.a.j();
    }

    @Override // defpackage.p29
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
        long j2 = this.o;
        long j3 = this.X;
        long jMax = Math.max(jK2, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.p29
    public final nfg l() {
        return this.a.l();
    }

    @Override // defpackage.p29
    public final long m(bn5[] bn5VarArr, boolean[] zArr, jxd[] jxdVarArr, boolean[] zArr2, long j) {
        long j2;
        this.c = new zb3[jxdVarArr.length];
        jxd[] jxdVarArr2 = new jxd[jxdVarArr.length];
        for (int i = 0; i < jxdVarArr.length; i++) {
            zb3[] zb3VarArr = this.c;
            zb3 zb3Var = (zb3) jxdVarArr[i];
            zb3VarArr[i] = zb3Var;
            jxdVarArr2[i] = zb3Var != null ? zb3Var.a : null;
        }
        long jM = this.a.m(bn5VarArr, zArr, jxdVarArr2, zArr2, j);
        long j3 = this.X;
        long jMax = Math.max(jM, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (a()) {
            if (jM >= j) {
                if (jM != 0) {
                    for (bn5 bn5Var : bn5VarArr) {
                        if (bn5Var != null) {
                            hf6 hf6VarJ = bn5Var.j();
                            if (!xz9.a(hf6VarJ.n, hf6VarJ.k)) {
                            }
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
            break;
        } else {
            j2 = -9223372036854775807L;
        }
        this.d = j2;
        for (int i2 = 0; i2 < jxdVarArr.length; i2++) {
            jxd jxdVar = jxdVarArr2[i2];
            if (jxdVar == null) {
                this.c[i2] = null;
            } else {
                zb3[] zb3VarArr2 = this.c;
                zb3 zb3Var2 = zb3VarArr2[i2];
                if (zb3Var2 == null || zb3Var2.a != jxdVar) {
                    zb3VarArr2[i2] = new zb3(this, jxdVar);
                }
            }
            jxdVarArr[i2] = this.c[i2];
        }
        return jMax;
    }

    @Override // defpackage.p29
    public final void n(n29 n29Var, long j) {
        this.b = n29Var;
        this.a.n(this, j);
    }

    @Override // defpackage.jee
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

    @Override // defpackage.jee
    public final void p(long j) {
        this.a.p(j);
    }

    @Override // defpackage.jee
    public final boolean r(oc8 oc8Var) {
        return this.a.r(oc8Var);
    }

    @Override // defpackage.hee
    public final void s(jee jeeVar) {
        n29 n29Var = this.b;
        n29Var.getClass();
        n29Var.s(this);
    }

    @Override // defpackage.p29
    public final void t(long j, boolean z) {
        this.a.t(j, z);
    }
}
