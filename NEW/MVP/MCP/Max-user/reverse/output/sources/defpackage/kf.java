package defpackage;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class kf extends mdf {
    public final int j;
    public int k;

    public kf(View view, eo7 eo7Var, em6 em6Var, int i) {
        super(view, eo7Var, (i & 16) != 0 ? null : em6Var);
        this.j = 8;
        this.k = -1;
        hfh.p(view, new jf(this));
    }

    public static final g4i f(kf kfVar, g4i g4iVar) {
        if (kfVar.f == 0) {
            return g4iVar;
        }
        co7 co7VarF = g4iVar.a.f(7);
        if (co7VarF.d > kfVar.f) {
            return g4iVar;
        }
        int i = Build.VERSION.SDK_INT;
        y3i x3iVar = i >= 30 ? new x3i(g4iVar) : i >= 29 ? new v3i(g4iVar) : new u3i(g4iVar);
        x3iVar.c(7, co7.b(co7VarF.a, co7VarF.b, co7VarF.c, kfVar.f));
        return x3iVar.b();
    }

    @Override // defpackage.mdf
    public final void b(g4i g4iVar, ms0 ms0Var) {
        e4i e4iVar = g4iVar.a;
        co7 co7VarF = e4iVar.f(this.d);
        int i = this.j;
        co7 co7VarF2 = e4iVar.f(i);
        if (e4iVar.o(i)) {
            co7VarF = co7VarF2;
        }
        a(co7VarF, ms0Var);
    }

    @Override // defpackage.mdf
    public final void c(g4i g4iVar) {
        if (this.k != -1) {
            int i = Build.VERSION.SDK_INT;
            y3i x3iVar = i >= 30 ? new x3i(g4iVar) : i >= 29 ? new v3i(g4iVar) : new u3i(g4iVar);
            x3iVar.c(8, co7.e);
            x3iVar.i(8, false);
            g4iVar = x3iVar.b();
        }
        super.c(g4iVar);
    }

    @Override // defpackage.mdf
    public final g4i d(g4i g4iVar) {
        return g4iVar;
    }

    @Override // defpackage.mdf
    public final void e() {
        this.g = false;
        View view = this.a;
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new hf(view, 0));
        } else {
            WeakHashMap weakHashMap = hfh.a;
            teh.c(view);
        }
    }

    public void g(g4i g4iVar, ssb ssbVar) {
    }

    public abstract g4i h(g4i g4iVar);

    public abstract void i();

    public void j() {
    }
}
