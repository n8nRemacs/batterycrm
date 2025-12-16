package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class vgb extends rl0 {
    public static final bwf Q = new bwf(new zfb(3));
    public static final bwf R = new bwf(new zfb(4));
    public final Context A;
    public final qha B;
    public final String C;
    public final hd5 D;
    public final ngg E;
    public final cn5 F;
    public final qgb G;
    public boolean H;
    public int I;
    public final ugb J;
    public final tgb K;
    public String L;
    public final em5 M;
    public final a3b N;
    public final iv6 O;
    public final pl0 P;

    public vgb(Context context, Looper looper, ygb ygbVar, qha qhaVar, vh4 vh4Var) {
        String str;
        this.A = context;
        this.B = qhaVar;
        if (fk6.c.compareTo(fk6.u0) > 0) {
            Log.e("OneVideoExoPlayer", "trackSelectionConfig is invalid!!!");
        }
        String string = f4f.b;
        if (string == null) {
            String packageName = context.getPackageName();
            try {
                str = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = null;
            }
            str = str == null ? "?" : str;
            StringBuilder sb = new StringBuilder("OneExoPlayer/2.6.4");
            sb.append(" (Linux;Android " + Build.VERSION.RELEASE + ")");
            StringBuilder sb2 = new StringBuilder(" App:PackageName/");
            sb2.append(packageName);
            sb.append(sb2.toString());
            sb.append(" App:Version/".concat(str));
            sb.append(" AndroidXMedia3/1.8.0");
            string = sb.toString();
            f4f.b = string;
        }
        this.C = string;
        mhb mhbVar = new mhb(context, new khb(new sgb(this, 0), new sgb(this, 1)), vh4Var);
        k9e k9eVar = new k9e(0L, 0L);
        this.D = hd5.a;
        ngg nggVar = new ngg(mhbVar, this.a);
        nggVar.b = new ssb(this, 13, this.i);
        this.E = nggVar;
        cn5 cn5Var = new cn5(this, this.k);
        this.F = cn5Var;
        ia2 ia2Var = new ia2(1);
        qgb qgbVarM = wha.z0.m(context);
        qgbVarM.b.add(cn5Var);
        this.G = qgbVarM;
        yn4 yn4Var = new yn4(1, zxg.U(20L), zxg.U(500L));
        this.I = -1;
        ugb ugbVar = new ugb(this);
        this.J = ugbVar;
        tgb tgbVar = new tgb(this);
        this.K = tgbVar;
        sgb sgbVar = new sgb(this, 2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ia2Var);
        ihb ihbVar = new ihb(context, arrayList);
        ihbVar.c = true;
        ihbVar.d = new ao6(25, sgbVar);
        hl5 hl5Var = new hl5(context, ihbVar);
        hl5Var.c(mhbVar);
        hsi.g(!hl5Var.x);
        hl5Var.s = yn4Var;
        hsi.g(!hl5Var.x);
        hl5Var.g = new eo4(8, qgbVarM);
        Looper looper2 = (Looper) R.getValue();
        hsi.g((hl5Var.x || looper2 == Looper.getMainLooper()) ? false : true);
        hl5Var.w = new pea(looper2);
        hsi.g(!hl5Var.x);
        hl5Var.u = 2000L;
        hsi.g(!hl5Var.x);
        hl5Var.v = false;
        hsi.g(!hl5Var.x);
        hl5Var.i = looper;
        hl5Var.b(ygbVar);
        em5 em5VarA = hl5Var.a();
        ua8 ua8Var = em5VarA.x0;
        em5VarA.A1();
        if (!em5VarA.W0.equals(k9eVar)) {
            em5VarA.W0 = k9eVar;
            em5VarA.w0.Z.a(5, k9eVar).b();
        }
        ua8Var.a(ugbVar);
        em5VarA.L0(tgbVar);
        ua8Var.a(nggVar);
        em5VarA.L0(nggVar);
        lk6 lk6Var = p9c.a;
        int i = em5VarA.l1;
        em5VarA.A1();
        if (!Objects.equals(em5VarA.m1, lk6Var)) {
            if (em5VarA.n1) {
                lk6 lk6Var2 = em5VarA.m1;
                lk6Var2.getClass();
                lk6Var2.W(i);
            }
            if (lk6Var == null || !em5VarA.b1()) {
                em5VarA.n1 = false;
            } else {
                lk6Var.l(i);
                em5VarA.n1 = true;
            }
            em5VarA.m1 = lk6Var;
        }
        uld uldVar = this.b;
        if (uldVar != null) {
            uldVar.a(this, new xo8(em5VarA, 28, this), new Handler(em5VarA.E0));
        }
        this.M = em5VarA;
        this.N = new a3b(16, new wu7(29, this));
        this.O = new iv6(27, this);
        this.P = new pl0(this);
    }

    public static final c32 e(vgb vgbVar, t3c t3cVar) {
        vm5 vm5Var = vgbVar.r;
        uch uchVarA = vm5Var != null ? vm5Var.a(t3cVar.b) : null;
        int i = t3cVar.b;
        Objects.toString(uchVarA);
        if (uchVarA instanceof yc4) {
            ((yc4) uchVarA).getClass();
        }
        return new c32(t3cVar.b, t3cVar.f, (Long) null);
    }

    public final int f() {
        int iT = this.M.t();
        vm5 vm5Var = this.r;
        if (vm5Var == null || iT >= vm5Var.a.size()) {
            return -1;
        }
        return iT;
    }

    public final long g() {
        uch uchVarH = h();
        if (uchVarH instanceof yc4) {
            h();
            ((yc4) uchVarH).getClass();
            return 0L;
        }
        em5 em5Var = this.M;
        if (em5Var.getDuration() == -9223372036854775807L) {
            return 0L;
        }
        return em5Var.e();
    }

    public final uch h() {
        vm5 vm5Var = this.r;
        if (vm5Var != null) {
            return vm5Var.a(this.M.t());
        }
        return null;
    }

    public final long i(v3h v3hVar) {
        long j = this.p;
        if (j == 0) {
            return 100L;
        }
        return (long) (((this.o / j) / (1000.0d / (Double.compare((double) v3hVar.g, 0.0d) != 0 ? v3hVar.g : 1.0f))) * 100.0d);
    }

    public final void j(s9g s9gVar) {
        Objects.toString(s9gVar);
        em5 em5Var = this.M;
        if (s9gVar == null) {
            s9gVar = em5Var.v();
        }
        if (s9gVar.p()) {
            return;
        }
        q9g q9gVar = new q9g();
        s9gVar.n(0, q9gVar);
        if (q9gVar.j != null) {
            long jE = em5Var.e();
            long jM0 = zxg.m0(q9gVar.l);
            em5Var.x0();
            em5Var.w0();
            em5Var.n0();
            em5Var.getDuration();
            zxg.E(q9gVar.g);
            if (jM0 == -9223372036854775807L || jE >= jM0) {
                return;
            }
            em5Var.F0(5, jM0);
        }
    }

    public final void k(c32 c32Var, boolean z) {
        this.o = 0.0d;
        this.p = 0L;
        SystemClock.elapsedRealtime();
        new Exception();
        vm5 vm5Var = this.r;
        if (vm5Var == null) {
            return;
        }
        uch uchVarA = vm5Var.a(c32Var.b);
        if (uchVarA instanceof yc4) {
            ((yc4) uchVarA).getClass();
        }
        Objects.toString(vm5Var);
        Objects.toString(c32Var);
        mn3 mn3Var = null;
        if (vm5Var.a.size() != 0) {
            mn3 mn3Var2 = new mn3(new ck0[0]);
            Iterator it = vm5Var.a.iterator();
            while (it.hasNext()) {
                ck0 ck0Var = (ck0) vm5Var.b.invoke((uch) it.next());
                synchronized (mn3Var2) {
                    int size = mn3Var2.k.size();
                    synchronized (mn3Var2) {
                        mn3Var2.B(size, Collections.singletonList(ck0Var), null);
                    }
                }
            }
            mn3Var = mn3Var2;
        }
        if (mn3Var != null) {
            long j = c32Var.c;
            if (vm5Var.a(c32Var.b) instanceof yc4) {
                j = -9223372036854775807L;
            }
            this.i.c(this);
            em5 em5Var = this.M;
            List listSingletonList = Collections.singletonList(mn3Var);
            int i = c32Var.b;
            em5Var.A1();
            em5Var.n1(listSingletonList, i, j, false);
            this.H = z;
            this.M.o1(z);
            this.M.prepare();
            uld uldVar = this.b;
            if (uldVar != null) {
                uldVar.e(this);
            }
        }
    }
}
