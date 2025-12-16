package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.protocol.exceptions.RtcRetryLimitExceedException;

/* loaded from: classes2.dex */
public final class jud {
    public final mud a;
    public final HandlerThread e;
    public final Handler f;
    public final u5i n;
    public final y6d o;
    public final AtomicReference b = new AtomicReference(null);
    public final r8i c = new r8i(this);
    public final p8i d = new p8i(2, this);
    public final Handler g = new Handler(Looper.getMainLooper());
    public final Handler h = new Handler(Looper.getMainLooper());
    public final tpd i = new tpd();
    public final AtomicBoolean j = new AtomicBoolean(false);
    public long k = 0;
    public final LongSparseArray l = new LongSparseArray();
    public final LinkedList m = new LinkedList();

    public jud(vhb vhbVar) {
        mud mudVar = (mud) vhbVar.c;
        if (mudVar == null) {
            throw new IllegalArgumentException("Illegal 'serializer' value: null");
        }
        this.a = mudVar;
        y6d y6dVar = (y6d) vhbVar.b;
        this.o = y6dVar;
        u5i u5iVar = new u5i();
        u5iVar.b = new CopyOnWriteArrayList();
        u5iVar.c = new Handler(Looper.getMainLooper());
        if (y6dVar == null) {
            throw new IllegalArgumentException("Illegal 'uncaughtExceptionHandler' value: null");
        }
        u5iVar.a = y6dVar;
        this.n = u5iVar;
        HandlerThread handlerThread = new HandlerThread("RtcCommExec");
        this.e = handlerThread;
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        this.g.removeCallbacksAndMessages(null);
        LinkedList linkedList = this.m;
        linkedList.clear();
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.l;
            if (i >= longSparseArray.size()) {
                return;
            }
            long jKeyAt = longSparseArray.keyAt(i);
            e85 e85Var = (e85) longSparseArray.valueAt(i);
            e85Var.e = 0L;
            e85Var.f = 0L;
            linkedList.offer(Long.valueOf(jKeyAt));
            i++;
        }
    }

    public final void b() {
        Handler handler = this.h;
        u5i u5iVar = this.n;
        ae4 ae4Var = (ae4) this.b.get();
        if (ae4Var == null || !ae4Var.b()) {
            return;
        }
        LinkedList linkedList = this.m;
        for (Long l = (Long) linkedList.poll(); l != null; l = (Long) linkedList.poll()) {
            long jLongValue = l.longValue();
            LongSparseArray longSparseArray = this.l;
            e85 e85Var = (e85) longSparseArray.get(jLongValue);
            if (e85Var != null) {
                try {
                    bj bjVarZ = this.a.z(e85Var.b, e85Var.c);
                    boolean zE = ae4Var.e(bjVarZ.b, (byte[]) bjVarZ.c);
                    if (zE) {
                        gud gudVar = e85Var.c;
                        u5iVar.getClass();
                        ((Handler) u5iVar.c).post(new mp5(u5iVar, gudVar, 2));
                        ((Handler) u5iVar.c).post(new np5(u5iVar, (byte[]) bjVarZ.c, bjVarZ.b, 0));
                    }
                    if (zE) {
                        if (e85Var.c.a()) {
                            u5iVar.g(e85Var.c);
                            longSparseArray.remove(e85Var.b);
                        }
                        handler.post(new qj4(15, e85Var));
                    } else {
                        c(e85Var.b);
                    }
                } catch (Throwable th) {
                    gud gudVar2 = e85Var.c;
                    u5iVar.getClass();
                    ((Handler) u5iVar.c).post(new se5(u5iVar, gudVar2, th, 6));
                    u5iVar.g(e85Var.c);
                    handler.post(new kr4(e85Var, 11, th));
                    longSparseArray.remove(e85Var.b);
                }
            }
        }
    }

    public final void c(long j) {
        LongSparseArray longSparseArray = this.l;
        e85 e85Var = (e85) longSparseArray.get(j);
        if (e85Var == null || this.j.get()) {
            return;
        }
        hud hudVar = e85Var.d;
        long j2 = hudVar.e;
        gud gudVar = hudVar.b;
        tpd tpdVar = this.i;
        if (j2 < 0) {
            tpdVar.getClass();
            throw new IllegalArgumentException(vb9.e(j2, "Illegal 'minRetryTimeoutMs' value: "));
        }
        tpdVar.getClass();
        long j3 = hudVar.f;
        if (j3 < 0) {
            throw new IllegalArgumentException(vb9.e(j3, "Illegal 'maxRetryTimeoutMs' value: "));
        }
        float f = hudVar.g;
        if (f < 0.0f) {
            throw new IllegalArgumentException("Illegal 'retryBackoffFactor' value: " + f);
        }
        float f2 = hudVar.h;
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Illegal 'retryBackoffJitter' value: " + f2);
        }
        tpdVar.b = f2;
        long j4 = e85Var.f;
        if (j4 < 0) {
            throw new IllegalArgumentException(vb9.e(j4, "Illegal 'latestRetryTimeout' value: "));
        }
        e85Var.e++;
        float fMax = Math.max(j2, Math.min((long) (j4 * f), j3));
        long jNextGaussian = (long) (fMax + ((float) (tpdVar.a.nextGaussian() * fMax * tpdVar.b)));
        e85Var.f = jNextGaussian;
        if (e85Var.e < 0) {
            this.g.postDelayed(new iud(this, j, 1), jNextGaussian);
            return;
        }
        RtcRetryLimitExceedException rtcRetryLimitExceedException = new RtcRetryLimitExceedException();
        u5i u5iVar = this.n;
        u5iVar.getClass();
        ((Handler) u5iVar.c).post(new se5(u5iVar, gudVar, rtcRetryLimitExceedException, 6));
        u5iVar.g(gudVar);
        this.h.post(new kr4(e85Var, 11, rtcRetryLimitExceedException));
        longSparseArray.remove(j);
    }

    public final void d(hud hudVar) {
        if (this.j.get()) {
            this.o.log("RTCCommand", "execute on disposed");
        }
        this.f.post(new d8c(this, 23, hudVar));
    }
}
