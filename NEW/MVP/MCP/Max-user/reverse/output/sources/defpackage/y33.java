package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y33 extends dtf implements sm6 {
    public final /* synthetic */ b43 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y33(b43 b43Var, Continuation continuation) {
        super(2, continuation);
        this.X = b43Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        y33 y33Var = (y33) l((cjg) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        y33Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        y33 y33Var = new y33(this.X, continuation);
        y33Var.o = obj;
        return y33Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cjg cjgVar = (cjg) this.o;
        String str = (String) cjgVar.a;
        List list = (List) cjgVar.b;
        boolean zBooleanValue = ((Boolean) cjgVar.c).booleanValue();
        if (list != null) {
            this.X.f(str, list, zBooleanValue);
        }
        return qqg.a;
    }
}
