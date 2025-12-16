package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class fc1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallIndicatorWidget b;

    public /* synthetic */ fc1(CallIndicatorWidget callIndicatorWidget, int i) {
        this.a = i;
        this.b = callIndicatorWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        CallIndicatorWidget callIndicatorWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = CallIndicatorWidget.Y;
                zb1 zb1Var = new zb1(callIndicatorWidget.getContext());
                zb1Var.setId(j0b.R);
                zb1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, kti.d(100 * vw4.d().getDisplayMetrics().density)));
                f8j.d(zb1Var, 300L, new j6(5, callIndicatorWidget));
                zfi.b(zb1Var, new eo7(3, null, 13), null);
                return zb1Var;
            case 1:
                yy7[] yy7VarArr2 = CallIndicatorWidget.Y;
                View view = new View(callIndicatorWidget.getContext());
                view.setId(j0b.T);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, u45.q(15, vw4.d().getDisplayMetrics().density, kti.d(100 * vw4.d().getDisplayMetrics().density))));
                view.setBackground(new ColorDrawable(a93.s0.B(view).c.b().l));
                return view;
            default:
                yy7[] yy7VarArr3 = CallIndicatorWidget.Y;
                e51 e51Var = e51.a;
                return new cc1((x65) e51Var.getAccessor().c(17), (s41) e51Var.getAccessor().c(22), e51Var.b(), new mr1(callIndicatorWidget.getContext()), (nnb) e51Var.getAccessor().c(16), (lzf) gm1.a.getAccessor().c(8));
        }
    }
}
