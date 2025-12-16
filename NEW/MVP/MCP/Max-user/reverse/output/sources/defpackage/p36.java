package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class p36 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l48 Y;
    public final /* synthetic */ l38 Z;
    public int o;
    public final /* synthetic */ x26 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p36(l48 l48Var, l38 l38Var, x26 x26Var, Continuation continuation) {
        super(2, continuation);
        this.Y = l48Var;
        this.Z = l38Var;
        this.s0 = x26Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p36) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        p36 p36Var = new p36(this.Y, this.Z, this.s0, continuation);
        p36Var.X = obj;
        return p36Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        sac sacVar;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            sacVar = (sac) this.X;
            o36 o36Var = new o36(this.s0, sacVar, null);
            this.X = sacVar;
            this.o = 1;
            Object objB = b8j.b(this.Y, this.Z, o36Var, this);
            g84 g84Var = g84.a;
            if (objB == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sacVar = (sac) this.X;
            g8j.b(obj);
        }
        ((pac) sacVar).D(null);
        return qqg.a;
    }
}
