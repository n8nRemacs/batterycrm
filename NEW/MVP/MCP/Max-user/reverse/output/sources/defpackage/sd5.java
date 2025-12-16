package defpackage;

/* loaded from: classes2.dex */
public final class sd5 implements vd5 {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final od7 d;
    public final s5g e;
    public final s5g f;
    public final boolean g;

    public sd5(String str, CharSequence charSequence, long j, od7 od7Var, s5g s5gVar, s5g s5gVar2, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = j;
        this.d = od7Var;
        this.e = s5gVar;
        this.f = s5gVar2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd5)) {
            return false;
        }
        sd5 sd5Var = (sd5) obj;
        return fni.a(this.a, sd5Var.a) && fni.a(this.b, sd5Var.b) && this.c == sd5Var.c && fni.a(this.d, sd5Var.d) && this.e.equals(sd5Var.e) && this.f.equals(sd5Var.f) && this.g == sd5Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iA = a9h.a((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.c);
        od7 od7Var = this.d;
        return Boolean.hashCode(this.g) + xc0.d(xc0.d((iA + (od7Var != null ? od7Var.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyBot(avatar=");
        sb.append(this.a);
        sb.append(", avatarPlaceholder=");
        sb.append((Object) this.b);
        sb.append(", avatarPlaceholderId=");
        sb.append(this.c);
        sb.append(", imageAttachConfig=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        return vb9.f(sb, ", isCustom=", this.g, ")");
    }
}
