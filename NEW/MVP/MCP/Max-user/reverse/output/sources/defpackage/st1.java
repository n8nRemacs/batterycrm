package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class st1 {
    public final tt1 a;
    public final o81 b;

    public st1(tt1 tt1Var, o81 o81Var) {
        this.a = tt1Var;
        this.b = o81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && st1.class == obj.getClass()) {
            st1 st1Var = (st1) obj;
            if (this.a.equals(st1Var.a) && Objects.equals(this.b, st1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "WaitingParticipant{waitingParticipantId=" + this.a + ", externalId=" + this.b + '}';
    }
}
