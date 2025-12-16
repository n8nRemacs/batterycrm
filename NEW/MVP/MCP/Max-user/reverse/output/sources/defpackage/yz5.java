package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class yz5 implements c91 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.c91
    public final void onCallParticipantFingerprint(yi1 yi1Var, long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c91) it.next()).onCallParticipantFingerprint(yi1Var, j);
        }
    }
}
