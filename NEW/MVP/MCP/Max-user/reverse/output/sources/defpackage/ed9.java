package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ed9 {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public ed9(tw0 tw0Var, lzf lzfVar) {
        this.b = d7j.a(((q2b) lzfVar).a());
        tw0Var.d(this);
    }

    @vnf
    public final void onChatMembersUpdateEvent(or2 or2Var) {
        zc9 wc9Var;
        List list = or2Var.b;
        br2 br2Var = or2Var.c;
        long j = or2Var.d;
        int iV = az1.v(or2Var.o);
        if (iV == 0) {
            wc9Var = new wc9(j, br2Var, list);
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            wc9Var = new yc9(j, br2Var, list);
        }
        svi.e(this.b, null, null, new bd9(this, wc9Var, null), 3);
    }

    @vnf
    public final void onEvent(t24 t24Var) {
        svi.e(this.b, null, null, new cd9(this, t24Var, null), 3);
    }
}
