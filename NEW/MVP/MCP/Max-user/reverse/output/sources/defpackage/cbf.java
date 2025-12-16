package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class cbf extends dtf implements sm6 {
    public final /* synthetic */ StartConversationScreen X;
    public final /* synthetic */ dv6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbf(StartConversationScreen startConversationScreen, dv6 dv6Var, Continuation continuation) {
        super(2, continuation);
        this.X = startConversationScreen;
        this.Y = dv6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cbf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cbf(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        dv6 dv6Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = StartConversationScreen.H0;
            nbf nbfVarZ0 = this.X.z0();
            gx3 gx3Var = dv6Var.Y;
            this.o = 1;
            Object objI = svi.i(((q2b) ((lzf) nbfVarZ0.o.getValue())).b(), new jbf(nbfVarZ0, gx3Var, null), this);
            g84 g84Var = g84.a;
            if (objI != g84Var) {
                objI = qqgVar;
            }
            if (objI == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        uaf uafVar = uaf.c;
        long j = dv6Var.a;
        uafVar.getClass();
        uafVar.p0().b(":profile?id=" + j + "&type=contact", null);
        return qqgVar;
    }
}
