package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class gcj implements ccj {
    public final l18 a;
    public final l18 b;
    public final bcj c;

    public gcj(Context context, bcj bcjVar) {
        this.c = bcjVar;
        dy0 dy0Var = dy0.e;
        mig.b(context);
        jig jigVarC = mig.a().c(dy0Var);
        if (dy0.d.contains(new gf5("json"))) {
            this.a = new l18(new f1j(jigVarC, 2));
        }
        this.b = new l18(new f1j(jigVarC, 3));
    }

    @Override // defpackage.ccj
    public final void a(lk6 lk6Var) {
        int i = this.c.b;
        l9c l9cVar = l9c.b;
        l9c l9cVar2 = l9c.a;
        if (i != 0) {
            ((kig) this.b.get()).a(lk6Var.b != 0 ? new aa0(lk6Var.b0(i), l9cVar2, null) : new aa0(lk6Var.b0(i), l9cVar, null));
            return;
        }
        l18 l18Var = this.a;
        if (l18Var != null) {
            ((kig) l18Var.get()).a(lk6Var.b != 0 ? new aa0(lk6Var.b0(i), l9cVar2, null) : new aa0(lk6Var.b0(i), l9cVar, null));
        }
    }
}
