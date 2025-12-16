package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class d13 extends l0g {
    public List c;
    public long d;

    public d13(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.d = tm9Var.t0();
        } else if (str.equals("chats")) {
            this.c = sz.b(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "marker=" + this.d + ", chats=" + zdi.a(this.c);
    }
}
