package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class znc implements dc8 {
    public final xn3 X;
    public volatile boolean Z;
    public final Uri b;
    public final ydf c;
    public final hc8 d;
    public final foc o;
    public long t0;
    public gxd w0;
    public boolean x0;
    public final /* synthetic */ foc y0;
    public final n7 Y = new n7();
    public boolean s0 = true;
    public long v0 = -1;
    public final long a = tb8.h.getAndIncrement();
    public ye4 u0 = a(0);

    public znc(foc focVar, Uri uri, qe4 qe4Var, hc8 hc8Var, foc focVar2, xn3 xn3Var) {
        this.y0 = focVar;
        this.b = uri;
        this.c = new ydf(qe4Var);
        this.d = hc8Var;
        this.o = focVar2;
        this.X = xn3Var;
    }

    public final ye4 a(long j) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = foc.V0;
        Uri uri = this.b;
        if (uri != null) {
            return new ye4(uri, 0L, 1, null, map2, j, -1L, null, 6);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    @Override // defpackage.dc8
    public final void c() {
        this.Z = true;
    }

    @Override // defpackage.dc8
    public final void load() {
        qe4 zb7Var;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.Z) {
            try {
                long j = this.Y.a;
                ye4 ye4VarA = a(j);
                this.u0 = ye4VarA;
                long jR = this.c.R(ye4VarA);
                this.v0 = jR;
                if (jR != -1) {
                    this.v0 = jR + j;
                }
                this.y0.A0 = dc7.a(this.c.a.x());
                ydf ydfVar = this.c;
                dc7 dc7Var = this.y0.A0;
                if (dc7Var == null || (i = dc7Var.X) == -1) {
                    zb7Var = ydfVar;
                } else {
                    zb7Var = new zb7(ydfVar, i, this);
                    gxd gxdVarS = this.y0.s(new doc(0, true));
                    this.w0 = gxdVarS;
                    gxdVarS.d(foc.W0);
                }
                this.d.H(zb7Var, this.b, this.c.a.x(), j, this.v0, this.o);
                if (this.y0.A0 != null) {
                    fp5 fp5Var = (fp5) this.d.c;
                    if (fp5Var instanceof m3a) {
                        ((m3a) fp5Var).q = true;
                    }
                }
                if (this.s0) {
                    hc8 hc8Var = this.d;
                    long j2 = this.t0;
                    fp5 fp5Var2 = (fp5) hc8Var.c;
                    fp5Var2.getClass();
                    fp5Var2.d(j, j2);
                    this.s0 = false;
                }
                while (i2 == 0 && !this.Z) {
                    try {
                        this.X.a();
                        hc8 hc8Var2 = this.d;
                        n7 n7Var = this.Y;
                        fp5 fp5Var3 = (fp5) hc8Var2.c;
                        fp5Var3.getClass();
                        mm4 mm4Var = (mm4) hc8Var2.d;
                        mm4Var.getClass();
                        i2 = fp5Var3.i(mm4Var, n7Var);
                        mm4 mm4Var2 = (mm4) this.d.d;
                        long j3 = mm4Var2 != null ? mm4Var2.d : -1L;
                        if (j3 > this.y0.s0 + j) {
                            xn3 xn3Var = this.X;
                            synchronized (xn3Var) {
                                xn3Var.b = false;
                            }
                            foc focVar = this.y0;
                            focVar.y0.post(focVar.x0);
                            j = j3;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else {
                    mm4 mm4Var3 = (mm4) this.d.d;
                    if ((mm4Var3 != null ? mm4Var3.d : -1L) != -1) {
                        this.Y.a = mm4Var3 != null ? mm4Var3.d : -1L;
                    }
                }
                y7j.b(this.c);
            } catch (Throwable th) {
                if (i2 != 1) {
                    mm4 mm4Var4 = (mm4) this.d.d;
                    if ((mm4Var4 != null ? mm4Var4.d : -1L) != -1) {
                        this.Y.a = mm4Var4 != null ? mm4Var4.d : -1L;
                    }
                }
                y7j.b(this.c);
                throw th;
            }
        }
    }
}
