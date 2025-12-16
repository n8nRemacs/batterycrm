package defpackage;

/* loaded from: classes2.dex */
public final class p3b {
    public final long a;
    public final y08 b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final boolean f;
    public final jdc g;

    public /* synthetic */ p3b(long j, y08 y08Var, Long l, Long l2, Long l3, boolean z, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : y08Var, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? false : z, (jdc) null);
    }

    public final jdc a() {
        return this.g;
    }

    public final Long b() {
        return this.e;
    }

    public final String c() {
        y08 y08Var = this.b;
        if (y08Var != null) {
            return y08Var.a;
        }
        return null;
    }

    public final boolean d() {
        return qzi.b(this.b) && this.d == null && this.c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3b)) {
            return false;
        }
        p3b p3bVar = (p3b) obj;
        if (this.a != p3bVar.a) {
            return false;
        }
        y08 y08Var = this.b;
        return ((qzi.b(y08Var) && qzi.b(p3bVar.b)) || fni.a(y08Var, p3bVar.b)) && fni.a(this.c, p3bVar.c) && fni.a(this.d, p3bVar.d);
    }

    public final int hashCode() {
        y08 y08Var = this.b;
        int iA = a9h.a((y08Var != null ? y08Var.hashCode() : 0) * 31, 31, this.a);
        Long l = this.c;
        int iHashCode = (iA + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.d;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "OneMeDraft(cid=" + this.a + ", lastInputText=" + this.b + ", replyMessageId=" + this.c + ", editMessageId=" + this.d + ", serverTime=" + this.e + ", fromServer=" + this.f + ", attaches=" + this.g + ")";
    }

    public p3b(long j, y08 y08Var, Long l, Long l2, Long l3, boolean z, jdc jdcVar) {
        this.a = j;
        this.b = y08Var;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = z;
        this.g = jdcVar;
    }
}
