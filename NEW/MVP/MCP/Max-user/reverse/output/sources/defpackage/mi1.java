package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class mi1 {
    public static final mi1 g;
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;
    public final CharSequence e;
    public final boolean f;

    static {
        hd5 hd5Var = hd5.a;
        g = new mi1(hd5Var, hd5Var, hd5Var, false, "", false);
    }

    public mi1(List list, List list2, List list3, boolean z, CharSequence charSequence, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = z;
        this.e = charSequence;
        this.f = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    public static mi1 a(mi1 mi1Var, List list, o98 o98Var, List list2, boolean z, CharSequence charSequence, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = mi1Var.a;
        }
        List list3 = list;
        o98 o98Var2 = o98Var;
        if ((i & 2) != 0) {
            o98Var2 = mi1Var.b;
        }
        o98 o98Var3 = o98Var2;
        if ((i & 4) != 0) {
            list2 = mi1Var.c;
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            z = mi1Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            charSequence = mi1Var.e;
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 32) != 0) {
            z2 = mi1Var.f;
        }
        mi1Var.getClass();
        return new mi1(list3, o98Var3, list4, z3, charSequence2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi1)) {
            return false;
        }
        mi1 mi1Var = (mi1) obj;
        return fni.a(this.a, mi1Var.a) && fni.a(this.b, mi1Var.b) && fni.a(this.c, mi1Var.c) && this.d == mi1Var.d && fni.a(this.e, mi1Var.e) && this.f == mi1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + u45.g(this.e, a9h.b(xrf.l(this.c, xrf.l(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
    }

    public final String toString() {
        return "CallOpponentsState(opponents=" + this.a + ", buttons=" + this.b + ", contextMenuButtons=" + this.c + ", isMoreButtonEnabled=" + this.d + ", title=" + ((Object) this.e) + ", canOpenSettings=" + this.f + ")";
    }
}
