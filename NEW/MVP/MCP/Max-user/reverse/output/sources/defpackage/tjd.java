package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class tjd extends dtf implements sm6 {
    public final /* synthetic */ RegistrationNeuroAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjd(Continuation continuation, RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen) {
        super(2, continuation);
        this.X = registrationNeuroAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tjd tjdVar = (tjd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tjdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tjd tjdVar = new tjd(continuation, this.X);
        tjdVar.o = obj;
        return tjdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        vc0 vc0Var = (vc0) this.o;
        boolean zA = fni.a(vc0Var, sc0.a);
        RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.X;
        if (zA) {
            yy7[] yy7VarArr = RegistrationNeuroAvatarsScreen.D0;
            ((qsb) registrationNeuroAvatarsScreen.w0.getValue()).k(new s2i(registrationNeuroAvatarsScreen, 1));
        } else if (vc0Var instanceof tc0) {
            try {
                registrationNeuroAvatarsScreen.startActivityForResult(((tc0) vc0Var).a, 555);
                gda.g((gda) registrationNeuroAvatarsScreen.x0.getValue(), f1e.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                wqi.e(RegistrationNeuroAvatarsScreen.class.getName(), "failed open camera", null);
                registrationNeuroAvatarsScreen.A0().b.b();
            }
        } else {
            if (!(vc0Var instanceof uc0)) {
                throw new NoWhenBranchMatchedException();
            }
            uc0 uc0Var = (uc0) vc0Var;
            c39.c.L0(uc0Var.a, uc0Var.b);
        }
        return qqg.a;
    }
}
