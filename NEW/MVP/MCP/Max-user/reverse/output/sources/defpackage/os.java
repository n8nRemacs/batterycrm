package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class os extends se3 {
    public final ms b;

    public os(zy7 zy7Var) {
        super(zy7Var);
        this.b = new ms(zy7Var.d());
    }

    @Override // defpackage.zy7
    public final ree d() {
        return this.b;
    }

    @Override // defpackage.k0
    public final Object e() {
        return new ArrayList();
    }

    @Override // defpackage.k0
    public final int f(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // defpackage.k0
    public final Iterator g(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((Collection) obj).size();
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        return new ArrayList((Collection) null);
    }

    @Override // defpackage.k0
    public final Object l(Object obj) {
        return (ArrayList) obj;
    }

    @Override // defpackage.se3
    public final void m(Object obj, int i, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
