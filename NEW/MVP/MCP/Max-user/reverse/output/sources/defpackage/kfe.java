package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class kfe {
    public final long a;
    public final String b;
    public final List c;
    public final List d;
    public final Long e;
    public final Long f;
    public final long g;

    public kfe(long j, String str, List list, List list2, Long l, Long l2, long j2) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = l;
        this.f = l2;
        this.g = j2;
    }

    public final Map a() {
        String str = this.b;
        if (!l8g.d(str)) {
            str = null;
        }
        imb imbVar = str != null ? new imb("text", str) : null;
        List list = this.c;
        if (list.isEmpty()) {
            list = null;
        }
        imb imbVar2 = list != null ? new imb("attaches", list) : null;
        List list2 = this.d;
        if (list2.isEmpty()) {
            list2 = null;
        }
        imb imbVar3 = list2 != null ? new imb("elements", list2) : null;
        Long l = this.e;
        imb imbVar4 = l != null ? new imb("replyTo", Long.valueOf(l.longValue())) : null;
        Long l2 = this.f;
        imb imbVar5 = l2 != null ? new imb("editOn", Long.valueOf(l2.longValue())) : null;
        long j = this.g;
        Long lValueOf = Long.valueOf(j);
        if (j == 0) {
            lValueOf = null;
        }
        imb imbVar6 = lValueOf != null ? new imb("saveTime", Long.valueOf(lValueOf.longValue())) : null;
        long j2 = this.a;
        Long lValueOf2 = Long.valueOf(j2);
        if (j2 == 0) {
            lValueOf2 = null;
        }
        return to8.r(ys.t(new imb[]{imbVar, imbVar2, imbVar3, imbVar4, imbVar5, imbVar6, lValueOf2 != null ? new imb("cid", Long.valueOf(lValueOf2.longValue())) : null}));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfe)) {
            return false;
        }
        kfe kfeVar = (kfe) obj;
        return this.a == kfeVar.a && fni.a(this.b, kfeVar.b) && fni.a(this.c, kfeVar.c) && fni.a(this.d, kfeVar.d) && fni.a(this.e, kfeVar.e) && fni.a(this.f, kfeVar.f) && this.g == kfeVar.g;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iL = xrf.l(this.d, xrf.l(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Long l = this.e;
        int iHashCode2 = (iL + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        return Long.hashCode(this.g) + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerDraft(text=***, attaches=");
        sb.append(this.c);
        sb.append(", elements=");
        sb.append(this.d);
        sb.append(", replyTo=");
        sb.append(this.e);
        sb.append(", editOn=");
        sb.append(this.f);
        sb.append(", saveTime=");
        return ho7.k(sb, this.g, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ kfe(String str, List list, Long l, Long l2, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        int i2 = i & 8;
        hd5 hd5Var = hd5.a;
        this(0L, str2, hd5Var, i2 != 0 ? hd5Var : list, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, 0L);
    }
}
