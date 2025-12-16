package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class s92 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ t92 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s92(t92 t92Var, Continuation continuation) {
        super(2, continuation);
        this.Y = t92Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((s92) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        s92 s92Var = new s92(this.Y, continuation);
        s92Var.X = obj;
        return s92Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            sac sacVar = (sac) this.X;
            this.o = 1;
            Object objJ = this.Y.j(sacVar, this);
            g84 g84Var = g84.a;
            if (objJ == g84Var) {
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
