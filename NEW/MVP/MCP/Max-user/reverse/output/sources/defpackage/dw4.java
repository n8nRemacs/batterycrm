package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;

/* loaded from: classes2.dex */
public final class dw4 extends dtf implements sm6 {
    public final /* synthetic */ DialogNotificationsSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw4(Continuation continuation, DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen) {
        super(2, continuation);
        this.X = dialogNotificationsSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dw4 dw4Var = (dw4) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dw4Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dw4 dw4Var = new dw4(continuation, this.X);
        dw4Var.o = obj;
        return dw4Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.c.E((List) this.o);
        return qqg.a;
    }
}
