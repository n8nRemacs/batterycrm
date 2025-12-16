package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class hhb implements cbh, q30 {
    public final bm3 X;
    public g2h Y;
    public int Z;
    public final yi5 a;
    public final r4c b;
    public final tih c;
    public final q0h d;
    public final String o;
    public boolean s0;
    public final r30 t0;
    public final vgb u0;
    public final h08 v0;
    public final bwa w0;

    public hhb(Context context, yi5 yi5Var, r4c r4cVar, tih tihVar, q0h q0hVar) {
        this.a = yi5Var;
        this.b = r4cVar;
        this.c = tihVar;
        this.d = q0hVar;
        bwf bwfVar = new bwf(new zfb(5));
        this.o = hhb.class.getName();
        this.X = new bm3();
        this.Z = 1;
        this.s0 = true;
        this.t0 = new r30(context, this);
        qha qhaVar = new qha(20);
        vh4 vh4Var = new vh4();
        yj7 yj7Var = new yj7(4, this);
        new kb8(50000L, 50000L, 1000L, 2000L, false);
        hsi.g(!false);
        hsi.g(true);
        vgb vgbVar = new vgb(context.getApplicationContext(), ((Handler) bwfVar.getValue()).getLooper(), new ygb(new ri4(), -1, yj7Var), qhaVar, vh4Var);
        vgbVar.a(new ehb(this));
        this.u0 = vgbVar;
        this.v0 = new h08(27, vgbVar);
        bwa bwaVar = new bwa();
        bwaVar.d(vgbVar);
        this.w0 = bwaVar;
    }

    @Override // defpackage.cbh
    public final void C(abh abhVar) {
        this.X.a.remove(abhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    @Override // defpackage.cbh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I0(defpackage.g2h r30, boolean r31, defpackage.bbh r32, int r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhb.I0(g2h, boolean, bbh, int, boolean):void");
    }

    @Override // defpackage.cbh
    public final void O(a3h a3hVar) {
        if (a3hVar != null) {
            a3hVar.setPlayer(this.u0);
        }
    }

    @Override // defpackage.cbh
    public final long O0() {
        g2h g2hVar = this.Y;
        if (g2hVar == null) {
            return 0L;
        }
        vgb vgbVar = this.u0;
        return (yzi.b(vgbVar, g2hVar) + vgbVar.M.S0()) - g2hVar.b();
    }

    @Override // defpackage.cbh
    public final void Q(boolean z) {
        int i = 1;
        int i2 = z ? 3 : 1;
        vgb vgbVar = this.u0;
        if (vgbVar.x != i2) {
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                throw null;
            }
            new Exception();
            em5 em5Var = vgbVar.M;
            int iV = az1.v(i2);
            if (iV == 0) {
                i = 0;
            } else if (iV != 1) {
                i = 2;
                if (iV != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            em5Var.A1();
            if (i != em5Var.Q0) {
                em5Var.q1(i);
            }
            if (vgbVar.x != i2) {
                vgbVar.x = i2;
                vgbVar.i.m(vgbVar, i2);
            }
        }
    }

    @Override // defpackage.q30
    public final boolean U0() {
        return this.c.d() || this.s0;
    }

    @Override // defpackage.cbh
    public final void X(abh abhVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.X.a;
        if (copyOnWriteArraySet.contains(abhVar)) {
            return;
        }
        copyOnWriteArraySet.add(abhVar);
    }

    @Override // defpackage.cbh, defpackage.q30
    public final float a() {
        return this.u0.t;
    }

    @Override // defpackage.cbh
    public final void a0(Surface surface) {
        py0 py0Var;
        if (surface == null) {
            py0Var = null;
        } else {
            py0 py0Var2 = new py0(26, false);
            py0Var2.c = surface;
            pl0 pl0Var = (pl0) py0Var2.b;
            if (pl0Var != null) {
                vgb vgbVar = pl0Var.a;
                surface.toString();
                new Exception();
                uld uldVar = vgbVar.b;
                if (uldVar != null) {
                    uldVar.f(vgbVar, surface);
                } else {
                    vgbVar.M.s1(surface);
                }
            }
            py0Var = py0Var2;
        }
        this.u0.d(py0Var);
    }

    @Override // defpackage.cbh, defpackage.q30
    public final void b(float f) {
        vgb vgbVar = this.u0;
        float f2 = vgbVar.t;
        r30 r30Var = this.t0;
        if (f2 == 0.0f && f > 0.0f) {
            r30Var.r(3, this.Z);
        } else if (f2 > 0.0f && f == 0.0f) {
            r30Var.q();
        }
        if (vgbVar.t == f) {
            return;
        }
        new Exception();
        em5 em5Var = vgbVar.M;
        em5Var.A1();
        if (em5Var.g1 != f) {
            em5Var.t1(f);
        }
        em5Var.A1();
        float f3 = em5Var.g1;
        if (vgbVar.t == f3) {
            return;
        }
        vgbVar.t = f3;
        vgbVar.i.g(vgbVar, f3);
    }

    @Override // defpackage.cbh
    public final void clear() {
        this.u0.d(null);
        this.X.a.clear();
        this.Y = null;
    }

    @Override // defpackage.cbh, defpackage.q30
    public final boolean d() {
        int i = fhb.$EnumSwitchMapping$0[az1.v(this.u0.y)];
        return i == 1 || i == 2;
    }

    @Override // defpackage.cbh
    public final long e() {
        g2h g2hVar = this.Y;
        if (g2hVar == null) {
            return 0L;
        }
        vgb vgbVar = this.u0;
        return (yzi.b(vgbVar, g2hVar) + vgbVar.g()) - g2hVar.b();
    }

    @Override // defpackage.cbh
    public final long getDuration() {
        g2h g2hVar = this.Y;
        if (g2hVar == null) {
            return 0L;
        }
        return g2hVar.c() - g2hVar.b();
    }

    @Override // defpackage.cbh
    public final boolean isIdle() {
        return this.u0.y == 1;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.t0.p(i);
    }

    @Override // defpackage.cbh, defpackage.q30
    public final void pause() {
        vgb vgbVar = this.u0;
        vgbVar.getClass();
        new Exception();
        vgbVar.M.o1(false);
    }

    @Override // defpackage.cbh, defpackage.q30
    public final void play() {
        if (this.u0.y == 5) {
            seekTo(0L);
        }
        vgb vgbVar = this.u0;
        vgbVar.getClass();
        new Exception();
        vgbVar.h();
        vgbVar.j(null);
        vgbVar.M.o1(true);
        this.X.r();
        this.t0.r(3, this.Z);
    }

    @Override // defpackage.cbh
    public final void release() {
        bm3 bm3Var = this.X;
        bm3Var.b();
        bm3Var.a.clear();
        this.Y = null;
        this.w0.d(null);
        vgb vgbVar = this.u0;
        vgbVar.getClass();
        new Exception();
        em5 em5Var = vgbVar.M;
        em5Var.i1(vgbVar.J);
        tgb tgbVar = vgbVar.K;
        em5Var.A1();
        nj4 nj4Var = em5Var.D0;
        tgbVar.getClass();
        nj4Var.X.e(tgbVar);
        qgb qgbVar = vgbVar.G;
        qgbVar.b.remove(vgbVar.F);
        ngg nggVar = vgbVar.E;
        em5Var.i1(nggVar);
        em5Var.A1();
        nj4Var.X.e(nggVar);
        em5Var.Q0();
        em5Var.h1();
        uld uldVar = vgbVar.b;
        if (uldVar != null) {
            uldVar.b(vgbVar);
        }
        nggVar.a();
        rl0.c(vgbVar, 7);
        vhb vhbVar = vgbVar.c;
        ((LinkedHashSet) vhbVar.b).remove(vgbVar.q);
        ((LinkedHashSet) vhbVar.b).clear();
        ((a9g) vhbVar.c).b();
        this.t0.q();
    }

    @Override // defpackage.cbh
    public final void seekTo(long j) {
        c32 c32Var;
        uch uchVarA;
        g2h g2hVar = this.Y;
        if (g2hVar == null) {
            return;
        }
        long jE = n7j.e(g2hVar.b() + j, g2hVar.b(), g2hVar.c());
        if (g2hVar instanceof cn3) {
            Iterator it = ((cn3) g2hVar).a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    c32Var = new c32(0, 0L, (Long) null);
                    break;
                }
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    ve3.p();
                    throw null;
                }
                long j2 = ((bn3) next).d;
                jE -= j2;
                if (jE <= 0) {
                    c32Var = new c32(i, jE + j2, (Long) null);
                    break;
                }
                i = i2;
            }
        } else {
            c32Var = new c32(0, jE, (Long) null);
        }
        vgb vgbVar = this.u0;
        em5 em5Var = vgbVar.M;
        int i3 = c32Var.b;
        c32Var.toString();
        new Exception();
        new Exception();
        vm5 vm5Var = vgbVar.r;
        if (vm5Var == null || (uchVarA = vm5Var.a(i3)) == null) {
            return;
        }
        int iT = em5Var.t();
        uch uchVarA2 = vm5Var.a(iT);
        vgbVar.h();
        if (iT != i3 && (uchVarA2 instanceof yc4)) {
            ((yc4) uchVarA2).getClass();
        }
        if (!(uchVarA instanceof yc4)) {
            em5Var.E0(i3, c32Var.c, false);
            return;
        }
        c32 c32Var2 = new c32(vgbVar.f(), vgbVar.g(), (Long) null);
        if (c32Var.equals(c32Var2)) {
            return;
        }
        vgbVar.k(c32Var, true);
        vgbVar.i.q(vgbVar, chb.b, c32Var2, c32Var);
    }

    @Override // defpackage.cbh
    public final void stop() {
        vgb vgbVar = this.u0;
        vgbVar.getClass();
        new Exception();
        vgbVar.r = null;
        vgbVar.M.u1();
        vgbVar.M.b0();
        uld uldVar = vgbVar.b;
        if (uldVar != null) {
            uldVar.e(vgbVar);
        }
        if (vgbVar.y == 6) {
            rl0.c(vgbVar, 1);
        }
    }

    @Override // defpackage.cbh
    public final boolean y0() {
        return this.u0.y == 4;
    }
}
