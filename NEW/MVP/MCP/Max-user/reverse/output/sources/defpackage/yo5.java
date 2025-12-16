package defpackage;

import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class yo5 implements a4h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap5 b;

    public /* synthetic */ yo5(ap5 ap5Var, int i) {
        this.a = i;
        this.b = ap5Var;
    }

    @Override // defpackage.a4h
    public final void run() {
        switch (this.a) {
            case 0:
                ap5 ap5Var = this.b;
                if (ap5Var.x0 != ap5Var.t0.size()) {
                    int size = ap5Var.t0.size();
                    long j = ap5.I0;
                    int i = ap5Var.x0;
                    Locale locale = Locale.US;
                    StringBuilder sbM = u45.m(size, j, "Forcing EOS after missing ", " frames for ");
                    sbM.append(" ms, with available frame count: ");
                    sbM.append(i);
                    a8i.l("ExtTexMgr", sbM.toString());
                    ap5Var.y0 = false;
                    ap5Var.z0 = null;
                    ap5Var.E0 = true;
                    ap5Var.B();
                    ap5Var.t0.clear();
                    ap5Var.x();
                    break;
                }
                break;
            case 1:
                this.b.E0 = false;
                break;
            case 2:
                ap5 ap5Var2 = this.b;
                if (ap5Var2.B0) {
                    ap5Var2.E0 = true;
                }
                if (!ap5Var2.t0.isEmpty() || ap5Var2.z0 != null) {
                    ap5Var2.y0 = true;
                    ScheduledFuture scheduledFuture = ap5Var2.C0;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    ap5Var2.C0 = null;
                    ap5Var2.C0 = ap5Var2.u0.schedule(new qj4(29, ap5Var2), ap5.I0, TimeUnit.MILLISECONDS);
                    break;
                } else {
                    jp4 jp4Var = ap5Var2.o;
                    jp4Var.getClass();
                    jp4Var.c();
                    ah4.a();
                    ScheduledFuture scheduledFuture2 = ap5Var2.C0;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                    }
                    ap5Var2.C0 = null;
                    break;
                }
                break;
            case 3:
                ap5 ap5Var3 = this.b;
                ap5Var3.getClass();
                try {
                    ap5Var3.B();
                    break;
                } catch (RuntimeException e) {
                    ap5Var3.F0 = e;
                    a8i.h("ExtTexMgr", "Failed to remove texture frames", e);
                    if (ap5Var3.D0 != null) {
                        ap5Var3.D0.countDown();
                        return;
                    }
                    return;
                }
            case 4:
                ap5 ap5Var4 = this.b;
                ah4.a();
                if (ap5Var4.B0) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = ap5Var4.t0;
                    yj6 yj6Var = ap5Var4.A0;
                    yj6Var.getClass();
                    concurrentLinkedQueue.add(yj6Var);
                }
                if (!ap5Var4.E0) {
                    if (ap5Var4.y0) {
                        ScheduledFuture scheduledFuture3 = ap5Var4.C0;
                        if (scheduledFuture3 != null) {
                            scheduledFuture3.cancel(false);
                        }
                        ap5Var4.C0 = null;
                        ap5Var4.C0 = ap5Var4.u0.schedule(new qj4(29, ap5Var4), ap5.I0, TimeUnit.MILLISECONDS);
                    }
                    ap5Var4.x0++;
                    ap5Var4.A();
                    break;
                } else {
                    ap5Var4.Z.updateTexImage();
                    ap5Var4.t0.poll();
                    if (ap5Var4.D0 != null && ap5Var4.t0.isEmpty()) {
                        ap5Var4.D0.countDown();
                        break;
                    }
                }
                break;
            case 5:
                ap5 ap5Var5 = this.b;
                ap5Var5.z0 = null;
                if (!ap5Var5.y0 || !ap5Var5.t0.isEmpty()) {
                    ap5Var5.A();
                    break;
                } else {
                    ap5Var5.y0 = false;
                    jp4 jp4Var2 = ap5Var5.o;
                    jp4Var2.getClass();
                    jp4Var2.c();
                    ah4.a();
                    ScheduledFuture scheduledFuture4 = ap5Var5.C0;
                    if (scheduledFuture4 != null) {
                        scheduledFuture4.cancel(false);
                    }
                    ap5Var5.C0 = null;
                    break;
                }
                break;
            default:
                ap5 ap5Var6 = this.b;
                ap5Var6.w0++;
                ap5Var6.A();
                break;
        }
    }
}
