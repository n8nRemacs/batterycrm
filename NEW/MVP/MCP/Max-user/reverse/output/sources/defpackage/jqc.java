package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class jqc implements Serializable {
    public final qb2 a;
    public final List b;
    public final r04 c;

    public jqc(qb2 qb2Var, sz szVar, r04 r04Var) {
        this.a = qb2Var;
        this.b = szVar;
        this.c = r04Var;
    }

    public final String toString() {
        return "{chat=" + this.a + ", highlights=" + zdi.a(this.b) + ", contactSearchResult=" + this.c + "}";
    }
}
