package defpackage;

/* loaded from: classes.dex */
public final class r90 extends mb3 {
    public final c90 a;

    public r90(c90 c90Var) {
        this.a = c90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mb3)) {
            return false;
        }
        mb3 mb3Var = (mb3) obj;
        ((r90) mb3Var).getClass();
        Object obj2 = lb3.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((r90) mb3Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return ((lb3.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + lb3.a + ", androidClientInfo=" + this.a + "}";
    }
}
