package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class mbh implements mt1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.mt1
    public final void c(usd usdVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((mt1) it.next()).c(usdVar);
        }
    }
}
