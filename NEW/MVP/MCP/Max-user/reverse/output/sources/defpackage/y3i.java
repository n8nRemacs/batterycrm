package defpackage;

/* loaded from: classes.dex */
public abstract class y3i {
    public final g4i a;
    public co7[] b;

    public y3i() {
        this(new g4i());
    }

    public final void a() {
        co7[] co7VarArr = this.b;
        if (co7VarArr != null) {
            co7 co7VarF = co7VarArr[0];
            co7 co7VarF2 = co7VarArr[1];
            g4i g4iVar = this.a;
            if (co7VarF2 == null) {
                co7VarF2 = g4iVar.a.f(2);
            }
            if (co7VarF == null) {
                co7VarF = g4iVar.a.f(1);
            }
            g(co7.a(co7VarF, co7VarF2));
            co7 co7Var = this.b[fsi.h(16)];
            if (co7Var != null) {
                f(co7Var);
            }
            co7 co7Var2 = this.b[fsi.h(32)];
            if (co7Var2 != null) {
                d(co7Var2);
            }
            co7 co7Var3 = this.b[fsi.h(64)];
            if (co7Var3 != null) {
                h(co7Var3);
            }
        }
    }

    public abstract g4i b();

    public void c(int i, co7 co7Var) {
        if (this.b == null) {
            this.b = new co7[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[fsi.h(i2)] = co7Var;
            }
        }
    }

    public void d(co7 co7Var) {
    }

    public abstract void e(co7 co7Var);

    public void f(co7 co7Var) {
    }

    public abstract void g(co7 co7Var);

    public void h(co7 co7Var) {
    }

    public void i(int i, boolean z) {
    }

    public y3i(g4i g4iVar) {
        this.a = g4iVar;
    }
}
