package defpackage;

/* loaded from: classes.dex */
public final class ze1 implements bf1 {
    public final r5g a;

    public ze1(r5g r5gVar) {
        this.a = r5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze1) && this.a.equals(((ze1) obj).a);
    }

    @Override // defpackage.bf1
    public final s5g getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(text=" + this.a + ")";
    }
}
