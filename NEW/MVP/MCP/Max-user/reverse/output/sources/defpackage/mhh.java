package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class mhh implements View.OnAttachStateChangeListener {
    public x9f a;
    public final /* synthetic */ dtf b;
    public final /* synthetic */ View c;

    /* JADX WARN: Multi-variable type inference failed */
    public mhh(um6 um6Var, View view) {
        this.b = (dtf) um6Var;
        this.c = view;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dtf, um6] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        x9f x9fVar = this.a;
        if (x9fVar == null || !x9fVar.isActive()) {
            hbd hbdVar = (hbd) a93.s0.x(view.getContext()).Y;
            ?? r2 = this.b;
            View view2 = this.c;
            this.a = gw0.w(new g56(new m36(new khh(r2, view2, view, null), hbdVar), new lhh(r2, view2, null), 1), tfh.b(view));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        x9f x9fVar = this.a;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.a = null;
    }
}
