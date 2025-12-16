package QL0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import com.avito.android.vas_performance.screens.visual.item.header.g;
import com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.h;
import kotlin.Metadata;

/* compiled from: VisualVasPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQL0/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f13685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13686c = y6.b(12);

    /* renamed from: d, reason: collision with root package name */
    public final int f13687d = y6.b(16);

    /* renamed from: e, reason: collision with root package name */
    public final int f13688e = y6.b(24);

    /* renamed from: f, reason: collision with root package name */
    public final int f13689f = y6.b(10);

    /* renamed from: g, reason: collision with root package name */
    public final int f13690g = y6.b(12);

    public b(int i12) {
        this.f13685b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof g) {
            i12 = this.f13687d;
        } else {
            i12 = cW2 instanceof h ? true : cW2 instanceof com.avito.android.vas_performance.screens.visual.item.item.h ? this.f13689f : 0;
        }
        rect.top = recyclerView.W(view) instanceof g ? this.f13686c : 0;
        rect.left = i12;
        rect.right = i12;
        RecyclerView.C cW3 = recyclerView.W(view);
        if (cW3 instanceof g) {
            i = this.f13688e;
        } else {
            if (cW3 instanceof h ? true : cW3 instanceof com.avito.android.vas_performance.screens.visual.item.item.h) {
                int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                i = bindingAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) - 1 ? this.f13685b : this.f13690g;
            }
        }
        rect.bottom = i;
    }
}
