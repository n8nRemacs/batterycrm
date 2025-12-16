package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.login.inputname.InputNameScreen;

/* loaded from: classes2.dex */
public final class jp3 extends dtf implements sm6 {
    public final /* synthetic */ ConfirmPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp3(Continuation continuation, ConfirmPhoneScreen confirmPhoneScreen) {
        super(2, continuation);
        this.X = confirmPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jp3 jp3Var = (jp3) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jp3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jp3 jp3Var = new jp3(continuation, this.X);
        jp3Var.o = obj;
        return jp3Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ConfirmPhoneScreen confirmPhoneScreen = this.X;
        ?? r1 = confirmPhoneScreen.Z;
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof cp3) {
            ((jrb) hh8.a.getAccessor().c(3)).c();
            api.c(confirmPhoneScreen);
            ai8 ai8Var = ai8.c;
            ai8Var.getClass();
            ai8Var.p0().b(":chat-list", null);
        } else if (cdaVar instanceof ep3) {
            confirmPhoneScreen.getRouter().D();
            ai8.c.s0(((ep3) cdaVar).b);
        } else if (cdaVar instanceof dp3) {
            jp7 jp7Var = (jp7) r1.getValue();
            dp3 dp3Var = (dp3) cdaVar;
            String str = dp3Var.b;
            hs hsVar = confirmPhoneScreen.d;
            yy7 yy7Var = ConfirmPhoneScreen.B0[1];
            String str2 = (String) hsVar.a(confirmPhoneScreen);
            o8c o8cVar = dp3Var.c;
            jp7Var.getClass();
            jp7Var.b(l8j.a(new InputNameScreen(str, str2, o8cVar), null, null), "InputNameScreen");
        } else if (cdaVar instanceof bp3) {
            ((jp7) r1.getValue()).a(false);
        } else if (cdaVar instanceof ei4) {
            api.c(confirmPhoneScreen);
            ai8.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
