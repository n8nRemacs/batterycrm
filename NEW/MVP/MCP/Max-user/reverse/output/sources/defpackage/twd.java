package defpackage;

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
public final class twd implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ twd(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    break;
                } catch (Exception e) {
                    iri.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.b.run();
                break;
            case 2:
                this.b.run();
                break;
            case 3:
                Process.setThreadPriority(0);
                this.b.run();
                break;
            case 4:
                Deque deque = (Deque) p1a.b.get();
                s5j.g(deque);
                Runnable runnable = this.b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                p1a.b.set(new ArrayDeque());
                this.b.run();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
