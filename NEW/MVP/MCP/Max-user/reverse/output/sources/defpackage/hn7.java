package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class hn7 extends dtf implements sm6 {
    public final /* synthetic */ InputPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn7(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.X = inputPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hn7 hn7Var = (hn7) l((oh8) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hn7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hn7 hn7Var = new hn7(continuation, this.X);
        hn7Var.o = obj;
        return hn7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Integer numN;
        g8j.b(obj);
        oh8 oh8Var = (oh8) this.o;
        yy7[] yy7VarArr = InputPhoneScreen.C0;
        InputPhoneScreen inputPhoneScreen = this.X;
        OneMeButton oneMeButtonA0 = inputPhoneScreen.A0();
        oneMeButtonA0.setProgressEnabled(false);
        oneMeButtonA0.setClickable(true);
        if (oh8Var instanceof kh8) {
            InputPhoneScreen.z0(inputPhoneScreen, ((kh8) oh8Var).c.b(inputPhoneScreen.getContext()));
        } else if (oh8Var instanceof lh8) {
            cbj.b(inputPhoneScreen);
        } else if (oh8Var instanceof nh8) {
            nh8 nh8Var = (nh8) oh8Var;
            ((q70) inputPhoneScreen.z0.getValue()).a(new p70(nh8Var.e));
            s5g s5gVar = nh8Var.c;
            s5g s5gVar2 = nh8Var.d;
            inputPhoneScreen.a.getClass();
            CharSequence charSequenceB = s5gVar.b(inputPhoneScreen.getContext());
            if (charSequenceB != null) {
                CharSequence charSequenceB2 = s5gVar2.b(inputPhoneScreen.getContext());
                ccb ccbVar = new ccb(inputPhoneScreen);
                ccbVar.h(charSequenceB);
                ccbVar.b(charSequenceB2);
                View view = inputPhoneScreen.getView();
                ccbVar.c(new kcb(1, (view == null || (numN = dqi.n(view)) == null) ? 0 : numN.intValue(), 0, 4));
                ccbVar.i();
            }
        } else {
            if (oh8Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            InputPhoneScreen.z0(inputPhoneScreen, null);
        }
        return qqg.a;
    }
}
