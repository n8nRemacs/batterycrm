package defpackage;

/* loaded from: classes2.dex */
public final class t58 extends y58 {
    public final w68 a;

    public t58(w68 w68Var) {
        this.a = w68Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t58) && fni.a(this.a, ((t58) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotProcessedResult(result=" + this.a + ")";
    }
}
