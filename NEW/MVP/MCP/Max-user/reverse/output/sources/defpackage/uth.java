package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class uth extends dtf implements sm6 {
    public final /* synthetic */ WebAppRootScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uth(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.X = webAppRootScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        uth uthVar = (uth) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uthVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uth uthVar = new uth(continuation, this.X);
        uthVar.o = obj;
        return uthVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        swg swgVar = (swg) this.o;
        String str = this.X.C0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "collect url state: " + swgVar + " " + swgVar.b, null);
            }
        }
        if (!swgVar.b) {
            this.X.O0().loadUrl(swgVar.a);
        }
        return qqg.a;
    }
}
