package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class aoc implements ec8 {
    public volatile boolean Y;
    public final Uri a;
    public final zdf b;
    public final ka5 c;
    public final goc d;
    public final yn3 o;
    public long s0;
    public ze4 t0;
    public sfg u0;
    public boolean v0;
    public final /* synthetic */ goc w0;
    public final n7 X = new n7();
    public boolean Z = true;

    public aoc(goc gocVar, Uri uri, se4 se4Var, ka5 ka5Var, goc gocVar2, yn3 yn3Var) {
        this.w0 = gocVar;
        this.a = uri;
        this.b = new zdf(se4Var);
        this.c = ka5Var;
        this.d = gocVar2;
        this.o = yn3Var;
        ub8.c.getAndIncrement();
        this.t0 = a(0L);
    }

    public final ze4 a(long j) {
        Map map = Collections.EMPTY_MAP;
        String str = this.w0.s0;
        Map map2 = goc.a1;
        Uri uri = this.a;
        hsi.i(uri, "The uri must be set.");
        return new ze4(uri, 0L, 1, null, map2, j, -1L, str, 6);
    }

    @Override // defpackage.ec8
    public final void c() {
        this.Y = true;
    }

    @Override // defpackage.ec8
    public final void load() {
        se4 ac7Var;
        gp5 gp5Var;
        int i;
        int iY = 0;
        while (iY == 0 && !this.Y) {
            try {
                long j = this.X.a;
                ze4 ze4VarA = a(j);
                this.t0 = ze4VarA;
                long jH = this.b.H(ze4VarA);
                if (this.Y) {
                    if (iY != 1 && this.c.k() != -1) {
                        this.X.a = this.c.k();
                    }
                    z7j.a(this.b);
                    return;
                }
                if (jH != -1) {
                    jH += j;
                    goc gocVar = this.w0;
                    gocVar.B0.post(new xnc(gocVar, 0));
                }
                long j2 = jH;
                this.w0.D0 = ec7.b(this.b.a.x());
                zdf zdfVar = this.b;
                ec7 ec7Var = this.w0.D0;
                if (ec7Var == null || (i = ec7Var.f) == -1) {
                    ac7Var = zdfVar;
                } else {
                    ac7Var = new ac7(zdfVar, i, this);
                    sfg sfgVarZ = this.w0.z(new eoc(0, true));
                    this.u0 = sfgVarZ;
                    sfgVarZ.d(goc.b1);
                }
                this.c.m(ac7Var, this.a, this.b.a.x(), j, j2, this.d);
                if (this.w0.D0 != null && (gp5Var = (gp5) this.c.b) != null && (gp5Var instanceof n3a)) {
                    ((n3a) gp5Var).C0 = true;
                }
                if (this.Z) {
                    ka5 ka5Var = this.c;
                    long j3 = this.s0;
                    gp5 gp5Var2 = (gp5) ka5Var.b;
                    gp5Var2.getClass();
                    gp5Var2.d(j, j3);
                    this.Z = false;
                }
                while (iY == 0 && !this.Y) {
                    try {
                        this.o.a();
                        ka5 ka5Var2 = this.c;
                        n7 n7Var = this.X;
                        gp5 gp5Var3 = (gp5) ka5Var2.b;
                        gp5Var3.getClass();
                        nm4 nm4Var = (nm4) ka5Var2.c;
                        nm4Var.getClass();
                        iY = gp5Var3.y(nm4Var, n7Var);
                        long jK = this.c.k();
                        if (jK > this.w0.t0 + j) {
                            this.o.d();
                            goc gocVar2 = this.w0;
                            gocVar2.B0.post(gocVar2.A0);
                            j = jK;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iY == 1) {
                    iY = 0;
                } else if (this.c.k() != -1) {
                    this.X.a = this.c.k();
                }
                z7j.a(this.b);
            } catch (Throwable th) {
                if (iY != 1 && this.c.k() != -1) {
                    this.X.a = this.c.k();
                }
                z7j.a(this.b);
                throw th;
            }
        }
    }
}
