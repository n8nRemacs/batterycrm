package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class dg6 implements hg6 {
    public final Long a;
    public final Long b;
    public final Set c;
    public final Long d;
    public final boolean e;
    public final sf6 f;

    public dg6(Long l, Long l2, Set set, Long l3, boolean z, sf6 sf6Var, int i) {
        l2 = (i & 2) != 0 ? null : l2;
        set = (i & 4) != 0 ? null : set;
        l3 = (i & 8) != 0 ? null : l3;
        z = (i & 16) != 0 ? false : z;
        sf6Var = (i & 32) != 0 ? null : sf6Var;
        this.a = l;
        this.b = l2;
        this.c = set;
        this.d = l3;
        this.e = z;
        this.f = sf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg6)) {
            return false;
        }
        dg6 dg6Var = (dg6) obj;
        return fni.a(this.a, dg6Var.a) && fni.a(this.b, dg6Var.b) && fni.a(this.c, dg6Var.c) && fni.a(this.d, dg6Var.d) && this.e == dg6Var.e && fni.a(this.f, dg6Var.f);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Set set = this.c;
        int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Long l3 = this.d;
        int iB = a9h.b((iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.e);
        sf6 sf6Var = this.f;
        return iB + (sf6Var != null ? sf6Var.hashCode() : 0);
    }

    public final String toString() {
        return "ClosePicker(destinationId=" + this.a + ", fwdChtId=" + this.b + ", fwdMsgIds=" + this.c + ", fwdAttachId=" + this.d + ", isForwardAttach=" + this.e + ", inAppReviewData=" + this.f + ")";
    }
}
