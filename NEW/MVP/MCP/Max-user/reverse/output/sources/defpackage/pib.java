package defpackage;

/* loaded from: classes2.dex */
public final class pib extends id0 {
    public final n5g b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pib(n5g n5gVar) {
        super(13);
        int i = yud.b1;
        this.b = n5gVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pib)) {
            return false;
        }
        pib pibVar = (pib) obj;
        return fni.a(this.b, pibVar.b) && this.c == pibVar.c;
    }

    public final int hashCode() {
        return xrf.k(this.c, Integer.hashCode(this.b.c) * 31, 31);
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.b + ", icon=" + this.c + ", description=null)";
    }
}
