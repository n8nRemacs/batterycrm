package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qgg extends j0e {
    public static final qgg c = new qgg();

    @Override // defpackage.j0e
    public final h0e a() {
        return new pgg();
    }

    @Override // defpackage.j0e
    public final py4 b(Runnable runnable) {
        runnable.run();
        return cd5.a;
    }

    @Override // defpackage.j0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) throws InterruptedException {
        try {
            timeUnit.sleep(j);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            t8j.a(e);
        }
        return cd5.a;
    }
}
