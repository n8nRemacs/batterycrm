package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class mxe extends e13 {
    public final long a;
    public final s5g b;
    public final s5g c;
    public final List d;

    public mxe(long j, s5g s5gVar, s5g s5gVar2, List list) {
        this.a = j;
        this.b = s5gVar;
        this.c = s5gVar2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxe)) {
            return false;
        }
        mxe mxeVar = (mxe) obj;
        return this.a == mxeVar.a && fni.a(this.b, mxeVar.b) && fni.a(this.c, mxeVar.c) && fni.a(this.d, mxeVar.d);
    }

    public final int hashCode() {
        int iD = xc0.d(Long.hashCode(this.a) * 31, 31, this.b);
        s5g s5gVar = this.c;
        return this.d.hashCode() + ((iD + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(chatId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
