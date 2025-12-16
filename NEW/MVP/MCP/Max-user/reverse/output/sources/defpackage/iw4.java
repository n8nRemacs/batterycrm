package defpackage;

import java.util.Iterator;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class iw4 {
    public final long a;
    public final tw0 b;
    public final w63 c;
    public final jve d = kve.b(0, 0, 7);
    public final ContextScope e;

    public iw4(long j, tw0 tw0Var, lzf lzfVar, w63 w63Var) {
        this.a = j;
        this.b = tw0Var;
        this.c = w63Var;
        this.e = d7j.a(((q2b) lzfVar).c().getImmediate());
        tw0Var.d(this);
    }

    @vnf
    public final void onEvent(n73 n73Var) {
        ku3 ku3VarN;
        Iterator it = n73Var.b.iterator();
        while (it.hasNext()) {
            pb2 pb2Var = (pb2) this.c.j(((Number) it.next()).longValue()).a.getValue();
            if (pb2Var != null && (ku3VarN = pb2Var.n()) != null) {
                if (ku3VarN.p() == this.a) {
                    svi.e(this.e, null, null, new hw4(this, null), 3);
                    return;
                }
                return;
            }
        }
    }
}
