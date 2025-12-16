package defpackage;

/* loaded from: classes.dex */
public final class tm1 extends en1 {
    public final zi1 D;

    public tm1(zi1 zi1Var) {
        this.D = zi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tm1) && fni.a(this.D, ((tm1) obj).D);
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return "RaiseHandDialog(participantId=" + this.D + ")";
    }
}
