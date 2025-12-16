package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public abstract class ds1 implements u01, mt1, q8a, ns8 {
    public boolean b;
    public Runnable c;
    public final si1 d;
    public final b7d e;
    public final y6d f;
    public final s06 g;
    public final ove h;
    public final r8a j;
    public final dj1 k;
    public final qf1 l;
    public final us8 m;
    public k01 n;
    public final y8g o;
    public boolean q;
    public zpb r;
    public final h1e s;
    public long t;
    public long u;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final ArrayList i = new ArrayList();
    public int p = 0;

    public ds1(dj1 dj1Var, r8a r8aVar, si1 si1Var, y6d y6dVar, b7d b7dVar, s06 s06Var, ove oveVar, qf1 qf1Var, us8 us8Var, h1e h1eVar, y8g y8gVar) {
        w0a.f();
        this.d = si1Var;
        this.f = y6dVar;
        this.e = b7dVar;
        this.g = s06Var;
        this.k = dj1Var;
        this.j = r8aVar;
        this.l = qf1Var;
        qf1Var.a.a.add(this);
        qf1Var.l.a.add(this);
        r8aVar.b(this);
        this.h = oveVar;
        this.m = us8Var;
        this.s = h1eVar;
        this.o = y8gVar;
    }

    public static String y(int i) {
        return i == 0 ? "PASSIVE" : "ACTIVE";
    }

    public abstract String A();

    public void B(ti1 ti1Var, List list, boolean z, uz0 uz0Var) {
    }

    public void C() {
    }

    public void D() {
    }

    public final boolean E(mdg mdgVar) {
        return v().equals(mdgVar);
    }

    public final boolean F() {
        return this.p == 1;
    }

    public final void G() {
        if (this.b) {
            return;
        }
        ri1 ri1Var = this.d.b;
        if (this.c == null) {
            this.c = t();
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.postDelayed(runnable, WorkRequest.MIN_BACKOFF_MILLIS);
            this.u = this.o.getMsSinceBoot();
        }
    }

    public void H(ti1 ti1Var, fje fjeVar, boolean z, vz0 vz0Var) {
    }

    public void I() {
        w0a.f();
        us8 us8Var = this.m;
        if (us8Var != null) {
            us8Var.c.log("MediaAdaptation", "Releasing media adaptation controller");
            us8Var.a.j.remove(us8Var);
        }
        this.j.a.remove(this);
        this.l.a.a.remove(this);
        this.n = null;
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
    }

    public void J(long j, long j2) {
    }

    public void K(a7d a7dVar) {
    }

    public void L(boolean z) {
    }

    public void M(wdf wdfVar) {
    }

    public void N(List list) {
        w0a.f();
        ArrayList arrayList = this.i;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public void O(nt1 nt1Var, List list) {
    }

    public final void P(String str) {
        this.f.log(A(), str);
    }

    public void Q(List list) {
    }

    public abstract void R(zpb zpbVar);

    public final void S(String str) {
        this.f.log(A(), str);
    }

    @Override // defpackage.mt1
    public void c(usd usdVar) {
    }

    @Override // defpackage.q8a
    public void h(r8a r8aVar) {
    }

    @Override // defpackage.ns8
    public final void n(os8 os8Var) {
        if (F()) {
            zpb zpbVar = os8Var.c;
            if (zpbVar == null) {
                zpbVar = this.r;
            }
            R(zpbVar);
        }
    }

    @Override // defpackage.u01
    public void onActiveParticipantUpdated(t01 t01Var) {
    }

    @Override // defpackage.u01
    public void onActiveParticipantsAdded(p01 p01Var) {
    }

    @Override // defpackage.u01
    public void onActiveParticipantsChanged(q01 q01Var) {
    }

    @Override // defpackage.u01
    public void onActiveParticipantsDeAnonimized(r01 r01Var) {
    }

    @Override // defpackage.u01
    public void onActiveParticipantsRemoved(s01 s01Var) {
    }

    public void p() {
    }

    public void q(ti1 ti1Var, SessionDescription sessionDescription) {
    }

    public void r(yi1 yi1Var, boolean z) {
    }

    public final void s(String str) {
        this.f.log(A(), str);
    }

    public abstract Runnable t();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('@');
        boolean z = w0a.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append('{');
        sb.append(y(this.p));
        sb.append('}');
        return sb.toString();
    }

    public long u() {
        return -1L;
    }

    public abstract mdg v();

    public final yi1 w(ti1 ti1Var) {
        if (ti1Var != null) {
            return this.k.j(ti1Var);
        }
        return null;
    }

    public Map x() {
        return null;
    }

    public void z(eef eefVar) {
    }
}
