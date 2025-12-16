package defpackage;

import bolts.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g2g implements p44 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ o2g c;

    public /* synthetic */ g2g(AtomicBoolean atomicBoolean, o2g o2gVar, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = o2gVar;
    }

    @Override // defpackage.p44
    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                if (!this.b.compareAndSet(false, true)) {
                    task.getError();
                    break;
                } else {
                    this.c.c(task);
                    break;
                }
            default:
                if (!this.b.compareAndSet(false, true)) {
                    task.getError();
                    break;
                } else {
                    this.c.c(task);
                    break;
                }
        }
        return null;
    }
}
