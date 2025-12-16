package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wa1 extends dtf implements sm6 {
    public final /* synthetic */ za1 X;
    public /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa1(za1 za1Var, Continuation continuation) {
        super(2, continuation);
        this.X = za1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        wa1 wa1Var = (wa1) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wa1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wa1 wa1Var = new wa1(this.X, continuation);
        wa1Var.o = ((Boolean) obj).booleanValue();
        return wa1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        List list;
        Object value;
        boolean z;
        g8j.b(obj);
        if (this.o) {
            list = hd5.a;
        } else {
            zg5 zg5Var = bb1.o;
            ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
            f2 f2Var = new f2(0, zg5Var);
            while (f2Var.hasNext()) {
                bb1 bb1Var = (bb1) f2Var.next();
                arrayList.add(new cb1(bb1Var.ordinal(), bb1Var.a, bb1Var));
            }
            list = arrayList;
        }
        tcf tcfVar = this.X.Y;
        do {
            value = tcfVar.getValue();
            ww1 ww1Var = (ww1) value;
            z = ww1Var.b;
            ww1Var.getClass();
        } while (!tcfVar.c(value, new ww1(list, z)));
        return qqg.a;
    }
}
