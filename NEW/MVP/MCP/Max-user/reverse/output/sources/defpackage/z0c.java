package defpackage;

import java.util.Iterator;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class z0c {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public z0c(tw0 tw0Var, lzf lzfVar) {
        this.b = d7j.a(((q2b) lzfVar).c());
        tw0Var.d(this);
    }

    @vnf
    public final void onEvent(n73 n73Var) {
        n8a n8aVar = new n8a((Object) null);
        Iterator it = n73Var.b.iterator();
        while (it.hasNext()) {
            n8aVar.a(((Number) it.next()).longValue());
        }
        svi.e(this.b, null, null, new y0c(this, new jbe(26), null), 3);
    }
}
