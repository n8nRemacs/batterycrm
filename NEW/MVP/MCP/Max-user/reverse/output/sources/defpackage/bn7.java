package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class bn7 extends dtf implements sm6 {
    public final /* synthetic */ InputPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn7(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.X = inputPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bn7 bn7Var = (bn7) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bn7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bn7 bn7Var = new bn7(continuation, this.X);
        bn7Var.o = obj;
        return bn7Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof zm7) {
            jp7 jp7Var = (jp7) this.X.y0.getValue();
            zm7 zm7Var = (zm7) cdaVar;
            String str = zm7Var.b;
            String str2 = zm7Var.c;
            int i = zm7Var.d;
            jp7Var.getClass();
            jp7Var.b(l8j.a(new ConfirmPhoneScreen(str, str2, i), null, null), "ConfirmPhoneScreen");
        } else if (cdaVar instanceof ei4) {
            ai8.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
