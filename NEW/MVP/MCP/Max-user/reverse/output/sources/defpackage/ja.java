package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ja extends d2f {
    public final rjh E0;

    public ja(Context context, rjh rjhVar) {
        super(new v0b(context, false));
        this.E0 = rjhVar;
    }

    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(ixg ixgVar) {
        v0b v0bVar = (v0b) this.a;
        v0bVar.setCustomTheme(a93.s0.B(v0bVar).c);
        v0bVar.setCallButtonMode(r0b.b);
        v0bVar.setTitle(ixgVar.a.b(v0bVar.getContext()));
        v0bVar.setSubtitle(null);
        mc0 mc0Var = ixgVar.b;
        v0bVar.g(mc0Var.a, mc0Var.b, ixgVar.c);
    }
}
