package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class yzb extends dtf implements sm6 {
    public final /* synthetic */ PinBarsWidget X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzb(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.X = pinBarsWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yzb yzbVar = (yzb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yzbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yzb yzbVar = new yzb(this.Y, continuation, this.X);
        yzbVar.o = obj;
        return yzbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cz6 cz6Var = (cz6) this.o;
        ViewGroup viewGroup = (ViewGroup) this.Y;
        PinBarsWidget pinBarsWidget = this.X;
        AutoTransition autoTransition = pinBarsWidget.t0;
        if (cz6Var instanceof az6) {
            if (pinBarsWidget.Z == null) {
                dz6 dz6Var = new dz6(pinBarsWidget.getContext());
                dz6Var.setId(k8b.a);
                dz6Var.setJoinAction(new szb(pinBarsWidget, 1));
                pinBarsWidget.Z = dz6Var;
                TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
                viewGroup.addView(pinBarsWidget.Z, viewGroup.getChildCount());
            }
            dz6 dz6Var2 = pinBarsWidget.Z;
            if (dz6Var2 != null) {
                az6 az6Var = (az6) cz6Var;
                dz6Var2.H0.setAvatars(az6Var.c);
                dz6Var2.J0.setText(az6Var.b.d(dz6Var2));
            }
        } else {
            View viewFindViewById = viewGroup.findViewById(k8b.a);
            if (viewFindViewById != null) {
                TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
                viewGroup.removeView(viewFindViewById);
            }
            pinBarsWidget.Z = null;
        }
        return qqg.a;
    }
}
