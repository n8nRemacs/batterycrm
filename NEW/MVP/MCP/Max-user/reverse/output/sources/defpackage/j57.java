package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class j57 extends bk0 {
    public final p47 h;
    public final c09 i;
    public final x6i j;
    public final lcj k;
    public final j55 l;
    public final rha m;
    public final boolean n;
    public final int o;
    public final bn4 p;
    public final long q;
    public final i09 r;
    public xz8 s;
    public vgg t;

    static {
        tm5.a("goog.exo.hls");
    }

    public j57(i09 i09Var, x6i x6iVar, p47 p47Var, lcj lcjVar, j55 j55Var, rha rhaVar, bn4 bn4Var, long j, boolean z, int i) {
        c09 c09Var = i09Var.b;
        c09Var.getClass();
        this.i = c09Var;
        this.r = i09Var;
        this.s = i09Var.c;
        this.j = x6iVar;
        this.h = p47Var;
        this.k = lcjVar;
        this.l = j55Var;
        this.m = rhaVar;
        this.p = bn4Var;
        this.q = j;
        this.n = z;
        this.o = i;
    }

    public static y47 p(long j, List list) {
        y47 y47Var = null;
        for (int i = 0; i < list.size(); i++) {
            y47 y47Var2 = (y47) list.get(i);
            long j2 = y47Var2.o;
            if (j2 > j || !y47Var2.v0) {
                if (j2 > j) {
                    break;
                }
            } else {
                y47Var = y47Var2;
            }
        }
        return y47Var;
    }

    @Override // defpackage.bk0
    public final o29 a(c99 c99Var, qi4 qi4Var, long j) {
        qr4 qr4Var = new qr4((CopyOnWriteArrayList) this.c.d, 0, c99Var, 0L);
        lk6 lk6Var = new lk6((CopyOnWriteArrayList) this.d.d, 0, c99Var, 10);
        vgg vggVar = this.t;
        m4c m4cVar = this.g;
        fsi.e(m4cVar);
        return new t47(this.h, this.p, this.j, vggVar, this.l, lk6Var, this.m, qr4Var, qi4Var, this.k, this.n, this.o, m4cVar);
    }

    @Override // defpackage.bk0
    public final i09 f() {
        return this.r;
    }

    @Override // defpackage.bk0
    public final void g() throws IOException {
        bn4 bn4Var = this.p;
        hc8 hc8Var = (hc8) bn4Var.v0;
        if (hc8Var != null) {
            hc8Var.b();
        }
        Uri uri = bn4Var.o;
        if (uri != null) {
            zm4 zm4Var = (zm4) bn4Var.b.get(uri);
            zm4Var.b.b();
            IOException iOException = zm4Var.t0;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // defpackage.bk0
    public final void i(vgg vggVar) {
        this.t = vggVar;
        j55 j55Var = this.l;
        j55Var.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        m4c m4cVar = this.g;
        fsi.e(m4cVar);
        j55Var.c(looperMyLooper, m4cVar);
        qr4 qr4Var = new qr4((CopyOnWriteArrayList) this.c.d, 0, (c99) null, 0L);
        Uri uri = this.i.a;
        bn4 bn4Var = this.p;
        bn4Var.getClass();
        bn4Var.d = xxg.l(null);
        bn4Var.u0 = qr4Var;
        bn4Var.w0 = this;
        ymb ymbVar = new ymb(((ne4) ((x6i) bn4Var.Z).b).a(), uri, 4, ((v57) bn4Var.s0).d());
        fsi.d(((hc8) bn4Var.v0) == null);
        hc8 hc8Var = new hc8("DefaultHlsPlaylistTracker:MultivariantPlaylist", 0);
        bn4Var.v0 = hc8Var;
        rha rhaVar = (rha) bn4Var.t0;
        int i = ymbVar.c;
        qr4Var.k(new tb8(ymbVar.a, ymbVar.b, hc8Var.O(ymbVar, bn4Var, rhaVar.q(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.bk0
    public final void k(o29 o29Var) {
        t47 t47Var = (t47) o29Var;
        t47Var.b.c.remove(t47Var);
        for (h67 h67Var : t47Var.C0) {
            if (h67Var.N0) {
                for (f67 f67Var : h67Var.F0) {
                    f67Var.h();
                    mc5 mc5Var = f67Var.h;
                    if (mc5Var != null) {
                        mc5Var.E(f67Var.e);
                        f67Var.h = null;
                        f67Var.g = null;
                    }
                }
            }
            h67Var.t0.N(h67Var);
            h67Var.B0.removeCallbacksAndMessages(null);
            h67Var.R0 = true;
            h67Var.C0.clear();
        }
        t47Var.z0 = null;
    }

    @Override // defpackage.bk0
    public final void m() {
        bn4 bn4Var = this.p;
        bn4Var.o = null;
        bn4Var.y0 = null;
        bn4Var.x0 = null;
        bn4Var.Y = -9223372036854775807L;
        ((hc8) bn4Var.v0).N(null);
        bn4Var.v0 = null;
        HashMap map = bn4Var.b;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((zm4) it.next()).b.N(null);
        }
        bn4Var.d.removeCallbacksAndMessages(null);
        bn4Var.d = null;
        map.clear();
        this.l.release();
    }

    public final void q(h57 h57Var) {
        long j;
        x2f x2fVar;
        long j2;
        long jB;
        long j3;
        boolean z = h57Var.p;
        boolean z2 = h57Var.g;
        wg7 wg7Var = h57Var.r;
        long j4 = h57Var.u;
        long jB2 = h57Var.e;
        int i = h57Var.d;
        long j5 = h57Var.h;
        long jK = z ? xxg.K(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jK : -9223372036854775807L;
        bn4 bn4Var = this.p;
        p57 p57Var = (p57) bn4Var.x0;
        p57Var.getClass();
        rha rhaVar = new rha(21);
        new q47(p57Var.a, p57Var.b, p57Var.e, p57Var.f, p57Var.g, p57Var.h, p57Var.i, p57Var.j, p57Var.k, p57Var.c, p57Var.l, p57Var.m);
        if (bn4Var.X) {
            g57 g57Var = h57Var.v;
            long j7 = j5 - bn4Var.Y;
            boolean z3 = h57Var.o;
            long j8 = z3 ? j7 + j4 : -9223372036854775807L;
            long jB3 = h57Var.p ? xxg.B(xxg.s(this.q)) - (j5 + j4) : 0L;
            long j9 = this.s.a;
            if (j9 != -9223372036854775807L) {
                jB = xxg.B(j9);
            } else {
                if (jB2 != -9223372036854775807L) {
                    j2 = j4 - jB2;
                } else {
                    j2 = g57Var.d;
                    if (j2 == -9223372036854775807L || h57Var.n == -9223372036854775807L) {
                        j2 = g57Var.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * h57Var.m;
                        }
                    }
                }
                jB = j2 + jB3;
            }
            long j10 = j4 + jB3;
            long j11 = xxg.j(jB, jB3, j10);
            xz8 xz8Var = this.r.c;
            boolean z4 = xz8Var.d == -3.4028235E38f && xz8Var.o == -3.4028235E38f && g57Var.c == -9223372036854775807L && g57Var.d == -9223372036854775807L;
            long jK2 = xxg.K(j11);
            this.s = new xz8(jK2, -9223372036854775807L, -9223372036854775807L, z4 ? 1.0f : this.s.d, z4 ? 1.0f : this.s.o);
            if (jB2 == -9223372036854775807L) {
                jB2 = j10 - xxg.B(jK2);
            }
            if (z2) {
                j3 = jB2;
            } else {
                y47 y47VarP = p(jB2, h57Var.s);
                if (y47VarP != null) {
                    j3 = y47VarP.o;
                } else if (wg7Var.isEmpty()) {
                    j3 = 0;
                } else {
                    c57 c57Var = (c57) wg7Var.get(xxg.d(Long.valueOf(jB2), wg7Var, true));
                    y47 y47VarP2 = p(jB2, c57Var.w0);
                    j3 = y47VarP2 != null ? y47VarP2.o : c57Var.o;
                }
            }
            x2fVar = new x2f(j6, jK, j8, h57Var.u, j7, j3, true, !z3, i == 2 && h57Var.f, rhaVar, this.r, this.s);
        } else {
            if (jB2 == -9223372036854775807L || wg7Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jB2 != j4) {
                    jB2 = ((c57) wg7Var.get(xxg.d(Long.valueOf(jB2), wg7Var, true))).o;
                }
                j = jB2;
            }
            long j12 = h57Var.u;
            x2fVar = new x2f(j6, jK, j12, j12, 0L, j, true, false, true, rhaVar, this.r, null);
        }
        j(x2fVar);
    }
}
