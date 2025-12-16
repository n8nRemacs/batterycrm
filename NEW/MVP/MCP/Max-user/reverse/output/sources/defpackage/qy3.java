package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qy3 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ zy3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy3(zy3 zy3Var, long j, Continuation continuation) {
        super(2, continuation);
        this.o = zy3Var;
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qy3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qy3(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objA;
        b44 b44Var;
        b44 b44Var2;
        b44 b44Var3;
        g8j.b(obj);
        nu3 nu3Var = (nu3) this.o.d.getValue();
        qv3 qv3Var = (qv3) nu3Var.a.getValue();
        long j = this.X;
        ku3 ku3VarI = qv3Var.i(j, false);
        if (ku3VarI == null) {
            objA = hd5.a;
        } else {
            pb2 pb2VarN = ((w63) nu3Var.b.getValue()).n(j);
            o98 o98VarD = ve3.d();
            boolean zA = ku3VarI.A();
            boolean zV = ku3VarI.v();
            if (!zA && !zV) {
                o98VarD.add(lu3.Z);
                o98VarD.add(lu3.s0);
            }
            o98VarD.add(lu3.a);
            if (zA) {
                o98VarD.add(lu3.b);
            } else {
                o98VarD.add(lu3.c);
            }
            o98VarD.add(lu3.d);
            if (zV && pb2VarN != null && !pb2VarN.l0()) {
                o98VarD.add(lu3.t0);
            } else if (!zV && ku3VarI.u()) {
                o98VarD.add(lu3.X);
            } else if (!zV && !ku3VarI.u()) {
                o98VarD.add(lu3.o);
            }
            o98VarD.add(lu3.Y);
            objA = ve3.a(o98VarD);
        }
        oz5 oz5VarH = lee.h(lee.h(new at(2, objA), new d73(7)), new d73(8));
        vi5 vi5Var = zy3.K0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        lee.n(oz5VarH, arrayList2);
        ze3.s(vi5Var, arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            switch (((lu3) it.next()).ordinal()) {
                case 0:
                    b44Var = new b44(u1b.d, new n5g(avd.Z), Integer.valueOf(yud.B1), Integer.valueOf(w9b.R), 4);
                    b44Var3 = b44Var;
                    arrayList.add(b44Var3);
                case 1:
                    b44Var2 = new b44(u1b.f, new n5g(avd.b0), Integer.valueOf(yud.R1), Integer.valueOf(w9b.R), 4);
                    b44Var3 = b44Var2;
                    arrayList.add(b44Var3);
                case 2:
                    b44Var3 = new b44(u1b.j, new n5g(avd.f0), Integer.valueOf(yud.k1), Integer.valueOf(w9b.R), 4);
                    arrayList.add(b44Var3);
                case 3:
                    b44Var3 = new b44(u1b.e, new n5g(avd.a0), Integer.valueOf(yud.c), Integer.valueOf(w9b.R), 4);
                    arrayList.add(b44Var3);
                case 4:
                    b44Var3 = new b44(u1b.b, new n5g(avd.X), Integer.valueOf(w9b.V), Integer.valueOf(yud.T), Integer.valueOf(w9b.Q));
                    arrayList.add(b44Var3);
                case 5:
                    b44Var3 = new b44(u1b.h, new n5g(avd.d0), Integer.valueOf(yud.c1), Integer.valueOf(w9b.R), 4);
                    arrayList.add(b44Var3);
                case 6:
                    b44Var3 = new b44(u1b.c, new n5g(avd.Y), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q));
                    arrayList.add(b44Var3);
                case 7:
                    b44Var = new b44(u1b.a, new n5g(avd.W), Integer.valueOf(yud.x1), Integer.valueOf(w9b.R), 4);
                    b44Var3 = b44Var;
                    arrayList.add(b44Var3);
                case 8:
                    b44Var2 = new b44(u1b.i, new n5g(avd.e0), Integer.valueOf(yud.h2), Integer.valueOf(w9b.R), 4);
                    b44Var3 = b44Var2;
                    arrayList.add(b44Var3);
                case 9:
                    b44Var3 = new b44(u1b.g, new n5g(avd.c0), Integer.valueOf(w9b.V), Integer.valueOf(yud.m1), Integer.valueOf(w9b.Q));
                    arrayList.add(b44Var3);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return arrayList;
    }
}
