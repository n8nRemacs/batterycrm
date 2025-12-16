package defpackage;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class ba8 implements AbsListView.OnScrollListener {
    public final /* synthetic */ ca8 a;

    public ba8(ca8 ca8Var) {
        this.a = ca8Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        ca8 ca8Var = this.a;
        aa8 aa8Var = ca8Var.B0;
        if (i != 1 || ca8Var.J0.getInputMethodMode() == 2 || ca8Var.J0.getContentView() == null) {
            return;
        }
        ca8Var.F0.removeCallbacks(aa8Var);
        aa8Var.run();
    }
}
