package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mk2 extends dtf implements sm6 {
    public final /* synthetic */ yk2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk2(yk2 yk2Var, Continuation continuation) {
        super(2, continuation);
        this.X = yk2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mk2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mk2(this.X, continuation);
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
        yk2 yk2Var = this.X;
        jk2 jk2Var = (jk2) yk2Var.z0.getAndUpdate(new lk2(0));
        if (jk2Var != null) {
            o05 o05Var = jk2Var.d;
            o05Var.getClass();
            if ((o05Var == o05.a || o05Var == o05.b) && !jk2Var.e) {
                ctf ctfVar = (ctf) yk2Var.X.getValue();
                File fileR = ((iz5) ((qx5) yk2Var.Z.getValue())).r(jk2Var.b);
                String str = jk2Var.c;
                this.o = 1;
                ctfVar.a.k(fileR, str, this);
                g84 g84Var = g84.a;
                if (qqgVar == g84Var) {
                    return g84Var;
                }
            }
        }
        return qqgVar;
    }
}
