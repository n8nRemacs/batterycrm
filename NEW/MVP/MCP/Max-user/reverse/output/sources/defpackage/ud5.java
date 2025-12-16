package defpackage;

/* loaded from: classes2.dex */
public final class ud5 implements vd5 {
    public final String a;
    public final n5g b;
    public final n5g c;

    public ud5(String str, n5g n5gVar, n5g n5gVar2) {
        this.a = str;
        this.b = n5gVar;
        this.c = n5gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud5)) {
            return false;
        }
        ud5 ud5Var = (ud5) obj;
        return fni.a(this.a, ud5Var.a) && this.b.equals(ud5Var.b) && this.c.equals(ud5Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.c.c) + xrf.k(this.b.c, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "SavedMessages(avatar=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ")";
    }
}
