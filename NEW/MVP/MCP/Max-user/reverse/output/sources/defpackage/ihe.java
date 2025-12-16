package defpackage;

import java.util.List;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class ihe extends ghe {
    public final Queue t0;
    public ghe u0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ihe(lge lgeVar) {
        long j = lgeVar.a;
        Queue queue = (Queue) lgeVar.h;
        sk9 sk9Var = ((ghe) queue.peek()).d;
        ((ghe) queue.peek()).getClass();
        long j2 = lgeVar.c;
        boolean z = lgeVar.d;
        ((ghe) queue.peek()).getClass();
        String str = lgeVar.e;
        ((ghe) queue.peek()).getClass();
        ((ghe) queue.peek()).getClass();
        ((ghe) queue.peek()).getClass();
        super(j, sk9Var, j2, z, str, lgeVar.f);
        this.t0 = queue;
        this.u0 = (ghe) queue.poll();
    }

    @Override // defpackage.ghe, defpackage.hge
    public final void u() {
        super.u();
        Queue queue = this.t0;
        if (queue.isEmpty()) {
            return;
        }
        lge lgeVar = new lge(this.c, queue, 2);
        lgeVar.c = this.Z;
        lgeVar.d = this.X;
        lgeVar.e = this.Y;
        lgeVar.f = this.s0;
        s().b(new ihe(lgeVar));
    }

    @Override // defpackage.ghe
    public final ri9 v() {
        ghe gheVar = this.u0;
        gheVar.a = this.a;
        ri9 ri9VarV = gheVar.v();
        ri9VarV.F = this.u0.s0;
        return ri9VarV;
    }

    @Override // defpackage.ghe
    public final long w(pb2 pb2Var, long j) {
        long j2 = pb2Var.a;
        ghe gheVar = this.u0;
        gheVar.a = this.a;
        boolean z = gheVar instanceof nhe;
        ss4 ss4Var = this.s0;
        if (z) {
            nhe nheVar = (nhe) gheVar;
            mhe mheVar = new mhe(j2, (d3) nheVar.v0.get(0));
            mheVar.k = nheVar.x0;
            String str = nheVar.t0;
            List list = nheVar.u0;
            mheVar.h = str;
            mheVar.i = list;
            mheVar.b = nheVar.d;
            mheVar.d = nheVar.X;
            mheVar.j = nheVar.w0;
            mheVar.e = nheVar.Y;
            mheVar.c = nheVar.o;
            mheVar.f = ss4Var;
            ehe eheVarB = mheVar.a();
            this.u0 = eheVarB;
            eheVarB.a = this.a;
            return eheVarB.w(pb2Var, j);
        }
        if (!(gheVar instanceof ehe)) {
            if (!(gheVar instanceof khe)) {
                return super.w(pb2Var, j);
            }
            khe kheVar = (khe) gheVar;
            jhe jheVar = new jhe(j2, kheVar.t0, kheVar.u0);
            jheVar.b = kheVar.d;
            jheVar.d = kheVar.X;
            jheVar.e = kheVar.Y;
            jheVar.c = kheVar.o;
            jheVar.i = kheVar.v0;
            jheVar.f = ss4Var;
            khe kheVar2 = new khe(jheVar);
            this.u0 = kheVar2;
            kheVar2.a = this.a;
            return kheVar2.w(pb2Var, j);
        }
        ehe eheVar = (ehe) gheVar;
        dhe dheVar = new dhe(j2, eheVar.v0);
        String str2 = eheVar.t0;
        List list2 = eheVar.u0;
        dheVar.h = str2;
        dheVar.i = list2;
        dheVar.b = eheVar.d;
        dheVar.d = eheVar.X;
        dheVar.j = eheVar.w0;
        dheVar.e = eheVar.Y;
        dheVar.c = eheVar.o;
        dheVar.f = ss4Var;
        ehe eheVar2 = new ehe(dheVar);
        this.u0 = eheVar2;
        eheVar2.a = this.a;
        return eheVar2.w(pb2Var, j);
    }
}
