package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class j51 implements i51 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.i51
    public final void onDecorativeParticipantIdChanged(h51 h51Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((i51) it.next()).onDecorativeParticipantIdChanged(h51Var);
        }
    }
}
