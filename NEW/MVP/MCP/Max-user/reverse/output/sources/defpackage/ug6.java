package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final class ug6 extends dtf implements sm6 {
    public final /* synthetic */ ForwardPickerScreen X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug6(ForwardPickerScreen forwardPickerScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.X = forwardPickerScreen;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ug6 ug6Var = (ug6) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ug6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ug6 ug6Var = new ug6(this.X, this.Y, continuation);
        ug6Var.o = obj;
        return ug6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        Set set = (Set) this.o;
        ForwardPickerScreen forwardPickerScreen = this.X;
        AutoTransition autoTransition = forwardPickerScreen.z0;
        yy7[] yy7VarArr = ForwardPickerScreen.I0;
        boolean zO0 = forwardPickerScreen.O0();
        qqg qqgVar = qqg.a;
        if (!zO0 && set.size() == 1) {
            ((cg6) forwardPickerScreen.I0().c).h(null, set, forwardPickerScreen.O0());
            return qqgVar;
        }
        int size = set.size();
        boolean z = forwardPickerScreen.L0().getVisibility() == 0;
        View view = this.Y;
        if (!z && size > 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            ((cg6) forwardPickerScreen.I0().c).f();
            forwardPickerScreen.M0().setVisibility(0);
            forwardPickerScreen.L0().setVisibility(0);
            return qqgVar;
        }
        if (z && size == 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            forwardPickerScreen.M0().setVisibility(8);
            sn0 sn0Var = forwardPickerScreen.A0;
            if (sn0Var.e()) {
                ((ik9) sn0Var.getValue()).setVisibility(8);
            }
            ytd ytdVar = forwardPickerScreen.E0;
            if (ytdVar != null && ytdVar.n()) {
                ((cg6) forwardPickerScreen.I0().c).r.E(1);
                return qqgVar;
            }
            int i = xz7.a;
            if (xz7.b(xz7.c)) {
                forwardPickerScreen.F0.k();
            }
        }
        return qqgVar;
    }
}
