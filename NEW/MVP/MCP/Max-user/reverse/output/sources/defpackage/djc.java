package defpackage;

/* loaded from: classes2.dex */
public final class djc extends ljc {
    public final CharSequence a;
    public final n5g b;
    public final int c;
    public final int d;

    public djc(CharSequence charSequence, n5g n5gVar, int i) {
        this.a = charSequence;
        this.b = n5gVar;
        this.c = i;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djc)) {
            return false;
        }
        djc djcVar = (djc) obj;
        return fni.a(this.a, djcVar.a) && this.b.equals(djcVar.b) && this.c == djcVar.c;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 65536;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b.c, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.d;
    }

    public final String toString() {
        String strC = j6j.c(this.c);
        StringBuilder sb = new StringBuilder("ContactDescription(text=");
        sb.append((Object) this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", itemViewType=");
        return ho7.l(sb, strC, ")");
    }
}
