package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class k81 extends un4 {
    public final /* synthetic */ a3b t;

    public k81(a3b a3bVar) {
        this.t = a3bVar;
        this.d = 300L;
        this.c = 300L;
        this.f = 300L;
        this.e = 300L;
    }

    @Override // defpackage.un4
    public final void m() {
        RecyclerView recyclerView = (RecyclerView) this.t.b;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
        }
    }
}
