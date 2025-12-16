package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class te5 implements uu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ we5 b;

    public /* synthetic */ te5(we5 we5Var, int i) {
        this.a = i;
        this.b = we5Var;
    }

    @Override // defpackage.uu1
    public final String m(final tu1 tu1Var) {
        switch (this.a) {
            case 0:
                final we5 we5Var = this.b;
                final int i = 0;
                we5Var.d.h.execute(new Runnable() { // from class: ue5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                tu1Var.b(we5Var.b);
                                break;
                            default:
                                final we5 we5Var2 = we5Var;
                                bf5 bf5Var = we5Var2.d;
                                dv0 dv0Var = we5Var2.b;
                                dv0 dv0Var2 = dv0.a;
                                tu1 tu1Var2 = tu1Var;
                                if (dv0Var != dv0Var2) {
                                    if (dv0Var != dv0.b) {
                                        tu1Var2.d(new IllegalStateException("Unknown state: " + we5Var2.b));
                                        break;
                                    } else {
                                        tu1Var2.d(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    final ha8 ha8VarA = bf5Var.a();
                                    wsf.h(ha8VarA, tu1Var2);
                                    final int i2 = 0;
                                    tu1Var2.a(new Runnable() { // from class: ve5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i2) {
                                                case 0:
                                                    we5 we5Var3 = we5Var2;
                                                    we5Var3.getClass();
                                                    ha8 ha8Var = ha8VarA;
                                                    if (!ha8Var.cancel(true)) {
                                                        z5j.f(null, ha8Var.isDone());
                                                        try {
                                                            ((em7) ha8Var.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            gri.i(we5Var3.d.a, "Unable to cancel the input buffer: " + e);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    we5Var2.c.remove(ha8VarA);
                                                    break;
                                            }
                                        }
                                    }, ayi.a());
                                    we5Var2.c.add(ha8VarA);
                                    final int i3 = 1;
                                    ha8VarA.d(new Runnable() { // from class: ve5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    we5 we5Var3 = we5Var2;
                                                    we5Var3.getClass();
                                                    ha8 ha8Var = ha8VarA;
                                                    if (!ha8Var.cancel(true)) {
                                                        z5j.f(null, ha8Var.isDone());
                                                        try {
                                                            ((em7) ha8Var.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            gri.i(we5Var3.d.a, "Unable to cancel the input buffer: " + e);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    we5Var2.c.remove(ha8VarA);
                                                    break;
                                            }
                                        }
                                    }, bf5Var.h);
                                    break;
                                }
                        }
                    }
                });
                return "fetchData";
            default:
                final we5 we5Var2 = this.b;
                final int i2 = 1;
                we5Var2.d.h.execute(new Runnable() { // from class: ue5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                tu1Var.b(we5Var2.b);
                                break;
                            default:
                                final we5 we5Var22 = we5Var2;
                                bf5 bf5Var = we5Var22.d;
                                dv0 dv0Var = we5Var22.b;
                                dv0 dv0Var2 = dv0.a;
                                tu1 tu1Var2 = tu1Var;
                                if (dv0Var != dv0Var2) {
                                    if (dv0Var != dv0.b) {
                                        tu1Var2.d(new IllegalStateException("Unknown state: " + we5Var22.b));
                                        break;
                                    } else {
                                        tu1Var2.d(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    final ha8 ha8VarA = bf5Var.a();
                                    wsf.h(ha8VarA, tu1Var2);
                                    final int i22 = 0;
                                    tu1Var2.a(new Runnable() { // from class: ve5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    we5 we5Var3 = we5Var22;
                                                    we5Var3.getClass();
                                                    ha8 ha8Var = ha8VarA;
                                                    if (!ha8Var.cancel(true)) {
                                                        z5j.f(null, ha8Var.isDone());
                                                        try {
                                                            ((em7) ha8Var.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            gri.i(we5Var3.d.a, "Unable to cancel the input buffer: " + e);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    we5Var22.c.remove(ha8VarA);
                                                    break;
                                            }
                                        }
                                    }, ayi.a());
                                    we5Var22.c.add(ha8VarA);
                                    final int i3 = 1;
                                    ha8VarA.d(new Runnable() { // from class: ve5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    we5 we5Var3 = we5Var22;
                                                    we5Var3.getClass();
                                                    ha8 ha8Var = ha8VarA;
                                                    if (!ha8Var.cancel(true)) {
                                                        z5j.f(null, ha8Var.isDone());
                                                        try {
                                                            ((em7) ha8Var.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            gri.i(we5Var3.d.a, "Unable to cancel the input buffer: " + e);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    we5Var22.c.remove(ha8VarA);
                                                    break;
                                            }
                                        }
                                    }, bf5Var.h);
                                    break;
                                }
                        }
                    }
                });
                return "acquireBuffer";
        }
    }
}
