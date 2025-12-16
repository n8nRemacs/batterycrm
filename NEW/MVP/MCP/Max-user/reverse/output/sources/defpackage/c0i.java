package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppsSettingScreen;

/* loaded from: classes2.dex */
public final class c0i extends dtf implements sm6 {
    public final /* synthetic */ WebAppsSettingScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0i(Continuation continuation, WebAppsSettingScreen webAppsSettingScreen) {
        super(2, continuation);
        this.X = webAppsSettingScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        c0i c0iVar = (c0i) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        c0iVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        c0i c0iVar = new c0i(continuation, this.X);
        c0iVar.o = obj;
        return c0iVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.d.E((List) this.o);
        return qqg.a;
    }
}
