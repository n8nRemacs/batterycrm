package defpackage;

/* loaded from: classes.dex */
public final class lo7 implements jf9 {
    public final jf9 a;
    public final de5 b;

    public lo7(w84 w84Var, de5 de5Var) {
        this.a = w84Var;
        this.b = de5Var;
    }

    @Override // defpackage.qf9
    public final void a(pf9 pf9Var) {
        this.a.a(pf9Var);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0004. Please report as an issue. */
    @Override // defpackage.jf9
    public final vc3 c(ty0 ty0Var, vc3 vc3Var) {
        switch (this.b.a) {
        }
        return this.a.c(ty0Var, vc3Var);
    }

    @Override // defpackage.jf9
    public final int d(o7c o7cVar) {
        return this.a.d(o7cVar);
    }

    @Override // defpackage.jf9
    public final vc3 get(Object obj) {
        vc3 vc3Var = this.a.get(obj);
        de5 de5Var = this.b;
        if (vc3Var == null) {
            switch (de5Var.a) {
                case 0:
                    return vc3Var;
                default:
                    return vc3Var;
            }
        }
        switch (de5Var.a) {
            case 0:
                de5Var.b.s();
                return vc3Var;
            default:
                de5Var.b.w();
                return vc3Var;
        }
    }

    @Override // defpackage.jf9
    public final int getSizeInBytes() {
        return this.a.getSizeInBytes();
    }
}
