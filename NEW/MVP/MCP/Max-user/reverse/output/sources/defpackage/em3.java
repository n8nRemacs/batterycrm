package defpackage;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class em3 implements n99, f55 {
    public final Object a;
    public lk6 b;
    public d55 c;
    public final /* synthetic */ im3 d;

    public em3(im3 im3Var, Object obj) {
        this.d = im3Var;
        this.b = im3Var.b(null);
        this.c = new d55(im3Var.d.c, 0, null);
        this.a = obj;
    }

    @Override // defpackage.f55
    public final void B(int i, d99 d99Var) {
        if (c(i, d99Var)) {
            this.c.e();
        }
    }

    @Override // defpackage.n99
    public final void C(int i, d99 d99Var, g19 g19Var) {
        if (c(i, d99Var)) {
            lk6 lk6Var = this.b;
            g19 g19VarF = f(g19Var, d99Var);
            lk6Var.getClass();
            lk6Var.x(new dq4(lk6Var, 24, g19VarF));
        }
    }

    @Override // defpackage.n99
    public final void a(int i, d99 d99Var, ub8 ub8Var, g19 g19Var, IOException iOException, boolean z) {
        if (c(i, d99Var)) {
            lk6 lk6Var = this.b;
            g19 g19VarF = f(g19Var, d99Var);
            lk6Var.getClass();
            lk6Var.x(new kj4(lk6Var, ub8Var, g19VarF, iOException, z));
        }
    }

    @Override // defpackage.n99
    public final void b(int i, d99 d99Var, ub8 ub8Var, g19 g19Var, int i2) {
        if (c(i, d99Var)) {
            lk6 lk6Var = this.b;
            g19 g19VarF = f(g19Var, d99Var);
            lk6Var.getClass();
            lk6Var.x(new bd0(lk6Var, ub8Var, g19VarF, i2, 4));
        }
    }

    public final boolean c(int i, d99 d99Var) {
        d99 d99VarV;
        Object obj = this.a;
        im3 im3Var = this.d;
        if (d99Var != null) {
            d99VarV = im3Var.v(obj, d99Var);
            if (d99VarV == null) {
                return false;
            }
        } else {
            d99VarV = null;
        }
        int iX = im3Var.x(i, obj);
        lk6 lk6Var = this.b;
        if (lk6Var.b != iX || !Objects.equals((d99) lk6Var.c, d99VarV)) {
            this.b = new lk6((CopyOnWriteArrayList) im3Var.c.d, iX, d99VarV, 19);
        }
        d55 d55Var = this.c;
        if (d55Var.a == iX && Objects.equals(d55Var.b, d99VarV)) {
            return true;
        }
        this.c = new d55(im3Var.d.c, iX, d99VarV);
        return true;
    }

    @Override // defpackage.n99
    public final void d(int i, d99 d99Var, ub8 ub8Var, g19 g19Var) {
        if (c(i, d99Var)) {
            lk6 lk6Var = this.b;
            g19 g19VarF = f(g19Var, d99Var);
            lk6Var.getClass();
            lk6Var.x(new i99(lk6Var, ub8Var, g19VarF, 1));
        }
    }

    @Override // defpackage.f55
    public final void e(int i, d99 d99Var, Exception exc) {
        if (c(i, d99Var)) {
            this.c.d(exc);
        }
    }

    public final g19 f(g19 g19Var, d99 d99Var) {
        long j = g19Var.e;
        im3 im3Var = this.d;
        Object obj = this.a;
        long jW = im3Var.w(obj, j, d99Var);
        long j2 = g19Var.f;
        long jW2 = im3Var.w(obj, j2, d99Var);
        return (jW == j && jW2 == j2) ? g19Var : new g19(g19Var.a, g19Var.b, (hf6) g19Var.g, g19Var.c, g19Var.d, jW, jW2);
    }

    @Override // defpackage.n99
    public final void u(int i, d99 d99Var, ub8 ub8Var, g19 g19Var) {
        if (c(i, d99Var)) {
            lk6 lk6Var = this.b;
            g19 g19VarF = f(g19Var, d99Var);
            lk6Var.getClass();
            lk6Var.x(new i99(lk6Var, ub8Var, g19VarF, 0));
        }
    }

    @Override // defpackage.f55
    public final void v(int i, d99 d99Var, int i2) {
        if (c(i, d99Var)) {
            this.c.c(i2);
        }
    }

    @Override // defpackage.f55
    public final void w(int i, d99 d99Var) {
        if (c(i, d99Var)) {
            this.c.b();
        }
    }

    @Override // defpackage.n99
    public final void x(int i, d99 d99Var, g19 g19Var) {
        if (c(i, d99Var)) {
            lk6 lk6Var = this.b;
            g19 g19VarF = f(g19Var, d99Var);
            d99 d99Var2 = (d99) lk6Var.c;
            d99Var2.getClass();
            lk6Var.x(new nl(lk6Var, d99Var2, g19VarF, 14));
        }
    }

    @Override // defpackage.f55
    public final void z(int i, d99 d99Var) {
        if (c(i, d99Var)) {
            this.c.a();
        }
    }
}
