package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qd8 extends dtf implements sm6 {
    public final /* synthetic */ sd8 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd8(sd8 sd8Var, Continuation continuation) {
        super(2, continuation);
        this.X = sd8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qd8 qd8Var = (qd8) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qd8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qd8 qd8Var = new qd8(this.X, continuation);
        qd8Var.o = obj;
        return qd8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        sd8 sd8Var = this.X;
        tw0 tw0Var = sd8Var.a;
        wqi.c("sd8", "albums loaded", new Object[0]);
        int i = to8.i(we3.q(list, 10));
        if (i < 16) {
            i = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        for (Object obj2 : list) {
            linkedHashMap.put(((vo6) obj2).a.b(), obj2);
        }
        sd8Var.g = linkedHashMap;
        tw0Var.c(new uu(5));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tw0Var.c(new td8(((vo6) it.next()).a.b()));
        }
        x9f x9fVar = ((bj7) sd8Var.c).x0;
        if (x9fVar != null && x9fVar.isCompleted()) {
            nhg nhgVar = new nhg(lee.j(new nhg(new at(2, list), new wu7(6, sd8Var)), zx0.C0), new wm7(9));
            xs xsVar = new xs(0);
            lee.n(nhgVar, xsVar);
            dce dceVar = sd8Var.f;
            dceVar.getClass();
            wqi.c("dce", "refreshSelectedMedias()", new Object[0]);
            CopyOnWriteArraySet copyOnWriteArraySet = dceVar.a;
            List listD = jqi.d(copyOnWriteArraySet, new u4e(4, xsVar));
            wqi.c("dce", "refreshSelectedMedias(), itemsForRemoveCount = " + listD.size(), new Object[0]);
            copyOnWriteArraySet.removeAll(listD);
            if (!listD.isEmpty()) {
                dceVar.n();
            }
        }
        return qqg.a;
    }
}
