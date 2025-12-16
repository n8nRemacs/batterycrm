package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class vfa extends dtf implements sm6 {
    public final /* synthetic */ NeuroAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfa(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.X = neuroAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vfa vfaVar = (vfa) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vfaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vfa vfaVar = new vfa(continuation, this.X);
        vfaVar.o = obj;
        return vfaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        vc0 vc0Var = (vc0) this.o;
        boolean zA = fni.a(vc0Var, sc0.a);
        NeuroAvatarsScreen neuroAvatarsScreen = this.X;
        if (zA) {
            yy7[] yy7VarArr = NeuroAvatarsScreen.K0;
            ((qsb) neuroAvatarsScreen.x0.getValue()).k(new s2i(neuroAvatarsScreen, 1));
        } else if (vc0Var instanceof tc0) {
            try {
                neuroAvatarsScreen.startActivityForResult(((tc0) vc0Var).a, 555);
                gda.g((gda) neuroAvatarsScreen.y0.getValue(), f1e.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                wqi.e(NeuroAvatarsScreen.class.getName(), "failed open camera", null);
                neuroAvatarsScreen.C0().b.b();
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
