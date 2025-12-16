package defpackage;

/* loaded from: classes2.dex */
public final class bw7 {
    public final String a;
    public final int b;

    public bw7(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw7)) {
            return false;
        }
        bw7 bw7Var = (bw7) obj;
        return fni.a(this.a, bw7Var.a) && this.b == bw7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JsBridgeMethodErrorReason(title=" + this.a + ", code=" + this.b + ")";
    }
}
