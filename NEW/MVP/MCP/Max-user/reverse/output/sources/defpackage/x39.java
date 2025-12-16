package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class x39 {
    public final long a;
    public final LinkedHashSet b;
    public final String c;

    public x39(long j, LinkedHashSet linkedHashSet, String str) {
        this.a = j;
        this.b = linkedHashSet;
        this.c = str;
    }

    public static x39 a(x39 x39Var, long j, LinkedHashSet linkedHashSet, String str, int i) {
        if ((i & 1) != 0) {
            j = x39Var.a;
        }
        if ((i & 2) != 0) {
            linkedHashSet = x39Var.b;
        }
        if ((i & 4) != 0) {
            str = x39Var.c;
        }
        x39Var.getClass();
        return new x39(j, linkedHashSet, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x39)) {
            return false;
        }
        x39 x39Var = (x39) obj;
        return this.a == x39Var.a && fni.a(this.b, x39Var.b) && fni.a(this.c, x39Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistState(playingMsgId=");
        sb.append(this.a);
        sb.append(", order=");
        sb.append(this.b);
        return ctd.j(sb, ", attachId=", this.c, ")");
    }

    public /* synthetic */ x39(long j, LinkedHashSet linkedHashSet, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? new LinkedHashSet() : linkedHashSet, (String) null);
    }
}
