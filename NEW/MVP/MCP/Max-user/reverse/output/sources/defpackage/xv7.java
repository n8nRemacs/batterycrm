package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xv7 extends dtf implements sm6 {
    public final /* synthetic */ ra3 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv7(ra3 ra3Var, Continuation continuation) {
        super(2, continuation);
        this.X = ra3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xv7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xv7(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object next;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Iterator it = ((List) this.X.d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((cw7) next).c().contains("WebAppBackButtonPressed")) {
                    break;
                }
            }
            cw7 cw7Var = (cw7) next;
            if (cw7Var != null) {
                this.o = 1;
                Object objA = cw7Var.a("WebAppBackButtonPressed", "{}", this);
                g84 g84Var = g84.a;
                if (objA == g84Var) {
                    return g84Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
