package defpackage;

/* loaded from: classes.dex */
public final class z73 extends du7 implements y73 {
    public final a83 b;

    public z73(a83 a83Var) {
        this.b = a83Var;
    }

    @Override // defpackage.y73
    public final boolean a(Throwable th) {
        su7 su7Var = this.a;
        if (su7Var == null) {
            su7Var = null;
        }
        return su7Var.childCancelled(th);
    }

    @Override // defpackage.du7
    public final boolean c() {
        return true;
    }

    @Override // defpackage.du7
    public final void d(Throwable th) {
        su7 su7Var = this.a;
        if (su7Var == null) {
            su7Var = null;
        }
        this.b.parentCancelled(su7Var);
    }

    @Override // defpackage.y73
    public final qt7 getParent() {
        su7 su7Var = this.a;
        if (su7Var != null) {
            return su7Var;
        }
        return null;
    }
}
