package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k57 extends ck0 {
    public final wm4 h;
    public final y6i i;
    public final kc3 j;
    public final k55 k;
    public final tha l;
    public final boolean m;
    public final int n;
    public final bn4 o;
    public final long p;
    public yz8 q;
    public wgg r;
    public k09 s;

    static {
        e19.a("media3.exoplayer.hls");
    }

    public k57(k09 k09Var, y6i y6iVar, wm4 wm4Var, kc3 kc3Var, k55 k55Var, tha thaVar, bn4 bn4Var, long j, boolean z, int i) {
        this.s = k09Var;
        this.q = k09Var.c;
        this.i = y6iVar;
        this.h = wm4Var;
        this.j = kc3Var;
        this.k = k55Var;
        this.l = thaVar;
        this.o = bn4Var;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static z47 u(long j, List list) {
        z47 z47Var = null;
        for (int i = 0; i < list.size(); i++) {
            z47 z47Var2 = (z47) list.get(i);
            long j2 = z47Var2.o;
            if (j2 > j || !z47Var2.v0) {
                if (j2 > j) {
                    break;
                }
            } else {
                z47Var = z47Var2;
            }
        }
        return z47Var;
    }

    @Override // defpackage.ck0
    public final boolean a(k09 k09Var) {
        k09 k09VarI = i();
        a09 a09Var = k09VarI.b;
        a09Var.getClass();
        a09 a09Var2 = k09Var.b;
        return a09Var2 != null && a09Var2.a.equals(a09Var.a) && a09Var2.e.equals(a09Var.e) && Objects.equals(a09Var2.c, a09Var.c) && k09VarI.c.equals(k09Var.c);
    }

    @Override // defpackage.ck0
    public final p29 c(d99 d99Var, ri4 ri4Var, long j) {
        lk6 lk6VarB = b(d99Var);
        d55 d55Var = new d55(this.d.c, 0, d99Var);
        wgg wggVar = this.r;
        n4c n4cVar = this.g;
        hsi.h(n4cVar);
        return new u47(this.h, this.o, this.i, wggVar, this.k, d55Var, this.l, lk6VarB, ri4Var, this.j, this.m, this.n, n4cVar);
    }

    @Override // defpackage.ck0
    public final synchronized k09 i() {
        return this.s;
    }

    @Override // defpackage.ck0
    public final void k() throws IOException {
        bn4 bn4Var = this.o;
        te8 te8Var = (te8) bn4Var.v0;
        if (te8Var != null) {
            te8Var.b();
        }
        Uri uri = bn4Var.o;
        if (uri != null) {
            an4 an4Var = (an4) bn4Var.b.get(uri);
            an4Var.b.b();
            IOException iOException = an4Var.t0;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // defpackage.ck0
    public final void m(wgg wggVar) {
        this.r = wggVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        n4c n4cVar = this.g;
        hsi.h(n4cVar);
        k55 k55Var = this.k;
        k55Var.c(looperMyLooper, n4cVar);
        k55Var.prepare();
        lk6 lk6VarB = b(null);
        a09 a09Var = i().b;
        a09Var.getClass();
        Uri uri = a09Var.a;
        bn4 bn4Var = this.o;
        bn4Var.getClass();
        bn4Var.d = zxg.n(null);
        bn4Var.u0 = lk6VarB;
        bn4Var.w0 = this;
        Map map = Collections.EMPTY_MAP;
        hsi.i(uri, "The uri must be set.");
        zmb zmbVar = new zmb(((oe4) ((y6i) bn4Var.Z).b).a(), new ze4(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, ((w57) bn4Var.s0).d());
        hsi.g(((te8) bn4Var.v0) == null);
        te8 te8Var = new te8("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        bn4Var.v0 = te8Var;
        te8Var.F(zmbVar, bn4Var, ((tha) bn4Var.t0).q(zmbVar.c));
    }

    @Override // defpackage.ck0
    public final void o(p29 p29Var) {
        u47 u47Var = (u47) p29Var;
        u47Var.b.c.remove(u47Var);
        for (i67 i67Var : u47Var.D0) {
            if (i67Var.N0) {
                for (g67 g67Var : i67Var.F0) {
                    g67Var.h();
                    z45 z45Var = g67Var.h;
                    if (z45Var != null) {
                        z45Var.c(g67Var.e);
                        g67Var.h = null;
                        g67Var.g = null;
                    }
                }
            }
            m47 m47Var = i67Var.d;
            an4 an4Var = (an4) m47Var.g.b.get(m47Var.e[m47Var.r.i()]);
            if (an4Var != null) {
                an4Var.u0 = false;
            }
            m47Var.n = null;
            i67Var.t0.D(i67Var);
            i67Var.B0.removeCallbacksAndMessages(null);
            i67Var.R0 = true;
            i67Var.C0.clear();
        }
        u47Var.A0 = null;
    }

    @Override // defpackage.ck0
    public final void q() {
        bn4 bn4Var = this.o;
        bn4Var.o = null;
        bn4Var.y0 = null;
        bn4Var.x0 = null;
        bn4Var.Y = -9223372036854775807L;
        ((te8) bn4Var.v0).D(null);
        bn4Var.v0 = null;
        HashMap map = bn4Var.b;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((an4) it.next()).b.D(null);
        }
        bn4Var.d.removeCallbacksAndMessages(null);
        bn4Var.d = null;
        map.clear();
        this.k.release();
    }

    @Override // defpackage.ck0
    public final synchronized void t(k09 k09Var) {
        this.s = k09Var;
    }

    public final void v(i57 i57Var) {
        long j;
        y2f y2fVar;
        long j2;
        long jU;
        long j3;
        boolean z = i57Var.p;
        boolean z2 = i57Var.g;
        wg7 wg7Var = i57Var.r;
        long j4 = i57Var.u;
        long jU2 = i57Var.e;
        int i = i57Var.d;
        long j5 = i57Var.h;
        long jM0 = z ? zxg.m0(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jM0 : -9223372036854775807L;
        bn4 bn4Var = this.o;
        ((q57) bn4Var.x0).getClass();
        tha thaVar = new tha(21);
        long j7 = 0;
        if (bn4Var.X) {
            g57 g57Var = i57Var.v;
            long j8 = j5 - bn4Var.Y;
            boolean z3 = i57Var.o;
            long j9 = z3 ? j8 + j4 : -9223372036854775807L;
            long jU3 = i57Var.p ? zxg.U(zxg.E(this.p)) - (j5 + j4) : 0L;
            long j10 = this.q.a;
            if (j10 != -9223372036854775807L) {
                jU = zxg.U(j10);
            } else {
                if (jU2 != -9223372036854775807L) {
                    j2 = j4 - jU2;
                } else {
                    j2 = g57Var.d;
                    if (j2 == -9223372036854775807L || i57Var.n == -9223372036854775807L) {
                        j2 = g57Var.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * i57Var.m;
                        }
                    }
                }
                jU = j2 + jU3;
            }
            long j11 = j4 + jU3;
            long j12 = zxg.j(jU, jU3, j11);
            yz8 yz8Var = i().c;
            boolean z4 = yz8Var.d == -3.4028235E38f && yz8Var.e == -3.4028235E38f && g57Var.c == -9223372036854775807L && g57Var.d == -9223372036854775807L;
            wz8 wz8Var = new wz8();
            wz8Var.a = zxg.m0(j12);
            wz8Var.d = z4 ? 1.0f : this.q.d;
            wz8Var.e = z4 ? 1.0f : this.q.e;
            yz8 yz8Var2 = new yz8(wz8Var);
            this.q = yz8Var2;
            if (jU2 == -9223372036854775807L) {
                jU2 = j11 - zxg.U(yz8Var2.a);
            }
            if (z2) {
                j7 = jU2;
            } else {
                z47 z47VarU = u(jU2, i57Var.s);
                if (z47VarU != null) {
                    j3 = z47VarU.o;
                } else if (!wg7Var.isEmpty()) {
                    d57 d57Var = (d57) wg7Var.get(zxg.c(wg7Var, Long.valueOf(jU2), true, true));
                    z47 z47VarU2 = u(jU2, d57Var.w0);
                    j3 = z47VarU2 != null ? z47VarU2.o : d57Var.o;
                }
                j7 = j3;
            }
            y2fVar = new y2f(j6, jM0, j9, i57Var.u, j8, j7, true, !z3, i == 2 && i57Var.f, thaVar, i(), this.q);
        } else {
            if (jU2 == -9223372036854775807L || wg7Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jU2 != j4) {
                    jU2 = ((d57) wg7Var.get(zxg.c(wg7Var, Long.valueOf(jU2), true, true))).o;
                }
                j = jU2;
            }
            long j13 = i57Var.u;
            y2fVar = new y2f(j6, jM0, j13, j13, 0L, j, true, false, true, thaVar, i(), null);
        }
        n(y2fVar);
    }
}
