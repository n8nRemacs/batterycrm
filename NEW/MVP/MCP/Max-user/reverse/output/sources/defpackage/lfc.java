package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lfc extends dtf implements sm6 {
    public final /* synthetic */ pfc X;
    public final /* synthetic */ dbc Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfc(pfc pfcVar, dbc dbcVar, Continuation continuation) {
        super(2, continuation);
        this.X = pfcVar;
        this.Y = dbcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lfc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lfc(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.a;
            hfc hfcVar = new hfc(this.Y.c);
            this.o = 1;
            Object objA = jveVar.a(hfcVar, this);
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
