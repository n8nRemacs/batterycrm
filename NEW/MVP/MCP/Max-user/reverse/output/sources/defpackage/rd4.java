package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class rd4 extends bk0 {
    public hc8 A;
    public vgg B;
    public DashManifestStaleException C;
    public Handler D;
    public xz8 E;
    public Uri F;
    public final Uri G;
    public zc4 H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final i09 h;
    public final boolean i;
    public final ne4 j;
    public final a3b k;
    public final lcj l;
    public final j55 m;
    public final rha n;
    public final ywf o;
    public final long p;
    public final qr4 q;
    public final wmb r;
    public final ukd s;
    public final Object t;
    public final SparseArray u;
    public final kd4 v;
    public final kd4 w;
    public final h08 x;
    public final ic8 y;
    public qe4 z;

    static {
        tm5.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [kd4] */
    /* JADX WARN: Type inference failed for: r2v15, types: [kd4] */
    public rd4(i09 i09Var, ne4 ne4Var, wmb wmbVar, a3b a3bVar, lcj lcjVar, j55 j55Var, rha rhaVar, long j) {
        this.h = i09Var;
        this.E = i09Var.c;
        c09 c09Var = i09Var.b;
        c09Var.getClass();
        Uri uri = c09Var.a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.j = ne4Var;
        this.r = wmbVar;
        this.k = a3bVar;
        this.m = j55Var;
        this.n = rhaVar;
        this.p = j;
        this.l = lcjVar;
        this.o = new ywf(2);
        this.i = false;
        this.q = new qr4((CopyOnWriteArrayList) this.c.d, 0, (c99) null, 0L);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new h08(13, this);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new ukd(14, this);
        this.y = new t9f(13, this);
        final int i = 0;
        this.v = new Runnable(this) { // from class: kd4
            public final /* synthetic */ rd4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.t();
                        break;
                    default:
                        this.b.s(false);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.w = new Runnable(this) { // from class: kd4
            public final /* synthetic */ rd4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.t();
                        break;
                    default:
                        this.b.s(false);
                        break;
                }
            }
        };
    }

    public static boolean p(krb krbVar) {
        List list = krbVar.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((w8) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bk0
    public final o29 a(c99 c99Var, qi4 qi4Var, long j) {
        int iIntValue = ((Integer) c99Var.a).intValue() - this.O;
        qr4 qr4Var = new qr4((CopyOnWriteArrayList) this.c.d, 0, c99Var, this.H.b(iIntValue).b);
        lk6 lk6Var = new lk6((CopyOnWriteArrayList) this.d.d, 0, c99Var, 10);
        int i = this.O + iIntValue;
        zc4 zc4Var = this.H;
        vgg vggVar = this.B;
        long j2 = this.L;
        m4c m4cVar = this.g;
        fsi.e(m4cVar);
        id4 id4Var = new id4(i, zc4Var, this.o, iIntValue, this.k, vggVar, this.m, lk6Var, this.n, qr4Var, j2, this.y, qi4Var, this.l, this.x, m4cVar);
        this.u.put(i, id4Var);
        return id4Var;
    }

    @Override // defpackage.bk0
    public final i09 f() {
        return this.h;
    }

    @Override // defpackage.bk0
    public final void g() {
        this.y.b();
    }

    @Override // defpackage.bk0
    public final void i(vgg vggVar) {
        this.B = vggVar;
        j55 j55Var = this.m;
        j55Var.prepare();
        Looper looperMyLooper = Looper.myLooper();
        m4c m4cVar = this.g;
        fsi.e(m4cVar);
        j55Var.c(looperMyLooper, m4cVar);
        if (this.i) {
            s(false);
            return;
        }
        this.z = this.j.a();
        this.A = new hc8("DashMediaSource", 0);
        this.D = xxg.l(null);
        t();
    }

    @Override // defpackage.bk0
    public final void k(o29 o29Var) {
        id4 id4Var = (id4) o29Var;
        j4c j4cVar = id4Var.w0;
        j4cVar.X = true;
        j4cVar.b.removeCallbacksAndMessages(null);
        for (n93 n93Var : id4Var.B0) {
            n93Var.u(id4Var);
        }
        id4Var.A0 = null;
        this.u.remove(id4Var.a);
    }

    @Override // defpackage.bk0
    public final void m() {
        this.I = false;
        this.z = null;
        hc8 hc8Var = this.A;
        if (hc8Var != null) {
            hc8Var.N(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.u.clear();
        ywf ywfVar = this.o;
        ((HashMap) ywfVar.a).clear();
        ((HashMap) ywfVar.b).clear();
        ((HashMap) ywfVar.c).clear();
        this.m.release();
    }

    public final void q() {
        boolean z;
        hc8 hc8Var = this.A;
        iv6 iv6Var = new iv6(13, this);
        synchronized (tmi.b) {
            z = tmi.c;
        }
        if (z) {
            iv6Var.v();
            return;
        }
        if (hc8Var == null) {
            hc8Var = new hc8("SntpClient", 0);
        }
        hc8Var.O(new rha(29), new hfd(5, iv6Var), 1);
    }

    public final void r(ymb ymbVar, long j, long j2) {
        long j3 = ymbVar.a;
        ye4 ye4Var = ymbVar.b;
        ydf ydfVar = ymbVar.d;
        tb8 tb8Var = new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        this.n.getClass();
        this.q.d(tb8Var, ymbVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038c  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [int] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r5v23, types: [an5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(boolean r45) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd4.s(boolean):void");
    }

    public final void t() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.G()) {
            return;
        }
        if (this.A.I()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        ymb ymbVar = new ymb(this.z, uri, 4, this.r);
        ukd ukdVar = this.s;
        this.n.getClass();
        this.q.k(new tb8(ymbVar.a, ymbVar.b, this.A.O(ymbVar, ukdVar, 3)), ymbVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
