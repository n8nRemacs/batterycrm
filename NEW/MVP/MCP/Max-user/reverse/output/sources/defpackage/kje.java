package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class kje implements jp1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.jp1
    public final void onCurrentParticipantActiveRoomChanged(fp1 fp1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jp1) it.next()).onCurrentParticipantActiveRoomChanged(fp1Var);
        }
    }

    @Override // defpackage.jp1
    public final void onCurrentParticipantInvitedToRoom(gp1 gp1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jp1) it.next()).onCurrentParticipantInvitedToRoom(gp1Var);
        }
    }

    @Override // defpackage.jp1
    public final void onRoomRemoved(hp1 hp1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jp1) it.next()).onRoomRemoved(hp1Var);
        }
    }

    @Override // defpackage.jp1
    public final void onRoomUpdated(ip1 ip1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jp1) it.next()).onRoomUpdated(ip1Var);
        }
    }
}
