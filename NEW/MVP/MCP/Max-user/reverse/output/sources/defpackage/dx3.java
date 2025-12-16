package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class dx3 {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public dx3(tw0 tw0Var, lzf lzfVar) {
        this.b = d7j.a(((q2b) lzfVar).a());
        tw0Var.d(this);
    }

    public final x26 a() {
        return new gbd(this.a);
    }

    @vnf
    public final void onEvent(ph8 ph8Var) {
        svi.e(this.b, null, null, new zw3(this, null), 3);
    }

    @vnf
    public final void onEvent(tub tubVar) {
        svi.e(this.b, null, null, new ax3(this, null), 3);
    }

    @vnf
    public final void onEvent(t24 t24Var) {
        svi.e(this.b, null, null, new bx3(this, t24Var, null), 3);
    }

    @vnf
    public final void onEvent(xsg xsgVar) {
        svi.e(this.b, null, null, new cx3(this, null), 3);
    }
}
