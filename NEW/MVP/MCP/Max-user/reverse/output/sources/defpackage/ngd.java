package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class ngd implements yk1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.yk1
    public final void onRecordStarted(wk1 wk1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yk1) it.next()).onRecordStarted(wk1Var);
        }
    }

    @Override // defpackage.yk1
    public final void onRecordStopped(xk1 xk1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yk1) it.next()).onRecordStopped(xk1Var);
        }
    }
}
