package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class yuf extends h54 {
    public final ar8 d;
    public final String o;

    public yuf() {
        this(0);
    }

    @Override // defpackage.h54
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.h54
    public final void f(h54 h54Var, c54 c54Var) {
        this.d.f(h54Var, c54Var);
    }

    @Override // defpackage.h54
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, f54 f54Var) {
        lg8 lg8Var = lg8.d;
        if (view == null && !z) {
            String str = this.o;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Already swiped controller manually, skip performChange", null);
            }
            f54Var.d();
            return;
        }
        if (view != null || !z) {
            this.d.g(viewGroup, view, view2, z, f54Var);
            return;
        }
        String str2 = this.o;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, str2, "Showing controller without animation", null);
        }
        new c2f(true).g(viewGroup, view, view2, z, f54Var);
    }

    @Override // defpackage.h54
    public final void h(Bundle bundle) {
        this.d.h(bundle);
    }

    @Override // defpackage.h54
    public final void i(Bundle bundle) {
        this.d.i(bundle);
    }

    public yuf(int i) {
        this.d = new ar8(0);
        this.o = yuf.class.getName();
    }
}
