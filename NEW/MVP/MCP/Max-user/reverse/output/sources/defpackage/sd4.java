package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sd4 extends ck0 {
    public te8 A;
    public wgg B;
    public DashManifestStaleException C;
    public Handler D;
    public yz8 E;
    public Uri F;
    public final Uri G;
    public ad4 H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public k09 P;
    public final boolean h;
    public final oe4 i;
    public final tc4 j;
    public final kc3 k;
    public final k55 l;
    public final tha m;
    public final k5i n;
    public final long o;
    public final long p;
    public final lk6 q;
    public final xmb r;
    public final kce s;
    public final Object t;
    public final SparseArray u;
    public final ld4 v;
    public final ld4 w;
    public final a3b x;
    public final jc8 y;
    public se4 z;

    static {
        e19.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [ld4] */
    /* JADX WARN: Type inference failed for: r2v12, types: [ld4] */
    public sd4(k09 k09Var, oe4 oe4Var, xmb xmbVar, tc4 tc4Var, kc3 kc3Var, k55 k55Var, tha thaVar, long j, long j2) {
        this.P = k09Var;
        this.E = k09Var.c;
        a09 a09Var = k09Var.b;
        a09Var.getClass();
        Uri uri = a09Var.a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.i = oe4Var;
        this.r = xmbVar;
        this.j = tc4Var;
        this.l = k55Var;
        this.m = thaVar;
        this.o = j;
        this.p = j2;
        this.k = kc3Var;
        this.n = new k5i(2);
        this.h = false;
        this.q = b(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new a3b(13, this);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new kce(14, this);
        this.y = new x6i(12, this);
        final int i = 0;
        this.v = new Runnable(this) { // from class: ld4
            public final /* synthetic */ sd4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.A();
                        break;
                    default:
                        this.b.y(false);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.w = new Runnable(this) { // from class: ld4
            public final /* synthetic */ sd4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.A();
                        break;
                    default:
                        this.b.y(false);
                        break;
                }
            }
        };
    }

    public static boolean u(lrb lrbVar) {
        List list = lrbVar.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((x8) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.x()) {
            return;
        }
        if (this.A.A()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        hsi.i(uri, "The uri must be set.");
        zmb zmbVar = new zmb(this.z, new ze4(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, this.r);
        kce kceVar = this.s;
        this.m.getClass();
        this.A.F(zmbVar, kceVar, 3);
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
        int iIntValue = ((Integer) d99Var.a).intValue() - this.O;
        lk6 lk6VarB = b(d99Var);
        d55 d55Var = new d55(this.d.c, 0, d99Var);
        int i = this.O + iIntValue;
        ad4 ad4Var = this.H;
        wgg wggVar = this.B;
        long j2 = this.L;
        n4c n4cVar = this.g;
        hsi.h(n4cVar);
        jd4 jd4Var = new jd4(i, ad4Var, this.n, iIntValue, this.j, wggVar, this.l, d55Var, this.m, lk6VarB, j2, this.y, ri4Var, this.k, this.x, n4cVar);
        this.u.put(i, jd4Var);
        return jd4Var;
    }

    @Override // defpackage.ck0
    public final synchronized k09 i() {
        return this.P;
    }

    @Override // defpackage.ck0
    public final void k() {
        this.y.b();
    }

    @Override // defpackage.ck0
    public final void m(wgg wggVar) {
        this.B = wggVar;
        Looper looperMyLooper = Looper.myLooper();
        n4c n4cVar = this.g;
        hsi.h(n4cVar);
        k55 k55Var = this.l;
        k55Var.c(looperMyLooper, n4cVar);
        k55Var.prepare();
        if (this.h) {
            y(false);
            return;
        }
        this.z = this.i.a();
        this.A = new te8("DashMediaSource");
        this.D = zxg.n(null);
        A();
    }

    @Override // defpackage.ck0
    public final void o(p29 p29Var) {
        jd4 jd4Var = (jd4) p29Var;
        j4c j4cVar = jd4Var.w0;
        j4cVar.X = true;
        j4cVar.b.removeCallbacksAndMessages(null);
        for (o93 o93Var : jd4Var.C0) {
            o93Var.A(jd4Var);
        }
        jd4Var.B0 = null;
        this.u.remove(jd4Var.a);
    }

    @Override // defpackage.ck0
    public final void q() {
        this.I = false;
        this.z = null;
        te8 te8Var = this.A;
        if (te8Var != null) {
            te8Var.D(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
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
        this.u.clear();
        k5i k5iVar = this.n;
        ((HashMap) k5iVar.b).clear();
        ((HashMap) k5iVar.c).clear();
        ((HashMap) k5iVar.d).clear();
        this.l.release();
    }

    @Override // defpackage.ck0
    public final synchronized void t(k09 k09Var) {
        this.P = k09Var;
    }

    public final void v() {
        boolean z;
        te8 te8Var = this.A;
        ao6 ao6Var = new ao6(12, this);
        synchronized (vmi.b) {
            z = vmi.c;
        }
        if (z) {
            ao6Var.o();
            return;
        }
        if (te8Var == null) {
            te8Var = new te8("SntpClient");
        }
        te8Var.F(new tha(29), new qd4(1, ao6Var), 1);
    }

    public final void w(zmb zmbVar, long j) {
        long j2 = zmbVar.a;
        ze4 ze4Var = zmbVar.b;
        zdf zdfVar = zmbVar.d;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j, zdfVar.b);
        this.m.getClass();
        this.q.M(ub8Var, zmbVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        a8i.h("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0378  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(boolean r42) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd4.y(boolean):void");
    }

    public final void z(wib wibVar, xmb xmbVar) {
        se4 se4Var = this.z;
        Uri uri = Uri.parse((String) wibVar.c);
        Map map = Collections.EMPTY_MAP;
        hsi.i(uri, "The uri must be set.");
        this.A.F(new zmb(se4Var, new ze4(uri, 0L, 1, null, map, 0L, -1L, null, 1), 5, xmbVar), new qd4(0, this), 1);
    }
}
