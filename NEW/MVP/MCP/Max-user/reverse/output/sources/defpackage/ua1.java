package defpackage;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;

/* loaded from: classes.dex */
public final class ua1 extends dtf implements sm6 {
    public final /* synthetic */ CallHistoryScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua1(Continuation continuation, CallHistoryScreen callHistoryScreen) {
        super(2, continuation);
        this.X = callHistoryScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ua1 ua1Var = (ua1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ua1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ua1 ua1Var = new ua1(continuation, this.X);
        ua1Var.o = obj;
        return ua1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ww1 ww1Var = (ww1) this.o;
        CallHistoryScreen callHistoryScreen = this.X;
        bbd bbdVar = callHistoryScreen.w0;
        callHistoryScreen.x0.a = ww1Var.a;
        ia1 ia1Var = callHistoryScreen.y0;
        ViewPager2 viewPager2Y0 = callHistoryScreen.y0();
        List list = ww1Var.a;
        if (!ia1Var.w0.isEmpty() || list.isEmpty()) {
            da1 da1Var = new da1(ia1Var, list, q08.b(new ea1(0, ia1Var.w0, list)), 0);
            i6 i6Var = new i6(22, ia1Var);
            if (viewPager2Y0.isInLayout()) {
                viewPager2Y0.post(new xz0(ia1Var, viewPager2Y0, i, da1Var, i6Var, 1));
            } else {
                da1Var.invoke();
            }
        } else {
            ia1Var.w0 = list;
            ia1Var.p(0, list.size());
        }
        bbd bbdVar2 = callHistoryScreen.t0;
        yy7[] yy7VarArr = CallHistoryScreen.D0;
        ((neb) bbdVar2.D(callHistoryScreen, yy7VarArr[2])).setVisibility(!list.isEmpty() ? 0 : 8);
        callHistoryScreen.y0().setVisibility(!list.isEmpty() ? 0 : 8);
        boolean zIsEmpty = list.isEmpty();
        boolean z = callHistoryScreen.requireView().findViewById(byc.call_history_empty) != null;
        if (zIsEmpty) {
            if (!z) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) callHistoryScreen.Z.D(callHistoryScreen, yy7VarArr[0]);
                x3b x3bVar = new x3b(callHistoryScreen.getContext());
                x3bVar.setId(byc.call_history_empty);
                d74 d74Var = new d74(-1, -1);
                d74Var.b(new AppBarLayout$ScrollingViewBehavior());
                x3bVar.setLayoutParams(d74Var);
                x3bVar.setIcon(yud.h0);
                x3bVar.setTitle(new n5g(y2d.call_history_call_history_empty_title));
                x3bVar.setSubtitle(new n5g(y2d.call_history_call_history_empty_subtitle));
                zfi.b(x3bVar, new eo7(0, new ms0(5, 2, true), 7), null);
                x3bVar.setVisibility(8);
                dqi.a(coordinatorLayout, x3bVar, -1);
            }
            ((x3b) bbdVar.D(callHistoryScreen, yy7VarArr[7])).setVisibility(0);
        } else if (z) {
            ((x3b) bbdVar.D(callHistoryScreen, yy7VarArr[7])).setVisibility(8);
        }
        ((r1b) callHistoryScreen.v0.D(callHistoryScreen, yy7VarArr[6])).setVisibility(ww1Var.b ? 0 : 8);
        return qqg.a;
    }
}
