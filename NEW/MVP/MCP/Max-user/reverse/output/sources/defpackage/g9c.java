package defpackage;

import java.util.Iterator;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public abstract class g9c extends se3 {
    public final f9c b;

    public g9c(zy7 zy7Var) {
        super(zy7Var);
        this.b = new f9c(zy7Var.d());
    }

    @Override // defpackage.se3, defpackage.zy7
    public final void a(b bVar, Object obj) {
        int iH = h(obj);
        b bVarA = bVar.a(this.b);
        o(bVarA, obj, iH);
        bVarA.t();
    }

    @Override // defpackage.k0, defpackage.zy7
    public final Object b(lh4 lh4Var) {
        return i(lh4Var);
    }

    @Override // defpackage.zy7
    public final ree d() {
        return this.b;
    }

    @Override // defpackage.k0
    public final Object e() {
        return (e9c) k(n());
    }

    @Override // defpackage.k0
    public final int f(Object obj) {
        return ((e9c) obj).d();
    }

    @Override // defpackage.k0
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.k0
    public final Object l(Object obj) {
        return ((e9c) obj).a();
    }

    @Override // defpackage.se3
    public final void m(Object obj, int i, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(b bVar, Object obj, int i);
}
