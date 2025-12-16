package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xb extends dtf implements sm6 {
    public final /* synthetic */ ac X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(ac acVar, String str, Continuation continuation) {
        super(2, continuation);
        this.X = acVar;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xb(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        String strA;
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
        qb qbVar = this.X.c;
        this.o = 1;
        tcf tcfVar = qbVar.i;
        k18 k18Var = qbVar.f;
        List list = (List) tcfVar.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            ku3 ku3Var = (ku3) obj2;
            String strValueOf = String.valueOf(ku3Var.q());
            String str = this.Y;
            if (dnf.r(strValueOf, str, false) || ((o7e) k18Var.getValue()).i(String.valueOf(ku3Var.e()), str) || ((strA = m6g.a(ku3Var.i())) != null && ((o7e) k18Var.getValue()).i(strA, str))) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(qbVar.b((ku3) it.next()));
        }
        ((v04) qbVar.b.getValue()).c(arrayList2, new n8(6));
        Object objA = qbVar.l.a(arrayList2, this);
        g84 g84Var = g84.a;
        if (objA != g84Var) {
            objA = qqgVar;
        }
        return objA == g84Var ? g84Var : qqgVar;
    }
}
