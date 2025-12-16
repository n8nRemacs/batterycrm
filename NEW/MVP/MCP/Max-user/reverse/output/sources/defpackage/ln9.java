package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ln9 extends dtf implements sm6 {
    public final /* synthetic */ no9 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln9(no9 no9Var, Continuation continuation) {
        super(2, continuation);
        this.X = no9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ln9 ln9Var = (ln9) l((n8a) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ln9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ln9 ln9Var = new ln9(this.X, continuation);
        ln9Var.o = obj;
        return ln9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        nn9 nn9Var;
        g8j.b(obj);
        n8a n8aVar = (n8a) this.o;
        tcf tcfVar = this.X.P0;
        do {
            value = tcfVar.getValue();
            nn9 nn9Var2 = (nn9) value;
            if (nn9Var2 != null) {
                Set set = nn9Var2.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (!n8aVar.d(((Number) obj2).longValue())) {
                        arrayList.add(obj2);
                    }
                }
                nn9Var = new nn9(new xs(arrayList), nn9Var2.b, nn9Var2.c);
            } else {
                nn9Var = null;
            }
        } while (!tcfVar.c(value, nn9Var));
        return qqg.a;
    }
}
