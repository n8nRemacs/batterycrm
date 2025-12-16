package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;

/* loaded from: classes2.dex */
public final class rjb extends dtf implements sm6 {
    public final /* synthetic */ OtherNotificationsSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjb(Continuation continuation, OtherNotificationsSettingsScreen otherNotificationsSettingsScreen) {
        super(2, continuation);
        this.X = otherNotificationsSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rjb rjbVar = (rjb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rjbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rjb rjbVar = new rjb(continuation, this.X);
        rjbVar.o = obj;
        return rjbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.c.E((List) this.o);
        return qqg.a;
    }
}
