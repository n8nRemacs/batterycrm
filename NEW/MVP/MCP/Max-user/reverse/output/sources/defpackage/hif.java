package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hif {
    public final List a;
    public final boolean b;

    public hif(int i, List list) {
        list = (i & 1) != 0 ? null : list;
        boolean z = (i & 2) == 0;
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hif)) {
            return false;
        }
        hif hifVar = (hif) obj;
        return fni.a(this.a, hifVar.a) && this.b == hifVar.b;
    }

    public final int hashCode() {
        List list = this.a;
        return Boolean.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "SearchState(sets=" + this.a + ", loading=" + this.b + ")";
    }
}
