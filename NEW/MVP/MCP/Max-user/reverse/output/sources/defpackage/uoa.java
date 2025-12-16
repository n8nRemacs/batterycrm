package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* loaded from: classes2.dex */
public final class uoa extends dtf implements sm6 {
    public final /* synthetic */ NotificationsSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uoa(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.X = notificationsSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        uoa uoaVar = (uoa) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uoaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uoa uoaVar = new uoa(continuation, this.X);
        uoaVar.o = obj;
        return uoaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.o.E((List) this.o);
        return qqg.a;
    }
}
