package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class eve extends vhg {
    public final us Y = new us(0);
    public final ArrayList Z = new ArrayList();
    public final ArrayList s0 = new ArrayList();
    public shg t0;
    public shg u0;
    public shg v0;

    public static void n(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (nfh.b(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                n(arrayList, viewGroup.getChildAt(i));
            }
        }
    }

    @Override // defpackage.vhg, defpackage.h54
    public final void f(h54 h54Var, c54 c54Var) {
        this.d = true;
        this.s0.clear();
    }

    @Override // defpackage.vhg
    public final void k(ViewGroup viewGroup, View view, View view2, shg shgVar, boolean z) {
        if (view2 != null) {
            ArrayList arrayList = this.s0;
            if (arrayList.size() > 0) {
                view2.setVisibility(0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dve dveVar = (dve) it.next();
                    dveVar.b.addView(dveVar.a);
                }
                arrayList.clear();
            }
        }
        super.k(viewGroup, view, view2, shgVar, z);
    }

    @Override // defpackage.vhg
    public final big l(ViewGroup viewGroup, View view, View view2, boolean z) {
        shg shgVar;
        this.t0 = null;
        this.u0 = null;
        big bigVarP = p(view2, z);
        this.v0 = bigVarP;
        shg shgVar2 = this.u0;
        return (shgVar2 == null || (shgVar = this.t0) == null || !(this instanceof w23)) ? vfi.f(0, this.t0, shgVar2, bigVarP) : vfi.f(0, vfi.f(1, shgVar, shgVar2), this.v0);
    }

    @Override // defpackage.vhg
    public void m(ViewGroup viewGroup, View view, View view2, shg shgVar, boolean z, i40 i40Var) {
        i40 i40Var2 = new i40(this, viewGroup, view, view2, shgVar, z, i40Var, 5);
        o();
        if (view2 == null || view2.getParent() != null || this.Z.size() <= 0) {
            i40Var2.e();
            return;
        }
        view2.getViewTreeObserver().addOnPreDrawListener(new yue(this, view2, i40Var2));
        viewGroup.addView(view2);
    }

    public abstract void o();

    public abstract big p(View view, boolean z);
}
