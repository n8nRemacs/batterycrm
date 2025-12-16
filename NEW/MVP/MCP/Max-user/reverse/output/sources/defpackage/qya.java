package defpackage;

import android.app.Activity;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.appupdate.forceupdate.ForceUpdateScreen;

/* loaded from: classes.dex */
public final class qya extends dtf implements sm6 {
    public final /* synthetic */ rya o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qya(rya ryaVar, Continuation continuation) {
        super(2, continuation);
        this.o = ryaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qya qyaVar = (qya) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qyaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qya(this.o, continuation);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        Activity activityD = ((RootController) ((b3b) this.o.f.getValue()).f()).G0().d();
        MainActivity mainActivity = activityD instanceof MainActivity ? (MainActivity) activityD : null;
        qqg qqgVar = qqg.a;
        if (mainActivity != null) {
            RootController rootControllerC = j8j.c(mainActivity);
            if (!(rootControllerC.w() instanceof ForceUpdateScreen)) {
                p67 p67Var = rootControllerC.G0().e().isEmpty() ? null : new p67(0);
                rootControllerC.G0().S(l8j.a(new ForceUpdateScreen(), p67Var, p67Var));
                return qqgVar;
            }
        }
        return qqgVar;
    }
}
