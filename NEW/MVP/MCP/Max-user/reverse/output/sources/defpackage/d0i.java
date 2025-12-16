package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppsSettingScreen;

/* loaded from: classes2.dex */
public final class d0i extends dtf implements sm6 {
    public final /* synthetic */ WebAppsSettingScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0i(Continuation continuation, WebAppsSettingScreen webAppsSettingScreen) {
        super(2, continuation);
        this.X = webAppsSettingScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        d0i d0iVar = (d0i) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        d0iVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        d0i d0iVar = new d0i(continuation, this.X);
        d0iVar.o = obj;
        return d0iVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        yy7[] yy7VarArr = WebAppsSettingScreen.o;
        if (cdaVar instanceof jc3) {
            this.X.getRouter().C();
        } else if (cdaVar instanceof ei4) {
            qsh.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
