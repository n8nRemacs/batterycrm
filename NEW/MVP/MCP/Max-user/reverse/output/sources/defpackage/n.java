package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.aboutappsettings.AboutAppSettingsScreen;

/* loaded from: classes.dex */
public final class n extends dtf implements sm6 {
    public final /* synthetic */ AboutAppSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Continuation continuation, AboutAppSettingsScreen aboutAppSettingsScreen) {
        super(2, continuation);
        this.X = aboutAppSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        n nVar = new n(continuation, this.X);
        nVar.o = obj;
        return nVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.b.E((List) this.o);
        return qqg.a;
    }
}
