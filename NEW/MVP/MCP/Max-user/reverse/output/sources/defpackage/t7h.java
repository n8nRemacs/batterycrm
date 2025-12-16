package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t7h extends dtf implements sm6 {
    public final /* synthetic */ j35 X;
    public final /* synthetic */ w8h Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7h(j35 j35Var, w8h w8hVar, Continuation continuation) {
        super(2, continuation);
        this.X = j35Var;
        this.Y = w8hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((t7h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new t7h(this.X, this.Y, continuation);
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
        gx9 gx9Var = (gx9) ((k18) this.X.o).getValue();
        long j = this.Y.b;
        this.o = 1;
        Object objJ = gx9Var.a.j(j, this);
        g84 g84Var = g84.a;
        return objJ == g84Var ? g84Var : objJ;
    }
}
