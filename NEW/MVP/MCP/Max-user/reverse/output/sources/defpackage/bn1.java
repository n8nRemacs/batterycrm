package defpackage;

/* loaded from: classes.dex */
public final class bn1 extends en1 {
    public final k51 D;

    public bn1(k51 k51Var) {
        this.D = k51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bn1) && fni.a(this.D, ((bn1) obj).D);
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return "ShowOpponentInfo(contextInfo=" + this.D + ")";
    }
}
