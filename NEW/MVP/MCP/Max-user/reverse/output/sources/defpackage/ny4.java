package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ny4 extends dtf implements sm6 {
    public final /* synthetic */ oy4 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny4(oy4 oy4Var, Continuation continuation) {
        super(2, continuation);
        this.X = oy4Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ny4) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ny4(this.X, continuation);
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
        oy4 oy4Var = this.X;
        e9a e9aVar = (e9a) oy4Var.d.getValue();
        int i2 = s65.d;
        u92 u92VarG = zs0.g(e9aVar, v9j.h(1, y65.SECONDS));
        tw twVar = new tw(5, oy4Var);
        this.o = 1;
        Object objD = u92VarG.d(new a53(twVar, oy4Var, 11), this);
        g84 g84Var = g84.a;
        if (objD != g84Var) {
            objD = qqgVar;
        }
        return objD == g84Var ? g84Var : qqgVar;
    }
}
