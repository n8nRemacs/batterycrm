package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.player.error.OneVideoPlaybackException;

/* loaded from: classes2.dex */
public abstract class rl0 implements ghb {
    public static final bwf z = new bwf(new l(21));
    public final int a = cyg.a.getAndIncrement();
    public final uld b = (uld) z.getValue();
    public final vhb c;
    public long d;
    public long e;
    public long f;
    public String g;
    public String h;
    public final oh6 i;
    public final CopyOnWriteArrayList j;
    public final yh6 k;
    public final zg6 l;
    public final CopyOnWriteArrayList m;
    public final dh6 n;
    public double o;
    public long p;
    public final ol0 q;
    public vm5 r;
    public final f9 s;
    public float t;
    public py0 u;
    public final pl0 v;
    public OneVideoPlaybackException w;
    public int x;
    public volatile int y;

    public rl0() {
        vhb vhbVar = new vhb(1000, Looper.myLooper());
        this.c = vhbVar;
        this.d = -1L;
        this.e = -1L;
        this.f = -1L;
        this.i = new oh6();
        this.j = new CopyOnWriteArrayList();
        this.k = new yh6();
        this.l = new zg6();
        this.m = new CopyOnWriteArrayList();
        this.n = new dh6();
        SystemClock.elapsedRealtime();
        vgb vgbVar = (vgb) this;
        ol0 ol0Var = new ol0(vgbVar);
        this.q = ol0Var;
        this.s = f9.f;
        this.t = 1.0f;
        this.x = 1;
        this.v = new pl0(vgbVar);
        ql0 ql0Var = new ql0(vgbVar);
        ((LinkedHashSet) vhbVar.b).add(ol0Var);
        a(ql0Var);
        this.y = 1;
    }

    public static void c(rl0 rl0Var, int i) {
        if (rl0Var.y != i) {
            vb9.i(i);
            int i2 = rl0Var.y;
            rl0Var.y = i;
            rl0Var.w = null;
            rl0Var.i.s(rl0Var, i2, i);
        }
    }

    public final void a(dhb dhbVar) {
        oh6 oh6Var = this.i;
        oh6Var.b.add(dhbVar);
        oh6Var.b.size();
        dhbVar.toString();
    }

    public final void b(long j) {
        vgb vgbVar = (vgb) this;
        uch uchVarH = vgbVar.h();
        boolean z2 = false;
        if (uchVarH != null && uchVarH.c) {
            z2 = true;
        }
        long jG = vgbVar.g();
        long jS0 = vgbVar.M.S0();
        SystemClock.elapsedRealtime();
        if (jG == this.d && jS0 == this.e && (!z2 || j == this.f)) {
            return;
        }
        this.d = jG;
        this.e = jS0;
        this.f = j;
        if ((jG <= -1 || j <= -1) && !z2) {
            return;
        }
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            rdf rdfVar = (rdf) it.next();
            long jElapsedRealtime = this.d;
            switch (rdfVar.a) {
                case 0:
                    bwa bwaVar = (bwa) rdfVar.b;
                    if (bwaVar.b == null) {
                        break;
                    } else {
                        ey2 ey2Var = bwaVar.g;
                        y4c y4cVar = ((bwa) ey2Var.d).b;
                        if (y4cVar != null ? y4cVar.h : false) {
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                        }
                        bwa bwaVar2 = (bwa) ey2Var.d;
                        n8i n8iVar = (n8i) ey2Var.c;
                        long j2 = n8iVar.a;
                        if (j2 >= 0 && jElapsedRealtime > n8iVar.b) {
                            n8iVar.b = jElapsedRealtime;
                        }
                        if (bwaVar2.h && jElapsedRealtime - j2 > ey2Var.b) {
                            ey2Var.b();
                            ey2Var.a(jElapsedRealtime);
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
                default:
                    ((z2h) rdfVar.b).k(this);
                    break;
            }
        }
    }

    public final void d(py0 py0Var) {
        Objects.toString(py0Var);
        py0 py0Var2 = this.u;
        if (py0Var2 == py0Var) {
            return;
        }
        if (py0Var2 != null) {
            py0Var2.b = null;
        }
        if (py0Var != null) {
            py0Var.b = this.v;
        }
        this.u = py0Var;
        Surface surface = py0Var != null ? (Surface) py0Var.c : null;
        if (surface == null) {
            vgb vgbVar = (vgb) this;
            new Exception();
            uld uldVar = vgbVar.b;
            if (uldVar != null) {
                uldVar.f(vgbVar, null);
                return;
            } else {
                vgbVar.M.Q0();
                return;
            }
        }
        vgb vgbVar2 = (vgb) this;
        surface.toString();
        new Exception();
        uld uldVar2 = vgbVar2.b;
        if (uldVar2 != null) {
            uldVar2.f(vgbVar2, surface);
        } else {
            vgbVar2.M.s1(surface);
        }
    }
}
