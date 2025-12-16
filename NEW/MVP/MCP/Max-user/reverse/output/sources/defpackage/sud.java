package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class sud implements fl1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.fl1
    public final void onRtcStats(a7d a7dVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fl1) it.next()).onRtcStats(a7dVar);
        }
    }
}
