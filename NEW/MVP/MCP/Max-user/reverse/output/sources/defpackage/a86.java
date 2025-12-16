package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class a86 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c86 b;
    public final /* synthetic */ long c;

    public /* synthetic */ a86(c86 c86Var, long j, int i) {
        this.a = i;
        this.b = c86Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c86 c86Var = this.b;
                c86Var.b.execute(new a86(c86Var, this.c, 3));
                break;
            case 1:
                c86 c86Var2 = this.b;
                c86Var2.b.execute(new a86(c86Var2, this.c, 2));
                break;
            case 2:
                long j = this.c;
                c86 c86Var3 = this.b;
                if (j == c86Var3.k) {
                    c86Var3.b();
                    break;
                }
                break;
            default:
                long j2 = this.c;
                c86 c86Var4 = this.b;
                if (j2 == c86Var4.k) {
                    c86Var4.m = false;
                    ScheduledFuture scheduledFuture = c86Var4.j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        c86Var4.j = null;
                    }
                    tu1 tu1Var = c86Var4.s;
                    if (tu1Var != null) {
                        tu1Var.b(new d86(false));
                        c86Var4.s = null;
                        break;
                    }
                }
                break;
        }
    }
}
