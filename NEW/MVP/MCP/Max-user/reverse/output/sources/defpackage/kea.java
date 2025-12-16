package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class kea implements vg1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.vg1
    public final void onCallParticipantNetworkStatusChanged(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vg1) it.next()).onCallParticipantNetworkStatusChanged(list);
        }
    }
}
