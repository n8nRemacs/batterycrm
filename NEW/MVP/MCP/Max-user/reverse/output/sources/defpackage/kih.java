package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kih implements n22 {
    public final n22 a;
    public final xod b;
    public final mih c;
    public final lih d;

    public kih(n22 n22Var, lih lihVar, u4e u4eVar) {
        this.a = n22Var;
        this.d = lihVar;
        this.b = new xod(n22Var.f(), u4eVar);
        this.c = new mih(n22Var.n());
    }

    @Override // defpackage.twg
    public final void b(uwg uwgVar) {
        jei.b();
        this.d.b(uwgVar);
    }

    @Override // defpackage.twg
    public final void d(uwg uwgVar) {
        jei.b();
        this.d.d(uwgVar);
    }

    @Override // defpackage.n22
    public final wqa e() {
        return this.a.e();
    }

    @Override // defpackage.n22
    public final s12 f() {
        return this.b;
    }

    @Override // defpackage.twg
    public final void h(uwg uwgVar) {
        jei.b();
        this.d.h(uwgVar);
    }

    @Override // defpackage.n22
    public final void j(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.n22
    public final void k(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.n22
    public final boolean l() {
        return false;
    }

    @Override // defpackage.n22
    public final l22 n() {
        return this.c;
    }

    @Override // defpackage.twg
    public final void o(uwg uwgVar) {
        jei.b();
        this.d.o(uwgVar);
    }
}
