package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes.dex */
public final class bq7 extends AbstractOwnableSynchronizer implements Runnable {
    public final fjg a;

    public bq7(fjg fjgVar) {
        this.a = fjgVar;
    }

    public static void a(bq7 bq7Var, Thread thread) {
        bq7Var.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.a.toString();
    }
}
