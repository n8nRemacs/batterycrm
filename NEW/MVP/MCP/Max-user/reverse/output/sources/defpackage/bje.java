package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class bje implements dp1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.dp1
    public final void a(i5i i5iVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dp1) it.next()).a(i5iVar);
        }
    }
}
