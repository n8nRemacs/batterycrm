package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class dh2 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final n8a e;
    public final n8a f;
    public final Set g;
    public final Set h;
    public final w8a i;
    public final Long j;
    public final c9a k;
    public final w8a l;
    public final Long m;

    public dh2(String str, String str2, long j, String str3, n8a n8aVar, n8a n8aVar2, EnumSet enumSet, EnumSet enumSet2, w8a w8aVar, Long l, c9a c9aVar, w8a w8aVar2, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = n8aVar;
        this.f = n8aVar2;
        this.g = enumSet;
        this.h = enumSet2;
        this.i = w8aVar;
        this.j = l;
        this.k = c9aVar;
        this.l = w8aVar2;
        this.m = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh2)) {
            return false;
        }
        dh2 dh2Var = (dh2) obj;
        return fni.a(this.a, dh2Var.a) && fni.a(this.b, dh2Var.b) && this.c == dh2Var.c && fni.a(this.d, dh2Var.d) && fni.a(this.e, dh2Var.e) && fni.a(this.f, dh2Var.f) && fni.a(this.g, dh2Var.g) && fni.a(this.h, dh2Var.h) && fni.a(this.i, dh2Var.i) && fni.a(this.j, dh2Var.j) && fni.a(this.k, dh2Var.k) && fni.a(this.l, dh2Var.l) && fni.a(this.m, dh2Var.m);
    }

    public final int hashCode() {
        int iA = a9h.a(u45.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Long l = this.j;
        int iHashCode2 = (this.l.hashCode() + ((this.k.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31;
        Long l2 = this.m;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("ChatFolderV2(id='", this.a, "', title='", wqi.a() ? this.b : "****", "', updateTime=");
        hf3.e(this.c, ", emoji=", this.d, sbL);
        sbL.append(", include=");
        sbL.append(this.e);
        sbL.append(", favorites=");
        sbL.append(this.f);
        sbL.append(", filters=");
        sbL.append(this.g);
        sbL.append(", options=");
        sbL.append(this.h);
        sbL.append(", elements=");
        sbL.append(this.i);
        sbL.append(", templateId=");
        sbL.append(this.j);
        sbL.append(", filterSubjects=");
        sbL.append(this.k);
        sbL.append(", widgets=");
        sbL.append(this.l);
        sbL.append(", sourceId=");
        sbL.append(this.m);
        sbL.append(")");
        return sbL.toString();
    }
}
