package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class tt1 {
    public final long a;
    public final ti1 b;

    public tt1(ti1 ti1Var, long j) {
        this.a = j;
        this.b = ti1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tt1.class == obj.getClass()) {
            tt1 tt1Var = (tt1) obj;
            if (this.a == tt1Var.a && Objects.equals(this.b, tt1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "WaitingParticipantId{addedTs=" + this.a + ", participantId=" + this.b + '}';
    }
}
