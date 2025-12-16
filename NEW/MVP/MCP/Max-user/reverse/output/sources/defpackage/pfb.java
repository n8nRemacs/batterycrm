package defpackage;

/* loaded from: classes2.dex */
public final class pfb {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final yd0 d;

    public pfb(String str, CharSequence charSequence, long j, yd0 yd0Var, int i) {
        yd0Var = (i & 16) != 0 ? null : yd0Var;
        this.a = str;
        this.b = charSequence;
        this.c = j;
        this.d = yd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfb)) {
            return false;
        }
        pfb pfbVar = (pfb) obj;
        return fni.a(this.a, pfbVar.a) && fni.a(this.b, pfbVar.b) && this.c == pfbVar.c && fni.a(this.d, pfbVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iA = a9h.a(u45.g(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 961, this.c);
        yd0 yd0Var = this.d;
        return iA + (yd0Var != null ? yd0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarParams(url=" + this.a + ", abbreviationName=" + ((Object) this.b) + ", id=" + this.c + ", placeholder=null, overlay=" + this.d + ")";
    }
}
