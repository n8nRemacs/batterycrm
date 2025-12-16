package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class po6 extends uo6 {
    public final String a;
    public final List b;
    public final ko6 c;

    public po6(String str, String str2, List list) {
        ko6 ko6Var = new ko6(str2);
        this.a = str;
        this.b = list;
        this.c = ko6Var;
    }

    @Override // defpackage.uo6
    public final String[] a(oo6 oo6Var) {
        return new String[]{this.a};
    }

    @Override // defpackage.uo6
    public final String b() {
        return this.a;
    }

    @Override // defpackage.uo6
    public final l4 c() {
        return this.c;
    }

    @Override // defpackage.uo6
    public final List d() {
        return this.b;
    }

    @Override // defpackage.uo6
    public final String e(oo6 oo6Var) {
        return oo6Var.a + " AND " + oo6Var.b() + " = ?";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po6)) {
            return false;
        }
        po6 po6Var = (po6) obj;
        return fni.a(this.a, po6Var.a) && fni.a(this.b, po6Var.b) && fni.a(this.c, po6Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + xrf.l(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Real(id=" + this.a + ", queryParams=" + this.b + ", name=" + this.c + ")";
    }
}
