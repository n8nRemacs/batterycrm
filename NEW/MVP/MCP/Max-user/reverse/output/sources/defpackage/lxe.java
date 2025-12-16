package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class lxe implements pr9 {
    public final List a;
    public final s5g b;
    public final s5g c;
    public final List d;
    public final boolean e;

    public lxe(List list, s5g s5gVar, s5g s5gVar2, List list2, boolean z) {
        this.a = list;
        this.b = s5gVar;
        this.c = s5gVar2;
        this.d = list2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxe)) {
            return false;
        }
        lxe lxeVar = (lxe) obj;
        return fni.a(this.a, lxeVar.a) && fni.a(this.b, lxeVar.b) && fni.a(this.c, lxeVar.c) && fni.a(this.d, lxeVar.d) && this.e == lxeVar.e;
    }

    public final int hashCode() {
        int iD = xc0.d(this.a.hashCode() * 31, 31, this.b);
        s5g s5gVar = this.c;
        return Boolean.hashCode(this.e) + xrf.l(this.d, (iD + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(messageIds=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", buttons=");
        sb.append(this.d);
        sb.append(", memorizeKeybord=");
        return az1.k(sb, this.e, ")");
    }
}
