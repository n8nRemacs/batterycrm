package defpackage;

/* loaded from: classes2.dex */
public final class whc extends xhc {
    public final n5g a;
    public final int b;

    public whc(int i, n5g n5gVar) {
        this.a = n5gVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whc)) {
            return false;
        }
        whc whcVar = (whc) obj;
        return this.a.equals(whcVar.a) && this.b == whcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(title=" + this.a + ", icon=" + this.b + ")";
    }
}
