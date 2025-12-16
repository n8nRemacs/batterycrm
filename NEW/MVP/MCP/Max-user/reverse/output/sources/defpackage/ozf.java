package defpackage;

import java.io.File;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* loaded from: classes2.dex */
public final class ozf implements tr3 {
    public final k18 X;
    public final k18 Y;
    public qu1 Z;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public v08 s0;
    public ao6 t0;
    public int u0;
    public long v0;

    public ozf(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.o = k18Var5;
        this.X = k18Var6;
        this.Y = k18Var7;
    }

    @Override // defpackage.tr3
    public final void a() {
    }

    @Override // defpackage.tr3
    public final void b() {
        if (((ur3) this.Y.getValue()).b() == os3.c) {
            c(this.t0);
        } else {
            bwd.b(this.s0);
            e(this.t0);
        }
    }

    public final void c(ao6 ao6Var) {
        wqi.c("ozf", "Load font", new Object[0]);
        this.t0 = ao6Var;
        if (!bwd.c(this.Z)) {
            wqi.c("ozf", "Font already loading", new Object[0]);
            return;
        }
        wk3 wk3Var = new wk3(5, new tv0(13, this));
        m0g m0gVar = (m0g) this.o.getValue();
        m0gVar.getClass();
        u2f u2fVarI = wk3Var.m(((n0g) m0gVar).a()).i(u0e.d);
        qu1 qu1Var = new qu1(new mzf(this, ao6Var, 0), 2, new mzf(this, ao6Var, 1));
        u2fVarI.k(qu1Var);
        this.Z = qu1Var;
    }

    public final void d(File file, ao6 ao6Var) {
        wqi.c("ozf", "Tam emoji font loaded", new Object[0]);
        de6 de6Var = new de6(new zva(file, this.o, this.X));
        if (ao6Var != null) {
            wqi.c(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontSuccess %s", de6Var);
            ((LoadEmojiFontWorker) ao6Var.b).state = new pb8(de6Var);
        }
        ((ur3) this.Y.getValue()).e(this);
        this.t0 = null;
    }

    public final void e(ao6 ao6Var) {
        if (ao6Var != null) {
            int i = this.u0;
            wqi.c(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontProgressChange %d", Integer.valueOf(i));
            LoadEmojiFontWorker loadEmojiFontWorker = (LoadEmojiFontWorker) ao6Var.b;
            if (i < 0) {
                i = -1;
            } else if (i == 0) {
                i = 0;
            } else if (1 > i || i >= 101) {
                i = 100;
            }
            loadEmojiFontWorker.state = new ob8(i);
        }
    }
}
