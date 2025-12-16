package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* loaded from: classes2.dex */
public final class ewh extends dtf implements sm6 {
    public final /* synthetic */ WebAppSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewh(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.X = webAppSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ewh ewhVar = (ewh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ewhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ewh ewhVar = new ewh(continuation, this.X);
        ewhVar.o = obj;
        return ewhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        kwh kwhVar = (kwh) this.o;
        WebAppSettingsScreen webAppSettingsScreen = this.X;
        webAppSettingsScreen.Y.E(kwhVar.b);
        ((yfb) webAppSettingsScreen.o.D(webAppSettingsScreen, WebAppSettingsScreen.Z[2])).setTitle(kwhVar.a);
        return qqg.a;
    }
}
