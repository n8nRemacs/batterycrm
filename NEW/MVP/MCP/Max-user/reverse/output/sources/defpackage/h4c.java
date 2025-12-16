package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.ParserException;

/* loaded from: classes.dex */
public final class h4c implements rfg {
    public final gxd a;
    public final i5i b = new i5i();
    public final xy9 c = new xy9(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ j4c e;

    public h4c(j4c j4cVar, qi4 qi4Var) {
        this.e = j4cVar;
        this.a = new gxd(qi4Var, null, null);
    }

    @Override // defpackage.rfg
    public final int a(je4 je4Var, int i, boolean z) {
        return this.a.e(je4Var, i, z);
    }

    @Override // defpackage.rfg
    public final void b(long j, int i, int i2, int i3, pfg pfgVar) {
        long jF;
        long jE;
        this.a.b(j, i, i2, i3, pfgVar);
        while (this.a.r(false)) {
            xy9 xy9Var = this.c;
            xy9Var.w();
            if (this.a.w(this.b, xy9Var, 0, false) == -4) {
                xy9Var.z();
            } else {
                xy9Var = null;
            }
            if (xy9Var != null) {
                long j2 = xy9Var.X;
                sy9 sy9VarA = ((aq) this.e.s0).a(xy9Var);
                if (sy9VarA != null) {
                    mi5 mi5Var = (mi5) sy9VarA.a[0];
                    String str = mi5Var.a;
                    String str2 = mi5Var.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jE = xxg.E(xxg.m(mi5Var.o));
                        } catch (ParserException unused) {
                            jE = -9223372036854775807L;
                        }
                        if (jE != -9223372036854775807L) {
                            f4c f4cVar = new f4c(j2, jE);
                            Handler handler = this.e.b;
                            handler.sendMessage(handler.obtainMessage(1, f4cVar));
                        }
                    }
                }
            }
        }
        gxd gxdVar = this.a;
        axd axdVar = gxdVar.a;
        synchronized (gxdVar) {
            int i4 = gxdVar.s;
            jF = i4 == 0 ? -1L : gxdVar.f(i4);
        }
        axdVar.c(jF);
    }

    @Override // defpackage.rfg
    public final void c(int i, qyg qygVar) {
        this.a.c(i, qygVar);
    }

    @Override // defpackage.rfg
    public final void d(gf6 gf6Var) {
        this.a.d(gf6Var);
    }
}
