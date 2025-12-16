package defpackage;

import java.util.Iterator;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class un3 extends h3 {
    public final sm6 a;
    public final /* synthetic */ vn3 b;

    public un3(vn3 vn3Var, sm6 sm6Var) {
        this.b = vn3Var;
        this.a = sm6Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Symbol symbol = wn3.a;
        throw new UnsupportedOperationException("not implemented");
    }

    @Override // defpackage.h3
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        sn3 sn3Var = (sn3) vn3.c.get(this.b);
        sn3Var.getClass();
        return new rn3(sn3Var, this.a);
    }
}
