package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class g49 extends dtf implements sm6 {
    public final /* synthetic */ h49 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g49(h49 h49Var, Continuation continuation) {
        super(2, continuation);
        this.X = h49Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        g49 g49Var = (g49) l((hr9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        g49Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        g49 g49Var = new g49(this.X, continuation);
        g49Var.o = obj;
        return g49Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        hr9 hr9Var = (hr9) this.o;
        by0 by0Var = this.X.n;
        boolean z = by0Var != null ? by0Var.a : false;
        String str = this.X.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, wmf.e("Media playlist. Get result from loader \n                        |size:" + hr9Var.a.size() + ", \n                        |hasNext: " + hr9Var.b + ", \n                        |hasPrev:" + hr9Var.c + ", \n                        |descOrder:" + z), null);
            }
        }
        if (!hr9Var.a.isEmpty()) {
            this.X.q = z ? hr9Var.c : hr9Var.b;
            List listV = z ? ue3.V(hr9Var.a) : hr9Var.a;
            x39 x39Var = (x39) this.X.o.getValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            h49 h49Var = this.X;
            h49Var.getClass();
            int size = listV.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                MessageModel messageModel = (MessageModel) listV.get(i);
                by0 by0Var2 = h49Var.n;
                if (by0Var2 != null && messageModel.a == by0Var2.b) {
                    z2 = true;
                }
                if (z2) {
                    linkedHashSet.add(Long.valueOf(messageModel.a));
                }
            }
            tcf tcfVar = this.X.o;
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, x39.a(x39Var, 0L, linkedHashSet, null, 5)));
        }
        return qqgVar;
    }
}
