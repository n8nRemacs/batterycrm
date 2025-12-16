package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class pa6 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final u84 d;
    public final Set e;

    public pa6(String str, CharSequence charSequence, String str2, u84 u84Var, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = u84Var;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa6)) {
            return false;
        }
        pa6 pa6Var = (pa6) obj;
        return fni.a(this.a, pa6Var.a) && fni.a(this.b, pa6Var.b) && fni.a(this.c, pa6Var.c) && fni.a(this.d, pa6Var.d) && fni.a(this.e, pa6Var.e);
    }

    public final int hashCode() {
        int iG = u45.g(this.b, this.a.hashCode() * 31, 31);
        CharSequence charSequence = this.c;
        return this.e.hashCode() + xrf.k(this.d.a, (iG + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "FolderModel(id=" + this.a + ", name=" + ((Object) this.b) + ", emoji=" + ((Object) this.c) + ", counter=" + this.d + ", options=" + this.e + ")";
    }
}
