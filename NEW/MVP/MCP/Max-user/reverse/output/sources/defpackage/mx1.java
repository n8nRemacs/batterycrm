package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mx1 extends dtf implements sm6 {
    public final /* synthetic */ ox1 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx1(ox1 ox1Var, Continuation continuation) {
        super(2, continuation);
        this.X = ox1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mx1) l((qqg) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mx1(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            String name = ox1.class.getName();
            ox1 ox1Var = this.X;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, ho7.f(ox1Var.hashCode(), "Request permission as delay reached: "), null);
                }
            }
            this.o = 1;
            if (s8j.c(300L, this) == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        this.X.e();
        return qqg.a;
    }
}
