package defpackage;

/* loaded from: classes2.dex */
public final class ms2 implements qfc {
    public final String a;
    public final n5g b;
    public final zf3 c;
    public final int d;

    public ms2(String str, n5g n5gVar, zf3 zf3Var, int i) {
        this.a = str;
        this.b = n5gVar;
        this.c = zf3Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms2)) {
            return false;
        }
        ms2 ms2Var = (ms2) obj;
        return fni.a(this.a, ms2Var.a) && this.b.equals(ms2Var.b) && fni.a(this.c, ms2Var.c) && this.d == ms2Var.d;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 131072;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return ((long) 131072) == t98Var.getItemId();
    }

    public final int hashCode() {
        String str = this.a;
        int iK = xrf.k(this.b.c, (str == null ? 0 : str.hashCode()) * 31, 31);
        zf3 zf3Var = this.c;
        return Integer.hashCode(this.d) + ((iK + (zf3Var != null ? zf3Var.a.hashCode() : 0)) * 31);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        if (t98Var instanceof ms2) {
            return new egc(((ms2) t98Var).c);
        }
        return null;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 131072;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        return "ChatNameItem(text=" + this.a + ", hintText=" + this.b + ", errorText=" + this.c + ", limitCharacters=" + this.d + ")";
    }
}
