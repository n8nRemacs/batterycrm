package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class sk0 implements t4c {
    public int X;
    public ixd Y;
    public gf6[] Z;
    public final int a;
    public jld c;
    public int d;
    public m4c o;
    public long s0;
    public boolean u0;
    public boolean v0;
    public final i5i b = new i5i();
    public long t0 = Long.MIN_VALUE;

    public sk0(int i) {
        this.a = i;
    }

    public static int b(int i, int i2, int i3) {
        return i | i2 | i3 | 128;
    }

    @Override // defpackage.t4c
    public void a(int i, Object obj) {
    }

    public final ExoPlaybackException d(Exception exc, gf6 gf6Var, boolean z, int i) {
        int iX;
        if (gf6Var == null || this.v0) {
            iX = 4;
        } else {
            this.v0 = true;
            try {
                iX = x(gf6Var) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.v0 = false;
            }
        }
        return new ExoPlaybackException(1, exc, i, f(), this.d, gf6Var, gf6Var == null ? 4 : iX, z);
    }

    public ew8 e() {
        return null;
    }

    public abstract String f();

    public final boolean g() {
        return this.t0 == Long.MIN_VALUE;
    }

    public abstract boolean h();

    public abstract boolean i();

    public abstract void j();

    public void k(boolean z, boolean z2) {
    }

    public abstract void l(long j, boolean z);

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    public abstract void p(gf6[] gf6VarArr, long j, long j2);

    public final int q(i5i i5iVar, oh4 oh4Var, int i) {
        ixd ixdVar = this.Y;
        ixdVar.getClass();
        int i2 = ixdVar.i(i5iVar, oh4Var, i);
        if (i2 == -4) {
            if (oh4Var.j(4)) {
                this.t0 = Long.MIN_VALUE;
                return this.u0 ? -4 : -3;
            }
            long j = oh4Var.X + this.s0;
            oh4Var.X = j;
            this.t0 = Math.max(this.t0, j);
            return i2;
        }
        if (i2 == -5) {
            gf6 gf6Var = (gf6) i5iVar.b;
            gf6Var.getClass();
            long j2 = gf6Var.z0;
            if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
                ef6 ef6VarA = gf6Var.a();
                ef6VarA.o = j2 + this.s0;
                i5iVar.b = new gf6(ef6VarA);
            }
        }
        return i2;
    }

    public abstract void t(long j, long j2);

    public final void u(gf6[] gf6VarArr, ixd ixdVar, long j, long j2) {
        fsi.d(!this.u0);
        this.Y = ixdVar;
        if (this.t0 == Long.MIN_VALUE) {
            this.t0 = j;
        }
        this.Z = gf6VarArr;
        this.s0 = j2;
        p(gf6VarArr, j, j2);
    }

    public final void v() {
        fsi.d(this.X == 0);
        this.b.f();
        m();
    }

    public void w(float f, float f2) {
    }

    public abstract int x(gf6 gf6Var);

    public int y() {
        return 0;
    }
}
