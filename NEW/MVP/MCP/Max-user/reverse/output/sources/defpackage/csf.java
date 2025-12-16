package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class csf extends zr4 {
    public final wu1 o;
    public tu1 p;
    public zr4 q;
    public fsf r;

    public csf(Size size, int i) {
        super(size, i);
        this.o = ixi.a(new u4e(22, this));
    }

    @Override // defpackage.zr4
    public final void a() {
        super.a();
        jei.d(new zrf(this, 2));
    }

    @Override // defpackage.zr4
    public final ha8 f() {
        return this.o;
    }

    public final boolean g(zr4 zr4Var, Runnable runnable) {
        boolean z;
        Size size = this.h;
        jei.b();
        zr4Var.getClass();
        int i = zr4Var.i;
        Size size2 = zr4Var.h;
        zr4 zr4Var2 = this.q;
        if (zr4Var2 == zr4Var) {
            return false;
        }
        z5j.f("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", zr4Var2 == null);
        z5j.a("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i2 = this.i;
        z5j.a(wy1.g("The provider's format(", i2, ") must match the parent(", i, ")"), i2 == i);
        synchronized (this.a) {
            z = this.c;
        }
        z5j.f("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.q = zr4Var;
        wsf.h(zr4Var.c(), this.p);
        zr4Var.d();
        wsf.g(this.e).d(new asf(zr4Var, 1), ayi.a());
        wsf.g(zr4Var.g).d(runnable, ayi.d());
        return true;
    }
}
