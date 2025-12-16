package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zah {
    public final wah a;
    public volatile long b = -1;

    public zah(wah wahVar) {
        this.a = wahVar;
    }

    @vnf
    public final void onEvent(z4a z4aVar) throws Throwable {
        Object next;
        w10 w10Var;
        if (z4aVar.a != this.b) {
            return;
        }
        this.a.k().f(this);
        pb2 pb2VarJ = this.a.l().J(this.a.o);
        if (pb2VarJ == null) {
            this.a.k().c(new rj0(this.a.a, new pzf("attachment.token.expired", "chat deleted", null)));
            return;
        }
        si9 si9VarI = this.a.n().i(pb2VarJ.a, this.a.X);
        if (si9VarI == null || si9VarI.t0 == jm9.DELETED) {
            this.a.k().c(new rj0(this.a.a, new pzf("attachment.token.expired", "message deleted", null)));
            return;
        }
        if (si9VarI.x0 == null) {
            this.a.k().c(new rj0(this.a.a, new pzf("attachment.token.expired", "attaches not found", null)));
        }
        long j = this.a.d;
        jdc jdcVar = si9VarI.x0;
        if (jdcVar == null) {
            w10Var = null;
        } else {
            Iterator it = ((List) jdcVar.b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((w10) next).d.a == j) {
                        break;
                    }
                }
            }
            w10Var = (w10) next;
        }
        if (w10Var == null) {
            this.a.k().c(new rj0(this.a.a, new pzf("attachment.token.expired", "video deleted", null)));
            return;
        }
        v10 v10Var = w10Var.d;
        wah wahVar = this.a;
        wah wahVar2 = new wah(wahVar.a, wahVar.d, wahVar.o, wahVar.X, si9VarI.a, wahVar.Z, wahVar.s0, wahVar.t0, v10Var.n, true);
        tm tmVar = this.a.c;
        o0g o0gVar = (o0g) (tmVar != null ? tmVar : null).Q.getValue();
        o0gVar.getClass();
        ((u0g) o0gVar).b(wahVar2, wahVar2, false);
    }

    @vnf
    public final void onEvent(y4a y4aVar) {
        if (y4aVar.a != this.b) {
            return;
        }
        this.a.k().f(this);
        this.a.k().c(new rj0(this.a.a, y4aVar.b));
    }
}
