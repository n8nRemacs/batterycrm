package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kxe extends vx3 {
    public final long a;
    public final s5g b;
    public final s5g c;
    public final List d;

    public kxe(long j, s5g s5gVar, n5g n5gVar, List list) {
        this.a = j;
        this.b = s5gVar;
        this.c = n5gVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxe)) {
            return false;
        }
        kxe kxeVar = (kxe) obj;
        return this.a == kxeVar.a && fni.a(this.b, kxeVar.b) && fni.a(this.c, kxeVar.c) && fni.a(this.d, kxeVar.d);
    }

    public final int hashCode() {
        int iD = xc0.d(Long.hashCode(this.a) * 31, 31, this.b);
        s5g s5gVar = this.c;
        return this.d.hashCode() + ((iD + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(contactServerId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
