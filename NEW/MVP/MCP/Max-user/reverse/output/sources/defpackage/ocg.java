package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public final class ocg extends ws7 {
    public static final void d(ocg ocgVar, RecyclerView recyclerView) {
        a layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            if (recyclerView.canScrollVertically(-1)) {
                return;
            }
        } else if (linearLayoutManager.X0() > 0) {
            return;
        }
        recyclerView.x0(0);
    }

    @Override // defpackage.ws7
    public final rhd c(RecyclerView recyclerView, phd phdVar) {
        return new kkf(this, 2, recyclerView);
    }
}
