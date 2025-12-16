package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l33 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ b43 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l33(List list, b43 b43Var, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = b43Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((l33) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        l33 l33Var = new l33(this.Y, this.Z, continuation);
        l33Var.X = obj;
        return l33Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        f84 f84Var = (f84) this.X;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.Y.iterator();
        while (it.hasNext()) {
            jqc jqcVar = ((u6e) it.next()).Z;
            qb2 qb2Var = jqcVar != null ? jqcVar.a : null;
            if (qb2Var != null) {
                arrayList.add(qb2Var);
            }
        }
        d7j.e(f84Var);
        yy7[] yy7VarArr = b43.W0;
        w63 w63VarV = this.Z.v();
        this.o = 1;
        ve2 ve2VarI = w63VarV.i();
        ve2VarI.getClass();
        Object objC = si2.c(ve2VarI, arrayList, this);
        g84 g84Var = g84.a;
        if (objC != g84Var) {
            objC = qqgVar;
        }
        return objC == g84Var ? g84Var : qqgVar;
    }
}
