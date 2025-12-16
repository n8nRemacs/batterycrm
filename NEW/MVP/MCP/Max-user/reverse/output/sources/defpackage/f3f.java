package defpackage;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f3f implements p29, bc8 {
    public final nfg X;
    public final ArrayList Y = new ArrayList();
    public final long Z;
    public final ze4 a;
    public final oe4 b;
    public final wgg c;
    public final tha d;
    public final lk6 o;
    public final te8 s0;
    public final hf6 t0;
    public final boolean u0;
    public boolean v0;
    public byte[] w0;
    public int x0;

    public f3f(ze4 ze4Var, oe4 oe4Var, wgg wggVar, hf6 hf6Var, long j, tha thaVar, lk6 lk6Var, boolean z, hkd hkdVar) {
        this.a = ze4Var;
        this.b = oe4Var;
        this.c = wggVar;
        this.t0 = hf6Var;
        this.Z = j;
        this.d = thaVar;
        this.o = lk6Var;
        this.u0 = z;
        this.X = new nfg(new lfg("", hf6Var));
        this.s0 = hkdVar != null ? new te8(hkdVar) : new te8("SingleSampleMediaPeriod");
    }

    @Override // defpackage.bc8
    public final void G(ec8 ec8Var, long j, long j2, int i) {
        ub8 ub8Var;
        e3f e3fVar = (e3f) ec8Var;
        zdf zdfVar = e3fVar.b;
        if (i == 0) {
            ub8Var = new ub8(e3fVar.a);
        } else {
            ze4 ze4Var = e3fVar.a;
            Uri uri = zdfVar.c;
            ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        }
        this.o.R(ub8Var, 1, -1, this.t0, 0, null, 0L, this.Z, i);
    }

    @Override // defpackage.bc8
    public final y21 K(ec8 ec8Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        y21 y21Var;
        e3f e3fVar = (e3f) ec8Var;
        zdf zdfVar = e3fVar.b;
        ze4 ze4Var = e3fVar.a;
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
        boolean z = jMin == -9223372036854775807L || i >= 3;
        if (this.u0 && z) {
            a8i.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.v0 = true;
            y21Var = te8.o;
        } else {
            y21Var = jMin != -9223372036854775807L ? new y21(jMin, 0, 5, false) : te8.X;
        }
        y21 y21Var2 = y21Var;
        this.o.O(ub8Var, 1, -1, this.t0, 0, null, 0L, this.Z, iOException, !y21Var2.a());
        return y21Var2;
    }

    @Override // defpackage.p29
    public final long c(long j, k9e k9eVar) {
        return j;
    }

    @Override // defpackage.jee
    public final long d() {
        return (this.v0 || this.s0.A()) ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.p29
    public final void f() {
    }

    @Override // defpackage.p29
    public final long h(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Y;
            if (i >= arrayList.size()) {
                return j;
            }
            d3f d3fVar = (d3f) arrayList.get(i);
            if (d3fVar.a == 2) {
                d3fVar.a = 1;
            }
            i++;
        }
    }

    @Override // defpackage.jee
    public final boolean j() {
        return this.s0.A();
    }

    @Override // defpackage.p29
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // defpackage.p29
    public final nfg l() {
        return this.X;
    }

    @Override // defpackage.p29
    public final long m(bn5[] bn5VarArr, boolean[] zArr, jxd[] jxdVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < bn5VarArr.length; i++) {
            jxd jxdVar = jxdVarArr[i];
            ArrayList arrayList = this.Y;
            if (jxdVar != null && (bn5VarArr[i] == null || !zArr[i])) {
                arrayList.remove(jxdVar);
                jxdVarArr[i] = null;
            }
            if (jxdVarArr[i] == null && bn5VarArr[i] != null) {
                d3f d3fVar = new d3f(this);
                arrayList.add(d3fVar);
                jxdVarArr[i] = d3fVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.p29
    public final void n(n29 n29Var, long j) {
        n29Var.i(this);
    }

    @Override // defpackage.jee
    public final long o() {
        return this.v0 ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.jee
    public final void p(long j) {
    }

    @Override // defpackage.bc8
    public final void q(ec8 ec8Var, long j, long j2, boolean z) {
        e3f e3fVar = (e3f) ec8Var;
        zdf zdfVar = e3fVar.b;
        ze4 ze4Var = e3fVar.a;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        this.d.getClass();
        this.o.M(ub8Var, 1, -1, null, 0, null, 0L, this.Z);
    }

    @Override // defpackage.jee
    public final boolean r(oc8 oc8Var) {
        if (this.v0) {
            return false;
        }
        te8 te8Var = this.s0;
        if (te8Var.A() || te8Var.x()) {
            return false;
        }
        se4 se4VarA = this.b.a();
        wgg wggVar = this.c;
        if (wggVar != null) {
            se4VarA.I(wggVar);
        }
        e3f e3fVar = new e3f(se4VarA, this.a);
        this.d.getClass();
        te8Var.F(e3fVar, this, 3);
        return true;
    }

    @Override // defpackage.p29
    public final void t(long j, boolean z) {
    }

    @Override // defpackage.bc8
    public final void x(ec8 ec8Var, long j, long j2) {
        e3f e3fVar = (e3f) ec8Var;
        this.x0 = (int) e3fVar.b.b;
        byte[] bArr = e3fVar.c;
        bArr.getClass();
        this.w0 = bArr;
        this.v0 = true;
        zdf zdfVar = e3fVar.b;
        ze4 ze4Var = e3fVar.a;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, this.x0);
        this.d.getClass();
        this.o.N(ub8Var, 1, -1, this.t0, 0, null, 0L, this.Z);
    }
}
