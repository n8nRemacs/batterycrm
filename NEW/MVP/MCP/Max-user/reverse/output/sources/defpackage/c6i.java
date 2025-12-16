package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class c6i {
    public static final /* synthetic */ int h = 0;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;

    public c6i(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
        this.g = k18Var7;
    }

    public final void a(ExecutorService executorService, String str) {
        if (executorService.isShutdown() || executorService.isTerminated()) {
            String str2 = "WARNING! " + str + " has broken state. isShutdown: " + executorService.isShutdown() + ", isTerminated: " + executorService.isTerminated();
            wqi.e("c6i", str2, null);
            ((y3b) ((yi5) this.b.getValue())).a(new te2("ONEME-17687", str2, null));
        }
    }

    public final void b(hge hgeVar) {
        ExecutorService executorServiceF;
        int iMax;
        k18 k18Var = this.f;
        k18 k18Var2 = this.c;
        wqi.c("c6i", "execute task = %s", hgeVar);
        b6i b6iVar = new b6i(hgeVar, this.a, (yi5) this.b.getValue(), this.f);
        if (hgeVar instanceof she) {
            wqi.c("c6i", "execute ServiceTaskTransmitTamTasks", new Object[0]);
            g4b g4bVar = (g4b) k18Var2.getValue();
            jj5 jj5Var = g4bVar.l;
            yy7 yy7Var = g4b.q[5];
            ExecutorService executorServiceE = g4bVar.e(jj5Var);
            a(executorServiceE, "SingleTransmitExecutor");
            executorServiceE.execute(b6iVar);
            return;
        }
        if (!(hgeVar instanceof rhe)) {
            wqi.c("WorkerService", "normal executor will run " + hgeVar, new Object[0]);
            ((g4b) k18Var2.getValue()).c().execute(b6iVar);
            return;
        }
        wqi.c("c6i", "execute task with own executor", new Object[0]);
        g4b g4bVar2 = (g4b) ((ige) k18Var.getValue()).C.getValue();
        nv4 nv4VarB = ((lv4) ((ige) k18Var.getValue()).d.getValue()).b();
        ExecutorService executorService = (ExecutorService) rhe.Y.get();
        if (executorService == null) {
            synchronized (rhe.class) {
                try {
                    ExecutorService executorService2 = (ExecutorService) rhe.Y.get();
                    if (executorService2 == null) {
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                        int iOrdinal = nv4VarB.ordinal();
                        if (iOrdinal == 0) {
                            iMax = Math.max(4, iAvailableProcessors - 1);
                        } else if (iOrdinal == 1) {
                            iMax = Math.max(8, iAvailableProcessors);
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iMax = Math.max(12, iAvailableProcessors);
                        }
                        int i = iMax;
                        yy7[] yy7VarArr = g4b.q;
                        executorServiceF = g4bVar2.f(0, "sync-chat-history", i, 5, false);
                        rhe.Y = new WeakReference(executorServiceF);
                    } else {
                        executorServiceF = executorService2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            executorService = executorServiceF;
        }
        a(executorService, hgeVar.getClass().getName());
        executorService.execute(b6iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c(hge hgeVar) {
        tsb tsbVar = (tsb) hgeVar;
        ((a3g) this.a.getValue()).g(tsbVar, 0L, 0);
        she.v(this);
        return tsbVar.getId();
    }
}
