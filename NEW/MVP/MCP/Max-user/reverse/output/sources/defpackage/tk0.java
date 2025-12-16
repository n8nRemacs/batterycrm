package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.work.WorkRequest;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class tk0 implements u4c {
    public d99 A0;
    public ar4 B0;
    public n4c X;
    public mwf Y;
    public int Z;
    public final int b;
    public kld d;
    public int o;
    public jxd s0;
    public hf6[] t0;
    public long u0;
    public long v0;
    public boolean x0;
    public boolean y0;
    public final Object a = new Object();
    public final xt4 c = new xt4(19);
    public long w0 = Long.MIN_VALUE;
    public s9g z0 = s9g.a;

    public tk0(int i) {
        this.b = i;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static boolean k(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public int A() {
        return 0;
    }

    @Override // defpackage.u4c
    public void a(int i, Object obj) {
    }

    public final ExoPlaybackException d(Exception exc, hf6 hf6Var, boolean z, int i) {
        int iZ;
        if (hf6Var == null || this.y0) {
            iZ = 4;
        } else {
            this.y0 = true;
            try {
                iZ = z(hf6Var) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.y0 = false;
            }
        }
        return new ExoPlaybackException(1, exc, i, h(), this.o, hf6Var, hf6Var == null ? 4 : iZ, this.A0, z);
    }

    public void e() {
    }

    public long f(long j, long j2) {
        if (this.Z != 1) {
            return WorkRequest.MIN_BACKOFF_MILLIS;
        }
        if (l() || j()) {
            return 1000000L;
        }
        return WorkRequest.MIN_BACKOFF_MILLIS;
    }

    public fw8 g() {
        return null;
    }

    public abstract String h();

    public final boolean i() {
        return this.w0 == Long.MIN_VALUE;
    }

    public abstract boolean j();

    public abstract boolean l();

    public void m() {
    }

    public void n(boolean z, boolean z2) {
    }

    public void o(long j, boolean z) {
    }

    public void p() {
    }

    public void q() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u(hf6[] hf6VarArr, long j, long j2, d99 d99Var) {
    }

    public final int v(xt4 xt4Var, ph4 ph4Var, int i) {
        jxd jxdVar = this.s0;
        jxdVar.getClass();
        int i2 = jxdVar.i(xt4Var, ph4Var, i);
        if (i2 == -4) {
            if (ph4Var.j(4)) {
                this.w0 = Long.MIN_VALUE;
                return this.x0 ? -4 : -3;
            }
            long j = ph4Var.Y + this.u0;
            ph4Var.Y = j;
            this.w0 = Math.max(this.w0, j);
            return i2;
        }
        if (i2 == -5) {
            hf6 hf6Var = (hf6) xt4Var.c;
            hf6Var.getClass();
            long j2 = hf6Var.s;
            if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
                ff6 ff6VarA = hf6Var.a();
                ff6VarA.r = j2 + this.u0;
                xt4Var.c = new hf6(ff6VarA);
            }
        }
        return i2;
    }

    public abstract void w(long j, long j2);

    public final void x(hf6[] hf6VarArr, jxd jxdVar, long j, long j2, d99 d99Var) {
        hsi.g(!this.x0);
        this.s0 = jxdVar;
        this.A0 = d99Var;
        if (this.w0 == Long.MIN_VALUE) {
            this.w0 = j;
        }
        this.t0 = hf6VarArr;
        this.u0 = j2;
        u(hf6VarArr, j, j2, d99Var);
    }

    public void y(float f, float f2) {
    }

    public abstract int z(hf6 hf6Var);
}
