package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class rjd extends dtf implements sm6 {
    public final /* synthetic */ RegistrationNeuroAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjd(Continuation continuation, RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen) {
        super(2, continuation);
        this.X = registrationNeuroAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rjd rjdVar = (rjd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rjdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rjd rjdVar = new rjd(continuation, this.X);
        rjdVar.o = obj;
        return rjdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        Object objI = ue3.I((List) this.o);
        zea zeaVar = objI instanceof zea ? (zea) objI : null;
        if (zeaVar != null) {
            RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.X;
            if (registrationNeuroAvatarsScreen.getView() != null) {
                ((uxa) registrationNeuroAvatarsScreen.Z.D(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.D0[2])).setAvatarUrl(zeaVar.b);
            }
        }
        return qqg.a;
    }
}
