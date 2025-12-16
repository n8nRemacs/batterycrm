package defpackage;

/* loaded from: classes.dex */
public final class ye1 implements bf1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye1)) {
            return false;
        }
        ((ye1) obj).getClass();
        r5g r5gVar = s5g.b;
        return r5gVar.equals(r5gVar);
    }

    @Override // defpackage.bf1
    public final s5g getText() {
        return s5g.b;
    }

    public final int hashCode() {
        return s5g.b.hashCode();
    }

    public final String toString() {
        return "Error(text=" + s5g.b + ")";
    }
}
