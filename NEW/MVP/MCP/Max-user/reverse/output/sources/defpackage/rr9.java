package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class rr9 implements yhd {
    public final RecyclerView a;
    public final yu9 b;

    public rr9(EndlessRecyclerView2 endlessRecyclerView2, yu9 yu9Var) {
        this.a = endlessRecyclerView2;
        this.b = yu9Var;
    }

    @Override // defpackage.yhd
    public final void b(View view) {
    }

    @Override // defpackage.yhd
    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View viewI = recyclerView.I(view);
        if ((viewI == null ? null : recyclerView.T(viewI)) instanceof en9) {
            mgb.a(view, new zn6(view, 16, this));
        }
    }
}
