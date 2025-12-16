package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class hl2 {
    public final long a;
    public final jve b = kve.b(0, 0, 7);
    public final ContextScope c;

    public hl2(long j, tw0 tw0Var, lzf lzfVar) {
        this.a = j;
        this.c = d7j.a(((q2b) lzfVar).a());
        tw0Var.d(this);
    }

    public final void a(fl2 fl2Var) {
        svi.e(this.c, null, null, new gl2(this, fl2Var, null), 3);
    }

    @vnf
    public final void onEvent(itg itgVar) {
        if (itgVar.b != this.a) {
            return;
        }
        a(new el2(itgVar.c));
    }

    @vnf
    public final void onEvent(gj7 gj7Var) {
        if (gj7Var.b != this.a || gj7Var.X) {
            return;
        }
        a(new al2(gj7Var.c));
    }

    @vnf
    public final void onEvent(xjb xjbVar) {
        if (xjbVar.b != this.a) {
            return;
        }
        a(new al2(xjbVar.d));
    }

    @vnf
    public final void onEvent(p05 p05Var) {
        a(new bl2(p05Var.o, p05Var.d));
    }

    @vnf
    public final void onEvent(r05 r05Var) {
        a(new cl2(r05Var.d));
    }

    @vnf
    public final void onEvent(q4a q4aVar) {
        if (q4aVar.b != this.a) {
            return;
        }
        a(new dl2(q4aVar.o));
    }
}
