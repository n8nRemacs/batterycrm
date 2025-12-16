package defpackage;

import android.widget.TextView;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class if1 extends dtf implements sm6 {
    public final /* synthetic */ CallLinkInfoScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if1(Continuation continuation, CallLinkInfoScreen callLinkInfoScreen) {
        super(2, continuation);
        this.X = callLinkInfoScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        if1 if1Var = (if1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        if1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        if1 if1Var = new if1(continuation, this.X);
        if1Var.o = obj;
        return if1Var;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cf1 cf1Var = (cf1) this.o;
        b6a b6aVar = CallLinkInfoScreen.A0;
        CallLinkInfoScreen callLinkInfoScreen = this.X;
        bbd bbdVar = callLinkInfoScreen.t0;
        yy7[] yy7VarArr = CallLinkInfoScreen.B0;
        TextView textView = (TextView) bbdVar.D(callLinkInfoScreen, yy7VarArr[3]);
        s5g s5gVar = cf1Var.e;
        xe1 xe1Var = cf1Var.g;
        bf1 bf1Var = cf1Var.d;
        mc0 mc0Var = cf1Var.a;
        ofb ofbVar = cf1Var.j;
        textView.setText(s5gVar.b(callLinkInfoScreen.getContext()));
        callLinkInfoScreen.y0.E(cf1Var.f);
        yfb yfbVarA0 = callLinkInfoScreen.A0();
        CharSequence charSequenceB = cf1Var.e.b(callLinkInfoScreen.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        yfbVarA0.setTitle(charSequenceB);
        if (!fni.a(callLinkInfoScreen.A0().getRightActions(), ofbVar)) {
            callLinkInfoScreen.A0().setRightActions(ofbVar);
        }
        uxa uxaVar = (uxa) callLinkInfoScreen.w0.D(callLinkInfoScreen, yy7VarArr[6]);
        int i = uxa.K0;
        int i2 = 1;
        uxaVar.l(mc0Var, true);
        uxaVar.setAvatarUrl(null);
        if (mc0Var == null) {
            uxaVar.setCustomPlaceholder((be0) callLinkInfoScreen.d.getValue());
            uxaVar.setCustomOverlay(null);
        } else {
            uxaVar.setCustomPlaceholder(null);
            uxaVar.setCustomOverlay((yd0) callLinkInfoScreen.o.getValue());
        }
        TextView textView2 = (TextView) callLinkInfoScreen.u0.D(callLinkInfoScreen, yy7VarArr[4]);
        if (bf1Var instanceof af1) {
            kgh kghVar = callLinkInfoScreen.x0;
            if (kghVar != null) {
                ArrayList arrayList = jgh.a;
                textView2.removeTextChangedListener(kghVar);
                textView2.removeOnAttachStateChangeListener(kghVar);
                yta ytaVar = textView2 instanceof yta ? (yta) textView2 : null;
                if (ytaVar != null) {
                    ytaVar.setObserverSpanListener(null);
                }
            }
            textView2.setMaxLines(1);
            textView2.setOnLongClickListener(new bn0(i2, callLinkInfoScreen));
        } else {
            if (callLinkInfoScreen.x0 == null) {
                callLinkInfoScreen.x0 = jgh.a(textView2);
            }
            textView2.setMaxLines(Integer.MAX_VALUE);
            textView2.setOnLongClickListener(new df1());
        }
        f8j.d(textView2, 300L, new ub(cf1Var, 5, callLinkInfoScreen));
        if (!textView2.isLaidOut() || textView2.isLayoutRequested()) {
            textView2.addOnLayoutChangeListener(new jf1(textView2, callLinkInfoScreen, cf1Var, i));
        } else {
            textView2.setText(CallLinkInfoScreen.y0(callLinkInfoScreen, bf1Var.getText().b(textView2.getContext()), textView2, textView2.getRootView().getWidth()));
        }
        OneMeButton oneMeButton = (OneMeButton) callLinkInfoScreen.v0.D(callLinkInfoScreen, yy7VarArr[5]);
        oneMeButton.setVisibility(xe1Var == null ? 8 : 0);
        if (xe1Var != null) {
            oneMeButton.setMode(xe1Var.a());
            oneMeButton.setText(xe1Var.getTitle().b(oneMeButton.getContext()));
            f8j.d(oneMeButton, 300L, new ub(callLinkInfoScreen, 6, xe1Var));
        }
        return qqg.a;
    }
}
