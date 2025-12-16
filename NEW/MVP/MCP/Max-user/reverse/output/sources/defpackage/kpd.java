package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class kpd implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof ipd) {
            return ((ipd) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kpd) {
            return fni.a(this.a, ((kpd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof ipd) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
