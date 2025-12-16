package defpackage;

/* loaded from: classes.dex */
public final class ga1 extends d2f {
    public final usd E0;
    public final Object F0;

    public ga1(vu3 vu3Var, usd usdVar) {
        super(vu3Var);
        this.E0 = usdVar;
        this.F0 = ipi.b(3, new i6(23, this));
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, k18] */
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(w37 w37Var) {
        int i = w37Var.t0;
        long j = w37Var.b;
        vu3 vu3Var = (vu3) this.a;
        vu3Var.setId(Long.hashCode(w37Var.v0));
        vu3Var.setTitle(w37Var.X);
        if (w37Var.u0 instanceof l37) {
            vu3Var.C(j, null, null);
            vu3Var.setAvatarOverlay((yd0) this.F0.getValue());
        } else {
            vu3Var.setAvatarOverlay(null);
            CharSequence charSequence = w37Var.c;
            String str = w37Var.d;
            if (str == null) {
                str = "";
            }
            vu3Var.C(j, charSequence, str);
        }
        vu3Var.setDescription(w37Var.s0);
        vu3Var.setTime(w37Var.Y);
        vu3Var.B(w37Var.Z);
        vu3Var.z(i == 1);
        vu3Var.A(i == 2);
        vu3Var.Q0 = w37Var.a;
        vu3Var.O0 = this.E0;
    }
}
