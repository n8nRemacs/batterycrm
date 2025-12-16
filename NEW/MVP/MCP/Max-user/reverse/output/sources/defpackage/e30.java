package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.PowerManager;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e30 implements MediaRecorder.OnInfoListener, n7a {
    public static final /* synthetic */ int m = 0;
    public final Context a;
    public final tw0 b;
    public final b8a c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final bwf h;
    public final bwf i;
    public final bwf j;
    public volatile long k = -1;
    public volatile long l = -1;

    public e30(Context context, tw0 tw0Var, k18 k18Var, b8a b8aVar, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = context;
        this.b = tw0Var;
        this.c = b8aVar;
        this.d = k18Var;
        this.e = k18Var2;
        this.f = k18Var3;
        this.g = k18Var4;
        this.h = new bwf(new nz(k18Var4, 1));
        final int i = 0;
        this.i = new bwf(new cm6(this) { // from class: z20
            public final /* synthetic */ e30 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(32, "ru.ok.tamtam:tam-tam-prox");
                    default:
                        return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(536870918, "ru.ok.tamtam:tam-tam-screen-dim");
                }
            }
        });
        final int i2 = 1;
        this.j = new bwf(new cm6(this) { // from class: z20
            public final /* synthetic */ e30 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(32, "ru.ok.tamtam:tam-tam-prox");
                    default:
                        return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(536870918, "ru.ok.tamtam:tam-tam-screen-dim");
                }
            }
        });
        synchronized (b8aVar.y0) {
            b8aVar.y0.add(this);
        }
        tw0Var.d(this);
    }

    public static void p(PowerManager.WakeLock wakeLock, int i) {
        if (wakeLock.isHeld()) {
            wqi.c("e30", "Releasing " + wakeLock, new Object[0]);
            wakeLock.release(i);
        }
    }

    @Override // defpackage.n7a
    public final void a(long j, l09 l09Var) {
        r(j, l09Var, false);
    }

    @Override // defpackage.n7a
    public final void b(long j, l09 l09Var) {
        wqi.e("e30", "onError " + j + " type " + l09Var, null);
        t(j, l09Var, 0L);
    }

    @Override // defpackage.n7a
    public final void c(long j, l09 l09Var, long j2, l09 l09Var2) {
        StringBuilder sb = new StringBuilder("onAudioChanged prev=");
        sb.append(j);
        sb.append(" prevType=");
        sb.append(l09Var);
        az1.r(j2, ", curr=", " currType=", sb);
        sb.append(l09Var2);
        wqi.c("e30", sb.toString(), new Object[0]);
        boolean z = this.c.K0;
        if (j != -1 && l09Var == l09.b && !z) {
            q(j, 0L);
        }
        r(j, l09Var, false);
    }

    @Override // defpackage.n7a
    public final void d(long j, l09 l09Var) {
        wqi.c("e30", "onBuffering " + j + " type " + l09Var, new Object[0]);
        u();
        l09 l09Var2 = l09.b;
        bwf bwfVar = this.j;
        if (l09Var == l09Var2) {
            if (!l()) {
                ((PowerManager.WakeLock) bwfVar.getValue()).acquire();
            }
        } else if (l()) {
            p((PowerManager.WakeLock) bwfVar.getValue(), 0);
        }
        r(j, l09Var, false);
    }

    @Override // defpackage.n7a
    public final void e(long j, l09 l09Var, long j2) {
        wqi.c("e30", "onStop " + j + " type " + l09Var, new Object[0]);
        t(j, l09Var, j2);
    }

    @Override // defpackage.n7a
    public final void f(long j, l09 l09Var) {
        wqi.c("e30", "onEnd " + j + " type " + l09Var, new Object[0]);
        t(j, l09Var, ((Number) this.c.C0.getValue()).longValue());
    }

    @Override // defpackage.n7a
    public final void g(long j, l09 l09Var) {
        wqi.c("e30", "onSkipToPrevious " + j + " type " + l09Var, new Object[0]);
        r(j, l09Var, false);
    }

    @Override // defpackage.n7a
    public final void h(long j, l09 l09Var) {
        wqi.c("e30", "onPlay " + j + " type " + l09Var, new Object[0]);
        u();
        l09 l09Var2 = l09.b;
        bwf bwfVar = this.j;
        if (l09Var == l09Var2) {
            if (!l()) {
                ((PowerManager.WakeLock) bwfVar.getValue()).acquire();
            }
        } else if (l()) {
            p((PowerManager.WakeLock) bwfVar.getValue(), 0);
        }
        r(j, l09Var, true);
    }

    @Override // defpackage.n7a
    public final void i(long j, l09 l09Var) {
        wqi.c("e30", "onPause " + j + " type " + l09Var, new Object[0]);
        r(j, l09Var, false);
        if (l09Var == l09.b) {
            if (l()) {
                p((PowerManager.WakeLock) this.j.getValue(), 0);
            }
            q(j, ((Number) this.c.C0.getValue()).longValue());
        }
    }

    @Override // defpackage.n7a
    public final void j(long j, l09 l09Var) {
        wqi.c("e30", "onSkipToNext " + j + " type " + l09Var, new Object[0]);
        r(j, l09Var, false);
    }

    public final boolean k() {
        Object ipdVar;
        bwf bwfVar = this.i;
        if (!bwfVar.e()) {
            return false;
        }
        try {
            ipdVar = Boolean.valueOf(((PowerManager.WakeLock) bwfVar.getValue()).isHeld());
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            ((y3b) ((yi5) this.e.getValue())).a(thA);
        }
        Boolean bool = Boolean.FALSE;
        if (ipdVar instanceof ipd) {
            ipdVar = bool;
        }
        return ((Boolean) ipdVar).booleanValue();
    }

    public final boolean l() {
        Object ipdVar;
        bwf bwfVar = this.j;
        if (!bwfVar.e()) {
            return false;
        }
        try {
            ipdVar = Boolean.valueOf(((PowerManager.WakeLock) bwfVar.getValue()).isHeld());
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            ((y3b) ((yi5) this.e.getValue())).a(thA);
        }
        Boolean bool = Boolean.FALSE;
        if (ipdVar instanceof ipd) {
            ipdVar = bool;
        }
        return ((Boolean) ipdVar).booleanValue();
    }

    public final void m() {
        wqi.c("e30", "onDeviceAwayFromEar", new Object[0]);
        if (k()) {
            bwf bwfVar = this.i;
            if (bwfVar.e()) {
                p((PowerManager.WakeLock) bwfVar.getValue(), 0);
            }
            b8a b8aVar = this.c;
            if (b8aVar.H0 && b8aVar.k() == l09.b) {
                b8aVar.o();
            }
        }
    }

    public final void o() {
        bwf bwfVar = this.i;
        bwf bwfVar2 = this.j;
        try {
            if (bwfVar2.e()) {
                p((PowerManager.WakeLock) bwfVar2.getValue(), 0);
            }
            if (bwfVar.e()) {
                p((PowerManager.WakeLock) bwfVar.getValue(), 1);
            }
        } catch (Throwable th) {
            ((y3b) ((yi5) this.e.getValue())).a(th);
        }
    }

    @vnf
    public final void onEvent(q4a q4aVar) {
        List list = q4aVar.o;
        b8a b8aVar = this.c;
        if (list.contains(Long.valueOf(b8aVar.j())) && b8aVar.M0 == null) {
            wqi.c("e30", "stop", new Object[0]);
            u();
            b8aVar.s();
            o();
        }
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800 || i == 801) {
            this.b.c(new uu(1));
        }
    }

    public final void q(long j, long j2) {
        if (j == -1 || j2 < 0) {
            return;
        }
        svi.e((f84) this.h.getValue(), null, null, new b30(this, j2, j, null), 3);
    }

    public final void r(long j, l09 l09Var, boolean z) {
        wqi.c("e30", "sendEvent " + j + ", " + l09Var + ", " + z, new Object[0]);
        if (j == -1) {
            return;
        }
        if (j == this.k && this.l != -1) {
            s(j, l09Var, this.l);
            return;
        }
        wqi.c("e30", "track changed, should update chatId", new Object[0]);
        if (j != this.k || this.l == -1) {
            svi.e((f84) this.h.getValue(), null, null, new d30(this, j, l09Var, null), 3);
        } else {
            s(j, l09Var, this.l);
        }
    }

    public final void s(long j, l09 l09Var, long j2) {
        wqi.c("e30", "send event internal trackId=" + j + " trackType=" + l09Var + " chatId=" + j2, new Object[0]);
        this.b.c(new b50(l09Var.ordinal(), j, j2));
    }

    public final void t(long j, l09 l09Var, long j2) {
        u();
        r(j, l09Var, false);
        o();
        if (l09Var == l09.b) {
            q(j, j2);
        }
        this.c.q();
    }

    public final void u() {
        wqi.c("e30", "unsubscribe sensors controller", new Object[0]);
        yde ydeVar = (yde) this.d.getValue();
        Set set = ydeVar.c;
        if (set.remove(this) && set.size() == 0 && ydeVar.b != null) {
            ydeVar.a.unregisterListener(ydeVar);
        }
    }
}
