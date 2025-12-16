package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class ml1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ml1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        ViewParent parent2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                CallScreen callScreen = (CallScreen) obj;
                rha rhaVar = CallScreen.N0;
                if (motionEvent == null) {
                    return false;
                }
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
                    if (motionEvent.getAction() != 1 || eventTime >= ViewConfiguration.getTapTimeout() || !callScreen.H0().t(callScreen.F0().g)) {
                        return false;
                    }
                    CallScreen.z0(callScreen);
                }
                return true;
            case 1:
                View view2 = ((x14) obj).a;
                int action = motionEvent.getAction();
                if ((action == 0 || action == 2) && (parent = view2.getParent()) != null && (parent2 = parent.getParent()) != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                return view2.onTouchEvent(motionEvent);
            case 2:
                d65 d65Var = (d65) obj;
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - d65Var.o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        d65Var.m = false;
                    }
                    d65Var.u();
                    d65Var.m = true;
                    d65Var.o = System.currentTimeMillis();
                }
                return false;
            case 3:
                yy7[] yy7VarArr = MessageWriteWidget.L0;
                tcf tcfVar = ((MessageWriteWidget) obj).I0().S0;
                tcfVar.m(null, new tn9(tdd.a, motionEvent));
                tcfVar.setValue(null);
                return true;
            case 4:
                return ((Boolean) ((sm6) obj).invoke(view, motionEvent)).booleanValue();
            case 5:
                ((em6) obj).invoke(motionEvent);
                return true;
            default:
                VideoWebViewScreen videoWebViewScreen = (VideoWebViewScreen) obj;
                yy7[] yy7VarArr2 = VideoWebViewScreen.H0;
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
                    videoWebViewScreen.K0(true);
                    videoWebViewScreen.S0();
                }
                return false;
        }
    }
}
