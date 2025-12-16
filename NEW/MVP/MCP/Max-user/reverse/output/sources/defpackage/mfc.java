package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mfc extends dtf implements sm6 {
    public final /* synthetic */ pfc X;
    public final /* synthetic */ rj0 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfc(pfc pfcVar, rj0 rj0Var, Continuation continuation) {
        super(2, continuation);
        this.X = pfcVar;
        this.Y = rj0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mfc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mfc(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            pfc pfcVar = this.X;
            jve jveVar = pfcVar.a;
            rj0 rj0Var = this.Y;
            ifc ifcVar = new ifc(new Long(rj0Var.a), pfc.a(pfcVar, rj0Var.b));
            this.o = 1;
            Object objA = jveVar.a(ifcVar, this);
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
