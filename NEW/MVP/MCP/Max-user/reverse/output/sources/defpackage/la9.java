package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class la9 implements Runnable {
    public final Handler a;
    public final hhg b;
    public final long c;
    public final long d;
    public final s6b o;
    public final String X = la9.class.getName();
    public long Y = Long.MIN_VALUE;
    public int Z = Integer.MIN_VALUE;
    public final l16 s0 = new l16(11);

    public la9(Handler handler, hhg hhgVar, long j, long j2, s6b s6bVar) {
        this.a = handler;
        this.b = hhgVar;
        this.c = j;
        this.d = j2;
        this.o = s6bVar;
    }

    public final void a() {
        String str = this.X;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "cancel", null);
            }
        }
        this.a.removeCallbacks(this);
        this.Y = Long.MIN_VALUE;
        this.Z = Integer.MIN_VALUE;
    }

    public final void b() {
        String str = this.X;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "start", null);
            }
        }
        this.a.postDelayed(this, this.c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        hhg hhgVar = this.b;
        l16 l16Var = this.s0;
        int iD = hhgVar.d(l16Var);
        long j = this.Y;
        if (j == Long.MIN_VALUE) {
            this.Y = jElapsedRealtime;
            if (iD == 2) {
                this.Z = l16Var.b;
            }
        } else {
            String str = this.X;
            if (iD != 2 || (i = l16Var.b) <= this.Z) {
                long j2 = jElapsedRealtime - j;
                if (j2 >= this.d) {
                    wqi.q(str, "it seems media transform is stuck, ~ " + (j2 / 1000.0f) + " s", new Object[0]);
                }
            } else {
                this.Y = jElapsedRealtime;
                this.Z = i;
                wqi.c(str, "media transform progress=" + i + "%", new Object[0]);
                s6b s6bVar = this.o;
                if (s6bVar != null) {
                    s6bVar.b(this.Z / 100.0f);
                }
            }
        }
        this.a.postDelayed(this, this.c);
    }
}
