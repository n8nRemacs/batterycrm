package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;

/* loaded from: classes.dex */
public final class ul1 extends dtf implements sm6 {
    public final /* synthetic */ CallScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.X = callScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ul1 ul1Var = (ul1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ul1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ul1 ul1Var = new ul1(continuation, this.X);
        ul1Var.o = obj;
        return ul1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        CallWaitingRoomEventsWidget callWaitingRoomEventsWidget;
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        rha rhaVar = CallScreen.N0;
        CallScreen callScreen = this.X;
        if (!zBooleanValue) {
            c54 c54VarB = k8j.b(callScreen.E0().a);
            callWaitingRoomEventsWidget = c54VarB instanceof CallWaitingRoomEventsWidget ? (CallWaitingRoomEventsWidget) c54VarB : null;
            if (callWaitingRoomEventsWidget != null) {
                CallWaitingRoomEventsWidget.B0(callWaitingRoomEventsWidget);
            }
        } else if (k8j.b(callScreen.E0().a) != null) {
            c54 c54VarB2 = k8j.b(callScreen.E0().a);
            callWaitingRoomEventsWidget = c54VarB2 instanceof CallWaitingRoomEventsWidget ? (CallWaitingRoomEventsWidget) c54VarB2 : null;
            if (callWaitingRoomEventsWidget != null) {
                callScreen.B0(callWaitingRoomEventsWidget);
            }
        } else {
            c83 c83VarE0 = callScreen.E0();
            ytd ytdVar = c83VarE0.a;
            if (!fni.a(c83VarE0.b(), "call_waiting_room_widget_tag")) {
                ytdVar.R(false);
                CallWaitingRoomEventsWidget callWaitingRoomEventsWidget2 = new CallWaitingRoomEventsWidget(callScreen.s0, null);
                callScreen.B0(callWaitingRoomEventsWidget2);
                bud budVarA = l8j.a(callWaitingRoomEventsWidget2, null, null);
                budVarA.d("call_waiting_room_widget_tag");
                ytdVar.S(budVarA);
            }
        }
        return qqg.a;
    }
}
