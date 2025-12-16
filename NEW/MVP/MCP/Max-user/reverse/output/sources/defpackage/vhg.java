package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class vhg extends h54 {
    public f54 X;
    public boolean d;
    public boolean o;

    @Override // defpackage.h54
    public final void a() {
        this.o = true;
    }

    @Override // defpackage.h54
    public final boolean d() {
        return true;
    }

    @Override // defpackage.h54
    public void f(h54 h54Var, c54 c54Var) {
        this.d = true;
    }

    @Override // defpackage.h54
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, f54 f54Var) {
        this.X = f54Var;
        if (this.d) {
            f54Var.d();
            return;
        }
        if (this.o) {
            k(viewGroup, view, view2, null, z);
            f54Var.d();
        } else {
            thg thgVar = new thg(0, f54Var);
            big bigVarL = l(viewGroup, view, view2, z);
            bigVarL.a(new uhg(this, viewGroup, thgVar));
            m(viewGroup, view, view2, bigVarL, z, new i40(this, viewGroup, bigVarL, view, view2, z, thgVar, 6));
        }
    }

    public void k(ViewGroup viewGroup, View view, View view2, shg shgVar, boolean z) {
        if (view != null && view.getParent() == viewGroup) {
            viewGroup.removeView(view);
        }
        if (view2 == null || view2.getParent() != null) {
            return;
        }
        viewGroup.addView(view2);
    }

    public abstract big l(ViewGroup viewGroup, View view, View view2, boolean z);

    public void m(ViewGroup viewGroup, View view, View view2, shg shgVar, boolean z, i40 i40Var) {
        i40Var.e();
    }
}
