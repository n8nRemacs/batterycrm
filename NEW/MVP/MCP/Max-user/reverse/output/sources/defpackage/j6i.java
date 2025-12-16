package defpackage;

/* loaded from: classes2.dex */
public final class j6i implements wgg {
    public final se4 a;
    public final wgg b;

    public j6i(se4 se4Var, wgg wggVar) {
        this.a = se4Var;
        this.b = wggVar;
    }

    @Override // defpackage.wgg
    public final void c(se4 se4Var, ze4 ze4Var, boolean z) {
        this.b.c(this.a, ze4Var, z);
    }

    @Override // defpackage.wgg
    public final void d(se4 se4Var, ze4 ze4Var, boolean z, int i) {
        this.b.d(this.a, ze4Var, z, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6i)) {
            return false;
        }
        j6i j6iVar = (j6i) obj;
        return fni.a(this.a, j6iVar.a) && fni.a(this.b, j6iVar.b);
    }

    @Override // defpackage.wgg
    public final void h(se4 se4Var, ze4 ze4Var, boolean z) {
        this.b.h(this.a, ze4Var, z);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.wgg
    public final void i(se4 se4Var, ze4 ze4Var, boolean z) {
        this.b.i(this.a, ze4Var, z);
    }

    public final String toString() {
        return "WrapperTransferListener(dataSource=" + this.a + ", listener=" + this.b + ")";
    }
}
