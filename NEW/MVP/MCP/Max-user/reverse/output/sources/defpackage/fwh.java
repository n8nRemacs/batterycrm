package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* loaded from: classes2.dex */
public final class fwh extends dtf implements sm6 {
    public final /* synthetic */ WebAppSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwh(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.X = webAppSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fwh fwhVar = (fwh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fwhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fwh fwhVar = new fwh(continuation, this.X);
        fwhVar.o = obj;
        return fwhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        iwh iwhVar = (iwh) this.o;
        WebAppSettingsScreen webAppSettingsScreen = this.X;
        if (iwhVar == null) {
            yy7[] yy7VarArr = WebAppSettingsScreen.Z;
            webAppSettingsScreen.getClass();
            throw new NoWhenBranchMatchedException();
        }
        goh gohVar = webAppSettingsScreen.X;
        if (gohVar != null) {
            gohVar.b(iwhVar.b, iwhVar.a, null);
        }
        return qqg.a;
    }
}
