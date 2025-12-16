package defpackage;

/* loaded from: classes2.dex */
public final class jxe extends vx3 {
    public final n5g a;
    public final em6 b;

    public jxe(n5g n5gVar, em6 em6Var) {
        this.a = n5gVar;
        this.b = em6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxe)) {
            return false;
        }
        jxe jxeVar = (jxe) obj;
        return this.a.equals(jxeVar.a) && this.b.equals(jxeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", dismissListener=" + this.b + ")";
    }
}
