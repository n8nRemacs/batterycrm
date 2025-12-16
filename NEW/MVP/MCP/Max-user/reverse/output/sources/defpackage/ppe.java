package defpackage;

/* loaded from: classes2.dex */
public final class ppe {
    public final n5g a;
    public final int b;

    public ppe(int i, n5g n5gVar) {
        this.a = n5gVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppe)) {
            return false;
        }
        ppe ppeVar = (ppe) obj;
        return this.a.equals(ppeVar.a) && this.b == ppeVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xrf.k(this.b, Integer.hashCode(this.a.c) * 31, 31);
    }

    public final String toString() {
        return "Button(title=" + this.a + ", id=" + this.b + ", isNegative=false)";
    }
}
