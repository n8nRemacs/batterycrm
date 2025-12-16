package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ut1 {
    public final int a;
    public final Object b;
    public final Object c;

    public ut1(int i, List list, List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut1)) {
            return false;
        }
        ut1 ut1Var = (ut1) obj;
        return this.a == ut1Var.a && this.b.equals(ut1Var.b) && this.c.equals(ut1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Attendee(totalCount=" + this.a + ", addedParticipantIds=" + this.b + ", removedParticipantIds=" + this.c + ")";
    }
}
