package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class v23 implements rhg {
    public final /* synthetic */ View a;
    public final /* synthetic */ w23 b;
    public final /* synthetic */ boolean c;

    public v23(View view, w23 w23Var, boolean z) {
        this.a = view;
        this.b = w23Var;
        this.c = z;
    }

    @Override // defpackage.rhg
    public final void a(shg shgVar) {
        View view = this.a;
        if (view == null) {
            return;
        }
        yfb yfbVar = (yfb) vfi.d(view, this.b.w0);
        if (this.c) {
            fbb searchView = yfbVar.getSearchView();
            if (searchView != null) {
                searchView.d();
                return;
            }
            return;
        }
        fbb searchView2 = yfbVar.getSearchView();
        if (searchView2 != null) {
            searchView2.b();
        }
    }

    @Override // defpackage.rhg
    public final void b() {
    }

    @Override // defpackage.rhg
    public final void c(shg shgVar) {
    }

    @Override // defpackage.rhg
    public final void f() {
    }

    @Override // defpackage.rhg
    public final void h(shg shgVar) {
    }
}
