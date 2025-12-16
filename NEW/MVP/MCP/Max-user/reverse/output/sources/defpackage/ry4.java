package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class ry4 implements sy4 {
    public final ScheduledFuture a;

    public ry4(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.sy4
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
