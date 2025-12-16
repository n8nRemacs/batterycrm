package defpackage;

/* loaded from: classes2.dex */
public final class iwh {
    public final String a;
    public final go0 b;

    public iwh(String str, go0 go0Var) {
        this.a = str;
        this.b = go0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwh)) {
            return false;
        }
        iwh iwhVar = (iwh) obj;
        return fni.a(this.a, iwhVar.a) && fni.a(this.b, iwhVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        go0 go0Var = this.b;
        return iHashCode + (go0Var == null ? 0 : go0Var.hashCode());
    }

    public final String toString() {
        return "AuthBiometry(title=" + this.a + ", cryptoObject=" + this.b + ")";
    }
}
