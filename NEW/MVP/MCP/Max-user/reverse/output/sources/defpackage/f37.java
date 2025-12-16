package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class f37 implements g37 {
    public final long b;
    public final long c;
    public final List d;
    public final boolean e;

    public f37(g37 g37Var) {
        this.b = g37Var.g();
        this.c = g37Var.h();
        this.d = ue3.d0(g37Var.j());
        g37Var.b();
        this.e = g37Var.a();
    }

    @Override // defpackage.g37
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.g37
    public final void b() {
    }

    @Override // defpackage.g37
    public final long g() {
        return this.b;
    }

    @Override // defpackage.g37
    public final long h() {
        return this.c;
    }

    @Override // defpackage.g37
    public final List j() {
        return this.d;
    }
}
