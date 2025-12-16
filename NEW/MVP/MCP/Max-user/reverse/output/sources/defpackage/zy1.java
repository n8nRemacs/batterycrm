package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class zy1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ te8 b;

    public /* synthetic */ zy1(te8 te8Var, int i) {
        this.a = i;
        this.b = te8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                te8 te8Var = this.b;
                if (!((AtomicBoolean) te8Var.b).getAndSet(true)) {
                    ((ez1) ((h79) te8Var.c).c).c.execute(new zy1(te8Var, 1));
                    break;
                }
                break;
            default:
                te8 te8Var2 = this.b;
                if (((ez1) ((h79) te8Var2.c).c).R0 == 8) {
                    ((ez1) ((h79) te8Var2.c).c).t("Camera onError timeout, reopen it.", null);
                    ((ez1) ((h79) te8Var2.c).c).F(7);
                    ((ez1) ((h79) te8Var2.c).c).Z.b();
                    break;
                } else {
                    ez1 ez1Var = (ez1) ((h79) te8Var2.c).c;
                    ez1Var.t("Camera skip reopen at state: ".concat(wy1.u(ez1Var.R0)), null);
                    break;
                }
        }
    }
}
