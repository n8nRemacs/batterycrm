package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final /* synthetic */ class ul5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ ul5(f29 f29Var, w69 w69Var, ao6 ao6Var, boolean z) {
        this.a = 2;
        this.c = f29Var;
        this.d = w69Var;
        this.o = ao6Var;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                boolean z = this.b;
                em5 em5Var = (em5) this.d;
                n4c n4cVar = (n4c) this.o;
                MediaMetricsManager mediaMetricsManagerF = b34.f(context.getSystemService("media_metrics"));
                a29 a29Var = mediaMetricsManagerF == null ? null : new a29(context, mediaMetricsManagerF.createPlaybackSession());
                if (a29Var == null) {
                    a8i.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    em5Var.L0(a29Var);
                }
                LogSessionId sessionId = a29Var.d.getSessionId();
                synchronized (n4cVar) {
                    x6i x6iVar = n4cVar.b;
                    x6iVar.getClass();
                    LogSessionId logSessionId = (LogSessionId) x6iVar.b;
                    LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                    hsi.g(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                    x6iVar.b = sessionId;
                }
                return;
            case 1:
                ((zw5) this.c).a((d9a) this.d, this.b, (w8a) this.o);
                return;
            case 2:
                ((f29) this.c).d((w69) this.d, (ao6) this.o, this.b);
                return;
            case 3:
                o79 o79Var = (o79) this.c;
                boolean z2 = this.b;
                u69 u69Var = (u69) this.d;
                Runnable runnable = (Runnable) this.o;
                z89 z89Var = o79Var.g;
                if (z2) {
                    aie aieVar = new aie("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        dy dyVarV = z89Var.d.v(u69Var);
                        if (dyVarV != null) {
                            i = dyVarV.s(o79.E).Z;
                        } else if (o79Var.h(u69Var)) {
                            a6a.c(new yie(0));
                            i = 0;
                        } else {
                            a6a.c(new yie(-100));
                        }
                        t69 t69Var = u69Var.d;
                        if (t69Var != null) {
                            t69Var.d(i, aieVar);
                        }
                    } catch (DeadObjectException unused2) {
                        z89Var.d.H(u69Var);
                        a6a.c(new yie(-100));
                    } catch (RemoteException e) {
                        a8i.m("MediaSessionImpl", "Exception in " + u69Var, e);
                        a6a.c(new yie(-1));
                    }
                }
                runnable.run();
                z89Var.d.l(u69Var);
                return;
            default:
                vd vdVar = (vd) this.c;
                v69 v69Var = (v69) this.d;
                boolean z3 = this.b;
                u69 u69Var2 = (u69) this.o;
                o79 o79Var2 = ((z79) vdVar.d).g;
                a5c a5cVar = o79Var2.t;
                rei.h(a5cVar, v69Var);
                int playbackState = a5cVar.getPlaybackState();
                if (playbackState == 1) {
                    if (a5cVar.S(2)) {
                        a5cVar.prepare();
                    }
                } else if (playbackState == 4 && a5cVar.S(4)) {
                    a5cVar.k();
                }
                if (z3 && a5cVar.S(1)) {
                    a5cVar.play();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i2 : new int[]{31, 2}) {
                    hsi.g(!false);
                    sparseBooleanArray.append(i2, true);
                }
                if (z3) {
                    hsi.g(!false);
                    sparseBooleanArray.append(1, true);
                }
                hsi.g(!false);
                o79Var2.q(u69Var2);
                return;
        }
    }

    public /* synthetic */ ul5(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.o = obj3;
    }

    public /* synthetic */ ul5(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.o = obj3;
    }
}
