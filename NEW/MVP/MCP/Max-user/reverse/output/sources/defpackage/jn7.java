package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class jn7 extends dtf implements sm6 {
    public final /* synthetic */ InputPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn7(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.X = inputPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jn7 jn7Var = (jn7) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jn7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jn7 jn7Var = new jn7(continuation, this.X);
        jn7Var.o = obj;
        return jn7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        a94 a94Var = (a94) this.o;
        InputPhoneScreen inputPhoneScreen = this.X;
        q70 q70Var = (q70) inputPhoneScreen.z0.getValue();
        x2b x2bVar = a94Var.a;
        int i = a94Var.b;
        q70Var.a(new p70("phone_country_changed", 3, fzd.c(new imb("phoneCountry", x2bVar.a))));
        x2b x2bVar2 = a94Var.a;
        String str = x2bVar2.a;
        int i2 = x2bVar2.b;
        String str2 = x2bVar2.a;
        if ("".equals(str)) {
            inputPhoneScreen.C0().v0.removeTextChangedListener(inputPhoneScreen.x0);
            inputPhoneScreen.x0 = null;
        } else {
            yp7 yp7Var = inputPhoneScreen.x0;
            if (yp7Var == null) {
                yp7 yp7Var2 = new yp7((aub) inputPhoneScreen.w0.getValue(), str2, i2, i);
                inputPhoneScreen.x0 = yp7Var2;
                inputPhoneScreen.C0().v0.addTextChangedListener(yp7Var2);
            } else {
                yp7Var.b(i2, str2);
                yp7 yp7Var3 = inputPhoneScreen.x0;
                if (yp7Var3 != null) {
                    yp7Var3.X = i;
                }
            }
        }
        CharSequence charSequenceB = a94Var.c.b(inputPhoneScreen.getContext());
        CharSequence charSequence = charSequenceB != null ? charSequenceB : "";
        j8b j8bVarC0 = inputPhoneScreen.C0();
        j8bVarC0.setHint(charSequence);
        j8bVarC0.setCountry(x2bVar2);
        return qqg.a;
    }
}
