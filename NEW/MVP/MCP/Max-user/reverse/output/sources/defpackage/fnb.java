package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class fnb implements cj1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.cj1
    public final void onStateChanged(ti1 ti1Var, vi1 vi1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cj1) it.next()).onStateChanged(ti1Var, vi1Var);
        }
    }
}
