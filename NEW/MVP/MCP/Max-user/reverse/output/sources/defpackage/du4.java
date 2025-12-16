package defpackage;

/* loaded from: classes2.dex */
public final class du4 implements qfc {
    public final String a;
    public final n5g b;
    public final int c;

    public du4(String str, n5g n5gVar, int i) {
        this.a = str;
        this.b = n5gVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du4)) {
            return false;
        }
        du4 du4Var = (du4) obj;
        return fni.a(this.a, du4Var.a) && this.b.equals(du4Var.b) && this.c == du4Var.c;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 4;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return ((long) 4) == t98Var.getItemId();
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.c) + xrf.k(this.b.c, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 4;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionItem(text=");
        sb.append(this.a);
        sb.append(", hint=");
        sb.append(this.b);
        sb.append(", limitCharacters=");
        return ho7.j(sb, this.c, ")");
    }
}
