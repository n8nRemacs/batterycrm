package defpackage;

import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* loaded from: classes2.dex */
public final class gr7 extends dtf implements sm6 {
    public final /* synthetic */ InviteByPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr7(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.X = inviteByPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gr7 gr7Var = (gr7) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gr7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gr7 gr7Var = new gr7(continuation, this.X);
        gr7Var.o = obj;
        return gr7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        a94 a94Var = (a94) this.o;
        InviteByPhoneScreen inviteByPhoneScreen = this.X;
        k18 k18Var = inviteByPhoneScreen.w0;
        yp7 yp7Var = inviteByPhoneScreen.x0;
        if (yp7Var == null) {
            aub aubVar = (aub) k18Var.getValue();
            x2b x2bVar = a94Var.a;
            yp7 yp7Var2 = new yp7(aubVar, x2bVar.a, x2bVar.b, a94Var.b);
            inviteByPhoneScreen.x0 = yp7Var2;
            inviteByPhoneScreen.A0().v0.addTextChangedListener(yp7Var2);
        } else {
            x2b x2bVar2 = a94Var.a;
            yp7Var.b(x2bVar2.b, x2bVar2.a);
            yp7 yp7Var3 = inviteByPhoneScreen.x0;
            if (yp7Var3 != null) {
                yp7Var3.X = a94Var.b;
            }
        }
        wr7 wr7VarB0 = inviteByPhoneScreen.B0();
        aub aubVar2 = (aub) k18Var.getValue();
        rub rubVarF = aubVar2.f(a94Var.a.a);
        wr7VarB0.I0 = !aubVar2.n(rubVarF) ? Integer.MAX_VALUE : aubVar2.d(rubVarF, 1).length();
        CharSequence charSequenceB = a94Var.c.b(inviteByPhoneScreen.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        j8b j8bVarA0 = inviteByPhoneScreen.A0();
        j8bVarA0.setHint(charSequenceB);
        j8bVarA0.setCountry(a94Var.a);
        return qqg.a;
    }
}
