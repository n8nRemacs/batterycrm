package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class foc implements o29, jp5, ac8, fc8, exd {
    public static final Map V0;
    public static final gf6 W0;
    public dc7 A0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public gge G0;
    public h9e H0;
    public boolean J0;
    public boolean L0;
    public boolean M0;
    public int N0;
    public long P0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public boolean U0;
    public final lk6 X;
    public final koc Y;
    public final qi4 Z;
    public final Uri a;
    public final qe4 b;
    public final j55 c;
    public final rha d;
    public final qr4 o;
    public final long s0;
    public final hc8 u0;
    public final wnc w0;
    public final wnc x0;
    public m29 z0;
    public final hc8 t0 = new hc8("ProgressiveMediaPeriod", 0);
    public final xn3 v0 = new xn3(0);
    public final Handler y0 = xxg.l(null);
    public doc[] C0 = new doc[0];
    public gxd[] B0 = new gxd[0];
    public long Q0 = -9223372036854775807L;
    public long O0 = -1;
    public long I0 = -9223372036854775807L;
    public int K0 = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        V0 = Collections.unmodifiableMap(map);
        ef6 ef6Var = new ef6();
        ef6Var.a = "icy";
        ef6Var.k = "application/x-icy";
        W0 = new gf6(ef6Var);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [wnc] */
    /* JADX WARN: Type inference failed for: r1v5, types: [wnc] */
    public foc(Uri uri, qe4 qe4Var, hc8 hc8Var, j55 j55Var, lk6 lk6Var, rha rhaVar, qr4 qr4Var, koc kocVar, qi4 qi4Var, int i) {
        this.a = uri;
        this.b = qe4Var;
        this.c = j55Var;
        this.X = lk6Var;
        this.d = rhaVar;
        this.o = qr4Var;
        this.Y = kocVar;
        this.Z = qi4Var;
        this.s0 = i;
        this.u0 = hc8Var;
        final int i2 = 0;
        this.w0 = new Runnable(this) { // from class: wnc
            public final /* synthetic */ foc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.m();
                        break;
                    default:
                        foc focVar = this.b;
                        if (!focVar.U0) {
                            m29 m29Var = focVar.z0;
                            m29Var.getClass();
                            m29Var.b(focVar);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 1;
        this.x0 = new Runnable(this) { // from class: wnc
            public final /* synthetic */ foc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.m();
                        break;
                    default:
                        foc focVar = this.b;
                        if (!focVar.U0) {
                            m29 m29Var = focVar.z0;
                            m29Var.getClass();
                            m29Var.b(focVar);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // defpackage.ac8
    public final void A(dc8 dc8Var, long j, long j2) {
        h9e h9eVar;
        znc zncVar = (znc) dc8Var;
        if (this.I0 == -9223372036854775807L && (h9eVar = this.H0) != null) {
            boolean zC = h9eVar.c();
            long jG = g();
            long j3 = jG == Long.MIN_VALUE ? 0L : jG + WorkRequest.MIN_BACKOFF_MILLIS;
            this.I0 = j3;
            this.Y.q(j3, zC, this.J0);
        }
        ydf ydfVar = zncVar.c;
        tb8 tb8Var = new tb8(zncVar.a, zncVar.u0, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        this.d.getClass();
        this.o.f(tb8Var, 1, -1, null, 0, null, zncVar.t0, this.I0);
        if (this.O0 == -1) {
            this.O0 = zncVar.v0;
        }
        this.T0 = true;
        m29 m29Var = this.z0;
        m29Var.getClass();
        m29Var.b(this);
    }

    @Override // defpackage.jp5
    public final rfg B(int i, int i2) {
        return s(new doc(i, false));
    }

    @Override // defpackage.o29
    public final void C(m29 m29Var, long j) {
        this.z0 = m29Var;
        this.v0.e();
        t();
    }

    @Override // defpackage.ac8
    public final y21 D(dc8 dc8Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        y21 y21Var;
        h9e h9eVar;
        znc zncVar = (znc) dc8Var;
        if (this.O0 == -1) {
            this.O0 = zncVar.v0;
        }
        ydf ydfVar = zncVar.c;
        tb8 tb8Var = new tb8(zncVar.a, zncVar.u0, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        int i2 = xxg.a;
        this.d.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i3 = DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            y21Var = hc8.Y;
        } else {
            int iE = e();
            int i4 = iE > this.S0 ? 1 : 0;
            if (this.O0 != -1 || ((h9eVar = this.H0) != null && h9eVar.f() != -9223372036854775807L)) {
                this.S0 = iE;
            } else if (!this.E0 || u()) {
                this.M0 = this.E0;
                this.P0 = 0L;
                this.S0 = 0;
                for (gxd gxdVar : this.B0) {
                    gxdVar.x(false);
                }
                zncVar.Y.a = 0L;
                zncVar.t0 = 0L;
                zncVar.s0 = true;
                zncVar.x0 = false;
            } else {
                this.R0 = true;
                y21Var = hc8.X;
            }
            y21Var = new y21(jMin, i4, 4, false);
        }
        y21 y21Var2 = y21Var;
        this.o.h(tb8Var, 1, -1, null, 0, null, zncVar.t0, this.I0, iOException, !y21Var2.a());
        return y21Var2;
    }

    @Override // defpackage.o29
    public final long E(an5[] an5VarArr, boolean[] zArr, ixd[] ixdVarArr, boolean[] zArr2, long j) {
        an5 an5Var;
        c();
        gge ggeVar = this.G0;
        mfg mfgVar = (mfg) ggeVar.b;
        boolean[] zArr3 = (boolean[]) ggeVar.d;
        int i = this.N0;
        int i2 = 0;
        for (int i3 = 0; i3 < an5VarArr.length; i3++) {
            ixd ixdVar = ixdVarArr[i3];
            if (ixdVar != null && (an5VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((boc) ixdVar).a;
                fsi.d(zArr3[i4]);
                this.N0--;
                zArr3[i4] = false;
                ixdVarArr[i3] = null;
            }
        }
        boolean z = !this.L0 ? j == 0 : i != 0;
        for (int i5 = 0; i5 < an5VarArr.length; i5++) {
            if (ixdVarArr[i5] == null && (an5Var = an5VarArr[i5]) != null) {
                fsi.d(an5Var.length() == 1);
                fsi.d(an5Var.f(0) == 0);
                int iB = mfgVar.b(an5Var.a());
                fsi.d(!zArr3[iB]);
                this.N0++;
                zArr3[iB] = true;
                ixdVarArr[i5] = new boc(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    gxd gxdVar = this.B0[iB];
                    z = (gxdVar.y(j, true) || gxdVar.n() == 0) ? false : true;
                }
            }
        }
        if (this.N0 == 0) {
            this.R0 = false;
            this.M0 = false;
            hc8 hc8Var = this.t0;
            if (hc8Var.I()) {
                gxd[] gxdVarArr = this.B0;
                int length = gxdVarArr.length;
                while (i2 < length) {
                    gxdVarArr[i2].h();
                    i2++;
                }
                hc8Var.x();
            } else {
                for (gxd gxdVar2 : this.B0) {
                    gxdVar2.x(false);
                }
            }
        } else if (z) {
            j = h(j);
            while (i2 < ixdVarArr.length) {
                if (ixdVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.L0 = true;
        return j;
    }

    @Override // defpackage.jp5
    public final void N(h9e h9eVar) {
        this.y0.post(new d8c(this, 9, h9eVar));
    }

    @Override // defpackage.fc8
    public final void a() {
        for (gxd gxdVar : this.B0) {
            gxdVar.x(true);
            mc5 mc5Var = gxdVar.h;
            if (mc5Var != null) {
                mc5Var.E(gxdVar.e);
                gxdVar.h = null;
                gxdVar.g = null;
            }
        }
        hc8 hc8Var = this.u0;
        fp5 fp5Var = (fp5) hc8Var.c;
        if (fp5Var != null) {
            fp5Var.release();
            hc8Var.c = null;
        }
        hc8Var.d = null;
    }

    @Override // defpackage.exd
    public final void b() {
        this.y0.post(this.w0);
    }

    public final void c() {
        fsi.d(this.E0);
        this.G0.getClass();
        this.H0.getClass();
    }

    @Override // defpackage.iee
    public final long d() {
        if (this.N0 == 0) {
            return Long.MIN_VALUE;
        }
        return o();
    }

    public final int e() {
        int i = 0;
        for (gxd gxdVar : this.B0) {
            i += gxdVar.q + gxdVar.p;
        }
        return i;
    }

    @Override // defpackage.o29
    public final void f() throws IOException {
        int iQ = this.d.q(this.K0);
        hc8 hc8Var = this.t0;
        IOException iOException = (IOException) hc8Var.d;
        if (iOException != null) {
            throw iOException;
        }
        cc8 cc8Var = (cc8) hc8Var.c;
        if (cc8Var != null) {
            if (iQ == Integer.MIN_VALUE) {
                iQ = cc8Var.b;
            }
            IOException iOException2 = cc8Var.d;
            if (iOException2 != null && cc8Var.o > iQ) {
                throw iOException2;
            }
        }
        if (this.T0 && !this.E0) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    public final long g() {
        long j;
        long jMax = Long.MIN_VALUE;
        for (gxd gxdVar : this.B0) {
            synchronized (gxdVar) {
                j = gxdVar.v;
            }
            jMax = Math.max(jMax, j);
        }
        return jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    @Override // defpackage.o29
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(long r6) {
        /*
            r5 = this;
            r5.c()
            gge r0 = r5.G0
            java.lang.Object r0 = r0.c
            boolean[] r0 = (boolean[]) r0
            h9e r1 = r5.H0
            boolean r1 = r1.c()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r6 = 0
        L14:
            r1 = 0
            r5.M0 = r1
            r5.P0 = r6
            boolean r2 = r5.i()
            if (r2 == 0) goto L22
            r5.Q0 = r6
            return r6
        L22:
            int r2 = r5.K0
            r3 = 7
            if (r2 == r3) goto L43
            gxd[] r2 = r5.B0
            int r2 = r2.length
            r3 = r1
        L2b:
            if (r3 >= r2) goto L73
            gxd[] r4 = r5.B0
            r4 = r4[r3]
            boolean r4 = r4.y(r6, r1)
            if (r4 != 0) goto L40
            boolean r4 = r0[r3]
            if (r4 != 0) goto L43
            boolean r4 = r5.F0
            if (r4 != 0) goto L40
            goto L43
        L40:
            int r3 = r3 + 1
            goto L2b
        L43:
            r5.R0 = r1
            r5.Q0 = r6
            r5.T0 = r1
            hc8 r0 = r5.t0
            boolean r2 = r0.I()
            if (r2 == 0) goto L62
            gxd[] r2 = r5.B0
            int r3 = r2.length
        L54:
            if (r1 >= r3) goto L5e
            r4 = r2[r1]
            r4.h()
            int r1 = r1 + 1
            goto L54
        L5e:
            r0.x()
            return r6
        L62:
            r2 = 0
            r0.d = r2
            gxd[] r0 = r5.B0
            int r2 = r0.length
            r3 = r1
        L69:
            if (r3 >= r2) goto L73
            r4 = r0[r3]
            r4.x(r1)
            int r3 = r3 + 1
            goto L69
        L73:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.foc.h(long):long");
    }

    public final boolean i() {
        return this.Q0 != -9223372036854775807L;
    }

    @Override // defpackage.iee
    public final boolean j() {
        boolean z;
        if (!this.t0.I()) {
            return false;
        }
        xn3 xn3Var = this.v0;
        synchronized (xn3Var) {
            z = xn3Var.b;
        }
        return z;
    }

    @Override // defpackage.o29
    public final long k() {
        if (!this.M0) {
            return -9223372036854775807L;
        }
        if (!this.T0 && e() <= this.S0) {
            return -9223372036854775807L;
        }
        this.M0 = false;
        return this.P0;
    }

    @Override // defpackage.o29
    public final mfg l() {
        c();
        return (mfg) this.G0.b;
    }

    public final void m() {
        sy9 sy9Var;
        if (this.U0 || this.E0 || !this.D0 || this.H0 == null) {
            return;
        }
        for (gxd gxdVar : this.B0) {
            if (gxdVar.q() == null) {
                return;
            }
        }
        xn3 xn3Var = this.v0;
        synchronized (xn3Var) {
            xn3Var.b = false;
        }
        int length = this.B0.length;
        kfg[] kfgVarArr = new kfg[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            gf6 gf6VarQ = this.B0[i].q();
            gf6VarQ.getClass();
            String str = gf6VarQ.v0;
            boolean zH = wz9.h(str);
            boolean z = zH || wz9.j(str);
            zArr[i] = z;
            this.F0 = z | this.F0;
            dc7 dc7Var = this.A0;
            if (dc7Var != null) {
                int i2 = dc7Var.a;
                if (zH || this.C0[i].b) {
                    sy9 sy9Var2 = gf6VarQ.t0;
                    if (sy9Var2 == null) {
                        sy9Var = new sy9(dc7Var);
                    } else {
                        qy9[] qy9VarArr = sy9Var2.a;
                        int i3 = xxg.a;
                        Object[] objArrCopyOf = Arrays.copyOf(qy9VarArr, qy9VarArr.length + 1);
                        System.arraycopy(new qy9[]{dc7Var}, 0, objArrCopyOf, qy9VarArr.length, 1);
                        sy9Var = new sy9((qy9[]) objArrCopyOf);
                    }
                    ef6 ef6VarA = gf6VarQ.a();
                    ef6VarA.i = sy9Var;
                    gf6VarQ = new gf6(ef6VarA);
                }
                if (zH && gf6VarQ.X == -1 && gf6VarQ.Y == -1 && i2 != -1) {
                    ef6 ef6VarA2 = gf6VarQ.a();
                    ef6VarA2.f = i2;
                    gf6VarQ = new gf6(ef6VarA2);
                }
            }
            int iB = this.c.b(gf6VarQ);
            ef6 ef6VarA3 = gf6VarQ.a();
            ef6VarA3.D = iB;
            kfgVarArr[i] = new kfg(Integer.toString(i), new gf6(ef6VarA3));
        }
        this.G0 = new gge(new mfg(kfgVarArr), zArr);
        this.E0 = true;
        m29 m29Var = this.z0;
        m29Var.getClass();
        m29Var.c(this);
    }

    public final void n(int i) {
        c();
        gge ggeVar = this.G0;
        boolean[] zArr = (boolean[]) ggeVar.o;
        if (zArr[i]) {
            return;
        }
        gf6 gf6Var = ((mfg) ggeVar.b).a(i).c[0];
        this.o.b(wz9.g(gf6Var.v0), gf6Var, 0, null, this.P0);
        zArr[i] = true;
    }

    @Override // defpackage.iee
    public final long o() {
        long jG;
        boolean z;
        long j;
        c();
        boolean[] zArr = (boolean[]) this.G0.c;
        if (this.T0) {
            return Long.MIN_VALUE;
        }
        if (i()) {
            return this.Q0;
        }
        if (this.F0) {
            int length = this.B0.length;
            jG = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    gxd gxdVar = this.B0[i];
                    synchronized (gxdVar) {
                        z = gxdVar.w;
                    }
                    if (z) {
                        continue;
                    } else {
                        gxd gxdVar2 = this.B0[i];
                        synchronized (gxdVar2) {
                            j = gxdVar2.v;
                        }
                        jG = Math.min(jG, j);
                    }
                }
            }
        } else {
            jG = Long.MAX_VALUE;
        }
        if (jG == BuildConfig.MAX_TIME_TO_UPLOAD) {
            jG = g();
        }
        return jG == Long.MIN_VALUE ? this.P0 : jG;
    }

    @Override // defpackage.iee
    public final void p(long j) {
    }

    public final void q(int i) {
        c();
        boolean[] zArr = (boolean[]) this.G0.c;
        if (this.R0 && zArr[i] && !this.B0[i].r(false)) {
            this.Q0 = 0L;
            this.R0 = false;
            this.M0 = true;
            this.P0 = 0L;
            this.S0 = 0;
            for (gxd gxdVar : this.B0) {
                gxdVar.x(false);
            }
            m29 m29Var = this.z0;
            m29Var.getClass();
            m29Var.b(this);
        }
    }

    @Override // defpackage.ac8
    public final void r(dc8 dc8Var, long j, long j2, boolean z) {
        znc zncVar = (znc) dc8Var;
        ydf ydfVar = zncVar.c;
        tb8 tb8Var = new tb8(zncVar.a, zncVar.u0, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        this.d.getClass();
        this.o.d(tb8Var, 1, -1, null, 0, null, zncVar.t0, this.I0);
        if (z) {
            return;
        }
        if (this.O0 == -1) {
            this.O0 = zncVar.v0;
        }
        for (gxd gxdVar : this.B0) {
            gxdVar.x(false);
        }
        if (this.N0 > 0) {
            m29 m29Var = this.z0;
            m29Var.getClass();
            m29Var.b(this);
        }
    }

    public final gxd s(doc docVar) {
        int length = this.B0.length;
        for (int i = 0; i < length; i++) {
            if (docVar.equals(this.C0[i])) {
                return this.B0[i];
            }
        }
        j55 j55Var = this.c;
        j55Var.getClass();
        gxd gxdVar = new gxd(this.Z, j55Var, this.X);
        gxdVar.f = this;
        int i2 = length + 1;
        doc[] docVarArr = (doc[]) Arrays.copyOf(this.C0, i2);
        docVarArr[length] = docVar;
        int i3 = xxg.a;
        this.C0 = docVarArr;
        gxd[] gxdVarArr = (gxd[]) Arrays.copyOf(this.B0, i2);
        gxdVarArr[length] = gxdVar;
        this.B0 = gxdVarArr;
        return gxdVar;
    }

    public final void t() {
        znc zncVar = new znc(this, this.a, this.b, this.u0, this, this.v0);
        if (this.E0) {
            fsi.d(i());
            long j = this.I0;
            if (j != -9223372036854775807L && this.Q0 > j) {
                this.T0 = true;
                this.Q0 = -9223372036854775807L;
                return;
            }
            h9e h9eVar = this.H0;
            h9eVar.getClass();
            long j2 = h9eVar.e(this.Q0).a.b;
            long j3 = this.Q0;
            zncVar.Y.a = j2;
            zncVar.t0 = j3;
            zncVar.s0 = true;
            zncVar.x0 = false;
            for (gxd gxdVar : this.B0) {
                gxdVar.t = this.Q0;
            }
            this.Q0 = -9223372036854775807L;
        }
        this.S0 = e();
        this.o.k(new tb8(zncVar.a, zncVar.u0, this.t0.O(zncVar, this, this.d.q(this.K0))), 1, -1, null, 0, null, zncVar.t0, this.I0);
    }

    public final boolean u() {
        return this.M0 || i();
    }

    @Override // defpackage.o29
    public final long v(long j, j9e j9eVar) {
        c();
        if (!this.H0.c()) {
            return 0L;
        }
        f9e f9eVarE = this.H0.e(j);
        return j9eVar.a(j, f9eVarE.a.a, f9eVarE.b.a);
    }

    @Override // defpackage.jp5
    public final void w() {
        this.D0 = true;
        this.y0.post(this.w0);
    }

    @Override // defpackage.o29
    public final void y(long j) {
        c();
        if (i()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.G0.d;
        int length = this.B0.length;
        for (int i = 0; i < length; i++) {
            this.B0[i].g(j, zArr[i]);
        }
    }

    @Override // defpackage.iee
    public final boolean z(long j) {
        if (this.T0) {
            return false;
        }
        hc8 hc8Var = this.t0;
        if (hc8Var.G() || this.R0) {
            return false;
        }
        if (this.E0 && this.N0 == 0) {
            return false;
        }
        boolean zE = this.v0.e();
        if (hc8Var.I()) {
            return zE;
        }
        t();
        return true;
    }
}
