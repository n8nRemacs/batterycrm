package defpackage;

/* loaded from: classes.dex */
public final class sm1 extends en1 {
    public final zi1 D;

    public sm1(zi1 zi1Var) {
        this.D = zi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm1) && fni.a(this.D, ((sm1) obj).D);
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return "OpenRemoveUserConfirmation(participantId=" + this.D + ")";
    }
}
