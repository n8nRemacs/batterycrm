package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class y32 implements z32 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ y32(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.z32
    public final void b(Throwable th) {
        switch (this.a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.b).cancel(false);
                    break;
                }
                break;
            case 1:
                ((em6) this.b).invoke(th);
                break;
            default:
                ((sy4) this.b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((em6) this.b).getClass().getSimpleName() + '@' + zg4.a(this) + ']';
            default:
                return "DisposeOnCancel[" + ((sy4) this.b) + ']';
        }
    }
}
