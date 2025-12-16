package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class dh6 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final awd b = new awd(null);

    public final void a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.b(new qn2((dh6) it.next(), 20, str));
        }
    }
}
