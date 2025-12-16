package defpackage;

import android.os.Handler;
import androidx.media3.common.ParserException;
import java.util.Map;

/* loaded from: classes.dex */
public final class i4c implements sfg {
    public final hxd a;
    public final xt4 b = new xt4(19);
    public final yy9 c = new yy9(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ j4c e;

    public i4c(j4c j4cVar, ri4 ri4Var) {
        this.e = j4cVar;
        this.a = new hxd(ri4Var, null, null);
    }

    @Override // defpackage.sfg
    public final void a(long j, int i, int i2, int i3, qfg qfgVar) {
        long jF;
        long jX;
        this.a.a(j, i, i2, i3, qfgVar);
        while (this.a.u(false)) {
            yy9 yy9Var = this.c;
            yy9Var.w();
            if (this.a.z(this.b, yy9Var, 0, false) == -4) {
                yy9Var.z();
            } else {
                yy9Var = null;
            }
            if (yy9Var != null) {
                long j2 = yy9Var.Y;
                ty9 ty9VarB = ((bq) this.e.s0).b(yy9Var);
                if (ty9VarB != null) {
                    ni5 ni5Var = (ni5) ty9VarB.a[0];
                    String str = ni5Var.a;
                    String str2 = ni5Var.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jX = zxg.X(zxg.q(ni5Var.e));
                        } catch (ParserException unused) {
                            jX = -9223372036854775807L;
                        }
                        if (jX != -9223372036854775807L) {
                            g4c g4cVar = new g4c(j2, jX);
                            Handler handler = this.e.b;
                            handler.sendMessage(handler.obtainMessage(1, g4cVar));
                        }
                    }
                }
            }
        }
        hxd hxdVar = this.a;
        axd axdVar = hxdVar.a;
        synchronized (hxdVar) {
            int i4 = hxdVar.s;
            jF = i4 == 0 ? -1L : hxdVar.f(i4);
        }
        axdVar.c(jF);
    }

    @Override // defpackage.sfg
    public final void b(umb umbVar, int i, int i2) {
        this.a.b(umbVar, i, 0);
    }

    @Override // defpackage.sfg
    public final int c(ke4 ke4Var, int i, boolean z) {
        return this.a.c(ke4Var, i, z);
    }

    @Override // defpackage.sfg
    public final void d(hf6 hf6Var) {
        this.a.d(hf6Var);
    }

    public final boolean e(long j) {
        boolean z;
        j4c j4cVar = this.e;
        ad4 ad4Var = (ad4) j4cVar.t0;
        a3b a3bVar = (a3b) j4cVar.Z;
        if (!ad4Var.d) {
            return false;
        }
        if (j4cVar.o) {
            return true;
        }
        Map.Entry entryCeilingEntry = j4cVar.c.ceilingEntry(Long.valueOf(ad4Var.h));
        if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= j) {
            z = false;
        } else {
            long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
            sd4 sd4Var = (sd4) a3bVar.b;
            long j2 = sd4Var.N;
            if (j2 == -9223372036854775807L || j2 < jLongValue) {
                sd4Var.N = jLongValue;
            }
            z = true;
        }
        if (z && j4cVar.d) {
            j4cVar.o = true;
            j4cVar.d = false;
            sd4 sd4Var2 = (sd4) a3bVar.b;
            sd4Var2.D.removeCallbacks(sd4Var2.w);
            sd4Var2.A();
        }
        return z;
    }

    public final boolean f(e93 e93Var) {
        long j = this.d;
        boolean z = j != -9223372036854775807L && j < e93Var.Y;
        j4c j4cVar = this.e;
        if (((ad4) j4cVar.t0).d) {
            if (!j4cVar.o) {
                if (z) {
                    if (j4cVar.d) {
                        j4cVar.o = true;
                        j4cVar.d = false;
                        sd4 sd4Var = (sd4) ((a3b) j4cVar.Z).b;
                        sd4Var.D.removeCallbacks(sd4Var.w);
                        sd4Var.A();
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
