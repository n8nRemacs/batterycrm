package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class pa {
    public static final pa c = new pa(s5g.b, hd5.a);
    public final s5g a;
    public final List b;

    public pa(s5g s5gVar, List list) {
        this.a = s5gVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa)) {
            return false;
        }
        pa paVar = (pa) obj;
        return fni.a(this.a, paVar.a) && fni.a(this.b, paVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdminWaitingRoomState(subtitle=" + this.a + ", list=" + this.b + ")";
    }
}
