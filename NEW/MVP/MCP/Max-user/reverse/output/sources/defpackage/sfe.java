package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sfe extends dtf implements sm6 {
    public final /* synthetic */ tfe X;
    public final /* synthetic */ jka Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfe(tfe tfeVar, jka jkaVar, Continuation continuation) {
        super(2, continuation);
        this.X = tfeVar;
        this.Y = jkaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sfe) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sfe(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        ika ikaVar = (ika) this.X.l.getValue();
        jka jkaVar = this.Y;
        this.o = 1;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            ikaVar.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ika", vb9.e(jkaVar.d, "onNotifYouReacted: #"), null);
            }
        }
        Object objC = ((em9) ikaVar.a.getValue()).c(jkaVar.c, jkaVar.d, jkaVar.o, this);
        if (objC != g84Var) {
            objC = qqgVar;
        }
        return objC == g84Var ? g84Var : qqgVar;
    }
}
