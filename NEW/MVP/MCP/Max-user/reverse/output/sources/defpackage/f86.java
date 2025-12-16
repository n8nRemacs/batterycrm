package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f86 implements Comparable {
    public final Set A0;
    public final boolean B0;
    public final List X;
    public final Map Y;
    public final List Z;
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Set d;
    public final Set o;
    public final Set s0;
    public final n8a t0;
    public final long u0;
    public final Long v0;
    public final Long w0;
    public final boolean x0;
    public final String y0;
    public final Set z0;

    public f86(String str, CharSequence charSequence, int i, Set set, Set set2, List list, Map map, List list2, Set set3, n8a n8aVar, long j, Long l, Long l2, boolean z, String str2, Set set4, Set set5) {
        this.a = str;
        this.b = charSequence;
        this.c = i;
        this.d = set;
        this.o = set2;
        this.X = list;
        this.Y = map;
        this.Z = list2;
        this.s0 = set3;
        this.t0 = n8aVar;
        this.u0 = j;
        this.v0 = l;
        this.w0 = l2;
        this.x0 = z;
        this.y0 = str2;
        this.z0 = set4;
        this.A0 = set5;
        this.B0 = set3.contains(ra6.c);
    }

    public final boolean a() {
        return fni.a(this.a, "all.chat.folder");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return fni.b(this.c, ((f86) obj).c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f86)) {
            return false;
        }
        f86 f86Var = (f86) obj;
        if (!fni.a(this.a, f86Var.a) || !fni.a(this.b, f86Var.b) || this.c != f86Var.c || !fni.a(this.d, f86Var.d) || !fni.a(this.o, f86Var.o) || !fni.a(this.X, f86Var.X)) {
            return false;
        }
        LinkedHashSet linkedHashSet = da6.b;
        return ee4.b(this.Y, f86Var.Y) && fni.a(this.Z, f86Var.Z) && fni.a(this.s0, f86Var.s0) && fni.a(this.t0, f86Var.t0) && this.u0 == f86Var.u0 && fni.a(this.v0, f86Var.v0) && fni.a(this.w0, f86Var.w0) && this.x0 == f86Var.x0 && fni.a(this.y0, f86Var.y0) && fni.a(this.z0, f86Var.z0) && fni.a(this.A0, f86Var.A0);
    }

    public final int hashCode() {
        int iL = xrf.l(this.X, (this.o.hashCode() + ((this.d.hashCode() + u45.g(this.b, u45.e(this.c * 31, 31, this.a), 31)) * 31)) * 31, 31);
        LinkedHashSet linkedHashSet = da6.b;
        int iA = a9h.a((this.t0.hashCode() + ((this.s0.hashCode() + xrf.l(this.Z, (ee4.c(this.Y) + iL) * 31, 31)) * 31)) * 31, 31, this.u0);
        Long l = this.v0;
        int iHashCode = (iA + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.w0;
        int iB = a9h.b((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.x0);
        String str = this.y0;
        return this.A0.hashCode() + ((this.z0.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Folder(id='");
        sb.append(this.a);
        sb.append("', includedChats=");
        sb.append(this.o.size());
        sb.append(", title='");
        sb.append(this.b);
        sb.append(", order=");
        sb.append(this.c);
        sb.append(", filters=");
        sb.append(this.d);
        sb.append(", elements=");
        sb.append(this.X.size());
        sb.append(", filterSubjects=");
        sb.append(this.Y.size());
        sb.append(", widgets=");
        sb.append(ue3.N(this.Z, "[", "]", null, null, 60));
        sb.append(", options=");
        sb.append(ue3.N(this.s0, "[", "]", null, null, 60));
        sb.append(", templateId=");
        sb.append(this.v0);
        sb.append(", sourceId=");
        sb.append(this.w0);
        sb.append(", updateTime=");
        return ho7.k(sb, this.u0, ")");
    }
}
