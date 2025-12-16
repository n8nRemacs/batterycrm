package defpackage;

/* loaded from: classes.dex */
public final class sb0 {
    public final fsf a;

    public sb0(fsf fsfVar) {
        this.a = fsfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sb0)) {
            return false;
        }
        sb0 sb0Var = (sb0) obj;
        sb0Var.getClass();
        return this.a.equals(sb0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.a + "}";
    }
}
