package defpackage;

/* loaded from: classes2.dex */
public final class uh2 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public uh2(String str, long j, CharSequence charSequence, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh2)) {
            return false;
        }
        uh2 uh2Var = (uh2) obj;
        return fni.a(this.a, uh2Var.a) && this.b == uh2Var.b && fni.a(this.c, uh2Var.c) && fni.a(this.d, uh2Var.d) && fni.a(this.e, uh2Var.e) && this.f == uh2Var.f && this.g == uh2Var.g && this.h == uh2Var.h;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.h) + a9h.b(a9h.b(u45.e(u45.e(u45.g(this.c, a9h.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("ChatItemModel(avatarUrl=", this.b, this.a, ", avatarSourceId=");
        sbQ.append(", avatarAbbreviation=");
        sbQ.append((Object) this.c);
        sbQ.append(", chatName=");
        sbQ.append(this.d);
        sbQ.append(", chatLink=");
        sbQ.append(this.e);
        sbQ.append(", isLoading=");
        sbQ.append(this.f);
        hf3.f(", isPrivate=", ", hasEditLinkPermission=", sbQ, this.g, this.h);
        sbQ.append(")");
        return sbQ.toString();
    }
}
