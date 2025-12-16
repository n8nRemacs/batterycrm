package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xp5 extends dtf implements sm6 {
    public final /* synthetic */ yp5 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp5(yp5 yp5Var, Continuation continuation) {
        super(2, continuation);
        this.X = yp5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ((xp5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
        return g84.a;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xp5(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = yp5.i;
            yp5 yp5Var = this.X;
            hbd hbdVar = yp5Var.b().o;
            tw twVar = new tw(6, yp5Var);
            this.o = 1;
            Object objD = hbdVar.a.d(twVar, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
