package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class rwg implements fs1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.fs1
    public final void onUrlSharingInfoUpdated(es1 es1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fs1) it.next()).onUrlSharingInfoUpdated(es1Var);
        }
    }
}
