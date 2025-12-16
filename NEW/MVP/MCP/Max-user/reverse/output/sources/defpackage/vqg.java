package defpackage;

/* loaded from: classes.dex */
public final class vqg {
    public final int a;
    public final s5g b;

    public vqg(int i, s5g s5gVar) {
        this.a = i;
        this.b = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqg)) {
            return false;
        }
        vqg vqgVar = (vqg) obj;
        return this.a == vqgVar.a && fni.a(this.b, vqgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ButtonData(buttonId=" + this.a + ", title=" + this.b + ")";
    }
}
