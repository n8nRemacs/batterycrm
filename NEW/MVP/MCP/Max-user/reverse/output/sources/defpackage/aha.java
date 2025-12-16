package defpackage;

import android.os.StrictMode;
import android.os.SystemClock;
import java.net.ConnectException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import one.me.sdk.net.client.api.ConnectingCanceledException;

/* loaded from: classes2.dex */
public final class aha extends zhe {
    public final pga K;
    public volatile gr3 L;

    public aha(bha bhaVar) {
        super(bhaVar, "Session#");
        this.K = bhaVar.l;
        this.L = new b6a(25);
    }

    @Override // defpackage.zhe
    public final void A() {
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "startPacketReader", null);
            }
        }
        this.H.a(new zga(this, 0), "session-reader-packet").start();
    }

    @Override // defpackage.zhe
    public final boolean g() {
        return this.L.close();
    }

    @Override // defpackage.zhe
    public final boolean h(int i) {
        lg8 lg8Var = lg8.d;
        if (n()) {
            long jD = zhe.D();
            r();
            try {
                String str = this.a;
                l6b l6bVar = wqi.a;
                if (l6bVar != null && l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "Connect", null);
                }
                this.L = ((wq5) this.K).r();
                y(1);
                this.e.set(System.currentTimeMillis());
                s(i);
                this.i.set(0);
                this.j.set(0L);
                String str2 = this.a;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, str2, "Connect success, time: " + (zhe.D() - jD) + ", conn=" + this.L, null);
                }
                return true;
            } catch (Exception e) {
                if ((e instanceof ConnectException) && this.E != null) {
                    wqi.h("TTSession", "disableConnProblems", null);
                    gmf gmfVar = gmf.a;
                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                }
                y(0);
                t();
                if (e instanceof ConnectingCanceledException) {
                    String str3 = this.a;
                    l6b l6bVar3 = wqi.a;
                    if (l6bVar3 != null) {
                        lg8 lg8Var2 = lg8.X;
                        if (l6bVar3.b(lg8Var2)) {
                            l6bVar3.c(lg8Var2, str3, "connectToSocket canceled", null);
                        }
                    }
                } else {
                    u(e, false);
                    C(e);
                    wqi.e(this.a, "connectToSocket failure!", e);
                }
            }
        }
        return false;
    }

    @Override // defpackage.zhe
    public final void j() {
    }

    @Override // defpackage.zhe
    public final long l() {
        gge ggeVar = ((wq5) this.K).m;
        ggeVar.g();
        boolean zF = ((uda) ggeVar.b).c.f();
        long j = ((AtomicLong) ggeVar.d).get();
        boolean z = ((AtomicBoolean) ggeVar.c).get();
        int i = ((AtomicInteger) ggeVar.o).get();
        long jH = 0;
        if (z && zF) {
            int i2 = s65.d;
        } else if (z) {
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.X;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "ConnectionBackoff", "value, " + ggeVar + ", hasNetwork=" + zF + " -> 500ms", null);
                }
            }
            int i3 = s65.d;
            jH = v9j.h(500, y65.MILLISECONDS);
        } else if (i == 0) {
            int i4 = s65.d;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - (j + fj0.p(i, false));
            if (jElapsedRealtime >= 0) {
                int i5 = s65.d;
            } else {
                int i6 = s65.d;
                long jI = v9j.i(jElapsedRealtime, y65.MILLISECONDS);
                if (jI < 0) {
                    jI = s65.o(jI);
                }
                jH = jI;
            }
        }
        return s65.g(jH);
    }

    @Override // defpackage.zhe
    public final int v(int i, byte[] bArr, int i2) {
        return this.L.v(i, bArr, i2);
    }

    @Override // defpackage.zhe
    public final byte[] w() {
        byte[] bArr = new byte[10];
        this.L.t(bArr);
        return bArr;
    }

    @Override // defpackage.zhe
    public final void x(byte[] bArr) {
        this.L.a(bArr);
    }

    @Override // defpackage.zhe
    public final void y(int i) {
        int andSet = this.c.getAndSet(i);
        if (i == 0) {
            this.h.set(false);
            this.L.close();
        }
        this.z.a();
        if (andSet != i && n()) {
            this.A.a();
        }
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, wy1.i("setConnectionsStatus, status=", zhe.m(i), ", old=", zhe.m(andSet)), null);
        }
    }

    @Override // defpackage.zhe
    public final void z(boolean z) {
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("setTryToConnect, tryToConnect=", z), null);
            }
        }
        ((wq5) this.K).g(z);
        this.f.set(z);
        if (z) {
            this.z.a();
        }
    }
}
