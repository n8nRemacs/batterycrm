package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;

/* loaded from: classes2.dex */
public final class sm7 extends dtf implements sm6 {
    public final /* synthetic */ InputNameScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm7(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.X = inputNameScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sm7 sm7Var = (sm7) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sm7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sm7 sm7Var = new sm7(continuation, this.X);
        sm7Var.o = obj;
        return sm7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        InputNameScreen inputNameScreen = this.X;
        k18 k18Var = inputNameScreen.Y;
        k18 k18Var2 = inputNameScreen.X;
        g8j.b(obj);
        if (((Boolean) this.o).booleanValue()) {
            yy7[] yy7VarArr = InputNameScreen.A0;
            if (!((qsb) k18Var2.getValue()).c(qsb.f)) {
                ((w4e) ((pb3) k18Var.getValue())).G();
                qsb.g((qsb) k18Var2.getValue(), new s2i(inputNameScreen, 1));
            } else if (!((qsb) k18Var2.getValue()).c(qsb.g)) {
                w4e w4eVar = (w4e) ((pb3) k18Var.getValue());
                if (!((Boolean) w4eVar.L.D(w4eVar, w4e.m0[29])).booleanValue()) {
                    ((w4e) ((pb3) k18Var.getValue())).G();
                    qsb.g((qsb) k18Var2.getValue(), new s2i(inputNameScreen, 1));
                }
            }
        } else {
            int i = xz7.a;
            if (!xz7.b(xz7.c)) {
                yy7[] yy7VarArr2 = InputNameScreen.A0;
                api.f(inputNameScreen.z0().a);
            }
        }
        return qqg.a;
    }
}
