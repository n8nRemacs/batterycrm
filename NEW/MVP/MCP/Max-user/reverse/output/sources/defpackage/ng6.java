package defpackage;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* loaded from: classes.dex */
public final class ng6 extends dtf implements sm6 {
    public final /* synthetic */ ForwardPickerScreen X;
    public final /* synthetic */ ViewGroup Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng6(ForwardPickerScreen forwardPickerScreen, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.X = forwardPickerScreen;
        this.Y = viewGroup;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ng6 ng6Var = (ng6) l((in9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ng6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ng6 ng6Var = new ng6(this.X, this.Y, continuation);
        ng6Var.o = obj;
        return ng6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        in9 in9Var = (in9) this.o;
        ForwardPickerScreen forwardPickerScreen = this.X;
        ytd ytdVar = forwardPickerScreen.E0;
        if (ytdVar != null) {
            int iV = az1.v(in9Var.a);
            ViewGroup viewGroup = this.Y;
            if (iV == 0) {
                y09 y09Var = forwardPickerScreen.G0;
                if (y09Var != null) {
                    yy7[] yy7VarArr = y09.m;
                    y09Var.e(true);
                }
                forwardPickerScreen.L0().setLeftIcon(yud.U0);
                zfi.b(viewGroup, ForwardPickerScreen.J0, null);
            } else if (iV == 1) {
                if (!ytdVar.n()) {
                    ytdVar.S(l8j.a(new MediaKeyboardWidget(forwardPickerScreen.b, 0L, true, 2, null), null, null));
                }
                WeakHashMap weakHashMap = hfh.a;
                veh.u(viewGroup, null);
                y09 y09Var2 = forwardPickerScreen.G0;
                if (y09Var2 != null) {
                    y09Var2.f();
                }
                forwardPickerScreen.L0().setLeftIcon(yud.Y0);
            } else if (iV == 2) {
                sn0 sn0Var = ((ForwardPickerScreen) forwardPickerScreen.F0.b).A0;
                if (sn0Var.e()) {
                    ((ik9) sn0Var.getValue()).e(true);
                }
                forwardPickerScreen.L0().setLeftIcon(yud.U0);
                gw0.w(new g56(new d53(new d53(xz7.f, 15), 9), new qg6(viewGroup, null), 1), forwardPickerScreen.getViewLifecycleScope());
            }
        }
        return qqg.a;
    }
}
