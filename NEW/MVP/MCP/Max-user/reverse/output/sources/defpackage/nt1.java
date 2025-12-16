package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class nt1 {
    public final cdh a;
    public final ti1 b;
    public final y2a c;

    public nt1(hc8 hc8Var) {
        this.a = (cdh) hc8Var.c;
        this.b = (ti1) hc8Var.b;
        this.c = (y2a) hc8Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nt1.class == obj.getClass()) {
            nt1 nt1Var = (nt1) obj;
            if (this.a == nt1Var.a && this.b.equals(nt1Var.b) && Objects.equals(this.c, nt1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        return "CallVideoTrackParticipantKey{" + this.b + ", type=" + this.a + ", mid=" + this.c + "}";
    }
}
