package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g53 extends dtf implements sm6 {
    public final /* synthetic */ k53 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g53(k53 k53Var, Continuation continuation) {
        super(2, continuation);
        this.X = k53Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        g53 g53Var = (g53) l((n8a) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        g53Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        g53 g53Var = new g53(this.X, continuation);
        g53Var.o = obj;
        return g53Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        n8a n8aVar = (n8a) this.o;
        k1a k1aVar = (k1a) this.X.C0.getValue();
        k1aVar.getClass();
        if (!n8aVar.i()) {
            List listA = k1aVar.a(n8aVar);
            if (!listA.isEmpty()) {
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "MissedContactsController", ho7.i("requestForChatListScreen: ids=[", ue3.N(listA, null, null, null, null, 63), "]"), null);
                    }
                }
                k1aVar.h().d(listA);
            }
        }
        return qqg.a;
    }
}
