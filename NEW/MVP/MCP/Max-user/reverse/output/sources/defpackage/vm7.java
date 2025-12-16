package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;

/* loaded from: classes2.dex */
public final class vm7 extends dtf implements sm6 {
    public final /* synthetic */ InputNameScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm7(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.X = inputNameScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vm7 vm7Var = (vm7) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vm7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vm7 vm7Var = new vm7(continuation, this.X);
        vm7Var.o = obj;
        return vm7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Integer numN;
        g8j.b(obj);
        xh5 xh5Var = (xh5) this.o;
        yy7[] yy7VarArr = InputNameScreen.A0;
        InputNameScreen inputNameScreen = this.X;
        inputNameScreen.y0().setActiveButtonLoaderState(false);
        boolean z = xh5Var instanceof mm7;
        seb sebVar = seb.a;
        if (z) {
            mm7 mm7Var = (mm7) xh5Var;
            String strValueOf = String.valueOf(((s5g) mm7Var.a).b(inputNameScreen.getContext()));
            int iV = az1.v(mm7Var.c);
            if (iV == 0) {
                inputNameScreen.z0().h(strValueOf, sebVar);
            } else if (iV == 1) {
                inputNameScreen.A0().h(strValueOf, sebVar);
            } else if (iV != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (xh5Var instanceof m27) {
            int iV2 = az1.v(((m27) xh5Var).a);
            if (iV2 == 0) {
                inputNameScreen.z0().e();
            } else if (iV2 == 1) {
                inputNameScreen.A0().e();
            } else if (iV2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (xh5Var instanceof ojd) {
            oh8 oh8Var = (oh8) ((ojd) xh5Var).a;
            if (oh8Var instanceof nh8) {
                nh8 nh8Var = (nh8) oh8Var;
                ((q70) inputNameScreen.s0.getValue()).a(new p70(nh8Var.e));
                s5g s5gVar = nh8Var.c;
                s5g s5gVar2 = nh8Var.d;
                inputNameScreen.a.getClass();
                CharSequence charSequenceB = s5gVar.b(inputNameScreen.getContext());
                if (charSequenceB != null) {
                    CharSequence charSequenceB2 = s5gVar2.b(inputNameScreen.getContext());
                    ccb ccbVar = new ccb(inputNameScreen);
                    ccbVar.h(charSequenceB);
                    ccbVar.b(charSequenceB2);
                    View view = inputNameScreen.getView();
                    ccbVar.c(new kcb(1, (view == null || (numN = dqi.n(view)) == null) ? 0 : numN.intValue(), 0, 4));
                    ccbVar.i();
                }
            } else {
                if (!(oh8Var instanceof mh8)) {
                    throw new NoWhenBranchMatchedException();
                }
                inputNameScreen.z0().h(String.valueOf(((mh8) oh8Var).c.b(inputNameScreen.getContext())), sebVar);
            }
        } else if (xh5Var instanceof nye) {
            inputNameScreen.A0().setHint(z7.e(inputNameScreen.getContext(), t3d.oneme_login_input_name_hint_surname_short));
            inputNameScreen.A0().h(z7.e(inputNameScreen.getContext(), t3d.oneme_login_input_name_surname_placeholder), seb.b);
        } else if (xh5Var instanceof p27) {
            inputNameScreen.A0().setHint(z7.e(inputNameScreen.getContext(), t3d.oneme_login_input_name_hint_surname));
            inputNameScreen.A0().e();
        } else if (xh5Var instanceof txe) {
            api.f(inputNameScreen.z0().a);
        }
        return qqg.a;
    }
}
