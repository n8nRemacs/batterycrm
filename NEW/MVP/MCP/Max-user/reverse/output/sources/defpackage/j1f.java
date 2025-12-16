package defpackage;

import android.util.Log;
import com.google.android.exoplayer2.IllegalSeekPositionException;

/* loaded from: classes.dex */
public final class j1f extends i3 {
    public final dm5 c;
    public final xn3 d;

    public j1f(gl5 gl5Var) {
        super(2);
        xn3 xn3Var = new xn3(0);
        this.d = xn3Var;
        try {
            this.c = new dm5(gl5Var, this);
            xn3Var.e();
        } catch (Throwable th) {
            this.d.e();
            throw th;
        }
    }

    public final void L0() {
        this.d.b();
    }

    public final void M0(int i, long j) {
        L0();
        dm5 dm5Var = this.c;
        dm5Var.d1();
        mj4 mj4Var = dm5Var.B0;
        if (!mj4Var.Z) {
            hd hdVarA = mj4Var.a();
            mj4Var.Z = true;
            mj4Var.K(hdVarA, -1, new df3(28));
        }
        r9g r9gVar = dm5Var.j1.a;
        if (i < 0 || (!r9gVar.p() && i >= r9gVar.o())) {
            throw new IllegalSeekPositionException();
        }
        dm5Var.N0++;
        if (dm5Var.f()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            mm5 mm5Var = new mm5(dm5Var.j1);
            mm5Var.a(1);
            dm5 dm5Var2 = dm5Var.u0.a;
            dm5Var2.t0.a.post(new kr4(dm5Var2, 26, mm5Var));
            return;
        }
        dm5Var.d1();
        int i2 = dm5Var.j1.e != 1 ? 2 : 1;
        int iT = dm5Var.t();
        z2c z2cVarS0 = dm5Var.S0(dm5Var.j1.f(i2), r9gVar, dm5Var.T0(r9gVar, i, j));
        dm5Var.v0.Z.a(3, new pm5(r9gVar, i, xxg.B(j))).b();
        dm5Var.b1(z2cVarS0, 0, 1, true, true, 1, dm5Var.O0(z2cVarS0), iT);
    }

    public final void N0(boolean z) {
        L0();
        dm5 dm5Var = this.c;
        dm5Var.d1();
        n30 n30Var = dm5Var.H0;
        dm5Var.d1();
        int iC = n30Var.c(dm5Var.j1.e, z);
        int i = 1;
        if (z && iC != 1) {
            i = 2;
        }
        dm5Var.a1(iC, i, z);
    }

    @Override // defpackage.u3c
    public final float a() {
        L0();
        dm5 dm5Var = this.c;
        dm5Var.d1();
        return dm5Var.d1;
    }

    @Override // defpackage.i3, defpackage.u3c
    public final long e() {
        L0();
        return this.c.e();
    }

    @Override // defpackage.i3, defpackage.u3c
    public final boolean f() {
        L0();
        return this.c.f();
    }

    @Override // defpackage.i3, defpackage.u3c
    public final long g() {
        L0();
        return this.c.g();
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int getRepeatMode() {
        L0();
        dm5 dm5Var = this.c;
        dm5Var.d1();
        return dm5Var.M0;
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int j() {
        L0();
        return this.c.j();
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int l() {
        L0();
        return this.c.l();
    }

    @Override // defpackage.i3
    public final r9g o0() {
        L0();
        return this.c.o0();
    }

    @Override // defpackage.i3, defpackage.u3c
    public final long p() {
        L0();
        return this.c.p();
    }

    @Override // defpackage.i3
    public final void q0() {
        L0();
        this.c.d1();
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int s() {
        L0();
        return this.c.s();
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int t() {
        L0();
        return this.c.t();
    }
}
