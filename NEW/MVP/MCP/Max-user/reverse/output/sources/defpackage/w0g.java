package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class w0g implements mje, tr3 {
    public final AtomicReference X;
    public final AtomicLong Y;
    public final String Z;
    public final j35 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final Set s0;

    public w0g(j35 j35Var, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, oje ojeVar, di8 di8Var) {
        this.a = j35Var;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.o = k18Var4;
        AtomicReference atomicReference = new AtomicReference(null);
        this.X = atomicReference;
        this.Y = new AtomicLong(0L);
        this.Z = "SessionController";
        this.s0 = Collections.synchronizedSet(new HashSet());
        ojeVar.a(this);
        ((lr3) k18Var4.getValue()).a().c(this);
        di8Var.q(!((fxa) k18Var2.getValue()).b());
        q28 q28VarH = j35Var.h();
        l5c l5cVar = ((z7c) k18Var.getValue()).b;
        l5cVar.getClass();
        q28VarH.j = (int) l5cVar.m(PmsKey.f135sendqueuesize, 30);
        atomicReference.set(q28VarH.a());
    }

    @Override // defpackage.tr3
    public final void a() {
        c(false);
    }

    @Override // defpackage.tr3
    public final void b() {
        zhe zheVar;
        wqi.c(this.Z, "onConnectionTypeChange", new Object[0]);
        AtomicReference atomicReference = this.X;
        zhe zheVar2 = (zhe) atomicReference.get();
        if (zheVar2 == null) {
            return;
        }
        k18 k18Var = this.o;
        if (!((lr3) k18Var.getValue()).a().f()) {
            zheVar2.z(false);
            zheVar2.j();
        } else if (((lr3) k18Var.getValue()).f() && (zheVar = (zhe) atomicReference.updateAndGet(new v0g(this, 0))) != null) {
            zheVar.z(true);
        }
    }

    public final void c(boolean z) {
        if (!z) {
            k18 k18Var = this.o;
            if (!((lr3) k18Var.getValue()).a().f() || !((lr3) k18Var.getValue()).f()) {
                return;
            }
        }
        zhe zheVar = (zhe) this.X.updateAndGet(new v0g(this, 0));
        if (zheVar != null) {
            zheVar.z(true);
        }
    }

    @Override // defpackage.mje
    public final void d(int i) {
        AtomicReference atomicReference = this.X;
        String str = this.Z;
        if (i == 0) {
            wqi.q(str, "onNoNet", new Object[0]);
            zhe zheVar = (zhe) atomicReference.get();
            if (zheVar != null) {
                g(zheVar);
                return;
            }
            return;
        }
        if (i == 1) {
            wqi.c(str, "onDisconnected", new Object[0]);
            zhe zheVar2 = (zhe) atomicReference.get();
            if (zheVar2 == null) {
                wqi.q(str, "onDisconnected, has NO active session!", new Object[0]);
                return;
            } else {
                g(zheVar2);
                return;
            }
        }
        if (i == 2) {
            wqi.c(str, "onConnected", new Object[0]);
        } else if (i == 3) {
            wqi.c(str, "onLoggedIn", new Object[0]);
        } else {
            throw new IllegalStateException(("Unknown session state=" + i).toString());
        }
    }

    public final void e() {
        int size;
        zhe zheVar = (zhe) this.X.get();
        if (zheVar != null && this.s0.isEmpty()) {
            l5c l5cVar = ((z7c) this.b.getValue()).b;
            l5cVar.getClass();
            int iM = (int) l5cVar.m(PmsKey.f40disconnecttimeout, HttpStatus.SC_MULTIPLE_CHOICES);
            if (iM <= 0 || !((fxa) this.c.getValue()).b() || ((lv4) this.d.getValue()).d() || ((lv4) this.d.getValue()).c()) {
                return;
            }
            long j = this.Y.get();
            int i = s65.d;
            ((lv4) this.d.getValue()).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            y65 y65Var = y65.MILLISECONDS;
            boolean z = s65.d(s65.k(v9j.i(jElapsedRealtime, y65Var), v9j.i(j, y65Var)), v9j.h(iM, y65Var)) > 0;
            if (j <= 0 || !z) {
                return;
            }
            synchronized (zheVar.y) {
                size = zheVar.x.size();
            }
            if (size != 0) {
                return;
            }
            wqi.c(this.Z, "disconnectIfNeeded: timeout expired, disconnect", new Object[0]);
            zheVar.z(false);
            zheVar.j();
        }
    }

    public final void f() {
        this.X.getAndUpdate(new v0g(this, 1));
    }

    public final void g(zhe zheVar) {
        String str = this.Z;
        wqi.c(str, "updateSession", new Object[0]);
        k18 k18Var = this.o;
        if (!((lr3) k18Var.getValue()).a().f()) {
            wqi.q(str, "updateSession, seems there is NO net", new Object[0]);
            zheVar.z(false);
        } else if (((lr3) k18Var.getValue()).f()) {
            zheVar.z(true);
        } else {
            wqi.q(str, "updateSession, connection is NOT permitted", new Object[0]);
            zheVar.z(false);
        }
    }
}
