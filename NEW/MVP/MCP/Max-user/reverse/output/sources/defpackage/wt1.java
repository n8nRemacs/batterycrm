package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class wt1 {
    public final int a;
    public final Object b;
    public final Object c;

    public wt1(int i, List list, List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt1)) {
            return false;
        }
        wt1 wt1Var = (wt1) obj;
        return this.a == wt1Var.a && this.b.equals(wt1Var.b) && this.c.equals(wt1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "HandUp(totalCount=" + this.a + ", addedParticipantIds=" + this.b + ", removedParticipantIds=" + this.c + ")";
    }
}
