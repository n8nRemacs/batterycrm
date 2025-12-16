package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import s41.C47998a;

/* compiled from: ScheduledDirectTask.java */
/* loaded from: classes8.dex */
public final class m extends a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.util.concurrent.Callable
    public final Void call() {
        FutureTask<Void> futureTask = a.f404663e;
        this.f404667d = Thread.currentThread();
        try {
            try {
                this.f404665b.run();
                return null;
            } finally {
                lazySet(futureTask);
                this.f404667d = null;
            }
        } catch (Throwable th2) {
            C47998a.b(th2);
            throw th2;
        }
    }
}
