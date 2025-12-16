package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class pt implements n21 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.n21
    public final void onAsrRecordStarted(l21 l21Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((n21) it.next()).onAsrRecordStarted(l21Var);
        }
    }

    @Override // defpackage.n21
    public final void onAsrRecordStopped(m21 m21Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((n21) it.next()).onAsrRecordStopped(m21Var);
        }
    }
}
