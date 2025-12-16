package defpackage;

/* loaded from: classes2.dex */
public final class khc implements mhc {
    public final Long a;

    public khc(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khc) && fni.a(this.a, ((khc) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "UpdateSuccess(requestId=" + this.a + ")";
    }
}
