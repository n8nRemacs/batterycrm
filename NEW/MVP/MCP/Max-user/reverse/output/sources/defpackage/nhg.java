package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class nhg implements zde {
    public final zde a;
    public final em6 b;

    public nhg(zde zdeVar, em6 em6Var) {
        this.a = zdeVar;
        this.b = em6Var;
    }

    @Override // defpackage.zde
    public final Iterator iterator() {
        return new mhg(this);
    }
}
