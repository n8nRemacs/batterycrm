package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c2e extends dtf implements sm6 {
    public final /* synthetic */ d2e X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2e(long j, d2e d2eVar, Continuation continuation) {
        super(2, continuation);
        this.X = d2eVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ((c2e) l((f84) obj, (Continuation) obj2)).n(qqg.a);
        return g84.a;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new c2e(this.Y, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        long jLongValue;
        d2e d2eVar = this.X;
        bwf bwfVar = d2eVar.v0;
        int i = this.o;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            long jLongValue2 = ((Number) bwfVar.getValue()).longValue();
            this.o = 1;
            if (s8j.c(jLongValue2, this) != g84Var) {
            }
            return g84Var;
        }
        if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g8j.b(obj);
        do {
            tcf tcfVar = d2eVar.y0;
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, new Long((System.currentTimeMillis() - this.Y) / 1000)));
            jLongValue = ((Number) bwfVar.getValue()).longValue();
            this.o = 2;
        } while (s8j.c(jLongValue, this) != g84Var);
        return g84Var;
    }
}
