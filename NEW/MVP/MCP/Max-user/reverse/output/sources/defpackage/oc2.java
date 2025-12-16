package defpackage;

/* loaded from: classes2.dex */
public final class oc2 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public oc2(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2)) {
            return false;
        }
        oc2 oc2Var = (oc2) obj;
        return this.a == oc2Var.a && this.b == oc2Var.b && this.c == oc2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + a9h.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payload(notificationsCount=");
        sb.append(this.a);
        sb.append(", hasCall=");
        sb.append(this.b);
        sb.append(", hasReplyMentionOrReaction=");
        return az1.k(sb, this.c, ")");
    }
}
