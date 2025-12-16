package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ia4 extends dtf implements sm6 {
    public final /* synthetic */ va4 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia4(va4 va4Var, Continuation continuation) {
        super(2, continuation);
        this.X = va4Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ia4 ia4Var = (ia4) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ia4Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ia4 ia4Var = new ia4(this.X, continuation);
        ia4Var.o = obj;
        return ia4Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List<f86> list = (List) this.o;
        boolean zA = wqi.a();
        String str = this.X.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                ArrayList arrayList = new ArrayList(we3.q(list, 10));
                for (f86 f86Var : list) {
                    arrayList.add(new imb(f86Var.a, zA ? f86Var.b : "*****"));
                }
                l6bVar.c(lg8Var, str, "Refreshing folderListFlow, order=" + arrayList, null);
            }
        }
        this.X.a.b.h(list);
        return qqg.a;
    }
}
