package defpackage;

/* loaded from: classes2.dex */
public final class cdc extends ddc {
    public final s5g b;
    public final s5g c;
    public final boolean d;
    public final Integer e;

    public /* synthetic */ cdc(s5g s5gVar, Integer num, int i) {
        this(s5gVar, null, false, (i & 8) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdc)) {
            return false;
        }
        cdc cdcVar = (cdc) obj;
        return fni.a(this.b, cdcVar.b) && fni.a(this.c, cdcVar.c) && this.d == cdcVar.d && fni.a(this.e, cdcVar.e);
    }

    public final int hashCode() {
        s5g s5gVar = this.b;
        int iHashCode = (s5gVar == null ? 0 : s5gVar.hashCode()) * 31;
        s5g s5gVar2 = this.c;
        int iB = a9h.b((iHashCode + (s5gVar2 == null ? 0 : s5gVar2.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        return iB + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", description=" + this.c + ", showOnTop=" + this.d + ", icon=" + this.e + ")";
    }

    public cdc(s5g s5gVar, n5g n5gVar, boolean z, Integer num) {
        this.b = s5gVar;
        this.c = n5gVar;
        this.d = z;
        this.e = num;
    }
}
