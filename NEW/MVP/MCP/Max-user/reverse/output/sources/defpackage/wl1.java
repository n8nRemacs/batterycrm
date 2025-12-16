package defpackage;

import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;

/* loaded from: classes.dex */
public final class wl1 extends dtf implements sm6 {
    public final /* synthetic */ CallScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.X = callScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wl1 wl1Var = (wl1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wl1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wl1 wl1Var = new wl1(continuation, this.X);
        wl1Var.o = obj;
        return wl1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        CallScreen callScreen = this.X;
        bbd bbdVar = callScreen.D0;
        g8j.b(obj);
        z51 z51Var = (z51) this.o;
        if (fni.a(z51Var, y51.a)) {
            rha rhaVar = CallScreen.N0;
            callScreen.C0(false);
        } else {
            if (!(z51Var instanceof x51)) {
                throw new NoWhenBranchMatchedException();
            }
            rt1 rt1Var = ((x51) z51Var).a;
            rha rhaVar2 = CallScreen.N0;
            bbd bbdVar2 = callScreen.C0;
            yy7[] yy7VarArr = CallScreen.O0;
            ((on1) bbdVar2.D(callScreen, yy7VarArr[6])).B(rt1Var);
            if (rt1Var.g) {
                c54 c54VarB = k8j.b(callScreen.D0().a);
                CallEventsWidget callEventsWidget = c54VarB instanceof CallEventsWidget ? (CallEventsWidget) c54VarB : null;
                if (callEventsWidget != null) {
                    callEventsWidget.getRouter().B(callEventsWidget);
                    i00 i00Var = callEventsWidget.a;
                    if (i00Var != null) {
                        CallScreen callScreen2 = (CallScreen) i00Var.b;
                        callScreen2.F0().a.remove((CallEventsWidget) i00Var.c);
                        callScreen2.D0().a();
                    }
                    callEventsWidget.a = null;
                }
            } else if (k8j.b(callScreen.D0().a) != null) {
                c54 c54VarB2 = k8j.b(callScreen.D0().a);
                CallEventsWidget callEventsWidget2 = c54VarB2 instanceof CallEventsWidget ? (CallEventsWidget) c54VarB2 : null;
                if (callEventsWidget2 != null) {
                    callScreen.A0(callEventsWidget2);
                }
            } else {
                ((FrameLayout) bbdVar.D(callScreen, yy7VarArr[7])).setVisibility(0);
                ((FrameLayout) bbdVar.D(callScreen, yy7VarArr[7])).setTranslationY(0.0f);
                c83 c83VarD0 = callScreen.D0();
                ytd ytdVar = c83VarD0.a;
                if (!fni.a(c83VarD0.b(), "call_events_widget_tag")) {
                    ytdVar.R(false);
                    CallEventsWidget callEventsWidget3 = new CallEventsWidget(callScreen.s0, null);
                    callScreen.A0(callEventsWidget3);
                    bud budVarA = l8j.a(callEventsWidget3, null, null);
                    budVarA.d("call_events_widget_tag");
                    ytdVar.S(budVarA);
                }
            }
        }
        return qqg.a;
    }
}
