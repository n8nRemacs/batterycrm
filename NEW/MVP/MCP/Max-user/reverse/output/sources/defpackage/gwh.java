package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* loaded from: classes2.dex */
public final class gwh extends dtf implements sm6 {
    public final /* synthetic */ WebAppSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwh(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.X = webAppSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gwh gwhVar = (gwh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gwhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gwh gwhVar = new gwh(continuation, this.X);
        gwhVar.o = obj;
        return gwhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        yy7[] yy7VarArr = WebAppSettingsScreen.Z;
        boolean z = cdaVar instanceof jc3;
        WebAppSettingsScreen webAppSettingsScreen = this.X;
        if (z) {
            webAppSettingsScreen.getRouter().C();
        } else if (cdaVar instanceof ei4) {
            qsh.c.s0((ei4) cdaVar);
        } else if (cdaVar instanceof jwh) {
            webAppSettingsScreen.getRouter().C();
            qsh.c.s0(((jwh) cdaVar).b);
        }
        return qqg.a;
    }
}
