package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class jj2 implements p41 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.p41
    public final void onNewMessage(fj7 fj7Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((p41) it.next()).onNewMessage(fj7Var);
        }
    }
}
