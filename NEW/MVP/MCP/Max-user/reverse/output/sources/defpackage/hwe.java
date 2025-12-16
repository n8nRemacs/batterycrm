package defpackage;

/* loaded from: classes2.dex */
public final class hwe extends d2f {
    @Override // defpackage.d2f
    public final void D() {
        fwe fweVar = ((dwe) this.a).d;
        fweVar.b.d();
        fweVar.c = false;
        fweVar.invalidate();
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        fwe fweVar = ((dwe) this.a).d;
        fweVar.c = true;
        fweVar.b.c();
    }
}
