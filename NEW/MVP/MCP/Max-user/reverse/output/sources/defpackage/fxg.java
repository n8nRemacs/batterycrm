package defpackage;

/* loaded from: classes2.dex */
public final class fxg implements t98 {
    public final f86 a;
    public final exg b;
    public final s5g c;
    public final int d;
    public final long o;

    public fxg(f86 f86Var, exg exgVar, s5g s5gVar) {
        String str;
        this.a = f86Var;
        this.b = exgVar;
        this.c = s5gVar;
        this.d = exgVar.ordinal();
        this.o = (exgVar.hashCode() * 33) + ((f86Var == null || (str = f86Var.a) == null) ? 0 : str.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxg)) {
            return false;
        }
        fxg fxgVar = (fxg) obj;
        return fni.a(this.a, fxgVar.a) && this.b == fxgVar.b && fni.a(this.c, fxgVar.c);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.o;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        if (!(t98Var instanceof fxg)) {
            return false;
        }
        f86 f86Var = this.a;
        String str = f86Var != null ? f86Var.a : null;
        f86 f86Var2 = ((fxg) t98Var).a;
        return fni.a(str, f86Var2 != null ? f86Var2.a : null);
    }

    public final int hashCode() {
        f86 f86Var = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((f86Var == null ? 0 : f86Var.hashCode()) * 31)) * 31);
    }

    @Override // defpackage.t98
    public final int m() {
        return this.d;
    }

    public final String toString() {
        return "UserFolderListItem(folder=" + this.a + ", type=" + this.b + ", processedTitle=" + this.c + ")";
    }
}
