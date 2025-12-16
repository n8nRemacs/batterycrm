package defpackage;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
public final class v99 implements n99, f55 {
    public final z99 a;
    public final /* synthetic */ y87 b;

    public v99(y87 y87Var, z99 z99Var) {
        this.b = y87Var;
        this.a = z99Var;
    }

    @Override // defpackage.f55
    public final void B(int i, d99 d99Var) {
        Pair pairC = c(i, d99Var);
        if (pairC != null) {
            ((wwf) this.b.l).d(new t99(this, pairC, 1));
        }
    }

    @Override // defpackage.n99
    public final void C(int i, d99 d99Var, g19 g19Var) {
        Pair pairC = c(i, d99Var);
        if (pairC != null) {
            ((wwf) this.b.l).d(new s99(this, pairC, g19Var, 1));
        }
    }

    @Override // defpackage.n99
    public final void a(int i, d99 d99Var, ub8 ub8Var, g19 g19Var, IOException iOException, boolean z) {
        Pair pairC = c(i, d99Var);
        if (pairC != null) {
            ((wwf) this.b.l).d(new j99(this, pairC, ub8Var, g19Var, iOException, z, 1));
        }
    }

    @Override // defpackage.n99
    public final void b(int i, d99 d99Var, ub8 ub8Var, g19 g19Var, int i2) {
        Pair pairC = c(i, d99Var);
        if (pairC != null) {
            ((wwf) this.b.l).d(new xz0(this, pairC, ub8Var, g19Var, i2, 4));
        }
    }

    public final Pair c(int i, d99 d99Var) {
        d99 d99VarA;
        z99 z99Var = this.a;
        d99 d99Var2 = null;
        if (d99Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= z99Var.c.size()) {
                    d99VarA = null;
                    break;
                }
                if (((d99) z99Var.c.get(i2)).d == d99Var.d) {
                    Object obj = d99Var.a;
                    Object obj2 = z99Var.b;
                    int i3 = l0.g;
                    d99VarA = d99Var.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (d99VarA == null) {
                return null;
            }
            d99Var2 = d99VarA;
        }
        return Pair.create(Integer.valueOf(i + z99Var.d), d99Var2);
    }

    @Override // defpackage.n99
    public final void d(int i, d99 d99Var, ub8 ub8Var, g19 g19Var) {
        Pair pairC = c(i, d99Var);
        if (pairC != null) {
            ((wwf) this.b.l).d(new u99(this, pairC, ub8Var, g19Var, 0));
        }
    }

    @Override // defpackage.f55
    public final void e(int i, d99 d99Var, Exception exc) {
        Pair pairC = c(i, d99Var);
        if (pairC != null) {
            ((wwf) this.b.l).d(new se5(this, pairC, exc, 23));
        }
    }

    @Override // defpackage.n99
    public final void u(int i, d99 d99Var, ub8 ub8Var, g19 g19Var) {
        Pair pairC = c(i, d99Var);
        if (pairC != null) {
            ((wwf) this.b.l).d(new u99(this, pairC, ub8Var, g19Var, 1));
        }
    }

    @Override // defpackage.f55
    public final void v(int i, d99 d99Var, int i2) {
        Pair pairC = c(i, d99Var);
        if (pairC != null) {
            ((wwf) this.b.l).d(new mn1(this, pairC, i2, 15));
        }
    }

    @Override // defpackage.f55
    public final void w(int i, d99 d99Var) {
        Pair pairC = c(i, d99Var);
        if (pairC != null) {
            ((wwf) this.b.l).d(new t99(this, pairC, 2));
        }
    }

    @Override // defpackage.n99
    public final void x(int i, d99 d99Var, g19 g19Var) {
        Pair pairC = c(i, d99Var);
        if (pairC != null) {
            ((wwf) this.b.l).d(new s99(this, pairC, g19Var, 0));
        }
    }

    @Override // defpackage.f55
    public final void z(int i, d99 d99Var) {
        Pair pairC = c(i, d99Var);
        if (pairC != null) {
            ((wwf) this.b.l).d(new t99(this, pairC, 0));
        }
    }
}
