package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kb1 extends dtf implements sm6 {
    public final /* synthetic */ mb1 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb1(mb1 mb1Var, Continuation continuation) {
        super(2, continuation);
        this.X = mb1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kb1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kb1(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object value;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            throw new KotlinNothingValueException();
        }
        g8j.b(obj);
        mb1 mb1Var = this.X;
        co5 co5Var = ((hw1) mb1Var.c).l().l;
        if ((co5Var instanceof wn5) || (co5Var instanceof vn5) || (co5Var instanceof xn5)) {
            tcf tcfVar = mb1Var.s0;
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, new ib1(false, false)));
            return qqg.a;
        }
        tcf tcfVar2 = ((c51) mb1Var.b).j;
        tw twVar = new tw(3, mb1Var);
        this.o = 1;
        tcfVar2.d(twVar, this);
        return g84.a;
    }
}
