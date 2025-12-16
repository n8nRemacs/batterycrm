package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ou5 extends dtf implements sm6 {
    public final /* synthetic */ pe4 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou5(pe4 pe4Var, Continuation continuation) {
        super(2, continuation);
        this.X = pe4Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ou5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ou5(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        this.o = 1;
        l42 l42Var = new l42(1, hni.f(this));
        l42Var.o();
        pe4 pe4Var = this.X;
        l42Var.e(new z11(7, pe4Var));
        ((r0) pe4Var).l(new nu5(0, l42Var), new es(2));
        Object objN = l42Var.n();
        g84 g84Var = g84.a;
        return objN == g84Var ? g84Var : objN;
    }
}
