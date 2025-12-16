package defpackage;

/* loaded from: classes.dex */
public abstract class bb8 {
    public final wta a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ cb8 d;

    public bb8(cb8 cb8Var, wta wtaVar) {
        this.d = cb8Var;
        this.a = wtaVar;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        cb8 cb8Var = this.d;
        int i2 = cb8Var.c;
        cb8Var.c = i + i2;
        if (!cb8Var.d) {
            cb8Var.d = true;
            while (true) {
                try {
                    int i3 = cb8Var.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        cb8Var.g();
                    } else if (z3) {
                        cb8Var.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    cb8Var.d = false;
                    throw th;
                }
            }
            cb8Var.d = false;
        }
        if (this.b) {
            cb8Var.c(this);
        }
    }

    public void b() {
    }

    public boolean c(j48 j48Var) {
        return false;
    }

    public abstract boolean e();
}
