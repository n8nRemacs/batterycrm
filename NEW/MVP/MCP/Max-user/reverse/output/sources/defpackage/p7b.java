package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class p7b extends dtf implements sm6 {
    public final /* synthetic */ q7b X;
    public final /* synthetic */ ku3 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7b(q7b q7bVar, ku3 ku3Var, Continuation continuation) {
        super(2, continuation);
        this.X = q7bVar;
        this.Y = ku3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p7b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p7b(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws NumberFormatException {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        tka tkaVarA = this.X.a();
        this.o = 1;
        Object objG = tkaVarA.g(this.Y, this);
        g84 g84Var = g84.a;
        return objG == g84Var ? g84Var : objG;
    }
}
