package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class vr2 extends xfh {
    public final k18 X;
    public final Object Y;
    public final k5i Z;
    public final long b;
    public final boolean c;
    public final k18 d;
    public final k18 o;
    public x9f s0;
    public final ArrayList t0;
    public final AtomicBoolean u0;
    public final int v0;
    public final ci5 w0;
    public final x26 x0;

    public vr2(long j, int i) {
        int i2 = 2;
        boolean z = (i & 2) == 0;
        fdc fdcVar = fdc.a;
        k18 k18VarB = fdcVar.b();
        k18 k18VarD = fdcVar.d();
        k18 k18VarE = fdcVar.e();
        k18 k18VarB2 = ipi.b(3, new zb2(22));
        this.b = j;
        this.c = z;
        this.d = k18VarB;
        this.o = k18VarD;
        this.X = k18VarE;
        this.Y = k18VarB2;
        this.Z = new k5i(3);
        this.t0 = new ArrayList();
        this.u0 = new AtomicBoolean(false);
        pb2 pb2VarT = t();
        if (pb2VarT != null && pb2VarT.M()) {
            i2 = 1;
        }
        this.v0 = i2;
        this.w0 = new ci5(0);
        this.x0 = gw0.m(new x3(gw0.u(new d53(((w63) ((bwf) k18VarB).getValue()).j(j), 12), ((q2b) ((lzf) ((bwf) k18VarE).getValue())).b()), this, 18));
    }

    public static boolean w(pb2 pb2Var) {
        if (!pb2Var.O()) {
            boolean zC = l8g.c(pb2Var.b.I);
            boolean z = pb2Var.v() || pb2Var.C();
            if (pb2Var.i0() || (!zC && z)) {
                return true;
            }
        }
        return false;
    }

    public final pb2 t() {
        return (pb2) ((w63) this.d.getValue()).j(this.b).a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, k18] */
    public final o98 u() {
        pb2 pb2VarT = t();
        k5i k5iVar = this.Z;
        k5iVar.getClass();
        o98 o98VarD = ve3.d();
        if (pb2VarT != null && pb2VarT.G() && (pb2VarT.i0() || (pb2VarT.g0() && ppi.d(pb2VarT.g(pb2VarT.X), 2)))) {
            if (!this.c) {
                o98VarD.add((b44) k5iVar.b.getValue());
            }
            if (pb2VarT.M()) {
                o98VarD.add((b44) k5iVar.d.getValue());
            } else {
                o98VarD.add((b44) k5iVar.c.getValue());
            }
        }
        return ve3.a(o98VarD);
    }

    public final x26 v() {
        return gw0.m(gw0.u(new x3(new d53(((w63) this.d.getValue()).j(this.b), 12), this, 17), ((q2b) ((lzf) this.X.getValue())).b()));
    }

    public final void x(List list, boolean z) {
        j5g j5gVar;
        this.u0.set(z);
        ArrayList arrayList = this.t0;
        arrayList.clear();
        arrayList.addAll(list);
        int iV = az1.v(this.v0);
        if (iV == 0) {
            j5gVar = new j5g(w8b.b, list.size());
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            j5gVar = new j5g(w8b.c, list.size());
        }
        xfh.r(this.w0, new pjc(j5gVar));
    }

    public final void y() {
        j5g j5gVar;
        this.u0.set(false);
        ArrayList arrayList = this.t0;
        arrayList.clear();
        int iV = az1.v(this.v0);
        if (iV == 0) {
            j5gVar = new j5g(w8b.d, arrayList.size());
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            j5gVar = new j5g(w8b.e, arrayList.size());
        }
        xfh.r(this.w0, new qjc(j5gVar));
    }

    public final void z() {
        ArrayList arrayList = this.t0;
        List listD0 = ue3.d0(arrayList);
        arrayList.clear();
        x9f x9fVar = this.s0;
        if ((x9fVar == null || !x9fVar.isActive()) && !listD0.isEmpty()) {
            this.s0 = xfh.o(this, ((q2b) ((lzf) this.X.getValue())).b().plus(bia.a), new ur2(this, listD0, null), 2);
        }
    }
}
