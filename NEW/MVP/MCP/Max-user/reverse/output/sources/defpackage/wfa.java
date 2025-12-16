package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class wfa extends dtf implements sm6 {
    public final /* synthetic */ NeuroAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfa(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.X = neuroAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wfa wfaVar = (wfa) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wfaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wfa wfaVar = new wfa(continuation, this.X);
        wfaVar.o = obj;
        return wfaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Integer numN;
        Integer numN2;
        NeuroAvatarsScreen neuroAvatarsScreen = this.X;
        lwf lwfVar = neuroAvatarsScreen.a;
        g8j.b(obj);
        Object obj2 = this.o;
        if (obj2 instanceof mh8) {
            s5g s5gVar = ((mh8) obj2).c;
            lwfVar.getClass();
            CharSequence charSequenceB = s5gVar.b(neuroAvatarsScreen.getContext());
            if (charSequenceB != null) {
                ccb ccbVar = new ccb(neuroAvatarsScreen);
                ccbVar.h(charSequenceB);
                ccbVar.b(null);
                View view = neuroAvatarsScreen.getView();
                ccbVar.c(new kcb(1, (view == null || (numN2 = dqi.n(view)) == null) ? 0 : numN2.intValue(), 0, 4));
                ccbVar.i();
            }
        } else if (obj2 instanceof nh8) {
            nh8 nh8Var = (nh8) obj2;
            int i = nh8Var.e;
            yy7[] yy7VarArr = NeuroAvatarsScreen.K0;
            if (neuroAvatarsScreen.A0() != null) {
                ((q70) neuroAvatarsScreen.d.getValue()).a(new p70(i));
            }
            s5g s5gVar2 = nh8Var.c;
            s5g s5gVar3 = nh8Var.d;
            lwfVar.getClass();
            CharSequence charSequenceB2 = s5gVar2.b(neuroAvatarsScreen.getContext());
            if (charSequenceB2 != null) {
                CharSequence charSequenceB3 = s5gVar3.b(neuroAvatarsScreen.getContext());
                ccb ccbVar2 = new ccb(neuroAvatarsScreen);
                ccbVar2.h(charSequenceB2);
                ccbVar2.b(charSequenceB3);
                View view2 = neuroAvatarsScreen.getView();
                ccbVar2.c(new kcb(1, (view2 == null || (numN = dqi.n(view2)) == null) ? 0 : numN.intValue(), 0, 4));
                ccbVar2.i();
            }
        }
        yy7[] yy7VarArr2 = NeuroAvatarsScreen.K0;
        OneMeButton oneMeButton = (OneMeButton) neuroAvatarsScreen.u0.D(neuroAvatarsScreen, NeuroAvatarsScreen.K0[6]);
        oneMeButton.setProgressEnabled(false);
        oneMeButton.setClickable(true);
        return qqg.a;
    }
}
