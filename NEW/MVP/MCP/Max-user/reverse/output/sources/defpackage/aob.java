package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class aob extends dtf implements sm6 {
    public final /* synthetic */ dob X;
    public final /* synthetic */ xs Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aob(dob dobVar, xs xsVar, Continuation continuation) {
        super(2, continuation);
        this.X = dobVar;
        this.Y = xsVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((aob) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new aob(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            at1 at1Var = this.X.b;
            this.o = 1;
            Object objD = at1Var.d(this.Y, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
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
