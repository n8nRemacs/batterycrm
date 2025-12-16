package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* loaded from: classes2.dex */
public final class epe extends dtf implements sm6 {
    public final /* synthetic */ SettingsListScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epe(Continuation continuation, SettingsListScreen settingsListScreen) {
        super(2, continuation);
        this.X = settingsListScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        epe epeVar = (epe) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        epeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        epe epeVar = new epe(continuation, this.X);
        epeVar.o = obj;
        return epeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.y0.E((List) this.o);
        return qqg.a;
    }
}
