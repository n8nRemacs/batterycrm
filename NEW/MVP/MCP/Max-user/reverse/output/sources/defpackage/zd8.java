package defpackage;

import android.net.Uri;
import android.os.Build;

/* loaded from: classes2.dex */
public class zd8 implements ace, zbe {
    public final ne8 a;
    public final dce b;
    public final m0g c;
    public final zl3 d = new zl3();
    public final pd8 o;

    public zd8(ne8 ne8Var, dce dceVar, m0g m0gVar, pd8 pd8Var) {
        this.a = ne8Var;
        this.b = dceVar;
        this.c = m0gVar;
        this.o = pd8Var;
    }

    @Override // defpackage.ace
    public final void R(fce fceVar) {
        b();
    }

    public void a() {
        this.d.d();
    }

    public final void b() {
        dce dceVar = this.b;
        pd8 pd8Var = this.o;
        zub zubVarE = dceVar.e(pd8Var);
        this.a.n(pd8Var, zub.a(zubVarE, pd8Var), 0, zubVarE != null ? zubVarE.o : null);
    }

    public void c() {
        pd8 pd8Var = this.o;
        long j = pd8Var.b;
        long j2 = pd8Var.b;
        wqi.c("zd8", "loadThumbnail with localMediaId = %d", Long.valueOf(j));
        String str = pd8Var.d;
        int i = Build.VERSION.SDK_INT >= 29 ? 0 : pd8Var.o;
        Uri uriG = tfi.g(pd8Var.c);
        if (uriG != null) {
            wqi.c("zd8", "loadThumbnail: %d, cachedUri is not empty", Long.valueOf(j2));
            d(i, uriG.toString());
            return;
        }
        this.a.n(pd8Var, null, 0, null);
        fce fceVarH = this.b.h(pd8Var);
        if (fceVarH != null) {
            str = l8g.c(fceVarH.d) ? fceVarH.a.d : fceVarH.d;
        }
        wk3 wk3Var = new wk3(5, new tv0(6, str));
        m0g m0gVar = this.c;
        m0gVar.getClass();
        n0g n0gVar = (n0g) m0gVar;
        k2f k2fVar = new k2f(wk3Var.m(n0gVar.a()).i(n0gVar.b()), new ny1(j2, str, 5), 1);
        qu1 qu1Var = new qu1(new pz1(this, str, i, 4), 2, new sl6(12, this));
        k2fVar.k(qu1Var);
        this.d.a(qu1Var);
    }

    public final void d(int i, String str) {
        Uri uriG = tfi.g(str);
        dce dceVar = this.b;
        pd8 pd8Var = this.o;
        zub zubVarE = dceVar.e(pd8Var);
        if (zub.b(zubVarE, pd8Var)) {
            Uri uriA = zub.a(zubVarE, pd8Var);
            if (!uriA.getPath().equals(pd8Var.c)) {
                uriG = uriA;
            }
            i = 0;
        }
        this.a.n(pd8Var, uriG, i, zubVarE != null ? zubVarE.o : null);
    }

    @Override // defpackage.zbe
    public final void n(fce fceVar) {
        pd8 pd8Var = fceVar.a;
        pd8 pd8Var2 = this.o;
        if (pd8Var2 == null || !pd8Var2.c.equals(pd8Var.c)) {
            return;
        }
        d(pd8Var.o, l8g.c(fceVar.d) ? pd8Var.d : fceVar.d);
    }
}
