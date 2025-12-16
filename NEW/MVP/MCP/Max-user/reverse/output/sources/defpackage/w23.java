package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class w23 extends eve {
    public String w0 = "";

    @Override // defpackage.eve, defpackage.vhg
    public final void m(ViewGroup viewGroup, View view, View view2, shg shgVar, boolean z, i40 i40Var) throws Resources.NotFoundException {
        fbb searchView;
        fbb searchView2;
        String string = viewGroup.getResources().getString(k1b.q);
        this.w0 = string;
        if (view2 != null && !z) {
            View viewD = vfi.d(view2, string);
            yfb yfbVar = viewD instanceof yfb ? (yfb) viewD : null;
            if (yfbVar != null && (searchView2 = yfbVar.getSearchView()) != null) {
                searchView2.setExpandable(true);
            }
            if (yfbVar != null) {
                yfbVar.g();
            }
            if (yfbVar != null && (searchView = yfbVar.getSearchView()) != null) {
                int i = fbb.H0;
                searchView.c(true);
            }
        }
        super.m(viewGroup, view, view2, shgVar, z, i40Var);
    }

    @Override // defpackage.eve
    public final void o() {
        String str = this.w0;
        this.Y.put(str, str);
    }

    @Override // defpackage.eve
    public final big p(View view, boolean z) {
        big bigVar = new big();
        bigVar.Q(new v23(view, this, z));
        return bigVar;
    }
}
