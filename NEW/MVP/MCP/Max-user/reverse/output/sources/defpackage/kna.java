package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.services.NotificationTamService;

/* loaded from: classes2.dex */
public final class kna extends dtf implements sm6 {
    public final /* synthetic */ NotificationTamService X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kna(NotificationTamService notificationTamService, long j, Continuation continuation) {
        super(2, continuation);
        this.X = notificationTamService;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kna) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kna(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            iw9 iw9Var = (iw9) this.X.t0.getValue();
            this.o = 1;
            yw9 yw9Var = (yw9) iw9Var;
            Object objB = oxi.b(yw9Var.m, yw9Var, new rw9(-1L, yw9Var, this.Y, null), this);
            g84 g84Var = g84.a;
            if (objB != g84Var) {
                objB = qqgVar;
            }
            if (objB == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqgVar;
    }
}
