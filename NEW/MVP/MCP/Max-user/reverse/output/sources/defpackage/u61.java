package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class u61 {
    public final nt1 a;
    public final d3h b;

    public u61(nt1 nt1Var, d3h d3hVar) {
        this.a = nt1Var;
        this.b = d3hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u61.class == obj.getClass()) {
            u61 u61Var = (u61) obj;
            if (this.a.equals(u61Var.a) && this.b.equals(u61Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "DisplayLayoutItem{videoTrackParticipantKey=" + this.a + ", layout=" + this.b + '}';
    }
}
