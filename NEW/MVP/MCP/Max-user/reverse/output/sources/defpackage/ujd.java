package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class ujd extends dtf implements sm6 {
    public final /* synthetic */ RegistrationNeuroAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujd(Continuation continuation, RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen) {
        super(2, continuation);
        this.X = registrationNeuroAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ujd ujdVar = (ujd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ujdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ujd ujdVar = new ujd(continuation, this.X);
        ujdVar.o = obj;
        return ujdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Integer numN;
        Integer numN2;
        RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.X;
        lwf lwfVar = registrationNeuroAvatarsScreen.a;
        g8j.b(obj);
        Object obj2 = this.o;
        if (obj2 instanceof mh8) {
            s5g s5gVar = ((mh8) obj2).c;
            lwfVar.getClass();
            CharSequence charSequenceB = s5gVar.b(registrationNeuroAvatarsScreen.getContext());
            if (charSequenceB != null) {
                ccb ccbVar = new ccb(registrationNeuroAvatarsScreen);
                ccbVar.h(charSequenceB);
                ccbVar.b(null);
                View view = registrationNeuroAvatarsScreen.getView();
                ccbVar.c(new kcb(1, (view == null || (numN2 = dqi.n(view)) == null) ? 0 : numN2.intValue(), 0, 4));
                ccbVar.i();
            }
        } else if (obj2 instanceof nh8) {
            nh8 nh8Var = (nh8) obj2;
            int i = nh8Var.e;
            yy7[] yy7VarArr = RegistrationNeuroAvatarsScreen.D0;
            if (registrationNeuroAvatarsScreen.z0() != null) {
                ((q70) registrationNeuroAvatarsScreen.o.getValue()).a(new p70(i));
            }
            s5g s5gVar2 = nh8Var.c;
            s5g s5gVar3 = nh8Var.d;
            lwfVar.getClass();
            CharSequence charSequenceB2 = s5gVar2.b(registrationNeuroAvatarsScreen.getContext());
            if (charSequenceB2 != null) {
                CharSequence charSequenceB3 = s5gVar3.b(registrationNeuroAvatarsScreen.getContext());
                ccb ccbVar2 = new ccb(registrationNeuroAvatarsScreen);
                ccbVar2.h(charSequenceB2);
                ccbVar2.b(charSequenceB3);
                View view2 = registrationNeuroAvatarsScreen.getView();
                ccbVar2.c(new kcb(1, (view2 == null || (numN = dqi.n(view2)) == null) ? 0 : numN.intValue(), 0, 4));
                ccbVar2.i();
            }
        }
        yy7[] yy7VarArr2 = RegistrationNeuroAvatarsScreen.D0;
        registrationNeuroAvatarsScreen.B0(false);
        return qqg.a;
    }
}
