package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class vf6 {
    public final Set a;
    public final Long b;
    public final boolean c;
    public final CharSequence d;
    public final boolean e;

    public vf6(Set set, Long l, boolean z, CharSequence charSequence, boolean z2) {
        this.a = set;
        this.b = l;
        this.c = z;
        this.d = charSequence;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf6)) {
            return false;
        }
        vf6 vf6Var = (vf6) obj;
        return fni.a(this.a, vf6Var.a) && fni.a(this.b, vf6Var.b) && this.c == vf6Var.c && fni.a(this.d, vf6Var.d) && this.e == vf6Var.e;
    }

    public final int hashCode() {
        Set set = this.a;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Long l = this.b;
        int iB = a9h.b((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        return Boolean.hashCode(this.e) + ((iB + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForwardMessagesSendData(messageIds=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", isForwardAttach=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append((Object) this.d);
        sb.append(", shouldHideAuthor=");
        return az1.k(sb, this.e, ")");
    }
}
