package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class l0a {
    public final String a;
    public final CharSequence b;
    public final u84 c;
    public final Set d;

    public l0a(String str, CharSequence charSequence, u84 u84Var, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = u84Var;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0a)) {
            return false;
        }
        l0a l0aVar = (l0a) obj;
        return fni.a(this.a, l0aVar.a) && fni.a(this.b, l0aVar.b) && fni.a(this.c, l0aVar.c) && fni.a(this.d, l0aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xrf.k(this.c.a, u45.g(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MiniFolder(id=" + this.a + ", name=" + ((Object) this.b) + ", counter=" + this.c + ", options=" + this.d + ")";
    }
}
