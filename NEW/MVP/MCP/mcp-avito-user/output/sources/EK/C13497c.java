package Ek;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.bundles.ui.recycler.item.bundle.h;
import com.avito.android.bundles.vas_union.item.lightning_block.f;
import com.avito.android.bundles.vas_union.item.performance.description.g;
import com.avito.android.bundles.vas_union.item.tabs.j;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: VasUnionPaddingDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEk/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ek.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13497c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f4213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4214c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4215d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4216e = y6.b(12);

    /* renamed from: f, reason: collision with root package name */
    public final int f4217f = y6.b(28);

    public C13497c(@k Resources resources, @k com.avito.konveyor.a aVar) {
        this.f4213b = resources;
        this.f4214c = aVar.Y(com.avito.android.bundles.vas_union.item.performance.description.a.class);
        this.f4215d = aVar.Y(com.avito.android.bundles.vas_union.item.item.vas_union_tab_description.a.class);
    }

    public final int c(View view, RecyclerView recyclerView) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if ((cW2 instanceof j) || (cW2 instanceof h)) {
            return 0;
        }
        boolean z12 = cW2 instanceof com.avito.android.bundles.vas_union.item.performance.tabs.h;
        Resources resources = this.f4213b;
        return z12 ? resources.getDimensionPixelSize(R.dimen.performance_tabs_horizontal_padding) : resources.getDimensionPixelSize(R.dimen.margin_large);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int dimensionPixelSize;
        int iU2;
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof com.avito.android.bundles.ui.recycler.item.skip_button.h;
        Resources resources = this.f4213b;
        rect.top = z12 ? resources.getDimensionPixelSize(R.dimen.vas_bundle_skip_button_item_top_margin) : cW2 instanceof f ? resources.getDimensionPixelOffset(R.dimen.vas_lightning_item_top_margin) : 0;
        rect.left = c(view, recyclerView);
        rect.right = c(view, recyclerView);
        RecyclerView.C cW3 = recyclerView.W(view);
        if (cW3 instanceof j) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemViewType = -1;
            if (adapter != null && (iU2 = RecyclerView.U(view)) != adapter.getItemCount() - 1) {
                itemViewType = adapter.getItemViewType(iU2 + 1);
            }
            dimensionPixelSize = itemViewType == this.f4214c ? resources.getDimensionPixelOffset(R.dimen.main_tabs_bottom_padding) : itemViewType == this.f4215d ? this.f4216e : resources.getDimensionPixelOffset(R.dimen.main_tabs_bottom_padding_without_desc);
        } else {
            dimensionPixelSize = cW3 instanceof h ? resources.getDimensionPixelSize(R.dimen.margin_huge) : cW3 instanceof com.avito.android.bundles.vas_union.item.header.c ? resources.getDimensionPixelOffset(R.dimen.paid_header_to_tabs_padding) : cW3 instanceof com.avito.android.bundles.ui.recycler.item.skip_button.h ? resources.getDimensionPixelSize(R.dimen.margin_large) : cW3 instanceof com.avito.android.bundles.vas_union.item.performance.tabs.h ? resources.getDimensionPixelSize(R.dimen.performance_tabs_bottom_padding) : cW3 instanceof g ? resources.getDimensionPixelSize(R.dimen.description_bottom_padding) : cW3 instanceof com.avito.android.bundles.vas_union.item.item.vas_union_tab_description.f ? this.f4217f : resources.getDimensionPixelOffset(R.dimen.margin_small);
        }
        rect.bottom = dimensionPixelSize;
    }
}
