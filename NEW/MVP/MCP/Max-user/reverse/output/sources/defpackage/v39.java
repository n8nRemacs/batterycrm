package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class v39 implements n7a {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashSet c = new HashSet();
    public final Context d;
    public final yi5 e;
    public final z7c f;
    public final e30 g;
    public final ur3 h;
    public final f28 i;
    public final n1c j;
    public final zk5 k;

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    public v39(Context context, yi5 yi5Var, z7c z7cVar, b8a b8aVar, e30 e30Var, ur3 ur3Var, f28 f28Var, lv4 lv4Var, zg zgVar, qi9 qi9Var, jq jqVar, tw0 tw0Var, ve2 ve2Var, zk5 zk5Var) {
        this.d = context;
        this.e = yi5Var;
        this.f = z7cVar;
        this.g = e30Var;
        this.h = ur3Var;
        this.i = f28Var;
        this.k = zk5Var;
        this.j = new n1c(context, f28Var, lv4Var, zgVar, qi9Var, new i5i(new sl6(22, this)), (w1c) jqVar.o.getValue(), tw0Var, ve2Var);
        synchronized (b8aVar.y0) {
            b8aVar.y0.add(this);
        }
    }

    @Override // defpackage.n7a
    public final void a(long j, l09 l09Var) {
    }

    @Override // defpackage.n7a
    public final void b(long j, l09 l09Var) {
    }

    @Override // defpackage.n7a
    public final void c(long j, l09 l09Var, long j2, l09 l09Var2) {
    }

    @Override // defpackage.n7a
    public final void d(long j, l09 l09Var) {
    }

    @Override // defpackage.n7a
    public final void e(long j, l09 l09Var, long j2) {
    }

    @Override // defpackage.n7a
    public final void f(long j, l09 l09Var) {
    }

    @Override // defpackage.n7a
    public final void g(long j, l09 l09Var) {
    }

    @Override // defpackage.n7a
    public final void h(long j, l09 l09Var) {
        w39 w39Var = w39.c;
        HashMap map = this.b;
        xd8 xd8Var = (xd8) map.get(w39Var);
        if (xd8Var != null) {
            if (o() && xd8Var.i) {
                xd8Var.m();
            } else {
                xd8Var.g();
            }
        }
        xd8 xd8Var2 = (xd8) map.get(w39.d);
        if (xd8Var2 != null) {
            xd8Var2.g();
        }
    }

    @Override // defpackage.n7a
    public final void i(long j, l09 l09Var) {
    }

    @Override // defpackage.n7a
    public final void j(long j, l09 l09Var) {
    }

    public final void k(xd8 xd8Var) {
        if (this.c.contains(xd8Var)) {
            throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
        }
        wqi.c("v39", "attachInternal %s", xd8Var.a);
        w39 w39Var = xd8Var.a;
        HashMap map = this.b;
        xd8 xd8Var2 = (xd8) map.get(w39Var);
        if (xd8Var2 != null && xd8Var2 != xd8Var) {
            xd8Var2.c();
        }
        map.put(w39Var, xd8Var);
    }

    public final void l(xd8 xd8Var) {
        if (this.c.contains(xd8Var)) {
            throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
        }
        wqi.c("v39", "detachInternal %s", xd8Var.a);
        xd8Var.c();
    }

    public final void m(xd8 xd8Var) {
        xd8 xd8Var2;
        w39 w39Var = xd8Var.a;
        w39 w39Var2 = w39.c;
        if (w39Var == w39Var2) {
            boolean zE = xd8Var.e();
            n1c n1cVar = this.j;
            if (zE) {
                n1cVar.getClass();
            } else {
                n1cVar.getClass();
            }
        } else if (w39Var == w39.d && (xd8Var2 = (xd8) this.b.get(w39Var2)) != null) {
            f2h f2hVar = xd8Var.f;
            f2h f2hVar2 = xd8Var2.f;
            if ((f2hVar == null || f2hVar2 == null || !l8g.a(f2hVar.a().toString(), f2hVar2.a().toString())) && o() && xd8Var2.i) {
                xd8Var2.m();
            } else {
                xd8Var2.g();
            }
        }
        if (xd8Var.e()) {
            e30 e30Var = this.g;
            bwf bwfVar = e30Var.j;
            wqi.c("e30", "pause", new Object[0]);
            b8a b8aVar = e30Var.c;
            if (b8aVar.H0) {
                b8aVar.o();
            }
            if (bwfVar.e()) {
                e30.p((PowerManager.WakeLock) bwfVar.getValue(), 0);
            }
        }
    }

    public final boolean o() {
        ur3 ur3Var = this.h;
        boolean zG = ur3Var.g();
        os3 os3VarB = ur3Var.b();
        z7c z7cVar = this.f;
        int i = z7cVar.c.g.getInt("app.video.auto.play", 1);
        if (i != -1) {
            os3 os3Var = os3.c;
            if (i == 0 ? os3VarB == os3Var || z7cVar.c.g.getBoolean("app.media.load.roaming", false) || !zG : os3VarB == os3Var) {
                return true;
            }
        }
        return false;
    }

    public final void p(xd8 xd8Var) {
        HashSet hashSet = this.c;
        if (hashSet.contains(xd8Var)) {
            throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
        }
        wqi.c("v39", "releaseInternal %s", xd8Var.a);
        hashSet.remove(xd8Var);
        w39 w39Var = xd8Var.a;
        fl5 fl5Var = xd8Var.b;
        if (xd8Var.f != null && xd8Var.g != null) {
            wqi.c("xd8", "Release %s", w39Var);
            xd8Var.g = null;
            xd8Var.c();
            fl5Var.B();
            fl5.c();
            wqi.c("fl5", "Clear", new Object[0]);
            j1f j1fVar = fl5Var.a;
            j1fVar.L0();
            dm5 dm5Var = j1fVar.c;
            dm5Var.d1();
            dm5Var.X0(null);
            dm5Var.U0(0, 0);
            fl5Var.X = null;
            fl5Var.Y = null;
            fl5Var.Z = 0.0f;
            fl5Var.s0 = null;
            fl5Var.t0 = 0;
            fl5Var.u0 = 0;
            fl5Var.v0 = 0;
            fl5Var.w0 = false;
            xd8Var.h();
        }
        HashMap map = this.b;
        xd8 xd8Var2 = (xd8) map.get(w39Var);
        if (xd8Var2 == xd8Var) {
            map.remove(xd8Var2.a);
        }
    }
}
