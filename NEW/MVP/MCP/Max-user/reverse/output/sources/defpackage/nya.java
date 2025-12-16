package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class nya extends dtf implements sm6 {
    public final /* synthetic */ oya X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nya(oya oyaVar, Continuation continuation) {
        super(2, continuation);
        this.X = oyaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nya) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nya(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        oya oyaVar = this.X;
        k18 k18Var = oyaVar.b;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            vxf vxfVar = (vxf) k18Var.getValue();
            this.o = 1;
            Object objA = vxfVar.a(this);
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
        wqi.c("PushToken", "Refresh current token succeed.", new Object[0]);
        vxf vxfVar2 = (vxf) k18Var.getValue();
        svi.e(vxfVar2.u0, null, null, new nxf(vxfVar2, new mya(oyaVar), null), 3);
        return qqg.a;
    }
}
