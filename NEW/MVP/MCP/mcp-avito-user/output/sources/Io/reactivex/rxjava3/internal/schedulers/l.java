package io.reactivex.rxjava3.internal.schedulers;

import s41.C47998a;

/* compiled from: ScheduledDirectPeriodicTask.java */
/* loaded from: classes8.dex */
public final class l extends a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.lang.Runnable
    public final void run() {
        this.f404667d = Thread.currentThread();
        try {
            this.f404665b.run();
            this.f404667d = null;
        } catch (Throwable th2) {
            dispose();
            this.f404667d = null;
            C47998a.b(th2);
            throw th2;
        }
    }
}
