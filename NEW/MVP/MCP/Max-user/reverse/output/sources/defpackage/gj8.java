package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gj8 extends dtf implements sm6 {
    public final /* synthetic */ sj8 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj8(sj8 sj8Var, Continuation continuation) {
        super(2, continuation);
        this.X = sj8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gj8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gj8(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
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
        sj8 sj8Var = this.X;
        z41 z41Var = new z41(new ArrayList(), new d53((x26) sj8Var.d.getValue(), 11), new cj8(3, null, 0));
        ej8 ej8Var = new ej8(sj8Var, 0);
        this.o = 1;
        Object objD = z41Var.d(new h28(ej8Var, 2), this);
        g84 g84Var = g84.a;
        if (objD != g84Var) {
            objD = qqgVar;
        }
        return objD == g84Var ? g84Var : qqgVar;
    }
}
