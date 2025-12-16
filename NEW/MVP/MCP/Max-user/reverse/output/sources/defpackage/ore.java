package defpackage;

/* loaded from: classes2.dex */
public final class ore extends id0 {
    public final n5g b;
    public final int c;

    public ore(int i, n5g n5gVar) {
        super(20);
        this.b = n5gVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ore)) {
            return false;
        }
        ore oreVar = (ore) obj;
        return this.b.equals(oreVar.b) && this.c == oreVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b.c) * 31);
    }

    public final String toString() {
        return "ShowSnackbar(message=" + this.b + ", icon=" + this.c + ")";
    }
}
