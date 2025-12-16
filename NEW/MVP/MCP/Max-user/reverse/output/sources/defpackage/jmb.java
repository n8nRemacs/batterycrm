package defpackage;

/* loaded from: classes2.dex */
public final class jmb {
    public final Object a;
    public final Object b;

    public jmb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jmb.class == obj.getClass()) {
            jmb jmbVar = (jmb) obj;
            Object obj2 = jmbVar.b;
            Object obj3 = jmbVar.a;
            Object obj4 = this.a;
            if (obj4 == null ? obj3 != null : !obj4.equals(obj3)) {
                return false;
            }
            Object obj5 = this.b;
            if (obj5 != null) {
                return obj5.equals(obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{first=" + this.a + ", second=" + this.b + '}';
    }
}
