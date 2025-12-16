package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class w65 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ x65 Y;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w65(x65 x65Var, Continuation continuation) {
        super(2, continuation);
        this.Y = x65Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ((w65) l((f84) obj, (Continuation) obj2)).n(qqg.a);
        return g84.a;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new w65(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        long jCurrentTimeMillis;
        Object value;
        long jLongValue;
        x65 x65Var = this.Y;
        bwf bwfVar = x65Var.d;
        int i = this.X;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue2 = ((Number) bwfVar.getValue()).longValue();
            this.o = jCurrentTimeMillis;
            this.X = 1;
            if (s8j.c(jLongValue2, this) != g84Var) {
            }
            return g84Var;
        }
        if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jCurrentTimeMillis = this.o;
        g8j.b(obj);
        do {
            tcf tcfVar = x65Var.e;
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, new Long((System.currentTimeMillis() - jCurrentTimeMillis) / 1000)));
            jLongValue = ((Number) bwfVar.getValue()).longValue();
            this.o = jCurrentTimeMillis;
            this.X = 2;
        } while (s8j.c(jLongValue, this) != g84Var);
        return g84Var;
    }
}
