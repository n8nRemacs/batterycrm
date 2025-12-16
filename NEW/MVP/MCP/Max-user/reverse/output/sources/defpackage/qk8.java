package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class qk8 {
    public Set a;

    public final void a() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((pk8) it.next()).c();
        }
    }

    public final void b() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((pk8) it.next()).f();
        }
    }
}
