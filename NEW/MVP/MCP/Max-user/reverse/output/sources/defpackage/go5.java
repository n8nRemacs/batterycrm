package defpackage;

/* loaded from: classes2.dex */
public final class go5 extends l0g {
    public final Long c;
    public final String d;

    public go5(String str, Long l) {
        this.c = l;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go5)) {
            return false;
        }
        go5 go5Var = (go5) obj;
        return fni.a(this.c, go5Var.c) && fni.a(this.d, go5Var.d);
    }

    public final int hashCode() {
        Long l = this.c;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(botId=" + this.c + ", startParam=" + this.d + ")";
    }
}
