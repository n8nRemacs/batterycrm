package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.media.metrics.MediaMetricsManager;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class hhg {
    public static final long z;
    public final Context a;
    public final chg b;
    public final wg7 c;
    public final boolean d;
    public final long e;
    public final int f;
    public final ua8 g;
    public final u1j h;
    public final c4h i;
    public final cd3 j;
    public final p9a k;
    public final Looper l;
    public final uy0 m;
    public final mwf n;
    public final wwf o;
    public final f65 q;
    public final h08 r;
    public lhg s;
    public u9a t;
    public pm3 u;
    public String v;
    public j95 x;
    public z95 y;
    public int w = 0;
    public final w7c p = new w7c(this);

    static {
        e19.a("media3.transformer");
        z = zxg.P() ? 25000L : WorkRequest.MIN_BACKOFF_MILLIS;
    }

    public hhg(Context context, chg chgVar, wg7 wg7Var, boolean z2, long j, int i, ua8 ua8Var, u1j u1jVar, c4h c4hVar, cd3 cd3Var, p9a p9aVar, Looper looper, uy0 uy0Var, mwf mwfVar, h08 h08Var) {
        this.a = context;
        this.b = chgVar;
        this.c = wg7Var;
        this.d = z2;
        this.e = j;
        this.f = i;
        this.g = ua8Var;
        this.h = u1jVar;
        this.i = c4hVar;
        this.j = cd3Var;
        this.k = p9aVar;
        this.l = looper;
        this.m = uy0Var;
        this.n = mwfVar;
        this.r = h08Var;
        this.o = mwfVar.a(looper, null);
        f65 f65Var = new f65();
        f65Var.d();
        this.q = f65Var;
    }

    public static void a(hhg hhgVar) {
        EditingSession editingSession;
        hhgVar.e();
        nn5 nn5VarB = hhgVar.q.b();
        ua8 ua8Var = hhgVar.g;
        ua8Var.c(-1, new c5g(hhgVar, 2, nn5VarB));
        ua8Var.b();
        if (hhgVar.b()) {
            j95 j95Var = hhgVar.x;
            j95Var.getClass();
            i95 i95Var = j95Var.c;
            EditingEndedEvent.Builder finalProgressPercent = j95Var.a(1).setFinalProgressPercent(100.0f);
            ArrayList arrayListC = j95.c(nn5VarB.q);
            for (int i = 0; i < arrayListC.size(); i++) {
                finalProgressPercent.addInputMediaItemInfo(xx.h(arrayListC.get(i)));
            }
            finalProgressPercent.setOutputMediaItemInfo(j95.d(nn5VarB));
            EditingEndedEvent editingEndedEventBuild = finalProgressPercent.build();
            if (!i95Var.b && (editingSession = i95Var.a) != null) {
                editingSession.reportEditingEndedEvent(editingEndedEventBuild);
                i95Var.b = true;
            }
            try {
                u45.p(i95Var);
            } catch (Exception e) {
                a8i.h("EditingMetricsCollector", "error while closing the metrics reporter", e);
            }
        }
        hhgVar.w = 0;
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT >= 35 && this.d;
    }

    public final void c() {
        h();
        lhg lhgVar = this.s;
        if (lhgVar == null) {
            e();
            return;
        }
        try {
            lhgVar.a();
            e();
        } finally {
            l16 l16Var = new l16(11);
            int iD = d(l16Var);
            this.s = null;
            if (b()) {
                i = iD == 2 ? l16Var.b : -1;
                j95 j95Var = this.x;
                j95Var.getClass();
                j95Var.e(i);
            }
        }
    }

    public final int d(l16 l16Var) {
        int i;
        h();
        int i2 = this.w;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return 3;
        }
        if (i2 == 5 || i2 == 6) {
            return 1;
        }
        lhg lhgVar = this.s;
        if (lhgVar == null) {
            return 0;
        }
        synchronized (lhgVar.r) {
            try {
                i = lhgVar.B;
                if (i == 2) {
                    l16Var.b = lhgVar.C;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final void e() {
        z95 z95Var = this.y;
        if (z95Var != null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) z95Var.d;
            scheduledFuture.getClass();
            scheduledFuture.cancel(false);
            ((ScheduledExecutorService) z95Var.c).shutdownNow();
            this.y = null;
        }
    }

    public final void f(pm3 pm3Var, String str) {
        h();
        long j = this.e;
        if (j != -9223372036854775807L) {
            ehg ehgVar = new ehg(0, this);
            z95 z95Var = new z95(j, ehgVar);
            this.y = z95Var;
            z95Var.d = ((ScheduledExecutorService) z95Var.c).schedule(new m1h(7, ehgVar), j, TimeUnit.MILLISECONDS);
        }
        this.u = pm3Var;
        this.v = str;
        this.q.d();
        g(pm3Var, new u9a(str, this.k, this.p, 0, null, false), this.p, 0L);
    }

    public final void g(pm3 pm3Var, u9a u9aVar, w7c w7cVar, long j) {
        va8 l2aVar;
        hsi.f("There is already an export in progress.", this.s == null);
        chg chgVarA = this.b;
        if (pm3Var.f != 0) {
            ft0 ft0VarA = chgVarA.a();
            ft0VarA.b = pm3Var.f;
            chgVarA = ft0VarA.a();
        }
        chg chgVar = chgVarA;
        if (b()) {
            p9a p9aVar = this.k;
            String str = p9aVar instanceof oh7 ? "androidx.media3:media3-muxer:1.8.0" : p9aVar instanceof ko4 ? lo4.b : null;
            h08 h08Var = this.r;
            h08Var.getClass();
            Context context = (Context) h08Var.b;
            i95 i95Var = new i95();
            MediaMetricsManager mediaMetricsManagerF = b34.f(context.getSystemService("media_metrics"));
            if (mediaMetricsManagerF != null) {
                i95Var.a = mediaMetricsManagerF.createEditingSession();
            }
            EditingSession editingSession = i95Var.a;
            sessionId = editingSession != null ? editingSession.getSessionId() : null;
            this.x = new j95(i95Var, str);
        }
        ua8 ua8Var = this.g;
        wwf wwfVar = this.o;
        w86 w86Var = new w86();
        w86Var.a = ua8Var;
        w86Var.b = wwfVar;
        w86Var.c = chgVar;
        w86Var.e = chgVar;
        w86Var.d = new AtomicInteger();
        Context context2 = this.a;
        fl4 fl4Var = new fl4(new pea(context2, 3));
        mwf mwfVar = this.n;
        vl3 vl3Var = new vl3();
        vl3Var.a = context2.getApplicationContext();
        vl3Var.b = fl4Var;
        vl3Var.c = mwfVar;
        vl3Var.o = sessionId;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        if (executorServiceNewSingleThreadExecutor instanceof va8) {
            l2aVar = (va8) executorServiceNewSingleThreadExecutor;
        } else {
            l2aVar = executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new l2a((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new i2a(executorServiceNewSingleThreadExecutor);
        }
        vl3Var.d = new ue4(l2aVar, new bl4(context2), options, 4096);
        LinkedHashMap linkedHashMap = ah4.a;
        synchronized (ah4.class) {
            ah4.a.clear();
            SystemClock.elapsedRealtime();
        }
        lhg lhgVar = new lhg(this.a, pm3Var, chgVar, vl3Var, this.h, this.i, this.j, this.c, this.f, u9aVar, w7cVar, w86Var, this.o, this.m, this.n, j, sessionId, false);
        this.s = lhgVar;
        lhgVar.e();
        lhgVar.j.f(1);
        synchronized (lhgVar.r) {
            lhgVar.B = 1;
            lhgVar.C = 0;
        }
        String str2 = zxg.a;
        synchronized (ah4.class) {
        }
    }

    public final void h() {
        if (Looper.myLooper() != this.l) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }
}
