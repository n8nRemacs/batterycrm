package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ht4 extends k4 implements ScheduledFuture {
    public final ScheduledFuture Z;

    public ht4(gt4 gt4Var) {
        this.Z = gt4Var.b(new iv6(15, this));
    }

    @Override // defpackage.k4
    public final void c() {
        ScheduledFuture scheduledFuture = this.Z;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof e4) && ((e4) obj).a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.Z.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.Z.getDelay(timeUnit);
    }
}
