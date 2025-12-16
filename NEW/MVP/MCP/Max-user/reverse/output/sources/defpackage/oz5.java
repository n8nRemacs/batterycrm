package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class oz5 implements zde {
    public final zde a;
    public final boolean b;
    public final em6 c;

    public oz5(zde zdeVar, boolean z, em6 em6Var) {
        this.a = zdeVar;
        this.b = z;
        this.c = em6Var;
    }

    @Override // defpackage.zde
    public final Iterator iterator() {
        return new nz5(this);
    }
}
