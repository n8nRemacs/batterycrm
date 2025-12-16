package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class sjd extends dtf implements sm6 {
    public final /* synthetic */ RegistrationNeuroAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjd(Continuation continuation, RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen) {
        super(2, continuation);
        this.X = registrationNeuroAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sjd sjdVar = (sjd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sjdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sjd sjdVar = new sjd(continuation, this.X);
        sjdVar.o = obj;
        return sjdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xbe xbeVar = ((ybe) this.o).a;
        boolean z = xbeVar != null;
        boolean z2 = xbeVar instanceof vbe;
        RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.X;
        bbd bbdVar = registrationNeuroAvatarsScreen.v0;
        yy7[] yy7VarArr = RegistrationNeuroAvatarsScreen.D0;
        ((TextView) bbdVar.D(registrationNeuroAvatarsScreen, yy7VarArr[6])).setText((!z || z2) ? t3d.oneme_registration_neuro_avatars_choose_photo : t3d.oneme_registration_neuro_avatars_change_photo);
        qf qfVar = (qf) registrationNeuroAvatarsScreen.s0.D(registrationNeuroAvatarsScreen, yy7VarArr[3]);
        qfVar.c = true;
        qfVar.setEnabled(z);
        return qqg.a;
    }
}
