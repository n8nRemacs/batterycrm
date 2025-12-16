package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d43 extends dtf implements sm6 {
    public final /* synthetic */ k53 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d43(k53 k53Var, Continuation continuation) {
        super(2, continuation);
        this.o = k53Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        d43 d43Var = (d43) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        d43Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d43(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = k53.d1;
        k53 k53Var = this.o;
        f86 f86Var = (f86) ((va4) k53Var.B0.getValue()).h(k53Var.c).getValue();
        Set set = f86Var != null ? f86Var.d : null;
        k53Var.R0.m(null, Boolean.valueOf(!(set == null || set.isEmpty())));
        return qqg.a;
    }
}
