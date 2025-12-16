package defpackage;

/* loaded from: classes2.dex */
public final class mi3 {
    public final ni3 a;

    public mi3(ni3 ni3Var) {
        this.a = ni3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mi3) && fni.a(this.a, ((mi3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CommonStatesTextColors(disabled=" + this.a + ")";
    }
}
