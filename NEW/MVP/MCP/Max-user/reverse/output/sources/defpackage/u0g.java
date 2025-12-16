package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class u0g implements o0g {
    public static final String z0 = o0g.class.getName();
    public final k18 X;
    public final k18 Y;
    public final yi5 Z;
    public volatile CountDownLatch b;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public volatile bwf w0;
    public final bwf x0;
    public final k18 y0;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();

    public u0g(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, yi5 yi5Var, k18 k18Var5, k18 k18Var6, k18 k18Var7, qja qjaVar, k18 k18Var8, oje ojeVar, k18 k18Var9) {
        this.d = k18Var;
        this.o = k18Var2;
        this.X = k18Var3;
        this.Y = k18Var4;
        this.Z = yi5Var;
        this.s0 = k18Var5;
        this.t0 = k18Var6;
        this.u0 = k18Var7;
        this.v0 = k18Var8;
        this.y0 = k18Var9;
        this.x0 = new bwf(new zad(k18Var5, 11));
        this.w0 = new bwf(new zad(k18Var5, 12));
        ojeVar.a(this);
        qjaVar.l = this;
    }

    public static void a(u0g u0gVar, sm smVar) {
        k18 k18Var = u0gVar.t0;
        k18 k18Var2 = u0gVar.v0;
        String name = smVar.getClass().getName();
        long j = smVar.a;
        Object[] objArr = {name, Long.valueOf(j)};
        String str = z0;
        wqi.c(str, "onTaskSuccess: %s, requestId: %s", objArr);
        if (smVar instanceof eh8) {
            w0g w0gVar = (w0g) k18Var2.getValue();
            AtomicLong atomicLong = w0gVar.Y;
            ((lv4) w0gVar.d.getValue()).getClass();
            atomicLong.set(SystemClock.elapsedRealtime());
            she.v((c6i) k18Var.getValue());
        }
        if (smVar instanceof tsb) {
            ((a3g) u0gVar.d.getValue()).d(j);
        }
        if (smVar instanceof p5a) {
            she.v((c6i) k18Var.getValue());
        }
        pe8 pe8Var = ((z7c) u0gVar.o.getValue()).a;
        fde fdeVar = pe8Var.C;
        yy7[] yy7VarArr = w4e.m0;
        if (((Boolean) fdeVar.D(pe8Var, yy7VarArr[20])).booleanValue() && smVar.q().Z()) {
            wqi.c(str, "onTaskSuccess: set force connection to false after success tam task", new Object[0]);
            pe8Var.A(false);
        }
        if (smVar.q().Z()) {
            ((lv4) u0gVar.X.getValue()).getClass();
            pe8Var.D.O(pe8Var, yy7VarArr[21], Long.valueOf(SystemClock.elapsedRealtime()));
        }
        ((w0g) k18Var2.getValue()).e();
    }

    public final long b(sm smVar, j1g j1gVar, boolean z) {
        wqi.c(z0, "executeTask: " + smVar.getClass().getName() + " isRetry=" + z, new Object[0]);
        ((w0g) this.v0.getValue()).c(false);
        if (smVar instanceof ji8) {
            this.b = new CountDownLatch(1);
        }
        te8 te8Var = new te8();
        te8Var.c = this;
        te8Var.a = smVar;
        te8Var.b = j1gVar;
        ((ExecutorService) this.x0.getValue()).execute(new c29(this, smVar, z, te8Var, j1gVar));
        return smVar.a;
    }

    public final long c(n2 n2Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        t0g t0gVar = (t0g) this.a.get(n2Var.getClass().getName());
        if (t0gVar == null) {
            return jCurrentTimeMillis;
        }
        float fJ = k7d.b.j() * 0.2f;
        return n2Var.S().c(t0gVar.a, t0gVar.b, fJ);
    }

    @Override // defpackage.mje
    public final void d(int i) {
        if (i == 2) {
            sie sieVar = new sie(((z7c) this.o.getValue()).a.k(), 0);
            b(sieVar, sieVar, false);
        }
    }

    public final void e(boolean z) {
        zhe zheVar;
        k18 k18Var = this.v0;
        w0g w0gVar = (w0g) k18Var.getValue();
        AtomicLong atomicLong = w0gVar.Y;
        ((lv4) w0gVar.d.getValue()).getClass();
        atomicLong.set(SystemClock.elapsedRealtime());
        if (z) {
            this.a.clear();
            if (!k18Var.e() || (zheVar = (zhe) ((w0g) k18Var.getValue()).X.get()) == null) {
                return;
            }
            zheVar.j.set(0L);
            zheVar.i.set(0);
            wqi.c(zheVar.a, "resetConnectionTimeout", new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(sm smVar, pzf pzfVar) {
        String str = z0;
        String name = smVar.getClass().getName();
        long j = smVar.a;
        wqi.f(str, "onTaskFailed: %s, requestId: %s, error %s", name, Long.valueOf(j), pzfVar);
        if ("proto.ver".equals(pzfVar.b)) {
            wqi.c(str, "got version error: mark current version as deprecated, close connection", new Object[0]);
            zhe zheVar = (zhe) ((w0g) this.v0.getValue()).X.get();
            if (zheVar != null) {
                zheVar.z(false);
            }
            ((tw0) this.Y.getValue()).c(new uu(4));
        }
        if (smVar instanceof tsb) {
            ((a3g) this.d.getValue()).c(j);
            if ("proto.payload".equals(pzfVar.b)) {
                tsb tsbVar = (tsb) smVar;
                try {
                    tsbVar.f();
                } catch (Throwable th) {
                    ((y3b) this.Z).a(new IllegalStateException("TaskRunnable: failed to execute onMaxFailCount method for task " + tsbVar.getId() + " type " + tsbVar.getType(), th));
                }
            }
            ((x2g) this.u0.getValue()).a();
            she.v((c6i) this.t0.getValue());
        }
        if (!(smVar instanceof ji8) || this.b == null) {
            return;
        }
        wqi.c(str, "countDownSyncLogoutLatch", new Object[0]);
        this.b.countDown();
    }
}
