package defpackage;

/* loaded from: classes.dex */
public final class ia8 extends la8 {
    public final yd4 a;

    public ia8(yd4 yd4Var) {
        this.a = yd4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ia8.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ia8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (ia8.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
