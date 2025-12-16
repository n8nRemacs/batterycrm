package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class xfa extends dtf implements sm6 {
    public final /* synthetic */ NeuroAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfa(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.X = neuroAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xfa xfaVar = (xfa) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xfaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xfa xfaVar = new xfa(continuation, this.X);
        xfaVar.o = obj;
        return xfaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof kfa) {
            ((jrb) hh8.a.getAccessor().c(3)).c();
            ai8 ai8Var = ai8.c;
            ai8Var.getClass();
            ai8Var.p0().b(":chat-list", null);
        } else if (cdaVar instanceof ei4) {
            ai8.c.s0((ei4) cdaVar);
        } else if (cdaVar instanceof jc3) {
            this.X.getRouter().C();
        }
        return qqg.a;
    }
}
