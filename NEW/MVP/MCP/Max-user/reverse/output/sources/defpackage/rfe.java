package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rfe extends dtf implements sm6 {
    public final /* synthetic */ tfe X;
    public final /* synthetic */ hka Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfe(tfe tfeVar, hka hkaVar, Continuation continuation) {
        super(2, continuation);
        this.X = tfeVar;
        this.Y = hkaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rfe) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rfe(this.X, this.Y, continuation);
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
        hka hkaVar = this.Y;
        this.o = 1;
        ikaVar.getClass();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ika", vb9.e(hkaVar.d, "onReactionsChanged: #"), null);
            }
        }
        List<rl9> list = hkaVar.X;
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        for (rl9 rl9Var : list) {
            arrayList.add(new wl9(((yl9) ikaVar.b.getValue()).d(rl9Var.a), rl9Var.b));
        }
        Object objB = ((em9) ikaVar.a.getValue()).b(hkaVar.c, hkaVar.d, hkaVar.o, arrayList, this);
        if (objB != g84Var) {
            objB = qqgVar;
        }
        return objB == g84Var ? g84Var : qqgVar;
    }
}
