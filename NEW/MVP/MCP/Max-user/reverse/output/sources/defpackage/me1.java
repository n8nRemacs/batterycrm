package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;

/* loaded from: classes.dex */
public final class me1 extends dtf implements sm6 {
    public final /* synthetic */ CallJoinLinkPreviewWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(Continuation continuation, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        super(2, continuation);
        this.X = callJoinLinkPreviewWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        me1 me1Var = (me1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        me1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        me1 me1Var = new me1(continuation, this.X);
        me1Var.o = obj;
        return me1Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof pc1) {
            yy7[] yy7VarArr = CallJoinLinkPreviewWidget.A0;
            ((kj1) this.X.c.getValue()).j(((pc1) cdaVar).b, true, false, true, new oe1(cdaVar, 0));
        }
        return qqg.a;
    }
}
