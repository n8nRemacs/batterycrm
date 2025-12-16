package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class tdg implements sdg {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.sdg
    public final void a(odg odgVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sdg) it.next()).a(odgVar);
        }
    }
}
