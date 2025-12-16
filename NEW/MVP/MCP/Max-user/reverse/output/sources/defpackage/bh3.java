package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class bh3 {
    public final tw0 a;
    public final lzf b;
    public final jve c = kve.b(0, 0, 7);
    public final k18 d;
    public final ContextScope e;

    public bh3(tw0 tw0Var, lzf lzfVar, k18 k18Var) {
        this.a = tw0Var;
        this.b = lzfVar;
        this.d = k18Var;
        this.e = d7j.a(((q2b) lzfVar).a());
        tw0Var.d(this);
    }

    public final void a(wg3 wg3Var) {
        svi.e(this.e, null, null, new xg3(this, wg3Var, null), 3);
    }

    @vnf
    public final void onAddChatEvent(k9 k9Var) {
        a(new ug3(k9Var.b));
    }

    @vnf
    public final void onChatMembersUpdateEvent(or2 or2Var) {
        long j = or2Var.d;
        int iV = az1.v(or2Var.o);
        if (iV == 0) {
            a(new ug3(j));
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            a(new vg3(j));
        }
    }

    @vnf
    public final void onIncomingMessageEvent(gj7 gj7Var) {
        if (gj7Var.X) {
            svi.e(this.e, null, null, new ah3(this, gj7Var, null), 3);
        }
    }

    @vnf
    public final void onLeaveChatEvent(vi2 vi2Var) {
        a(new vg3(vi2Var.b));
    }

    @vnf
    public final void onRemoveChatEvent(vkd vkdVar) {
        a(new vg3(vkdVar.b));
    }
}
