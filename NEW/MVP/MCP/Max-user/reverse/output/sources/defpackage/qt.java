package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class qt implements o21 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.o21
    public final void onAsrDataPackage(ut utVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((o21) it.next()).onAsrDataPackage(utVar);
        }
    }
}
