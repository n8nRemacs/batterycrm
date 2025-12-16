package defpackage;

import android.widget.EditText;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class gn7 extends dtf implements sm6 {
    public final /* synthetic */ InputPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn7(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.X = inputPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gn7 gn7Var = (gn7) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gn7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gn7 gn7Var = new gn7(continuation, this.X);
        gn7Var.o = obj;
        return gn7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = InputPhoneScreen.C0;
        j8b j8bVarC0 = this.X.C0();
        if (j8bVarC0.hasWindowFocus()) {
            EditText editText = j8bVarC0.v0;
            editText.requestFocus();
            editText.post(new k79(j8bVarC0, 17, editText));
        } else {
            j8bVarC0.setOnWindowFocusChanged(new z11(10, j8bVarC0));
        }
        return qqg.a;
    }
}
