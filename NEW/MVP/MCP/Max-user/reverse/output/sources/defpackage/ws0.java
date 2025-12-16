package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class ws0 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetWidget b;

    public /* synthetic */ ws0(BottomSheetWidget bottomSheetWidget, int i) {
        this.a = i;
        this.b = bottomSheetWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        Window window;
        View currentFocus;
        int i = this.a;
        qqg qqgVar = qqg.a;
        View view = null;
        BottomSheetWidget bottomSheetWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = BottomSheetWidget.B0;
                Activity activity = bottomSheetWidget.getActivity();
                if (activity != null && (window = activity.getWindow()) != null && (currentFocus = window.getCurrentFocus()) != null) {
                    currentFocus.clearFocus();
                    int i2 = xz7.a;
                    if (xz7.b(xz7.c)) {
                        boolean h0 = bottomSheetWidget.getH0();
                        hs hsVar = bottomSheetWidget.z0;
                        yy7 yy7Var = BottomSheetWidget.B0[0];
                        hsVar.b(bottomSheetWidget, Boolean.valueOf(h0));
                        api.e(currentFocus);
                    }
                    view = currentFocus;
                }
                bottomSheetWidget.y0 = view;
                break;
            default:
                View view2 = bottomSheetWidget.y0;
                if (view2 != null) {
                    view2.requestFocus();
                    hs hsVar2 = bottomSheetWidget.z0;
                    yy7 yy7Var2 = BottomSheetWidget.B0[0];
                    if (((Boolean) hsVar2.a(bottomSheetWidget)).booleanValue()) {
                        api.f(view2);
                    }
                }
                bottomSheetWidget.y0 = null;
                break;
        }
        return qqgVar;
    }
}
