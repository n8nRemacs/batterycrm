package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mx0 extends ijb implements Serializable {
    public final om6 a;
    public final ijb b;

    public mx0(om6 om6Var, ijb ijbVar) {
        this.a = om6Var;
        this.b = ijbVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        om6 om6Var = this.a;
        return this.b.compare(om6Var.apply(obj), om6Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mx0) {
            mx0 mx0Var = (mx0) obj;
            if (this.a.equals(mx0Var.a) && this.b.equals(mx0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
