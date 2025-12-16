package defpackage;

/* loaded from: classes.dex */
public final class gp2 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final fp2 d;
    public final boolean e;

    public gp2(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, fp2 fp2Var, boolean z) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = fp2Var;
        this.e = z;
    }

    public static gp2 a(gp2 gp2Var, fp2 fp2Var) {
        CharSequence charSequence = gp2Var.a;
        CharSequence charSequence2 = gp2Var.b;
        CharSequence charSequence3 = gp2Var.c;
        boolean z = gp2Var.e;
        gp2Var.getClass();
        return new gp2(charSequence, charSequence2, charSequence3, fp2Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp2)) {
            return false;
        }
        gp2 gp2Var = (gp2) obj;
        return fni.a(this.a, gp2Var.a) && fni.a(this.b, gp2Var.b) && fni.a(this.c, gp2Var.c) && fni.a(this.d, gp2Var.d) && this.e == gp2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + u45.g(this.c, u45.g(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoPanelState(author=");
        sb.append((Object) this.a);
        sb.append(", dateText=");
        sb.append((Object) this.b);
        sb.append(", captionText=");
        sb.append((Object) this.c);
        sb.append(", frameState=");
        sb.append(this.d);
        sb.append(", forwardButtonVisible=");
        return az1.k(sb, this.e, ")");
    }

    public /* synthetic */ gp2(String str, CharSequence charSequence, int i) {
        this((i & 1) != 0 ? "" : charSequence, (i & 2) != 0 ? "" : str, "", new fp2(null, 7), true);
    }
}
