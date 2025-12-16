package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class s7 implements u01 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.u01
    public final void onActiveParticipantUpdated(t01 t01Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((u01) it.next()).onActiveParticipantUpdated(t01Var);
        }
    }

    @Override // defpackage.u01
    public final void onActiveParticipantsAdded(p01 p01Var) {
        if (p01Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((u01) it.next()).onActiveParticipantsAdded(p01Var);
        }
    }

    @Override // defpackage.u01
    public final void onActiveParticipantsChanged(q01 q01Var) {
        if (q01Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((u01) it.next()).onActiveParticipantsChanged(q01Var);
        }
    }

    @Override // defpackage.u01
    public final void onActiveParticipantsDeAnonimized(r01 r01Var) {
        if (r01Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((u01) it.next()).onActiveParticipantsDeAnonimized(r01Var);
        }
    }

    @Override // defpackage.u01
    public final void onActiveParticipantsRemoved(s01 s01Var) {
        if (s01Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((u01) it.next()).onActiveParticipantsRemoved(s01Var);
        }
    }
}
