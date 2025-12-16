package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class vjd extends dtf implements sm6 {
    public final /* synthetic */ RegistrationNeuroAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjd(Continuation continuation, RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen) {
        super(2, continuation);
        this.X = registrationNeuroAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vjd vjdVar = (vjd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vjdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vjd vjdVar = new vjd(continuation, this.X);
        vjdVar.o = obj;
        return vjdVar;
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
