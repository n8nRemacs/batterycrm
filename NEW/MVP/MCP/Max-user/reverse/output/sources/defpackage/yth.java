package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class yth extends dtf implements sm6 {
    public final /* synthetic */ WebAppRootScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yth(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.X = webAppRootScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yth ythVar = (yth) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ythVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yth ythVar = new yth(continuation, this.X);
        ythVar.o = obj;
        return ythVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        wuh wuhVar = (wuh) this.o;
        yy7[] yy7VarArr = WebAppRootScreen.R0;
        this.X.S0(wuhVar);
        return qqg.a;
    }
}
