package defpackage;

/* loaded from: classes2.dex */
public final class hn9 extends jn9 {
    public final wj9 a;

    public hn9(wj9 wj9Var) {
        this.a = wj9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hn9) && this.a == ((hn9) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewInputState(expandableState=" + this.a + ")";
    }
}
