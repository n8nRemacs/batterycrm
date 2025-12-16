package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final /* synthetic */ class os4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps4 b;

    public /* synthetic */ os4(ps4 ps4Var, int i) {
        this.a = i;
        this.b = ps4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ps4.a(this.b);
                return;
            default:
                ps4 ps4Var = this.b;
                if (ps4Var.Y != 0) {
                    cei.g().c(ps4.w0, "Already started work for " + ps4Var.c);
                    return;
                }
                ps4Var.Y = 1;
                cei.g().c(ps4.w0, "onAllConstraintsMet for " + ps4Var.c);
                if (!ps4Var.d.d.h(ps4Var.v0, null)) {
                    ps4Var.b();
                    return;
                }
                x5i x5iVar = ps4Var.d.c;
                v4i v4iVar = ps4Var.c;
                synchronized (x5iVar.d) {
                    cei.g().c(x5i.e, "Starting timer for " + v4iVar);
                    x5iVar.a(v4iVar);
                    w5i w5iVar = new w5i(x5iVar, v4iVar);
                    x5iVar.b.put(v4iVar, w5iVar);
                    x5iVar.c.put(v4iVar, ps4Var);
                    ((Handler) x5iVar.a.b).postDelayed(w5iVar, 600000L);
                }
                return;
        }
    }
}
