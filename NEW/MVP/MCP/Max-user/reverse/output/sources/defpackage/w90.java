package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w90 {
    public final dsf a;
    public final dsf b;
    public final ArrayList c;

    public w90(dsf dsfVar, dsf dsfVar2, ArrayList arrayList) {
        if (dsfVar == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.a = dsfVar;
        if (dsfVar2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.b = dsfVar2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w90)) {
            return false;
        }
        w90 w90Var = (w90) obj;
        return this.a.equals(w90Var.a) && this.b.equals(w90Var.b) && this.c.equals(w90Var.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.a + ", secondarySurfaceEdge=" + this.b + ", outConfigs=" + this.c + "}";
    }
}
