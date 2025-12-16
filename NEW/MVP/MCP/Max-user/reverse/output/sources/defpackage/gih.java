package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class gih extends a54 {
    public final /* synthetic */ dy a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ hih c;
    public final /* synthetic */ View d;

    public gih(dy dyVar, ViewTreeObserver viewTreeObserver, hih hihVar, View view) {
        this.a = dyVar;
        this.b = viewTreeObserver;
        this.c = hihVar;
        this.d = view;
    }

    @Override // defpackage.a54
    public final void s(c54 c54Var, View view) {
        Iterator it = ((ArrayList) this.a.X).iterator();
        while (it.hasNext()) {
            ((eih) it.next()).b();
        }
        c54Var.removeLifecycleListener(this);
        dy.c(this.c, this.d, this.b);
    }
}
