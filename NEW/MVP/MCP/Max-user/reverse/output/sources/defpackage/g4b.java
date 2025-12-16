package defpackage;

import android.os.Build;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class g4b {
    public static final /* synthetic */ yy7[] q = {new toc(g4b.class, "ioExecutor", "getIoExecutor()Ljava/util/concurrent/ExecutorService;", 0), ho7.d(vid.a, g4b.class, "computationExecutor", "getComputationExecutor()Ljava/util/concurrent/ExecutorService;", 0), new toc(g4b.class, "singleExecutor", "getSingleExecutor()Ljava/util/concurrent/ExecutorService;", 0), new toc(g4b.class, "singleLowPriorityExecutor", "getSingleLowPriorityExecutor()Ljava/util/concurrent/ExecutorService;", 0), new toc(g4b.class, "network", "getNetwork()Ljava/util/concurrent/ExecutorService;", 0), new toc(g4b.class, "singleTransmitExecutor", "getSingleTransmitExecutor()Ljava/util/concurrent/ExecutorService;", 0)};
    public final m69 a;
    public volatile ge b;
    public final pn3 c;
    public final gmf d;
    public final ConcurrentHashMap e;
    public final bwf f;
    public final jj5 g;
    public final jj5 h;
    public final jj5 i;
    public final jj5 j;
    public final jj5 k;
    public final jj5 l;
    public final bwf m;
    public final bwf n;
    public final bwf o;
    public final bwf p;

    static {
        int i = s65.d;
        y65 y65Var = y65.SECONDS;
        long jH = v9j.h(Integer.MAX_VALUE, y65Var);
        long jH2 = v9j.h(Integer.MAX_VALUE, y65Var);
        int i2 = 13;
        new m69(false, jH, jH2, new dga(i2), new dga(i2));
    }

    public g4b(m69 m69Var, pn3 pn3Var, final jj5 jj5Var, jj5 jj5Var2, final jj5 jj5Var3) {
        ge geVar = ge.a;
        gmf gmfVar = gmf.a;
        final jj5 jj5Var4 = new jj5("single", 1, 0L, false, true, false, true, 72);
        jj5 jj5Var5 = new jj5("single-low", 1, 0L, false, true, false, true, 8);
        jj5 jj5Var6 = new jj5("trnsmt", 1, 1, 0L, true, false, 10, true, true);
        this.a = m69Var;
        this.b = geVar;
        this.c = pn3Var;
        this.d = gmfVar;
        this.e = new ConcurrentHashMap();
        this.f = new bwf(new d4b(this, 1));
        this.g = jj5Var;
        this.h = jj5Var3;
        this.i = jj5Var4;
        this.j = jj5Var5;
        this.k = jj5Var2;
        this.l = jj5Var6;
        final int i = 1;
        this.m = new bwf(new cm6(this) { // from class: c4b
            public final /* synthetic */ g4b b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        g4b g4bVar = this.b;
                        b4b b4bVarB = g4bVar.b();
                        jj5 jj5VarA = jj5.a(jj5Var, 510);
                        b4bVarB.getClass();
                        return g4bVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new sz5(jj5VarA.b, b4bVarB.a.h(jj5VarA.a, Integer.valueOf(jj5VarA.g), jj5VarA.h, jj5VarA.i))), "OneMeScheduler");
                    case 1:
                        g4b g4bVar2 = this.b;
                        return g4bVar2.h(g4bVar2.c(), jj5Var.a);
                    case 2:
                        g4b g4bVar3 = this.b;
                        return g4bVar3.h(g4bVar3.a(), jj5Var.a);
                    default:
                        g4b g4bVar4 = this.b;
                        return g4bVar4.h(g4bVar4.d(), jj5Var.a);
                }
            }
        });
        final int i2 = 2;
        this.n = new bwf(new cm6(this) { // from class: c4b
            public final /* synthetic */ g4b b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        g4b g4bVar = this.b;
                        b4b b4bVarB = g4bVar.b();
                        jj5 jj5VarA = jj5.a(jj5Var3, 510);
                        b4bVarB.getClass();
                        return g4bVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new sz5(jj5VarA.b, b4bVarB.a.h(jj5VarA.a, Integer.valueOf(jj5VarA.g), jj5VarA.h, jj5VarA.i))), "OneMeScheduler");
                    case 1:
                        g4b g4bVar2 = this.b;
                        return g4bVar2.h(g4bVar2.c(), jj5Var3.a);
                    case 2:
                        g4b g4bVar3 = this.b;
                        return g4bVar3.h(g4bVar3.a(), jj5Var3.a);
                    default:
                        g4b g4bVar4 = this.b;
                        return g4bVar4.h(g4bVar4.d(), jj5Var3.a);
                }
            }
        });
        final int i3 = 3;
        this.o = new bwf(new cm6(this) { // from class: c4b
            public final /* synthetic */ g4b b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        g4b g4bVar = this.b;
                        b4b b4bVarB = g4bVar.b();
                        jj5 jj5VarA = jj5.a(jj5Var4, 510);
                        b4bVarB.getClass();
                        return g4bVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new sz5(jj5VarA.b, b4bVarB.a.h(jj5VarA.a, Integer.valueOf(jj5VarA.g), jj5VarA.h, jj5VarA.i))), "OneMeScheduler");
                    case 1:
                        g4b g4bVar2 = this.b;
                        return g4bVar2.h(g4bVar2.c(), jj5Var4.a);
                    case 2:
                        g4b g4bVar3 = this.b;
                        return g4bVar3.h(g4bVar3.a(), jj5Var4.a);
                    default:
                        g4b g4bVar4 = this.b;
                        return g4bVar4.h(g4bVar4.d(), jj5Var4.a);
                }
            }
        });
        final int i4 = 0;
        this.p = new bwf(new cm6(this) { // from class: c4b
            public final /* synthetic */ g4b b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        g4b g4bVar = this.b;
                        b4b b4bVarB = g4bVar.b();
                        jj5 jj5VarA = jj5.a(jj5Var4, 510);
                        b4bVarB.getClass();
                        return g4bVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new sz5(jj5VarA.b, b4bVarB.a.h(jj5VarA.a, Integer.valueOf(jj5VarA.g), jj5VarA.h, jj5VarA.i))), "OneMeScheduler");
                    case 1:
                        g4b g4bVar2 = this.b;
                        return g4bVar2.h(g4bVar2.c(), jj5Var4.a);
                    case 2:
                        g4b g4bVar3 = this.b;
                        return g4bVar3.h(g4bVar3.a(), jj5Var4.a);
                    default:
                        g4b g4bVar4 = this.b;
                        return g4bVar4.h(g4bVar4.d(), jj5Var4.a);
                }
            }
        });
    }

    public final ExecutorService a() {
        yy7 yy7Var = q[1];
        return e(this.h);
    }

    public final b4b b() {
        return (b4b) this.f.getValue();
    }

    public final ExecutorService c() {
        yy7 yy7Var = q[0];
        return e(this.g);
    }

    public final ExecutorService d() {
        yy7 yy7Var = q[2];
        return e(this.i);
    }

    public final ExecutorService e(jj5 jj5Var) {
        return (ExecutorService) this.e.computeIfAbsent(jj5Var, new ni(19, new ia(this, 27, jj5Var)));
    }

    public final ExecutorService f(int i, String str, int i2, int i3, boolean z) {
        b4b b4bVarB = b();
        b4bVarB.getClass();
        tz5 tz5Var = new tz5(i, i2, 60000L, TimeUnit.MILLISECONDS, Build.VERSION.SDK_INT >= 35 ? new z3b() : new a4b(), b4bVarB.a.h(str, Integer.valueOf(i3), z, true));
        tz5Var.allowCoreThreadTimeOut(true);
        tz5Var.setRejectedExecutionHandler(new d22(1));
        return i(tz5Var, str);
    }

    public final ExecutorService g() {
        b4b b4bVarB = b();
        b4bVarB.getClass();
        tz5 tz5Var = new tz5(3, 3, 60000L, TimeUnit.MILLISECONDS, Build.VERSION.SDK_INT >= 35 ? new z3b() : new a4b(), b4bVarB.a.h("tam-srvc", 5, true, true));
        tz5Var.allowCoreThreadTimeOut(true);
        tz5Var.setRejectedExecutionHandler(new d22(1));
        return i(tz5Var, "tam-srvc");
    }

    public final ScheduledExecutorService h(ExecutorService executorService, String str) {
        boolean z = executorService instanceof zj5;
        bwf bwfVar = this.p;
        return z ? new et4(executorService, bwfVar) : j(new et4(executorService, bwfVar), str);
    }

    public final ExecutorService i(tz5 tz5Var, String str) {
        return this.a.b ? new zj5(tz5Var, new f4b(this, 0), new e4b(str, 0)) : tz5Var;
    }

    public final ScheduledExecutorService j(ScheduledExecutorService scheduledExecutorService, String str) {
        return (!this.a.b || (scheduledExecutorService instanceof kzd)) ? scheduledExecutorService : new kzd(scheduledExecutorService, new f4b(this, 1), new e4b(str, 1));
    }
}
