package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mu5 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ou5 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu5(ou5 ou5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ou5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mu5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mu5 mu5Var = new mu5(this.Y, continuation);
        mu5Var.X = obj;
        return mu5Var;
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
        f84 f84Var = (f84) this.X;
        this.o = 1;
        Object objInvoke = this.Y.invoke(f84Var, this);
        g84 g84Var = g84.a;
        return objInvoke == g84Var ? g84Var : objInvoke;
    }
}
