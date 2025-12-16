package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class vhe implements Runnable {
    public final /* synthetic */ zhe X;
    public final String a;
    public final Locale b = Locale.ENGLISH;
    public long c;
    public long d;
    public int o;

    public vhe(zhe zheVar) {
        this.X = zheVar;
        this.a = ho7.f(zheVar.l, "[CONN_WATCHDOG]#");
    }

    public final int a() {
        if (this.d > 0) {
            return this.o;
        }
        return -1;
    }

    public final void b(String str) {
        wqi.c(this.X.a, "%s: %s", this.a, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b("started ->");
        this.c = System.currentTimeMillis();
        loop0: while (true) {
            long j = -1;
            while (true) {
                if (!this.X.o()) {
                    break loop0;
                }
                oqc oqcVar = this.X.z;
                oqcVar.getClass();
                try {
                    oqcVar.b(j);
                    if (!this.X.o()) {
                        wqi.o(this.X.a, null, "%s: %s", Arrays.copyOf(new Object[]{this.a, String.format(this.b, "detect CLOSED session in %dms, EXIT", Long.valueOf(System.currentTimeMillis() - this.c))}, 2));
                        break loop0;
                    }
                    int i = this.X.c.get();
                    if (i == 0) {
                        wqi.o(this.X.a, null, "%s: %s", Arrays.copyOf(new Object[]{this.a, String.format(this.b, "active_conn#%d, detect disconnected status", Integer.valueOf(a()))}, 2));
                    } else if (i == 1) {
                        b(String.format(this.b, "active_conn#%d, detect connected status", Integer.valueOf(a())));
                        break;
                    } else if (i == 2) {
                        b(String.format(this.b, "active_conn#%d, detect loggedIn status", Integer.valueOf(a())));
                        break;
                    }
                    if (!this.X.f.get()) {
                        break;
                    }
                    b(String.format(this.b, "active_conn#%d, detect tryToConnect status ...", Integer.valueOf(a())));
                    long jL = this.X.l();
                    b(String.format(this.b, "next conn_delay=%dms", Long.valueOf(jL)));
                    if (jL > 0) {
                        b(String.format(this.b, "setup waiting timeout=%dms", Long.valueOf(jL)));
                        j = jL;
                    } else if (this.X.o()) {
                        if (this.X.n()) {
                            if (this.d > 0) {
                                wqi.o(this.X.a, null, "%s: %s", Arrays.copyOf(new Object[]{this.a, String.format(this.b, "active_conn#%d, finished in %dms <-", Integer.valueOf(this.o), Long.valueOf(System.currentTimeMillis() - this.d))}, 2));
                            }
                            this.d = -1L;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (this.X.h(this.o)) {
                            zhe zheVar = this.X;
                            if (zheVar.k.compareAndSet(false, true)) {
                                wqi.c(zheVar.a, "tryToCreateOtherThreads", new Object[0]);
                                zheVar.B();
                                zheVar.A();
                                String str = zheVar.a;
                                l6b l6bVar = wqi.a;
                                if (l6bVar != null) {
                                    lg8 lg8Var = lg8.d;
                                    if (l6bVar.b(lg8Var)) {
                                        l6bVar.c(lg8Var, str, "startPacketSender", null);
                                    }
                                }
                                zheVar.H.a(new whe(zheVar, 1), "session-sender-packet").start();
                            }
                            this.o++;
                            yq3 yq3VarK = this.X.o.k();
                            yq3VarK.c = this.o;
                            zq3 zq3VarA = yq3VarK.a();
                            Locale locale = this.b;
                            this.X.G.a.getClass();
                            b(String.format(locale, "connectToSocket() took %dms, perf_metrics=%s", Long.valueOf(SystemClock.elapsedRealtime() - jCurrentTimeMillis), zq3VarA));
                            this.d = System.currentTimeMillis();
                            b(String.format(this.b, "active_conn#%d, started ->", Integer.valueOf(this.o)));
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    wqi.f(this.X.a, "%s: %s", this.a, String.format(this.b, "waiting was interrupted in %dms, EXIT", Long.valueOf(System.currentTimeMillis() - this.c)));
                }
            }
        }
        b(String.format(this.b, "finished in %dms <-", Long.valueOf(System.currentTimeMillis() - this.c)));
        zhe.a(this.X);
        zhe.d(this.X);
    }
}
