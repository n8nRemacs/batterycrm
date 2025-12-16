package defpackage;

/* loaded from: classes2.dex */
public final class m04 extends ugc {
    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        kx3 kx3Var = (kx3) t98Var;
        v0b v0bVar = (v0b) this.a;
        kx3Var.getClass();
        if (kx3Var.Y == hec.c) {
            kti.d(64 * vw4.d().getDisplayMetrics().density);
            s0b cellHeight = v0bVar.getCellHeight();
            s0b s0bVar = s0b.c;
            if (cellHeight != s0bVar) {
                v0bVar.setCellHeight(s0bVar);
            }
            v0bVar.requestLayout();
        }
        v0bVar.g(kx3Var.a, kx3Var.X, kx3Var.d);
        v0bVar.setTitle(kx3Var.b);
        v0bVar.setSubtitle(kx3Var.c.b(v0bVar.getContext()));
    }
}
