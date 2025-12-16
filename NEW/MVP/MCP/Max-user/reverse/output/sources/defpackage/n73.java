package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class n73 extends sj0 {
    public final rj0 X;
    public final boolean Y;
    public final Set Z;
    public final Collection b;
    public final boolean c;
    public final boolean d;
    public final rs4 o;

    public n73(List list, boolean z) {
        this(list, z, false, null, null, 124);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n73)) {
            return false;
        }
        n73 n73Var = (n73) obj;
        return fni.a(this.b, n73Var.b) && this.c == n73Var.c && this.d == n73Var.d && this.o == n73Var.o && fni.a(this.X, n73Var.X) && this.Y == n73Var.Y && fni.a(this.Z, n73Var.Z);
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + a9h.b(a9h.b(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31;
        rj0 rj0Var = this.X;
        return this.Z.hashCode() + a9h.b((iHashCode + (rj0Var == null ? 0 : rj0Var.hashCode())) * 31, 31, this.Y);
    }

    @Override // defpackage.sj0
    public final String toString() {
        return "ChatsUpdateEvent(chatIds=" + this.b + ", orderChange=" + this.c + ", initialDataLoaded=" + this.d + ", itemType=" + this.o + ", error=" + this.X + ", replaceDuplicate=" + this.Y + ", chatServerIds=" + this.Z + ")";
    }

    public /* synthetic */ n73(Collection collection, boolean z, boolean z2, rs4 rs4Var, s9c s9cVar, int i) {
        this(collection, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? rs4.REGULAR : rs4Var, (i & 16) != 0 ? null : s9cVar, false, rd5.a);
    }

    public n73(Collection collection, boolean z, boolean z2, rs4 rs4Var, rj0 rj0Var, boolean z3, Set set) {
        this.b = collection;
        this.c = z;
        this.d = z2;
        this.o = rs4Var;
        this.X = rj0Var;
        this.Y = z3;
        this.Z = set;
    }

    public n73(n8a n8aVar) {
        this(Collections.unmodifiableList(dsi.h(n8aVar)), true, false, null, null, 124);
    }
}
