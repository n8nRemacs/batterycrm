package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class lhe extends ghe {
    public final String t0;
    public final boolean u0;
    public final List v0;

    public lhe(jhe jheVar) {
        super(jheVar);
        this.t0 = jheVar.h;
        this.u0 = jheVar.i;
        this.v0 = (List) jheVar.j;
    }

    @Override // defpackage.ghe
    public final ri9 v() {
        ri9 ri9Var = new ri9();
        ri9Var.g = this.t0;
        ri9Var.u = this.u0;
        ri9Var.D = Collections.unmodifiableList(this.v0);
        return ri9Var;
    }
}
