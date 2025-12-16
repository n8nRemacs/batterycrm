package defpackage;

/* loaded from: classes.dex */
public final class ka8 extends la8 {
    public final yd4 a;

    public ka8(yd4 yd4Var) {
        this.a = yd4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ka8.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ka8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (ka8.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
