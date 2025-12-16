package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rwb extends dtf implements sm6 {
    public final /* synthetic */ twb X;
    public final /* synthetic */ or2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwb(twb twbVar, or2 or2Var, Continuation continuation) {
        super(2, continuation);
        this.X = twbVar;
        this.Y = or2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rwb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rwb(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.a;
            pwb pwbVar = new pwb(this.Y.a);
            this.o = 1;
            Object objA = jveVar.a(pwbVar, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
