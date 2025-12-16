package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class kmb {
    public final Object a;
    public final Object b;

    public kmb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kmb)) {
            return false;
        }
        kmb kmbVar = (kmb) obj;
        return Objects.equals(kmbVar.a, this.a) && Objects.equals(kmbVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
