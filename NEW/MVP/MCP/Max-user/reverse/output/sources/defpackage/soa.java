package defpackage;

import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* loaded from: classes2.dex */
public final class soa extends dtf implements sm6 {
    public final /* synthetic */ NotificationsSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public soa(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.X = notificationsSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        soa soaVar = (soa) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        soaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        soa soaVar = new soa(continuation, this.X);
        soaVar.o = obj;
        return soaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (((Boolean) this.o).booleanValue()) {
            NotificationsSettingsScreen notificationsSettingsScreen = this.X;
            qsb qsbVar = (qsb) notificationsSettingsScreen.d.getValue();
            s2i s2iVar = new s2i(notificationsSettingsScreen, 1);
            String[] strArr = qsb.d;
            qsbVar.h(s2iVar, false);
        }
        return qqg.a;
    }
}
