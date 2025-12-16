package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class vi2 extends sj0 {
    public final long b;

    public vi2(long j, long j2) {
        super(j);
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vi2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vi2 vi2Var = (vi2) obj;
        return this.b == vi2Var.b && this.a == vi2Var.a;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.b), Long.valueOf(this.a));
    }

    @Override // defpackage.sj0
    public final String toString() {
        return ho7.k(az1.l(this.a, "ChatLeaveEvent(requestId=", ", chatId="), this.b, ")");
    }
}
