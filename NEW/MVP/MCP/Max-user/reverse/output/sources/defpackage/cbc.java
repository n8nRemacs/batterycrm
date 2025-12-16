package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class cbc {
    public final long a;
    public final List b;

    public cbc(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbc)) {
            return false;
        }
        cbc cbcVar = (cbc) obj;
        return this.a == cbcVar.a && fni.a(this.b, cbcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProfileAvatarModel(id=" + this.a + ", urls=" + this.b + ")";
    }
}
