package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class phc extends dtf implements sm6 {
    public final /* synthetic */ rhc X;
    public final /* synthetic */ rj0 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phc(rhc rhcVar, rj0 rj0Var, Continuation continuation) {
        super(2, continuation);
        this.X = rhcVar;
        this.Y = rj0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((phc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new phc(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            rhc rhcVar = this.X;
            jve jveVar = rhcVar.a;
            rj0 rj0Var = this.Y;
            ihc ihcVar = new ihc(new Long(rj0Var.a), rhc.a(rhcVar, rj0Var.b));
            this.o = 1;
            Object objA = jveVar.a(ihcVar, this);
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
