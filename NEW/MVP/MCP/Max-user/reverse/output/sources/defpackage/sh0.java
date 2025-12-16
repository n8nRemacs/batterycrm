package defpackage;

import android.app.Application;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class sh0 {
    public final Application a;
    public final ContextScope c;
    public final jve b = kve.b(0, 0, 7);
    public final psb d = new psb(qsb.f);
    public final psb e = new psb(qsb.l);
    public final jh0 f = new jh0(0, this);

    public sh0(Application application, tw0 tw0Var, lzf lzfVar) {
        this.a = application;
        this.c = d7j.a(((q2b) lzfVar).c().getImmediate());
        tw0Var.d(this);
    }

    @vnf
    public final void onEvent(ph8 ph8Var) {
        svi.e(this.c, null, null, new kh0(this, null), 3);
    }

    @vnf
    public final void onEvent(tub tubVar) {
        svi.e(this.c, null, null, new lh0(this, null), 3);
    }

    @vnf
    public final void onEvent(t24 t24Var) {
        svi.e(this.c, null, null, new mh0(this, null), 3);
    }

    @vnf
    public final void onEvent(xsg xsgVar) {
        svi.e(this.c, null, null, new nh0(this, null), 3);
    }
}
