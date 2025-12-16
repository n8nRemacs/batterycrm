package defpackage;

import android.view.ViewGroup;
import one.me.calls.ui.ui.pip.PipScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class x1c implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PipScreen b;

    public /* synthetic */ x1c(PipScreen pipScreen, int i) {
        this.a = i;
        this.b = pipScreen;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        PipScreen pipScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = PipScreen.o;
                qj1 qj1Var = new qj1(pipScreen.getContext());
                qj1Var.setPipTheme(a93.s0.B(qj1Var).c);
                qj1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                qj1Var.setVideoLayoutUpdatesControllerProvider(new x1c(pipScreen, 2));
                qj1Var.setBackgroundCorners(0.0f);
                return qj1Var;
            case 1:
                yy7[] yy7VarArr2 = PipScreen.o;
                e51 e51Var = e51.a;
                return new r1c((nnb) e51Var.getAccessor().c(16), e51Var.b(), e51Var.a(), new ukd(28, pipScreen), fm1.b());
            default:
                yy7[] yy7VarArr3 = PipScreen.o;
                return (x4h) ((r1c) pipScreen.c.getValue()).X.getValue();
        }
    }
}
