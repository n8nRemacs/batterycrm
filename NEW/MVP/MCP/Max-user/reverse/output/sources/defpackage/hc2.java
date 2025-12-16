package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hc2 extends xfh {
    public final Object X;
    public final k18 Y;
    public final k5i Z;
    public final long b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public x9f s0;
    public final ArrayList t0;
    public final ci5 u0;

    public hc2(long j) {
        fdc fdcVar = fdc.a;
        k18 k18VarB = fdcVar.b();
        k18 k18VarD = fdcVar.d();
        k18 k18VarE = fdcVar.e();
        k18 k18VarB2 = ipi.b(3, new zb2(0));
        fdcVar.f();
        k18 k18VarC = fdcVar.c();
        this.b = j;
        this.c = k18VarB;
        this.d = k18VarD;
        this.o = k18VarE;
        this.X = k18VarB2;
        this.Y = k18VarC;
        this.Z = new k5i(3);
        this.t0 = new ArrayList();
        this.u0 = new ci5(0);
    }

    public final pb2 t() {
        return (pb2) ((w63) this.c.getValue()).j(this.b).a.getValue();
    }

    public final void u() {
        ArrayList arrayList = this.t0;
        List listD0 = ue3.d0(arrayList);
        arrayList.clear();
        x9f x9fVar = this.s0;
        if ((x9fVar == null || !x9fVar.isActive()) && !listD0.isEmpty()) {
            this.s0 = xfh.o(this, ((q2b) ((lzf) this.o.getValue())).b().plus(bia.a), new gc2(this, listD0, null), 2);
        }
    }
}
