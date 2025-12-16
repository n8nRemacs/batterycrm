package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j33 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ b43 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j33(b43 b43Var, Continuation continuation) {
        super(2, continuation);
        this.Y = b43Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((j33) l((tc7) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        j33 j33Var = new j33(this.Y, continuation);
        j33Var.X = obj;
        return j33Var;
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
        tc7 tc7Var = (tc7) this.X;
        tcf tcfVar = this.Y.H0;
        y23 y23Var = new y23(x23.c, "", tc7Var, hd5.a, false, false);
        this.o = 1;
        tcfVar.m(null, y23Var);
        g84 g84Var = g84.a;
        return qqgVar == g84Var ? g84Var : qqgVar;
    }
}
