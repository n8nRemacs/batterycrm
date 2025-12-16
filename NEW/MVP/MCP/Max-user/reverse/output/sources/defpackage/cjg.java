package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class cjg implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public cjg(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjg)) {
            return false;
        }
        cjg cjgVar = (cjg) obj;
        return fni.a(this.a, cjgVar.a) && fni.a(this.b, cjgVar.b) && fni.a(this.c, cjgVar.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}
