package MB;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.extended_profile_widgets.adapter.search.search_advert.list.g;
import com.avito.android.util.y6;
import com.avito.konveyor.exception.BlueprintNotSupportedException;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SearchDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMB/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f10443b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10444c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10445d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10446e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10447f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10448g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10449h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10450i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10451j;

    @Inject
    public a(@k com.avito.konveyor.a aVar, int i12, int i13, int i14) throws BlueprintNotSupportedException {
        this.f10443b = i12;
        this.f10444c = i13;
        this.f10445d = i14;
        this.f10446e = aVar.Y(com.avito.android.extended_profile_widgets.adapter.search.search_bar.a.class);
        this.f10447f = aVar.Y(com.avito.android.extended_profile_widgets.adapter.search.search_geo.a.class);
        this.f10448g = aVar.Y(com.avito.android.extended_profile_widgets.adapter.search.tabs.a.class);
        this.f10449h = aVar.Y(com.avito.android.extended_profile_widgets.adapter.search.search_advert.grid.a.class);
        aVar.Y(g.class);
        this.f10450i = aVar.Y(com.avito.android.extended_profile_widgets.adapter.search.inline_filters.a.class);
        this.f10451j = aVar.Y(com.avito.android.extended_profile_widgets.adapter.search.search_header.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int iU2 = RecyclerView.U(view);
        if (adapter.getItemViewType(iU2) == this.f10451j) {
            rect.top = (iU2 != 0 && adapter.getItemViewType(iU2 - 1) == this.f10450i) ? y6.b(0) : y6.b(12);
            return;
        }
        int itemViewType = adapter.getItemViewType(iU2);
        int i12 = this.f10449h;
        int i13 = this.f10446e;
        if (itemViewType == i13) {
            int iB2 = (iU2 != 0 && adapter.getItemViewType(iU2 + (-1)) == this.f10448g) ? y6.b(3) : y6.b(0);
            int iB3 = (adapter.getItemCount() >= iU2 + 2 && adapter.getItemViewType(iU2 + 1) == i12) ? y6.b(10) : y6.b(0);
            rect.top = iB2;
            rect.bottom = iB3;
            return;
        }
        if (adapter.getItemViewType(iU2) == this.f10447f) {
            int iB4 = (adapter.getItemCount() >= iU2 + 2 && adapter.getItemViewType(iU2 + 1) == i12) ? y6.b(24) : y6.b(0);
            rect.top = (adapter.getItemCount() >= iU2 + 1 && adapter.getItemViewType(iU2 - 1) == i13) ? y6.b(3) : y6.b(0);
            rect.bottom = iB4;
            int i14 = this.f10444c;
            rect.left = i14;
            rect.right = i14;
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
        if (bVar == null || bVar.f53670g != 1) {
            return;
        }
        int i15 = this.f10443b;
        int i16 = this.f10445d;
        if (i15 == 1) {
            rect.set(i16, 0, i16, 0);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        GridLayoutManager.b bVar2 = layoutParams2 instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams2 : null;
        int i17 = bVar2 != null ? bVar2.f53669f : -1;
        boolean z12 = i17 == 0;
        boolean z13 = i17 == i15 - 1;
        if (z12) {
            rect.set(i16, 0, 0, 0);
        } else if (z13) {
            rect.set(0, 0, i16, 0);
        }
    }
}
