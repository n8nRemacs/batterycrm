package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class sjh implements ku1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.ku1
    public final void onAttendee(ut1 ut1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ku1) it.next()).onAttendee(ut1Var);
        }
    }

    @Override // defpackage.ku1
    public final void onFeedback(vt1 vt1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ku1) it.next()).onFeedback(vt1Var);
        }
    }

    @Override // defpackage.ku1
    public final void onHandUp(wt1 wt1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ku1) it.next()).onHandUp(wt1Var);
        }
    }

    @Override // defpackage.ku1
    public final void onMeInWaitingRoomChanged(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ku1) it.next()).onMeInWaitingRoomChanged(z);
        }
    }

    @Override // defpackage.ku1
    public final void onPromotionUpdated(xt1 xt1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ku1) it.next()).onPromotionUpdated(xt1Var);
        }
    }
}
