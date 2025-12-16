package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class tb0 {
    public final dsf a;
    public final List b;

    public tb0(dsf dsfVar, List list) {
        if (dsfVar == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.a = dsfVar;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tb0) {
            tb0 tb0Var = (tb0) obj;
            if (this.a.equals(tb0Var.a) && this.b.equals(tb0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{surfaceEdge=");
        sb.append(this.a);
        sb.append(", outConfigs=");
        return az1.j(sb, this.b, "}");
    }
}
