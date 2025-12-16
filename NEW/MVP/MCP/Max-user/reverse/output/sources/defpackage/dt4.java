package defpackage;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class dt4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ft4 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ iv6 d;

    public /* synthetic */ dt4(ft4 ft4Var, Runnable runnable, iv6 iv6Var, int i) {
        this.a = i;
        this.b = ft4Var;
        this.c = runnable;
        this.d = iv6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExecutorService executorService = this.b.a;
                final int i = 0;
                final Runnable runnable = this.c;
                final iv6 iv6Var = this.d;
                executorService.execute(new Runnable() { // from class: bt4
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((ht4) iv6Var.b).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ht4) iv6Var.b).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                ht4 ht4Var = (ht4) iv6Var.b;
                                try {
                                    runnable2.run();
                                    ht4Var.l(null);
                                    return;
                                } catch (Exception e3) {
                                    ht4Var.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.b.a;
                final int i2 = 2;
                final Runnable runnable2 = this.c;
                final iv6 iv6Var2 = this.d;
                executorService2.execute(new Runnable() { // from class: bt4
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ht4) iv6Var2.b).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ht4) iv6Var2.b).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                ht4 ht4Var = (ht4) iv6Var2.b;
                                try {
                                    runnable22.run();
                                    ht4Var.l(null);
                                    return;
                                } catch (Exception e3) {
                                    ht4Var.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.b.a;
                final int i3 = 1;
                final Runnable runnable3 = this.c;
                final iv6 iv6Var3 = this.d;
                executorService3.execute(new Runnable() { // from class: bt4
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((ht4) iv6Var3.b).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ht4) iv6Var3.b).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                ht4 ht4Var = (ht4) iv6Var3.b;
                                try {
                                    runnable22.run();
                                    ht4Var.l(null);
                                    return;
                                } catch (Exception e3) {
                                    ht4Var.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
