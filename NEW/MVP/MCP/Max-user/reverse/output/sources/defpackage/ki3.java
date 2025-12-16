package defpackage;

/* loaded from: classes2.dex */
public final class ki3 {
    public final li3 a;

    public ki3(li3 li3Var) {
        this.a = li3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki3) && fni.a(this.a, ((ki3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CommonStatesIconColors(disabled=" + this.a + ")";
    }
}
