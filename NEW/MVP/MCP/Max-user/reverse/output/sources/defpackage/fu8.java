package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fu8 extends dtf implements sm6 {
    public final /* synthetic */ mu8 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu8(mu8 mu8Var, Continuation continuation) {
        super(2, continuation);
        this.X = mu8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fu8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fu8(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqg.a;
        }
        g8j.b(obj);
        mu8 mu8Var = this.X;
        tcf tcfVar = mu8Var.s0;
        tw twVar = new tw(8, mu8Var);
        this.o = 1;
        tcfVar.d(new w3(new sid(), twVar, 24), this);
        return g84.a;
    }
}
