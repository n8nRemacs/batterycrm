package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import androidx.work.WorkRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class goc implements p29, kp5, bc8, gc8, fxd {
    public static final Map a1;
    public static final hf6 b1;
    public final xnc A0;
    public final Handler B0;
    public n29 C0;
    public ec7 D0;
    public hxd[] E0;
    public eoc[] F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public ywf K0;
    public i9e L0;
    public long M0;
    public boolean N0;
    public int O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public long U0;
    public long V0;
    public boolean W0;
    public final d55 X;
    public int X0;
    public final loc Y;
    public boolean Y0;
    public final ri4 Z;
    public boolean Z0;
    public final Uri a;
    public final se4 b;
    public final k55 c;
    public final tha d;
    public final lk6 o;
    public final String s0;
    public final long t0;
    public final hf6 u0;
    public final long v0;
    public final te8 w0;
    public final ka5 x0;
    public final yn3 y0;
    public final xnc z0;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        a1 = Collections.unmodifiableMap(map);
        ff6 ff6Var = new ff6();
        ff6Var.a = "icy";
        ff6Var.m = xz9.n("application/x-icy");
        b1 = new hf6(ff6Var);
    }

    public goc(Uri uri, se4 se4Var, ka5 ka5Var, k55 k55Var, d55 d55Var, tha thaVar, lk6 lk6Var, loc locVar, ri4 ri4Var, String str, int i, hf6 hf6Var, long j, hkd hkdVar) {
        this.a = uri;
        this.b = se4Var;
        this.c = k55Var;
        this.X = d55Var;
        this.d = thaVar;
        this.o = lk6Var;
        this.Y = locVar;
        this.Z = ri4Var;
        this.s0 = str;
        this.t0 = i;
        this.u0 = hf6Var;
        this.w0 = hkdVar != null ? new te8(hkdVar) : new te8("ProgressiveMediaPeriod");
        this.x0 = ka5Var;
        this.v0 = j;
        this.y0 = new yn3();
        this.z0 = new xnc(this, 1);
        this.A0 = new xnc(this, 2);
        this.B0 = zxg.n(null);
        this.F0 = new eoc[0];
        this.E0 = new hxd[0];
        this.V0 = -9223372036854775807L;
        this.O0 = 1;
    }

    public final void A(i9e i9eVar) {
        this.L0 = this.D0 == null ? i9eVar : new ge0(-9223372036854775807L);
        this.M0 = i9eVar.f();
        boolean z = !this.T0 && i9eVar.f() == -9223372036854775807L;
        this.N0 = z;
        this.O0 = z ? 7 : 1;
        if (this.H0) {
            this.Y.v(this.M0, i9eVar, z);
        } else {
            u();
        }
    }

    @Override // defpackage.kp5
    /* renamed from: B */
    public final sfg mo163B(int i, int i2) {
        return z(new eoc(i, false));
    }

    public final void C() {
        aoc aocVar = new aoc(this, this.a, this.b, this.x0, this, this.y0);
        if (this.H0) {
            hsi.g(s());
            long j = this.M0;
            if (j != -9223372036854775807L && this.V0 > j) {
                this.Y0 = true;
                this.V0 = -9223372036854775807L;
                return;
            }
            i9e i9eVar = this.L0;
            i9eVar.getClass();
            long j2 = i9eVar.e(this.V0).a.b;
            long j3 = this.V0;
            aocVar.X.a = j2;
            aocVar.s0 = j3;
            aocVar.Z = true;
            aocVar.v0 = false;
            for (hxd hxdVar : this.E0) {
                hxdVar.t = this.V0;
            }
            this.V0 = -9223372036854775807L;
        }
        this.X0 = g();
        this.w0.F(aocVar, this, this.d.q(this.O0));
    }

    public final boolean D() {
        return this.Q0 || s();
    }

    @Override // defpackage.bc8
    public final void G(ec8 ec8Var, long j, long j2, int i) {
        ub8 ub8Var;
        aoc aocVar = (aoc) ec8Var;
        zdf zdfVar = aocVar.b;
        if (i == 0) {
            ub8Var = new ub8(aocVar.t0);
        } else {
            ze4 ze4Var = aocVar.t0;
            Uri uri = zdfVar.c;
            ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        }
        this.o.R(ub8Var, 1, -1, null, 0, null, aocVar.s0, this.M0, i);
    }

    @Override // defpackage.bc8
    public final y21 K(ec8 ec8Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        y21 y21Var;
        i9e i9eVar;
        aoc aocVar = (aoc) ec8Var;
        zdf zdfVar = aocVar.b;
        ze4 ze4Var = aocVar.t0;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        String str = zxg.a;
        this.d.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i2 = DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            y21Var = te8.X;
        } else {
            int iG = g();
            int i3 = iG > this.X0 ? 1 : 0;
            if (this.T0 || !((i9eVar = this.L0) == null || i9eVar.f() == -9223372036854775807L)) {
                this.X0 = iG;
            } else if (!this.H0 || D()) {
                this.Q0 = this.H0;
                this.U0 = 0L;
                this.X0 = 0;
                for (hxd hxdVar : this.E0) {
                    hxdVar.A(false);
                }
                aocVar.X.a = 0L;
                aocVar.s0 = 0L;
                aocVar.Z = true;
                aocVar.v0 = false;
            } else {
                this.W0 = true;
                y21Var = te8.o;
            }
            y21Var = new y21(jMin, i3, 5, false);
        }
        y21 y21Var2 = y21Var;
        this.o.O(ub8Var, 1, -1, null, 0, null, aocVar.s0, this.M0, iOException, !y21Var2.a());
        return y21Var2;
    }

    @Override // defpackage.kp5
    public final void Q(i9e i9eVar) {
        this.B0.post(new d8c(this, 10, i9eVar));
    }

    @Override // defpackage.gc8
    public final void a() {
        for (hxd hxdVar : this.E0) {
            hxdVar.A(true);
            z45 z45Var = hxdVar.h;
            if (z45Var != null) {
                z45Var.c(hxdVar.e);
                hxdVar.h = null;
                hxdVar.g = null;
            }
        }
        ka5 ka5Var = this.x0;
        gp5 gp5Var = (gp5) ka5Var.b;
        if (gp5Var != null) {
            gp5Var.release();
            ka5Var.b = null;
        }
        ka5Var.c = null;
    }

    @Override // defpackage.fxd
    public final void b() {
        this.B0.post(this.z0);
    }

    @Override // defpackage.p29
    public final long c(long j, k9e k9eVar) {
        e();
        if (!this.L0.c()) {
            return 0L;
        }
        g9e g9eVarE = this.L0.e(j);
        return k9eVar.a(j, g9eVarE.a.a, g9eVarE.b.a);
    }

    @Override // defpackage.jee
    public final long d() {
        return o();
    }

    public final void e() {
        hsi.g(this.H0);
        this.K0.getClass();
        this.L0.getClass();
    }

    @Override // defpackage.p29
    public final void f() throws IOException {
        int iQ = this.d.q(this.O0);
        te8 te8Var = this.w0;
        IOException iOException = (IOException) te8Var.c;
        if (iOException != null) {
            throw iOException;
        }
        cc8 cc8Var = (cc8) te8Var.b;
        if (cc8Var != null) {
            if (iQ == Integer.MIN_VALUE) {
                iQ = cc8Var.b;
            }
            IOException iOException2 = cc8Var.d;
            if (iOException2 != null && cc8Var.o > iQ) {
                throw iOException2;
            }
        }
        if (this.Y0 && !this.H0) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    public final int g() {
        int i = 0;
        for (hxd hxdVar : this.E0) {
            i += hxdVar.q + hxdVar.p;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    @Override // defpackage.p29
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(long r10) {
        /*
            r9 = this;
            r9.e()
            ywf r0 = r9.K0
            java.lang.Object r0 = r0.b
            boolean[] r0 = (boolean[]) r0
            i9e r1 = r9.L0
            boolean r1 = r1.c()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r10 = 0
        L14:
            r1 = 0
            r9.Q0 = r1
            long r2 = r9.U0
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L20
            r2 = r3
            goto L21
        L20:
            r2 = r1
        L21:
            r9.U0 = r10
            boolean r4 = r9.s()
            if (r4 == 0) goto L2c
            r9.V0 = r10
            return r10
        L2c:
            int r4 = r9.O0
            r5 = 7
            te8 r6 = r9.w0
            if (r4 == r5) goto L73
            boolean r4 = r9.Y0
            if (r4 != 0) goto L3d
            boolean r4 = r6.A()
            if (r4 == 0) goto L73
        L3d:
            hxd[] r4 = r9.E0
            int r4 = r4.length
            r5 = r1
        L41:
            if (r5 >= r4) goto L70
            hxd[] r7 = r9.E0
            r7 = r7[r5]
            int r8 = r7.q()
            if (r8 != 0) goto L50
            if (r2 == 0) goto L50
            goto L6d
        L50:
            boolean r8 = r9.J0
            if (r8 == 0) goto L5b
            int r8 = r7.q
            boolean r7 = r7.B(r8)
            goto L61
        L5b:
            boolean r8 = r9.Y0
            boolean r7 = r7.C(r10, r8)
        L61:
            if (r7 != 0) goto L6d
            boolean r7 = r0[r5]
            if (r7 != 0) goto L6b
            boolean r7 = r9.I0
            if (r7 != 0) goto L6d
        L6b:
            r3 = r1
            goto L70
        L6d:
            int r5 = r5 + 1
            goto L41
        L70:
            if (r3 == 0) goto L73
            goto La3
        L73:
            r9.W0 = r1
            r9.V0 = r10
            r9.Y0 = r1
            r9.R0 = r1
            boolean r0 = r6.A()
            if (r0 == 0) goto L92
            hxd[] r0 = r9.E0
            int r2 = r0.length
        L84:
            if (r1 >= r2) goto L8e
            r3 = r0[r1]
            r3.h()
            int r1 = r1 + 1
            goto L84
        L8e:
            r6.c()
            return r10
        L92:
            r0 = 0
            r6.c = r0
            hxd[] r0 = r9.E0
            int r2 = r0.length
            r3 = r1
        L99:
            if (r3 >= r2) goto La3
            r4 = r0[r3]
            r4.A(r1)
            int r3 = r3 + 1
            goto L99
        La3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goc.h(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            hxd[] r3 = r5.E0
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            ywf r3 = r5.K0
            r3.getClass()
            java.lang.Object r3 = r3.c
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            hxd[] r3 = r5.E0
            r3 = r3[r2]
            long r3 = r3.n()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goc.i(boolean):long");
    }

    @Override // defpackage.jee
    public final boolean j() {
        return this.w0.A() && this.y0.e();
    }

    @Override // defpackage.p29
    public final long k() {
        if (this.R0) {
            this.R0 = false;
            return this.U0;
        }
        if (!this.Q0) {
            return -9223372036854775807L;
        }
        if (!this.Y0 && g() <= this.X0) {
            return -9223372036854775807L;
        }
        this.Q0 = false;
        return this.U0;
    }

    @Override // defpackage.p29
    public final nfg l() {
        e();
        return (nfg) this.K0.a;
    }

    @Override // defpackage.p29
    public final long m(bn5[] bn5VarArr, boolean[] zArr, jxd[] jxdVarArr, boolean[] zArr2, long j) {
        bn5 bn5Var;
        e();
        ywf ywfVar = this.K0;
        nfg nfgVar = (nfg) ywfVar.a;
        boolean[] zArr3 = (boolean[]) ywfVar.c;
        int i = this.S0;
        int i2 = 0;
        for (int i3 = 0; i3 < bn5VarArr.length; i3++) {
            jxd jxdVar = jxdVarArr[i3];
            if (jxdVar != null && (bn5VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((coc) jxdVar).a;
                hsi.g(zArr3[i4]);
                this.S0--;
                zArr3[i4] = false;
                jxdVarArr[i3] = null;
            }
        }
        boolean z = !this.P0 ? j == 0 || this.J0 : i != 0;
        for (int i5 = 0; i5 < bn5VarArr.length; i5++) {
            if (jxdVarArr[i5] == null && (bn5Var = bn5VarArr[i5]) != null) {
                hsi.g(bn5Var.length() == 1);
                hsi.g(bn5Var.f(0) == 0);
                int iB = nfgVar.b(bn5Var.a());
                hsi.g(!zArr3[iB]);
                this.S0++;
                zArr3[iB] = true;
                this.R0 = bn5Var.j().t | this.R0;
                jxdVarArr[i5] = new coc(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    hxd hxdVar = this.E0[iB];
                    z = (hxdVar.q() == 0 || hxdVar.C(j, true)) ? false : true;
                }
            }
        }
        if (this.S0 == 0) {
            this.W0 = false;
            this.Q0 = false;
            this.R0 = false;
            te8 te8Var = this.w0;
            if (te8Var.A()) {
                hxd[] hxdVarArr = this.E0;
                int length = hxdVarArr.length;
                while (i2 < length) {
                    hxdVarArr[i2].h();
                    i2++;
                }
                te8Var.c();
            } else {
                this.Y0 = false;
                for (hxd hxdVar2 : this.E0) {
                    hxdVar2.A(false);
                }
            }
        } else if (z) {
            j = h(j);
            while (i2 < jxdVarArr.length) {
                if (jxdVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.P0 = true;
        return j;
    }

    @Override // defpackage.p29
    public final void n(n29 n29Var, long j) {
        this.C0 = n29Var;
        hf6 hf6Var = this.u0;
        if (hf6Var == null) {
            this.y0.f();
            C();
        } else {
            mo163B(0, 3).d(hf6Var);
            A(new rj7(-9223372036854775807L, new long[]{0}, new long[]{0}));
            w();
            this.V0 = j;
        }
    }

    @Override // defpackage.jee
    public final long o() {
        long jI;
        boolean z;
        e();
        if (this.Y0 || this.S0 == 0) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.V0;
        }
        if (this.I0) {
            int length = this.E0.length;
            jI = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                ywf ywfVar = this.K0;
                if (((boolean[]) ywfVar.b)[i] && ((boolean[]) ywfVar.c)[i]) {
                    hxd hxdVar = this.E0[i];
                    synchronized (hxdVar) {
                        z = hxdVar.w;
                    }
                    if (!z) {
                        jI = Math.min(jI, this.E0[i].n());
                    }
                }
            }
        } else {
            jI = Long.MAX_VALUE;
        }
        if (jI == BuildConfig.MAX_TIME_TO_UPLOAD) {
            jI = i(false);
        }
        return jI == Long.MIN_VALUE ? this.U0 : jI;
    }

    @Override // defpackage.jee
    public final void p(long j) {
    }

    @Override // defpackage.bc8
    public final void q(ec8 ec8Var, long j, long j2, boolean z) {
        aoc aocVar = (aoc) ec8Var;
        zdf zdfVar = aocVar.b;
        ze4 ze4Var = aocVar.t0;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        this.d.getClass();
        this.o.M(ub8Var, 1, -1, null, 0, null, aocVar.s0, this.M0);
        if (z) {
            return;
        }
        for (hxd hxdVar : this.E0) {
            hxdVar.A(false);
        }
        if (this.S0 > 0) {
            n29 n29Var = this.C0;
            n29Var.getClass();
            n29Var.s(this);
        }
    }

    @Override // defpackage.jee
    public final boolean r(oc8 oc8Var) {
        if (this.Y0) {
            return false;
        }
        te8 te8Var = this.w0;
        if (te8Var.x() || this.W0) {
            return false;
        }
        if ((this.H0 || this.u0 != null) && this.S0 == 0) {
            return false;
        }
        boolean zF = this.y0.f();
        if (te8Var.A()) {
            return zF;
        }
        C();
        return true;
    }

    public final boolean s() {
        return this.V0 != -9223372036854775807L;
    }

    @Override // defpackage.p29
    public final void t(long j, boolean z) {
        if (this.J0) {
            return;
        }
        e();
        if (s()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.K0.c;
        int length = this.E0.length;
        for (int i = 0; i < length; i++) {
            this.E0[i].g(j, z, zArr[i]);
        }
    }

    public final void u() {
        long j;
        if (this.Z0 || this.H0 || !this.G0 || this.L0 == null) {
            return;
        }
        for (hxd hxdVar : this.E0) {
            if (hxdVar.t() == null) {
                return;
            }
        }
        this.y0.d();
        int length = this.E0.length;
        lfg[] lfgVarArr = new lfg[length];
        boolean[] zArr = new boolean[length];
        int i = 0;
        while (true) {
            j = this.v0;
            if (i >= length) {
                break;
            }
            hf6 hf6VarT = this.E0[i].t();
            hf6VarT.getClass();
            String str = hf6VarT.n;
            boolean zI = xz9.i(str);
            boolean z = zI || xz9.m(str);
            zArr[i] = z;
            this.I0 = z | this.I0;
            this.J0 = j != -9223372036854775807L && length == 1 && xz9.k(str);
            ec7 ec7Var = this.D0;
            if (ec7Var != null) {
                int i2 = ec7Var.a;
                if (zI || this.F0[i].b) {
                    ty9 ty9Var = hf6VarT.l;
                    ty9 ty9Var2 = ty9Var == null ? new ty9(ec7Var) : ty9Var.a(ec7Var);
                    ff6 ff6VarA = hf6VarT.a();
                    ff6VarA.k = ty9Var2;
                    hf6VarT = new hf6(ff6VarA);
                }
                if (zI && hf6VarT.h == -1 && hf6VarT.i == -1 && i2 != -1) {
                    ff6 ff6VarA2 = hf6VarT.a();
                    ff6VarA2.h = i2;
                    hf6VarT = new hf6(ff6VarA2);
                }
            }
            int iD = this.c.d(hf6VarT);
            ff6 ff6VarA3 = hf6VarT.a();
            ff6VarA3.N = iD;
            hf6 hf6Var = new hf6(ff6VarA3);
            lfgVarArr[i] = new lfg(Integer.toString(i), hf6Var);
            this.R0 = hf6Var.t | this.R0;
            i++;
        }
        nfg nfgVar = new nfg(lfgVarArr);
        ywf ywfVar = new ywf();
        ywfVar.a = nfgVar;
        ywfVar.b = zArr;
        int i3 = nfgVar.a;
        ywfVar.c = new boolean[i3];
        ywfVar.d = new boolean[i3];
        this.K0 = ywfVar;
        if (this.J0 && this.M0 == -9223372036854775807L) {
            this.M0 = j;
            this.L0 = new ync(this, this.L0);
        }
        this.Y.v(this.M0, this.L0, this.N0);
        this.H0 = true;
        n29 n29Var = this.C0;
        n29Var.getClass();
        n29Var.i(this);
    }

    public final void v(int i) {
        e();
        ywf ywfVar = this.K0;
        boolean[] zArr = (boolean[]) ywfVar.d;
        if (zArr[i]) {
            return;
        }
        hf6 hf6Var = ((nfg) ywfVar.a).a(i).d[0];
        this.o.y(xz9.h(hf6Var.n), hf6Var, 0, null, this.U0);
        zArr[i] = true;
    }

    @Override // defpackage.kp5
    public final void w() {
        this.G0 = true;
        this.B0.post(this.z0);
    }

    @Override // defpackage.bc8
    public final void x(ec8 ec8Var, long j, long j2) {
        aoc aocVar = (aoc) ec8Var;
        if (this.M0 == -9223372036854775807L && this.L0 != null) {
            long jI = i(true);
            long j3 = jI == Long.MIN_VALUE ? 0L : jI + WorkRequest.MIN_BACKOFF_MILLIS;
            this.M0 = j3;
            this.Y.v(j3, this.L0, this.N0);
        }
        zdf zdfVar = aocVar.b;
        ze4 ze4Var = aocVar.t0;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        this.d.getClass();
        this.o.N(ub8Var, 1, -1, null, 0, null, aocVar.s0, this.M0);
        this.Y0 = true;
        n29 n29Var = this.C0;
        n29Var.getClass();
        n29Var.s(this);
    }

    public final void y(int i) {
        e();
        if (this.W0) {
            if ((!this.I0 || ((boolean[]) this.K0.b)[i]) && !this.E0[i].u(false)) {
                this.V0 = 0L;
                this.W0 = false;
                this.Q0 = true;
                this.U0 = 0L;
                this.X0 = 0;
                for (hxd hxdVar : this.E0) {
                    hxdVar.A(false);
                }
                n29 n29Var = this.C0;
                n29Var.getClass();
                n29Var.s(this);
            }
        }
    }

    public final sfg z(eoc eocVar) {
        int length = this.E0.length;
        for (int i = 0; i < length; i++) {
            if (eocVar.equals(this.F0[i])) {
                return this.E0[i];
            }
        }
        if (this.G0) {
            a8i.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + eocVar.a + ") after finishing tracks.");
            return new jx4();
        }
        k55 k55Var = this.c;
        k55Var.getClass();
        hxd hxdVar = new hxd(this.Z, k55Var, this.X);
        hxdVar.f = this;
        int i2 = length + 1;
        eoc[] eocVarArr = (eoc[]) Arrays.copyOf(this.F0, i2);
        eocVarArr[length] = eocVar;
        String str = zxg.a;
        this.F0 = eocVarArr;
        hxd[] hxdVarArr = (hxd[]) Arrays.copyOf(this.E0, i2);
        hxdVarArr[length] = hxdVar;
        this.E0 = hxdVarArr;
        return hxdVar;
    }
}
