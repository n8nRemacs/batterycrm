package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u7h extends dtf implements sm6 {
    public final /* synthetic */ j35 X;
    public final /* synthetic */ si9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7h(j35 j35Var, si9 si9Var, Continuation continuation) {
        super(2, continuation);
        this.X = j35Var;
        this.Y = si9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((u7h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new u7h(this.X, this.Y, continuation);
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
        l24 l24Var = (l24) ((k18) this.X.X).getValue();
        long j = this.Y.o;
        this.o = 1;
        Comparable comparableB = l24Var.b(j, this);
        g84 g84Var = g84.a;
        return comparableB == g84Var ? g84Var : comparableB;
    }
}
