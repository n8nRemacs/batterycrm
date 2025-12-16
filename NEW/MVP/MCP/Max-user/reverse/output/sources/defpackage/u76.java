package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class u76 extends v76 {
    public final /* synthetic */ Iterable[] a;

    public u76(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        t76 t76Var = new t76(this, this.a.length);
        gt7 gt7Var = new gt7();
        gt7Var.b = ft7.o;
        gt7Var.c = t76Var;
        return gt7Var;
    }
}
