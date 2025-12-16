package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* loaded from: classes2.dex */
public final class voa extends dtf implements sm6 {
    public final /* synthetic */ NotificationsSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voa(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.X = notificationsSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        voa voaVar = (voa) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        voaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        voa voaVar = new voa(continuation, this.X);
        voaVar.o = obj;
        return voaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof ei4;
        qqg qqgVar = qqg.a;
        if (z) {
            gna.c.s0((ei4) cdaVar);
            return qqgVar;
        }
        if (cdaVar instanceof qoa) {
            String str = ap7.a;
            Context context = this.X.getContext();
            try {
                context.startActivity(ap7.d(context));
                ipdVar = qqgVar;
            } catch (Throwable th) {
                ipdVar = new ipd(th);
            }
            Throwable thA = kpd.a(ipdVar);
            if (thA != null) {
                wqi.e(ap7.a, "openNotificationsSettings: failed", thA);
            }
        }
        return qqgVar;
    }
}
