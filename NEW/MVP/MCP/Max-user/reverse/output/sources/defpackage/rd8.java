package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rd8 extends dtf implements sm6 {
    public final /* synthetic */ sd8 X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd8(sd8 sd8Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = sd8Var;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rd8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rd8(this.X, this.Y, continuation);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        String str = this.Y;
        sd8 sd8Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            vo6 vo6Var = (vo6) sd8Var.g.get(str);
            if (vo6Var == null) {
                return qqgVar;
            }
            de8 de8Var = sd8Var.c;
            this.o = 1;
            Object objC = ((bj7) de8Var).c(vo6Var, 40, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        sd8Var.a.c(new td8(str));
        return qqgVar;
    }
}
