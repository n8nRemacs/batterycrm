package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class imb implements Serializable {
    public final Object a;
    public final Object b;

    public imb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imb)) {
            return false;
        }
        imb imbVar = (imb) obj;
        return fni.a(this.a, imbVar.a) && fni.a(this.b, imbVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
