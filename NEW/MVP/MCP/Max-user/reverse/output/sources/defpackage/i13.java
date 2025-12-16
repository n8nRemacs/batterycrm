package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i13 extends dtf implements em6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i13(Object obj, Continuation continuation, int i) {
        super(1, continuation);
        this.o = i;
        this.X = obj;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.o) {
            case 0:
                i13 i13Var = new i13((z13) this.X, continuation, 0);
                qqg qqgVar = qqg.a;
                i13Var.n(qqgVar);
                return qqgVar;
            case 1:
                i13 i13Var2 = new i13((yw9) this.X, continuation, 1);
                qqg qqgVar2 = qqg.a;
                i13Var2.n(qqgVar2);
                return qqgVar2;
            default:
                i13 i13Var3 = new i13((quf) this.X, continuation, 2);
                qqg qqgVar3 = qqg.a;
                i13Var3.n(qqgVar3);
                return qqgVar3;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                z13 z13Var = (z13) this.X;
                ArrayList arrayListE = z13Var.a.e();
                boolean z = ue3.Q(arrayListE) instanceof i37;
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof hs2) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayListT = ue3.T(z13Var.u0, ue3.X(arrayList, new s55(17)));
                v03 v03Var = new v03(arrayListT, z);
                String str = z13Var.x0;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, ho7.f(arrayListT.size(), "emitHistory "), null);
                    }
                }
                z13Var.v0.m(null, v03Var);
                z13Var.s0.set(arrayListE.isEmpty() && !z);
                break;
            case 1:
                g8j.b(obj);
                ((yw9) this.X).n.a();
                break;
            default:
                g8j.b(obj);
                ((quf) this.X).g.clear();
                wqi.c(quf.h, "clear: jobs cleared", new Object[0]);
                break;
        }
        return qqg.a;
    }
}
