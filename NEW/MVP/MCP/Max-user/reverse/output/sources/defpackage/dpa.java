package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class dpa {
    public static final dpa c;
    public final List a;
    public final List b;

    static {
        hd5 hd5Var = hd5.a;
        c = new dpa(hd5Var, hd5Var);
    }

    public dpa(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpa)) {
            return false;
        }
        dpa dpaVar = (dpa) obj;
        return fni.a(this.a, dpaVar.a) && fni.a(this.b, dpaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingNotifications(insert=" + this.a + ", delete=" + this.b + ")";
    }
}
