package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ge1 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ int Z;
    public int o;
    public final /* synthetic */ he1 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge1(List list, int i, he1 he1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = i;
        this.s0 = he1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ge1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ge1 ge1Var = new ge1(this.Y, this.Z, this.s0, continuation);
        ge1Var.X = obj;
        return ge1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        Object objP;
        he1 he1Var = this.s0;
        tcf tcfVar = he1Var.w0;
        int i = this.o;
        int i2 = this.Z;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            List list = this.Y;
            if (list.isEmpty() || i2 == 0) {
                do {
                    value = tcfVar.getValue();
                } while (!tcfVar.c(value, ae1.a((ae1) value, null, null, null, false, null, null, he1.t(he1Var, hd5.a, i2), 63)));
                return qqg.a;
            }
            ArrayList arrayList = new ArrayList(we3.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((l24) he1Var.s0.getValue()).c(((Number) it.next()).longValue()));
            }
            fe1 fe1Var = new fe1((x26[]) ue3.d0(arrayList).toArray(new x26[0]), f84Var, list, he1Var, 0);
            int i3 = s65.d;
            m36 m36VarC = zs0.c(fe1Var, s65.g(v9j.h(5, y65.SECONDS)), new ce1(2, null));
            this.o = 1;
            objP = gw0.p(m36VarC, this);
            g84 g84Var = g84.a;
            if (objP == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            objP = obj;
        }
        Object obj2 = ((kpd) objP).a;
        if (obj2 instanceof ipd) {
            obj2 = null;
        }
        ku3[] ku3VarArr = (ku3[]) obj2;
        ArrayList arrayListT = ku3VarArr != null ? ys.t(ku3VarArr) : null;
        if (arrayListT != null) {
            List<ku3> listY = ue3.Y(arrayListT, i2 <= 3 ? i2 : 2);
            ArrayList arrayList2 = new ArrayList();
            for (ku3 ku3Var : listY) {
                arrayList2.add(new imb(fui.a(ku3Var.o(), new Long(ku3Var.p())), ku3Var.r(il0.a)));
            }
            if (i2 > 3) {
                arrayList2.add(he1.C0);
            }
            while (true) {
                Object value2 = tcfVar.getValue();
                ArrayList arrayList3 = arrayList2;
                if (tcfVar.c(value2, ae1.a((ae1) value2, null, null, null, false, null, arrayList3, he1.t(he1Var, arrayListT, i2), 31))) {
                    break;
                }
                arrayList2 = arrayList3;
            }
        }
        return qqg.a;
    }
}
