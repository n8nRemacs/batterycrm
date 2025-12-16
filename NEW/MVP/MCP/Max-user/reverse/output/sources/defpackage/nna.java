package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.services.NotificationTamService;

/* loaded from: classes2.dex */
public final class nna extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ NotificationTamService o;
    public final /* synthetic */ boolean s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ String u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nna(NotificationTamService notificationTamService, long j, long j2, long j3, boolean z, long j4, String str, Continuation continuation) {
        super(2, continuation);
        this.o = notificationTamService;
        this.X = j;
        this.Y = j2;
        this.Z = j3;
        this.s0 = z;
        this.t0 = j4;
        this.u0 = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nna nnaVar = (nna) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nnaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nna(this.o, this.X, this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        NotificationTamService notificationTamService = this.o;
        abd abdVar = (abd) notificationTamService.Z.getValue();
        abdVar.getClass();
        long j = this.X;
        abd.e(abdVar, j, this.Y, this.Z, false, false, this.s0, 88);
        ((y7b) abdVar.b.getValue()).a(j);
        rpa rpaVarE = ((qpa) notificationTamService.s0.getValue()).e();
        rpaVarE.getClass();
        String str = rpa.d;
        long j2 = this.t0;
        String str2 = this.u0;
        wqi.c(str, a9h.e("onNotificationMarkAsRead: pushId=", j2, ", eventKey=", str2), new Object[0]);
        if (str2 != null) {
            try {
                rpaVarE.b().b("Action", ori.a(new imb("trid", Long.valueOf(j2)), new imb("eKey", str2), new imb("p_op", "m_as_read")));
            } catch (Exception e) {
                wqi.b(str, "onNotificationMarkAsRead: failed", e);
                ((y3b) rpaVarE.c()).a(new il4("failed to log mark as read", e));
            }
        }
        return qqg.a;
    }
}
